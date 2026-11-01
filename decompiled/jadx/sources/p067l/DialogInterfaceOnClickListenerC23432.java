package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC23432 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final CheckBox f74650;

    /* JADX INFO: renamed from: ۙ */
    public final RadioButton[] f74651;

    /* JADX INFO: renamed from: ۫ */
    public final C18107 f74652;

    /* JADX INFO: renamed from: ۬ */
    public final CheckBox f74653;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC5769 f74654;

    /* JADX INFO: renamed from: ᩸ */
    public final String f74655;

    /* JADX INFO: renamed from: ᩹ */
    public final String f74656;

    public DialogInterfaceOnClickListenerC23432(final Main main, C18107 c18107) {
        RadioButton[] radioButtonArr = new RadioButton[4];
        this.f74651 = radioButtonArr;
        this.f74652 = c18107;
        int i = C9486.f25986;
        this.f74656 = c18107.m41261("local") ? "local:" + c18107.m41246() : c18107.m41246();
        String strM22091 = C9486.m22091(c18107.m41270());
        this.f74655 = strM22091;
        boolean zM41261 = c18107.m41261("local");
        if (c18107.m41261(C0168b.f616k)) {
            this.f74654 = ((C7367) c18107.m41270()).m17074();
        }
        boolean z = strM22091 != null || ((zM41261 || this.f74654 != null) && !c18107.m41264());
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        radioButtonArr[0] = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        radioButtonArr[1] = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        radioButtonArr[2] = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        radioButtonArr[3] = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(this);
        }
        this.f74653 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f74650 = checkBox;
        if (this.f74655 != null) {
            checkBox.setText(R.string.MT_Protector);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C7050.m16224(R.string.MT_Protector));
        sb.append(" - ");
        sb.append(C7050.m16224(c18107.m41290() ? R.string.MT_Protector : R.string.MT_Protector));
        textView.setText(sb.toString());
        RunnableC3315 runnableC3315 = new RunnableC3315(this, z, zM41261, c18107);
        AbstractC9381 lifecycle = main.getLifecycle();
        final C22762 c22762 = new C22762(runnableC3315);
        lifecycle.mo21806(c22762);
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, this);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final C22103 c22103 = (C22103) lifecycle;
        c20671BuildDialog.m46714(new DialogInterface.OnDismissListener() { // from class: l.۠۠ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c22103.mo21807(c22762);
            }
        });
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        if (c18107.m41261(C0168b.f616k) && this.f74654 == null) {
            dialogInterfaceC2564M46732.m3861().setVisibility(8);
        } else {
            dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۠ܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC5549 abstractActivityC5549 = main;
                    Intent intent = new Intent(abstractActivityC5549, (Class<?>) ActivityC7102.class);
                    AbstractC5769 abstractC5769 = this.f49321.f74654;
                    if (abstractC5769 != null) {
                        intent.putExtra("NetworkConfigId", abstractC5769.f14161);
                    }
                    abstractActivityC5549.startActivity(intent);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = false;
        int i2 = 0;
        while (i2 < 4 && !this.f74651[i2].isChecked()) {
            i2++;
        }
        CheckBox checkBox = this.f74650;
        boolean zIsChecked = checkBox.isChecked();
        String str = this.f74655;
        AbstractC5769 abstractC5769 = this.f74654;
        C18107 c18107 = this.f74652;
        CheckBox checkBox2 = this.f74653;
        String str2 = this.f74656;
        if (!zIsChecked) {
            if (checkBox.getVisibility() == 0) {
                if (str != null) {
                    C9486.m22094(str);
                } else if (abstractC5769 != null) {
                    HashMap map = abstractC5769.f14160;
                    if (map.containsKey(str2)) {
                        map.remove(str2);
                        C14486.m33135();
                    }
                } else {
                    c18107.m41224("local");
                    HashMap map2 = C21272.f66918;
                    if (map2.containsKey(str2)) {
                        map2.remove(str2);
                        z = true;
                    }
                }
            }
            if (c18107.m41290()) {
                C21272.f66919 = i2;
                C21272.f66920 = checkBox2.isChecked();
            } else {
                C21272.f66921 = i2;
                C21272.f66917 = checkBox2.isChecked();
            }
        } else if (str != null) {
            C9486.m22093(i2, str, checkBox2.isChecked());
        } else if (abstractC5769 != null) {
            abstractC5769.f14160.put(str2, Integer.valueOf(C9486.m22089(i2, checkBox2.isChecked())));
            C14486.m33135();
        } else {
            c18107.m41224("local");
            C21272.f66918.put(str2, Integer.valueOf(C9486.m22089(i2, checkBox2.isChecked())));
            z = true;
        }
        boolean zM41290 = c18107.m41290();
        int i3 = C21272.f66919;
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        if (z) {
            interfaceC14770Edit.putString("sort_only_in_path_list", C21272.m48051(C21272.f66918));
        }
        if (zM41290) {
            interfaceC14770Edit.mo27875(C21272.f66919, "file_cmp_sort_left");
            interfaceC14770Edit.putBoolean("file_cmp_reverse_left", C21272.f66920);
        } else {
            interfaceC14770Edit.mo27875(C21272.f66921, "file_cmp_sort_right");
            interfaceC14770Edit.putBoolean("file_cmp_reverse_right", C21272.f66917);
        }
        interfaceC14770Edit.apply();
        c18107.m41275();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f74651;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
    }
}
