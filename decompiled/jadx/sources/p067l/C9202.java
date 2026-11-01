package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.R;
import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.p061s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.CopyObjectRequest;
import com.amazonaws.services.p061s3.model.DeleteObjectRequest;
import com.amazonaws.services.p061s3.model.DeleteObjectsRequest;
import com.amazonaws.services.p061s3.model.GetObjectRequest;
import com.amazonaws.services.p061s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.ListObjectsRequest;
import com.amazonaws.services.p061s3.model.MultiObjectDeleteException;
import com.amazonaws.services.p061s3.model.ObjectListing;
import com.amazonaws.services.p061s3.model.ObjectMetadata;
import com.amazonaws.services.p061s3.model.PutObjectRequest;
import com.amazonaws.services.p061s3.model.S3ObjectSummary;
import com.amazonaws.services.p061s3.model.UploadPartRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes.dex */
public class C9202 extends AbstractC5375 {

    /* JADX INFO: renamed from: ۚۢ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f82049;

    /* JADX INFO: renamed from: ۛ */
    public static final /* synthetic */ int f24903 = 0;

    /* JADX INFO: renamed from: ۤ */
    public C3876 f24904;

    /* JADX INFO: renamed from: ۫ */
    public C3837 f24905;

    /* JADX INFO: renamed from: ۬ */
    public final C5967 f24906;

    /* JADX INFO: renamed from: ۤ */
    private native void m21206();

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo11731() {
        return false;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final void mo11739(C11996 c11996) {
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo11750() {
        return false;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩸ */
    public final void mo11751() {
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo11752() {
        return false;
    }

    public C9202(int i, AbstractC5769 abstractC5769) {
        super(i, abstractC5769);
        this.f24906 = new C5967(new C7861(this), false);
        this.f24904 = C3876.m7660(i, abstractC5769);
        m21206();
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11729(AbstractC5769 abstractC5769) {
        super.mo11729(abstractC5769);
        C3876 c3876M7660 = C3876.m7660(this.f12757, abstractC5769);
        if (this.f24904.equals(c3876M7660)) {
            return;
        }
        this.f24904 = c3876M7660;
        m21206();
        this.f24906.m13377();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m21207(C9202 c9202) {
        return c9202.f24904.f8394;
    }

    static {
        ApplicationC14266.m56479(74);
        f82049 = new short[]{2753, -5182, -5246, -5218, -5165, -5156, -5153, -5179, -5164, -5162, -5156, -5167, -5182, -5163, -5181, -5180, -5153, -5182, -5167, -5161, -5163, -5218, -5165, -5153, -5155};
        SignerFactory.m1389(C12594.class, "UnsignedPayloadSignerType");
    }

    public C9202(int i, AbstractC5769 abstractC5769, C14677 c14677) {
        this(i, abstractC5769);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۘ */
    public final String mo11732() {
        return this.f24904.f8398 + ":" + this.f24904.f8394;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۖ */
    public final String mo11730() {
        URI uriM7661 = this.f24904.m7661();
        if (uriM7661 != null && uriM7661.getHost() != null) {
            return uriM7661.getHost();
        }
        return AbstractC5375.m11721(C14566.m33293(this.f24904.f8398, new ClientConfiguration()));
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܶ */
    public final String mo11743() {
        return TextUtils.isEmpty(this.f12758.f14159) ? "/" : AbstractC18422.m41972(this.f12758.f14159);
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
        this.f24906.m13377();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        C5967 c5967 = this.f24906;
        c5967.getClass();
        C15236 c15236 = (C15236) c5967.m13376(C11419.m26416(str), C11419.m26414(str));
        if (c15236 == null) {
            return null;
        }
        return c15236.m34683();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        Collection<C15236> collectionValues = this.f24906.m13382(AbstractC18422.m41972(str)).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C15236 c15236 : collectionValues) {
            if (z || !c15236.m34684().startsWith(".")) {
                arrayList.add(c15236.m34683());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo11725(long j, String str) throws IOException {
        GetObjectRequest getObjectRequest = new GetObjectRequest(this.f24904.f8394, str.substring(1));
        if (j > 0) {
            if (C3837.m7520(this.f24904.f8398)) {
                C5967 c5967 = this.f24906;
                c5967.getClass();
                C15236 c15236 = (C15236) c5967.m13376(C11419.m26416(str), C11419.m26414(str));
                long j2 = -1;
                if (c15236 != null && c15236.f43485 != null) {
                    long jM1831 = c15236.f43485.m1831();
                    if (jM1831 > 0 && j < jM1831) {
                        j2 = jM1831 - 1;
                    }
                }
                if (j2 >= j) {
                    getObjectRequest.m1734(j, j2);
                } else {
                    getObjectRequest.m1734(j, 9223372036854775806L);
                }
            } else {
                getObjectRequest.m1734(j, 9223372036854775806L);
            }
        }
        try {
            return this.f24905.mo1603(getObjectRequest).m1815();
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m21205(C9202 c9202, PutObjectRequest putObjectRequest, AtomicReference atomicReference, InterfaceC3579 interfaceC3579, CountDownLatch countDownLatch) {
        try {
            c9202.f24905.mo1602(putObjectRequest);
            try {
                interfaceC3579.close();
            } catch (IOException e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        } catch (AmazonClientException e2) {
            IOException iOException = new IOException(e2.getMessage(), e2);
            while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
            }
            try {
                interfaceC3579.close();
            } catch (IOException e3) {
                while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
                }
            }
        } finally {
            try {
                interfaceC3579.close();
            } catch (IOException e4) {
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            countDownLatch.countDown();
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo11737(final long j, String str) throws IOException {
        if (j <= 2147483647L) {
            C11627 c11627 = new C11627(524288L);
            final InterfaceC3579 interfaceC3579M26743 = c11627.m26743();
            InterfaceC12257 interfaceC12257M54977 = C25037.m54977(c11627.m26742());
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m1782(j);
            objectMetadata.m1803(C4463.m9371(C11419.m26414(str), true).m9394());
            final PutObjectRequest putObjectRequest = new PutObjectRequest(this.f24904.f8394, str.substring(1), C25037.m54976(interfaceC3579M26743).mo14212(), objectMetadata);
            final AtomicReference atomicReference = new AtomicReference();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C4081.f8987.execute(new Runnable() { // from class: l.۫ۖ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C9202.m21205(this.f39237, putObjectRequest, atomicReference, interfaceC3579M26743, countDownLatch);
                }
            });
            return new C13226(atomicReference, interfaceC12257M54977, countDownLatch);
        }
        final String strSubstring = str.substring(1);
        ObjectMetadata objectMetadata2 = new ObjectMetadata();
        objectMetadata2.m1803(C4463.m9371(C11419.m26414(str), true).m9394());
        try {
            final String strM1755 = this.f24905.mo1601(new InitiateMultipartUploadRequest(this.f24904.f8394, strSubstring, objectMetadata2)).m1755();
            final ArrayList arrayList = new ArrayList();
            C11627 c11628 = new C11627(524288L);
            final InterfaceC3579 interfaceC3579M26744 = c11628.m26743();
            InterfaceC12257 interfaceC12257M54978 = C25037.m54977(c11628.m26742());
            final InputStream inputStreamMo14212 = C25037.m54976(interfaceC3579M26744).mo14212();
            final AtomicReference atomicReference2 = new AtomicReference();
            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
            C4081.f8987.execute(new Runnable() { // from class: l.ۤۖ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C9202.m21204(this.f33121, j, inputStreamMo14212, strSubstring, strM1755, arrayList, atomicReference2, interfaceC3579M26744, countDownLatch2);
                }
            });
            return new C23954(this, atomicReference2, interfaceC12257M54978, countDownLatch2, strSubstring, strM1755, arrayList);
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21204(C9202 c9202, long j, InputStream inputStream, String str, String str2, ArrayList arrayList, AtomicReference atomicReference, InterfaceC3579 interfaceC3579, CountDownLatch countDownLatch) {
        long jM22301 = 0;
        int i = 1;
        while (jM22301 < j) {
            try {
                long jMin = Math.min(104857600L, j - jM22301);
                C9573 c9573 = new C9573(jMin, inputStream);
                UploadPartRequest uploadPartRequest = new UploadPartRequest();
                uploadPartRequest.m1843(c9202.f24904.f8394);
                uploadPartRequest.m1848(str);
                uploadPartRequest.m1853(str2);
                uploadPartRequest.m1852(i);
                uploadPartRequest.m1842(c9573);
                uploadPartRequest.m1847(jMin);
                arrayList.add(c9202.f24905.mo1604(uploadPartRequest).m1859());
                jM22301 += c9573.m22301();
                i++;
            } catch (Throwable th) {
                try {
                    IOException iOException = new IOException(th.getMessage(), th);
                    while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
                    }
                    try {
                        c9202.f24905.mo1605(new AbortMultipartUploadRequest(c9202.f24904.f8394, str, str2));
                    } catch (Throwable unused) {
                    }
                    try {
                        interfaceC3579.close();
                    } catch (IOException e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } finally {
                    try {
                        interfaceC3579.close();
                    } catch (IOException e2) {
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                    countDownLatch.countDown();
                }
            }
        }
        try {
            interfaceC3579.close();
        } catch (IOException e3) {
            while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
            }
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܽ */
    public final void mo11745(String str, boolean z) throws IOException {
        try {
            String strSubstring = str.substring(1);
            if (!z) {
                this.f24905.m1617(new DeleteObjectRequest(this.f24904.f8394, strSubstring));
                return;
            }
            String str2 = strSubstring + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM1777 = null;
            while (true) {
                ObjectListing objectListingM1614 = this.f24905.m1614(new ListObjectsRequest(this.f24904.f8394, str2, strM1777, null, 1000));
                List list = (List) C7480.stream(objectListingM1614.m1779()).map(new C4055(2)).collect(C24205.toList());
                DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(this.f24904.f8394);
                deleteObjectsRequest.m1726(list);
                deleteObjectsRequest.m1727();
                try {
                    this.f24905.m1618(deleteObjectsRequest);
                } catch (MultiObjectDeleteException e) {
                    Iterator it = e.m1767().iterator();
                    if (it.hasNext()) {
                        throw new IOException(C7050.m16203(R.string.MT_Protector, ((MultiObjectDeleteException.DeleteError) it.next()).m1768()));
                    }
                }
                if (objectListingM1614.m1778() && !threadCurrentThread.isInterrupted()) {
                    strM1777 = objectListingM1614.m1777();
                }
                return;
            }
        } catch (AmazonClientException e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ֫ */
    public final void mo11728(String str, String str2) throws IOException {
        try {
            C5967 c5967 = this.f24906;
            c5967.getClass();
            C15236 c15236 = (C15236) c5967.m13376(C11419.m26416(str), C11419.m26414(str));
            String strSubstring = str.substring(1);
            String strSubstring2 = str2.substring(1);
            if (!(c15236 != null ? c15236.m34685() : !this.f24905.m1619(this.f24904.f8394, strSubstring))) {
                if (this.f24905.m1619(this.f24904.f8394, strSubstring2)) {
                    throw new IOException(C7050.m16203(R.string.MT_Protector, strSubstring2));
                }
                this.f24905.m1616(new CopyObjectRequest(this.f24904.f8394, C14523.encode(strSubstring, StandardCharsets.UTF_8), this.f24904.f8394, strSubstring2));
                this.f24905.m1617(new DeleteObjectRequest(this.f24904.f8394, strSubstring));
                return;
            }
            String str3 = strSubstring + "/";
            String str4 = strSubstring2 + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM1777 = null;
            boolean z = true;
            while (true) {
                ObjectListing objectListingM1614 = this.f24905.m1614(new ListObjectsRequest(this.f24904.f8394, str3, strM1777, null, 1000));
                if (z) {
                    if (!objectListingM1614.m1779().isEmpty() && !this.f24905.m1614(new ListObjectsRequest(this.f24904.f8394, str4, null, null, 1)).m1779().isEmpty()) {
                        throw new IOException(C7050.m16203(R.string.MT_Protector, str4));
                    }
                    z = false;
                }
                Iterator it = objectListingM1614.m1779().iterator();
                while (it.hasNext()) {
                    String strM1824 = ((S3ObjectSummary) it.next()).m1824();
                    this.f24905.m1616(new CopyObjectRequest(this.f24904.f8394, C14523.encode(strM1824, StandardCharsets.UTF_8), this.f24904.f8394, str4 + strM1824.substring(str3.length())));
                    this.f24905.m1617(new DeleteObjectRequest(this.f24904.f8394, strM1824));
                    if (threadCurrentThread.isInterrupted()) {
                        break;
                    }
                }
                if (objectListingM1614.m1778() && !threadCurrentThread.isInterrupted()) {
                    strM1777 = objectListingM1614.m1777();
                }
                return;
            }
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ܿ */
    public final void mo11746(String str) throws IOException {
        try {
            String str2 = str.substring(1) + "/";
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m1782(0L);
            this.f24905.mo1602(new PutObjectRequest(this.f24904.f8394, str2, new ByteArrayInputStream(new byte[0]), objectMetadata));
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo11735(String str) {
        return this.f24906.m13381(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo11747(String str) {
        C5967 c5967 = this.f24906;
        c5967.getClass();
        return c5967.m13376(C11419.m26416(str), C11419.m26414(str)) != null;
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ᩻ */
    public final String mo11753(String str) {
        return this.f24906.m13380(str);
    }

    @Override // p067l.AbstractC5375
    /* JADX INFO: renamed from: ۢ */
    public final void mo11736(String str) {
        this.f24906.m13378(str);
    }
}
