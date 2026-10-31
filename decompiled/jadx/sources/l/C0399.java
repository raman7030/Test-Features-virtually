package l;

/* JADX INFO: renamed from: l.֡ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A8DI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0399 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC5339 f1851;

    public /* synthetic */ C0399(EnumC5339 enumC5339, int i) {
        this(enumC5339);
    }

    public C0399(EnumC5339 enumC5339) {
        this.f1851 = enumC5339;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0399 m1892(byte b) {
        int i = (b >>> 4) & 7;
        if ((b & 143) > 0) {
            throw new RuntimeException("Reserved fields must be 0");
        }
        return new C0399(EnumC5339.m15283(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m1893() {
        return 1 << ((this.f1851.m15285() * 2) + 8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m1894() {
        return (byte) ((this.f1851.m15285() & 7) << 4);
    }
}
