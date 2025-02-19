package com.example.blooddrop;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bloodbank extends AppCompatActivity {

    private TextView bloodTypeTextView;
    private TextView statusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodbank);

        TableLayout bloodTableLayout = findViewById(R.id.bloodTableLayout);

        /*DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Storage");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Clear existing rows except the header row
                int childCount = bloodTableLayout.getChildCount();
                if (childCount > 1) {
                    bloodTableLayout.removeViews(1, childCount - 1);
                }

                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    // Read the blood type key (e.g., "A+")
                    String bloodType = snapshot.getKey();

                    // Retrieve the status and other details
                    String status = snapshot.child("Status").getValue(String.class);

                    if (bloodType != null && status != null) {
                        // Create a new row for the table
                        TableRow row = new TableRow(bloodbank.this);

                        // Blood Type Column
                        TextView bloodTypeTextView = new TextView(bloodbank.this);
                        bloodTypeTextView.setText(bloodType);
                        bloodTypeTextView.setPadding(5, 20, 8, 8);

                        // Status Column
                        TextView statusTextView = new TextView(bloodbank.this);
                        statusTextView.setText(status);
                        statusTextView.setPadding(15, 20, 8, 8);

                        if ("Available".equalsIgnoreCase(status)) {
                            statusTextView.setTextColor(getResources().getColor(R.color.status_available));
                        } else if ("Not Available".equalsIgnoreCase(status)) {
                            statusTextView.setTextColor(getResources().getColor(R.color.status_not_available));
                        }

                        // Add TextViews to the row
                        row.addView(bloodTypeTextView);
                        row.addView(statusTextView);

                        // Add the row to the table layout
                        bloodTableLayout.addView(row);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e("FirebaseError", databaseError.getMessage());
            }
        });*/
    }
}