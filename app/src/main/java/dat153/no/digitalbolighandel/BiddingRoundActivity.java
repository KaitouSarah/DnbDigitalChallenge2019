package dat153.no.digitalbolighandel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BiddingRoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidding_round);
    }

    public void biddingRoundBackButton(View view) {
        Intent goToPreviousActivity = new Intent(this, MainActivity.class);
        startActivity(goToPreviousActivity);
    }
}
