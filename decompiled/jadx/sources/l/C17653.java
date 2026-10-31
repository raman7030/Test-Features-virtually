package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: renamed from: l.ܿ᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8X0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17653 extends AbstractC12382 {
    @Override // l.AbstractC12382
    /* JADX INFO: renamed from: ֫ */
    public final C1093 mo19978(String str) {
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
            return AbstractC8149.m21620(new BufferedInputStream(httpURLConnection.getInputStream()), headerField);
        } catch (IOException e) {
            throw new IllegalStateException(C20094.m46315("Exception obtaining network resource: ", str), e);
        }
    }

    @Override // l.AbstractC12382
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo19977() {
        return Arrays.asList(a.s, b.a);
    }
}
