package p067l;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.p061s3.model.ListObjectsRequest;
import com.amazonaws.services.p061s3.model.ObjectListing;
import com.amazonaws.services.p061s3.model.S3ObjectSummary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes3.dex */
public final class C7861 implements InterfaceC17365 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9202 f20616;

    public C7861(C9202 c9202) {
        this.f20616 = c9202;
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5646(Object obj) {
        return ((C15236) obj).m34685();
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ۧ */
    public final String mo5647(Object obj) {
        return ((C15236) obj).m34684();
    }

    @Override // p067l.InterfaceC17365
    /* JADX INFO: renamed from: ֫ */
    public final List mo5645(String str) throws IOException {
        C9202 c9202 = this.f20616;
        try {
            String strSubstring = AbstractC18422.m41972(str).substring(1);
            ArrayList arrayList = new ArrayList();
            String strM1777 = null;
            while (true) {
                ObjectListing objectListingM1614 = c9202.f24905.m1614(new ListObjectsRequest(C9202.m21207(c9202), strSubstring, strM1777, "/", 1000));
                Iterator it = objectListingM1614.m1775().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C15236((String) it.next()));
                }
                for (S3ObjectSummary s3ObjectSummary : objectListingM1614.m1779()) {
                    if (!s3ObjectSummary.m1824().endsWith("/")) {
                        arrayList.add(new C15236(s3ObjectSummary));
                    }
                }
                if (!objectListingM1614.m1778() || Thread.currentThread().isInterrupted()) {
                    break;
                    break;
                }
                strM1777 = objectListingM1614.m1777();
            }
            return arrayList;
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
