package p067l;

/* JADX INFO: renamed from: l.ۜܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P70I */
/* JADX INFO: loaded from: classes2.dex */
public final class C8915 {

    /* JADX INFO: renamed from: ֫ */
    public int f24159 = 1;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20315[] f24160;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m20607() {
        int i = this.f24159;
        if (i <= 0) {
            throw new IllegalStateException("HexRange root lease is closed");
        }
        if (i == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f24159 = i + 1;
    }

    public C8915(InterfaceC20315[] interfaceC20315Arr) {
        this.f24160 = interfaceC20315Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20606() {
        InterfaceC20315[] interfaceC20315Arr;
        synchronized (this) {
            int i = this.f24159;
            if (i <= 0) {
                throw new IllegalStateException("HexRange root lease closed twice");
            }
            int i2 = i - 1;
            this.f24159 = i2;
            interfaceC20315Arr = i2 == 0 ? this.f24160 : null;
        }
        if (interfaceC20315Arr != null) {
            C17631.m40151(interfaceC20315Arr);
        }
    }
}
