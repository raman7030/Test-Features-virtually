package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֫ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3947 {

    /* JADX INFO: renamed from: ۙ */
    public int f8585;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f8586;

    /* JADX INFO: renamed from: ᩸ */
    public int f8587;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC3947 f8588;

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo3868(C4697 c4697);

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo3869(C4697 c4697) {
        return !(this instanceof C16647);
    }

    public AbstractC3947(int i, int i2) {
        this.f8585 = i;
        this.f8587 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC3947 mo7833(AbstractC3947 abstractC3947) {
        this.f8588 = abstractC3947;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7834() {
        this.f8586 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7835(C4697 c4697) {
        if (this.f8586 && c4697.m9967().m41266()) {
            return false;
        }
        return mo3869(c4697);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m7838(C4697 c4697) {
        AbstractC3947 abstractC3947 = this.f8588;
        if (abstractC3947 == null) {
            return false;
        }
        if (abstractC3947.f8586 && c4697.m9967().m41266()) {
            return false;
        }
        return this.f8588.mo3869(c4697);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m7839() {
        return this.f8586;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m7840() {
        return this.f8585;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m7837() {
        return this.f8587;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7836(C4697 c4697, boolean z) {
        if (z) {
            if (!m7838(c4697)) {
                return false;
            }
            this.f8588.mo3868(c4697);
            return true;
        }
        if (!m7835(c4697)) {
            return false;
        }
        mo3868(c4697);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final DialogInterfaceC2564 m7832(final C4697 c4697, int i, CharSequence charSequence) {
        C20671 c20671BuildDialog = c4697.m9965().buildDialog();
        c20671BuildDialog.m46727(i);
        c20671BuildDialog.m46718(charSequence);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟᩻ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f27026.mo4692(c4697);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        return c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo4692(C4697 c4697) {
        throw new RuntimeException("Please override method onQueryOK()");
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m7831(C4697 c4697) {
        int iM9966 = c4697.m9966();
        if (iM9966 == 1) {
            return C7050.m16203(R.string.MT_Protector, C7050.m16224(R.string.MT_Protector).toLowerCase(), c4697.m9961().mo39151());
        }
        return C7050.m16203(R.string.MT_Protector, C7050.m16224(R.string.MT_Protector).toLowerCase(), Integer.valueOf(iM9966));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m7830(C4697 c4697, int i) {
        int iM9966 = c4697.m9966();
        if (iM9966 == 1) {
            return C7050.m16203(R.string.MT_Protector, C7050.m16224(i).toLowerCase(), c4697.m9961().mo39151(), c4697.m9967().m41285());
        }
        return C7050.m16203(R.string.MT_Protector, C7050.m16224(i).toLowerCase(), Integer.valueOf(iM9966), c4697.m9967().m41285());
    }
}
