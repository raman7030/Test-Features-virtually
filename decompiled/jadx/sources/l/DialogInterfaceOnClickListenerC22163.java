package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4TK */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC22163 implements DialogInterface.OnClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f71928;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RadioButton[] f71929;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16560 f71930;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f71931;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC3577 f71932;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f71933;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f71934;

    public DialogInterfaceOnClickListenerC22163(final Main main, C16560 c16560) {
        RadioButton[] radioButtonArr = new RadioButton[4];
        this.f71929 = radioButtonArr;
        this.f71930 = c16560;
        int i = C7489.f23073;
        this.f71934 = c16560.m39035("local") ? "local:" + c16560.m39020() : c16560.m39020();
        String strM20115 = C7489.m20115(c16560.m39044());
        this.f71933 = strM20115;
        boolean zM39035 = c16560.m39035("local");
        if (c16560.m39035(b.k)) {
            this.f71932 = ((C5259) c16560.m39044()).m15171();
        }
        boolean z = strM20115 != null || ((zM39035 || this.f71932 != null) && !c16560.m39038());
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        radioButtonArr[0] = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        radioButtonArr[1] = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        radioButtonArr[2] = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        radioButtonArr[3] = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(this);
        }
        this.f71931 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f71928 = checkBox;
        if (this.f71933 != null) {
            checkBox.setText(R.string.MT_Protector);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C4925.m14327(R.string.MT_Protector));
        sb.append(" - ");
        sb.append(C4925.m14327(c16560.m39064() ? R.string.MT_Protector : R.string.MT_Protector));
        textView.setText(sb.toString());
        RunnableC0996 runnableC0996 = new RunnableC0996(this, z, zM39035, c16560);
        AbstractC7379 lifecycle = main.getLifecycle();
        final C21458 c21458 = new C21458(runnableC0996);
        lifecycle.mo19833(c21458);
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, this);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        final C20765 c20765 = (C20765) lifecycle;
        c19258BuildDialog.m44420(new DialogInterface.OnDismissListener() { // from class: l.۠۠ܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c20765.mo19834(c21458);
            }
        });
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        if (c16560.m39035(b.k) && this.f71932 == null) {
            dialogInterfaceC0206M44438.m1448().setVisibility(8);
        } else {
            dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۠ܳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractActivityC3346 abstractActivityC3346 = main;
                    Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC4980.class);
                    AbstractC3577 abstractC3577 = this.f46201.f71932;
                    if (abstractC3577 != null) {
                        intent.putExtra("NetworkConfigId", abstractC3577.f11356);
                    }
                    abstractActivityC3346.startActivity(intent);
                }
            });
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = false;
        int i2 = 0;
        while (i2 < 4 && !this.f71929[i2].isChecked()) {
            i2++;
        }
        CheckBox checkBox = this.f71928;
        boolean zIsChecked = checkBox.isChecked();
        String str = this.f71933;
        AbstractC3577 abstractC3577 = this.f71932;
        C16560 c16560 = this.f71930;
        CheckBox checkBox2 = this.f71931;
        String str2 = this.f71934;
        if (!zIsChecked) {
            if (checkBox.getVisibility() == 0) {
                if (str != null) {
                    C7489.m20118(str);
                } else if (abstractC3577 != null) {
                    HashMap map = abstractC3577.f11355;
                    if (map.containsKey(str2)) {
                        map.remove(str2);
                        C12749.m31051();
                    }
                } else {
                    c16560.m38998("local");
                    HashMap map2 = C19890.f64282;
                    if (map2.containsKey(str2)) {
                        map2.remove(str2);
                        z = true;
                    }
                }
            }
            if (c16560.m39064()) {
                C19890.f64283 = i2;
                C19890.f64284 = checkBox2.isChecked();
            } else {
                C19890.f64285 = i2;
                C19890.f64281 = checkBox2.isChecked();
            }
        } else if (str != null) {
            C7489.m20117(i2, str, checkBox2.isChecked());
        } else if (abstractC3577 != null) {
            abstractC3577.f11355.put(str2, Integer.valueOf(C7489.m20113(i2, checkBox2.isChecked())));
            C12749.m31051();
        } else {
            c16560.m38998("local");
            C19890.f64282.put(str2, Integer.valueOf(C7489.m20113(i2, checkBox2.isChecked())));
            z = true;
        }
        boolean zM39064 = c16560.m39064();
        int i3 = C19890.f64283;
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        if (z) {
            interfaceC13049Edit.putString("sort_only_in_path_list", C19890.m45740(C19890.f64282));
        }
        if (zM39064) {
            interfaceC13049Edit.mo25853(C19890.f64283, "file_cmp_sort_left");
            interfaceC13049Edit.putBoolean("file_cmp_reverse_left", C19890.f64284);
        } else {
            interfaceC13049Edit.mo25853(C19890.f64285, "file_cmp_sort_right");
            interfaceC13049Edit.putBoolean("file_cmp_reverse_right", C19890.f64281);
        }
        interfaceC13049Edit.apply();
        c16560.m39049();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RadioButton[] radioButtonArr = this.f71929;
        int length = radioButtonArr.length;
        for (int i = 0; i < length; i++) {
            RadioButton radioButton = radioButtonArr[i];
            radioButton.setChecked(radioButton == view);
        }
    }
}
