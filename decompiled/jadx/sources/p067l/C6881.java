package p067l;

import bin.p000mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.ۙܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F75A */
/* JADX INFO: loaded from: classes2.dex */
public final class C6881 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public long f17890;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f17891;

    public C6881(long j, boolean z) {
        if (j == 0) {
            throw new C24315("Unable to open ELF search session");
        }
        this.f17890 = j;
        this.f17891 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6881 m15773(String str, boolean z) {
        return new C6881(Radare2Native.nativeOpenElfSearchSession(str, z), z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22975 m15776(int i, int i2, String str) {
        if (this.f17891) {
            throw new IllegalStateException("String-only search session cannot read ELF items");
        }
        C16938.m38519(str);
        m15774(i, i2);
        long j = this.f17890;
        if (j != 0) {
            C22975 c22975M51310 = C22975.m51310(C24614.m54252(Radare2Native.nativeReadElfSearchSessionItems(j, str, "", true, i, 1024, i2)));
            if (c22975M51310.f72261 <= c22975M51310.f72260) {
                return c22975M51310;
            }
            throw new IllegalArgumentException("offset must not exceed totalCount");
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14257 m15775(int i, int i2, long j) {
        if (!this.f17891) {
            throw new IllegalStateException("Symbol search session cannot read ELF strings");
        }
        m15774(i, i2);
        if (j < -1) {
            throw new IllegalArgumentException("scanOffset must be -1 or non-negative");
        }
        long j2 = this.f17890;
        if (j2 != 0) {
            C14257 c14257M32765 = C14257.m32765(C24614.m54252(Radare2Native.nativeReadElfSearchSessionStrings(j2, i, 1024, i2, j)));
            if (c14257M32765.f40601 > c14257M32765.f40600 || c14257M32765.f40599 < 0) {
                throw new IllegalArgumentException("Invalid ELF string search page");
            }
            return c14257M32765;
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15774(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be non-negative");
        }
        if (i2 < -1) {
            throw new IllegalArgumentException("knownTotalCount must be -1 or non-negative");
        }
        if (i2 >= 0 && i > i2) {
            throw new IllegalArgumentException("offset must not exceed knownTotalCount");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.f17890;
        if (j == 0) {
            return;
        }
        this.f17890 = 0L;
        Radare2Native.nativeCloseElfSearchSession(j);
    }
}
