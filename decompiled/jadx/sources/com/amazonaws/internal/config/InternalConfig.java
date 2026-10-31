package com.amazonaws.internal.config;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.C20195;
import l.C22870;

/* JADX INFO: loaded from: classes.dex */
public class InternalConfig {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Log f215 = LogFactory.m302(InternalConfig.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SignerConfig f216 = new SignerConfig("AWS4SignerType");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f217;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f218;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f219;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f220;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f221;

    public InternalConfig() {
        HashMap map = new HashMap();
        map.put("eu-central-1", new SignerConfig("AWS4SignerType"));
        map.put("cn-north-1", new SignerConfig("AWS4SignerType"));
        this.f221 = map;
        HashMap map2 = new HashMap();
        map2.put("ec2", new SignerConfig("QueryStringSignerType"));
        map2.put("email", new SignerConfig("AWS4SignerType"));
        map2.put("s3", new SignerConfig("AWSS3V4SignerType"));
        map2.put("sdb", new SignerConfig("QueryStringSignerType"));
        map2.put("lex", new SignerConfig("AmazonLexV4Signer"));
        map2.put("polly", new SignerConfig("AmazonPollyCustomPresigner"));
        this.f218 = map2;
        HashMap map3 = new HashMap();
        map3.put("s3/eu-central-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/cn-north-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/us-east-2", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/ca-central-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/ap-south-1", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/ap-northeast-2", new SignerConfig("AWSS3V4SignerType"));
        map3.put("s3/eu-west-2", new SignerConfig("AWSS3V4SignerType"));
        map3.put("lex/eu-central-1", new SignerConfig("AmazonLexV4Signer"));
        map3.put("lex/cn-north-1", new SignerConfig("AmazonLexV4Signer"));
        map3.put("polly/eu-central-1", new SignerConfig("AmazonPollyCustomPresigner"));
        map3.put("polly/cn-north-1", new SignerConfig("AmazonPollyCustomPresigner"));
        this.f220 = map3;
        HashMap map4 = new HashMap();
        map4.put("AmazonCloudWatchClient", new HttpClientConfig("monitoring"));
        map4.put("AmazonCloudWatchLogsClient", new HttpClientConfig("logs"));
        map4.put("AmazonCognitoIdentityClient", new HttpClientConfig("cognito-identity"));
        map4.put("AmazonCognitoIdentityProviderClient", new HttpClientConfig("cognito-idp"));
        map4.put("AmazonCognitoSyncClient", new HttpClientConfig("cognito-sync"));
        map4.put("AmazonComprehendClient", new HttpClientConfig("comprehend"));
        map4.put("AmazonConnectClient", new HttpClientConfig("connect"));
        map4.put("AmazonKinesisFirehoseClient", new HttpClientConfig("firehose"));
        map4.put("AWSKinesisVideoArchivedMediaClient", new HttpClientConfig("kinesisvideo"));
        map4.put("AWSKinesisVideoSignalingClient", new HttpClientConfig("kinesisvideo"));
        map4.put("AWSIotClient", new HttpClientConfig("execute-api"));
        map4.put("AmazonLexRuntimeClient", new HttpClientConfig("lex"));
        map4.put("AmazonPinpointClient", new HttpClientConfig("mobiletargeting"));
        map4.put("AmazonPinpointAnalyticsClient", new HttpClientConfig("mobileanalytics"));
        map4.put("AmazonSageMakerRuntimeClient", new HttpClientConfig("sagemaker"));
        map4.put("AmazonSimpleDBClient", new HttpClientConfig("sdb"));
        map4.put("AmazonSimpleEmailServiceClient", new HttpClientConfig("email"));
        map4.put("AWSSecurityTokenServiceClient", new HttpClientConfig("sts"));
        map4.put("AmazonTextractClient", new HttpClientConfig("textract"));
        map4.put("AmazonTranscribeClient", new HttpClientConfig("transcribe"));
        map4.put("AmazonTranslateClient", new HttpClientConfig("translate"));
        this.f219 = map4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-external-1\\.amazonaws\\.com", "us-east-1"));
        arrayList.add(new HostRegexToRegionMapping("(.+\\.)?s3-fips-us-gov-west-1\\.amazonaws\\.com", "us-gov-west-1"));
        this.f217 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HttpClientConfig m286(String str) {
        return (HttpClientConfig) this.f219.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SignerConfig m287(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (str2 != null) {
            SignerConfig signerConfig = (SignerConfig) this.f220.get(C22870.m50967(str, "/", str2));
            if (signerConfig != null) {
                return signerConfig;
            }
            SignerConfig signerConfig2 = (SignerConfig) this.f221.get(str2);
            if (signerConfig2 != null) {
                return signerConfig2;
            }
        }
        SignerConfig signerConfig3 = (SignerConfig) this.f218.get(str);
        return signerConfig3 == null ? this.f216 : signerConfig3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m288() {
        return C20195.unmodifiableList(this.f217);
    }

    public class Factory {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static final InternalConfig f222;

        static {
            try {
                f222 = new InternalConfig();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException("Fatal: Failed to load the internal config for AWS Android SDK", e2);
            }
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static InternalConfig m289() {
            return f222;
        }
    }
}
