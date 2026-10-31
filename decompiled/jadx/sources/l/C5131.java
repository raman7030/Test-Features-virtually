package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5131 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C5131 f16061 = new C5131(EnumC0191.COMPLETE, EnumC19243.NONE, null, "", 0, 0, 0, new byte[32], 1, false);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f16062;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f16063;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC0191 f16064;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f16065;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f16066;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f16067;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f16068;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC19243 f16069;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6788 f16070;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] f16071;

    public C5131(EnumC0191 enumC0191, EnumC19243 enumC19243, C6788 c6788, String str, int i, long j, long j2, byte[] bArr, int i2, boolean z) {
        EnumC0191 enumC0192;
        C11003.requireNonNull(enumC0191);
        this.f16064 = enumC0191;
        C11003.requireNonNull(enumC19243);
        this.f16069 = enumC19243;
        C11003.requireNonNull(str);
        this.f16067 = str;
        if (j < 0 || j2 < 0 || bArr.length != 32 || i2 < 0 || i2 > 3 || str.length() > 80 || (enumC0191 == (enumC0192 = EnumC0191.COMPLETE) && (z || i2 == 0))) {
            throw new IllegalArgumentException("Invalid text load checkpoint");
        }
        if (c6788 == null) {
            if (enumC0191 != enumC0192 || enumC19243 != EnumC19243.NONE || !str.isEmpty() || i != 0 || j != 0 || j2 != 0 || i2 != 1 || !Arrays.equals(bArr, new byte[32])) {
                throw new IllegalArgumentException("Invalid empty load state");
            }
        } else if (str.isEmpty() || i < 1 || i > 32768 || (enumC0191 != enumC0192 && j % ((long) i) != 0)) {
            throw new IllegalArgumentException("Invalid text load source checkpoint");
        }
        boolean z2 = enumC0191 == EnumC0191.FAILED || enumC0191 == EnumC0191.LIMIT_EXCEEDED;
        boolean z3 = enumC19243 == EnumC19243.CACHE_LIMIT || enumC19243 == EnumC19243.COORDINATE_LIMIT;
        if (z2 == (enumC19243 != EnumC19243.NONE)) {
            if (z3 == (enumC0191 == EnumC0191.LIMIT_EXCEEDED)) {
                if (j == 0 && !Arrays.equals(bArr, new byte[32])) {
                    throw new IllegalArgumentException("Invalid empty text prefix hash");
                }
                this.f16070 = c6788;
                this.f16062 = i;
                this.f16063 = j;
                this.f16065 = j2;
                this.f16071 = (byte[]) bArr.clone();
                this.f16068 = i2;
                this.f16066 = z;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid text load failure state");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5131 m14683(EnumC0191 enumC0191, EnumC19243 enumC19243) {
        return new C5131(enumC0191, enumC19243, this.f16070, this.f16067, this.f16062, this.f16063, this.f16065, this.f16071, this.f16068, this.f16066);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5131 m14682(int i, long j, byte[] bArr, int i2, boolean z, boolean z2) {
        EnumC0191 enumC0191 = z2 ? EnumC0191.COMPLETE : EnumC0191.LOADING;
        EnumC19243 enumC19243 = EnumC19243.NONE;
        long j2 = i;
        long j3 = this.f16063;
        long j4 = j3 + j2;
        if (((j3 ^ j4) >= 0) || (((j2 ^ j3) > 0 ? 1 : ((j2 ^ j3) == 0 ? 0 : -1)) < 0)) {
            return new C5131(enumC0191, enumC19243, this.f16070, this.f16067, this.f16062, j4, Math.max(this.f16065, j), bArr, i2, z);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC0191 m14689() {
        return this.f16064;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC19243 m14692() {
        return this.f16069;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m14691() {
        return this.f16064 == EnumC0191.COMPLETE;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C6788 m14685() {
        return this.f16070;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m14690() {
        return this.f16067;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14681() {
        return this.f16062;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m14693() {
        return this.f16063;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m14687() {
        return this.f16065;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m14684() {
        return (byte[]) this.f16071.clone();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m14688() {
        return this.f16068;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m14686() {
        int i = this.f16068;
        if (i != 2) {
            return i != 3 ? "\n" : "\r\n";
        }
        return "\r";
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m14694() {
        return this.f16066;
    }
}
