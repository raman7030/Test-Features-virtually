package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6196 implements InterfaceC1879 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19004;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f19005;

    /* JADX INFO: renamed from: ᩻ */
    public abstract InterfaceC13251 mo12042();

    public AbstractC6196(int i, int i2) {
        this.f19004 = i;
        this.f19005 = i2;
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ܿ */
    public final int mo6222() {
        return this.f19004;
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6223() {
        return this.f19005;
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ֫ */
    public final C13956 mo6218() {
        return new C13956(this);
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ܳ */
    public final Iterator mo6220() {
        return new C12546(mo12042());
    }

    @Override // l.InterfaceC1879
    /* JADX INFO: renamed from: ܽ */
    public final Iterator mo6221() {
        return new C10430(mo12042(), this.f19004, this.f19005);
    }
}
