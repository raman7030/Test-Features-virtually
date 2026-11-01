package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X977 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC12416 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public final C18107 f34688;

    /* JADX INFO: renamed from: ᩸ */
    public final RadioButton[] f34689;

    /* JADX INFO: renamed from: ᩹ */
    public final CheckBox f34690;

    public DialogInterfaceOnClickListenerC12416(Main main, C18107 c18107) {
        RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector)};
        this.f34689 = radioButtonArr;
        this.f34688 = c18107;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        radioButtonArr[0].setOnClickListener(this);
        radioButtonArr[1].setOnClickListener(this);
        radioButtonArr[2].setOnClickListener(this);
        radioButtonArr[3].setOnClickListener(this);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f34690 = checkBox;
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        radioButtonArr[C9486.m22088(C21272.f66915)].setChecked(true);
        checkBox.setChecked(C9486.m22098(C21272.f66915));
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, this);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 0;
        while (i2 < 4 && !this.f34689[i2].isChecked()) {
            i2++;
        }
        if (this.f34690.isChecked()) {
            i2 += 4;
        }
        C21272.f66915 = i2;
        ApplicationC21448.f67649.edit().mo27874((byte) i2, "rbs").apply();
        this.f34688.m41275();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f34689;
        radioButtonArr[0].setChecked(false);
        radioButtonArr[1].setChecked(false);
        radioButtonArr[2].setChecked(false);
        radioButtonArr[3].setChecked(false);
        ((RadioButton) view).setChecked(true);
    }
}
