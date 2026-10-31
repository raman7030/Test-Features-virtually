package l;

import bin.mt.radare2.Radare2Native;

/* JADX INFO: renamed from: l.ۙܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F75A */
/* JADX INFO: loaded from: classes2.dex */
public final class C4748 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f15059;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f15060;

    public C4748(long j, boolean z) {
        if (j == 0) {
            throw new C23092("Unable to open ELF search session");
        }
        this.f15059 = j;
        this.f15060 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4748 m13893(String str, boolean z) {
        return new C4748(Radare2Native.nativeOpenElfSearchSession(str, z), z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21682 m13896(int i, int i2, String str) {
        if (this.f15060) {
            throw new IllegalStateException("String-only search session cannot read ELF items");
        }
        C15330.m36361(str);
        m13894(i, i2);
        long j = this.f15059;
        if (j != 0) {
            C21682 c21682M48961 = C21682.m48961(C23407.m51854(Radare2Native.nativeReadElfSearchSessionItems(j, str, "", true, i, 1024, i2)));
            if (c21682M48961.f69556 <= c21682M48961.f69555) {
                return c21682M48961;
            }
            throw new IllegalArgumentException("offset must not exceed totalCount");
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12509 m13895(int i, int i2, long j) {
        if (!this.f15060) {
            throw new IllegalStateException("Symbol search session cannot read ELF strings");
        }
        m13894(i, i2);
        if (j < -1) {
            throw new IllegalArgumentException("scanOffset must be -1 or non-negative");
        }
        long j2 = this.f15059;
        if (j2 != 0) {
            C12509 c12509M30690 = C12509.m30690(C23407.m51854(Radare2Native.nativeReadElfSearchSessionStrings(j2, i, 1024, i2, j)));
            if (c12509M30690.f37577 > c12509M30690.f37576 || c12509M30690.f37575 < 0) {
                throw new IllegalArgumentException("Invalid ELF string search page");
            }
            return c12509M30690;
        }
        throw new IllegalStateException("ELF search session is closed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13894(int i, int i2) {
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
        long j = this.f15059;
        if (j == 0) {
            return;
        }
        this.f15059 = 0L;
        Radare2Native.nativeCloseElfSearchSession(j);
    }
}
