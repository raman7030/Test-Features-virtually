package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1NH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4825 implements InterfaceC14962 {

    /* JADX INFO: renamed from: ֫ */
    public final int f10967;

    /* JADX INFO: renamed from: ۧ */
    public final int f10968;

    /* JADX INFO: renamed from: ܳ */
    public final int f10969;

    /* JADX INFO: renamed from: ܽ */
    public final Iterator f10970;

    /* JADX INFO: renamed from: ܿ */
    public final int f10971;

    /* JADX INFO: renamed from: ᩳ */
    public C23600 f10972;

    public C4825(InterfaceC8848 interfaceC8848, int i, int i2, int i3, int i4) {
        this.f10970 = interfaceC8848.mo8422();
        this.f10971 = i;
        this.f10967 = i2;
        this.f10969 = i3;
        this.f10968 = i4;
        next();
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10226() {
        return this.f10972 != null;
    }

    @Override // p067l.InterfaceC14962
    public final void next() {
        int i;
        int i2;
        this.f10972 = null;
        while (true) {
            Iterator it = this.f10970;
            if (!it.hasNext()) {
                return;
            }
            C23600 c23600 = (C23600) it.next();
            int i3 = c23600.f75121;
            int i4 = c23600.f75124;
            int i5 = c23600.f75122;
            int i6 = this.f10971;
            if (i3 >= i6 && i5 >= (i = this.f10969)) {
                int i7 = c23600.f75123;
                int i8 = this.f10967;
                if (i7 > i8 || i4 > (i2 = this.f10968)) {
                    return;
                }
                C23600 c23601 = new C23600(Math.max(i6, i7) - i6, Math.min(i8, c23600.f75121) - i6, Math.max(i, i4) - i, Math.min(i2, i5) - i);
                if (!c23601.m52411()) {
                    this.f10972 = c23601;
                    return;
                }
            }
        }
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ᩳ */
    public final int mo10230() {
        return this.f10972.f75123;
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ܿ */
    public final int mo10229() {
        return this.f10972.f75124;
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ܽ */
    public final int mo10228() {
        return this.f10972.f75121;
    }

    @Override // p067l.InterfaceC14962
    /* JADX INFO: renamed from: ۧ */
    public final int mo10227() {
        return this.f10972.f75122;
    }
}
