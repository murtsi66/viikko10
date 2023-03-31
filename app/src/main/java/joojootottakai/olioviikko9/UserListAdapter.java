package joojootottakai.olioviikko9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.txtName.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.txtEmail.setText(user.getEmail());
        holder.txtDegree.setText(user.getDegreeProgram());
        holder.userPhoto.setImageResource(user.getImage());
        holder.txtCompletedDegrees.setText(users.get(position).getDegrees());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
