package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.UploadPartRequest;
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
public class C7190 extends AbstractC3163 {

    /* JADX INFO: renamed from: ۚۢ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f22024;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22025 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1586 f22026;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1545 f22027;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3786 f22028;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private native void m19259();

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo9687() {
        return false;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final void mo9695(C10130 c10130) {
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩶ */
    public final boolean mo9706() {
        return false;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩸ */
    public final void mo9707() {
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo9708() {
        return false;
    }

    public C7190(int i, AbstractC3577 abstractC3577) {
        super(i, abstractC3577);
        this.f22028 = new C3786(new C5779(this), false);
        this.f22026 = C1586.m5431(i, abstractC3577);
        m19259();
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final void mo9685(AbstractC3577 abstractC3577) {
        super.mo9685(abstractC3577);
        C1586 c1586M5431 = C1586.m5431(this.f9954, abstractC3577);
        if (this.f22026.equals(c1586M5431)) {
            return;
        }
        this.f22026 = c1586M5431;
        m19259();
        this.f22028.m11441();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m19260(C7190 c7190) {
        return c7190.f22026.f5615;
    }

    static {
        ApplicationC12518.m30701(74);
        f22024 = new short[]{2753, -5182, -5246, -5218, -5165, -5156, -5153, -5179, -5164, -5162, -5156, -5167, -5182, -5163, -5181, -5180, -5153, -5182, -5167, -5161, -5163, -5218, -5165, -5153, -5155};
        SignerFactory.m223(C10759.class, "UnsignedPayloadSignerType");
    }

    public C7190(int i, AbstractC3577 abstractC3577, C12951 c12951) {
        this(i, abstractC3577);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۘ */
    public final String mo9688() {
        return this.f22026.f5619 + ":" + this.f22026.f5615;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۖ */
    public final String mo9686() {
        URI uriM5432 = this.f22026.m5432();
        if (uriM5432 != null && uriM5432.getHost() != null) {
            return uriM5432.getHost();
        }
        return AbstractC3163.m9677(C12834.m31207(this.f22026.f5619, new ClientConfiguration()));
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܶ */
    public final String mo9699() {
        return TextUtils.isEmpty(this.f9955.f11354) ? "/" : AbstractC16891.m39731(this.f9955.f11354);
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
        this.f22028.m11441();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        C3786 c3786 = this.f22028;
        c3786.getClass();
        C13539 c13539 = (C13539) c3786.m11440(C9523.m24406(str), C9523.m24404(str));
        if (c13539 == null) {
            return null;
        }
        return c13539.m32580();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        Collection<C13539> collectionValues = this.f22028.m11446(AbstractC16891.m39731(str)).values();
        ArrayList arrayList = new ArrayList(collectionValues.size() + 1);
        for (C13539 c13539 : collectionValues) {
            if (z || !c13539.m32581().startsWith(".")) {
                arrayList.add(c13539.m32580());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9681(long j, String str) throws IOException {
        GetObjectRequest getObjectRequest = new GetObjectRequest(this.f22026.f5615, str.substring(1));
        if (j > 0) {
            if (C1545.m5291(this.f22026.f5619)) {
                C3786 c3786 = this.f22028;
                c3786.getClass();
                C13539 c13539 = (C13539) c3786.m11440(C9523.m24406(str), C9523.m24404(str));
                long j2 = -1;
                if (c13539 != null && c13539.f40415 != null) {
                    long jM666 = c13539.f40415.m666();
                    if (jM666 > 0 && j < jM666) {
                        j2 = jM666 - 1;
                    }
                }
                if (j2 >= j) {
                    getObjectRequest.m568(j, j2);
                } else {
                    getObjectRequest.m568(j, 9223372036854775806L);
                }
            } else {
                getObjectRequest.m568(j, 9223372036854775806L);
            }
        }
        try {
            return this.f22027.mo437(getObjectRequest).m650();
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19258(C7190 c7190, PutObjectRequest putObjectRequest, AtomicReference atomicReference, InterfaceC1274 interfaceC1274, CountDownLatch countDownLatch) {
        try {
            c7190.f22027.mo436(putObjectRequest);
            try {
                interfaceC1274.close();
            } catch (IOException e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        } catch (AmazonClientException e2) {
            IOException iOException = new IOException(e2.getMessage(), e2);
            while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
            }
            try {
                interfaceC1274.close();
            } catch (IOException e3) {
                while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
                }
            }
        } finally {
            try {
                interfaceC1274.close();
            } catch (IOException e4) {
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            countDownLatch.countDown();
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۧ */
    public final OutputStream mo9693(final long j, String str) throws IOException {
        if (j <= 2147483647L) {
            C9742 c9742 = new C9742(524288L);
            final InterfaceC1274 interfaceC1274M24729 = c9742.m24729();
            InterfaceC10405 interfaceC10405M52568 = C23852.m52568(c9742.m24728());
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m616(j);
            objectMetadata.m637(C2204.m7292(C9523.m24404(str), true).m7315());
            final PutObjectRequest putObjectRequest = new PutObjectRequest(this.f22026.f5615, str.substring(1), C23852.m52567(interfaceC1274M24729).mo12307(), objectMetadata);
            final AtomicReference atomicReference = new AtomicReference();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C1802.f6208.execute(new Runnable() { // from class: l.۫ۖ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C7190.m19258(this.f36225, putObjectRequest, atomicReference, interfaceC1274M24729, countDownLatch);
                }
            });
            return new C11424(atomicReference, interfaceC10405M52568, countDownLatch);
        }
        final String strSubstring = str.substring(1);
        ObjectMetadata objectMetadata2 = new ObjectMetadata();
        objectMetadata2.m637(C2204.m7292(C9523.m24404(str), true).m7315());
        try {
            final String strM589 = this.f22027.mo435(new InitiateMultipartUploadRequest(this.f22026.f5615, strSubstring, objectMetadata2)).m589();
            final ArrayList arrayList = new ArrayList();
            C9742 c9743 = new C9742(524288L);
            final InterfaceC1274 interfaceC1274M247210 = c9743.m24729();
            InterfaceC10405 interfaceC10405M52569 = C23852.m52568(c9743.m24728());
            final InputStream inputStreamMo12307 = C23852.m52567(interfaceC1274M247210).mo12307();
            final AtomicReference atomicReference2 = new AtomicReference();
            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
            C1802.f6208.execute(new Runnable() { // from class: l.ۤۖ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C7190.m19257(this.f30162, j, inputStreamMo12307, strSubstring, strM589, arrayList, atomicReference2, interfaceC1274M247210, countDownLatch2);
                }
            });
            return new C22712(this, atomicReference2, interfaceC10405M52569, countDownLatch2, strSubstring, strM589, arrayList);
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19257(C7190 c7190, long j, InputStream inputStream, String str, String str2, ArrayList arrayList, AtomicReference atomicReference, InterfaceC1274 interfaceC1274, CountDownLatch countDownLatch) {
        long jM20324 = 0;
        int i = 1;
        while (jM20324 < j) {
            try {
                long jMin = Math.min(104857600L, j - jM20324);
                C7580 c7580 = new C7580(jMin, inputStream);
                UploadPartRequest uploadPartRequest = new UploadPartRequest();
                uploadPartRequest.m678(c7190.f22026.f5615);
                uploadPartRequest.m683(str);
                uploadPartRequest.m688(str2);
                uploadPartRequest.m687(i);
                uploadPartRequest.m677(c7580);
                uploadPartRequest.m682(jMin);
                arrayList.add(c7190.f22027.mo438(uploadPartRequest).m694());
                jM20324 += c7580.m20324();
                i++;
            } catch (Throwable th) {
                try {
                    IOException iOException = new IOException(th.getMessage(), th);
                    while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
                    }
                    try {
                        c7190.f22027.mo439(new AbortMultipartUploadRequest(c7190.f22026.f5615, str, str2));
                    } catch (Throwable unused) {
                    }
                    try {
                        interfaceC1274.close();
                    } catch (IOException e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } finally {
                    try {
                        interfaceC1274.close();
                    } catch (IOException e2) {
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                    countDownLatch.countDown();
                }
            }
        }
        try {
            interfaceC1274.close();
        } catch (IOException e3) {
            while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
            }
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܽ */
    public final void mo9701(String str, boolean z) throws IOException {
        try {
            String strSubstring = str.substring(1);
            if (!z) {
                this.f22027.m451(new DeleteObjectRequest(this.f22026.f5615, strSubstring));
                return;
            }
            String str2 = strSubstring + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM611 = null;
            while (true) {
                ObjectListing objectListingM448 = this.f22027.m448(new ListObjectsRequest(this.f22026.f5615, str2, strM611, null, 1000));
                List list = (List) C5378.stream(objectListingM448.m613()).map(new C1775(2)).collect(C22976.toList());
                DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(this.f22026.f5615);
                deleteObjectsRequest.m560(list);
                deleteObjectsRequest.m561();
                try {
                    this.f22027.m452(deleteObjectsRequest);
                } catch (MultiObjectDeleteException e) {
                    Iterator it = e.m601().iterator();
                    if (it.hasNext()) {
                        throw new IOException(C4925.m14306(R.string.MT_Protector, ((MultiObjectDeleteException.DeleteError) it.next()).m602()));
                    }
                }
                if (objectListingM448.m612() && !threadCurrentThread.isInterrupted()) {
                    strM611 = objectListingM448.m611();
                }
                return;
            }
        } catch (AmazonClientException e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ֫ */
    public final void mo9684(String str, String str2) throws IOException {
        try {
            C3786 c3786 = this.f22028;
            c3786.getClass();
            C13539 c13539 = (C13539) c3786.m11440(C9523.m24406(str), C9523.m24404(str));
            String strSubstring = str.substring(1);
            String strSubstring2 = str2.substring(1);
            if (!(c13539 != null ? c13539.m32582() : !this.f22027.m453(this.f22026.f5615, strSubstring))) {
                if (this.f22027.m453(this.f22026.f5615, strSubstring2)) {
                    throw new IOException(C4925.m14306(R.string.MT_Protector, strSubstring2));
                }
                this.f22027.m450(new CopyObjectRequest(this.f22026.f5615, C12789.encode(strSubstring, StandardCharsets.UTF_8), this.f22026.f5615, strSubstring2));
                this.f22027.m451(new DeleteObjectRequest(this.f22026.f5615, strSubstring));
                return;
            }
            String str3 = strSubstring + "/";
            String str4 = strSubstring2 + "/";
            Thread threadCurrentThread = Thread.currentThread();
            String strM611 = null;
            boolean z = true;
            while (true) {
                ObjectListing objectListingM448 = this.f22027.m448(new ListObjectsRequest(this.f22026.f5615, str3, strM611, null, 1000));
                if (z) {
                    if (!objectListingM448.m613().isEmpty() && !this.f22027.m448(new ListObjectsRequest(this.f22026.f5615, str4, null, null, 1)).m613().isEmpty()) {
                        throw new IOException(C4925.m14306(R.string.MT_Protector, str4));
                    }
                    z = false;
                }
                Iterator it = objectListingM448.m613().iterator();
                while (it.hasNext()) {
                    String strM659 = ((S3ObjectSummary) it.next()).m659();
                    this.f22027.m450(new CopyObjectRequest(this.f22026.f5615, C12789.encode(strM659, StandardCharsets.UTF_8), this.f22026.f5615, str4 + strM659.substring(str3.length())));
                    this.f22027.m451(new DeleteObjectRequest(this.f22026.f5615, strM659));
                    if (threadCurrentThread.isInterrupted()) {
                        break;
                    }
                }
                if (objectListingM448.m612() && !threadCurrentThread.isInterrupted()) {
                    strM611 = objectListingM448.m611();
                }
                return;
            }
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ܿ */
    public final void mo9702(String str) throws IOException {
        try {
            String str2 = str.substring(1) + "/";
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m616(0L);
            this.f22027.mo436(new PutObjectRequest(this.f22026.f5615, str2, new ByteArrayInputStream(new byte[0]), objectMetadata));
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo9691(String str) {
        return this.f22028.m11445(str);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo9703(String str) {
        C3786 c3786 = this.f22028;
        c3786.getClass();
        return c3786.m11440(C9523.m24406(str), C9523.m24404(str)) != null;
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ᩻ */
    public final String mo9709(String str) {
        return this.f22028.m11444(str);
    }

    @Override // l.AbstractC3163
    /* JADX INFO: renamed from: ۢ */
    public final void mo9692(String str) {
        this.f22028.m11442(str);
    }
}
