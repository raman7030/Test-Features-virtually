package l;

import java.io.EOFException;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4G6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8484 implements Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C18683 f25925;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25926 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f25927;

    static {
        C18683 c18683 = new C18683();
        f25925 = c18683;
        c18683.add(1);
        c18683.add(7);
        c18683.add(8);
        c18683.add(9);
        c18683.add(10);
        c18683.add(12);
        c18683.add(13);
        c18683.add(14);
        c18683.add(15);
        c18683.add(20);
        c18683.add(21);
        c18683.add(22);
        c18683.add(23);
        c18683.add(24);
        c18683.add(25);
        c18683.add(32);
        c18683.add(33);
        c18683.add(34);
        c18683.add(35);
        c18683.add(101);
        c18683.add(IShizukuService.Stub.TRANSACTION_attachUserService);
        c18683.add(18064);
        c18683.add(1992);
        c18683.add(9733);
        c18683.add(9989);
        c18683.add(10245);
        c18683.add(13133);
        c18683.add(17217);
        c18683.add(17491);
        c18683.add(18180);
        c18683.add(18191);
        c18683.add(19270);
        c18683.add(19521);
        c18683.add(19785);
        c18683.add(20300);
        c18683.add(21334);
        c18683.add(21589);
        c18683.add(21838);
        c18683.add(22613);
        c18683.add(25461);
        c18683.add(25922);
        c18683.add(28789);
        c18683.add(30062);
        c18683.add(30805);
        c18683.add(41246);
        c18683.add(41504);
        c18683.add(64842);
        c18683.add(39169);
        c18683.add(39170);
        c18683.add(19796);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m22154(byte[] bArr) {
        int i = 0;
        while (bArr.length - i >= 4) {
            int iM37760 = C15972.m37760(i, bArr);
            int iM37761 = C15972.m37760(i + 2, bArr);
            if (!f25925.contains(iM37760) || i + 4 + iM37761 > bArr.length) {
                break;
            }
            i += iM37761 + 4;
        }
        return Arrays.copyOf(bArr, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m22153(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrM22155 = m22155(i, bArr);
        byte[] bArr3 = new byte[bArr2.length + 4 + bArrM22155.length];
        C15972.m37757(0, i, bArr3);
        C15972.m37757(2, bArr2.length, bArr3);
        System.arraycopy(bArr2, 0, bArr3, 4, bArr2.length);
        System.arraycopy(bArrM22155, 0, bArr3, bArr2.length + 4, bArrM22155.length);
        return bArr3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m22155(int i, byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM37760 = C15972.m37760(i2, bArr);
            int iM37761 = C15972.m37760(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM37761 > bArr.length - i3) {
                break;
            }
            if (iM37760 == i) {
                int i4 = iM37761 + 4;
                byte[] bArr2 = new byte[bArr.length - i4];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                System.arraycopy(bArr, i2 + i4, bArr2, i2, (bArr.length - i4) - i2);
                return bArr2;
            }
            i2 = i3 + iM37761;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8484 m22152(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i2 = 0;
        while (bArr.length - i2 >= 4) {
            int iM37760 = C15972.m37760(i2, bArr);
            int iM37761 = C15972.m37760(i2 + 2, bArr);
            int i3 = i2 + 4;
            if (iM37761 > bArr.length - i3) {
                return null;
            }
            if (iM37760 == i) {
                byte[] bArr2 = new byte[iM37761];
                System.arraycopy(bArr, i3, bArr2, 0, iM37761);
                C8484 c8484 = new C8484();
                c8484.f25927 = bArr2;
                return c8484;
            }
            i2 = i3 + iM37761;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m22157() {
        return this.f25927;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m22159() throws EOFException {
        byte[] bArr = this.f25927;
        boolean z = C2568.f8121;
        if (1 > bArr.length) {
            throw new EOFException();
        }
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22158() throws EOFException {
        byte[] bArr = this.f25927;
        boolean z = C2568.f8121;
        if (5 > bArr.length) {
            throw new EOFException();
        }
        return C15972.m37744(1, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22156(int i) throws EOFException {
        byte[] bArr = this.f25927;
        boolean z = C2568.f8121;
        if (i + 8 > bArr.length) {
            throw new EOFException();
        }
        return C15972.m37755(i, bArr);
    }

    public final Object clone() {
        return (C8484) super.clone();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final C8484 m22160clone() {
        return (C8484) super.clone();
    }
}
