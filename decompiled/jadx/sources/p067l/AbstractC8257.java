package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1MJ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8257 implements InterfaceC4154 {

    /* JADX INFO: renamed from: ֫ */
    public final int f21865;

    /* JADX INFO: renamed from: ۧ */
    public final int f21866;

    /* JADX INFO: renamed from: ᩻ */
    public abstract InterfaceC14962 mo13962();

    public AbstractC8257(int i, int i2) {
        this.f21865 = i;
        this.f21866 = i2;
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ܿ */
    public final int mo8424() {
        return this.f21865;
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8425() {
        return this.f21866;
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ֫ */
    public final C15632 mo8420() {
        return new C15632(this);
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ܳ */
    public final Iterator mo8422() {
        return new C14292(mo13962());
    }

    @Override // p067l.InterfaceC4154
    /* JADX INFO: renamed from: ܽ */
    public final Iterator mo8423() {
        return new C12281(mo13962(), this.f21865, this.f21866);
    }
}
