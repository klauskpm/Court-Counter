package br.com.klauskpm.courtcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

/**
 * Created by Kazlauskas on 05/06/2016.
 */
public class Court {

    public LinearLayout template;

    private BasketTeam basketTeamA;
    private BasketTeam basketTeamB;

    public Court(AppCompatActivity activity, String teamA, String teamB) {
        basketTeamA = new BasketTeam(activity, teamA);
        basketTeamB = new BasketTeam(activity, teamB);

        template = getTemplate(activity);

        LinearLayout teamAViewGroup = (LinearLayout) activity.findViewById(R.id.team_a);
        LinearLayout teamBViewGroup = (LinearLayout) activity.findViewById(R.id.team_b);

        teamAViewGroup.addView(basketTeamA.template);
        teamBViewGroup.addView(basketTeamB.template);
    }


    private LinearLayout getTemplate(AppCompatActivity activity) {
        return (LinearLayout) activity.findViewById(R.id.court);
    }

    public void resetScore() {
        basketTeamA.reset();
        basketTeamB.reset();
    }
}
