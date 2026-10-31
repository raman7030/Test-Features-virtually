package l;

/* JADX INFO: renamed from: l.۟᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C7792 extends AbstractC23314 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10824 f24085;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f24086;

    public C7792(C10824 c10824) {
        byte[] bArr = new byte[1];
        this.f24086 = bArr;
        if (c10824.m27066() == 0) {
            bArr[0] = 0;
        } else {
            bArr[0] = (byte) (AbstractC2771.m8548(Math.max(c10824.m27067(), 4096) - 1) - 23);
        }
        this.f24085 = (C10824) c10824.clone();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m20822() {
        return this.f24086;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC6381 m20821(AbstractC6381 abstractC6381, C4265 c4265) {
        return this.f24085.m27063(abstractC6381, c4265);
    }
}
