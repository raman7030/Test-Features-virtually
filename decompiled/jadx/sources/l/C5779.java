package l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5779 implements InterfaceC15779 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7190 f17770;

    public C5779(C7190 c7190) {
        this.f17770 = c7190;
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3327(Object obj) {
        return ((C13539) obj).m32582();
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ۧ */
    public final String mo3328(Object obj) {
        return ((C13539) obj).m32581();
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ֫ */
    public final List mo3326(String str) throws IOException {
        C7190 c7190 = this.f17770;
        try {
            String strSubstring = AbstractC16891.m39731(str).substring(1);
            ArrayList arrayList = new ArrayList();
            String strM611 = null;
            while (true) {
                ObjectListing objectListingM448 = c7190.f22027.m448(new ListObjectsRequest(C7190.m19260(c7190), strSubstring, strM611, "/", 1000));
                Iterator it = objectListingM448.m609().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C13539((String) it.next()));
                }
                for (S3ObjectSummary s3ObjectSummary : objectListingM448.m613()) {
                    if (!s3ObjectSummary.m659().endsWith("/")) {
                        arrayList.add(new C13539(s3ObjectSummary));
                    }
                }
                if (!objectListingM448.m612() || Thread.currentThread().isInterrupted()) {
                    break;
                    break;
                }
                strM611 = objectListingM448.m611();
            }
            return arrayList;
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
