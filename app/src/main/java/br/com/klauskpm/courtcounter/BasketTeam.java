package br.com.klauskpm.courtcounter;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Kazlauskas on 26/05/2016.
 */
public class BasketTeam {

    TextView teamScore;

    public BasketTeam(View v) {
        teamScore = (TextView) v;
    }

    public void threePointsThrow() {
        addPoints(3);
    }

    public void twoPointsThrow() {
        addPoints(2);
    }

    public void freeThrow() {
        addPoints(1);
    }

    private void addPoints(Integer points) {
        Integer previousPoints = Integer.parseInt((String) teamScore.getText());

        teamScore.setText("" + (previousPoints + points));
    }

    public void reset() {
        teamScore.setText("" + 0);
    }
}
