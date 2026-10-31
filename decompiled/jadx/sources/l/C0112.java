package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O515 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0112 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f1090;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Spinner f1091;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f1092;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f1093;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f1094;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f1095;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1096;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f1097;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Spinner f1098;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f1099;

    public C0112(final Main main, String str, String str2, boolean z, final Runnable runnable) {
        this.f1095 = z;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        this.f1092 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f1091 = (Spinner) viewM10216.findViewById(R.id.spinner1);
        this.f1098 = (Spinner) viewM10216.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f1090 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f1093 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        this.f1097 = c19258BuildDialog.m44415();
        ArrayList arrayListM50655 = C22660.m50655();
        this.f1096 = arrayListM50655;
        int size = arrayListM50655.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C11372 c11372 = (C11372) this.f1096.get(i2);
            strArr[i2] = c11372.f34030 + " - " + c11372.f34032;
        }
        C20065 c20065 = new C20065(main, strArr);
        this.f1091.setAdapter((SpinnerAdapter) c20065);
        this.f1098.setAdapter((SpinnerAdapter) c20065);
        this.f1091.setOnClickListener(new View.OnClickListener() { // from class: l.ܺ֫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0112.m1101(this.f48131, main);
            }
        });
        this.f1098.setOnClickListener(new View.OnClickListener() { // from class: l.ۖ֫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0112.m1103(this.f7288, main);
            }
        });
        if (str == null) {
            Spinner spinner = this.f1091;
            this.f1094 = 0;
            spinner.setSelection(0);
        } else {
            Spinner spinner2 = this.f1091;
            ArrayList arrayList = this.f1096;
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = 0;
                    break;
                } else if (((C11372) arrayList.get(i3)).f34030.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            this.f1094 = i3;
            spinner2.setSelection(i3);
        }
        if (str2 == null) {
            Spinner spinner3 = this.f1098;
            this.f1099 = 0;
            spinner3.setSelection(0);
        } else {
            Spinner spinner4 = this.f1098;
            ArrayList arrayList2 = this.f1096;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                if (((C11372) arrayList2.get(i4)).f34030.equals(str2)) {
                    i = i4;
                    break;
                }
            }
            this.f1099 = i;
            spinner4.setSelection(i);
        }
        this.f1097.m1434(-1, C4925.m14327(R.string.MT_Protector), new DialogInterface.OnClickListener() { // from class: l.ۘ֫᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                runnable.run();
            }
        });
        this.f1097.m1434(-2, C4925.m14327(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1101(C0112 c0112, AbstractActivityC3346 abstractActivityC3346) {
        C4779 c4779 = new C4779(abstractActivityC3346, c0112.f1096);
        c4779.m13962(R.string.MT_Protector);
        c4779.m13960(c0112.f1091.getSelectedItemPosition());
        c4779.m13961(new C19164(c0112));
        c4779.m13959();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1103(final C0112 c0112, AbstractActivityC3346 abstractActivityC3346) {
        C4779 c4779 = new C4779(abstractActivityC3346, c0112.f1096);
        c4779.m13962(R.string.MT_Protector);
        c4779.m13960(c0112.f1098.getSelectedItemPosition());
        c4779.m13961(new InterfaceC20302() { // from class: l.ᩴ֫᩻
            @Override // l.InterfaceC20302
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo42938(int i, C11372 c11372) {
                this.f57240.f1098.setSelection(i);
            }
        });
        c4779.m13959();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m1109() {
        return this.f1091.getSelectedItemPosition() != this.f1094 || this.f1098.getSelectedItemPosition() != this.f1099 || m1108() || m1110();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m1108() {
        return this.f1095 && this.f1090.isChecked();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m1110() {
        return this.f1095 && this.f1093.isChecked();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m1106() {
        return ((C11372) this.f1096.get(this.f1091.getSelectedItemPosition())).f34032;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1104() {
        return ((C11372) this.f1096.get(this.f1098.getSelectedItemPosition())).f34032;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m1107() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f1097;
        dialogInterfaceC0206.m1449();
        C8960.m23097(dialogInterfaceC0206);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1105(String str) {
        this.f1092.setText(str);
    }
}
