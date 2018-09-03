package com.example.lenovo.pets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Tab1 extends Fragment {

    String[] des = new String[] {
            "The Labrador retrievers are the most popular dog breed in all over the world and as well in India.\n" +
                    "Labradors are easy to train, friendly and intelligent dogs.\n" +
                    "Also, they are easily available in most of the Indian cities and need average grooming and easy to train.\n" +
                    "Labrador dogs collaborate well with Indian climate that makes them highly admired and top desired dog breed in India.\n" +
                    "Origin\tUK\n" +
                    "Height\tMale: 57–62 cm, Female: 55–60 cm\n" +
                    "Weight\tMale: 29–36 kg, Female: 25–32 kg\n" +
                    "Life Span\t9 - 12 years\n" +
                    "Grooming Need\tAverage",

            "Indian Pariah dogs are the one among healthiest dogs in the world and in India they are available easily and freely. \n" +
                    "Also, many NGO’s and city dog care centres offer them for free adoption. \n" +
                    "They are also known as InDog and Desi, and are a natural Landrace and an example of survival of the fittest and most suitable for Indian climate and make a good pet.\n" +
                    "They are also most suitable dogs for extreme Indian weather and generic uses. Pariah dogs are most cost effective and suitable dogs for the Indian subcontinent.But you must not be confused that all the stray dogs are not the Pariah dogs.\n" +
                    "\n" +
                    "Origin\tIndia\n" +
                    "Height\t10-14inches\n" +
                    "Weight\tAverage 8 to 14 kgs",

            "The Dalmatian dogs were originated from Dalmatia (Roman province), by Dalmatae tribe. \n" +
                    "From where they got their name Dalmatian.\n" +
                    "Dalmatians are healthy and athletic dogs from working category and also make a good watchdog. \n" +
                    "Dalmatian dogs are a healthy dog, which is also suitable to survive in warm weather, but not recommended for extreme cold weather.\n" +
                    "Dalmatians are a sturdy and athletic dogs and need regular exercise and early socialization and training.\n" +
                    "\n" +
                    "Origin\tDalmatia\n" +
                    "Height\tFemale: 46-64 cm, Male: 53 -66 cm\n" +
                    "Weight\tFemale: 16-24 kg, Male: 15-32 kg\n" +
                    "Life Span\tAverage 10-13 years\n" +
                    "Grooming Need\tLow\n" +
                    "Life Span\t10 -14 years\n" +
                    "Grooming Need\tAverage",

            "Doberman dogs are intelligent and courageous dogs from working category. \n" +
                    "They are most admired for protection and their extraordinary Sixth Sense. \n" +
                    "Dobermans were originated by Karl Friedrich Louis Dobermann in Germany to work for the personal protection and nowadays, they are the most preferred dogs for military and police services in all over the world. \n" +
                    "They are fearless, sturdy dogs, but they need moderate exercise and daily long walk or running. \n" +
                    "Doberman dogs are easily available in most of the Indian cities, though they are not well admired for extreme weather. \n" +
                    "But their unmatched quality, reasonable price and average grooming needs make them a top demanded dog breed in the budget.\n" +
                    "\n" +
                    " \n" +
                    "Origin\tGermany\n" +
                    "Height\tMale 66-72cm, Female 61-68 cm\n" +
                    "Weight\tFemale 16-24 kg, Male 15-32 kg\n" +
                    "Life Span\tAverage 10 -13 years\n" +
                    "Grooming Need\tMedium",

            "Indian Spitzs are usually confused with Pomeranians, but both are the different breeds. \n" +
                    "The Pomeranians are smaller in height and have less weight and longer fur than Indian Spitzs. \n" +
                    "The Indian Spitzs are the similar presence to the German Spitz but they are 1.5-2.5 inches shorter at the withers and have less weight. \n" +
                    "Though they are not recognized by any major Kennel Club, KCI (Kennel Club of India) identified them as a separate Indian Breed. \n" +
                    "They are available in less budget, suitable for Indian weather and need less grooming.\n" +
                    "\n" +
                    "Origin\tIndia\n" +
                    "Height\t10-14inches\n" +
                    "Weight\tAverage 8 to 14 kgs\n" +
                    "Life Span\t10-12 years\n" +
                    "Grooming Need\tAverage",

            "Though German shepherds are a new dog breed originated since the year 1899 and today they are the most popular dogs in the world and top demanded dog in America. \n" +
                    "German Shepherds are also known as Alsatian (UK), Alsatian wolf dog (UK) and Alsatian, Deutscher and GSD. \n" +
                    "They are basically from herding category and are a highly appreciated as working dogs. \n" +
                    "German shepherds are an alert, intelligent, loyal and courageous dog that make them an ideal dog. \n" +
                    "But GSD is suggested for experienced and firm owners because they have separation anxiety and pack leader's tendency that need attention and regular exercise. \n" +
                    "German shepherds are easily available in most of the cities and well adopted in Indian weather that needs average grooming and moderate training.\n" +
                    "\n" +
                    " \n" +
                    "Origin\tGermany\n" +
                    "Height\t18 -22 inches\n" +
                    "Weight\t22 -42 Kgs\n" +
                    "Life Span\t9 - 13 years\n" +
                    "Grooming Need\tMedium",

            "The dachshund is a small active and energetic dogs from earth dog category, this breed was bred to hunt small prey like tunnelling animals, rabbits, and hairs, which are the one of the best earth dogs in the world. \n" +
                    "If you are looking for a small, intelligent, healthy and courageous dog then they are the right selection. \n" +
                    "Dachshunds are available in most of the major Indian cities and good for apartment life and Indian climate, which are available in affordable price, in India. \n" +
                    "That makes them a most demanded dog breed in India.\n" +
                    "\n" +
                    "Origin\tGermany\n" +
                    "Height\tAverage 5-9 Inches\n" +
                    "Weight\tApprox 3-6 Kgs\n" +
                    "Life Span\t14 -17 years\n" +
                    "Grooming Need\tMedium\n",

            "The pug is a small, affectionate and emotional dog with an innocent face, short muzzle and curled tail. \n" +
                    "The pug is an ancient dog breed and one among oldest dog breeds, but they got real popularity in India when Vodafone advertisement brought them in publicity. \n" +
                    "They are the most favourite dog breeds for girls in India and an ideal pet for apartment living and friendly and reliable with young kids. \n" +
                    "Pug is available almost most of the Indian Cities and need less grooming and training, but need regular medical care and your engagement.\n" +
                    "\n" +
                    "Origin\tChina\n" +
                    "Height\t10 -14 inches\n" +
                    "Weight\tBetween 7 and 12 pounds (3.17 and 5.44kg).\n" +
                    "Life Span\t12 -15 years\n" +
                    "Grooming Need\tMedium to High"
    };
    String[] dogs = new String[] {"Labrador","Pariah","Dalmatian","Doberman","Indian spitz","German Shephard","Duchshund","Pug"};
    int[] images1 = new int[] {
            R.drawable.labrador,
            R.drawable.pariah,
            R.drawable.dalmatian,
            R.drawable.doberman,
            R.drawable.indian_spitz,
            R.drawable.german_shephard,
            R.drawable.duchshund,
            R.drawable.pug
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View giveView = inflater.inflate(R.layout.fragment_tab1, container, false);
        ListView gridDog = (ListView) giveView.findViewById(R.id.dog);
        DogAdapter dogAdapter = new DogAdapter();
        gridDog.setAdapter(dogAdapter);
        gridDog.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),InfoOne.class);
                intent.putExtra("img",images1[i]);
                intent.putExtra("name",dogs[i]);
                intent.putExtra("txt",des[i]);
                startActivity(intent);
            }
        });
        return giveView;
    }
    class DogAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images1.length;
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
            ImageView imageDog;
            TextView textDog;
            view = getLayoutInflater().inflate(R.layout.custom_dogs,null);
            imageDog = (ImageView) view.findViewById(R.id.image_dog);
            textDog = (TextView) view.findViewById(R.id.text_dog);
            imageDog.setImageResource(images1[i]);
            textDog.setText(dogs[i]);
            return view;
        }
    }
}
