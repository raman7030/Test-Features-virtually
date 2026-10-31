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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream f99;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f100;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public URI f102;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AmazonWebServiceRequest f103;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AWSRequestMetrics f105;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f101 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f108 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f104 = new HashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HttpMethodName f106 = HttpMethodName.POST;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f107 = "Amazon S3";

    public DefaultRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        this.f103 = amazonWebServiceRequest;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AmazonWebServiceRequest m192() {
        return this.f103;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m182(String str, String str2) {
        this.f104.put(str, str2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap m191() {
        return this.f104;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m181(String str) {
        this.f100 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m195() {
        return this.f100;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m189(String str, String str2) {
        this.f108.put(str, str2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m190() {
        return this.f108;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HttpMethodName m193() {
        return this.f106;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m178(HttpMethodName httpMethodName) {
        this.f106 = httpMethodName;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m183(URI uri) {
        this.f102 = uri;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final URI m188() {
        return this.f102;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m186() {
        return this.f107;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m177() {
        return this.f99;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m180(InputStream inputStream) {
        this.f99 = inputStream;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m184(HashMap map) {
        HashMap map2 = this.f104;
        map2.clear();
        map2.putAll(map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m185(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = this.f108;
        linkedHashMap2.clear();
        linkedHashMap2.putAll(linkedHashMap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f106);
        sb.append(" ");
        sb.append(this.f102);
        sb.append(" ");
        String str = this.f100;
        if (str == null) {
            sb.append("/");
        } else {
            if (!str.startsWith("/")) {
                sb.append("/");
            }
            sb.append(str);
        }
        sb.append(" ");
        LinkedHashMap linkedHashMap = this.f108;
        if (!linkedHashMap.isEmpty()) {
            sb.append("Parameters: (");
            for (String str2 : linkedHashMap.keySet()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str2, ": ", (String) linkedHashMap.get(str2), ", ");
            }
            sb.append(") ");
        }
        HashMap map = this.f104;
        if (!map.isEmpty()) {
            sb.append("Headers: (");
            for (String str3 : map.keySet()) {
                ASN1BMPString$$ExternalSyntheticOutline0.m(sb, str3, ": ", (String) map.get(str3), ", ");
            }
            sb.append(") ");
        }
        return sb.toString();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m179(AWSRequestMetrics aWSRequestMetrics) {
        if (this.f105 == null) {
            this.f105 = aWSRequestMetrics;
            return;
        }
        throw new IllegalStateException("AWSRequestMetrics has already been set on this request");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m194() {
        return this.f101;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m187() {
        this.f101 = true;
    }
}
