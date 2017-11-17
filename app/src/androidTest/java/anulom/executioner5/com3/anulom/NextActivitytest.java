package anulom.executioner5.com3.anulom;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by anulom on 23/10/17.
 */
public class NextActivitytest extends ActivityInstrumentationTestCase2 {
    public NextActivitytest() {
        super(NextActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testTextView(){

        TextView t1=(TextView) getActivity().findViewById(R.id.textView);
        assertNotNull(t1);


    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
