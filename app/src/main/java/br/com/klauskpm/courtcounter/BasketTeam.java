package br.com.klauskpm.courtcounter;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kazlauskas on 26/05/2016.
 */
public class BasketTeam {

    TextView teamScore;
    Button threePointsThrow;
    Button twoPointsThrow;
    Button freeThrow;

    final int THREE_POINTS_THROW = 3;
    final int TWO_POINTS_THROW = 2;
    final int FREE_THROW = 1;

    public BasketTeam(
            View teamScoreTextView,
            View threePointsThrowButton,
            View twoPointsThrowButton,
            View freeThrowButton) {

        teamScore = (TextView) teamScoreTextView;
        threePointsThrow = (Button) threePointsThrowButton;
        twoPointsThrow = (Button) twoPointsThrowButton;
        freeThrow = (Button) freeThrowButton;

        threePointsThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addThreePointsThrow();
            }
        });

        twoPointsThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTwoPointsThrow();
            }
        });

        freeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFreeThrow();
            }
        });
    }

    public void addThreePointsThrow() {
        addPoints(THREE_POINTS_THROW);
    }

    public void addTwoPointsThrow() {
        addPoints(TWO_POINTS_THROW);
    }

    public void addFreeThrow() {
        addPoints(FREE_THROW);
    }

    private void addPoints(Integer points) {
        Integer previousPoints = Integer.parseInt((String) teamScore.getText());

        teamScore.setText("" + (previousPoints + points));
    }

    public void reset() {
        teamScore.setText("" + 0);
    }
}
