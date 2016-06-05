package br.com.klauskpm.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

/**
 * Created by Kazlauskas on 26/05/2016.
 */
public class BasketTeam {

    public LinearLayout template;

    private TextView teamScoreTextView;

    final int THREE_POINTS_THROW = 3;
    final int TWO_POINTS_THROW = 2;
    final int FREE_THROW = 1;

    /**
     *
     * @param activity
     * @param teamName
     */
    public BasketTeam(AppCompatActivity activity, String teamName) {
        template = getTemplate(activity);

        TextView teamNameTextView = (TextView) template.findViewById(R.id.team_name_text_view);
        teamScoreTextView = (TextView) template.findViewById(R.id.score__text_view);
        Button threePointsButton = (Button) template.findViewById(R.id.three_points__button);
        Button twoPointsButton = (Button) template.findViewById(R.id.two_points__button);
        Button freeThrowButton = (Button) template.findViewById(R.id.free_throw__button);

        teamNameTextView.setText(teamName);
        /**
         * Settando o clickListener
         */
        threePointsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addThreePointsThrow();
            }
        });

        /**
         * Settando o clickListener
         */
        twoPointsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTwoPointsThrow();
            }
        });

        /**
         * Settando o clickListener
         */
        freeThrowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFreeThrow();
            }
        });
    }

    private LinearLayout getTemplate(AppCompatActivity activity) {
        LinearLayout template = (LinearLayout) activity.getLayoutInflater().inflate(
                R.layout.basket_team_template,
                null
        );

        LayoutParams layoutParams = new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT
        );
        template.setLayoutParams(layoutParams);

        return template;
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
        Integer previousPoints = Integer.parseInt((String) teamScoreTextView.getText());

        teamScoreTextView.setText("" + (previousPoints + points));
    }

    /**
     * Reseta o score(teamScore) para 0
     */
    public void reset() {
        teamScoreTextView.setText("" + 0);
    }
}
