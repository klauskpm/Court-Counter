package br.com.klauskpm.courtcounter;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Kazlauskas on 26/05/2016.
 */
public class BasketTeam {

    private TextView teamScore;

    final int THREE_POINTS_THROW = 3;
    final int TWO_POINTS_THROW = 2;
    final int FREE_THROW = 1;

    public BasketTeam(
            View teamScoreTextView,
            View threePointsThrowButton,
            View twoPointsThrowButton,
            View freeThrowButton) {

        // Declaração de variáveis do sistema
        teamScore = (TextView) teamScoreTextView;
        Button threePointsThrow = (Button) threePointsThrowButton;
        Button twoPointsThrow = (Button) twoPointsThrowButton;
        Button freeThrow = (Button) freeThrowButton;

        /**
         * Settando o clickListener
         */
        threePointsThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addThreePointsThrow();
            }
        });

        /**
         * Settando o clickListener
         */
        twoPointsThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTwoPointsThrow();
            }
        });

        /**
         * Settando o clickListener
         */
        freeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFreeThrow();
            }
        });
    }

    /**
     * Adiciona THREE_POINTS_THROW no score
     */
    public void addThreePointsThrow() {
        addPoints(THREE_POINTS_THROW);
    }

    /**
     * Adiciona TWO_POINTS_THROW no score
     */
    public void addTwoPointsThrow() {
        addPoints(TWO_POINTS_THROW);
    }

    /**
     * Adiciona FREE_THOW no score
     */
    public void addFreeThrow() {
        addPoints(FREE_THROW);
    }

    /**
     * Adiciona os pontos(points) declarados no score(teamScore)
     *
     * @param points
     */
    private void addPoints(Integer points) {
        Integer previousPoints = Integer.parseInt((String) teamScore.getText());

        teamScore.setText("" + (previousPoints + points));
    }

    /**
     * Reseta o score(teamScore) para 0
     */
    public void reset() {
        teamScore.setText("" + 0);
    }
}
