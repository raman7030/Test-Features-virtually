package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AJ9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21954 implements InterfaceC22898 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f68998;

    /* JADX INFO: renamed from: ۙ */
    public boolean f68999;

    /* JADX INFO: renamed from: ۛ */
    public volatile boolean f69000;

    /* JADX INFO: renamed from: ۤ */
    public boolean f69001;

    /* JADX INFO: renamed from: ۫ */
    public boolean f69002;

    /* JADX INFO: renamed from: ۬ */
    public boolean f69003;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f69004 = false;

    /* JADX INFO: renamed from: ᩸ */
    public int f69005;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractActivityC5549 f69006;

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int mo15379(String str, C23568 c23568, C23568 c23569, boolean z, boolean z2) {
        return C6406.m14668(this, str, c23568, c23569, z, z2);
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15381(boolean z) {
        return !z && mo15385();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C21954(AbstractActivityC5549 abstractActivityC5549) {
        boolean z;
        if (C23219.m51754()) {
            z = C7050.f18355.getBoolean("def_mov_recycle_bin", true);
        }
        this.f69001 = z;
        this.f69005 = 0;
        this.f69006 = abstractActivityC5549;
        this.f69002 = false;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ܿ֫ */
    public final void mo15384() {
        this.f69002 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49481() {
        this.f68998 = true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m49483() {
        this.f69003 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49482(String str) {
        C23568 c23568 = C23568.f75044;
        mo15380(str, c23568, c23568, false);
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public final void mo15380(final String str, final C23568 c23568, final C23568 c23569, final boolean z) {
        C12799.m29348();
        this.f69000 = true;
        C7050.m16212(new Runnable() { // from class: l.ܳۗܳ
            @Override // java.lang.Runnable
            public final void run() {
                C21954.m49479(this.f46037, str, c23568, c23569, z);
            }
        });
        while (this.f69000) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49479(final C21954 c21954, String str, C23568 c23568, C23568 c23569, boolean z) {
        AbstractActivityC5549 abstractActivityC5549 = c21954.f69006;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(str);
        C6804.m15599(viewM12252, c23568, c23569);
        int i = 3;
        final RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3)};
        if (c21954.f69002) {
            radioButtonArr[0].setText(R.string.MT_Protector);
            radioButtonArr[2].setText(R.string.MT_Protector);
        }
        if (c21954.f69003) {
            radioButtonArr[2].setVisibility(8);
        }
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        if (c21954.f68998) {
            checkBox.setVisibility(8);
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        final CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        checkBox2.setChecked(c21954.f69001);
        final boolean z2 = z && C23219.m51754();
        if (z2) {
            checkBox2.setVisibility(c21954.f69005 == 0 ? 0 : 8);
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
            radioButtonArr[i2].setChecked(i2 == c21954.f69005);
            radioButtonArr[i2].setOnClickListener(onClickListener);
            i2++;
        }
        int i3 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۗܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C21954.m49480(this.f22928, radioButtonArr, checkBox, checkBox2);
            }
        });
        c20671.m46728(R.string.MT_Protector, new DialogInterfaceOnClickListenerC19782(i, c21954));
        c20671.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49480(C21954 c21954, RadioButton[] radioButtonArr, CheckBox checkBox, CheckBox checkBox2) {
        c21954.f69000 = false;
        if (radioButtonArr[0].isChecked()) {
            c21954.f69005 = 0;
        } else if (radioButtonArr[1].isChecked()) {
            c21954.f69005 = 1;
        } else {
            c21954.f69005 = 2;
        }
        c21954.f69004 = checkBox.isChecked();
        c21954.f69001 = checkBox2.isChecked();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49478(C21954 c21954) {
        c21954.f68999 = true;
        c21954.f69000 = false;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ᩵ */
    public final boolean mo15385() {
        return !this.f69004;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo15383() {
        return this.f69001;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ۬ */
    public final int mo15382() {
        return this.f69005;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f68999;
    }
}
