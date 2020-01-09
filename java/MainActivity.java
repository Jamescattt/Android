package cn.mmvtc.shop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView mLisView;

    private String[] titles = {  "Air Jordan x Travis Scott", "AIR JORDAN 11 Low", "AIR JORDAN 5", "kobe 11","kobe 4","kd 8","Air Force One","pg 3","pg 1"};

    private String[] prices = {  "$1000", "$1200", "$980", "$700", "$900","$500","$850","$600","$400"};

    private  int[] icons = { R.drawable.air,R.drawable.jd,R.drawable.jordan,
            R.drawable.kb,R.drawable.kbfore,R.drawable.kd,R.drawable.kongjun,R.drawable.pg,R.drawable.pgone};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLisView = (ListView) findViewById(R.id.lv);
        MyBaseAdapter mAdapter = new  MyBaseAdapter();
        mLisView.setAdapter (mAdapter);
    }
    class  MyBaseAdapter extends BaseAdapter {
        @Override
        public int getCount(){
            return  titles.length;
        }
        @Override
        public Object getItem(int position){
            return titles[position];
        }
        @Override
        public long getItemId(int position){
            return position;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            View view = View.inflate(MainActivity.this,R.layout.list_item,null);
            TextView title  = (TextView) view.findViewById(R.id.title);
            TextView price  = (TextView) view.findViewById(R.id.price);
            ImageView iv = (ImageView) view.findViewById(R.id.iv);
            title.setText(titles[position]);
            price.setText(prices[position]);
            iv.setBackgroundResource(icons[position]);
            return view;
        }
    }

}
