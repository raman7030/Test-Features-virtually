package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4NY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1661 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f5805;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f5806;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5807;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC1661 f5808;

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo1455(C2450 c2450);

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo1456(C2450 c2450) {
        return !(this instanceof C15024);
    }

    public AbstractC1661(int i, int i2) {
        this.f5805 = i;
        this.f5807 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1661 mo5603(AbstractC1661 abstractC1661) {
        this.f5808 = abstractC1661;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5604() {
        this.f5806 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5605(C2450 c2450) {
        if (this.f5806 && c2450.m7919().m39040()) {
            return false;
        }
        return mo1456(c2450);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5608(C2450 c2450) {
        AbstractC1661 abstractC1661 = this.f5808;
        if (abstractC1661 == null) {
            return false;
        }
        if (abstractC1661.f5806 && c2450.m7919().m39040()) {
            return false;
        }
        return this.f5808.mo1456(c2450);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m5609() {
        return this.f5806;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m5610() {
        return this.f5805;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m5607() {
        return this.f5807;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5606(C2450 c2450, boolean z) {
        if (z) {
            if (!m5608(c2450)) {
                return false;
            }
            this.f5808.mo1455(c2450);
            return true;
        }
        if (!m5605(c2450)) {
            return false;
        }
        mo1455(c2450);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m5602(final C2450 c2450, int i, CharSequence charSequence) {
        C19258 c19258BuildDialog = c2450.m7917().buildDialog();
        c19258BuildDialog.m44433(i);
        c19258BuildDialog.m44424(charSequence);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.۟᩻ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f24109.mo2321(c2450);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        return c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo2321(C2450 c2450) {
        throw new RuntimeException("Please override method onQueryOK()");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m5601(C2450 c2450) {
        int iM7918 = c2450.m7918();
        if (iM7918 == 1) {
            return C4925.m14306(R.string.MT_Protector, C4925.m14327(R.string.MT_Protector).toLowerCase(), c2450.m7913().mo36985());
        }
        return C4925.m14306(R.string.MT_Protector, C4925.m14327(R.string.MT_Protector).toLowerCase(), Integer.valueOf(iM7918));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5600(C2450 c2450, int i) {
        int iM7918 = c2450.m7918();
        if (iM7918 == 1) {
            return C4925.m14306(R.string.MT_Protector, C4925.m14327(i).toLowerCase(), c2450.m7913().mo36985(), c2450.m7919().m39059());
        }
        return C4925.m14306(R.string.MT_Protector, C4925.m14327(i).toLowerCase(), Integer.valueOf(iM7918), c2450.m7919().m39059());
    }
}
