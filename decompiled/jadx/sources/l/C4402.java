package l;

import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBA0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4402 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16395 f14088;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final BitSet f14089;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22041 f14090;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20630 f14091;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BitSet f14092;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f14093;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC19925 f14094;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f14095;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22041 m13126(C20630 c20630) {
        int iM47186 = c20630.m47186();
        C22041 c22041 = new C22041(iM47186);
        for (int i = 0; i < iM47186; i++) {
            C4402 c4402 = new C4402(c20630, i, c22041);
            C20630 c20631 = c4402.f14091;
            int i2 = c4402.f14093;
            for (AbstractC14278 abstractC14278 : c20631.m47199(i2)) {
                c4402.f14094 = EnumC19925.DONE;
                if (abstractC14278 instanceof C13532) {
                    Iterator it = ((C13532) abstractC14278).m32569(i2, c20631).iterator();
                    while (it.hasNext()) {
                        c4402.f14088 = (C16395) it.next();
                        c4402.f14094 = EnumC19925.LIVE_OUT_AT_BLOCK;
                        c4402.m13127();
                    }
                } else {
                    C16395 c16395M34044 = abstractC14278.m34044();
                    c4402.f14088 = c16395M34044;
                    int iIndexOf = c16395M34044.m38615().indexOf(abstractC14278);
                    c4402.f14095 = iIndexOf;
                    if (iIndexOf < 0) {
                        throw new RuntimeException("insn not found in it's own block");
                    }
                    c4402.f14094 = EnumC19925.LIVE_IN_AT_STATEMENT;
                    c4402.m13127();
                }
            }
            while (true) {
                BitSet bitSet = c4402.f14092;
                int iNextSetBit = bitSet.nextSetBit(0);
                if (iNextSetBit >= 0) {
                    c4402.f14088 = (C16395) c20631.m47190().get(iNextSetBit);
                    bitSet.clear(iNextSetBit);
                    c4402.f14094 = EnumC19925.LIVE_OUT_AT_BLOCK;
                    c4402.m13127();
                }
            }
        }
        Iterator it2 = c20630.m47190().iterator();
        while (it2.hasNext()) {
            List listM38613 = ((C16395) it2.next()).m38613();
            int size = listM38613.size();
            for (int i3 = 0; i3 < size; i3++) {
                for (int i4 = 0; i4 < size; i4++) {
                    if (i3 != i4) {
                        AbstractC14278 abstractC14279 = (AbstractC14278) listM38613.get(i3);
                        AbstractC14278 abstractC142710 = (AbstractC14278) listM38613.get(i4);
                        C21480 c21480M34042 = abstractC14279.m34042();
                        C20069 c20069Mo29535 = abstractC142710.mo29535();
                        int iM48652 = c21480M34042.m48652();
                        for (int i5 = 0; i5 < c20069Mo29535.size(); i5++) {
                            c22041.m49588(iM48652, c20069Mo29535.m41004get(i5).m48652());
                        }
                        C21480 c21480M34043 = abstractC142710.m34042();
                        C20069 c20069Mo29536 = abstractC14279.mo29535();
                        int iM48653 = c21480M34043.m48652();
                        for (int i6 = 0; i6 < c20069Mo29536.size(); i6++) {
                            c22041.m49588(iM48653, c20069Mo29536.m41004get(i6).m48652());
                        }
                        c22041.m49588(abstractC14279.m34042().m48652(), abstractC142710.m34042().m48652());
                    }
                }
            }
        }
        return c22041;
    }

    public C4402(C20630 c20630, int i, C22041 c22041) {
        int size = c20630.m47190().size();
        this.f14091 = c20630;
        this.f14093 = i;
        this.f14089 = new BitSet(size);
        this.f14092 = new BitSet(size);
        this.f14090 = c22041;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13127() {
        while (true) {
            EnumC19925 enumC19925 = this.f14094;
            EnumC19925 enumC19926 = EnumC19925.DONE;
            if (enumC19925 == enumC19926) {
                return;
            }
            int iOrdinal = enumC19925.ordinal();
            int i = this.f14093;
            if (iOrdinal == 0) {
                this.f14094 = enumC19926;
                int i2 = this.f14095;
                if (i2 == 0) {
                    this.f14088.m38595(i);
                    this.f14092.or(this.f14088.m38624());
                } else {
                    this.f14095 = i2 - 1;
                    this.f14094 = EnumC19925.LIVE_OUT_AT_STATEMENT;
                }
            } else if (iOrdinal == 1) {
                this.f14094 = enumC19926;
                AbstractC14278 abstractC14278 = (AbstractC14278) this.f14088.m38615().get(this.f14095);
                C21480 c21480M34042 = abstractC14278.m34042();
                if (!abstractC14278.m34043(i)) {
                    if (c21480M34042 != null) {
                        this.f14090.m49588(i, c21480M34042.m48652());
                    }
                    this.f14094 = EnumC19925.LIVE_IN_AT_STATEMENT;
                }
            } else if (iOrdinal == 2) {
                this.f14094 = enumC19926;
                int iM38609 = this.f14088.m38609();
                BitSet bitSet = this.f14089;
                if (!bitSet.get(iM38609)) {
                    bitSet.set(this.f14088.m38609());
                    this.f14088.m38610(i);
                    this.f14095 = this.f14088.m38615().size() - 1;
                    this.f14094 = EnumC19925.LIVE_OUT_AT_STATEMENT;
                }
            }
        }
    }
}
