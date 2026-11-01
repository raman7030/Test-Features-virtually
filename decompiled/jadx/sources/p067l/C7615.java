package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ۚᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BEU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7615 {

    /* JADX INFO: renamed from: ֫ */
    public final C13000 f19923;

    /* JADX INFO: renamed from: ۧ */
    public int f19924;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f19925;

    /* JADX INFO: renamed from: ᩳ */
    public final C12249 f19926;

    public C7615(C13000 c13000) {
        int iM29815 = c13000.m29815(8);
        this.f19923 = c13000;
        this.f19926 = new C12249(iM29815);
        this.f19925 = new int[iM29815];
        this.f19924 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17568() {
        m17567();
        return this.f19924;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12249 m17569() {
        m17567();
        return this.f19926;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17567() {
        int i;
        if (this.f19924 >= 0) {
            return;
        }
        int iM29815 = 10;
        int i2 = 1;
        while (true) {
            int[] iArr = this.f19925;
            if (i2 < iArr.length) {
                iArr[i2] = iM29815;
                C13000 c13000 = this.f19923;
                int iM29817 = c13000.m29817(iM29815);
                switch (iM29817) {
                    case 1:
                        iM29815 += c13000.m29815(iM29815 + 1) + 3;
                        break;
                    case 2:
                    case 13:
                    case 14:
                    case 17:
                    default:
                        throw new C24378("unknown tag byte: " + C16351.m37152(iM29817), null);
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 18:
                        iM29815 += 5;
                        break;
                    case 5:
                    case 6:
                        iM29815 += 9;
                        i = 2;
                        continue;
                        i2 += i;
                        break;
                    case 7:
                    case 8:
                    case 16:
                        iM29815 += 3;
                        break;
                    case 15:
                        try {
                            iM29815 += 4;
                        } catch (C24378 e) {
                            e.m23570("...while preparsing cst " + C16351.m37153(i2) + " at offset " + C16351.m37155(iM29815));
                            throw e;
                        }
                        break;
                }
                i = 1;
                i2 += i;
            } else {
                this.f19924 = iM29815;
                BitSet bitSet = new BitSet(iArr.length);
                for (int i3 = 1; i3 < iArr.length; i3++) {
                    if (iArr[i3] != 0 && this.f19926.m28254(i3) == null) {
                        m17566(bitSet, i3);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC15405 m17566(BitSet bitSet, int i) {
        AbstractC15405 abstractC15405M17565;
        AbstractC15405 abstractC15405M10335;
        AbstractC15405 abstractC15405M17566;
        int i2;
        C13000 c13000 = this.f19923;
        C12249 c12249 = this.f19926;
        AbstractC15405 abstractC15405M28254 = c12249.m28254(i);
        if (abstractC15405M28254 != null) {
            return abstractC15405M28254;
        }
        int i3 = this.f19925[i];
        try {
            int iM29817 = c13000.m29817(i3);
            switch (iM29817) {
                case 1:
                    abstractC15405M17565 = m17565(i3);
                    bitSet.set(i);
                    abstractC15405M10335 = abstractC15405M17565;
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 2:
                case 13:
                case 14:
                case 17:
                default:
                    throw new C24378("unknown tag byte: ".concat(C16351.m37152(iM29817)), null);
                case 3:
                    abstractC15405M10335 = C4873.m10335(c13000.m29814(i3 + 1));
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 4:
                    abstractC15405M10335 = C17612.m40103(c13000.m29814(i3 + 1));
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 5:
                    abstractC15405M10335 = C10237.m23848(c13000.m29816(i3 + 1));
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 6:
                    abstractC15405M10335 = C22308.m50120(c13000.m29816(i3 + 1));
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 7:
                    abstractC15405M17565 = new C14260(C9566.m22275(((C14930) m17566(bitSet, c13000.m29815(i3 + 1))).getString()));
                    abstractC15405M10335 = abstractC15405M17565;
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 8:
                    abstractC15405M10335 = m17566(bitSet, c13000.m29815(i3 + 1));
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 9:
                    abstractC15405M17565 = new C10908((C14260) m17566(bitSet, c13000.m29815(i3 + 1)), (C21637) m17566(bitSet, c13000.m29815(i3 + 3)));
                    abstractC15405M10335 = abstractC15405M17565;
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 10:
                    abstractC15405M17565 = new C23648((C14260) m17566(bitSet, c13000.m29815(i3 + 1)), (C21637) m17566(bitSet, c13000.m29815(i3 + 3)));
                    abstractC15405M10335 = abstractC15405M17565;
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 11:
                    abstractC15405M17565 = new C6214((C14260) m17566(bitSet, c13000.m29815(i3 + 1)), (C21637) m17566(bitSet, c13000.m29815(i3 + 3)));
                    abstractC15405M10335 = abstractC15405M17565;
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 12:
                    abstractC15405M17565 = new C21637((C14930) m17566(bitSet, c13000.m29815(i3 + 1)), (C14930) m17566(bitSet, c13000.m29815(i3 + 3)));
                    abstractC15405M10335 = abstractC15405M17565;
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 15:
                    int iM29818 = c13000.m29817(i3 + 1);
                    int iM29815 = c13000.m29815(i3 + 2);
                    switch (iM29818) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            abstractC15405M17566 = (C10908) m17566(bitSet, iM29815);
                            break;
                        case 5:
                        case 8:
                            abstractC15405M17566 = (C23648) m17566(bitSet, iM29815);
                            break;
                        case 6:
                        case 7:
                            abstractC15405M17566 = m17566(bitSet, iM29815);
                            if (!(abstractC15405M17566 instanceof C23648) && !(abstractC15405M17566 instanceof C6214)) {
                                throw new C24378("Unsupported ref constant type for MethodHandle " + abstractC15405M17566.getClass(), null);
                            }
                            break;
                        case 9:
                            abstractC15405M17566 = (C6214) m17566(bitSet, iM29815);
                            break;
                        default:
                            throw new C24378("Unsupported MethodHandle kind: " + iM29818, null);
                    }
                    switch (iM29818) {
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        case 4:
                            i2 = 0;
                            break;
                        case 5:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 4;
                            break;
                        case 7:
                            i2 = 7;
                            break;
                        case 8:
                            i2 = 6;
                            break;
                        case 9:
                            i2 = 8;
                            break;
                        default:
                            throw new IllegalArgumentException(C20778.m46922(iM29818, "invalid kind: "));
                    }
                    abstractC15405M10335 = C22978.m51312(i2, abstractC15405M17566);
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 16:
                    abstractC15405M17565 = new C6884(C24318.m53648(((C14930) m17566(bitSet, c13000.m29815(i3 + 1))).getString()));
                    abstractC15405M10335 = abstractC15405M17565;
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
                case 18:
                    abstractC15405M10335 = C20296.m45828(c13000.m29815(i3 + 1), (C21637) m17566(bitSet, c13000.m29815(i3 + 3)));
                    c12249.m28255(i, abstractC15405M10335);
                    return abstractC15405M10335;
            }
        } catch (C24378 e) {
            e.m23570("...while parsing cst " + C16351.m37153(i) + " at offset " + C16351.m37155(i3));
            throw e;
        } catch (RuntimeException e2) {
            C24378 c24378 = new C24378(null, e2);
            c24378.m23570("...while parsing cst " + C16351.m37153(i) + " at offset " + C16351.m37155(i3));
            throw c24378;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14930 m17565(int i) {
        C13000 c13000 = this.f19923;
        int iM29815 = c13000.m29815(i + 1);
        int i2 = i + 3;
        try {
            return new C14930(c13000.m29812(i2, iM29815 + i2));
        } catch (IllegalArgumentException e) {
            throw new C24378(null, e);
        }
    }
}
