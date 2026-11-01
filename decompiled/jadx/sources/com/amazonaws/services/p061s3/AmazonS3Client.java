package com.amazonaws.services.p061s3;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p055w.C0233a;
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
import com.amazonaws.services.p061s3.internal.AWSS3V4Signer;
import com.amazonaws.services.p061s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.p061s3.internal.BucketNameUtils;
import com.amazonaws.services.p061s3.internal.CompleteMultipartUploadRetryCondition;
import com.amazonaws.services.p061s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.p061s3.internal.InputSubstream;
import com.amazonaws.services.p061s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.p061s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.p061s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.p061s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.p061s3.internal.S3ExecutionContext;
import com.amazonaws.services.p061s3.internal.S3HttpUtils;
import com.amazonaws.services.p061s3.internal.S3MetadataResponseHandler;
import com.amazonaws.services.p061s3.internal.S3ObjectResponseHandler;
import com.amazonaws.services.p061s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.p061s3.internal.S3Signer;
import com.amazonaws.services.p061s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.p061s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.p061s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.p061s3.internal.ServiceUtils;
import com.amazonaws.services.p061s3.internal.XmlWriter;
import com.amazonaws.services.p061s3.metrics.S3ServiceMetric;
import com.amazonaws.services.p061s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.AmazonS3Exception;
import com.amazonaws.services.p061s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.p061s3.model.CopyObjectRequest;
import com.amazonaws.services.p061s3.model.CopyObjectResult;
import com.amazonaws.services.p061s3.model.DeleteObjectRequest;
import com.amazonaws.services.p061s3.model.DeleteObjectsRequest;
import com.amazonaws.services.p061s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.p061s3.model.GetObjectRequest;
import com.amazonaws.services.p061s3.model.HeadBucketRequest;
import com.amazonaws.services.p061s3.model.HeadBucketResult;
import com.amazonaws.services.p061s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.p061s3.model.ListObjectsRequest;
import com.amazonaws.services.p061s3.model.MultiObjectDeleteException;
import com.amazonaws.services.p061s3.model.ObjectListing;
import com.amazonaws.services.p061s3.model.ObjectMetadata;
import com.amazonaws.services.p061s3.model.ObjectTagging;
import com.amazonaws.services.p061s3.model.PutObjectRequest;
import com.amazonaws.services.p061s3.model.PutObjectResult;
import com.amazonaws.services.p061s3.model.S3Object;
import com.amazonaws.services.p061s3.model.S3ObjectInputStream;
import com.amazonaws.services.p061s3.model.SSEAlgorithm;
import com.amazonaws.services.p061s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.p061s3.model.Tag;
import com.amazonaws.services.p061s3.model.UploadPartRequest;
import com.amazonaws.services.p061s3.model.UploadPartResult;
import com.amazonaws.services.p061s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.p061s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.p061s3.model.transform.MultiObjectDeleteXmlFactory;
import com.amazonaws.services.p061s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.services.p061s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.p061s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.services.p061s3.util.Mimetypes;
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
import p067l.C17588;
import p067l.C20778;
import p067l.C21466;
import p067l.C21562;
import p067l.C7470;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    /* JADX INFO: renamed from: ᩴ */
    public static final Map f1622;

    /* JADX INFO: renamed from: ᩵ */
    public static Log f1623 = LogFactory.m1468(AmazonS3Client.class);

    /* JADX INFO: renamed from: ۖ */
    public int f1624;

    /* JADX INFO: renamed from: ۘ */
    public final S3XmlResponseHandler f1625;

    /* JADX INFO: renamed from: ۜ */
    public final AWSCredentialsProvider f1626;

    /* JADX INFO: renamed from: ۡ */
    public final CompleteMultipartUploadRetryCondition f1627;

    /* JADX INFO: renamed from: ۢ */
    public volatile String f1628;

    /* JADX INFO: renamed from: ܺ */
    public final S3ErrorResponseHandler f1629;

    /* JADX INFO: renamed from: ᩷ */
    public S3ClientOptions f1630;

    static {
        AwsSdkMetrics.m1481(Arrays.asList(S3ServiceMetric.m1658()));
        SignerFactory.m1389(AWSS3V4Signer.class, "AWSS3V4SignerType");
        new BucketConfigurationXmlFactory();
        new RequestPaymentConfigurationXmlFactory();
        f1622 = C21562.synchronizedMap(new C02741(300, 1.1f, true));
    }

    /* JADX INFO: renamed from: com.amazonaws.services.s3.AmazonS3Client$1 */
    public final class C02741 extends LinkedHashMap {
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
        this.f1629 = new S3ErrorResponseHandler();
        this.f1625 = new S3XmlResponseHandler(null);
        this.f1630 = new S3ClientOptions();
        this.f1624 = 1024;
        this.f1627 = new CompleteMultipartUploadRetryCondition();
        this.f1626 = aWSCredentialsProvider;
        mo1324("s3.amazonaws.com");
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1245;
        copyOnWriteArrayList.addAll(handlerChainFactory.m1403());
        copyOnWriteArrayList.addAll(handlerChainFactory.m1402());
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    /* JADX INFO: renamed from: ֫ */
    public void mo1324(String str) {
        if (str.endsWith("s3-accelerate.amazonaws.com")) {
            throw new IllegalStateException("To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());");
        }
        super.mo1324(str);
        if (str.endsWith("s3.amazonaws.com")) {
            return;
        }
        this.f1628 = AwsHostNameUtils.m1904(this.f1243.getHost(), "s3");
    }

    /* JADX INFO: renamed from: ֫ */
    public final ObjectListing m1614(ListObjectsRequest listObjectsRequest) {
        ValidationUtils.m1962(listObjectsRequest.m1765(), "The bucket name parameter must be specified when listing objects in a bucket");
        final boolean zEquals = "url".equals(null);
        DefaultRequest defaultRequestM1612 = m1612(listObjectsRequest.m1765(), null, listObjectsRequest, HttpMethodName.GET, null);
        String strM1766 = listObjectsRequest.m1766();
        if (strM1766 != null) {
            defaultRequestM1612.m1355("prefix", strM1766);
        }
        String strM1764 = listObjectsRequest.m1764();
        if (strM1764 != null) {
            defaultRequestM1612.m1355("delimiter", strM1764);
        }
        String strM1763 = listObjectsRequest.m1763();
        if (strM1763 != null) {
            defaultRequestM1612.m1355("marker", strM1763);
        }
        if (listObjectsRequest.m1762() != null && listObjectsRequest.m1762().intValue() >= 0) {
            defaultRequestM1612.m1355("max-keys", listObjectsRequest.m1762().toString());
        }
        Unmarshaller unmarshaller = new Unmarshaller(zEquals) { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsUnmarshaller

            /* JADX INFO: renamed from: ֫ */
            public final boolean f1848;

            {
                this.f1848 = zEquals;
            }

            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ֫ */
            public final Object mo1871(InputStream inputStream) {
                return new XmlResponsesSaxParser().m1877(inputStream, this.f1848).m1893();
            }
        };
        return (ObjectListing) m1606(defaultRequestM1612, new S3XmlResponseHandler(unmarshaller), listObjectsRequest.m1765(), (String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1619(String str, String str2) {
        try {
            GetObjectMetadataRequest getObjectMetadataRequest = new GetObjectMetadataRequest(str, str2);
            String strM1733 = getObjectMetadataRequest.m1733();
            String strM1732 = getObjectMetadataRequest.m1732();
            ValidationUtils.m1962(strM1733, "The bucket name parameter must be specified when requesting an object's metadata");
            ValidationUtils.m1962(strM1732, "The key parameter must be specified when requesting an object's metadata");
            return true;
        } catch (AmazonS3Exception e) {
            if (e.m1316() == 404) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.amazonaws.services.p061s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final S3Object mo1603(GetObjectRequest getObjectRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        ValidationUtils.m1962(getObjectRequest.m1739(), "The bucket name parameter must be specified when requesting an object");
        ValidationUtils.m1962(getObjectRequest.m1738(), "The key parameter must be specified when requesting an object");
        DefaultRequest defaultRequestM1612 = m1612(getObjectRequest.m1739(), getObjectRequest.m1738(), getObjectRequest, HttpMethodName.GET, null);
        getObjectRequest.m1736();
        long[] jArrM1740 = getObjectRequest.m1740();
        if (jArrM1740 != null) {
            String string = "bytes=" + Long.toString(jArrM1740[0]) + "-";
            if (jArrM1740[1] >= 0) {
                StringBuilder sbM17248 = C7470.m17248(string);
                sbM17248.append(Long.toString(jArrM1740[1]));
                string = sbM17248.toString();
            }
            defaultRequestM1612.m1348("Range", string);
        }
        m1609(defaultRequestM1612, "If-Match", getObjectRequest.m1737());
        m1609(defaultRequestM1612, "If-None-Match", getObjectRequest.m1735());
        ProgressListener progressListenerMo1325 = getObjectRequest.mo1325();
        if (progressListenerMo1325 == null) {
            int i = ProgressListenerCallbackExecutor.f1328;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo1325);
        }
        try {
            S3Object s3Object = (S3Object) m1606(defaultRequestM1612, new S3ObjectResponseHandler(), getObjectRequest.m1739(), getObjectRequest.m1738());
            s3Object.m1817(getObjectRequest.m1739());
            s3Object.m1818(getObjectRequest.m1738());
            FilterInputStream serviceClientHolderInputStream = new ServiceClientHolderInputStream(s3Object.m1815());
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(serviceClientHolderInputStream, progressListenerCallbackExecutor);
                progressReportingInputStream.m1399();
                progressReportingInputStream.m1398(this.f1624);
                m1610(progressListenerCallbackExecutor, 2);
                serviceClientHolderInputStream = progressReportingInputStream;
            }
            s3Object.m1816(new S3ObjectInputStream(new LengthCheckInputStream(serviceClientHolderInputStream, s3Object.m1819().m1781(), true)));
            return s3Object;
        } catch (AmazonS3Exception e) {
            if (e.m1316() == 412 || e.m1316() == 304) {
                m1610(progressListenerCallbackExecutor, 16);
                return null;
            }
            m1610(progressListenerCallbackExecutor, 8);
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
    @Override // com.amazonaws.services.p061s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PutObjectResult mo1602(PutObjectRequest putObjectRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        InputStream repeatableFileInputStream;
        InputStream inputStream;
        String strM1684 = putObjectRequest.m1684();
        String strM1670 = putObjectRequest.m1670();
        ObjectMetadata objectMetadataM1685 = putObjectRequest.m1685();
        InputStream inputStreamM1678 = putObjectRequest.m1678();
        ProgressListener progressListenerMo1325 = putObjectRequest.mo1325();
        if (progressListenerMo1325 == null) {
            int i = ProgressListenerCallbackExecutor.f1328;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo1325);
        }
        if (objectMetadataM1685 == null) {
            objectMetadataM1685 = new ObjectMetadata();
        }
        ObjectMetadata objectMetadata = objectMetadataM1685;
        ValidationUtils.m1962(strM1684, "The bucket name parameter must be specified when uploading an object");
        ValidationUtils.m1962(strM1670, "The key parameter must be specified when uploading an object");
        boolean zM1653 = ServiceUtils.m1653(putObjectRequest);
        if (putObjectRequest.m1679() != null) {
            File fileM1679 = putObjectRequest.m1679();
            objectMetadata.m1782(fileM1679.length());
            boolean z = objectMetadata.m1797() == null;
            if (objectMetadata.m1800() == null) {
                objectMetadata.m1803(Mimetypes.m1894().m1895(fileM1679));
            }
            if (z && !zM1653) {
                try {
                    objectMetadata.m1791(Base64.m1909(Md5Utils.m1949(new FileInputStream(fileM1679))));
                } catch (Exception e) {
                    throw new AmazonClientException(C20778.m46923(e, new StringBuilder("Unable to calculate MD5 hash: ")), e);
                }
            }
            try {
                repeatableFileInputStream = new RepeatableFileInputStream(fileM1679);
            } catch (FileNotFoundException e2) {
                throw new AmazonClientException("Unable to find file to upload", e2);
            }
        } else {
            repeatableFileInputStream = inputStreamM1678;
        }
        DefaultRequest defaultRequestM1612 = m1612(strM1684, strM1670, putObjectRequest, HttpMethodName.PUT, null);
        if (putObjectRequest.m1682() != null) {
            defaultRequestM1612.m1348("x-amz-acl", putObjectRequest.m1682().toString());
        }
        if (putObjectRequest.m1680() != null) {
            defaultRequestM1612.m1348("x-amz-storage-class", putObjectRequest.m1680());
        }
        InputStream byteArrayInputStream = repeatableFileInputStream;
        if (putObjectRequest.m1672() != null) {
            defaultRequestM1612.m1348("x-amz-website-redirect-location", putObjectRequest.m1672());
            if (repeatableFileInputStream == null) {
                byteArrayInputStream = repeatableFileInputStream;
                defaultRequestM1612.m1348("Content-Length", String.valueOf(0));
                byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
            }
        }
        byteArrayInputStream = repeatableFileInputStream;
        String strM1607 = m1607(putObjectRequest.m1669());
        if (strM1607 != null) {
            defaultRequestM1612.m1348("x-amz-tagging", strM1607);
        }
        if (putObjectRequest.m1814()) {
            defaultRequestM1612.m1348("x-amz-request-payer", "requester");
        }
        Long l2 = (Long) objectMetadata.m1792();
        long j = 0;
        Log log = f1623;
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
                defaultRequestM1612.m1348("Content-Length", String.valueOf(j));
                inputStream = byteArrayInputStream;
            } else {
                log.mo1466("No content length specified for stream data.  Stream contents will be buffered in memory and could result in out of memory errors.");
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
                defaultRequestM1612.m1348("Content-Length", String.valueOf(byteArrayInputStream2.available()));
                defaultRequestM1612.m1353();
                inputStream = byteArrayInputStream2;
            }
        } else {
            long jLongValue = l2.longValue();
            if (jLongValue >= 0) {
                inputStream = byteArrayInputStream;
                InputStream lengthCheckInputStream = new LengthCheckInputStream(byteArrayInputStream, jLongValue, false);
                defaultRequestM1612.m1348("Content-Length", l2.toString());
                inputStream = lengthCheckInputStream;
            }
        }
        if (progressListenerCallbackExecutor != null) {
            ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputStream, progressListenerCallbackExecutor);
            progressReportingInputStream.m1398(this.f1624);
            m1610(progressListenerCallbackExecutor, 2);
            inputStream = progressReportingInputStream;
        }
        if (objectMetadata.m1800() == null) {
            objectMetadata.m1803("application/octet-stream");
        }
        m1608(defaultRequestM1612, objectMetadata);
        SSEAwsKeyManagementParams sSEAwsKeyManagementParamsM1671 = putObjectRequest.m1671();
        if (sSEAwsKeyManagementParamsM1671 != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestM1612.m1348("x-amz-server-side-encryption", algorithm);
            }
            String strM1836 = sSEAwsKeyManagementParamsM1671.m1836();
            if (strM1836 != null) {
                defaultRequestM1612.m1348("x-amz-server-side-encryption-aws-kms-key-id", strM1836);
            }
        }
        defaultRequestM1612.m1346(inputStream);
        try {
            ObjectMetadata objectMetadata2 = (ObjectMetadata) m1606(defaultRequestM1612, new S3MetadataResponseHandler(), strM1684, strM1670);
            try {
                inputStream.close();
            } catch (AbortedException unused) {
            } catch (Exception e5) {
                log.mo1458("Unable to cleanly close input stream: " + e5.getMessage(), e5);
            }
            m1610(progressListenerCallbackExecutor, 4);
            PutObjectResult putObjectResult = new PutObjectResult();
            objectMetadata2.m1780();
            putObjectResult.mo1651(objectMetadata2.m1796());
            putObjectResult.mo1648(objectMetadata2.m1787());
            putObjectResult.mo1650(objectMetadata2.m1788());
            objectMetadata2.m1794();
            objectMetadata2.m1799();
            objectMetadata2.m1789();
            objectMetadata2.m1797();
            return putObjectResult;
        } catch (AmazonClientException e6) {
            m1610(progressListenerCallbackExecutor, 8);
            throw e6;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1616(CopyObjectRequest copyObjectRequest) {
        ValidationUtils.m1962(copyObjectRequest.m1715(), "The source bucket name must be specified when copying an object");
        ValidationUtils.m1962(copyObjectRequest.m1711(), "The source object key must be specified when copying an object");
        ValidationUtils.m1962(copyObjectRequest.m1714(), "The destination bucket name must be specified when copying an object");
        ValidationUtils.m1962(copyObjectRequest.m1713(), "The destination object key must be specified when copying an object");
        String strM1713 = copyObjectRequest.m1713();
        String strM1714 = copyObjectRequest.m1714();
        DefaultRequest defaultRequestM1612 = m1612(strM1714, strM1713, copyObjectRequest, HttpMethodName.PUT, null);
        defaultRequestM1612.m1348("x-amz-copy-source", "/" + copyObjectRequest.m1715() + "/" + copyObjectRequest.m1711());
        m1609(defaultRequestM1612, "x-amz-copy-source-if-match", copyObjectRequest.m1712());
        m1609(defaultRequestM1612, "x-amz-copy-source-if-none-match", copyObjectRequest.m1710());
        defaultRequestM1612.m1348("Content-Length", String.valueOf(0));
        try {
            XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler = (XmlResponsesSaxParser.CopyObjectResultHandler) m1606(defaultRequestM1612, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CopyObjectUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ֫ */
                public final Object mo1871(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler2 = new XmlResponsesSaxParser.CopyObjectResultHandler();
                    xmlResponsesSaxParser.m1878(copyObjectResultHandler2, inputStream);
                    return copyObjectResultHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new S3VersionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM1714, strM1713);
            if (copyObjectResultHandler.m1883() != null) {
                String strM1883 = copyObjectResultHandler.m1883();
                String strM1885 = copyObjectResultHandler.m1885();
                String strM1884 = copyObjectResultHandler.m1884();
                String strM1889 = copyObjectResultHandler.m1889();
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strM1885);
                amazonS3Exception.m1311(strM1883);
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m1315(strM1884);
                amazonS3Exception.m1691(strM1889);
                amazonS3Exception.m1317(defaultRequestM1612.m1352());
                amazonS3Exception.m1310(200);
                throw amazonS3Exception;
            }
            CopyObjectResult copyObjectResult = new CopyObjectResult();
            copyObjectResult.m1719(copyObjectResultHandler.m1890());
            copyObjectResult.m1717(copyObjectResultHandler.m1882());
            copyObjectResult.mo1644(copyObjectResultHandler.m1887());
            copyObjectResult.mo1651(copyObjectResultHandler.m1867());
            copyObjectResult.mo1648(copyObjectResultHandler.m1869());
            copyObjectResult.mo1650(copyObjectResultHandler.m1868());
            copyObjectResult.mo1634(copyObjectResultHandler.m1886());
            copyObjectResult.mo1635(copyObjectResultHandler.m1881());
            copyObjectResult.mo1631(copyObjectResultHandler.m1888());
        } catch (AmazonS3Exception e) {
            if (e.m1316() != 412) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1617(DeleteObjectRequest deleteObjectRequest) {
        ValidationUtils.m1962(deleteObjectRequest.m1725(), "The bucket name must be specified when deleting an object");
        ValidationUtils.m1962(deleteObjectRequest.m1724(), "The key must be specified when deleting an object");
        m1606(m1612(deleteObjectRequest.m1725(), deleteObjectRequest.m1724(), deleteObjectRequest, HttpMethodName.DELETE, null), this.f1625, deleteObjectRequest.m1725(), deleteObjectRequest.m1724());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1618(DeleteObjectsRequest deleteObjectsRequest) {
        DefaultRequest defaultRequestM1612 = m1612(deleteObjectsRequest.m1730(), null, deleteObjectsRequest, HttpMethodName.POST, null);
        defaultRequestM1612.m1355("delete", null);
        new MultiObjectDeleteXmlFactory();
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.m1655("Delete");
        if (deleteObjectsRequest.m1728()) {
            xmlWriter.m1655("Quiet");
            xmlWriter.m1656("true");
            xmlWriter.m1654();
        }
        for (DeleteObjectsRequest.KeyVersion keyVersion : deleteObjectsRequest.m1729()) {
            xmlWriter.m1655("Object");
            xmlWriter.m1655("Key");
            xmlWriter.m1656(keyVersion.m1731());
            xmlWriter.m1654();
            xmlWriter.m1654();
        }
        xmlWriter.m1654();
        byte[] bArrM1657 = xmlWriter.m1657();
        defaultRequestM1612.m1348("Content-Length", String.valueOf(bArrM1657.length));
        defaultRequestM1612.m1348("Content-Type", "application/xml");
        defaultRequestM1612.m1346(new ByteArrayInputStream(bArrM1657));
        try {
            try {
                defaultRequestM1612.m1348("Content-MD5", Base64.m1909(MessageDigest.getInstance("MD5").digest(bArrM1657)));
                ResponseHeaderHandlerChain responseHeaderHandlerChain = new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteObjectsResultUnmarshaller
                    @Override // com.amazonaws.transform.Unmarshaller
                    /* JADX INFO: renamed from: ֫ */
                    public final Object mo1871(InputStream inputStream) throws IOException {
                        XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                        XmlResponsesSaxParser.DeleteObjectsHandler deleteObjectsHandler = new XmlResponsesSaxParser.DeleteObjectsHandler();
                        xmlResponsesSaxParser.m1878(deleteObjectsHandler, inputStream);
                        return deleteObjectsHandler.m1891();
                    }
                }, new S3RequesterChargedHeaderHandler());
                DeleteObjectsResponse deleteObjectsResponse = (DeleteObjectsResponse) m1606(defaultRequestM1612, responseHeaderHandlerChain, deleteObjectsRequest.m1730(), (String) null);
                if (((ArrayList) deleteObjectsResponse.m1632()).isEmpty()) {
                    new ArrayList().addAll(deleteObjectsResponse.m1630());
                    return;
                }
                Map mapM1645 = responseHeaderHandlerChain.m1645();
                MultiObjectDeleteException multiObjectDeleteException = new MultiObjectDeleteException(deleteObjectsResponse.m1632(), deleteObjectsResponse.m1630());
                multiObjectDeleteException.m1310(200);
                multiObjectDeleteException.m1315((String) mapM1645.get("x-amz-request-id"));
                multiObjectDeleteException.m1691((String) mapM1645.get("x-amz-id-2"));
                throw multiObjectDeleteException;
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        } catch (Exception e2) {
            throw new AmazonClientException("Couldn't compute md5 sum", e2);
        }
    }

    @Override // com.amazonaws.services.p061s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final void mo1605(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        ValidationUtils.m1962(abortMultipartUploadRequest.m1662(), "The bucket name parameter must be specified when aborting a multipart upload");
        ValidationUtils.m1962(abortMultipartUploadRequest.m1661(), "The key parameter must be specified when aborting a multipart upload");
        ValidationUtils.m1962(abortMultipartUploadRequest.m1660(), "The upload ID parameter must be specified when aborting a multipart upload");
        String strM1662 = abortMultipartUploadRequest.m1662();
        String strM1661 = abortMultipartUploadRequest.m1661();
        DefaultRequest defaultRequestM1612 = m1612(strM1662, strM1661, abortMultipartUploadRequest, HttpMethodName.DELETE, null);
        defaultRequestM1612.m1355("uploadId", abortMultipartUploadRequest.m1660());
        m1606(defaultRequestM1612, this.f1625, strM1662, strM1661);
    }

    @Override // com.amazonaws.services.p061s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final CompleteMultipartUploadResult mo1600(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        String strM1709 = completeMultipartUploadRequest.m1709();
        String strM1708 = completeMultipartUploadRequest.m1708();
        String strM1706 = completeMultipartUploadRequest.m1706();
        ValidationUtils.m1962(strM1709, "The bucket name parameter must be specified when completing a multipart upload");
        ValidationUtils.m1962(strM1708, "The key parameter must be specified when completing a multipart upload");
        ValidationUtils.m1962(strM1706, "The upload ID parameter must be specified when completing a multipart upload");
        ValidationUtils.m1962(completeMultipartUploadRequest.m1707(), "The part ETags parameter must be specified when completing a multipart upload");
        int i = 0;
        while (true) {
            DefaultRequest defaultRequestM1612 = m1612(strM1709, strM1708, completeMultipartUploadRequest, HttpMethodName.POST, null);
            defaultRequestM1612.m1355("uploadId", strM1706);
            byte[] bArrM1870 = RequestXmlFactory.m1870(completeMultipartUploadRequest.m1707());
            defaultRequestM1612.m1348("Content-Type", "application/xml");
            defaultRequestM1612.m1348("Content-Length", String.valueOf(bArrM1870.length));
            defaultRequestM1612.m1346(new ByteArrayInputStream(bArrM1870));
            XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) m1606(defaultRequestM1612, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ֫ */
                public final Object mo1871(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler2 = new XmlResponsesSaxParser.CompleteMultipartUploadHandler();
                    xmlResponsesSaxParser.m1878(completeMultipartUploadHandler2, inputStream);
                    return completeMultipartUploadHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM1709, strM1708);
            if (completeMultipartUploadHandler.m1879() != null) {
                return completeMultipartUploadHandler.m1879();
            }
            AmazonS3Exception amazonS3ExceptionM1880 = completeMultipartUploadHandler.m1880();
            int i2 = i + 1;
            RetryPolicy retryPolicyM1338 = this.f1241.m1338();
            if (!((retryPolicyM1338 == null || retryPolicyM1338.m1597() == null || retryPolicyM1338 == PredefinedRetryPolicies.f1613) ? false : this.f1627.mo1594(amazonS3ExceptionM1880, i))) {
                throw completeMultipartUploadHandler.m1880();
            }
            i = i2;
        }
    }

    @Override // com.amazonaws.services.p061s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final InitiateMultipartUploadResult mo1601(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        ValidationUtils.m1962(initiateMultipartUploadRequest.m1752(), "The bucket name parameter must be specified when initiating a multipart upload");
        ValidationUtils.m1962(initiateMultipartUploadRequest.m1750(), "The key parameter must be specified when initiating a multipart upload");
        DefaultRequest defaultRequestM1612 = m1612(initiateMultipartUploadRequest.m1752(), initiateMultipartUploadRequest.m1750(), initiateMultipartUploadRequest, HttpMethodName.POST, null);
        defaultRequestM1612.m1355("uploads", null);
        if (initiateMultipartUploadRequest.m1751() != null) {
            defaultRequestM1612.m1348("x-amz-acl", initiateMultipartUploadRequest.m1751().toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f1770;
        if (objectMetadata != null) {
            m1608(defaultRequestM1612, objectMetadata);
        }
        String strM1607 = m1607(initiateMultipartUploadRequest.m1753());
        if (strM1607 != null) {
            defaultRequestM1612.m1348("x-amz-tagging", strM1607);
        }
        SSEAwsKeyManagementParams sSEAwsKeyManagementParamsM1749 = initiateMultipartUploadRequest.m1749();
        if (sSEAwsKeyManagementParamsM1749 != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestM1612.m1348("x-amz-server-side-encryption", algorithm);
            }
            String strM1836 = sSEAwsKeyManagementParamsM1749.m1836();
            if (strM1836 != null) {
                defaultRequestM1612.m1348("x-amz-server-side-encryption-aws-kms-key-id", strM1836);
            }
        }
        defaultRequestM1612.m1348("Content-Length", String.valueOf(0));
        defaultRequestM1612.m1346(new ByteArrayInputStream(new byte[0]));
        return (InitiateMultipartUploadResult) m1606(defaultRequestM1612, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ֫ */
            public final Object mo1871(InputStream inputStream) throws IOException {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.InitiateMultipartUploadHandler initiateMultipartUploadHandler = new XmlResponsesSaxParser.InitiateMultipartUploadHandler();
                xmlResponsesSaxParser.m1878(initiateMultipartUploadHandler, inputStream);
                return initiateMultipartUploadHandler.m1892();
            }
        }, new ServerSideEncryptionHeaderHandler()), initiateMultipartUploadRequest.m1752(), initiateMultipartUploadRequest.m1750());
    }

    @Override // com.amazonaws.services.p061s3.AmazonS3
    /* JADX INFO: renamed from: ֫ */
    public final UploadPartResult mo1604(UploadPartRequest uploadPartRequest) {
        InputStream inputSubstream;
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        String strM1855 = uploadPartRequest.m1855();
        String strM1856 = uploadPartRequest.m1856();
        String strM1851 = uploadPartRequest.m1851();
        int iM1846 = uploadPartRequest.m1846();
        long jM1845 = uploadPartRequest.m1845();
        ValidationUtils.m1962(strM1855, "The bucket name parameter must be specified when uploading a part");
        ValidationUtils.m1962(strM1856, "The key parameter must be specified when uploading a part");
        ValidationUtils.m1962(strM1851, "The upload ID parameter must be specified when uploading a part");
        DefaultRequest defaultRequestM1612 = m1612(strM1855, strM1856, uploadPartRequest, HttpMethodName.PUT, null);
        defaultRequestM1612.m1355("uploadId", strM1851);
        defaultRequestM1612.m1355("partNumber", Integer.toString(iM1846));
        defaultRequestM1612.m1348("Content-Length", Long.toString(jM1845));
        if (uploadPartRequest.m1844() != null) {
            inputSubstream = uploadPartRequest.m1844();
        } else {
            if (uploadPartRequest.m1850() == null) {
                throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
            }
            try {
                inputSubstream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.m1850()), uploadPartRequest.m1854(), jM1845);
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("The specified file doesn't exist", e);
            }
        }
        if (!ServiceUtils.m1653(uploadPartRequest) && inputSubstream.markSupported()) {
            try {
                String strM1909 = Base64.m1909(Md5Utils.m1949(inputSubstream));
                if (strM1909 != null) {
                    defaultRequestM1612.m1348("Content-MD5", strM1909);
                }
                inputSubstream.reset();
            } catch (Exception e2) {
                throw new AmazonClientException(C20778.m46923(e2, new StringBuilder("Unable to calculate MD5 hash: ")), e2);
            }
        }
        ProgressListener progressListenerMo1325 = uploadPartRequest.mo1325();
        if (progressListenerMo1325 == null) {
            int i = ProgressListenerCallbackExecutor.f1328;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo1325);
        }
        if (progressListenerCallbackExecutor != null) {
            ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputSubstream, progressListenerCallbackExecutor);
            progressReportingInputStream.m1398(this.f1624);
            m1610(progressListenerCallbackExecutor, 1024);
            inputSubstream = progressReportingInputStream;
        }
        try {
            try {
                defaultRequestM1612.m1346(inputSubstream);
                ObjectMetadata objectMetadata = (ObjectMetadata) m1606(defaultRequestM1612, new S3MetadataResponseHandler(), strM1855, strM1856);
                m1610(progressListenerCallbackExecutor, 2048);
                UploadPartResult uploadPartResult = new UploadPartResult();
                uploadPartResult.m1858(objectMetadata.m1799());
                uploadPartResult.m1857(iM1846);
                uploadPartResult.mo1651(objectMetadata.m1796());
                uploadPartResult.mo1648(objectMetadata.m1787());
                uploadPartResult.mo1650(objectMetadata.m1788());
                objectMetadata.m1789();
                if (inputSubstream != null) {
                    try {
                        inputSubstream.close();
                    } catch (Exception unused) {
                    }
                }
                return uploadPartResult;
            } catch (AmazonClientException e3) {
                m1610(progressListenerCallbackExecutor, 4096);
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

    /* JADX INFO: renamed from: ֫ */
    public static void m1610(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        ProgressEvent progressEvent = new ProgressEvent(0L);
        progressEvent.m1393(i);
        progressListenerCallbackExecutor.m1397(progressEvent);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Signer m1613(DefaultRequest defaultRequest, String str, String str2) {
        this.f1630.getClass();
        Signer signerM1320 = m1320(defaultRequest.m1354());
        if (this.f1241.m1340() == null) {
            if ((signerM1320 instanceof AWSS3V4Signer) && defaultRequest.m1354().getHost().endsWith("s3.amazonaws.com") && this.f1628 == null) {
                String str3 = this.f1628 == null ? (String) f1622.get(str) : this.f1628;
                if (str3 != null) {
                    String strM1584 = RegionUtils.m1589(str3).m1584();
                    Protocol protocolM1336 = this.f1241.m1336();
                    if (strM1584 == null) {
                        throw new IllegalArgumentException("endpoint cannot be null");
                    }
                    if (!strM1584.contains("://")) {
                        strM1584 = protocolM1336.toString() + "://" + strM1584;
                    }
                    try {
                        mo1615(defaultRequest, str, str2, new URI(strM1584));
                        AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) signerM1320;
                        aWSS3V4Signer.setServiceName(m1321());
                        aWSS3V4Signer.setRegionName(str3);
                        return aWSS3V4Signer;
                    } catch (URISyntaxException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
            String str4 = this.f1628 == null ? (String) f1622.get(str) : this.f1628;
            if (str4 != null) {
                AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
                aWSS3V4Signer2.setServiceName(m1321());
                aWSS3V4Signer2.setRegionName(str4);
                return aWSS3V4Signer2;
            }
        }
        if (!(signerM1320 instanceof S3Signer)) {
            return signerM1320;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str != null ? str.concat("/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return new S3Signer(defaultRequest.m1359().toString(), sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1608(DefaultRequest defaultRequest, ObjectMetadata objectMetadata) {
        Map mapM1793 = objectMetadata.m1793();
        if (mapM1793.get("x-amz-server-side-encryption-aws-kms-key-id") != null && !ObjectMetadata.f1790.equals(mapM1793.get("x-amz-server-side-encryption"))) {
            throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }
        for (Map.Entry entry : mapM1793.entrySet()) {
            defaultRequest.m1348((String) entry.getKey(), entry.getValue().toString());
        }
        Date dateM1790 = objectMetadata.m1790();
        if (dateM1790 != null) {
            defaultRequest.m1348("Expires", DateUtils.m1932("EEE, dd MMM yyyy HH:mm:ss z", dateM1790));
        }
        Map mapM1801 = objectMetadata.m1801();
        if (mapM1801 != null) {
            for (Map.Entry entry2 : mapM1801.entrySet()) {
                String strTrim = (String) entry2.getKey();
                String strTrim2 = (String) entry2.getValue();
                if (strTrim != null) {
                    strTrim = strTrim.trim();
                }
                if (strTrim2 != null) {
                    strTrim2 = strTrim2.trim();
                }
                if (!"x-amz-tagging".equals(strTrim)) {
                    defaultRequest.m1348("x-amz-meta-" + strTrim, strTrim2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1609(DefaultRequest defaultRequest, String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int i = ServiceUtils.f1672;
        Iterator it = arrayList.iterator();
        String strM40053 = "";
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z) {
                strM40053 = C17588.m40053(strM40053, ", ");
            }
            strM40053 = C17588.m40053(strM40053, str2);
            z = false;
        }
        defaultRequest.m1348(str, strM40053);
    }

    /* JADX INFO: renamed from: ֫ */
    public final DefaultRequest m1612(String str, String str2, AmazonWebServiceRequest amazonWebServiceRequest, HttpMethodName httpMethodName, URI uri) {
        DefaultRequest defaultRequest = new DefaultRequest(amazonWebServiceRequest);
        this.f1630.getClass();
        defaultRequest.m1344(httpMethodName);
        mo1615(defaultRequest, str, str2, uri);
        return defaultRequest;
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m1606(DefaultRequest defaultRequest, AbstractS3ResponseHandler abstractS3ResponseHandler, String str, String str2) {
        m1322(defaultRequest.m1358());
        boolean z = false;
        S3ExecutionContext s3ExecutionContext = new S3ExecutionContext(this.f1245, System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null);
        AWSRequestMetrics aWSRequestMetricsM1420 = s3ExecutionContext.m1420();
        defaultRequest.m1345(aWSRequestMetricsM1420);
        aWSRequestMetricsM1420.mo1901(AWSRequestMetrics.Field.ClientExecuteTime);
        try {
            try {
                if (!defaultRequest.m1357().containsKey("Content-Type")) {
                    defaultRequest.m1348("Content-Type", "application/octet-stream");
                }
                if (str != null) {
                    if (defaultRequest.m1354().getHost().endsWith("s3.amazonaws.com") && this.f1628 == null) {
                        z = true;
                    }
                    if (z) {
                        m1611(str);
                    }
                }
                AWSCredentials aWSCredentialsMo1374 = this.f1626.mo1374();
                s3ExecutionContext.m1641(m1613(defaultRequest, str, str2));
                s3ExecutionContext.m1421(aWSCredentialsMo1374);
                Object objM1364 = this.f1240.m1418(defaultRequest, abstractS3ResponseHandler, this.f1629, s3ExecutionContext).m1364();
                m1323(aWSRequestMetricsM1420, defaultRequest);
                return objM1364;
            } catch (AmazonS3Exception e) {
                if (e.m1316() == 301 && e.m1690() != null) {
                    String str3 = (String) ((HashMap) e.m1690()).get("x-amz-bucket-region");
                    f1622.put(str, str3);
                    e.m1313("The bucket is in this region: " + str3 + ". Please use this region to retry the request");
                }
                throw e;
            }
        } catch (Throwable th) {
            m1323(aWSRequestMetricsM1420, defaultRequest);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1607(ObjectTagging objectTagging) {
        if (objectTagging == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) objectTagging.m1805()).iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            sb.append(S3HttpUtils.m1643(tag.m1837()));
            sb.append(C0184a.f880h);
            sb.append(S3HttpUtils.m1643(tag.m1838()));
            if (it.hasNext()) {
                sb.append(C0233a.f1084p);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m1611(String str) {
        Map map = f1622;
        String strM1744 = (String) map.get(str);
        Log log = f1623;
        if (strM1744 == null) {
            if (log.mo1459()) {
                log.mo1460("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            strM1744 = null;
            try {
                strM1744 = ((HeadBucketResult) m1606(m1612(str, null, new HeadBucketRequest(), HttpMethodName.HEAD, new URI("https://s3-us-west-1.amazonaws.com")), new HeadBucketResultHandler(), str, (String) null)).m1744();
            } catch (AmazonS3Exception e) {
                if (e.m1690() != null) {
                    strM1744 = (String) ((HashMap) e.m1690()).get("x-amz-bucket-region");
                }
            } catch (URISyntaxException unused) {
                log.mo1466("Error while creating URI");
            }
            if (strM1744 == null && log.mo1459()) {
                log.mo1460("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
            }
            if (strM1744 != null) {
                map.put(str, strM1744);
            }
        }
        if (log.mo1459()) {
            log.mo1460("Region for " + str + " is " + strM1744);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX INFO: renamed from: ֫ */
    public void mo1615(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        String str3;
        if (uri == null) {
            uri = this.f1243;
        }
        if (this.f1630.m1621() || !BucketNameUtils.m1624(str)) {
            f1623.mo1460("Using path style addressing. Endpoint = " + uri);
            defaultRequest.m1349(uri);
            if (str != null) {
                StringBuilder sbM21133 = C9179.m21133(str, "/");
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "";
                }
                sbM21133.append(str3);
                defaultRequest.m1347(sbM21133.toString());
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
                            f1623.mo1460("Using path style addressing. Endpoint = " + uri);
                            defaultRequest.m1349(uri);
                            if (str != null) {
                                StringBuilder sbM21134 = C9179.m21133(str, "/");
                                if (str2 != null) {
                                    str3 = str2;
                                } else {
                                    str3 = "";
                                }
                                sbM21134.append(str3);
                                defaultRequest.m1347(sbM21134.toString());
                            }
                        }
                    }
                }
            }
            f1623.mo1460("Using virtual style addressing. Endpoint = " + uri);
            try {
                defaultRequest.m1349(new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority()));
                defaultRequest.m1347((str2 == null || !str2.startsWith("/")) ? str2 : "/".concat(str2));
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(C21466.m48631("Invalid bucket name: ", str), e);
            }
        }
        f1623.mo1460("Key: " + str2 + "; Request: " + defaultRequest);
    }
}
