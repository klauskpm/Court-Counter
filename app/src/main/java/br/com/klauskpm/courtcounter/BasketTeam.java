package br.com.klauskpm.courtcounter;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Kazlauskas on 26/05/2016.
 */
public class BasketTeam {

    TextView teamScore;

    final int THREE_POINTS_THROW = 3;
    final int TWO_POINTS_THROW = 2;
    final int FREE_THROW = 1;

    public BasketTeam(View v) {
        teamScore = (TextView) v;
    }

    public void threePointsThrow() {
        addPoints(THREE_POINTS_THROW);
    }

    public void twoPointsThrow() {
        addPoints(TWO_POINTS_THROW);
    }

    public void freeThrow() {
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
