package joojootottakai.olioviikko9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView userPhoto;
    TextView txtName, txtEmail, txtDegree, txtCompletedDegrees;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userPhoto = itemView.findViewById(R.id.userPhoto);
        txtName = itemView.findViewById(R.id.txtName);
        txtEmail = itemView.findViewById(R.id.txtEmail);
        txtDegree = itemView.findViewById(R.id.txtDegree);
        txtCompletedDegrees = itemView.findViewById(R.id.txtCompletedDegrees);
    }
}
