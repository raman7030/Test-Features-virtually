package l;

import bin.mt.radare2.Radare2Native;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O75M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16036 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6159 m37908(String str) {
        String strM37915 = m37915(str);
        C20586.m47136();
        return C6159.m17067(C23407.m51854(Radare2Native.nativeInspectElfSummary(strM37915)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4748 m37907(String str, boolean z) {
        String strM37915 = m37915(str);
        C20586.m47136();
        return C4748.m13893(strM37915, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21682 m37912(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        String strM37915 = m37915(str);
        C15330.m36361(str2);
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
        C20586.m47136();
        C21682 c21682M48961 = C21682.m48961(C23407.m51854(Radare2Native.nativeReadElfItems(strM37915, str2, str3, z, i, i2, i3)));
        if (c21682M48961.f69556 <= c21682M48961.f69555) {
            return c21682M48961;
        }
        throw new IllegalArgumentException("offset must not exceed totalCount");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15645 m37909(String str, String str2, int i, String str3, long j, boolean z, int i2, int i3, long j2, int i4, int i5, int i6, List list) {
        String strM37915 = m37915(str);
        String strM37914 = m37914(str2);
        C3863.m11620(str3);
        int iM7421 = C2241.m7421(list);
        C3863.m11619(iM7421, str3);
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
        C20586.m47136();
        return C15645.m36837(C23407.m51854(Radare2Native.nativeFindXrefs(strM37915, strM37914, i, str3, j, z, i2, i3, j2, i4, i5, i6, iM7421)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17057 m37910(String str, long j, boolean z, String str2, int i, int i2, int i3, int i4) {
        String strM37915 = m37915(str);
        String strM37914 = m37914(str2);
        m37913(i);
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
        C20586.m47136();
        return C17057.m40030(C23407.m51854(Radare2Native.nativeAnalyzeFunctionCfg(strM37915, j, z, strM37914, i, i2, i3, i4)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4043 m37906(String str, long j, boolean z, boolean z2) {
        String strM37915 = m37915(str);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        C20586.m47136();
        return C4043.m12141(C23407.m51854(Radare2Native.nativeMapAddress(strM37915, j, z, z2)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0514 m37905(String str, int i, long j, byte[] bArr, int i2) {
        String strM37914 = m37914(str);
        m37913(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxInstructions must be positive");
        }
        C20586.m47136();
        return C0514.m2225(C23407.m51854(Radare2Native.nativeDisassemble(strM37914, i, j, (byte[]) bArr.clone(), i2)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18860 m37911(String str, int i, long j, String str2) {
        String strM37914 = m37914(str);
        m37913(i);
        if (j < 0) {
            throw new IllegalArgumentException("address must be non-negative");
        }
        if (str2 == null) {
            throw new NullPointerException("source is null");
        }
        if (str2.trim().isEmpty()) {
            throw new IllegalArgumentException("source must not be empty");
        }
        C20586.m47136();
        return C18860.m43560(C23407.m51854(Radare2Native.nativeAssemble(strM37914, i, j, str2)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m37915(String str) {
        if (str == null) {
            throw new NullPointerException("path is null");
        }
        File file = new File(str);
        if (!file.isFile() || !file.canRead()) {
            throw new IllegalArgumentException("path must point to a readable file");
        }
        return file.getAbsolutePath();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m37914(String str) {
        if (str == null) {
            throw new NullPointerException("arch is null");
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            throw new IllegalArgumentException("arch must not be empty");
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37913(int i) {
        if (i != 16 && i != 32 && i != 64) {
            throw new IllegalArgumentException("bits must be 16, 32, or 64");
        }
    }
}
