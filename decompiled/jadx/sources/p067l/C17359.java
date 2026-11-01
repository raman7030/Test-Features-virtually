package p067l;

import com.umeng.analytics.pro.C0708d;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes5.dex */
public final class C17359 extends AbstractC22369 {

    /* JADX INFO: renamed from: ۗ */
    public final int f51757;

    /* JADX INFO: renamed from: ۙ */
    public final short f51758;

    /* JADX INFO: renamed from: ۬ */
    public final C2607[] f51759;

    public C17359(C10655 c10655, int i, C7972 c7972) {
        super(c10655, i);
        int iM18463 = c7972.m18463();
        short sM18460 = c7972.m18460();
        this.f51758 = sM18460;
        int iM18461 = c7972.m18461();
        if (mo31470()) {
            this.f51759 = new C2607[]{new C2607(this, (byte) ((sM18460 >> 8) & 255), iM18461)};
        } else {
            if (mo31474()) {
                this.f70587 = c7972.m18461();
                int iMax = Math.max(c7972.m18461(), 0);
                this.f51759 = new C2607[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f51759[i2] = new C2607(this, i2, c7972.m18461(), c7972);
                }
            } else {
                this.f51759 = new C2607[]{new C2607(this, 0, -1, c7972)};
            }
            iM18463 = iM18461;
        }
        this.f51757 = iM18463;
    }

    @Override // p067l.InterfaceC22528
    public final InterfaceC3751 getValue() {
        return this.f51759[0];
    }

    @Override // p067l.InterfaceC22528
    public final InterfaceC3751 getValue(int i) {
        return this.f51759[i];
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܽ֫ */
    public final int mo31471() {
        return this.f51759.length;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo31474() {
        return (this.f51758 & 1) != 0;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo31467() {
        return (this.f51758 & 2) != 0;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo31473() {
        return (this.f51758 & 4) != 0;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo31470() {
        return (this.f51758 & 8) != 0;
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo31466() {
        return (C7302) super.mo31466();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۟֫ */
    public final String mo31468() {
        try {
            List listM45399 = ((C20043) super.mo31469()).m45399();
            return ((C5961) listM45399).f14751.m50188(this.f51757);
        } catch (IndexOutOfBoundsException unused) {
            return C0708d.f2599O;
        }
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo31469() {
        return (C20043) super.mo31469();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    public final InterfaceC3080 getType() {
        return (C20714) super.getType();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9116 mo31472() {
        return (C10655) super.mo31472();
    }
}
