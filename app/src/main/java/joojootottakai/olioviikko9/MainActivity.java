package joojootottakai.olioviikko9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    private Context context = MainActivity.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserStorage s = UserStorage.getInstance();
        UserStorage.getInstance().loadUsers(context);
        UserStorage.getInstance().sortUsers();
    }

    public void switchToAddUser(View view)  {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }

    public void switchListUsers(View view)  {
        Intent intent = new Intent(this, ListUsersActivity.class);
        startActivity(intent);
    }

}