package l;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩶ۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F7KC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20085 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final BitSet f65026;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final BitSet f65027;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final BitSet f65028;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final BitSet f65029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final BitSet f65030;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final BitSet f65031;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14896 f65032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6136 f65033;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22201 f65034;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20661 f65035;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20002 f65036;

    public C20085(C20002 c20002, C14896 c14896, C6136 c6136, C20661 c20661) {
        this.f65036 = c20002;
        this.f65032 = c14896;
        this.f65033 = c6136;
        this.f65035 = c20661;
    }

    static {
        BitSet bitSet = new BitSet();
        f65029 = bitSet;
        BitSet bitSet2 = new BitSet();
        f65031 = bitSet2;
        BitSet bitSet3 = new BitSet();
        f65026 = bitSet3;
        BitSet bitSet4 = new BitSet();
        f65028 = bitSet4;
        BitSet bitSet5 = new BitSet();
        f65027 = bitSet5;
        BitSet bitSet6 = new BitSet();
        f65030 = bitSet6;
        bitSet.set(7);
        bitSet2.set(3, 9);
        bitSet3.set(19);
        bitSet4.set(20);
        bitSet5.set(1);
        bitSet6.set(12);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m46280(int i) {
        return (C14163) this.f65034.m49868(f65029, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m46279(int i, InterfaceC13191 interfaceC13191) {
        return m46284(this.f65032.m35354(this.f65034.m49867(i)), interfaceC13191);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m46282(int i, InterfaceC13191 interfaceC13191) {
        return m46284(this.f65032.m35354(this.f65034.m49867(i)), interfaceC13191);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0052 m46285(int i) {
        return (C0052) this.f65034.m49868(f65026, i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7814 m46283(int i) {
        return (C7814) this.f65034.m49868(f65028, i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m46287(int i) {
        return (AbstractC10370) this.f65034.m49868(f65027, i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m46288(int i) {
        AbstractC10370 abstractC10370M46287 = m46287(i);
        C20002 c20002 = this.f65036;
        C11003.requireNonNull(c20002);
        byte[] bArrMo2757 = abstractC10370M46287.mo2757();
        int iMo2761 = abstractC10370M46287.mo2761();
        int iMo2759 = abstractC10370M46287.mo2759();
        c20002.f64774 = bArrMo2757;
        c20002.f64776 = iMo2761;
        c20002.f64764 = iMo2761 + iMo2759;
        return c20002.m46135();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15144 m46286(int i) {
        return (C15144) this.f65034.m49868(f65030, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m46281(int i) {
        return this.f65034.m49868(f65031, i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m46284(int i, InterfaceC13191 interfaceC13191) {
        int iM49869 = this.f65034.m49869(i);
        int iM49867 = this.f65034.m49867(i);
        if (iM49869 == 1) {
            return interfaceC13191.mo23247(iM49867 + 2, this.f65034.f72013.m35354(iM49867), this.f65034.f72013.f45448);
        }
        throw this.f65036.m46116("unexpected.const.pool.tag.at", Integer.toString(iM49869), Integer.toString(iM49867 - 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m46276(C20085 c20085, C14896 c14896, int i, int i2) {
        C6136 c6136 = c20085.f65033;
        C20661 c20661 = c20085.f65035;
        C20002 c20002 = c20085.f65036;
        if (i == 1) {
            return c6136.f18880.mo15926(i2 + 2, c14896.m35354(i2), c14896.f45448);
        }
        if (i == 12) {
            return new C15144(c20085.m46287(c14896.m35354(i2)), c20085.m46288(c14896.m35354(i2 + 2)));
        }
        if (i == 19) {
            return c20661.m47258(c20085.m46287(c14896.m35354(i2)));
        }
        if (i != 20) {
            switch (i) {
                case 3:
                    return Integer.valueOf(c14896.m35353(i2));
                case 4:
                    c14896.getClass();
                    try {
                        return Float.valueOf(new DataInputStream(new ByteArrayInputStream(c14896.f45448, i2, 4)).readFloat());
                    } catch (IOException e) {
                        throw new AssertionError(e);
                    }
                case 5:
                    c14896.getClass();
                    try {
                        return Long.valueOf(new DataInputStream(new ByteArrayInputStream(c14896.f45448, i2, 8)).readLong());
                    } catch (IOException e2) {
                        throw new AssertionError(e2);
                    }
                case 6:
                    c14896.getClass();
                    try {
                        return Double.valueOf(new DataInputStream(new ByteArrayInputStream(c14896.f45448, i2, 8)).readDouble());
                    } catch (IOException e3) {
                        throw new AssertionError(e3);
                    }
                case 7:
                    AbstractC10370 abstractC10370M46287 = c20085.m46287(c14896.m35354(i2));
                    return c20661.m47260(c20002.f64782, c6136.m17058(C18382.m42811(abstractC10370M46287.mo2761(), abstractC10370M46287.mo2759(), abstractC10370M46287.mo2757())));
                case 8:
                    return c20085.m46287(c14896.m35354(i2)).toString();
                default:
                    throw c20002.m46116("unexpected.const.pool.tag.at", Integer.toString(i), Integer.toString(i2 - 1));
            }
        }
        AbstractC10370 abstractC10370M46288 = c20085.m46287(c14896.m35354(i2));
        return c20661.m47266(c20002.f64782, c6136.m17058(C18382.m42811(abstractC10370M46288.mo2761(), abstractC10370M46288.mo2759(), abstractC10370M46288.mo2757())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46278(C14896 c14896, int i) {
        int iM35354 = c14896.m35354(i);
        int iM35355 = i + 2;
        int[] iArr = new int[iM35354];
        int i2 = 1;
        while (i2 < iM35354) {
            int i3 = iM35355 + 1;
            byte b = c14896.f45448[iM35355];
            iArr[i2] = i3;
            switch (b) {
                case 1:
                    iM35355 = c14896.m35354(i3) + 2 + i3;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw this.f65036.m46116("bad.const.pool.tag.at", Byte.toString(b), Integer.toString(iM35355));
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 17:
                case 18:
                    iM35355 += 5;
                    break;
                case 5:
                case 6:
                    iM35355 += 9;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    iM35355 += 3;
                    break;
                case 15:
                    iM35355 += 4;
                    break;
            }
            i2 += (b == 5 || b == 6) ? 2 : 1;
        }
        this.f65034 = new C22201(this, c14896, iArr);
        return iM35355;
    }
}
