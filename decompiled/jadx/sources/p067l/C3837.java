package p067l;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.p061s3.AmazonS3Client;
import com.amazonaws.services.p061s3.model.GetObjectRequest;
import java.net.URI;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3837 extends AmazonS3Client {

    /* JADX INFO: renamed from: ֡ */
    public URI f8236;

    static {
        SignerFactory.m1389(C12594.class, "UnsignedPayloadSignerType");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7522(URI uri) {
        this.f8236 = uri;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7521(boolean z) {
        this.f1630.m1620(z);
    }

    @Override // com.amazonaws.services.p061s3.AmazonS3Client, com.amazonaws.AmazonWebServiceClient
    /* JADX INFO: renamed from: ֫ */
    public final void mo1324(String str) {
        if (m7520(str)) {
            ClientConfiguration clientConfiguration = this.f1241;
            clientConfiguration.m1341();
            clientConfiguration.m1335();
        }
        super.mo1324(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m7520(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int iIndexOf = lowerCase.indexOf("://");
        if (iIndexOf >= 0) {
            lowerCase = lowerCase.substring(iIndexOf + 3);
        }
        int iIndexOf2 = lowerCase.indexOf(47);
        if (iIndexOf2 >= 0) {
            lowerCase = lowerCase.substring(0, iIndexOf2);
        }
        int iIndexOf3 = lowerCase.indexOf(58);
        if (iIndexOf3 >= 0) {
            lowerCase = lowerCase.substring(0, iIndexOf3);
        }
        return "s3.cstcloud.cn".equals(lowerCase);
    }

    @Override // com.amazonaws.services.p061s3.AmazonS3Client
    /* JADX INFO: renamed from: ֫ */
    public final void mo1615(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        if (this.f8236 != null && (defaultRequest.m1358() instanceof GetObjectRequest)) {
            defaultRequest.m1349(this.f8236);
            if (str2 != null && str2.startsWith("/")) {
                str2 = "/".concat(str2);
            }
            defaultRequest.m1347(str2);
            return;
        }
        super.mo1615(defaultRequest, str, str2, uri);
    }
}
