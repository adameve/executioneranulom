package anulom.executioner5.com3.anulom;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;

import static anulom.executioner5.com3.anulom.R.id.t1;

/**
 * Created by anulom on 23/10/17.
 */

public class Logintest extends ActivityInstrumentationTestCase2<Login> {

    public Logintest() {
        super(Login.class);

    }
    @Override
    protected void setUp() throws Exception{
        super.setUp();
    }
@SmallTest
public void testedittext(){
    EditText et=(EditText)getActivity().findViewById(R.id.etmailid);
    assertNotNull(et);

    EditText et1=(EditText)getActivity().findViewById(R.id.etPassword);
    assertNotNull(et1);

    }


    @SmallTest
    public void testButton(){
        Button bt=(Button) getActivity().findViewById(R.id.btnSubmit);
        assertNotNull(bt);

        Button bt1=(Button)getActivity().findViewById(R.id.btncancel);
        assertNotNull(bt1);

    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}


