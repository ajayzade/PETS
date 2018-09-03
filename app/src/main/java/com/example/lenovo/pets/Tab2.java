package com.example.lenovo.pets;


import android.annotation.SuppressLint;
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


public class Tab2 extends Fragment {

    ListView gridCat;
    String[] des1 = new String[] {
            "Features – A long white mane and deep set twinkling eyes.\n" +
                    "Temperament– May act a bit fussy and demanding but mostly independent.\n" +
                    "Persian cats are suitable for small apartments and require regular grooming, also immensely popular in the USA and France too.\n",

            "Features – Medium-build, slender legs, small-oval paws and a triangular face. Hind legs are higher compared to the front legs. Its mongoloid eyes slant inwards.\n" +
                    "Coat Color– Brownish/Cream.\n" +
                    "Temperament- Will start crying when ignored. They love a lot of attention.\n" +
                    "Siamese is a common cat breed in South East Asia and originated in Shanghai. \n",

            "Features- It has thick fur that is medium to long, large round eyes, large body and paws.\n" +
                    "Temperament- These cats have a non-fussy and adaptive character. They are well-behaved, outgoing and friendly. Therefore, it is very suitable cat for a house with children.\n" +
                    "Maine Coon is a very popular breed all over the world and can adjust to any climatic condition. \n",

            "The quintessential Indian Billi is the most common breed found in India and adjusts well to the Indian climatic conditions.\n" +
                    "Features- It has a long tail that is darker than its body. Its fur is covered in grey spots. It has a sturdy build.\n" +
                    "Temperament: A friendly and loving cat that will always be by your side.\n" +
                    "You can easily spot this cat roaming in your neighborhood alleys. Visit the nearest animal shelter and adopt one and earn a good deed in return.\n",

            "Features- This cat is recognized by its cute tail that is one-third the length of its total body. It has a muscular body type, shiny coat and fluffy long hair.\n" +
                    "Temperament- This breed is playful and adjusts well in any environmental setting. It is a smart cat that enjoys puzzle toys and playing fetch. It is devoted to its human family and can be trained to walk on a leash. It will be friendly towards guests visiting your house.\n" +
                    "Bobtails originated in the US in the late 1960’s.",

            "Features: Muscular-build, round head that is narrow on the sides, striking golden round eyes, short hair and shiny coat. This agile cat is classified into the British and the American Bombay.\n" +
                    "Temperament: It is a friendly cat that loves to play and learn tricks. It is able to easily adapt to different environments and lifestyles. Its calm demeanor makes it an ideal pet for small apartments too. It is a smart cat that can be taught to walk on leash.\n" +
                    "Bombay Cat Breed was developed in 1965 by Nikki Horner a breeder from Louisville, Kentucky. She wanted to create a breed of cat that looked like a miniature black panther.\n",

            "Features- Long fluffy coat that requires daily brushing and beautiful blue eyes define this cat’s look.\n" +
                    "Coat Color- Its medium to large sized body is white or fawn with color points (in red, cream, brown or lilac shades) distributed on the face, ears, legs and tail.\n" +
                    "Temperament- It is a loving and loyal cat that yearns for human companionship. This breed isn’t very active or athletic and loves to lounge on its owner’s lap.\n" +
                    "Himalayan is a man-made breed and is a cross between Persian and Siamese to achieve color points and blue eyes of Siamese. In 1950’s American and British breeders became interested in developing this breed.\n"
    };
    String[] cat = new String[] {"Persian cat","Siamese cat","Maine coon","Spotted cat","Bobtail cat","Bombay cat","Himalayan cat"};
    int[] images2 = new int[] {
            R.drawable.persian_cat,
            R.drawable.siamese_cat,
            R.drawable.maine_coon,
            R.drawable.spotted_cat,
            R.drawable.bobtail_cat,
            R.drawable.bombay_cat,
            R.drawable.himalayan_cat
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View giveView = inflater.inflate(R.layout.fragment_tab2, container, false);
        gridCat = (ListView) giveView.findViewById(R.id.cat);
        CatAdapter catAdapter = new CatAdapter();
        gridCat.setAdapter(catAdapter);
        gridCat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent two = new Intent(getContext(),InfoTwo.class);
                two.putExtra("img",images2[i]);
                two.putExtra("name",cat[i]);
                two.putExtra("txt",des1[i]);
                startActivity(two);
            }
        });
        return giveView;
    }
    class CatAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images2.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_cats,null);
            ImageView imageCat = (ImageView) view.findViewById(R.id.image_cat);
            TextView textCat = (TextView) view.findViewById(R.id.text_cat);
            imageCat.setImageResource(images2[i]);
            textCat.setText(cat[i]);
            return view;
        }
    }
}
