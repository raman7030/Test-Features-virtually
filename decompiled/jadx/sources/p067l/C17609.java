package p067l;

import bin.p000mt.radare2.Radare2Native;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O75M */
/* JADX INFO: loaded from: classes4.dex */
public final class C17609 {
    /* JADX INFO: renamed from: ֫ */
    public static C8222 m40095(String str) {
        String strM40102 = m40102(str);
        C21933.m49462();
        return C8222.m18999(C24614.m54252(Radare2Native.nativeInspectElfSummary(strM40102)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6881 m40094(String str, boolean z) {
        String strM40102 = m40102(str);
        C21933.m49462();
        return C6881.m15773(strM40102, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22975 m40099(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        String strM40102 = m40102(str);
        C16938.m38519(str2);
        if (str3 == null) {
            throw new NullPointerException("namePrefix is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset must be non-negative");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("limit must be positive");
        }
        if (i3 < -1) {
            throw new IllegalArgumentException("knownTotalCount must be -1 or non-negative");
        }
        if (i3 >= 0 && i > i3) {
            throw new IllegalArgumentException("offset must not exceed knownTotalCount");
        }
        C21933.m49462();
        C22975 c22975M51310 = C22975.m51310(C24614.m54252(Radare2Native.nativeReadElfItems(strM40102, str2, str3, z, i, i2, i3)));
        if (c22975M51310.f72261 <= c22975M51310.f72260) {
            return c22975M51310;
        }
        throw new IllegalArgumentException("offset must not exceed totalCount");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17237 m40096(String str, String str2, int i, String str3, long j, boolean z, int i2, int i3, long j2, int i4, int i5, int i6, List list) {
        String strM40102 = m40102(str);
        String strM40101 = m40101(str2);
        C6040.m13556(str3);
        int iM9503 = C4498.m9503(list);
        C6040.m13555(iM9503, str3);
        if (i <= 0) {
            throw new IllegalArgumentException("bits must be positive");
        }
        if (j < 0) {
            throw new IllegalArgumentException("targetVirtualAddress must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("phaseIndex must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("rangeIndex must be non-negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteOffsetInRange must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("relocationIndex must be non-negative");
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException("maxScanBytes must be positive");
        }
        if (i6 <= 0) {
            throw new IllegalArgumentException("limit must be positive");
        }
        C21933.m49462();
        return C17237.m39003(C24614.m54252(Radare2Native.nativeFindXrefs(strM40102, strM40101, i, str3, j, z, i2, i3, j2, i4, i5, i6, iM9503)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18579 m40097(String str, long j, boolean z, String str2, int i, int i2, int i3, int i4) {
        String strM40102 = m40102(str);
        String strM40101 = m40101(str2);
        m40100(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (i2 < 16 || i2 > 65536) {
            throw new IllegalArgumentException("maxAnalysisBytes must be in 16..65536");
        }
        if (i3 < 1 || i3 > 4096) {
            throw new IllegalArgumentException("maxBlocks must be in 1..4096");
        }
        if (i4 < 1 || i4 > 10000) {
            throw new IllegalArgumentException("maxInstructions must be in 1..10000");
        }
        C21933.m49462();
        return C18579.m42275(C24614.m54252(Radare2Native.nativeAnalyzeFunctionCfg(strM40102, j, z, strM40101, i, i2, i3, i4)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6211 m40093(String str, long j, boolean z, boolean z2) {
        String strM40102 = m40102(str);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        C21933.m49462();
        return C6211.m14062(C24614.m54252(Radare2Native.nativeMapAddress(strM40102, j, z, z2)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2857 m40092(String str, int i, long j, byte[] bArr, int i2) {
        String strM40101 = m40101(str);
        m40100(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxInstructions must be positive");
        }
        C21933.m49462();
        return C2857.m4592(C24614.m54252(Radare2Native.nativeDisassemble(strM40101, i, j, (byte[]) bArr.clone(), i2)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20293 m40098(String str, int i, long j, String str2) {
        String strM40101 = m40101(str);
        m40100(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (str2 == null) {
            throw new NullPointerException("source is null");
        }
        if (str2.trim().isEmpty()) {
            throw new IllegalArgumentException("source must not be empty");
        }
        C21933.m49462();
        return C20293.m45826(C24614.m54252(Radare2Native.nativeAssemble(strM40101, i, j, str2)));
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m40102(String str) {
        if (str == null) {
            throw new NullPointerException("path is null");
        }
        File file = new File(str);
        if (!file.isFile() || !file.canRead()) {
            throw new IllegalArgumentException("path must point to a readable file");
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m40101(String str) {
        if (str == null) {
            throw new NullPointerException("arch is null");
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            throw new IllegalArgumentException("arch must not be empty");
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40100(int i) {
        if (i != 16 && i != 32 && i != 64) {
            throw new IllegalArgumentException("bits must be 16, 32, or 64");
        }
    }
}
