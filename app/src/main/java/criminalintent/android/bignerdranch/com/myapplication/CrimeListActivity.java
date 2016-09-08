package criminalintent.android.bignerdranch.com.myapplication;

import android.support.v4.app.Fragment;

/**
 * Created by george on 9/7/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
