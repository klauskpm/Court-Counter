package br.com.klauskpm.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView teamAScore;
    private TextView teamBScore;

    private BasketTeam BasketTeamA;
    private BasketTeam BasketTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = (TextView) findViewById(R.id.team_a__score__text_view);
        teamBScore = (TextView) findViewById(R.id.team_b__score__text_view);

        BasketTeamA = new BasketTeam(teamAScore);
        BasketTeamB = new BasketTeam(teamBScore);
    }

    public void threePointsThrow(View v) {
        switch (v.getId()) {
            case R.id.team_a__three_points__button:
                BasketTeamA.threePointsThrow();
                break;

            case R.id.team_b__three_points__button:
                BasketTeamB.threePointsThrow();
                break;
        }
    }

    public void twoPointsThrow(View v) {
        switch (v.getId()) {
            case R.id.team_a__two_points__button:
                BasketTeamA.twoPointsThrow();
                break;

            case R.id.team_b__two_points__button:
                BasketTeamB.twoPointsThrow();
                break;
        }
    }

    public void freeThrow(View v) {
        switch (v.getId()) {
            case R.id.team_a__free_throw__button:
                BasketTeamA.freeThrow();
                break;

            case R.id.team_b__free_throw__button:
                BasketTeamB.freeThrow();
                break;
        }
    }

    public void reset(View v) {
        BasketTeamA.reset();
        BasketTeamB.reset();
    }
}
