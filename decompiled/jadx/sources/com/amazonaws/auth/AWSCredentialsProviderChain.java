package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class AWSCredentialsProviderChain implements AWSCredentialsProvider {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Log f124 = LogFactory.m302(AWSCredentialsProviderChain.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AWSCredentialsProvider f126;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedList f125 = new LinkedList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f127 = true;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        for (AWSCredentialsProvider aWSCredentialsProvider : aWSCredentialsProviderArr) {
            this.f125.add(aWSCredentialsProvider);
        }
    }

    @Override // com.amazonaws.auth.AWSCredentialsProvider
    /* JADX INFO: renamed from: ֫ */
    public final AWSCredentials mo208() {
        AWSCredentialsProvider aWSCredentialsProvider;
        Log log = f124;
        if (this.f127 && (aWSCredentialsProvider = this.f126) != null) {
            return aWSCredentialsProvider.mo208();
        }
        for (AWSCredentialsProvider aWSCredentialsProvider2 : this.f125) {
            try {
                AWSCredentials aWSCredentialsMo208 = aWSCredentialsProvider2.mo208();
                if (aWSCredentialsMo208.mo206() != null && aWSCredentialsMo208.mo207() != null) {
                    log.mo294("Loading credentials from " + aWSCredentialsProvider2.toString());
                    this.f126 = aWSCredentialsProvider2;
                    return aWSCredentialsMo208;
                }
            } catch (Exception e) {
                log.mo294("Unable to load credentials from " + aWSCredentialsProvider2.toString() + ": " + e.getMessage());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }
}
