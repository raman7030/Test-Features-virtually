package p067l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21457 {

    /* JADX INFO: renamed from: ۜ */
    public static final BitSet f67666;

    /* JADX INFO: renamed from: ۡ */
    public static final BitSet f67667;

    /* JADX INFO: renamed from: ۢ */
    public static final BitSet f67668;

    /* JADX INFO: renamed from: ܳ */
    public static final BitSet f67669;

    /* JADX INFO: renamed from: ᩷ */
    public static final BitSet f67670;

    /* JADX INFO: renamed from: ᩻ */
    public static final BitSet f67671;

    /* JADX INFO: renamed from: ֫ */
    public final C16525 f67672;

    /* JADX INFO: renamed from: ۧ */
    public final C8200 f67673;

    /* JADX INFO: renamed from: ܽ */
    public C23468 f67674;

    /* JADX INFO: renamed from: ܿ */
    public final C22004 f67675;

    /* JADX INFO: renamed from: ᩳ */
    public final C21378 f67676;

    public C21457(C21378 c21378, C16525 c16525, C8200 c8200, C22004 c22004) {
        this.f67676 = c21378;
        this.f67672 = c16525;
        this.f67673 = c8200;
        this.f67675 = c22004;
    }

    static {
        BitSet bitSet = new BitSet();
        f67669 = bitSet;
        BitSet bitSet2 = new BitSet();
        f67671 = bitSet2;
        BitSet bitSet3 = new BitSet();
        f67666 = bitSet3;
        BitSet bitSet4 = new BitSet();
        f67668 = bitSet4;
        BitSet bitSet5 = new BitSet();
        f67667 = bitSet5;
        BitSet bitSet6 = new BitSet();
        f67670 = bitSet6;
        bitSet.set(7);
        bitSet2.set(3, 9);
        bitSet3.set(19);
        bitSet4.set(20);
        bitSet5.set(1);
        bitSet6.set(12);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m48596(int i) {
        return (C15828) this.f67674.m52195(f67669, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m48595(int i, InterfaceC14905 interfaceC14905) {
        return m48600(this.f67672.m37506(this.f67674.m52194(i)), interfaceC14905);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m48598(int i, InterfaceC14905 interfaceC14905) {
        return m48600(this.f67672.m37506(this.f67674.m52194(i)), interfaceC14905);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C2417 m48601(int i) {
        return (C2417) this.f67674.m52195(f67666, i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C9794 m48599(int i) {
        return (C9794) this.f67674.m52195(f67668, i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC12224 m48603(int i) {
        return (AbstractC12224) this.f67674.m52195(f67667, i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC6462 m48604(int i) {
        AbstractC12224 abstractC12224M48603 = m48603(i);
        C21378 c21378 = this.f67676;
        C12826.requireNonNull(c21378);
        byte[] bArrMo5096 = abstractC12224M48603.mo5096();
        int iMo5100 = abstractC12224M48603.mo5100();
        int iMo5098 = abstractC12224M48603.mo5098();
        c21378.f67416 = bArrMo5096;
        c21378.f67418 = iMo5100;
        c21378.f67406 = iMo5100 + iMo5098;
        return c21378.m48450();
    }

    /* JADX INFO: renamed from: ܿ */
    public final C16761 m48602(int i) {
        return (C16761) this.f67674.m52195(f67670, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m48597(int i) {
        return this.f67674.m52195(f67671, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m48600(int i, InterfaceC14905 interfaceC14905) {
        int iM52196 = this.f67674.m52196(i);
        int iM52194 = this.f67674.m52194(i);
        if (iM52196 == 1) {
            return interfaceC14905.mo25191(iM52194 + 2, this.f67674.f74734.m37506(iM52194), this.f67674.f74734.f48563);
        }
        throw this.f67676.m48431("unexpected.const.pool.tag.at", Integer.toString(iM52196), Integer.toString(iM52194 - 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m48592(C21457 c21457, C16525 c16525, int i, int i2) {
        C8200 c8200 = c21457.f67673;
        C22004 c22004 = c21457.f67675;
        C21378 c21378 = c21457.f67676;
        if (i == 1) {
            return c8200.f21738.mo17847(i2 + 2, c16525.m37506(i2), c16525.f48563);
        }
        if (i == 12) {
            return new C16761(c21457.m48603(c16525.m37506(i2)), c21457.m48604(c16525.m37506(i2 + 2)));
        }
        if (i == 19) {
            return c22004.m49585(c21457.m48603(c16525.m37506(i2)));
        }
        if (i != 20) {
            switch (i) {
                case 3:
                    return Integer.valueOf(c16525.m37505(i2));
                case 4:
                    c16525.getClass();
                    try {
                        return Float.valueOf(new DataInputStream(new ByteArrayInputStream(c16525.f48563, i2, 4)).readFloat());
                    } catch (IOException e) {
                        throw new AssertionError(e);
                    }
                case 5:
                    c16525.getClass();
                    try {
                        return Long.valueOf(new DataInputStream(new ByteArrayInputStream(c16525.f48563, i2, 8)).readLong());
                    } catch (IOException e2) {
                        throw new AssertionError(e2);
                    }
                case 6:
                    c16525.getClass();
                    try {
                        return Double.valueOf(new DataInputStream(new ByteArrayInputStream(c16525.f48563, i2, 8)).readDouble());
                    } catch (IOException e3) {
                        throw new AssertionError(e3);
                    }
                case 7:
                    AbstractC12224 abstractC12224M48603 = c21457.m48603(c16525.m37506(i2));
                    return c22004.m49587(c21378.f67424, c8200.m18989(C19839.m45083(abstractC12224M48603.mo5100(), abstractC12224M48603.mo5098(), abstractC12224M48603.mo5096())));
                case 8:
                    return c21457.m48603(c16525.m37506(i2)).toString();
                default:
                    throw c21378.m48431("unexpected.const.pool.tag.at", Integer.toString(i), Integer.toString(i2 - 1));
            }
        }
        AbstractC12224 abstractC12224M48604 = c21457.m48603(c16525.m37506(i2));
        return c22004.m49593(c21378.f67424, c8200.m18989(C19839.m45083(abstractC12224M48604.mo5100(), abstractC12224M48604.mo5098(), abstractC12224M48604.mo5096())));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48594(C16525 c16525, int i) {
        int iM37506 = c16525.m37506(i);
        int iM37507 = i + 2;
        int[] iArr = new int[iM37506];
        int i2 = 1;
        while (i2 < iM37506) {
            int i3 = iM37507 + 1;
            byte b = c16525.f48563[iM37507];
            iArr[i2] = i3;
            switch (b) {
                case 1:
                    iM37507 = c16525.m37506(i3) + 2 + i3;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw this.f67676.m48431("bad.const.pool.tag.at", Byte.toString(b), Integer.toString(iM37507));
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 17:
                case 18:
                    iM37507 += 5;
                    break;
                case 5:
                case 6:
                    iM37507 += 9;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    iM37507 += 3;
                    break;
                case 15:
                    iM37507 += 4;
                    break;
            }
            i2 += (b == 5 || b == 6) ? 2 : 1;
        }
        this.f67674 = new C23468(this, c16525, iArr);
        return iM37507;
    }
}
