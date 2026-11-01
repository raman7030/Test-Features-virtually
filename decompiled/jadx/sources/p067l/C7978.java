package p067l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C7978 {

    /* JADX INFO: renamed from: ֫ */
    public final CheckBox f20968;

    /* JADX INFO: renamed from: ۜ */
    public final Spinner f20969;

    /* JADX INFO: renamed from: ۢ */
    public final TextView f20970;

    /* JADX INFO: renamed from: ۧ */
    public final CheckBox f20971;

    /* JADX INFO: renamed from: ܳ */
    public int f20972;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f20973;

    /* JADX INFO: renamed from: ܿ */
    public C21469 f20974;

    /* JADX INFO: renamed from: ᩳ */
    public DialogInterfaceC2564 f20975;

    /* JADX INFO: renamed from: ᩷ */
    public final Spinner f20976;

    /* JADX INFO: renamed from: ᩻ */
    public int f20977;

    public C7978(Main main, AbstractC5375 abstractC5375, String str, String str2, boolean z, Runnable runnable) {
        this.f20973 = z;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        this.f20970 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f20969 = (Spinner) viewM12252.findViewById(R.id.spinner1);
        this.f20976 = (Spinner) viewM12252.findViewById(R.id.spinner2);
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f20968 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f20971 = checkBox2;
        if (!z) {
            checkBox.setVisibility(8);
            checkBox2.setVisibility(8);
        }
        new C12002(this, main, abstractC5375, viewM12252, runnable, str, str2).m22250();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m18486() {
        return this.f20969.getSelectedItemPosition() != this.f20972 || this.f20976.getSelectedItemPosition() != this.f20977 || m18484() || m18482();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m18484() {
        return this.f20973 && this.f20968.isChecked();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m18482() {
        return this.f20973 && this.f20971.isChecked();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m18483() {
        return ((C6716) this.f20974.m48660().get(this.f20969.getSelectedItemPosition())).m15321();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m18479() {
        return ((C6716) this.f20974.m48659().get(this.f20976.getSelectedItemPosition())).m15321();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m18485() {
        return ((C6716) this.f20974.m48660().get(this.f20969.getSelectedItemPosition())).m15320();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m18481() {
        return ((C6716) this.f20974.m48659().get(this.f20976.getSelectedItemPosition())).m15320();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m18474(C7978 c7978, String str) {
        List listM48660 = c7978.f20974.m48660();
        int size = listM48660.size();
        for (int i = 0; i < size; i++) {
            if (((C6716) listM48660.get(i)).m15320().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18469(C7978 c7978, String str) {
        List listM48659 = c7978.f20974.m48659();
        int size = listM48659.size();
        for (int i = 0; i < size; i++) {
            if (((C6716) listM48659.get(i)).m15320().equals(str)) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18480(String str) {
        this.f20970.setText(str);
    }
}
