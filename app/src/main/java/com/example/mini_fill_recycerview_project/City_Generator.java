package com.example.mini_fill_recycerview_project;

import java.util.ArrayList;
import java.util.List;

public class City_Generator {

    public static List<City> getDate() {

        List<City> cityList = new ArrayList<>();
        int[] cityimages = new int[]{R.drawable.arak, R.drawable.ardebil, R.drawable.azarbayjan_gh,
                R.drawable.azarbayjan_sh, R.drawable.bushehr, R.drawable.esfahan, R.drawable.gilan,
                R.drawable.ilam, R.drawable.karaj, R.drawable.kerman, R.drawable.kermanshah,
                R.drawable.lorestan, R.drawable.mashhad, R.drawable.qazvin, R.drawable.qom,
                R.drawable.shiraz, R.drawable.tehran, R.drawable.yazd, R.drawable.zanjan};

        String[] cityname = new String[]{
                "اراک", "اردبیل", "آذربایجان غربی",
                "آذربایجان شرقی", "بوشهر", "اصفهان", "گیلان",
                "ایلام", "کرج", "کرمان", "کرمانشاه",
                "لرستان", "مشهد", "قزوین", "قم",
                "شیراز", "تهران", "یزد", "زنجان"
        };

        for (int i = 0; i < cityname.length; i++) {
            City city = new City();
            city.setCityname(cityname[i]);
            city.setImgcity(cityimages[i]);
            cityList.add(city);
        }
        return cityList;
    }


}
