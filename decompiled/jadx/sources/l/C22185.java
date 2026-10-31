package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes.dex */
public final class C22185 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f71974 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BitSet f71975;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f71976;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20069 f71977;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20069 f71978;

    public C22185(C20069 c20069, BitSet bitSet, boolean z) {
        this.f71978 = c20069;
        this.f71975 = bitSet;
        this.f71977 = new C20069(c20069.size());
        this.f71976 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49827(C22185 c22185, int i) {
        C21480 c21480M48646 = (C21480) c22185.f71978.m40978(i);
        BitSet bitSet = c22185.f71975;
        if (bitSet == null || !bitSet.get(i)) {
            c21480M48646 = c21480M48646.m48646(c22185.f71974);
            if (!c22185.f71976) {
                c22185.f71974 = c21480M48646.m48645() + c22185.f71974;
            }
        }
        c22185.f71976 = false;
        c22185.f71977.m40981(i, (Object) c21480M48646);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20069 m49826(C22185 c22185) {
        C20069 c20069 = c22185.f71977;
        if (c22185.f71978.m43735()) {
            c20069.mo20349();
        }
        return c20069;
    }
}
