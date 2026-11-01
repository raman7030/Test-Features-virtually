package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O515 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2475 {

    /* JADX INFO: renamed from: ֫ */
    public final CheckBox f3866;

    /* JADX INFO: renamed from: ۜ */
    public final Spinner f3867;

    /* JADX INFO: renamed from: ۢ */
    public final TextView f3868;

    /* JADX INFO: renamed from: ۧ */
    public final CheckBox f3869;

    /* JADX INFO: renamed from: ܳ */
    public final int f3870;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f3871;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f3872;

    /* JADX INFO: renamed from: ᩳ */
    public final DialogInterfaceC2564 f3873;

    /* JADX INFO: renamed from: ᩷ */
    public final Spinner f3874;

    /* JADX INFO: renamed from: ᩻ */
    public final int f3875;

    public C2475(final Main main, String str, String str2, boolean z, final Runnable runnable) {
        this.f3871 = z;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        this.f3868 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f3867 = (Spinner) viewM12252.findViewById(R.id.spinner1);
        this.f3874 = (Spinner) viewM12252.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f3866 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f3869 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        this.f3873 = c20671BuildDialog.m46709();
        ArrayList arrayListM52981 = C23904.m52981();
        this.f3872 = arrayListM52981;
        int size = arrayListM52981.size();
        String[] strArr = new String[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C13176 c13176 = (C13176) this.f3872.get(i2);
            strArr[i2] = c13176.f37027 + " - " + c13176.f37029;
        }
        C21438 c21438 = new C21438(main, strArr);
        this.f3867.setAdapter((SpinnerAdapter) c21438);
        this.f3874.setAdapter((SpinnerAdapter) c21438);
        this.f3867.setOnClickListener(new View.OnClickListener() { // from class: l.ܺ֫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2475.m3502(this.f51271, main);
            }
        });
        this.f3874.setOnClickListener(new View.OnClickListener() { // from class: l.ۖ֫᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2475.m3504(this.f10076, main);
            }
        });
        if (str == null) {
            Spinner spinner = this.f3867;
            this.f3870 = 0;
            spinner.setSelection(0);
        } else {
            Spinner spinner2 = this.f3867;
            ArrayList arrayList = this.f3872;
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = 0;
                    break;
                } else if (((C13176) arrayList.get(i3)).f37027.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            this.f3870 = i3;
            spinner2.setSelection(i3);
        }
        if (str2 == null) {
            Spinner spinner3 = this.f3874;
            this.f3875 = 0;
            spinner3.setSelection(0);
        } else {
            Spinner spinner4 = this.f3874;
            ArrayList arrayList2 = this.f3872;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                if (((C13176) arrayList2.get(i4)).f37027.equals(str2)) {
                    i = i4;
                    break;
                }
            }
            this.f3875 = i;
            spinner4.setSelection(i);
        }
        this.f3873.m3847(-1, C7050.m16224(R.string.MT_Protector), new DialogInterface.OnClickListener() { // from class: l.ۘ֫᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                runnable.run();
            }
        });
        this.f3873.m3847(-2, C7050.m16224(R.string.MT_Protector), null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m3502(C2475 c2475, AbstractActivityC5549 abstractActivityC5549) {
        C6911 c6911 = new C6911(abstractActivityC5549, c2475.f3872);
        c6911.m15842(R.string.MT_Protector);
        c6911.m15840(c2475.f3867.getSelectedItemPosition());
        c6911.m15841(new C20582(c2475));
        c6911.m15839();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m3504(final C2475 c2475, AbstractActivityC5549 abstractActivityC5549) {
        C6911 c6911 = new C6911(abstractActivityC5549, c2475.f3872);
        c6911.m15842(R.string.MT_Protector);
        c6911.m15840(c2475.f3874.getSelectedItemPosition());
        c6911.m15841(new InterfaceC21664() { // from class: l.ᩴ֫᩻
            @Override // p067l.InterfaceC21664
            /* JADX INFO: renamed from: ֫ */
            public final void mo45214(int i, C13176 c13176) {
                this.f60460.f3874.setSelection(i);
            }
        });
        c6911.m15839();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m3510() {
        return this.f3867.getSelectedItemPosition() != this.f3870 || this.f3874.getSelectedItemPosition() != this.f3875 || m3509() || m3511();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m3509() {
        return this.f3871 && this.f3866.isChecked();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m3511() {
        return this.f3871 && this.f3869.isChecked();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m3507() {
        return ((C13176) this.f3872.get(this.f3867.getSelectedItemPosition())).f37029;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m3505() {
        return ((C13176) this.f3872.get(this.f3874.getSelectedItemPosition())).f37029;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m3508() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f3873;
        dialogInterfaceC2564.m3862();
        C10884.m25071(dialogInterfaceC2564);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3506(String str) {
        this.f3868.setText(str);
    }
}
