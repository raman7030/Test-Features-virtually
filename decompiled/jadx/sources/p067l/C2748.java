package p067l;

/* JADX INFO: renamed from: l.֡ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2748 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC7443 f4628;

    public /* synthetic */ C2748(EnumC7443 enumC7443, int i) {
        this(enumC7443);
    }

    public C2748(EnumC7443 enumC7443) {
        this.f4628 = enumC7443;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2748 m4284(byte b) {
        int i = (b >>> 4) & 7;
        if ((b & 143) > 0) {
            throw new RuntimeException("Reserved fields must be 0");
        }
        return new C2748(EnumC7443.m17191(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4285() {
        return 1 << ((this.f4628.m17193() * 2) + 8);
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte m4286() {
        return (byte) ((this.f4628.m17193() & 7) << 4);
    }
}
