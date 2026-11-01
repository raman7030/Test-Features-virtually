package p067l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaCodecInfo;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: renamed from: l.ۡܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L70P */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10927 implements InterfaceC9934, InterfaceC21090, InterfaceC9208, InterfaceC14905 {
    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m25184(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ Class m25185() {
        return Executable.class;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m25186(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m25187(Object obj) throws Exception {
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            throw null;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
            return;
        }
        if (obj instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) obj).release();
            return;
        }
        if (obj instanceof MediaDrm) {
            ((MediaDrm) obj).release();
        } else if (obj instanceof DrmManagerClient) {
            ((DrmManagerClient) obj).release();
        } else {
            if (!(obj instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) obj).release();
        }
    }

    @Override // p067l.InterfaceC14905
    /* JADX INFO: renamed from: ֫ */
    public Object mo25191(int i, int i2, byte[] bArr) {
        return C14514.m33173(i, i2, bArr);
    }

    @Override // p067l.InterfaceC9208
    /* JADX INFO: renamed from: ֫ */
    public String mo21226(EnumC22620 enumC22620, String str, String str2) {
        return EnumC13232.m30293(enumC22620, str, str2);
    }

    @Override // p067l.InterfaceC21090
    /* JADX INFO: renamed from: ֫ */
    public void mo15304(int i, int i2, int i3) {
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m25188(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        int i = 0;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            while (i > 0 && bArr[i2] != bArr[i]) {
                i = iArr[i - 1];
            }
            if (bArr[i2] == bArr[i]) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m25190(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM49005 = C21720.m49005("offset=", i2, ", length=", ", totalLength=", i3);
            sbM49005.append(i);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m25189(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM49005 = C21720.m49005("offset=", i2, ", length=", ", arrayLength=", i3);
            sbM49005.append(i);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
    }
}
