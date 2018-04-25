package lv.va.sludinajumuportals.service;

import lv.va.sludinajumuportals.domain.Advertisement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdvertisementService {

    public Advertisement getAdvertisement() {
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");
        return advertisement;
    }

    public ArrayList<Advertisement> getAdvertisementList() {
        ArrayList<Advertisement> advertisements = new ArrayList<>();
        Advertisement advertisement = new Advertisement(1L, "Pardod māju", "Pārdod lielu māju", "Jānis");


        advertisements.add(advertisement);

        return advertisements;
    }
}
