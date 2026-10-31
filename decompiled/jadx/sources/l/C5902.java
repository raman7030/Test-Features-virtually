package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f18113;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Spinner f18114;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f18115;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f18116;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f18117;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f18118;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20097 f18119;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f18120;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Spinner f18121;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18122;

    public C5902(Main main, AbstractC3163 abstractC3163, String str, String str2, boolean z, Runnable runnable) {
        this.f18118 = z;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        this.f18115 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f18114 = (Spinner) viewM10216.findViewById(R.id.spinner1);
        this.f18121 = (Spinner) viewM10216.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f18113 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f18116 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        new C10136(this, main, abstractC3163, viewM10216, runnable, str, str2).m20274();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m16560() {
        return this.f18114.getSelectedItemPosition() != this.f18117 || this.f18121.getSelectedItemPosition() != this.f18122 || m16558() || m16556();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m16558() {
        return this.f18118 && this.f18113.isChecked();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m16556() {
        return this.f18118 && this.f18116.isChecked();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m16557() {
        return ((C4574) this.f18119.m46344().get(this.f18114.getSelectedItemPosition())).m13433();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m16553() {
        return ((C4574) this.f18119.m46343().get(this.f18121.getSelectedItemPosition())).m13433();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m16559() {
        return ((C4574) this.f18119.m46344().get(this.f18114.getSelectedItemPosition())).m13432();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m16555() {
        return ((C4574) this.f18119.m46343().get(this.f18121.getSelectedItemPosition())).m13432();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m16548(C5902 c5902, String str) {
        List listM46344 = c5902.f18119.m46344();
        int size = listM46344.size();
        for (int i = 0; i < size; i++) {
            if (((C4574) listM46344.get(i)).m13432().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16543(C5902 c5902, String str) {
        List listM46343 = c5902.f18119.m46343();
        int size = listM46343.size();
        for (int i = 0; i < size; i++) {
            if (((C4574) listM46343.get(i)).m13432().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16554(String str) {
        this.f18115.setText(str);
    }
}
