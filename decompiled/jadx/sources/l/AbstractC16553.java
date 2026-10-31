package l;

import com.alipay.sdk.m.p.d;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ܽۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7XB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16553 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7381 f50859 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC2774 f50857 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f50856 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f50855 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f50858 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f50861 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f50860 = "";

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m38937(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo18944(C16261 c16261);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo18945();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m38943() {
        int i = this.f50861;
        if (i == 1) {
            return "DSA";
        }
        if (i == 0) {
            return d.a;
        }
        return i == 3 ? "EDDSA" : "ECDSA";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38941() {
        return this.f50860;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m38938(byte[] bArr) {
        int length = bArr.length;
        if (length < 2) {
            return bArr;
        }
        int i = bArr[0] & 255;
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            i2 |= (i >>> i3) & 1;
        }
        int i4 = i2 ^ 1;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            int i7 = bArr[i6];
            i4 &= ((i7 & 128) >>> 7) ^ 1;
            i5 += i4;
            int i8 = i7 & 127;
            for (int i9 = 0; i9 < 7; i9++) {
                i4 &= ((i8 >>> i9) & 1) ^ 1;
            }
        }
        int i10 = length - i5;
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, new byte[i5], 0, i5);
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        C19356.m44596(bArr);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38942(String str, byte[] bArr, byte[] bArr2, int i) throws C12651 {
        if (str.equals(OpenSSHPublicKeyUtil.RSA)) {
            this.f50861 = 0;
            this.f50860 = str;
            int i2 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216));
            int i3 = i + 3;
            int i4 = i2 | ((bArr[i + 2] << 8) & 65280);
            int i5 = i + 4;
            int i6 = i4 | (bArr[i3] & 255);
            byte[] bArr3 = new byte[i6];
            System.arraycopy(bArr, i5, bArr3, 0, i6);
            int i7 = i5 + i6;
            int i8 = ((bArr[i7 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i7] << 24)) | (65280 & (bArr[i7 + 2] << 8));
            int i9 = i8 | (bArr[i7 + 3] & 255);
            byte[] bArr4 = new byte[i9];
            System.arraycopy(bArr, i7 + 4, bArr4, 0, i9);
            byte[] bArrM38257 = new C16261(bArr2).m38257();
            byte[] bArr5 = C19356.f62660;
            try {
                InterfaceC6655 interfaceC6655 = (InterfaceC6655) Class.forName(this.f50859.m19856(new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8))).asSubclass(InterfaceC6655.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC6655.init();
                interfaceC6655.mo18181(bArr3, bArr4);
                interfaceC6655.update(this.f50855);
                boolean zVerify = interfaceC6655.verify(bArr2);
                this.f50859.f22696.m46777().getClass();
                return zVerify;
            } catch (Exception e) {
                throw new C12651(e.toString(), e);
            }
        }
        if (str.equals(OpenSSHPublicKeyUtil.DSS)) {
            this.f50861 = 1;
            this.f50860 = str;
            int i10 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216));
            int i11 = i + 3;
            int i12 = i10 | ((bArr[i + 2] << 8) & 65280);
            int i13 = i + 4;
            int i14 = i12 | (bArr[i11] & 255);
            byte[] bArr6 = new byte[i14];
            System.arraycopy(bArr, i13, bArr6, 0, i14);
            int i15 = i13 + i14;
            int i16 = ((bArr[i15 + 1] << 16) & 16711680) | ((bArr[i15] << 24) & (-16777216));
            int i17 = i15 + 3;
            int i18 = i16 | ((bArr[i15 + 2] << 8) & 65280);
            int i19 = i15 + 4;
            int i20 = i18 | (bArr[i17] & 255);
            byte[] bArr7 = new byte[i20];
            System.arraycopy(bArr, i19, bArr7, 0, i20);
            int i21 = i19 + i20;
            int i22 = ((bArr[i21 + 1] << 16) & 16711680) | ((bArr[i21] << 24) & (-16777216));
            int i23 = i21 + 3;
            int i24 = i22 | ((bArr[i21 + 2] << 8) & 65280);
            int i25 = i21 + 4;
            int i26 = i24 | (bArr[i23] & 255);
            byte[] bArr8 = new byte[i26];
            System.arraycopy(bArr, i25, bArr8, 0, i26);
            int i27 = i25 + i26;
            int i28 = ((bArr[i27 + 1] << 16) & 16711680) | ((-16777216) & (bArr[i27] << 24)) | (65280 & (bArr[i27 + 2] << 8));
            int i29 = i28 | (bArr[i27 + 3] & 255);
            byte[] bArr9 = new byte[i29];
            System.arraycopy(bArr, i27 + 4, bArr9, 0, i29);
            try {
                InterfaceC17238 interfaceC17238 = (InterfaceC17238) Class.forName(this.f50859.m19856("signature.dss")).asSubclass(InterfaceC17238.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC17238.init();
                interfaceC17238.mo13054(bArr9, bArr6, bArr7, bArr8);
                interfaceC17238.update(this.f50855);
                boolean zVerify2 = interfaceC17238.verify(bArr2);
                this.f50859.f22696.m46777().getClass();
                return zVerify2;
            } catch (Exception e2) {
                throw new C12651(e2.toString(), e2);
            }
        }
        if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
            if (!str.equals(OpenSSHPublicKeyUtil.ED_25519) && !str.equals("ssh-ed448")) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f50861 = 3;
            this.f50860 = str;
            int i30 = ((bArr[i + 1] << 16) & 16711680) | ((-16777216) & (bArr[i] << 24)) | (65280 & (bArr[i + 2] << 8));
            int i31 = i30 | (bArr[i + 3] & 255);
            byte[] bArr10 = new byte[i31];
            System.arraycopy(bArr, i + 4, bArr10, 0, i31);
            try {
                InterfaceC23588 interfaceC23588 = (InterfaceC23588) Class.forName(this.f50859.m19856(str)).asSubclass(InterfaceC23588.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC23588.init();
                interfaceC23588.mo27529(bArr10);
                interfaceC23588.update(this.f50855);
                boolean zVerify3 = interfaceC23588.verify(bArr2);
                this.f50859.f22696.m46777().getClass();
                return zVerify3;
            } catch (Exception | LinkageError e3) {
                throw new C12651(e3.toString(), e3);
            }
        }
        this.f50861 = 2;
        this.f50860 = str;
        int i32 = ((bArr[i + 1] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216));
        int i33 = i + 3;
        int i34 = i32 | ((bArr[i + 2] << 8) & 65280);
        int i35 = i + 4;
        int i36 = i34 | (bArr[i33] & 255);
        System.arraycopy(bArr, i35, new byte[i36], 0, i36);
        int i37 = i35 + i36;
        int i38 = (65280 & (bArr[i37 + 2] << 8)) | (16711680 & (bArr[i37 + 1] << 16)) | ((-16777216) & (bArr[i37] << 24)) | (bArr[i37 + 3] & 255);
        int i39 = i37 + 5;
        int i40 = (i38 - 1) / 2;
        byte[] bArr11 = new byte[i40];
        System.arraycopy(bArr, i39, bArr11, 0, i40);
        byte[] bArr12 = new byte[i40];
        System.arraycopy(bArr, i39 + i40, bArr12, 0, i40);
        try {
            InterfaceC14415 interfaceC14415 = (InterfaceC14415) Class.forName(this.f50859.m19856(str)).asSubclass(InterfaceC14415.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC14415.init();
            interfaceC14415.mo25163(bArr11, bArr12);
            interfaceC14415.update(this.f50855);
            boolean zVerify4 = interfaceC14415.verify(bArr2);
            this.f50859.f22696.m46777().getClass();
            return zVerify4;
        } catch (Exception e4) {
            throw new C12651(e4.toString(), e4);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m38939(byte[] bArr, boolean z) {
        int i = (bArr[0] & 128) >>> 7;
        int length = bArr.length + i;
        byte[] bArr2 = new byte[length + 4];
        byte[] bArr3 = new byte[i ^ 1];
        bArr2[0] = (byte) (length >>> 24);
        bArr2[1] = (byte) (length >>> 16);
        bArr2[2] = (byte) (length >>> 8);
        bArr2[3] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, i + 4, length - i);
        if (z) {
            C19356.m44596(bArr);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m38940(byte[] bArr, boolean z) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 4];
        bArr2[0] = (byte) (length >>> 24);
        bArr2[1] = (byte) (length >>> 16);
        bArr2[2] = (byte) (length >>> 8);
        bArr2[3] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, 4, length);
        if (z) {
            C19356.m44596(bArr);
        }
        return bArr2;
    }
}
