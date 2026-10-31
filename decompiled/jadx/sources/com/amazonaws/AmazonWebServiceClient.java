package com.amazonaws;

import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Classes;
import com.amazonaws.util.StringUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class AmazonWebServiceClient {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Log f79 = LogFactory.m302(AmazonWebServiceClient.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AmazonHttpClient f80;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ClientConfiguration f81;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile Signer f82;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile URI f83;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile String f84;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f85 = new CopyOnWriteArrayList();

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f81 = clientConfiguration;
        this.f80 = new AmazonHttpClient(clientConfiguration, urlHttpClient);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo157(String str) {
        if (!str.contains("://")) {
            str = this.f81.m170().toString() + "://" + str;
        }
        try {
            URI uri = new URI(str);
            Signer signerM151 = m151(uri, false);
            synchronized (this) {
                this.f83 = uri;
                this.f82 = signerM151;
            }
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Signer m153(URI uri) {
        return m151(uri, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Signer m151(URI uri, boolean z) {
        Signer signerM225;
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String strM154 = m154();
        String strM739 = AwsHostNameUtils.m739(uri.getHost(), strM154);
        String strM174 = this.f81.m174();
        if (strM174 == null) {
            signerM225 = SignerFactory.m224(strM154, strM739);
        } else {
            signerM225 = SignerFactory.m225(strM174, strM154);
        }
        Signer signer = signerM225;
        if (signer instanceof RegionAwareSigner) {
            RegionAwareSigner regionAwareSigner = (RegionAwareSigner) signer;
            if (strM739 != null && z) {
                regionAwareSigner.setRegionName(strM739);
            }
        }
        synchronized (this) {
            RegionUtils.m423(strM739);
        }
        return signer;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m155(AmazonWebServiceRequest amazonWebServiceRequest) {
        amazonWebServiceRequest.getClass();
        this.f80.getClass();
        AwsSdkMetrics.m329();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m156(AWSRequestMetrics aWSRequestMetrics, DefaultRequest defaultRequest) {
        aWSRequestMetrics.mo732(AWSRequestMetrics.Field.ClientExecuteTime);
        aWSRequestMetrics.m731().mo790();
        defaultRequest.m192().getClass();
        this.f80.getClass();
        AwsSdkMetrics.m329().getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m154() {
        if (this.f84 == null) {
            synchronized (this) {
                if (this.f84 == null) {
                    this.f84 = m152();
                    return this.f84;
                }
            }
        }
        return this.f84;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m152() {
        int i;
        String simpleName = Classes.m761(AmazonWebServiceClient.class, this).getSimpleName();
        String strM201 = ServiceNameFactory.m201(simpleName);
        if (strM201 != null) {
            return strM201;
        }
        int iIndexOf = simpleName.indexOf("JavaClient");
        if (iIndexOf == -1 && (iIndexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException("Unrecognized suffix for the AWS http client class name ".concat(simpleName));
        }
        int iIndexOf2 = simpleName.indexOf("Amazon");
        if (iIndexOf2 == -1) {
            iIndexOf2 = simpleName.indexOf("AWS");
            if (iIndexOf2 == -1) {
                throw new IllegalStateException("Unrecognized prefix for the AWS http client class name ".concat(simpleName));
            }
            i = 3;
        } else {
            i = 6;
        }
        if (iIndexOf2 >= iIndexOf) {
            throw new IllegalStateException("Unrecognized AWS http client class name ".concat(simpleName));
        }
        return StringUtils.m789(simpleName.substring(iIndexOf2 + i, iIndexOf));
    }
}
