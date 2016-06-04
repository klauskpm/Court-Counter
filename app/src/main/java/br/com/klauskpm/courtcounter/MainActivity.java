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

        BasketTeamA = new BasketTeam(this);

        BasketTeamB = new BasketTeam(this);
    }

    public void reset(View v) {
        BasketTeamA.reset();
        BasketTeamB.reset();
    }
}
