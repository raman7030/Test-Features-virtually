package l;

import android.util.Pair;
import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۗۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8SK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3030 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f9561 = {0, 0, 0, 0, 16, 0, GCMSIVBlockCipher.MASK, 0, 0, -86, 0, 56, -101, KeyFactorySpi.Ed448_type};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f9560 = {0, 0, PublicSuffixDatabase.EXCEPTION_MARKER, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9278(InterfaceC8424 interfaceC8424) {
        C17714 c17714 = new C17714(8);
        int i = C4441.m13192(interfaceC8424, c17714).f14191;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC8424.mo22061(0, 4, c17714.m41482());
        c17714.m41484(0);
        int iM41493 = c17714.m41493();
        if (iM41493 == 1463899717) {
            return true;
        }
        C19956.m46033("Unsupported form type: " + iM41493);
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19964 m9279(InterfaceC8424 interfaceC8424) throws C9080 {
        byte[] bArr;
        C17714 c17714 = new C17714(16);
        long j = m9277(1718449184, interfaceC8424, c17714).f14192;
        C22632.m50634(j >= 16);
        interfaceC8424.mo22061(0, 16, c17714.m41482());
        c17714.m41484(0);
        int iM41465 = c17714.m41465();
        int iM41466 = c17714.m41465();
        int iM41463 = c17714.m41463();
        c17714.m41463();
        c17714.m41465();
        int iM41467 = c17714.m41465();
        int i = ((int) j) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            interfaceC8424.mo22061(0, i, bArr2);
            if (iM41465 == 65534 && i == 24) {
                C17714 c17715 = new C17714(bArr2);
                c17715.m41465();
                int iM41468 = c17715.m41465();
                if (iM41468 != 0 && iM41468 != iM41467) {
                    throw C9080.m23441("validBits ( " + iM41468 + ")  != bitsPerSample( " + iM41467 + ") are not supported");
                }
                int iM41464 = c17715.m41463();
                if ((iM41464 >> 18) != 0) {
                    throw C9080.m23441("invalid channel mask " + iM41464);
                }
                if (iM41464 != 0 && Integer.bitCount(iM41464) != iM41466) {
                    throw C9080.m23441("invalid number of channels (" + Integer.bitCount(iM41464) + ") in channel mask " + iM41464);
                }
                iM41465 = c17715.m41465();
                byte[] bArr3 = new byte[14];
                c17715.m41461(0, 14, bArr3);
                if (!Arrays.equals(bArr3, f9561) && !Arrays.equals(bArr3, f9560)) {
                    throw C9080.m23441("invalid wav format extension guid");
                }
            }
            bArr = bArr2;
        } else {
            bArr = C3603.f11423;
        }
        interfaceC8424.mo22070((int) (interfaceC8424.mo22069() - interfaceC8424.getPosition()));
        return new C19964(bArr, iM41465, iM41466, iM41463, iM41467);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Pair m9280(InterfaceC8424 interfaceC8424) throws C9080 {
        interfaceC8424.mo22066();
        C4441 c4441M9277 = m9277(1684108385, interfaceC8424, new C17714(8));
        interfaceC8424.mo22070(8);
        return Pair.create(Long.valueOf(interfaceC8424.getPosition()), Long.valueOf(c4441M9277.f14192));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4441 m9277(int i, InterfaceC8424 interfaceC8424, C17714 c17714) throws C9080 {
        C4441 c4441M13192 = C4441.m13192(interfaceC8424, c17714);
        while (true) {
            int i2 = c4441M13192.f14191;
            if (i2 == i) {
                return c4441M13192;
            }
            C8083.m21451(i2, "Ignoring unknown WAV chunk: ");
            long j = c4441M13192.f14192;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C9080.m23441("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            interfaceC8424.mo22070((int) j2);
            c4441M13192 = C4441.m13192(interfaceC8424, c17714);
        }
    }
}
