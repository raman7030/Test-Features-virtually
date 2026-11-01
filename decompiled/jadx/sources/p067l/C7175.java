package p067l;

import com.umeng.analytics.pro.C0698cb;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: renamed from: l.ۚۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37XE */
/* JADX INFO: loaded from: classes3.dex */
public final class C7175 implements InterfaceC4019 {

    /* JADX INFO: renamed from: ֫ */
    public int f18741;

    /* JADX INFO: renamed from: ۧ */
    public String f18742;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f18743;

    /* JADX INFO: renamed from: ᩳ */
    public SecretKeyFactory f18744;

    /* JADX INFO: renamed from: ܿ */
    public static final byte[] f18738 = {42, -122, 72, -122, -9, C0698cb.f2569k, 2, 7};

    /* JADX INFO: renamed from: ܳ */
    public static final byte[] f18737 = {42, -122, 72, -122, -9, C0698cb.f2569k, 2, 8};

    /* JADX INFO: renamed from: ᩻ */
    public static final byte[] f18740 = {42, -122, 72, -122, -9, C0698cb.f2569k, 2, 9};

    /* JADX INFO: renamed from: ۜ */
    public static final byte[] f18734 = {42, -122, 72, -122, -9, C0698cb.f2569k, 2, 10};

    /* JADX INFO: renamed from: ᩷ */
    public static final byte[] f18739 = {42, -122, 72, -122, -9, C0698cb.f2569k, 2, 11};

    /* JADX INFO: renamed from: ۢ */
    public static final byte[] f18736 = {42, -122, 72, -122, -9, C0698cb.f2569k, 2, 12};

    /* JADX INFO: renamed from: ۡ */
    public static final byte[] f18735 = {42, -122, 72, -122, -9, C0698cb.f2569k, 2, C0698cb.f2569k};

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final void mo8021(byte[] bArr) throws C14392 {
        throw new C14392("initWithOpenSSHv1KDFOptions() not supported");
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final void mo8020(HashMap map) throws C14392 {
        throw new C14392("initWithPPKv3Header() not supported");
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ۧ */
    public final void mo8023(byte[] bArr) throws C14392 {
        C7352 c7352;
        try {
            C7352 c7353 = new C7352(bArr);
            if (!c7353.m17044()) {
                throw new C3328();
            }
            C7352[] c7352ArrM17039 = c7353.m17039();
            if (c7352ArrM17039.length < 2 || c7352ArrM17039.length > 4) {
                throw new C3328();
            }
            if (!c7352ArrM17039[0].m17038()) {
                throw new C3328();
            }
            boolean z = true;
            if (!c7352ArrM17039[1].m17040()) {
                throw new C3328();
            }
            byte[] bArrM17037 = null;
            if (c7352ArrM17039.length == 4) {
                if (!c7352ArrM17039[2].m17040()) {
                    throw new C3328();
                }
                if (!c7352ArrM17039[3].m17044()) {
                    throw new C3328();
                }
                c7352 = c7352ArrM17039[3];
            } else if (c7352ArrM17039.length != 3) {
                c7352 = null;
            } else if (c7352ArrM17039[2].m17044()) {
                c7352 = c7352ArrM17039[2];
            } else {
                if (!c7352ArrM17039[2].m17040()) {
                    throw new C3328();
                }
                c7352 = null;
            }
            this.f18743 = c7352ArrM17039[0].m17037();
            this.f18741 = C7352.m17034(c7352ArrM17039[1].m17037());
            if (c7352 != null) {
                C7352[] c7352ArrM170310 = c7352.m17039();
                if (c7352ArrM170310.length != 2) {
                    throw new C3328();
                }
                if (!c7352ArrM170310[0].m17045()) {
                    throw new C3328();
                }
                if (c7352ArrM170310[1].m17043() != 5) {
                    z = false;
                }
                if (!z) {
                    throw new C3328();
                }
                bArrM17037 = c7352ArrM170310[0].m17037();
            }
            String strM16492 = m16492(bArrM17037);
            this.f18742 = strM16492;
            this.f18744 = SecretKeyFactory.getInstance(strM16492);
        } catch (Exception e) {
            if (e instanceof C14392) {
                throw ((C14392) e);
            }
            if (e instanceof NoSuchAlgorithmException) {
                throw new C14392("unsupported pbkdf2 algorithm: ".concat(this.f18742), e);
            }
            if (!(e instanceof C3328) && !(e instanceof ArithmeticException)) {
                throw new C14392("pbkdf2 unavailable", e);
            }
            throw new C14392("invalid ASN1", e);
        }
    }

    @Override // p067l.InterfaceC4019
    /* JADX INFO: renamed from: ֫ */
    public final byte[] mo8022(int i, byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            cArr[i2] = (char) (bArr[i2] & 255);
        }
        try {
            return this.f18744.generateSecret(new PBEKeySpec(cArr, this.f18743, this.f18741, i * 8)).getEncoded();
        } catch (InvalidKeySpecException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m16492(byte[] bArr) throws C14392 {
        String str;
        if (bArr == null || Arrays.equals(bArr, f18738)) {
            str = "PBKDF2WithHmacSHA1";
        } else if (Arrays.equals(bArr, f18737)) {
            str = "PBKDF2WithHmacSHA224";
        } else if (Arrays.equals(bArr, f18740)) {
            str = "PBKDF2WithHmacSHA256";
        } else if (Arrays.equals(bArr, f18734)) {
            str = "PBKDF2WithHmacSHA384";
        } else if (Arrays.equals(bArr, f18739)) {
            str = "PBKDF2WithHmacSHA512";
        } else if (Arrays.equals(bArr, f18736)) {
            str = "PBKDF2WithHmacSHA512/224";
        } else {
            str = Arrays.equals(bArr, f18735) ? "PBKDF2WithHmacSHA512/256" : null;
        }
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("unsupported pbkdf2 function oid: ");
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            StringBuilder sb3 = new StringBuilder("0x");
            sb3.append(hexString.length() == 1 ? "0" : "");
            sb3.append(hexString);
            sb2.append(sb3.toString());
            i++;
            if (i < bArr.length) {
                sb2.append(":");
            }
        }
        sb.append(sb2.toString());
        throw new C14392(sb.toString());
    }
}
