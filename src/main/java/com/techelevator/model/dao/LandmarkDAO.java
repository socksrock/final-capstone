package com.techelevator.model.dao;

import com.techelevator.model.dto.Landmark;

import java.util.List;

public interface LandmarkDAO {

    List<Landmark> getAllLandmarks();
    List<Landmark> getLandmarksByCity(String city);
    List<Landmark> getLandmarksByCountry(String country);
    List<Landmark> getLandmarksByState(String stateOrRegion);
    List<Landmark> getLandmarksByUser(int userID);
    List<Landmark> getLandmarkByItineraryId(int itineraryId);
    Landmark getLandmarkByID(String id);
    void editLandmark(Landmark landmark);
    void deleteLandmark(long id);
    void addLandmark(Landmark landmark);
    void addLandmarkToRelatorTable(String landmarkId, int itineraryId);
    List<String> getLandmarkAddressByItineraryId(int itineraryId);
    void updateThumbsUp(String choice, String landmark_id );

}
