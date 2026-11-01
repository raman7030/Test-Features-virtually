package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۜܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes2.dex */
public final class C8930 {

    /* JADX INFO: renamed from: ֫ */
    public String f24190;

    /* JADX INFO: renamed from: ۧ */
    public BitSet f24191;

    /* JADX INFO: renamed from: ֫ */
    public final BitSet m20639(C19160 c19160) {
        String str;
        if (c19160.f57225 < 0) {
            return null;
        }
        String str2 = c19160.f57227;
        if (this.f24191 != null && (str2 == (str = this.f24190) || (str2 != null && str2.equals(str)))) {
            return this.f24191;
        }
        this.f24190 = str2;
        BitSet bitSet = new BitSet();
        this.f24191 = bitSet;
        return bitSet;
    }
}
