package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes3.dex */
public final class C14853 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f42347;

    /* JADX INFO: renamed from: ۧ */
    public boolean f42348;

    /* JADX INFO: renamed from: ܽ */
    public final DialogInterfaceC2564 f42349;

    /* JADX INFO: renamed from: ܿ */
    public final TextView f42350;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f42351;

    public C14853(AbstractActivityC5549 abstractActivityC5549) {
        this.f42347 = abstractActivityC5549;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        viewM12252.setKeepScreenOn(true);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f42350 = textView;
        textView.setText("...");
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        this.f42349 = c20671.m46709();
    }

    public C14853(AbstractActivityC5549 abstractActivityC5549, int i) {
        this.f42347 = abstractActivityC5549;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f42350 = textView;
        textView.setText(i);
        int i2 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        this.f42349 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33952(Runnable runnable) {
        this.f42348 = false;
        this.f42349.m3850(new DialogInterfaceOnKeyListenerC5466(this, runnable));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m33960() {
        return this.f42348;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m33958(int i) {
        this.f42351 = false;
        C7050.m16213(new RunnableC22901(0, this), i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33946(C14853 c14853) {
        if (c14853.f42351) {
            return;
        }
        AbstractActivityC5549 abstractActivityC5549 = c14853.f42347;
        if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
            return;
        }
        c14853.f42349.m3862();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m33956() {
        AbstractActivityC5549 abstractActivityC5549 = this.f42347;
        if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
            return;
        }
        this.f42349.m3862();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33949() {
        this.f42351 = true;
        if (this.f42349.m3855()) {
            this.f42349.dismiss();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33951(CharSequence charSequence) {
        this.f42350.setText(charSequence);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m33959() {
        this.f42350.setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33950(final int i) {
        this.f42347.runOnUiThread(new Runnable() { // from class: l.᩶۬ܿ
            @Override // java.lang.Runnable
            public final void run() {
                this.f67998.f42350.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33953(final String str) {
        this.f42347.runOnUiThread(new Runnable() { // from class: l.᩹۬ܿ
            @Override // java.lang.Runnable
            public final void run() {
                this.f75049.f42350.setText(str);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m33955(final int i) {
        this.f42347.runOnUiThread(new Runnable() { // from class: l.ۙ۬ܿ
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView = this.f17680.f42350;
                textView.setSingleLine(false);
                textView.setText(i);
            }
        });
    }

    /* JADX INFO: renamed from: ܽ */
    public final TextView m33957() {
        return this.f42350;
    }

    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC2564 m33954() {
        return this.f42349;
    }
}
