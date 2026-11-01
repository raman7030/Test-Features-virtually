package p067l;

import com.alipay.sdk.p010m.p041p.C0187d;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ܽۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7XB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18100 {

    /* JADX INFO: renamed from: ܿ */
    public C9383 f54037 = null;

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC5005 f54035 = null;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f54034 = null;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f54033 = null;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f54036 = null;

    /* JADX INFO: renamed from: ᩻ */
    public int f54039 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public String f54038 = "";

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m41163(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo20900(C9383 c9383, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo20901(C17823 c17823);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo20902();

    /* JADX INFO: renamed from: ۧ */
    public final String m41169() {
        int i = this.f54039;
        if (i == 1) {
            return "DSA";
        }
        if (i == 0) {
            return C0187d.f883a;
        }
        return i == 3 ? "EDDSA" : "ECDSA";
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m41167() {
        return this.f54038;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m41164(byte[] bArr) {
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
        C20764.m46890(bArr);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41168(String str, byte[] bArr, byte[] bArr2, int i) throws C14392 {
        if (str.equals(OpenSSHPublicKeyUtil.RSA)) {
            this.f54039 = 0;
            this.f54038 = str;
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
            byte[] bArrM40471 = new C17823(bArr2).m40471();
            byte[] bArr5 = C20764.f65273;
            try {
                InterfaceC8693 interfaceC8693 = (InterfaceC8693) Class.forName(this.f54037.m21829(new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8))).asSubclass(InterfaceC8693.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC8693.init();
                interfaceC8693.mo20129(bArr3, bArr4);
                interfaceC8693.update(this.f54033);
                boolean zVerify = interfaceC8693.verify(bArr2);
                this.f54037.f25608.m49100().getClass();
                return zVerify;
            } catch (Exception e) {
                throw new C14392(e.toString(), e);
            }
        }
        if (str.equals(OpenSSHPublicKeyUtil.DSS)) {
            this.f54039 = 1;
            this.f54038 = str;
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
                InterfaceC18751 interfaceC18751 = (InterfaceC18751) Class.forName(this.f54037.m21829("signature.dss")).asSubclass(InterfaceC18751.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC18751.init();
                interfaceC18751.mo14918(bArr9, bArr6, bArr7, bArr8);
                interfaceC18751.update(this.f54033);
                boolean zVerify2 = interfaceC18751.verify(bArr2);
                this.f54037.f25608.m49100().getClass();
                return zVerify2;
            } catch (Exception e2) {
                throw new C14392(e2.toString(), e2);
            }
        }
        if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
            if (!str.equals(OpenSSHPublicKeyUtil.ED_25519) && !str.equals("ssh-ed448")) {
                this.f54037.f25608.m49100().getClass();
                return false;
            }
            this.f54039 = 3;
            this.f54038 = str;
            int i30 = ((bArr[i + 1] << 16) & 16711680) | ((-16777216) & (bArr[i] << 24)) | (65280 & (bArr[i + 2] << 8));
            int i31 = i30 | (bArr[i + 3] & 255);
            byte[] bArr10 = new byte[i31];
            System.arraycopy(bArr, i + 4, bArr10, 0, i31);
            try {
                InterfaceC24786 interfaceC24786 = (InterfaceC24786) Class.forName(this.f54037.m21829(str)).asSubclass(InterfaceC24786.class).getDeclaredConstructor(null).newInstance(null);
                interfaceC24786.init();
                interfaceC24786.mo29591(bArr10);
                interfaceC24786.update(this.f54033);
                boolean zVerify3 = interfaceC24786.verify(bArr2);
                this.f54037.f25608.m49100().getClass();
                return zVerify3;
            } catch (Exception | LinkageError e3) {
                throw new C14392(e3.toString(), e3);
            }
        }
        this.f54039 = 2;
        this.f54038 = str;
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
            InterfaceC16068 interfaceC16068 = (InterfaceC16068) Class.forName(this.f54037.m21829(str)).asSubclass(InterfaceC16068.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC16068.init();
            interfaceC16068.mo27180(bArr11, bArr12);
            interfaceC16068.update(this.f54033);
            boolean zVerify4 = interfaceC16068.verify(bArr2);
            this.f54037.f25608.m49100().getClass();
            return zVerify4;
        } catch (Exception e4) {
            throw new C14392(e4.toString(), e4);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m41165(byte[] bArr, boolean z) {
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
            C20764.m46890(bArr);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m41166(byte[] bArr, boolean z) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 4];
        bArr2[0] = (byte) (length >>> 24);
        bArr2[1] = (byte) (length >>> 16);
        bArr2[2] = (byte) (length >>> 8);
        bArr2[3] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, 4, length);
        if (z) {
            C20764.m46890(bArr);
        }
        return bArr2;
    }
}
