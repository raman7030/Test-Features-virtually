package p067l;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܿ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8X0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19146 extends AbstractC14136 {
    @Override // p067l.AbstractC14136
    /* JADX INFO: renamed from: ֫ */
    public final C3407 mo21953(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                throw new IOException("Bad response code: " + responseCode + ", url: " + str);
            }
            String headerField = httpURLConnection.getHeaderField("Content-Type");
            if (headerField == null) {
                headerField = null;
            } else {
                int iIndexOf = headerField.indexOf(59);
                if (iIndexOf > -1) {
                    headerField = headerField.substring(0, iIndexOf);
                }
            }
            return AbstractC10113.m23588(new BufferedInputStream(httpURLConnection.getInputStream()), headerField);
        } catch (IOException e) {
            throw new IllegalStateException(C21466.m48631("Exception obtaining network resource: ", str), e);
        }
    }

    @Override // p067l.AbstractC14136
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo21952() {
        return Arrays.asList(C0170a.f680s, C0171b.f688a);
    }
}
