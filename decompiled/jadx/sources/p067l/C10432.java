package p067l;

import java.io.EOFException;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4G6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10432 implements Cloneable {

    /* JADX INFO: renamed from: ᩶ */
    public static final C20125 f28840;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f28841 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f28842;

    static {
        C20125 c20125 = new C20125();
        f28840 = c20125;
        c20125.add(1);
        c20125.add(7);
        c20125.add(8);
        c20125.add(9);
        c20125.add(10);
        c20125.add(12);
        c20125.add(13);
        c20125.add(14);
        c20125.add(15);
        c20125.add(20);
        c20125.add(21);
        c20125.add(22);
        c20125.add(23);
        c20125.add(24);
        c20125.add(25);
        c20125.add(32);
        c20125.add(33);
        c20125.add(34);
        c20125.add(35);
        c20125.add(101);
        c20125.add(IShizukuService.Stub.TRANSACTION_attachUserService);
        c20125.add(18064);
        c20125.add(1992);
        c20125.add(9733);
        c20125.add(9989);
        c20125.add(10245);
        c20125.add(13133);
        c20125.add(17217);
        c20125.add(17491);
        c20125.add(18180);
        c20125.add(18191);
        c20125.add(19270);
        c20125.add(19521);
        c20125.add(19785);
        c20125.add(20300);
        c20125.add(21334);
        c20125.add(21589);
        c20125.add(21838);
        c20125.add(22613);
        c20125.add(25461);
        c20125.add(25922);
        c20125.add(28789);
        c20125.add(30062);
        c20125.add(30805);
        c20125.add(41246);
        c20125.add(41504);
        c20125.add(64842);
        c20125.add(39169);
        c20125.add(39170);
        c20125.add(19796);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m24123(byte[] bArr) {
        int i = 0;
        while (bArr.length - i >= 4) {
            int iM39944 = C17548.m39944(i, bArr);
            int iM39945 = C17548.m39944(i + 2, bArr);
            if (!f28840.contains(iM39944) || i + 4 + iM39945 > bArr.length) {
                break;
            }
            i += iM39945 + 4;
        }
        return Arrays.copyOf(bArr, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m24122(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrM24124 = m24124(i, bArr);
        byte[] bArr3 = new byte[bArr2.length + 4 + bArrM24124.length];
        C17548.m39941(0, i, bArr3);
        C17548.m39941(2, bArr2.length, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 4, bArr2.length);
        System.arraycopy(bArrM24124, 0, bArr3, bArr2.length + 4, bArrM24124.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m24124(int i, byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM39944 = C17548.m39944(i2, bArr);
            int iM39945 = C17548.m39944(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM39945 > bArr.length - i3) {
                break;
            }
            if (iM39944 == i) {
                int i4 = iM39945 + 4;
                byte[] bArr2 = new byte[bArr.length - i4];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                System.arraycopy(bArr, i2 + i4, bArr2, i2, (bArr.length - i4) - i2);
                return bArr2;
            }
            i2 = i3 + iM39945;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10432 m24121(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM39944 = C17548.m39944(i2, bArr);
            int iM39945 = C17548.m39944(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM39945 > bArr.length - i3) {
                return null;
            }
            if (iM39944 == i) {
                byte[] bArr2 = new byte[iM39945];
                System.arraycopy(bArr, i3, bArr2, 0, iM39945);
                C10432 c10432 = new C10432();
                c10432.f28842 = bArr2;
                return c10432;
            }
            i2 = i3 + iM39945;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m24126() {
        return this.f28842;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m24128() throws EOFException {
        byte[] bArr = this.f28842;
        boolean z = C4809.f10911;
        if (1 > bArr.length) {
            throw new EOFException();
        }
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24127() throws EOFException {
        byte[] bArr = this.f28842;
        boolean z = C4809.f10911;
        if (5 > bArr.length) {
            throw new EOFException();
        }
        return C17548.m39928(1, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m24125(int i) throws EOFException {
        byte[] bArr = this.f28842;
        boolean z = C4809.f10911;
        if (i + 8 > bArr.length) {
            throw new EOFException();
        }
        return C17548.m39939(i, bArr);
    }

    public final Object clone() {
        return (C10432) super.clone();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final C10432 m56416clone() {
        return (C10432) super.clone();
    }
}
