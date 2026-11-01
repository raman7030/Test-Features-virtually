package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7245 {

    /* JADX INFO: renamed from: ۡ */
    public static final C7245 f18895 = new C7245(EnumC2550.COMPLETE, EnumC20657.NONE, null, "", 0, 0, 0, new byte[32], 1, false);

    /* JADX INFO: renamed from: ֫ */
    public final int f18896;

    /* JADX INFO: renamed from: ۜ */
    public final long f18897;

    /* JADX INFO: renamed from: ۢ */
    public final EnumC2550 f18898;

    /* JADX INFO: renamed from: ۧ */
    public final long f18899;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f18900;

    /* JADX INFO: renamed from: ܽ */
    public final String f18901;

    /* JADX INFO: renamed from: ܿ */
    public final int f18902;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC20657 f18903;

    /* JADX INFO: renamed from: ᩷ */
    public final C8820 f18904;

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] f18905;

    public C7245(EnumC2550 enumC2550, EnumC20657 enumC20657, C8820 c8820, String str, int i, long j, long j2, byte[] bArr, int i2, boolean z) {
        EnumC2550 enumC2551;
        C12826.requireNonNull(enumC2550);
        this.f18898 = enumC2550;
        C12826.requireNonNull(enumC20657);
        this.f18903 = enumC20657;
        C12826.requireNonNull(str);
        this.f18901 = str;
        if (j < 0 || j2 < 0 || bArr.length != 32 || i2 < 0 || i2 > 3 || str.length() > 80 || (enumC2550 == (enumC2551 = EnumC2550.COMPLETE) && (z || i2 == 0))) {
            throw new IllegalArgumentException("Invalid text load checkpoint");
        }
        if (c8820 == null) {
            if (enumC2550 != enumC2551 || enumC20657 != EnumC20657.NONE || !str.isEmpty() || i != 0 || j != 0 || j2 != 0 || i2 != 1 || !Arrays.equals(bArr, new byte[32])) {
                throw new IllegalArgumentException("Invalid empty load state");
            }
        } else if (str.isEmpty() || i < 1 || i > 32768 || (enumC2550 != enumC2551 && j % ((long) i) != 0)) {
            throw new IllegalArgumentException("Invalid text load source checkpoint");
        }
        boolean z2 = enumC2550 == EnumC2550.FAILED || enumC2550 == EnumC2550.LIMIT_EXCEEDED;
        boolean z3 = enumC20657 == EnumC20657.CACHE_LIMIT || enumC20657 == EnumC20657.COORDINATE_LIMIT;
        if (z2 == (enumC20657 != EnumC20657.NONE)) {
            if (z3 == (enumC2550 == EnumC2550.LIMIT_EXCEEDED)) {
                if (j == 0 && !Arrays.equals(bArr, new byte[32])) {
                    throw new IllegalArgumentException("Invalid empty text prefix hash");
                }
                this.f18904 = c8820;
                this.f18896 = i;
                this.f18897 = j;
                this.f18899 = j2;
                this.f18905 = (byte[]) bArr.clone();
                this.f18902 = i2;
                this.f18900 = z;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid text load failure state");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7245 m16591(EnumC2550 enumC2550, EnumC20657 enumC20657) {
        return new C7245(enumC2550, enumC20657, this.f18904, this.f18901, this.f18896, this.f18897, this.f18899, this.f18905, this.f18902, this.f18900);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7245 m16590(int i, long j, byte[] bArr, int i2, boolean z, boolean z2) {
        EnumC2550 enumC2550 = z2 ? EnumC2550.COMPLETE : EnumC2550.LOADING;
        EnumC20657 enumC20657 = EnumC20657.NONE;
        long j2 = i;
        long j3 = this.f18897;
        long j4 = j3 + j2;
        if (((j3 ^ j4) >= 0) || (((j2 ^ j3) > 0 ? 1 : ((j2 ^ j3) == 0 ? 0 : -1)) < 0)) {
            return new C7245(enumC2550, enumC20657, this.f18904, this.f18901, this.f18896, j4, Math.max(this.f18899, j), bArr, i2, z);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܺ */
    public final EnumC2550 m16597() {
        return this.f18898;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC20657 m16600() {
        return this.f18903;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m16599() {
        return this.f18898 == EnumC2550.COMPLETE;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C8820 m16593() {
        return this.f18904;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m16598() {
        return this.f18901;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16589() {
        return this.f18896;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m16601() {
        return this.f18897;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m16595() {
        return this.f18899;
    }

    /* JADX INFO: renamed from: ۜ */
    public final byte[] m16592() {
        return (byte[]) this.f18905.clone();
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m16596() {
        return this.f18902;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m16594() {
        int i = this.f18902;
        if (i != 2) {
            return i != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m16602() {
        return this.f18900;
    }
}
