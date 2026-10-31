package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X977 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC10571 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16560 f31722;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f31723;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CheckBox f31724;

    public DialogInterfaceOnClickListenerC10571(Main main, C16560 c16560) {
        RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector)};
        this.f31723 = radioButtonArr;
        this.f31722 = c16560;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        radioButtonArr[0].setOnClickListener(this);
        radioButtonArr[1].setOnClickListener(this);
        radioButtonArr[2].setOnClickListener(this);
        radioButtonArr[3].setOnClickListener(this);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f31724 = checkBox;
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        radioButtonArr[C7489.m20112(C19890.f64279)].setChecked(true);
        checkBox.setChecked(C7489.m20122(C19890.f64279));
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, this);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        while (i2 < 4 && !this.f31723[i2].isChecked()) {
            i2++;
        }
        if (this.f31724.isChecked()) {
            i2 += 4;
        }
        C19890.f64279 = i2;
        ApplicationC20075.f65008.edit().mo25852((byte) i2, "rbs").apply();
        this.f31722.m39049();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f31723;
        radioButtonArr[0].setChecked(false);
        radioButtonArr[1].setChecked(false);
        radioButtonArr[2].setChecked(false);
        radioButtonArr[3].setChecked(false);
        ((RadioButton) view).setChecked(true);
    }
}
