package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1NH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2585 implements InterfaceC13251 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f8175;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f8176;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f8177;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterator f8178;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f8179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22340 f8180;

    public C2585(InterfaceC6818 interfaceC6818, int i, int i2, int i3, int i4) {
        this.f8178 = interfaceC6818.mo6220();
        this.f8179 = i;
        this.f8175 = i2;
        this.f8177 = i3;
        this.f8176 = i4;
        next();
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8187() {
        return this.f8180 != null;
    }

    @Override // l.InterfaceC13251
    public final void next() {
        int i;
        int i2;
        this.f8180 = null;
        while (true) {
            Iterator it = this.f8178;
            if (!it.hasNext()) {
                return;
            }
            C22340 c22340 = (C22340) it.next();
            int i3 = c22340.f72395;
            int i4 = c22340.f72398;
            int i5 = c22340.f72396;
            int i6 = this.f8179;
            if (i3 >= i6 && i5 >= (i = this.f8177)) {
                int i7 = c22340.f72397;
                int i8 = this.f8175;
                if (i7 > i8 || i4 > (i2 = this.f8176)) {
                    return;
                }
                C22340 c22341 = new C22340(Math.max(i6, i7) - i6, Math.min(i8, c22340.f72395) - i6, Math.max(i, i4) - i, Math.min(i2, i5) - i);
                if (!c22341.m50072()) {
                    this.f8180 = c22341;
                    return;
                }
            }
        }
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo8191() {
        return this.f8180.f72397;
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo8190() {
        return this.f8180.f72398;
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo8189() {
        return this.f8180.f72395;
    }

    @Override // l.InterfaceC13251
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo8188() {
        return this.f8180.f72396;
    }
}
