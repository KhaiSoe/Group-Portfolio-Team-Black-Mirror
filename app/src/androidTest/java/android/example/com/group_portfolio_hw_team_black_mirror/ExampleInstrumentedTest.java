package android.example.com.group_portfolio_hw_team_black_mirror;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("android.example.com.group_portfolio_hw_team_black_mirror", appContext.getPackageName());
    }


    @Test
    public void validateKhaing_Biography() {

        /*Intent intent = new Intent(Intent.ACTION_PICK);
        View viewById = R.findViewById(R.id.k_biography);
        assertThat(viewById,notNullValue());*/
    }

    @Test
    public void validateBiography() {
        //do something
    }

    @Test
    public void validateGregg_Birography() {
        //do something
    }

    @Test
    public void validateMarly_Biography() {
        //do something
    }

}
