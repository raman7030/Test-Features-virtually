package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۜܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes2.dex */
public final class C6904 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f21311;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public BitSet f21312;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet m18690(C17667 c17667) {
        String str;
        if (c17667.f54032 < 0) {
            return null;
        }
        String str2 = c17667.f54034;
        if (this.f21312 != null && (str2 == (str = this.f21311) || (str2 != null && str2.equals(str)))) {
            return this.f21312;
        }
        this.f21311 = str2;
        BitSet bitSet = new BitSet();
        this.f21312 = bitSet;
        return bitSet;
    }
}
