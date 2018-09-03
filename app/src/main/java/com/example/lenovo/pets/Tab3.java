package com.example.lenovo.pets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Tab3 extends Fragment {

    ListView gridBird;
    String[] des3 = new String[] {
            "One of the most popular pet bird species in the world are the Budgies, and it comes as no surprise to anyone who has ever known one. When properly tamed and cared for, Budgies make extraordinarily friendly and affectionate pets. On top of being small and easy to care for, Budgies take well to training and can learn to perform many fun bird tricks. Best of all, Budgies have the ability to learn to talk, and delight people of all ages with their cute and comical little voices.\n",
            "The beautiful and captivating cockatiel is another great choice for those who are looking for a friendly and affectionate pet bird. Hailing from Australia, these birds make excellent pets when hand-fed as babies and raised in loving environments. While they don't normally learn to talk, they are exceptionally intelligent, and many learn to mimic common household noises such as doorbells, telephones, and microwaves. Being rather small, they don't require as much space as larger parrots and are therefore easier to house and care for than many other hookbill species.\n",
            "If you prefer large birds but still want a pet that will be friendly, loving, and affectionate, then most bird owners will tell you that a Cockatoo may be your best bet. These beautiful birds bond very strongly to their owners and prefer to be with them all of the time if possible. If you do consider a pet cockatoo, it is imperative that you make sure that you have plenty of free time to spend socializing with your bird. Cockatoos can become depressed if they aren't given enough attention, and may resort to plucking or other destructive behavior as a result.\n",
            "Hyacinth Macaws are the largest parrots on Earth, so it may come as a surprise to some that these birds are also known as \"gentle giants.\" Known for their friendly and sociable personalities, these large parrots love nothing more than to spend time playing and cuddling with their owners. Because of their incredible size, it can be difficult for most people to provide proper housing for these birds. However, those who are able to meet their needs are always rewarded with an incredible relationship with their feathered friend. If you are interested in learning more about what it takes to care for a Hyacinth Macaw, contact a breeder near you and try to schedule an appointment to meet with them and their birds.\n",
            "In the past few years, Parrotlets have enjoyed a great surge in popularity as pets around the world. Cute, tiny, and easy to take care of, these little birds are known for having personalities that are much larger than their tiny bodies. Those who consider a pet Parrotlet must have plenty of time on their hands to play and socialize with their birds so that they remain tame. However, for the right owners, Parrotlets make extremely loving and affectionate pets.\n"
    };
    String[] bird = new String[] {"Budgies","Cockatail","Cockatoos","Hyacinth macaw","Parrot"};
    int[] images3 = new int[] {
            R.drawable.bud_bird,
            R.drawable.cockatail,
            R.drawable.cockatoos,
            R.drawable.hyacinth_macaw,
            R.drawable.parrot
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View giveView = inflater.inflate(R.layout.fragment_tab3, container, false);
        gridBird = (ListView) giveView.findViewById(R.id.bird);
        BirdAdapter birdAdapter = new BirdAdapter();
        gridBird.setAdapter(birdAdapter);
        gridBird.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent three = new Intent(getContext(),InfoThree.class);
                three.putExtra("img",images3[i]);
                three.putExtra("name",bird[i]);
                three.putExtra("txt",des3[i]);
                startActivity(three);
            }
        });
        return giveView;
    }
    class BirdAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images3.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_birds,null);
            ImageView imageBird = (ImageView) view.findViewById(R.id.image_bird);
            TextView textBird = (TextView) view.findViewById(R.id.text_bird);
            imageBird.setImageResource(images3[i]);
            textBird.setText(bird[i]);
            return view;
        }
    }
}
