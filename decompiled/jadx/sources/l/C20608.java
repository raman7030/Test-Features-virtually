package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20608 implements InterfaceC21601 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f66318;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66319;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66320;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f66321;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f66322;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f66323;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f66324 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f66325;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f66326;

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int mo13490(String str, C22306 c22306, C22306 c22307, boolean z, boolean z2) {
        return C4248.m12788(this, str, c22306, c22307, z, z2);
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13492(boolean z) {
        return !z && mo13496();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C20608(AbstractActivityC3346 abstractActivityC3346) {
        boolean z;
        if (C21939.m49417()) {
            z = C4925.f15523.getBoolean("def_mov_recycle_bin", true);
        }
        this.f66321 = z;
        this.f66325 = 0;
        this.f66326 = abstractActivityC3346;
        this.f66322 = false;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ܿ֫ */
    public final void mo13495() {
        this.f66322 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47155() {
        this.f66318 = true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47157() {
        this.f66323 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47156(String str) {
        C22306 c22306 = C22306.f72317;
        mo13491(str, c22306, c22306, false);
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ֫ */
    public final void mo13491(final String str, final C22306 c22306, final C22306 c22307, final boolean z) {
        C10975.m27286();
        this.f66320 = true;
        C4925.m14315(new Runnable() { // from class: l.ܳۗܳ
            @Override // java.lang.Runnable
            public final void run() {
                C20608.m47153(this.f42945, str, c22306, c22307, z);
            }
        });
        while (this.f66320) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47153(final C20608 c20608, String str, C22306 c22306, C22306 c22307, boolean z) {
        AbstractActivityC3346 abstractActivityC3346 = c20608.f66326;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(str);
        C4667.m13724(viewM10216, c22306, c22307);
        int i = 3;
        final RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3)};
        if (c20608.f66322) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        if (c20608.f66323) {
            radioButtonArr[2].setVisibility(8);
        }
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        if (c20608.f66318) {
            checkBox.setVisibility(8);
            viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        final CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        checkBox2.setChecked(c20608.f66321);
        final boolean z2 = z && C21939.m49417();
        if (z2) {
            checkBox2.setVisibility(c20608.f66325 == 0 ? 0 : 8);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.᩻ۗܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    RadioButton radioButton = radioButtonArr2[i2];
                    radioButton.setChecked(radioButton == view);
                }
                if (z2) {
                    checkBox2.setVisibility(view.getId() != R.id.MT_Protector ? 8 : 0);
                }
            }
        };
        int i2 = 0;
        while (i2 < 3) {
            radioButtonArr[i2].setChecked(i2 == c20608.f66325);
            radioButtonArr[i2].setOnClickListener(onClickListener);
            i2++;
        }
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۗܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C20608.m47154(this.f20054, radioButtonArr, checkBox, checkBox2);
            }
        });
        c19258.m44434(R.string.MT_Protector, new DialogInterfaceOnClickListenerC18322(i, c20608));
        c19258.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47154(C20608 c20608, RadioButton[] radioButtonArr, CheckBox checkBox, CheckBox checkBox2) {
        c20608.f66320 = false;
        if (radioButtonArr[0].isChecked()) {
            c20608.f66325 = 0;
        } else if (radioButtonArr[1].isChecked()) {
            c20608.f66325 = 1;
        } else {
            c20608.f66325 = 2;
        }
        c20608.f66324 = checkBox.isChecked();
        c20608.f66321 = checkBox2.isChecked();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47152(C20608 c20608) {
        c20608.f66319 = true;
        c20608.f66320 = false;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo13496() {
        return !this.f66324;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo13494() {
        return this.f66321;
    }

    @Override // l.InterfaceC21601
    /* JADX INFO: renamed from: ۬ */
    public final int mo13493() {
        return this.f66325;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f66319;
    }
}
