package l;

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
public final /* synthetic */ class C9005 implements InterfaceC7961, InterfaceC19698, InterfaceC7197, InterfaceC13191 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m23240(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ Class m23241() {
        return Executable.class;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23242(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23243(Object obj) throws Exception {
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

    @Override // l.InterfaceC13191
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo23247(int i, int i2, byte[] bArr) {
        return C12780.m31089(i, i2, bArr);
    }

    @Override // l.InterfaceC7197
    /* JADX INFO: renamed from: ֫ */
    public String mo19279(EnumC21309 enumC21309, String str, String str2) {
        return EnumC11431.m28249(enumC21309, str, str2);
    }

    @Override // l.InterfaceC19698
    /* JADX INFO: renamed from: ֫ */
    public void mo13416(int i, int i2, int i3) {
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m23244(byte[] bArr) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m23246(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM46682 = C20361.m46682("offset=", i2, ", length=", ", totalLength=", i3);
            sbM46682.append(i);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23245(int i, int i2, int i3) {
        long j = ((long) i2) + ((long) i3);
        if (i2 < 0 || i3 < 0 || j > i) {
            StringBuilder sbM46682 = C20361.m46682("offset=", i2, ", length=", ", arrayLength=", i3);
            sbM46682.append(i);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
    }
}
