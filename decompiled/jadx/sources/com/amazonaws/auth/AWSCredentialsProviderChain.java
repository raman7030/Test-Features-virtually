package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class AWSCredentialsProviderChain implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ᩳ */
    public static final Log f1284 = LogFactory.m1468(AWSCredentialsProviderChain.class);

    /* JADX INFO: renamed from: ۧ */
    public AWSCredentialsProvider f1286;

    /* JADX INFO: renamed from: ֫ */
    public LinkedList f1285 = new LinkedList();

    /* JADX INFO: renamed from: ܽ */
    public boolean f1287 = true;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        for (AWSCredentialsProvider aWSCredentialsProvider : aWSCredentialsProviderArr) {
            this.f1285.add(aWSCredentialsProvider);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ֫ */
    public final AWSCredentials mo1374() {
        AWSCredentialsProvider aWSCredentialsProvider;
        Log log = f1284;
        if (this.f1287 && (aWSCredentialsProvider = this.f1286) != null) {
            return aWSCredentialsProvider.mo1374();
        }
        for (AWSCredentialsProvider aWSCredentialsProvider2 : this.f1285) {
            try {
                AWSCredentials aWSCredentialsMo1374 = aWSCredentialsProvider2.mo1374();
                if (aWSCredentialsMo1374.mo1372() != null && aWSCredentialsMo1374.mo1373() != null) {
                    log.mo1460("Loading credentials from " + aWSCredentialsProvider2.toString());
                    this.f1286 = aWSCredentialsProvider2;
                    return aWSCredentialsMo1374;
                }
            } catch (Exception e) {
                log.mo1460("Unable to load credentials from " + aWSCredentialsProvider2.toString() + ": " + e.getMessage());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }
}
