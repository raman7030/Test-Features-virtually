package p067l;

/* JADX INFO: renamed from: l.ܽۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65QR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18116 extends AbstractC9476 implements InterfaceC10094 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f54113 = EnumC5850.Format21ih;

    /* JADX INFO: renamed from: ۙ */
    public final int f54114;

    /* JADX INFO: renamed from: ᩶ */
    public final int f54115;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", " + mo7162();
    }

    public C18116(EnumC3167 enumC3167, int i, int i2) {
        super(enumC3167);
        C12981.m29763(i);
        this.f54114 = i;
        if ((65535 & i2) == 0) {
            this.f54115 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 16 bits must be zeroed out.", Integer.valueOf(i2)));
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f54114;
    }

    @Override // p067l.InterfaceC15202
    /* JADX INFO: renamed from: ۡ */
    public final int mo7161() {
        return this.f54115;
    }

    @Override // p067l.InterfaceC11436
    /* JADX INFO: renamed from: ᩸ */
    public final long mo7162() {
        return this.f54115;
    }

    @Override // p067l.InterfaceC7827
    /* JADX INFO: renamed from: ۗ */
    public final short mo7160() {
        return (short) (this.f54115 >>> 16);
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f54113;
    }
}
