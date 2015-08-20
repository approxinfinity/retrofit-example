package com.approxinfinity.retrofitexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.approxinfinity.retrofitexample.models.UserModel;
import com.approxinfinity.retrofitexample.services.ICallback;
import com.approxinfinity.retrofitexample.services.UserService;


public class MainActivity extends ActionBarActivity
{

    private static final String TAG = "MainActivity";

    protected Button goButton;
    protected EditText userId;
    protected TextView userInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onResume()
    {
        super.onResume();

        this.userId = (EditText) this.findViewById(R.id.user_id);
        this.userInfo = (TextView) this.findViewById(R.id.user_info);
        this.goButton = (Button) this.findViewById(R.id.go_button);
        this.goButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                getUserFromApiAndUpdateUI();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void getUserFromApiAndUpdateUI()
    {
        String userId = "";
        if (this.userId.getText() != null)
        {
            userId = this.userId.getText().toString();
        }

        UserService.fetchUser(userId, new ICallback<UserModel>()
        {
            @Override
            public void success(UserModel model)
            {
                String currentUserInfo = model.getName() + "\n" + model.getEmail() + "\n" + model.getPhone();
                userInfo.setText(currentUserInfo);

            }

            @Override
            public void failure(Exception exception)
            {
                Log.d(TAG, exception.toString());
            }
        });
    }
}
