package it.unipi.dii.lsmsdb.myPodcastDB.controller;

import it.unipi.dii.lsmsdb.myPodcastDB.model.PodcastPreview;
import it.unipi.dii.lsmsdb.myPodcastDB.model.User;
import it.unipi.dii.lsmsdb.myPodcastDB.utility.Logger;
import it.unipi.dii.lsmsdb.myPodcastDB.view.StageManager;
import it.unipi.dii.lsmsdb.myPodcastDB.view.ViewNavigator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserHomeController {

    private User userPreview;

    @FXML
    private Label userName;

    @FXML
    private ImageView userPicture;

    @FXML
    private ImageView home;

    @FXML
    private GridPane gridMostLikedPodcasts;

    @FXML
    private GridPane gridSuggestedForAuthor;

    @FXML
    private GridPane gridSuggestedForCategory;

    @FXML
    private GridPane gridSuggestedForUser;

    @FXML
    private GridPane gridWatchlist;

    @FXML
    private ScrollPane scrollMostLikedPodcasts;

    @FXML
    private ScrollPane scrollSuggestedForAuthor;

    @FXML
    private ScrollPane scrollSuggestedForCategory;

    @FXML
    private ScrollPane scrollSuggestedForUser;

    @FXML
    private ScrollPane scrollWatchlist;

    @FXML
    private ImageView searchButton;

    @FXML
    void onClickSearch(MouseEvent event) throws IOException {
        // TODO: E' NECESSARIO PASSARE IL PARAMETRO DI RICERCA
        StageManager.showPage(ViewNavigator.SEARCH.getPage());
    }

    @FXML
    void onEnterPressed(KeyEvent event) throws IOException {
        // TODO: E' NECESSARIO PASSARE IL PARAMETRO DI RICERCA
        if (event.getCode() == KeyCode.ENTER)
            StageManager.showPage(ViewNavigator.SEARCH.getPage());
    }

    @FXML
    void userProfile(MouseEvent event) {
        Logger.info("User profile clicked");
        //StageManager.showPage(ViewNavigator.USERPROFILE.getPage());
    }

    @FXML
    void onClickHome(MouseEvent event) throws IOException {
        Logger.info("Home clicked");
        StageManager.showPage(ViewNavigator.USERHOME.getPage());
    }

    @FXML
    void nextMostLikedPodcasts(MouseEvent event) {
        Logger.info("next podcast in mostLikedPodcasts");
        double scrollValue = 1;
        if (scrollMostLikedPodcasts.getHvalue() == 1.0)
            scrollValue = -1;
        scrollMostLikedPodcasts.setHvalue(scrollMostLikedPodcasts.getHvalue() + scrollValue);
    }

    @FXML
    void backMostLikedPodcasts(MouseEvent event) {
        Logger.info("back podcast in mostLikedPodcasts");
        double scrollValue = 1;
        if (scrollMostLikedPodcasts.getHvalue() == 0.0)
            scrollMostLikedPodcasts.setHvalue(1.0);
        else
            scrollMostLikedPodcasts.setHvalue(scrollMostLikedPodcasts.getHvalue() - scrollValue);
    }

    @FXML
    void nextSuggestedAuthor(MouseEvent event) {
        Logger.info("next suggested author");
        double scrollValue = 1;
        if (scrollSuggestedForAuthor.getHvalue() == 1.0)
            scrollValue = -1;
        scrollSuggestedForAuthor.setHvalue(scrollSuggestedForAuthor.getHvalue() + scrollValue);
    }

    @FXML
    void backSuggestedAuthor(MouseEvent event) {
        Logger.info("back podcast author");
        double scrollValue = 1;
        if (scrollSuggestedForAuthor.getHvalue() == 0.0)
            scrollSuggestedForAuthor.setHvalue(1.0);
        else
            scrollSuggestedForAuthor.setHvalue(scrollSuggestedForAuthor.getHvalue() - scrollValue);
    }

    @FXML
    void nextWatchlist(MouseEvent event) {
        Logger.info("next podcast in watchlist");
        double scrollValue = 1;
        if (scrollWatchlist.getHvalue() == 1.0)
            scrollValue = -1;
        scrollWatchlist.setHvalue(scrollWatchlist.getHvalue() + scrollValue);
    }

    @FXML
    void backWatchlist(MouseEvent event) {
        Logger.info("back podcast in watchlist");
        double scrollValue = 1;
        if (scrollWatchlist.getHvalue() == 0.0)
            scrollWatchlist.setHvalue(1.0);
        else
            scrollWatchlist.setHvalue(scrollWatchlist.getHvalue() - scrollValue);
    }

    @FXML
    void nextSuggestedCategory(MouseEvent event) {
        Logger.info("next suggested category");
        double scrollValue = 1;
        if (scrollSuggestedForCategory.getHvalue() == 1.0)
            scrollValue = -1;
        scrollSuggestedForCategory.setHvalue(scrollSuggestedForCategory.getHvalue() + scrollValue);
    }

    @FXML
    void backSuggestedCategory(MouseEvent event) {
        Logger.info("back podcast category");
        double scrollValue = 1;
        if (scrollSuggestedForCategory.getHvalue() == 0.0)
            scrollSuggestedForCategory.setHvalue(1.0);
        else
            scrollSuggestedForCategory.setHvalue(scrollSuggestedForCategory.getHvalue() - scrollValue);
    }

    @FXML
    void nextSuggestedUser(MouseEvent event) {
        Logger.info("next suggested user");
        double scrollValue = 1;
        if (scrollSuggestedForUser.getHvalue() == 1.0)
            scrollValue = -1;
        scrollSuggestedForUser.setHvalue(scrollSuggestedForUser.getHvalue() + scrollValue);
    }

    @FXML
    void backSuggestedUser(MouseEvent event) {
        Logger.info("back podcast user");
        double scrollValue = 1;
        if (scrollSuggestedForUser.getHvalue() == 0.0)
            scrollSuggestedForUser.setHvalue(1.0);
        else
            scrollSuggestedForUser.setHvalue(scrollSuggestedForUser.getHvalue() - scrollValue);
    }

    public void initialize() throws IOException {

        User userTest = new User("JuanLaZapp", "userPicture.png");

        // Setting user stuff
        //Image image = new Image(userTest.getPictureMedium());
        userName.setText("Welcome " + userTest.getUsername() + "!");
        //userPicture.setImage(image);

        /************************************************************************************/

        List<PodcastPreview> previewList = new ArrayList<>();
        PodcastPreview p1 = new PodcastPreview("54eb342567c94dacfb2a3e50", "Scaling Global", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts126/v4/ab/41/b7/ab41b798-1a5c-39b6-b1b9-c7b6d29f2075/mza_4840098199360295509.jpg/600x600bb.jpg");
        PodcastPreview p2 = new PodcastPreview("34e734b09246d17dc5d56f63", "Cornerstone Baptist Church of Orlando", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts125/v4/d3/06/0f/d3060ffe-613b-74d6-9594-cca7a874cd6c/mza_12661332092752927859.jpg/600x600bb.jpg");
        PodcastPreview p3 = new PodcastPreview("061a68eb754c400eae8027d7", "Average O Podcast", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts125/v4/54/e4/84/54e48471-6971-03c8-83f4-4f973dc2a8cb/mza_8686729233410161200.jpg/600x600bb.jpg");
        PodcastPreview p4 = new PodcastPreview("34e734b09246d17dc5d56f63", "Getting Smart Podcast", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts115/v4/52/e3/25/52e325bd-e6ba-3899-b7b4-71e512a48472/mza_18046006527881111713.png/600x600bb.jpg");
        PodcastPreview p5 = new PodcastPreview("84baff1495bff70bb81bd016", "Sofra Sredom", "https://is4-ssl.mzstatic.com/image/thumb/Podcasts115/v4/98/ca/c7/98cac700-4398-7489-100a-416ec28d6662/mza_15500803433364327137.jpg/600x600bb.jpg");
        PodcastPreview p6 = new PodcastPreview("34e734b09246d17dc5d56f63", "Cornerstone Baptist Church of Orlando", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts125/v4/d3/06/0f/d3060ffe-613b-74d6-9594-cca7a874cd6c/mza_12661332092752927859.jpg/600x600bb.jpg");
        previewList.add(p1);
        previewList.add(p2);
        previewList.add(p3);
        previewList.add(p4);
        previewList.add(p5);
        previewList.add(p6);

        int row = 0;
        int column = 0;
        for (PodcastPreview podcast : previewList){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getClassLoader().getResource("PodcastPreview.fxml"));

            // create new podcast element
            AnchorPane newPodcast = fxmlLoader.load();
            PodcastPreviewController controller = fxmlLoader.getController();
            controller.setData(podcast);

            // add new podcast to grid
            gridWatchlist.add(newPodcast, column++, row);
        }

        /************************************************************************************/

        previewList.clear();
        p1 = new PodcastPreview("84baff1495bff70bb81bd016", "Sofra Sredom", "https://is4-ssl.mzstatic.com/image/thumb/Podcasts115/v4/98/ca/c7/98cac700-4398-7489-100a-416ec28d6662/mza_15500803433364327137.jpg/600x600bb.jpg");
        p2 = new PodcastPreview("d79472fb8372d1adbf5dea69", "Willowbrook Church", "https://is4-ssl.mzstatic.com/image/thumb/Podcasts113/v4/95/ce/df/95cedfb1-49a7-187a-b9c2-65f99b214ccd/mza_6194046548563981637.jpg/600x600bb.jpg");
        p3 = new PodcastPreview("05faf4fccdf79b198b7a3407", "Can I be Funny?", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts115/v4/89/56/0e/89560e3c-0b96-0691-350e-eab2f443bf6d/mza_11121304875938507631.jpg/600x600bb.jpg");
        p4 = new PodcastPreview("9aaae9ac725c3a586701abf4", "KTs Money Matters", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts126/v4/17/42/75/17427552-6eaa-cf22-6213-1774a2d424f7/mza_16549547877306014389.jpeg/600x600bb.jpg");
        p5 = new PodcastPreview("ab3320eef1052aad807747ec", "Talking Disney Podcast", "https://is3-ssl.mzstatic.com/image/thumb/Podcasts114/v4/3b/30/9c/3b309c73-aec5-ac96-60b9-34eba0218218/mza_7561584782270172307.jpg/600x600bb.jpg");
        p6 = new PodcastPreview("b77ddff5e8d3df8aa39308ba", "Footnotes: A History Podcast", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts125/v4/3b/b3/be/3bb3be3d-ebb0-e4e4-4311-1a7f9e43030a/mza_15641279120309904835.jpg/600x600bb.jpg");
        PodcastPreview p7 = new PodcastPreview("54eb342567c94dacfb2a3e50", "Scaling Global", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts126/v4/ab/41/b7/ab41b798-1a5c-39b6-b1b9-c7b6d29f2075/mza_4840098199360295509.jpg/600x600bb.jpg");
        PodcastPreview p8 = new PodcastPreview("34e734b09246d17dc5d56f63", "Cornerstone Baptist Church of Orlando", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts125/v4/d3/06/0f/d3060ffe-613b-74d6-9594-cca7a874cd6c/mza_12661332092752927859.jpg/600x600bb.jpg");
        previewList.add(p1);
        previewList.add(p2);
        previewList.add(p3);
        previewList.add(p4);
        previewList.add(p5);
        previewList.add(p6);
        previewList.add(p7);
        previewList.add(p8);

        row = 0;
        column = 0;
        for (PodcastPreview podcast : previewList){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getClassLoader().getResource("PodcastPreview.fxml"));

            // create new podcast element
            AnchorPane newPodcast = fxmlLoader.load();
            PodcastPreviewController controller = fxmlLoader.getController();
            controller.setData(podcast);

            // add new podcast to grid
            gridSuggestedForAuthor.add(newPodcast, column++, row);
        }

        /************************************************************************************/

        previewList.clear();
        p1 = new PodcastPreview("84baff1495bff70bb81bd016", "Sofra Sredom", "https://is4-ssl.mzstatic.com/image/thumb/Podcasts115/v4/98/ca/c7/98cac700-4398-7489-100a-416ec28d6662/mza_15500803433364327137.jpg/600x600bb.jpg");
        p2 = new PodcastPreview("d79472fb8372d1adbf5dea69", "Willowbrook Church", "https://is4-ssl.mzstatic.com/image/thumb/Podcasts113/v4/95/ce/df/95cedfb1-49a7-187a-b9c2-65f99b214ccd/mza_6194046548563981637.jpg/600x600bb.jpg");
        p3 = new PodcastPreview("05faf4fccdf79b198b7a3407", "Can I be Funny?", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts115/v4/89/56/0e/89560e3c-0b96-0691-350e-eab2f443bf6d/mza_11121304875938507631.jpg/600x600bb.jpg");
        p4 = new PodcastPreview("9aaae9ac725c3a586701abf4", "KTs Money Matters", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts126/v4/17/42/75/17427552-6eaa-cf22-6213-1774a2d424f7/mza_16549547877306014389.jpeg/600x600bb.jpg");
        p5 = new PodcastPreview("ab3320eef1052aad807747ec", "Talking Disney Podcast", "https://is3-ssl.mzstatic.com/image/thumb/Podcasts114/v4/3b/30/9c/3b309c73-aec5-ac96-60b9-34eba0218218/mza_7561584782270172307.jpg/600x600bb.jpg");
        p6 = new PodcastPreview("b77ddff5e8d3df8aa39308ba", "Footnotes: A History Podcast", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts125/v4/3b/b3/be/3bb3be3d-ebb0-e4e4-4311-1a7f9e43030a/mza_15641279120309904835.jpg/600x600bb.jpg");
        p7 = new PodcastPreview("54eb342567c94dacfb2a3e50", "Scaling Global", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts126/v4/ab/41/b7/ab41b798-1a5c-39b6-b1b9-c7b6d29f2075/mza_4840098199360295509.jpg/600x600bb.jpg");
        p8 = new PodcastPreview("34e734b09246d17dc5d56f63", "Cornerstone Baptist Church of Orlando", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts125/v4/d3/06/0f/d3060ffe-613b-74d6-9594-cca7a874cd6c/mza_12661332092752927859.jpg/600x600bb.jpg");
        previewList.add(p8);
        previewList.add(p5);
        previewList.add(p7);
        previewList.add(p1);
        previewList.add(p4);
        previewList.add(p6);
        previewList.add(p3);
        previewList.add(p8);

        row = 0;
        column = 0;
        for (PodcastPreview podcast : previewList){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getClassLoader().getResource("PodcastPreview.fxml"));

            // create new podcast element
            AnchorPane newPodcast = fxmlLoader.load();
            PodcastPreviewController controller = fxmlLoader.getController();
            controller.setData(podcast);

            // add new podcast to grid
            gridSuggestedForCategory.add(newPodcast, column++, row);
        }

        previewList.clear();
        p3 = new PodcastPreview("05faf4fccdf79b198b7a3407", "Can I be Funny?", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts115/v4/89/56/0e/89560e3c-0b96-0691-350e-eab2f443bf6d/mza_11121304875938507631.jpg/600x600bb.jpg");
        p4 = new PodcastPreview("9aaae9ac725c3a586701abf4", "KTs Money Matters", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts126/v4/17/42/75/17427552-6eaa-cf22-6213-1774a2d424f7/mza_16549547877306014389.jpeg/600x600bb.jpg");
        p5 = new PodcastPreview("ab3320eef1052aad807747ec", "Talking Disney Podcast", "https://is3-ssl.mzstatic.com/image/thumb/Podcasts114/v4/3b/30/9c/3b309c73-aec5-ac96-60b9-34eba0218218/mza_7561584782270172307.jpg/600x600bb.jpg");
        p6 = new PodcastPreview("b77ddff5e8d3df8aa39308ba", "Footnotes: A History Podcast", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts125/v4/3b/b3/be/3bb3be3d-ebb0-e4e4-4311-1a7f9e43030a/mza_15641279120309904835.jpg/600x600bb.jpg");
        previewList.add(p5);
        previewList.add(p4);
        previewList.add(p3);
        previewList.add(p6);
        previewList.add(p5);
        previewList.add(p6);

        row = 0;
        column = 0;
        for (PodcastPreview podcast : previewList){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getClassLoader().getResource("PodcastPreview.fxml"));

            // create new podcast element
            AnchorPane newPodcast = fxmlLoader.load();
            PodcastPreviewController controller = fxmlLoader.getController();
            controller.setData(podcast);

            // add new podcast to grid

            gridSuggestedForUser.add(newPodcast, column++, row);
        }

        /************************************************************************************/

        previewList.clear();
        p1 = new PodcastPreview("54eb342567c94dacfb2a3e50", "Scaling Global", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts126/v4/ab/41/b7/ab41b798-1a5c-39b6-b1b9-c7b6d29f2075/mza_4840098199360295509.jpg/600x600bb.jpg");
        p2 = new PodcastPreview("34e734b09246d17dc5d56f63", "Cornerstone Baptist Church of Orlando", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts125/v4/d3/06/0f/d3060ffe-613b-74d6-9594-cca7a874cd6c/mza_12661332092752927859.jpg/600x600bb.jpg");
        p3 = new PodcastPreview("061a68eb754c400eae8027d7", "Average O Podcast", "https://is2-ssl.mzstatic.com/image/thumb/Podcasts125/v4/54/e4/84/54e48471-6971-03c8-83f4-4f973dc2a8cb/mza_8686729233410161200.jpg/600x600bb.jpg");
        p4 = new PodcastPreview("34e734b09246d17dc5d56f63", "Getting Smart Podcast", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts115/v4/52/e3/25/52e325bd-e6ba-3899-b7b4-71e512a48472/mza_18046006527881111713.png/600x600bb.jpg");
        p5 = new PodcastPreview("84baff1495bff70bb81bd016", "Sofra Sredom", "https://is4-ssl.mzstatic.com/image/thumb/Podcasts115/v4/98/ca/c7/98cac700-4398-7489-100a-416ec28d6662/mza_15500803433364327137.jpg/600x600bb.jpg");
        p6 = new PodcastPreview("34e734b09246d17dc5d56f63", "Cornerstone Baptist Church of Orlando", "https://is5-ssl.mzstatic.com/image/thumb/Podcasts125/v4/d3/06/0f/d3060ffe-613b-74d6-9594-cca7a874cd6c/mza_12661332092752927859.jpg/600x600bb.jpg");
        previewList.add(p1);
        previewList.add(p2);
        previewList.add(p3);
        previewList.add(p4);
        previewList.add(p5);
        previewList.add(p6);

        row = 0;
        column = 0;
        for (PodcastPreview podcast : previewList){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getClassLoader().getResource("PodcastPreview.fxml"));

            // create new podcast element
            AnchorPane newPodcast = fxmlLoader.load();
            PodcastPreviewController controller = fxmlLoader.getController();
            controller.setData(podcast);

            // add new podcast to grid
            gridMostLikedPodcasts.add(newPodcast, column++, row);
        }
    }
}