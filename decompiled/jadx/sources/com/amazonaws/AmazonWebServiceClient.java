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

    /* JADX INFO: renamed from: ᩻ */
    public static final Log f1239 = LogFactory.m1468(AmazonWebServiceClient.class);

    /* JADX INFO: renamed from: ֫ */
    public AmazonHttpClient f1240;

    /* JADX INFO: renamed from: ۧ */
    public ClientConfiguration f1241;

    /* JADX INFO: renamed from: ܳ */
    public volatile Signer f1242;

    /* JADX INFO: renamed from: ܽ */
    public volatile URI f1243;

    /* JADX INFO: renamed from: ܿ */
    public volatile String f1244;

    /* JADX INFO: renamed from: ᩳ */
    public final CopyOnWriteArrayList f1245 = new CopyOnWriteArrayList();

    public AmazonWebServiceClient(ClientConfiguration clientConfiguration, UrlHttpClient urlHttpClient) {
        this.f1241 = clientConfiguration;
        this.f1240 = new AmazonHttpClient(clientConfiguration, urlHttpClient);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo1324(String str) {
        if (!str.contains("://")) {
            str = this.f1241.m1336().toString() + "://" + str;
        }
        try {
            URI uri = new URI(str);
            Signer signerM1318 = m1318(uri, false);
            synchronized (this) {
                this.f1243 = uri;
                this.f1242 = signerM1318;
            }
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Signer m1320(URI uri) {
        return m1318(uri, true);
    }

    /* JADX INFO: renamed from: ֫ */
    private Signer m1318(URI uri, boolean z) {
        Signer signerM1391;
        if (uri == null) {
            throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String strM1321 = m1321();
        String strM1904 = AwsHostNameUtils.m1904(uri.getHost(), strM1321);
        String strM1340 = this.f1241.m1340();
        if (strM1340 == null) {
            signerM1391 = SignerFactory.m1390(strM1321, strM1904);
        } else {
            signerM1391 = SignerFactory.m1391(strM1340, strM1321);
        }
        Signer signer = signerM1391;
        if (signer instanceof RegionAwareSigner) {
            RegionAwareSigner regionAwareSigner = (RegionAwareSigner) signer;
            if (strM1904 != null && z) {
                regionAwareSigner.setRegionName(strM1904);
            }
        }
        synchronized (this) {
            RegionUtils.m1589(strM1904);
        }
        return signer;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m1322(AmazonWebServiceRequest amazonWebServiceRequest) {
        amazonWebServiceRequest.getClass();
        this.f1240.getClass();
        AwsSdkMetrics.m1495();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m1323(AWSRequestMetrics aWSRequestMetrics, DefaultRequest defaultRequest) {
        aWSRequestMetrics.mo1897(AWSRequestMetrics.Field.ClientExecuteTime);
        aWSRequestMetrics.m1896().mo1955();
        defaultRequest.m1358().getClass();
        this.f1240.getClass();
        AwsSdkMetrics.m1495().getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m1321() {
        if (this.f1244 == null) {
            synchronized (this) {
                if (this.f1244 == null) {
                    this.f1244 = m1319();
                    return this.f1244;
                }
            }
        }
        return this.f1244;
    }

    /* JADX INFO: renamed from: ۧ */
    private String m1319() {
        int i;
        String simpleName = Classes.m1926(AmazonWebServiceClient.class, this).getSimpleName();
        String strM1367 = ServiceNameFactory.m1367(simpleName);
        if (strM1367 != null) {
            return strM1367;
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
        return StringUtils.m1954(simpleName.substring(iIndexOf2 + i, iIndexOf));
    }
}
