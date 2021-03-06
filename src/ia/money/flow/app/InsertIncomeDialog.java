package ia.money.flow.app;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

import ia.money.flow.app.gen.R;

public class InsertIncomeDialog extends DialogFragment {
   
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
	    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	    // Get the layout inflater
	    LayoutInflater inflater = getActivity().getLayoutInflater();

	    // Inflate and set the layout for the dialog
	    // Pass null as the parent view because its going in the dialog layout
	    builder.setView(inflater.inflate(R.layout.income_insert_layout_dialog, null))
	    // Add action buttons
	           .setPositiveButton(R.string.hello_world, new DialogInterface.OnClickListener() {
	               @Override
	               public void onClick(DialogInterface dialog, int id) {
	                   // sign in the user ...
	               }
	           })
	           .setNegativeButton(R.string.app_name, new DialogInterface.OnClickListener() {
	               public void onClick(DialogInterface dialog, int id) {
	                   //cancel
	               }
	           });      
	    return builder.create();
	}
	
}