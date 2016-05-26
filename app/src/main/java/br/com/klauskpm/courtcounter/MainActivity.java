package br.com.klauskpm.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private BasketTeam BasketTeamA;
    private BasketTeam BasketTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.team_b__score__text_view);

        BasketTeamA = new BasketTeam(
            findViewById(R.id.team_a__score__text_view),
            findViewById(R.id.team_a__three_points__button),
            findViewById(R.id.team_a__two_points__button),
            findViewById(R.id.team_a__free_throw__button)
        );

        BasketTeamB = new BasketTeam(
            findViewById(R.id.team_b__score__text_view),
            findViewById(R.id.team_b__three_points__button),
            findViewById(R.id.team_b__two_points__button),
            findViewById(R.id.team_b__free_throw__button)
        );
    }

    public void reset(View v) {
        BasketTeamA.reset();
        BasketTeamB.reset();
    }
}
