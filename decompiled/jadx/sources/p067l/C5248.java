package p067l;

import android.util.Pair;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۗۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8SK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5248 {

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f12363 = {0, 0, 0, 0, 16, 0, GCMSIVBlockCipher.MASK, 0, 0, -86, 0, 56, -101, KeyFactorySpi.Ed448_type};

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f12362 = {0, 0, PublicSuffixDatabase.EXCEPTION_MARKER, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: ֫ */
    public static boolean m11320(InterfaceC10375 interfaceC10375) {
        C19203 c19203 = new C19203(8);
        int i = C6589.m15073(interfaceC10375, c19203).f17015;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC10375.mo24031(0, 4, c19203.m43728());
        c19203.m43730(0);
        int iM43739 = c19203.m43739();
        if (iM43739 == 1463899717) {
            return true;
        }
        C21334.m48347("Unsupported form type: " + iM43739);
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C21342 m11321(InterfaceC10375 interfaceC10375) throws C10998 {
        byte[] bArr;
        C19203 c19203 = new C19203(16);
        long j = m11319(1718449184, interfaceC10375, c19203).f17016;
        C23877.m52960(j >= 16);
        interfaceC10375.mo24031(0, 16, c19203.m43728());
        c19203.m43730(0);
        int iM43711 = c19203.m43711();
        int iM43712 = c19203.m43711();
        int iM43709 = c19203.m43709();
        c19203.m43709();
        c19203.m43711();
        int iM43713 = c19203.m43711();
        int i = ((int) j) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            interfaceC10375.mo24031(0, i, bArr2);
            if (iM43711 == 65534 && i == 24) {
                C19203 c19204 = new C19203(bArr2);
                c19204.m43711();
                int iM43714 = c19204.m43711();
                if (iM43714 != 0 && iM43714 != iM43713) {
                    throw C10998.m25388("validBits ( " + iM43714 + ")  != bitsPerSample( " + iM43713 + ") are not supported");
                }
                int iM437010 = c19204.m43709();
                if ((iM437010 >> 18) != 0) {
                    throw C10998.m25388("invalid channel mask " + iM437010);
                }
                if (iM437010 != 0 && Integer.bitCount(iM437010) != iM43712) {
                    throw C10998.m25388("invalid number of channels (" + Integer.bitCount(iM437010) + ") in channel mask " + iM437010);
                }
                iM43711 = c19204.m43711();
                byte[] bArr3 = new byte[14];
                c19204.m43707(0, 14, bArr3);
                if (!Arrays.equals(bArr3, f12363) && !Arrays.equals(bArr3, f12362)) {
                    throw C10998.m25388("invalid wav format extension guid");
                }
            }
            bArr = bArr2;
        } else {
            bArr = C5792.f14227;
        }
        interfaceC10375.mo24040((int) (interfaceC10375.mo24039() - interfaceC10375.getPosition()));
        return new C21342(bArr, iM43711, iM43712, iM43709, iM43713);
    }

    /* JADX INFO: renamed from: ܽ */
    public static Pair m11322(InterfaceC10375 interfaceC10375) throws C10998 {
        interfaceC10375.mo24036();
        C6589 c6589M11319 = m11319(1684108385, interfaceC10375, new C19203(8));
        interfaceC10375.mo24040(8);
        return Pair.create(Long.valueOf(interfaceC10375.getPosition()), Long.valueOf(c6589M11319.f17016));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6589 m11319(int i, InterfaceC10375 interfaceC10375, C19203 c19203) throws C10998 {
        C6589 c6589M15073 = C6589.m15073(interfaceC10375, c19203);
        while (true) {
            int i2 = c6589M15073.f17015;
            if (i2 == i) {
                return c6589M15073;
            }
            C10050.m23419(i2, "Ignoring unknown WAV chunk: ");
            long j = c6589M15073.f17016;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C10998.m25388("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            interfaceC10375.mo24040((int) j2);
            c6589M15073 = C6589.m15073(interfaceC10375, c19203);
        }
    }
}
