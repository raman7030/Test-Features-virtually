package com.amazonaws.services.s3;

import com.alipay.sdk.m.p.a;
import com.amazonaws.AbortedException;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.event.ProgressReportingInputStream;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3MetadataResponseHandler;
import com.amazonaws.services.s3.internal.S3ObjectResponseHandler;
import com.amazonaws.services.s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.HeadBucketResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.s3.model.transform.MultiObjectDeleteXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.services.s3.util.Mimetypes;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.ServiceClientHolderInputStream;
import com.amazonaws.util.ValidationUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C16014;
import l.C19370;
import l.C20094;
import l.C20195;
import l.C5368;
import l.C7166;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Map f462;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static Log f463 = LogFactory.m302(AmazonS3Client.class);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f464;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final S3XmlResponseHandler f465;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AWSCredentialsProvider f466;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CompleteMultipartUploadRetryCondition f467;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile String f468;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final S3ErrorResponseHandler f469;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public S3ClientOptions f470;

    static {
        AwsSdkMetrics.m315(Arrays.asList(S3ServiceMetric.m492()));
        SignerFactory.m223(AWSS3V4Signer.class, "AWSS3V4SignerType");
        new BucketConfigurationXmlFactory();
        new RequestPaymentConfigurationXmlFactory();
        f462 = C20195.synchronizedMap(new AnonymousClass1(300, 1.1f, true));
    }

    /* JADX INFO: renamed from: com.amazonaws.services.s3.AmazonS3Client$1, reason: invalid class name */
    public final class AnonymousClass1 extends LinkedHashMap {
        public static final long serialVersionUID = 23453;

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry entry) {
            return size() > 300;
        }
    }

    @Deprecated
    public AmazonS3Client() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    @Deprecated
    public AmazonS3Client(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration, new UrlHttpClient(clientConfiguration));
        this.f469 = new S3ErrorResponseHandler();
        this.f465 = new S3XmlResponseHandler(null);
        this.f470 = new S3ClientOptions();
        this.f464 = 1024;
        this.f467 = new CompleteMultipartUploadRetryCondition();
        this.f466 = aWSCredentialsProvider;
        mo157("s3.amazonaws.com");
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f85;
        copyOnWriteArrayList.addAll(handlerChainFactory.m237());
        copyOnWriteArrayList.addAll(handlerChainFactory.m236());
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    /* JADX INFO: renamed from: ֫ */
    public void mo157(String str) {
        if (str.endsWith("s3-accelerate.amazonaws.com")) {
            throw new IllegalStateException("To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());");
        }
        super.mo157(str);
        if (str.endsWith("s3.amazonaws.com")) {
            return;
        }
        this.f468 = AwsHostNameUtils.m739(this.f83.getHost(), "s3");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ObjectListing m448(ListObjectsRequest listObjectsRequest) {
        ValidationUtils.m797(listObjectsRequest.m599(), "The bucket name parameter must be specified when listing objects in a bucket");
        final boolean zEquals = "url".equals(null);
        DefaultRequest defaultRequestM446 = m446(listObjectsRequest.m599(), null, listObjectsRequest, HttpMethodName.GET, null);
        String strM600 = listObjectsRequest.m600();
        if (strM600 != null) {
            defaultRequestM446.m189("prefix", strM600);
        }
        String strM598 = listObjectsRequest.m598();
        if (strM598 != null) {
            defaultRequestM446.m189("delimiter", strM598);
        }
        String strM597 = listObjectsRequest.m597();
        if (strM597 != null) {
            defaultRequestM446.m189("marker", strM597);
        }
        if (listObjectsRequest.m596() != null && listObjectsRequest.m596().intValue() >= 0) {
            defaultRequestM446.m189("max-keys", listObjectsRequest.m596().toString());
        }
        Unmarshaller unmarshaller = new Unmarshaller(zEquals) { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsUnmarshaller

            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final boolean f688;

            {
                this.f688 = zEquals;
            }

            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ֫ */
            public final Object mo706(InputStream inputStream) {
                return new XmlResponsesSaxParser().m712(inputStream, this.f688).m728();
            }
        };
        return (ObjectListing) m440(defaultRequestM446, new S3XmlResponseHandler(unmarshaller), listObjectsRequest.m599(), (String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m453(String str, String str2) {
        try {
            GetObjectMetadataRequest getObjectMetadataRequest = new GetObjectMetadataRequest(str, str2);
            String strM567 = getObjectMetadataRequest.m567();
            String strM566 = getObjectMetadataRequest.m566();
            ValidationUtils.m797(strM567, "The bucket name parameter must be specified when requesting an object's metadata");
            ValidationUtils.m797(strM566, "The key parameter must be specified when requesting an object's metadata");
            return true;
        } catch (AmazonS3Exception e) {
            if (e.m149() == 404) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final S3Object mo437(GetObjectRequest getObjectRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        ValidationUtils.m797(getObjectRequest.m573(), "The bucket name parameter must be specified when requesting an object");
        ValidationUtils.m797(getObjectRequest.m572(), "The key parameter must be specified when requesting an object");
        DefaultRequest defaultRequestM446 = m446(getObjectRequest.m573(), getObjectRequest.m572(), getObjectRequest, HttpMethodName.GET, null);
        getObjectRequest.m570();
        long[] jArrM574 = getObjectRequest.m574();
        if (jArrM574 != null) {
            String string = "bytes=" + Long.toString(jArrM574[0]) + "-";
            if (jArrM574[1] >= 0) {
                StringBuilder sbM15339 = C5368.m15339(string);
                sbM15339.append(Long.toString(jArrM574[1]));
                string = sbM15339.toString();
            }
            defaultRequestM446.m182("Range", string);
        }
        m443(defaultRequestM446, "If-Match", getObjectRequest.m571());
        m443(defaultRequestM446, "If-None-Match", getObjectRequest.m569());
        ProgressListener progressListenerMo158 = getObjectRequest.mo158();
        if (progressListenerMo158 == null) {
            int i = ProgressListenerCallbackExecutor.f168;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo158);
        }
        try {
            S3Object s3Object = (S3Object) m440(defaultRequestM446, new S3ObjectResponseHandler(), getObjectRequest.m573(), getObjectRequest.m572());
            s3Object.m652(getObjectRequest.m573());
            s3Object.m653(getObjectRequest.m572());
            FilterInputStream serviceClientHolderInputStream = new ServiceClientHolderInputStream(s3Object.m650());
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(serviceClientHolderInputStream, progressListenerCallbackExecutor);
                progressReportingInputStream.m233();
                progressReportingInputStream.m232(this.f464);
                m444(progressListenerCallbackExecutor, 2);
                serviceClientHolderInputStream = progressReportingInputStream;
            }
            s3Object.m651(new S3ObjectInputStream(new LengthCheckInputStream(serviceClientHolderInputStream, s3Object.m654().m615(), true)));
            return s3Object;
        } catch (AmazonS3Exception e) {
            if (e.m149() == 412 || e.m149() == 304) {
                m444(progressListenerCallbackExecutor, 16);
                return null;
            }
            m444(progressListenerCallbackExecutor, 8);
            throw e;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x022e */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        throw r0;
     */
    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PutObjectResult mo436(PutObjectRequest putObjectRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        InputStream repeatableFileInputStream;
        InputStream inputStream;
        String strM518 = putObjectRequest.m518();
        String strM504 = putObjectRequest.m504();
        ObjectMetadata objectMetadataM519 = putObjectRequest.m519();
        InputStream inputStreamM512 = putObjectRequest.m512();
        ProgressListener progressListenerMo158 = putObjectRequest.mo158();
        if (progressListenerMo158 == null) {
            int i = ProgressListenerCallbackExecutor.f168;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo158);
        }
        if (objectMetadataM519 == null) {
            objectMetadataM519 = new ObjectMetadata();
        }
        ObjectMetadata objectMetadata = objectMetadataM519;
        ValidationUtils.m797(strM518, "The bucket name parameter must be specified when uploading an object");
        ValidationUtils.m797(strM504, "The key parameter must be specified when uploading an object");
        boolean zM487 = ServiceUtils.m487(putObjectRequest);
        if (putObjectRequest.m513() != null) {
            File fileM513 = putObjectRequest.m513();
            objectMetadata.m616(fileM513.length());
            boolean z = objectMetadata.m631() == null;
            if (objectMetadata.m634() == null) {
                objectMetadata.m637(Mimetypes.m729().m730(fileM513));
            }
            if (z && !zM487) {
                try {
                    objectMetadata.m625(Base64.m744(Md5Utils.m784(new FileInputStream(fileM513))));
                } catch (Exception e) {
                    throw new AmazonClientException(C19370.m44629(e, new StringBuilder("Unable to calculate MD5 hash: ")), e);
                }
            }
            try {
                repeatableFileInputStream = new RepeatableFileInputStream(fileM513);
            } catch (FileNotFoundException e2) {
                throw new AmazonClientException("Unable to find file to upload", e2);
            }
        } else {
            repeatableFileInputStream = inputStreamM512;
        }
        DefaultRequest defaultRequestM446 = m446(strM518, strM504, putObjectRequest, HttpMethodName.PUT, null);
        if (putObjectRequest.m516() != null) {
            defaultRequestM446.m182("x-amz-acl", putObjectRequest.m516().toString());
        }
        if (putObjectRequest.m514() != null) {
            defaultRequestM446.m182("x-amz-storage-class", putObjectRequest.m514());
        }
        InputStream byteArrayInputStream = repeatableFileInputStream;
        if (putObjectRequest.m506() != null) {
            defaultRequestM446.m182("x-amz-website-redirect-location", putObjectRequest.m506());
            if (repeatableFileInputStream == null) {
                byteArrayInputStream = repeatableFileInputStream;
                defaultRequestM446.m182("Content-Length", String.valueOf(0));
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
        }
        byteArrayInputStream = repeatableFileInputStream;
        String strM441 = m441(putObjectRequest.m503());
        if (strM441 != null) {
            defaultRequestM446.m182("x-amz-tagging", strM441);
        }
        if (putObjectRequest.m649()) {
            defaultRequestM446.m182("x-amz-request-payer", "requester");
        }
        Long l2 = (Long) objectMetadata.m626();
        long j = 0;
        Log log = f463;
        if (l2 == null) {
            int i2 = -1;
            if (byteArrayInputStream.markSupported()) {
                byte[] bArr = new byte[8192];
                byteArrayInputStream.mark(-1);
                while (true) {
                    try {
                        int i3 = byteArrayInputStream.read(bArr);
                        if (i3 == i2) {
                            break;
                        }
                        j += (long) i3;
                        i2 = -1;
                    } catch (IOException e3) {
                        throw new AmazonClientException("Could not calculate content length.", e3);
                    }
                }
                byteArrayInputStream.reset();
                defaultRequestM446.m182("Content-Length", String.valueOf(j));
                inputStream = byteArrayInputStream;
            } else {
                log.mo300("No content length specified for stream data.  Stream contents will be buffered in memory and could result in out of memory errors.");
                int i4 = 262144;
                byte[] bArr2 = new byte[262144];
                int i5 = 0;
                while (i4 > 0) {
                    try {
                        int i6 = byteArrayInputStream.read(bArr2, i5, i4);
                        if (i6 == -1) {
                            break;
                        }
                        i5 += i6;
                        i4 -= i6;
                    } catch (IOException e4) {
                        throw new AmazonClientException("Failed to read from inputstream", e4);
                    }
                }
                if (byteArrayInputStream.read() != -1) {
                    throw new AmazonClientException("Input stream exceeds 256k buffer.");
                }
                byteArrayInputStream.close();
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2, 0, i5);
                defaultRequestM446.m182("Content-Length", String.valueOf(byteArrayInputStream2.available()));
                defaultRequestM446.m187();
                inputStream = byteArrayInputStream2;
            }
        } else {
            long jLongValue = l2.longValue();
            if (jLongValue >= 0) {
                inputStream = byteArrayInputStream;
                InputStream lengthCheckInputStream = new LengthCheckInputStream(byteArrayInputStream, jLongValue, false);
                defaultRequestM446.m182("Content-Length", l2.toString());
                inputStream = lengthCheckInputStream;
            }
        }
        if (progressListenerCallbackExecutor != null) {
            ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputStream, progressListenerCallbackExecutor);
            progressReportingInputStream.m232(this.f464);
            m444(progressListenerCallbackExecutor, 2);
            inputStream = progressReportingInputStream;
        }
        if (objectMetadata.m634() == null) {
            objectMetadata.m637("application/octet-stream");
        }
        m442(defaultRequestM446, objectMetadata);
        SSEAwsKeyManagementParams sSEAwsKeyManagementParamsM505 = putObjectRequest.m505();
        if (sSEAwsKeyManagementParamsM505 != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestM446.m182("x-amz-server-side-encryption", algorithm);
            }
            String strM671 = sSEAwsKeyManagementParamsM505.m671();
            if (strM671 != null) {
                defaultRequestM446.m182("x-amz-server-side-encryption-aws-kms-key-id", strM671);
            }
        }
        defaultRequestM446.m180(inputStream);
        try {
            ObjectMetadata objectMetadata2 = (ObjectMetadata) m440(defaultRequestM446, new S3MetadataResponseHandler(), strM518, strM504);
            try {
                inputStream.close();
            } catch (AbortedException unused) {
            } catch (Exception e5) {
                log.mo292("Unable to cleanly close input stream: " + e5.getMessage(), e5);
            }
            m444(progressListenerCallbackExecutor, 4);
            PutObjectResult putObjectResult = new PutObjectResult();
            objectMetadata2.m614();
            putObjectResult.mo485(objectMetadata2.m630());
            putObjectResult.mo482(objectMetadata2.m621());
            putObjectResult.mo484(objectMetadata2.m622());
            objectMetadata2.m628();
            objectMetadata2.m633();
            objectMetadata2.m623();
            objectMetadata2.m631();
            return putObjectResult;
        } catch (AmazonClientException e6) {
            m444(progressListenerCallbackExecutor, 8);
            throw e6;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m450(CopyObjectRequest copyObjectRequest) {
        ValidationUtils.m797(copyObjectRequest.m549(), "The source bucket name must be specified when copying an object");
        ValidationUtils.m797(copyObjectRequest.m545(), "The source object key must be specified when copying an object");
        ValidationUtils.m797(copyObjectRequest.m548(), "The destination bucket name must be specified when copying an object");
        ValidationUtils.m797(copyObjectRequest.m547(), "The destination object key must be specified when copying an object");
        String strM547 = copyObjectRequest.m547();
        String strM548 = copyObjectRequest.m548();
        DefaultRequest defaultRequestM446 = m446(strM548, strM547, copyObjectRequest, HttpMethodName.PUT, null);
        defaultRequestM446.m182("x-amz-copy-source", "/" + copyObjectRequest.m549() + "/" + copyObjectRequest.m545());
        m443(defaultRequestM446, "x-amz-copy-source-if-match", copyObjectRequest.m546());
        m443(defaultRequestM446, "x-amz-copy-source-if-none-match", copyObjectRequest.m544());
        defaultRequestM446.m182("Content-Length", String.valueOf(0));
        try {
            XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler = (XmlResponsesSaxParser.CopyObjectResultHandler) m440(defaultRequestM446, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CopyObjectUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ֫ */
                public final Object mo706(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler2 = new XmlResponsesSaxParser.CopyObjectResultHandler();
                    xmlResponsesSaxParser.m713(copyObjectResultHandler2, inputStream);
                    return copyObjectResultHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new S3VersionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM548, strM547);
            if (copyObjectResultHandler.m718() != null) {
                String strM718 = copyObjectResultHandler.m718();
                String strM720 = copyObjectResultHandler.m720();
                String strM719 = copyObjectResultHandler.m719();
                String strM724 = copyObjectResultHandler.m724();
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strM720);
                amazonS3Exception.m144(strM718);
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m148(strM719);
                amazonS3Exception.m525(strM724);
                amazonS3Exception.m150(defaultRequestM446.m186());
                amazonS3Exception.m143(200);
                throw amazonS3Exception;
            }
            CopyObjectResult copyObjectResult = new CopyObjectResult();
            copyObjectResult.m553(copyObjectResultHandler.m725());
            copyObjectResult.m551(copyObjectResultHandler.m717());
            copyObjectResult.mo478(copyObjectResultHandler.m722());
            copyObjectResult.mo485(copyObjectResultHandler.m702());
            copyObjectResult.mo482(copyObjectResultHandler.m704());
            copyObjectResult.mo484(copyObjectResultHandler.m703());
            copyObjectResult.mo468(copyObjectResultHandler.m721());
            copyObjectResult.mo469(copyObjectResultHandler.m716());
            copyObjectResult.mo465(copyObjectResultHandler.m723());
        } catch (AmazonS3Exception e) {
            if (e.m149() != 412) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m451(DeleteObjectRequest deleteObjectRequest) {
        ValidationUtils.m797(deleteObjectRequest.m559(), "The bucket name must be specified when deleting an object");
        ValidationUtils.m797(deleteObjectRequest.m558(), "The key must be specified when deleting an object");
        m440(m446(deleteObjectRequest.m559(), deleteObjectRequest.m558(), deleteObjectRequest, HttpMethodName.DELETE, null), this.f465, deleteObjectRequest.m559(), deleteObjectRequest.m558());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m452(DeleteObjectsRequest deleteObjectsRequest) {
        DefaultRequest defaultRequestM446 = m446(deleteObjectsRequest.m564(), null, deleteObjectsRequest, HttpMethodName.POST, null);
        defaultRequestM446.m189("delete", null);
        new MultiObjectDeleteXmlFactory();
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.m489("Delete");
        if (deleteObjectsRequest.m562()) {
            xmlWriter.m489("Quiet");
            xmlWriter.m490("true");
            xmlWriter.m488();
        }
        for (DeleteObjectsRequest.KeyVersion keyVersion : deleteObjectsRequest.m563()) {
            xmlWriter.m489("Object");
            xmlWriter.m489("Key");
            xmlWriter.m490(keyVersion.m565());
            xmlWriter.m488();
            xmlWriter.m488();
        }
        xmlWriter.m488();
        byte[] bArrM491 = xmlWriter.m491();
        defaultRequestM446.m182("Content-Length", String.valueOf(bArrM491.length));
        defaultRequestM446.m182("Content-Type", "application/xml");
        defaultRequestM446.m180(new ByteArrayInputStream(bArrM491));
        try {
            try {
                defaultRequestM446.m182("Content-MD5", Base64.m744(MessageDigest.getInstance("MD5").digest(bArrM491)));
                ResponseHeaderHandlerChain responseHeaderHandlerChain = new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteObjectsResultUnmarshaller
                    @Override // com.amazonaws.transform.Unmarshaller
                    /* JADX INFO: renamed from: ֫ */
                    public final Object mo706(InputStream inputStream) throws IOException {
                        XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                        XmlResponsesSaxParser.DeleteObjectsHandler deleteObjectsHandler = new XmlResponsesSaxParser.DeleteObjectsHandler();
                        xmlResponsesSaxParser.m713(deleteObjectsHandler, inputStream);
                        return deleteObjectsHandler.m726();
                    }
                }, new S3RequesterChargedHeaderHandler());
                DeleteObjectsResponse deleteObjectsResponse = (DeleteObjectsResponse) m440(defaultRequestM446, responseHeaderHandlerChain, deleteObjectsRequest.m564(), (String) null);
                if (((ArrayList) deleteObjectsResponse.m466()).isEmpty()) {
                    new ArrayList().addAll(deleteObjectsResponse.m464());
                    return;
                }
                Map mapM479 = responseHeaderHandlerChain.m479();
                MultiObjectDeleteException multiObjectDeleteException = new MultiObjectDeleteException(deleteObjectsResponse.m466(), deleteObjectsResponse.m464());
                multiObjectDeleteException.m143(200);
                multiObjectDeleteException.m148((String) mapM479.get("x-amz-request-id"));
                multiObjectDeleteException.m525((String) mapM479.get("x-amz-id-2"));
                throw multiObjectDeleteException;
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        } catch (Exception e2) {
            throw new AmazonClientException("Couldn't compute md5 sum", e2);
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final void mo439(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        ValidationUtils.m797(abortMultipartUploadRequest.m496(), "The bucket name parameter must be specified when aborting a multipart upload");
        ValidationUtils.m797(abortMultipartUploadRequest.m495(), "The key parameter must be specified when aborting a multipart upload");
        ValidationUtils.m797(abortMultipartUploadRequest.m494(), "The upload ID parameter must be specified when aborting a multipart upload");
        String strM496 = abortMultipartUploadRequest.m496();
        String strM495 = abortMultipartUploadRequest.m495();
        DefaultRequest defaultRequestM446 = m446(strM496, strM495, abortMultipartUploadRequest, HttpMethodName.DELETE, null);
        defaultRequestM446.m189("uploadId", abortMultipartUploadRequest.m494());
        m440(defaultRequestM446, this.f465, strM496, strM495);
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final CompleteMultipartUploadResult mo434(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        String strM543 = completeMultipartUploadRequest.m543();
        String strM542 = completeMultipartUploadRequest.m542();
        String strM540 = completeMultipartUploadRequest.m540();
        ValidationUtils.m797(strM543, "The bucket name parameter must be specified when completing a multipart upload");
        ValidationUtils.m797(strM542, "The key parameter must be specified when completing a multipart upload");
        ValidationUtils.m797(strM540, "The upload ID parameter must be specified when completing a multipart upload");
        ValidationUtils.m797(completeMultipartUploadRequest.m541(), "The part ETags parameter must be specified when completing a multipart upload");
        int i = 0;
        while (true) {
            DefaultRequest defaultRequestM446 = m446(strM543, strM542, completeMultipartUploadRequest, HttpMethodName.POST, null);
            defaultRequestM446.m189("uploadId", strM540);
            byte[] bArrM705 = RequestXmlFactory.m705(completeMultipartUploadRequest.m541());
            defaultRequestM446.m182("Content-Type", "application/xml");
            defaultRequestM446.m182("Content-Length", String.valueOf(bArrM705.length));
            defaultRequestM446.m180(new ByteArrayInputStream(bArrM705));
            XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) m440(defaultRequestM446, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final Object mo706(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler2 = new XmlResponsesSaxParser.CompleteMultipartUploadHandler();
                    xmlResponsesSaxParser.m713(completeMultipartUploadHandler2, inputStream);
                    return completeMultipartUploadHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM543, strM542);
            if (completeMultipartUploadHandler.m714() != null) {
                return completeMultipartUploadHandler.m714();
            }
            AmazonS3Exception amazonS3ExceptionM715 = completeMultipartUploadHandler.m715();
            int i2 = i + 1;
            RetryPolicy retryPolicyM172 = this.f81.m172();
            if (!((retryPolicyM172 == null || retryPolicyM172.m431() == null || retryPolicyM172 == PredefinedRetryPolicies.f453) ? false : this.f467.mo428(amazonS3ExceptionM715, i))) {
                throw completeMultipartUploadHandler.m715();
            }
            i = i2;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final InitiateMultipartUploadResult mo435(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        ValidationUtils.m797(initiateMultipartUploadRequest.m586(), "The bucket name parameter must be specified when initiating a multipart upload");
        ValidationUtils.m797(initiateMultipartUploadRequest.m584(), "The key parameter must be specified when initiating a multipart upload");
        DefaultRequest defaultRequestM446 = m446(initiateMultipartUploadRequest.m586(), initiateMultipartUploadRequest.m584(), initiateMultipartUploadRequest, HttpMethodName.POST, null);
        defaultRequestM446.m189("uploads", null);
        if (initiateMultipartUploadRequest.m585() != null) {
            defaultRequestM446.m182("x-amz-acl", initiateMultipartUploadRequest.m585().toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f610;
        if (objectMetadata != null) {
            m442(defaultRequestM446, objectMetadata);
        }
        String strM441 = m441(initiateMultipartUploadRequest.m587());
        if (strM441 != null) {
            defaultRequestM446.m182("x-amz-tagging", strM441);
        }
        SSEAwsKeyManagementParams sSEAwsKeyManagementParamsM583 = initiateMultipartUploadRequest.m583();
        if (sSEAwsKeyManagementParamsM583 != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestM446.m182("x-amz-server-side-encryption", algorithm);
            }
            String strM671 = sSEAwsKeyManagementParamsM583.m671();
            if (strM671 != null) {
                defaultRequestM446.m182("x-amz-server-side-encryption-aws-kms-key-id", strM671);
            }
        }
        defaultRequestM446.m182("Content-Length", String.valueOf(0));
        defaultRequestM446.m180(new ByteArrayInputStream(new byte[0]));
        return (InitiateMultipartUploadResult) m440(defaultRequestM446, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ֫ */
            public final Object mo706(InputStream inputStream) throws IOException {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.InitiateMultipartUploadHandler initiateMultipartUploadHandler = new XmlResponsesSaxParser.InitiateMultipartUploadHandler();
                xmlResponsesSaxParser.m713(initiateMultipartUploadHandler, inputStream);
                return initiateMultipartUploadHandler.m727();
            }
        }, new ServerSideEncryptionHeaderHandler()), initiateMultipartUploadRequest.m586(), initiateMultipartUploadRequest.m584());
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final UploadPartResult mo438(UploadPartRequest uploadPartRequest) {
        InputStream inputSubstream;
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        String strM690 = uploadPartRequest.m690();
        String strM691 = uploadPartRequest.m691();
        String strM686 = uploadPartRequest.m686();
        int iM681 = uploadPartRequest.m681();
        long jM680 = uploadPartRequest.m680();
        ValidationUtils.m797(strM690, "The bucket name parameter must be specified when uploading a part");
        ValidationUtils.m797(strM691, "The key parameter must be specified when uploading a part");
        ValidationUtils.m797(strM686, "The upload ID parameter must be specified when uploading a part");
        DefaultRequest defaultRequestM446 = m446(strM690, strM691, uploadPartRequest, HttpMethodName.PUT, null);
        defaultRequestM446.m189("uploadId", strM686);
        defaultRequestM446.m189("partNumber", Integer.toString(iM681));
        defaultRequestM446.m182("Content-Length", Long.toString(jM680));
        if (uploadPartRequest.m679() != null) {
            inputSubstream = uploadPartRequest.m679();
        } else {
            if (uploadPartRequest.m685() == null) {
                throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
            }
            try {
                inputSubstream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.m685()), uploadPartRequest.m689(), jM680);
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("The specified file doesn't exist", e);
            }
        }
        if (!ServiceUtils.m487(uploadPartRequest) && inputSubstream.markSupported()) {
            try {
                String strM744 = Base64.m744(Md5Utils.m784(inputSubstream));
                if (strM744 != null) {
                    defaultRequestM446.m182("Content-MD5", strM744);
                }
                inputSubstream.reset();
            } catch (Exception e2) {
                throw new AmazonClientException(C19370.m44629(e2, new StringBuilder("Unable to calculate MD5 hash: ")), e2);
            }
        }
        ProgressListener progressListenerMo158 = uploadPartRequest.mo158();
        if (progressListenerMo158 == null) {
            int i = ProgressListenerCallbackExecutor.f168;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo158);
        }
        if (progressListenerCallbackExecutor != null) {
            ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputSubstream, progressListenerCallbackExecutor);
            progressReportingInputStream.m232(this.f464);
            m444(progressListenerCallbackExecutor, 1024);
            inputSubstream = progressReportingInputStream;
        }
        try {
            try {
                defaultRequestM446.m180(inputSubstream);
                ObjectMetadata objectMetadata = (ObjectMetadata) m440(defaultRequestM446, new S3MetadataResponseHandler(), strM690, strM691);
                m444(progressListenerCallbackExecutor, 2048);
                UploadPartResult uploadPartResult = new UploadPartResult();
                uploadPartResult.m693(objectMetadata.m633());
                uploadPartResult.m692(iM681);
                uploadPartResult.mo485(objectMetadata.m630());
                uploadPartResult.mo482(objectMetadata.m621());
                uploadPartResult.mo484(objectMetadata.m622());
                objectMetadata.m623();
                if (inputSubstream != null) {
                    try {
                        inputSubstream.close();
                    } catch (Exception unused) {
                    }
                }
                return uploadPartResult;
            } catch (AmazonClientException e3) {
                m444(progressListenerCallbackExecutor, 4096);
                throw e3;
            }
        } catch (Throwable th) {
            if (inputSubstream != null) {
                try {
                    inputSubstream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m444(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        ProgressEvent progressEvent = new ProgressEvent(0L);
        progressEvent.m227(i);
        progressListenerCallbackExecutor.m231(progressEvent);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Signer m447(DefaultRequest defaultRequest, String str, String str2) {
        this.f470.getClass();
        Signer signerM153 = m153(defaultRequest.m188());
        if (this.f81.m174() == null) {
            if ((signerM153 instanceof AWSS3V4Signer) && defaultRequest.m188().getHost().endsWith("s3.amazonaws.com") && this.f468 == null) {
                String str3 = this.f468 == null ? (String) f462.get(str) : this.f468;
                if (str3 != null) {
                    String strM418 = RegionUtils.m423(str3).m418();
                    Protocol protocolM170 = this.f81.m170();
                    if (strM418 == null) {
                        throw new IllegalArgumentException("endpoint cannot be null");
                    }
                    if (!strM418.contains("://")) {
                        strM418 = protocolM170.toString() + "://" + strM418;
                    }
                    try {
                        mo449(defaultRequest, str, str2, new URI(strM418));
                        AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) signerM153;
                        aWSS3V4Signer.setServiceName(m154());
                        aWSS3V4Signer.setRegionName(str3);
                        return aWSS3V4Signer;
                    } catch (URISyntaxException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
            String str4 = this.f468 == null ? (String) f462.get(str) : this.f468;
            if (str4 != null) {
                AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
                aWSS3V4Signer2.setServiceName(m154());
                aWSS3V4Signer2.setRegionName(str4);
                return aWSS3V4Signer2;
            }
        }
        if (!(signerM153 instanceof S3Signer)) {
            return signerM153;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str != null ? str.concat("/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return new S3Signer(defaultRequest.m193().toString(), sb.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m442(DefaultRequest defaultRequest, ObjectMetadata objectMetadata) {
        Map mapM627 = objectMetadata.m627();
        if (mapM627.get("x-amz-server-side-encryption-aws-kms-key-id") != null && !ObjectMetadata.f630.equals(mapM627.get("x-amz-server-side-encryption"))) {
            throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }
        for (Map.Entry entry : mapM627.entrySet()) {
            defaultRequest.m182((String) entry.getKey(), entry.getValue().toString());
        }
        Date dateM624 = objectMetadata.m624();
        if (dateM624 != null) {
            defaultRequest.m182("Expires", DateUtils.m767("EEE, dd MMM yyyy HH:mm:ss z", dateM624));
        }
        Map mapM635 = objectMetadata.m635();
        if (mapM635 != null) {
            for (Map.Entry entry2 : mapM635.entrySet()) {
                String strTrim = (String) entry2.getKey();
                String strTrim2 = (String) entry2.getValue();
                if (strTrim != null) {
                    strTrim = strTrim.trim();
                }
                if (strTrim2 != null) {
                    strTrim2 = strTrim2.trim();
                }
                if (!"x-amz-tagging".equals(strTrim)) {
                    defaultRequest.m182("x-amz-meta-" + strTrim, strTrim2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m443(DefaultRequest defaultRequest, String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int i = ServiceUtils.f512;
        Iterator it = arrayList.iterator();
        String strM37867 = "";
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z) {
                strM37867 = C16014.m37867(strM37867, ", ");
            }
            strM37867 = C16014.m37867(strM37867, str2);
            z = false;
        }
        defaultRequest.m182(str, strM37867);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DefaultRequest m446(String str, String str2, AmazonWebServiceRequest amazonWebServiceRequest, HttpMethodName httpMethodName, URI uri) {
        DefaultRequest defaultRequest = new DefaultRequest(amazonWebServiceRequest);
        this.f470.getClass();
        defaultRequest.m178(httpMethodName);
        mo449(defaultRequest, str, str2, uri);
        return defaultRequest;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m440(DefaultRequest defaultRequest, AbstractS3ResponseHandler abstractS3ResponseHandler, String str, String str2) {
        m155(defaultRequest.m192());
        boolean z = false;
        S3ExecutionContext s3ExecutionContext = new S3ExecutionContext(this.f85, System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null);
        AWSRequestMetrics aWSRequestMetricsM254 = s3ExecutionContext.m254();
        defaultRequest.m179(aWSRequestMetricsM254);
        aWSRequestMetricsM254.mo736(AWSRequestMetrics.Field.ClientExecuteTime);
        try {
            try {
                if (!defaultRequest.m191().containsKey("Content-Type")) {
                    defaultRequest.m182("Content-Type", "application/octet-stream");
                }
                if (str != null) {
                    if (defaultRequest.m188().getHost().endsWith("s3.amazonaws.com") && this.f468 == null) {
                        z = true;
                    }
                    if (z) {
                        m445(str);
                    }
                }
                AWSCredentials aWSCredentialsMo208 = this.f466.mo208();
                s3ExecutionContext.m475(m447(defaultRequest, str, str2));
                s3ExecutionContext.m255(aWSCredentialsMo208);
                Object objM198 = this.f80.m252(defaultRequest, abstractS3ResponseHandler, this.f469, s3ExecutionContext).m198();
                m156(aWSRequestMetricsM254, defaultRequest);
                return objM198;
            } catch (AmazonS3Exception e) {
                if (e.m149() == 301 && e.m524() != null) {
                    String str3 = (String) ((HashMap) e.m524()).get("x-amz-bucket-region");
                    f462.put(str, str3);
                    e.m146("The bucket is in this region: " + str3 + ". Please use this region to retry the request");
                }
                throw e;
            }
        } catch (Throwable th) {
            m156(aWSRequestMetricsM254, defaultRequest);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m441(ObjectTagging objectTagging) {
        if (objectTagging == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) objectTagging.m640()).iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            sb.append(S3HttpUtils.m477(tag.m672()));
            sb.append(a.h);
            sb.append(S3HttpUtils.m477(tag.m673()));
            if (it.hasNext()) {
                sb.append(com.alipay.sdk.m.w.a.p);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m445(String str) {
        Map map = f462;
        String strM578 = (String) map.get(str);
        Log log = f463;
        if (strM578 == null) {
            if (log.mo293()) {
                log.mo294("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            strM578 = null;
            try {
                strM578 = ((HeadBucketResult) m440(m446(str, null, new HeadBucketRequest(), HttpMethodName.HEAD, new URI("https://s3-us-west-1.amazonaws.com")), new HeadBucketResultHandler(), str, (String) null)).m578();
            } catch (AmazonS3Exception e) {
                if (e.m524() != null) {
                    strM578 = (String) ((HashMap) e.m524()).get("x-amz-bucket-region");
                }
            } catch (URISyntaxException unused) {
                log.mo300("Error while creating URI");
            }
            if (strM578 == null && log.mo293()) {
                log.mo294("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
            }
            if (strM578 != null) {
                map.put(str, strM578);
            }
        }
        if (log.mo293()) {
            log.mo294("Region for " + str + " is " + strM578);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo449(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        String str3;
        if (uri == null) {
            uri = this.f83;
        }
        if (this.f470.m455() || !BucketNameUtils.m458(str)) {
            f463.mo294("Using path style addressing. Endpoint = " + uri);
            defaultRequest.m183(uri);
            if (str != null) {
                StringBuilder sbM19190 = C7166.m19190(str, "/");
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "";
                }
                sbM19190.append(str3);
                defaultRequest.m181(sbM19190.toString());
            }
        } else {
            String host = uri.getHost();
            if (host != null) {
                String[] strArrSplit = host.split("\\.");
                if (strArrSplit.length == 4) {
                    int length = strArrSplit.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            try {
                                int i2 = Integer.parseInt(strArrSplit[i]);
                                if (i2 >= 0 && i2 <= 255) {
                                    i++;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            f463.mo294("Using path style addressing. Endpoint = " + uri);
                            defaultRequest.m183(uri);
                            if (str != null) {
                                StringBuilder sbM19191 = C7166.m19190(str, "/");
                                if (str2 != null) {
                                    str3 = str2;
                                } else {
                                    str3 = "";
                                }
                                sbM19191.append(str3);
                                defaultRequest.m181(sbM19191.toString());
                            }
                        }
                    }
                }
            }
            f463.mo294("Using virtual style addressing. Endpoint = " + uri);
            try {
                defaultRequest.m183(new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority()));
                defaultRequest.m181((str2 == null || !str2.startsWith("/")) ? str2 : "/".concat(str2));
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(C20094.m46315("Invalid bucket name: ", str), e);
            }
        }
        f463.mo294("Key: " + str2 + "; Request: " + defaultRequest);
    }
}
