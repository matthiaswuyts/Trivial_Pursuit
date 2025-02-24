package TrivialPursuit.view.about;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AboutView extends BorderPane {
    // Private node attributes
    private Button backButton;
    private Label titleLabel;
    private VBox contentBox;
    private Label descriptionLabel1;
    private Label descriptionLabel2;

    public AboutView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {

        backButton = new Button("←");
        backButton.setFont(Font.font("System", FontWeight.BOLD, 24));
        backButton.setPadding(new Insets(10));


        titleLabel = new Label("About Us");
        titleLabel.setFont(Font.font("System", FontWeight.BOLD, 24));
        titleLabel.setUnderline(true);


        descriptionLabel1 = new Label("We are Matthias and Tobi and created this game called Trivial Pursuit.");
        descriptionLabel2 = new Label("This is a project we need to make for Programmeren 1.");
    }

    private void layoutNodes() {

        contentBox = new VBox(20);
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setPadding(new Insets(0,10,40,10));
        contentBox.getChildren().addAll(titleLabel, descriptionLabel1, descriptionLabel2);

        this.setCenter(contentBox);


        HBox topBox = new HBox(backButton);
        topBox.setAlignment(Pos.TOP_LEFT);
        topBox.setPadding(new Insets(10,10,10,10));
        this.setTop(topBox);

    }

    Button getBackButton() {
        return backButton;
    }
}
