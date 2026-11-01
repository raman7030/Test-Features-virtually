package com.amazonaws;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRequest implements Request {

    /* JADX INFO: renamed from: ֫ */
    public InputStream f1259;

    /* JADX INFO: renamed from: ۜ */
    public String f1260;

    /* JADX INFO: renamed from: ۧ */
    public URI f1262;

    /* JADX INFO: renamed from: ܳ */
    public final AmazonWebServiceRequest f1263;

    /* JADX INFO: renamed from: ܿ */
    public AWSRequestMetrics f1265;

    /* JADX INFO: renamed from: ۢ */
    public boolean f1261 = false;

    /* JADX INFO: renamed from: ᩻ */
    public final LinkedHashMap f1268 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f1264 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public HttpMethodName f1266 = HttpMethodName.POST;

    /* JADX INFO: renamed from: ᩷ */
    public String f1267 = "Amazon S3";

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        this.f1263 = amazonWebServiceRequest;
    }

    /* JADX INFO: renamed from: ܿ */
    public final AmazonWebServiceRequest m1358() {
        return this.f1263;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1348(String str, String str2) {
        this.f1264.put(str, str2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final HashMap m1357() {
        return this.f1264;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1347(String str) {
        this.f1260 = str;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m1361() {
        return this.f1260;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1355(String str, String str2) {
        this.f1268.put(str, str2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final LinkedHashMap m1356() {
        return this.f1268;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final HttpMethodName m1359() {
        return this.f1266;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1344(HttpMethodName httpMethodName) {
        this.f1266 = httpMethodName;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1349(URI uri) {
        this.f1262 = uri;
    }

    /* JADX INFO: renamed from: ۧ */
    public final URI m1354() {
        return this.f1262;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m1352() {
        return this.f1267;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m1343() {
        return this.f1259;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1346(InputStream inputStream) {
        this.f1259 = inputStream;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1350(HashMap map) {
        HashMap map2 = this.f1264;
        map2.clear();
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1351(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = this.f1268;
        linkedHashMap2.clear();
        linkedHashMap2.putAll(linkedHashMap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1266);
        sb.append(" ");
        sb.append(this.f1262);
        sb.append(" ");
        String str = this.f1260;
        if (str == null) {
            sb.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str);
        }
        sb.append(" ");
        LinkedHashMap linkedHashMap = this.f1268;
        if (!linkedHashMap.isEmpty()) {
            sb.append("Parameters: (");
            for (String str2 : linkedHashMap.keySet()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, str2, ": ", (String) linkedHashMap.get(str2), ", ");
            }
            sb.append(") ");
        }
        HashMap map = this.f1264;
        if (!map.isEmpty()) {
            sb.append("Headers: (");
            for (String str3 : map.keySet()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, str3, ": ", (String) map.get(str3), ", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m1345(AWSRequestMetrics aWSRequestMetrics) {
        if (this.f1265 == null) {
            this.f1265 = aWSRequestMetrics;
            return;
        }
        throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m1360() {
        return this.f1261;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m1353() {
        this.f1261 = true;
    }
}
