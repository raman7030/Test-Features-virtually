package com.amazonaws.services.s3.model.transform;

import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.AbortIncompleteMultipartUpload;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryDestination;
import com.amazonaws.services.s3.model.inventory.InventoryFilter;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventorySchedule;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import l.AbstractC16620;
import l.C2912;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/* JADX INFO: loaded from: classes.dex */
public class XmlResponsesSaxParser {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f689 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Log f690 = LogFactory.m302(XmlResponsesSaxParser.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public XMLReader f691;

    public XmlResponsesSaxParser() {
        this.f691 = null;
        try {
            this.f691 = XMLReaderFactory.createXMLReader();
        } catch (SAXException e) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f691 = XMLReaderFactory.createXMLReader();
            } catch (SAXException unused) {
                throw new AmazonClientException("Couldn't initialize a sax driver for the XMLReader", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m713(DefaultHandler defaultHandler, InputStream inputStream) throws IOException {
        XMLReader xMLReader = this.f691;
        Log log = f690;
        try {
            if (log.mo293()) {
                log.mo294("Parsing XML response document with handler: " + defaultHandler.getClass());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, a.D));
            xMLReader.setContentHandler(defaultHandler);
            xMLReader.setErrorHandler(defaultHandler);
            xMLReader.parse(new InputSource(bufferedReader));
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (log.mo296()) {
                    log.mo295("Unable to close response InputStream up after XML parse failure", e2);
                }
            }
            throw new AmazonClientException("Failed to parse XML document with handler " + defaultHandler.getClass(), th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m708(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m710(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            f690.mo295("Unable to parse integer value '" + str + "'", e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m711(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            f690.mo295("Unable to parse long value '" + str + "'", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m709(String str, boolean z) {
        if (!z) {
            return str;
        }
        int i = S3HttpUtils.f500;
        if (str == null) {
            return null;
        }
        try {
            return C2912.decode(str, a.D);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ListBucketHandler m712(InputStream inputStream, boolean z) throws IOException {
        ListBucketHandler listBucketHandler = new ListBucketHandler(z);
        Log log = f690;
        if (log.mo293()) {
            log.mo294("Sanitizing XML document destined for handler " + ListBucketHandler.class);
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, a.D));
            char[] cArr = new char[8192];
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i != -1) {
                    sb.append(cArr, 0, i);
                } else {
                    bufferedReader.close();
                    m713(listBucketHandler, new ByteArrayInputStream(sb.toString().replaceAll("\r", "&#013;").getBytes(StringUtils.f844)));
                    return listBucketHandler;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (log.mo296()) {
                    log.mo295("Unable to close response InputStream after failure sanitizing XML document", e2);
                }
            }
            throw new AmazonClientException("Failed to sanitize XML document destined for handler " + ListBucketHandler.class, th);
        }
    }

    public class ListBucketHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public final boolean f769;

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public final ObjectListing f767 = new ObjectListing();

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public S3ObjectSummary f770 = null;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public Owner f768 = null;

        public ListBucketHandler(boolean z) {
            this.f769 = z;
        }

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final ObjectListing m728() {
            return this.f767;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListBucketResult")) {
                if (str.equals("Contents")) {
                    S3ObjectSummary s3ObjectSummary = new S3ObjectSummary();
                    this.f770 = s3ObjectSummary;
                    s3ObjectSummary.m662(this.f767.m606());
                    return;
                }
                return;
            }
            if (m698("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f768 = new Owner();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            boolean zM697 = m697();
            String strM659 = null;
            ObjectListing objectListing = this.f767;
            if (zM697) {
                if (str.equals("ListBucketResult") && objectListing.m612() && objectListing.m611() == null) {
                    if (!objectListing.m613().isEmpty()) {
                        strM659 = ((S3ObjectSummary) objectListing.m613().get(objectListing.m613().size() - 1)).m659();
                    } else if (objectListing.m609().isEmpty()) {
                        XmlResponsesSaxParser.f690.mo291("S3 response indicates truncated results, but contains no object summaries or common prefixes.");
                    } else {
                        strM659 = (String) objectListing.m609().get(objectListing.m609().size() - 1);
                    }
                    objectListing.m610(strM659);
                    return;
                }
                return;
            }
            boolean zM698 = m698("ListBucketResult");
            boolean z = this.f769;
            if (zM698) {
                if (str.equals("Name")) {
                    objectListing.m607(m699());
                    if (XmlResponsesSaxParser.f690.mo293()) {
                        XmlResponsesSaxParser.f690.mo294("Examining listing for bucket: " + objectListing.m606());
                        return;
                    }
                    return;
                }
                if (str.equals("Prefix")) {
                    XmlResponsesSaxParser.m709(XmlResponsesSaxParser.m708(m699()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("Marker")) {
                    XmlResponsesSaxParser.m709(XmlResponsesSaxParser.m708(m699()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("NextMarker")) {
                    objectListing.m610(XmlResponsesSaxParser.m709(m699(), z));
                    return;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.m710(m699());
                    objectListing.getClass();
                    return;
                }
                if (str.equals("Delimiter")) {
                    XmlResponsesSaxParser.m709(XmlResponsesSaxParser.m708(m699()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m699();
                    int i = XmlResponsesSaxParser.f689;
                    objectListing.getClass();
                    return;
                } else {
                    if (str.equals("IsTruncated")) {
                        String strM789 = StringUtils.m789(m699());
                        if (strM789.startsWith("false")) {
                            objectListing.m608(false);
                            return;
                        } else {
                            if (strM789.startsWith("true")) {
                                objectListing.m608(true);
                                return;
                            }
                            throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strM789));
                        }
                    }
                    if (str.equals("Contents")) {
                        objectListing.m613().add(this.f770);
                        this.f770 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketResult", "Contents")) {
                if (str.equals("Key")) {
                    this.f770.m667(XmlResponsesSaxParser.m709(m699(), z));
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary = this.f770;
                    String strM699 = m699();
                    int i2 = ServiceUtils.f512;
                    s3ObjectSummary.m663(DateUtils.m772(strM699));
                    return;
                }
                if (str.equals("ETag")) {
                    this.f770.m665(ServiceUtils.m486(m699()));
                    return;
                }
                if (str.equals("Size")) {
                    this.f770.m660(XmlResponsesSaxParser.m711(m699()));
                    return;
                }
                if (str.equals("StorageClass")) {
                    this.f770.m668(m699());
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f770.m661(this.f768);
                        this.f768 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketResult", "Contents", "Owner")) {
                if (str.equals("ID")) {
                    this.f768.m642(m699());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f768.m641(m699());
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                objectListing.m609().add(XmlResponsesSaxParser.m709(m699(), z));
            }
        }
    }

    public class ListObjectsV2Handler extends AbstractHandler {

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public Owner f785;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public S3ObjectSummary f786;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f786 = new S3ObjectSummary();
                    throw null;
                }
            } else if (m698("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f785 = new Owner();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m697()) {
                if (str.equals("ListBucketResult")) {
                    throw null;
                }
                return;
            }
            if (m698("ListBucketResult")) {
                if (str.equals("Name")) {
                    m699();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    m699();
                    int i = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.m710(m699());
                    throw null;
                }
                if (str.equals("NextContinuationToken")) {
                    m699();
                    throw null;
                }
                if (str.equals("ContinuationToken")) {
                    m699();
                    throw null;
                }
                if (str.equals("StartAfter")) {
                    m699();
                    int i2 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("KeyCount")) {
                    XmlResponsesSaxParser.m710(m699());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    m699();
                    int i3 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    m699();
                    int i4 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    String strM789 = StringUtils.m789(m699());
                    if (strM789.startsWith("false") || strM789.startsWith("true")) {
                        throw null;
                    }
                    throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strM789));
                }
                if (str.equals("Contents")) {
                    throw null;
                }
                return;
            }
            if (m698("ListBucketResult", "Contents")) {
                if (str.equals("Key")) {
                    String strM699 = m699();
                    S3ObjectSummary s3ObjectSummary = this.f786;
                    int i5 = XmlResponsesSaxParser.f689;
                    s3ObjectSummary.m667(strM699);
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary2 = this.f786;
                    String strM6910 = m699();
                    int i6 = ServiceUtils.f512;
                    s3ObjectSummary2.m663(DateUtils.m772(strM6910));
                    return;
                }
                if (str.equals("ETag")) {
                    this.f786.m665(ServiceUtils.m486(m699()));
                    return;
                }
                if (str.equals("Size")) {
                    this.f786.m660(XmlResponsesSaxParser.m711(m699()));
                    return;
                }
                if (str.equals("StorageClass")) {
                    this.f786.m668(m699());
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f786.m661(this.f785);
                        this.f785 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketResult", "Contents", "Owner")) {
                if (str.equals("ID")) {
                    this.f785.m642(m699());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f785.m641(m699());
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                throw null;
            }
        }
    }

    public class ListAllMyBucketsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final ArrayList f758 = new ArrayList();

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public Owner f757 = null;

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public Bucket f756 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListAllMyBucketsResult")) {
                if (str.equals("Owner")) {
                    this.f757 = new Owner();
                }
            } else if (m698("ListAllMyBucketsResult", "Buckets") && str.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f756 = bucket;
                bucket.m526(this.f757);
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("ListAllMyBucketsResult", "Owner")) {
                if (str.equals("ID")) {
                    this.f757.m642(m699());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f757.m641(m699());
                        return;
                    }
                    return;
                }
            }
            if (m698("ListAllMyBucketsResult", "Buckets")) {
                if (str.equals("Bucket")) {
                    this.f758.add(this.f756);
                    this.f756 = null;
                    return;
                }
                return;
            }
            if (m698("ListAllMyBucketsResult", "Buckets", "Bucket")) {
                if (str.equals("Name")) {
                    this.f756.m527(m699());
                } else if (str.equals("CreationDate")) {
                    this.f756.m528(DateUtils.m772(m699()));
                }
            }
        }
    }

    public class AccessControlListHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final AccessControlList f694 = new AccessControlList();

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public Grantee f693 = null;

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public Permission f692 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            String value;
            if (m698("AccessControlPolicy")) {
                if (str.equals("Owner")) {
                    this.f694.m521(new Owner());
                    return;
                }
                return;
            }
            if (m698("AccessControlPolicy", "AccessControlList", "Grant") && str.equals("Grantee")) {
                int i = XmlResponsesSaxParser.f689;
                Charset charset = StringUtils.f844;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 < 8) {
                        if (Character.isWhitespace("xsi:type".charAt(i3))) {
                            i3++;
                        } else {
                            if (attributes == null) {
                                break;
                            }
                            while (true) {
                                if (i2 < attributes.getLength()) {
                                    if (attributes.getQName(i2).trim().equalsIgnoreCase("xsi:type")) {
                                        value = attributes.getValue(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                    value = null;
                    break;
                }
                if ("AmazonCustomerByEmail".equals(value)) {
                    this.f693 = new EmailAddressGrantee();
                } else if ("CanonicalUser".equals(value)) {
                    this.f693 = new CanonicalGrantee();
                } else {
                    "Group".equals(value);
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            boolean zM698 = m698("AccessControlPolicy", "Owner");
            AccessControlList accessControlList = this.f694;
            if (zM698) {
                if (str.equals("ID")) {
                    accessControlList.m522().m642(m699());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        accessControlList.m522().m641(m699());
                        return;
                    }
                    return;
                }
            }
            if (m698("AccessControlPolicy", "AccessControlList")) {
                if (str.equals("Grant")) {
                    Grantee grantee = this.f693;
                    Permission permission = this.f692;
                    ((LinkedList) accessControlList.m520()).add(new Grant(grantee, permission));
                    this.f693 = null;
                    this.f692 = null;
                    return;
                }
                return;
            }
            if (m698("AccessControlPolicy", "AccessControlList", "Grant")) {
                if (str.equals("Permission")) {
                    this.f692 = Permission.m646(m699());
                    return;
                }
                return;
            }
            if (m698("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                if (str.equals("ID")) {
                    this.f693.mo539(m699());
                    return;
                }
                if (str.equals("EmailAddress")) {
                    this.f693.mo539(m699());
                    return;
                }
                if (str.equals("URI")) {
                    this.f693 = GroupGrantee.m575(m699());
                } else if (str.equals("DisplayName")) {
                    CanonicalGrantee canonicalGrantee = (CanonicalGrantee) this.f693;
                    m699();
                    canonicalGrantee.getClass();
                }
            }
        }
    }

    public class BucketLoggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final BucketLoggingConfiguration f709 = new BucketLoggingConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("BucketLoggingStatus", "LoggingEnabled")) {
                boolean zEquals = str.equals("TargetBucket");
                BucketLoggingConfiguration bucketLoggingConfiguration = this.f709;
                if (zEquals) {
                    bucketLoggingConfiguration.m533(m699());
                } else if (str.equals("TargetPrefix")) {
                    bucketLoggingConfiguration.m534(m699());
                }
            }
        }
    }

    public class BucketLocationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m697() && str.equals("LocationConstraint")) {
                m699().getClass();
            }
        }
    }

    public class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public final CopyObjectResult f730 = new CopyObjectResult();

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public String f732 = null;

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public String f728 = null;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public String f731 = null;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public String f729 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        /* JADX INFO: renamed from: ܳ */
        public final ServerSideEncryptionResult mo701() {
            return this.f730;
        }

        /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
        public final Date m717() {
            return this.f730.m557();
        }

        /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
        public final String m722() {
            return this.f730.m550();
        }

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo478(String str) {
            this.f730.mo478(str);
        }

        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
        public final Date m721() {
            return this.f730.m554();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo468(Date date) {
            this.f730.mo468(date);
        }

        /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
        public final String m716() {
            return this.f730.m552();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ܽ */
        public final void mo469(String str) {
            this.f730.mo469(str);
        }

        /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
        public final String m725() {
            return this.f730.m555();
        }

        /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
        public final String m718() {
            return this.f732;
        }

        /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final String m724() {
            return this.f729;
        }

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public final String m720() {
            return this.f728;
        }

        /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
        public final String m719() {
            return this.f731;
        }

        /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
        public final boolean m723() {
            return this.f730.m556();
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo465(boolean z) {
            this.f730.mo465(z);
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (!m697() || str.equals("CopyObjectResult") || str.equals("CopyPartResult")) {
                return;
            }
            str.equals("Error");
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("CopyObjectResult") || m698("CopyPartResult")) {
                boolean zEquals = str.equals("LastModified");
                CopyObjectResult copyObjectResult = this.f730;
                if (zEquals) {
                    String strM699 = m699();
                    int i = ServiceUtils.f512;
                    copyObjectResult.m551(DateUtils.m772(strM699));
                    return;
                } else {
                    if (str.equals("ETag")) {
                        copyObjectResult.m553(ServiceUtils.m486(m699()));
                        return;
                    }
                    return;
                }
            }
            if (m698("Error")) {
                if (str.equals("Code")) {
                    this.f732 = m699();
                    return;
                }
                if (str.equals("Message")) {
                    this.f728 = m699();
                } else if (str.equals("RequestId")) {
                    this.f731 = m699();
                } else if (str.equals("HostId")) {
                    this.f729 = m699();
                }
            }
        }
    }

    public class RequestPaymentConfigurationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("RequestPaymentConfiguration") && str.equals("Payer")) {
                m699();
            }
        }
    }

    public class ListVersionsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public Owner f790;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListVersionsResult")) {
                if (str.equals(e.g)) {
                    new S3VersionSummary();
                    throw null;
                }
                if (str.equals("DeleteMarker")) {
                    new S3VersionSummary();
                    throw null;
                }
                return;
            }
            if ((m698("ListVersionsResult", e.g) || m698("ListVersionsResult", "DeleteMarker")) && str.equals("Owner")) {
                this.f790 = new Owner();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("ListVersionsResult")) {
                if (str.equals("Name")) {
                    m699();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    m699();
                    int i = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("KeyMarker")) {
                    m699();
                    int i2 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("VersionIdMarker")) {
                    m699();
                    int i3 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    Integer.parseInt(m699());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    m699();
                    int i4 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    m699();
                    int i5 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("NextKeyMarker")) {
                    m699();
                    int i6 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                if (str.equals("NextVersionIdMarker")) {
                    m699();
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m699());
                    throw null;
                }
                if (str.equals(e.g) || str.equals("DeleteMarker")) {
                    throw null;
                }
                return;
            }
            if (m698("ListVersionsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    m699();
                    int i7 = XmlResponsesSaxParser.f689;
                    throw null;
                }
                return;
            }
            if (m698("ListVersionsResult", e.g) || m698("ListVersionsResult", "DeleteMarker")) {
                if (str.equals("Key")) {
                    m699();
                    int i8 = XmlResponsesSaxParser.f689;
                    return;
                }
                if (str.equals("VersionId")) {
                    m699();
                    return;
                }
                if (str.equals("IsLatest")) {
                    "true".equals(m699());
                    return;
                }
                if (str.equals("LastModified")) {
                    String strM699 = m699();
                    int i9 = ServiceUtils.f512;
                    DateUtils.m772(strM699);
                    return;
                } else {
                    if (str.equals("ETag")) {
                        ServiceUtils.m486(m699());
                        return;
                    }
                    if (str.equals("Size")) {
                        Long.parseLong(m699());
                        return;
                    } else if (str.equals("Owner")) {
                        this.f790 = null;
                        return;
                    } else {
                        if (str.equals("StorageClass")) {
                            m699();
                            return;
                        }
                        return;
                    }
                }
            }
            if (m698("ListVersionsResult", e.g, "Owner") || m698("ListVersionsResult", "DeleteMarker", "Owner")) {
                if (str.equals("ID")) {
                    this.f790.m642(m699());
                } else if (str.equals("DisplayName")) {
                    this.f790.m641(m699());
                }
            }
        }
    }

    public class BucketWebsiteConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final BucketWebsiteConfiguration f722 = new BucketWebsiteConfiguration();

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public RoutingRuleCondition f720 = null;

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public RedirectRule f719 = null;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public RoutingRule f721 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f719 = new RedirectRule();
                }
            } else if (m698("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f721 = new RoutingRule();
                }
            } else if (m698("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f720 = new RoutingRuleCondition();
                } else if (str.equals("Redirect")) {
                    this.f719 = new RedirectRule();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            boolean zM698 = m698("WebsiteConfiguration");
            BucketWebsiteConfiguration bucketWebsiteConfiguration = this.f722;
            if (zM698) {
                if (str.equals("RedirectAllRequestsTo")) {
                    bucketWebsiteConfiguration.getClass();
                    this.f719 = null;
                    return;
                }
                return;
            }
            if (m698("WebsiteConfiguration", "IndexDocument")) {
                if (str.equals("Suffix")) {
                    m699();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m698("WebsiteConfiguration", "ErrorDocument")) {
                if (str.equals("Key")) {
                    m699();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m698("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    bucketWebsiteConfiguration.m537().add(this.f721);
                    this.f721 = null;
                    return;
                }
                return;
            }
            if (m698("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f721.getClass();
                    this.f720 = null;
                    return;
                } else {
                    if (str.equals("Redirect")) {
                        this.f721.getClass();
                        this.f719 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str.equals("KeyPrefixEquals")) {
                    RoutingRuleCondition routingRuleCondition = this.f720;
                    m699();
                    routingRuleCondition.getClass();
                    return;
                } else {
                    if (str.equals("HttpErrorCodeReturnedEquals")) {
                        RoutingRuleCondition routingRuleCondition2 = this.f720;
                        m699();
                        routingRuleCondition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("WebsiteConfiguration", "RedirectAllRequestsTo") || m698("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                if (str.equals("Protocol")) {
                    RedirectRule redirectRule = this.f719;
                    m699();
                    redirectRule.getClass();
                    return;
                }
                if (str.equals("HostName")) {
                    RedirectRule redirectRule2 = this.f719;
                    m699();
                    redirectRule2.getClass();
                    return;
                }
                if (str.equals("ReplaceKeyPrefixWith")) {
                    RedirectRule redirectRule3 = this.f719;
                    m699();
                    redirectRule3.getClass();
                } else if (str.equals("ReplaceKeyWith")) {
                    RedirectRule redirectRule4 = this.f719;
                    m699();
                    redirectRule4.getClass();
                } else if (str.equals("HttpRedirectCode")) {
                    RedirectRule redirectRule5 = this.f719;
                    m699();
                    redirectRule5.getClass();
                }
            }
        }
    }

    public class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final BucketVersioningConfiguration f718 = new BucketVersioningConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("VersioningConfiguration")) {
                boolean zEquals = str.equals("Status");
                BucketVersioningConfiguration bucketVersioningConfiguration = this.f718;
                if (zEquals) {
                    m699();
                    bucketVersioningConfiguration.getClass();
                } else if (str.equals("MfaDelete")) {
                    String strM699 = m699();
                    if (strM699.equals("Disabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else if (strM699.equals("Enabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else {
                        bucketVersioningConfiguration.getClass();
                    }
                }
            }
        }
    }

    public class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final BucketAccelerateConfiguration f695 = new BucketAccelerateConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("AccelerateConfiguration") && str.equals("Status")) {
                m699();
                this.f695.getClass();
            }
        }
    }

    public class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public String f723;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public String f724;

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public CompleteMultipartUploadResult f725;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public String f726;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public AmazonS3Exception f727;

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        /* JADX INFO: renamed from: ܳ */
        public final ServerSideEncryptionResult mo701() {
            return this.f725;
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo468(Date date) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f725;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ܽ */
        public final void mo469(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f725;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo478(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f725;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo465(boolean z) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f725;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
        public final CompleteMultipartUploadResult m714() {
            return this.f725;
        }

        /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
        public final AmazonS3Exception m715() {
            return this.f727;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m697() && str.equals("CompleteMultipartUploadResult")) {
                this.f725 = new CompleteMultipartUploadResult();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            AmazonS3Exception amazonS3Exception;
            if (m697()) {
                if (!str.equals("Error") || (amazonS3Exception = this.f727) == null) {
                    return;
                }
                amazonS3Exception.m144(this.f724);
                this.f727.m148(this.f726);
                this.f727.m525(this.f723);
                return;
            }
            if (m698("CompleteMultipartUploadResult")) {
                if (str.equals("Location")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult = this.f725;
                    m699();
                    completeMultipartUploadResult.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult2 = this.f725;
                    m699();
                    completeMultipartUploadResult2.getClass();
                    return;
                } else if (str.equals("Key")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult3 = this.f725;
                    m699();
                    completeMultipartUploadResult3.getClass();
                    return;
                } else {
                    if (str.equals("ETag")) {
                        CompleteMultipartUploadResult completeMultipartUploadResult4 = this.f725;
                        ServiceUtils.m486(m699());
                        completeMultipartUploadResult4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("Error")) {
                if (str.equals("Code")) {
                    this.f724 = m699();
                    return;
                }
                if (str.equals("Message")) {
                    this.f727 = new AmazonS3Exception(m699());
                } else if (str.equals("RequestId")) {
                    this.f726 = m699();
                } else if (str.equals("HostId")) {
                    this.f723 = m699();
                }
            }
        }
    }

    public class InitiateMultipartUploadHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final InitiateMultipartUploadResult f755 = new InitiateMultipartUploadResult();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
        }

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final InitiateMultipartUploadResult m727() {
            return this.f755;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("InitiateMultipartUploadResult")) {
                boolean zEquals = str.equals("Bucket");
                InitiateMultipartUploadResult initiateMultipartUploadResult = this.f755;
                if (zEquals) {
                    m699();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("Key")) {
                    m699();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("UploadId")) {
                    initiateMultipartUploadResult.m588(m699());
                }
            }
        }
    }

    public class ListMultipartUploadsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public final MultipartUploadListing f782 = new MultipartUploadListing();

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public Owner f783;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public MultipartUpload f784;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListMultipartUploadsResult")) {
                if (str.equals("Upload")) {
                    this.f784 = new MultipartUpload();
                }
            } else if (m698("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f783 = new Owner();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            boolean zM698 = m698("ListMultipartUploadsResult");
            MultipartUploadListing multipartUploadListing = this.f782;
            if (zM698) {
                if (str.equals("Bucket")) {
                    m699();
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("KeyMarker")) {
                    m699();
                    int i = XmlResponsesSaxParser.f689;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("Delimiter")) {
                    m699();
                    int i2 = XmlResponsesSaxParser.f689;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    m699();
                    int i3 = XmlResponsesSaxParser.f689;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("UploadIdMarker")) {
                    m699();
                    int i4 = XmlResponsesSaxParser.f689;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("NextKeyMarker")) {
                    m699();
                    int i5 = XmlResponsesSaxParser.f689;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("NextUploadIdMarker")) {
                    m699();
                    int i6 = XmlResponsesSaxParser.f689;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("MaxUploads")) {
                    Integer.parseInt(m699());
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m699();
                    int i7 = XmlResponsesSaxParser.f689;
                    multipartUploadListing.getClass();
                    return;
                } else if (str.equals("IsTruncated")) {
                    Boolean.parseBoolean(m699());
                    multipartUploadListing.getClass();
                    return;
                } else {
                    if (str.equals("Upload")) {
                        ((ArrayList) multipartUploadListing.m605()).add(this.f784);
                        this.f784 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListMultipartUploadsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    multipartUploadListing.m604().add(m699());
                    return;
                }
                return;
            }
            if (m698("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Key")) {
                    MultipartUpload multipartUpload = this.f784;
                    m699();
                    multipartUpload.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    MultipartUpload multipartUpload2 = this.f784;
                    m699();
                    multipartUpload2.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    this.f784.getClass();
                    this.f783 = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    this.f784.getClass();
                    this.f783 = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    MultipartUpload multipartUpload3 = this.f784;
                    m699();
                    multipartUpload3.getClass();
                    return;
                } else {
                    if (str.equals("Initiated")) {
                        MultipartUpload multipartUpload4 = this.f784;
                        String strM699 = m699();
                        int i8 = ServiceUtils.f512;
                        DateUtils.m772(strM699);
                        multipartUpload4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListMultipartUploadsResult", "Upload", "Owner") || m698("ListMultipartUploadsResult", "Upload", "Initiator")) {
                if (str.equals("ID")) {
                    this.f783.m642(XmlResponsesSaxParser.m708(m699()));
                } else if (str.equals("DisplayName")) {
                    this.f783.m641(XmlResponsesSaxParser.m708(m699()));
                }
            }
        }
    }

    public class ListPartsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public final PartListing f787 = new PartListing();

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public PartSummary f788;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public Owner f789;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListPartsResult")) {
                if (str.equals("Part")) {
                    this.f788 = new PartSummary();
                } else if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f789 = new Owner();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("ListPartsResult")) {
                boolean zEquals = str.equals("Bucket");
                PartListing partListing = this.f787;
                if (zEquals) {
                    m699();
                    partListing.getClass();
                    return;
                }
                if (str.equals("Key")) {
                    m699();
                    partListing.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    m699();
                    partListing.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    partListing.getClass();
                    this.f789 = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    partListing.getClass();
                    this.f789 = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    m699();
                    partListing.getClass();
                    return;
                }
                if (str.equals("PartNumberMarker")) {
                    m699();
                    String strM708 = XmlResponsesSaxParser.m708(m699());
                    (strM708 != null ? Integer.valueOf(Integer.parseInt(strM708)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("NextPartNumberMarker")) {
                    m699();
                    String strM709 = XmlResponsesSaxParser.m708(m699());
                    (strM709 != null ? Integer.valueOf(Integer.parseInt(strM709)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("MaxParts")) {
                    m699();
                    String strM7010 = XmlResponsesSaxParser.m708(m699());
                    (strM7010 != null ? Integer.valueOf(Integer.parseInt(strM7010)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m699();
                    int i = XmlResponsesSaxParser.f689;
                    partListing.getClass();
                    return;
                } else if (str.equals("IsTruncated")) {
                    Boolean.parseBoolean(m699());
                    partListing.getClass();
                    return;
                } else {
                    if (str.equals("Part")) {
                        ((ArrayList) partListing.m645()).add(this.f788);
                        this.f788 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListPartsResult", "Part")) {
                if (str.equals("PartNumber")) {
                    PartSummary partSummary = this.f788;
                    Integer.parseInt(m699());
                    partSummary.getClass();
                    return;
                }
                if (str.equals("LastModified")) {
                    PartSummary partSummary2 = this.f788;
                    String strM699 = m699();
                    int i2 = ServiceUtils.f512;
                    DateUtils.m772(strM699);
                    partSummary2.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    PartSummary partSummary3 = this.f788;
                    ServiceUtils.m486(m699());
                    partSummary3.getClass();
                    return;
                } else {
                    if (str.equals("Size")) {
                        PartSummary partSummary4 = this.f788;
                        Long.parseLong(m699());
                        partSummary4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListPartsResult", "Owner") || m698("ListPartsResult", "Initiator")) {
                if (str.equals("ID")) {
                    this.f789.m642(XmlResponsesSaxParser.m708(m699()));
                } else if (str.equals("DisplayName")) {
                    this.f789.m641(XmlResponsesSaxParser.m708(m699()));
                }
            }
        }
    }

    public class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public String f710;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public ReplicationRule f711;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public ReplicationDestinationConfig f712;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final BucketReplicationConfiguration f713 = new BucketReplicationConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ReplicationConfiguration")) {
                if (str.equals("Rule")) {
                    this.f711 = new ReplicationRule();
                }
            } else if (m698("ReplicationConfiguration", "Rule") && str.equals("Destination")) {
                this.f712 = new ReplicationDestinationConfig();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("ReplicationConfiguration")) {
                boolean zEquals = str.equals("Rule");
                BucketReplicationConfiguration bucketReplicationConfiguration = this.f713;
                if (zEquals) {
                    bucketReplicationConfiguration.m535(this.f710, this.f711);
                    this.f711 = null;
                    this.f710 = null;
                    this.f712 = null;
                    return;
                }
                if (str.equals("Role")) {
                    m699();
                    bucketReplicationConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m698("ReplicationConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    this.f710 = m699();
                    return;
                }
                if (str.equals("Prefix")) {
                    ReplicationRule replicationRule = this.f711;
                    String strM699 = m699();
                    replicationRule.getClass();
                    if (strM699 == null) {
                        throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
                    }
                    return;
                }
                if (str.equals("Status")) {
                    ReplicationRule replicationRule2 = this.f711;
                    m699();
                    replicationRule2.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        ReplicationRule replicationRule3 = this.f711;
                        ReplicationDestinationConfig replicationDestinationConfig = this.f712;
                        replicationRule3.getClass();
                        if (replicationDestinationConfig == null) {
                            throw new IllegalArgumentException("Destination cannot be null in the replication rule");
                        }
                        return;
                    }
                    return;
                }
            }
            if (m698("ReplicationConfiguration", "Rule", "Destination")) {
                if (str.equals("Bucket")) {
                    ReplicationDestinationConfig replicationDestinationConfig2 = this.f712;
                    String strM6910 = m699();
                    replicationDestinationConfig2.getClass();
                    if (strM6910 == null) {
                        throw new IllegalArgumentException("Bucket name cannot be null");
                    }
                    return;
                }
                if (str.equals("StorageClass")) {
                    ReplicationDestinationConfig replicationDestinationConfig3 = this.f712;
                    m699();
                    replicationDestinationConfig3.getClass();
                }
            }
        }
    }

    public class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public HashMap f714;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public String f715;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public String f716;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final BucketTaggingConfiguration f717 = new BucketTaggingConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("Tagging") && str.equals("TagSet")) {
                this.f714 = new HashMap();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            String str2;
            if (m698("Tagging")) {
                if (str.equals("TagSet")) {
                    this.f717.m536().add(new TagSet(this.f714));
                    this.f714 = null;
                    return;
                }
                return;
            }
            if (m698("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    String str3 = this.f715;
                    if (str3 != null && (str2 = this.f716) != null) {
                        this.f714.put(str3, str2);
                    }
                    this.f715 = null;
                    this.f716 = null;
                    return;
                }
                return;
            }
            if (m698("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f715 = m699();
                } else if (str.equals("Value")) {
                    this.f716 = m699();
                }
            }
        }
    }

    public class GetObjectTaggingHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public ArrayList f752;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public String f753;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public String f754;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("Tagging") && str.equals("TagSet")) {
                this.f752 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("Tagging") && str.equals("TagSet")) {
                this.f752 = null;
            }
            if (m698("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    this.f752.add(new Tag(this.f754, this.f753));
                    this.f754 = null;
                    this.f753 = null;
                    return;
                }
                return;
            }
            if (m698("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f754 = m699();
                } else if (str.equals("Value")) {
                    this.f753 = m699();
                }
            }
        }
    }

    public class DeleteObjectsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public final DeleteObjectsResponse f733 = new DeleteObjectsResponse();

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public DeleteObjectsResult.DeletedObject f735 = null;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public MultiObjectDeleteException.DeleteError f734 = null;

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final DeleteObjectsResponse m726() {
            return this.f733;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f735 = new DeleteObjectsResult.DeletedObject();
                } else if (str.equals("Error")) {
                    this.f734 = new MultiObjectDeleteException.DeleteError();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("DeleteResult")) {
                boolean zEquals = str.equals("Deleted");
                DeleteObjectsResponse deleteObjectsResponse = this.f733;
                if (zEquals) {
                    ((ArrayList) deleteObjectsResponse.m464()).add(this.f735);
                    this.f735 = null;
                    return;
                }
                if (str.equals("Error")) {
                    ((ArrayList) deleteObjectsResponse.m466()).add(this.f734);
                    this.f734 = null;
                    return;
                }
                return;
            }
            if (m698("DeleteResult", "Deleted")) {
                if (str.equals("Key")) {
                    DeleteObjectsResult.DeletedObject deletedObject = this.f735;
                    m699();
                    deletedObject.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    DeleteObjectsResult.DeletedObject deletedObject2 = this.f735;
                    m699();
                    deletedObject2.getClass();
                    return;
                } else if (str.equals("DeleteMarker")) {
                    DeleteObjectsResult.DeletedObject deletedObject3 = this.f735;
                    m699().equals("true");
                    deletedObject3.getClass();
                    return;
                } else {
                    if (str.equals("DeleteMarkerVersionId")) {
                        DeleteObjectsResult.DeletedObject deletedObject4 = this.f735;
                        m699();
                        deletedObject4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("DeleteResult", "Error")) {
                if (str.equals("Key")) {
                    this.f734.m603(m699());
                    return;
                }
                if (str.equals("VersionId")) {
                    MultiObjectDeleteException.DeleteError deleteError = this.f734;
                    m699();
                    deleteError.getClass();
                } else if (str.equals("Code")) {
                    MultiObjectDeleteException.DeleteError deleteError2 = this.f734;
                    m699();
                    deleteError2.getClass();
                } else if (str.equals("Message")) {
                    MultiObjectDeleteException.DeleteError deleteError3 = this.f734;
                    m699();
                    deleteError3.getClass();
                }
            }
        }
    }

    public class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public final BucketLifecycleConfiguration f702 = new BucketLifecycleConfiguration(new ArrayList());

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public ArrayList f703;

        /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
        public BucketLifecycleConfiguration.Transition f704;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public BucketLifecycleConfiguration.Rule f705;

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public BucketLifecycleConfiguration.NoncurrentVersionTransition f706;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public LifecycleFilter f707;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public AbortIncompleteMultipartUpload f708;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f705 = new BucketLifecycleConfiguration.Rule();
                    return;
                }
                return;
            }
            if (m698("LifecycleConfiguration", "Rule")) {
                if (str.equals(AbstractC16620.LOG_TAG)) {
                    this.f704 = new BucketLifecycleConfiguration.Transition();
                    return;
                }
                if (str.equals("NoncurrentVersionTransition")) {
                    this.f706 = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
                    return;
                } else if (str.equals("AbortIncompleteMultipartUpload")) {
                    this.f708 = new AbortIncompleteMultipartUpload();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f707 = new LifecycleFilter();
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", "Filter") && str.equals("And")) {
                this.f703 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    ((ArrayList) this.f702.m530()).add(this.f705);
                    this.f705 = null;
                    return;
                }
                return;
            }
            if (m698("LifecycleConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    BucketLifecycleConfiguration.Rule rule = this.f705;
                    m699();
                    rule.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    BucketLifecycleConfiguration.Rule rule2 = this.f705;
                    m699();
                    rule2.getClass();
                    return;
                }
                if (str.equals("Status")) {
                    BucketLifecycleConfiguration.Rule rule3 = this.f705;
                    m699();
                    rule3.getClass();
                    return;
                }
                if (str.equals(AbstractC16620.LOG_TAG)) {
                    this.f705.m532(this.f704);
                    this.f704 = null;
                    return;
                }
                if (str.equals("NoncurrentVersionTransition")) {
                    this.f705.m531(this.f706);
                    this.f706 = null;
                    return;
                } else if (str.equals("AbortIncompleteMultipartUpload")) {
                    this.f705.getClass();
                    this.f708 = null;
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f705.getClass();
                        this.f707 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str.equals("Date")) {
                    BucketLifecycleConfiguration.Rule rule4 = this.f705;
                    String strM699 = m699();
                    int i = ServiceUtils.f512;
                    DateUtils.m772(strM699);
                    rule4.getClass();
                    return;
                }
                if (str.equals("Days")) {
                    BucketLifecycleConfiguration.Rule rule5 = this.f705;
                    Integer.parseInt(m699());
                    rule5.getClass();
                    return;
                } else {
                    if (str.equals("ExpiredObjectDeleteMarker") && "true".equals(m699())) {
                        this.f705.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", AbstractC16620.LOG_TAG)) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.Transition transition = this.f704;
                    m699();
                    transition.getClass();
                    return;
                } else {
                    if (str.equals("Date")) {
                        BucketLifecycleConfiguration.Transition transition2 = this.f704;
                        String strM6910 = m699();
                        int i2 = ServiceUtils.f512;
                        DateUtils.m772(strM6910);
                        transition2.getClass();
                        return;
                    }
                    if (str.equals("Days")) {
                        BucketLifecycleConfiguration.Transition transition3 = this.f704;
                        Integer.parseInt(m699());
                        transition3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str.equals("NoncurrentDays")) {
                    BucketLifecycleConfiguration.Rule rule6 = this.f705;
                    Integer.parseInt(m699());
                    rule6.getClass();
                    return;
                }
                return;
            }
            if (m698("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = this.f706;
                    m699();
                    noncurrentVersionTransition.getClass();
                    return;
                } else {
                    if (str.equals("NoncurrentDays")) {
                        BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition2 = this.f706;
                        Integer.parseInt(m699());
                        noncurrentVersionTransition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (str.equals("DaysAfterInitiation")) {
                    this.f708.m493(Integer.parseInt(m699()));
                    return;
                }
                return;
            }
            if (m698("LifecycleConfiguration", "Rule", "Filter")) {
                if (str.equals("Prefix")) {
                    LifecycleFilter lifecycleFilter = this.f707;
                    m699();
                    new LifecyclePrefixPredicate();
                    lifecycleFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    LifecycleFilter lifecycleFilter2 = this.f707;
                    new LifecycleTagPredicate();
                    lifecycleFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        LifecycleFilter lifecycleFilter3 = this.f707;
                        new LifecycleAndOperator(this.f703);
                        lifecycleFilter3.getClass();
                        this.f703 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m699();
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f703;
                    m699();
                    arrayList.add(new LifecyclePrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f703.add(new LifecycleTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m698("LifecycleConfiguration", "Rule", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                } else if (str.equals("Value")) {
                    m699();
                }
            }
        }
    }

    public class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public CORSRule f699;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public final BucketCrossOriginConfiguration f700 = new BucketCrossOriginConfiguration(new ArrayList());

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public ArrayList f697 = null;

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public ArrayList f696 = null;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public ArrayList f698 = null;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public LinkedList f701 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f699 = new CORSRule();
                    return;
                }
                return;
            }
            if (m698("CORSConfiguration", "CORSRule")) {
                if (str.equals("AllowedOrigin")) {
                    if (this.f696 == null) {
                        this.f696 = new ArrayList();
                    }
                } else if (str.equals("AllowedMethod")) {
                    if (this.f697 == null) {
                        this.f697 = new ArrayList();
                    }
                } else if (str.equals("ExposeHeader")) {
                    if (this.f698 == null) {
                        this.f698 = new ArrayList();
                    }
                } else if (str.equals("AllowedHeader") && this.f701 == null) {
                    this.f701 = new LinkedList();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f699.getClass();
                    this.f699.getClass();
                    this.f699.getClass();
                    this.f699.getClass();
                    this.f701 = null;
                    this.f697 = null;
                    this.f696 = null;
                    this.f698 = null;
                    ((ArrayList) this.f700.m529()).add(this.f699);
                    this.f699 = null;
                    return;
                }
                return;
            }
            if (m698("CORSConfiguration", "CORSRule")) {
                if (str.equals("ID")) {
                    CORSRule cORSRule = this.f699;
                    m699();
                    cORSRule.getClass();
                    return;
                }
                if (str.equals("AllowedOrigin")) {
                    this.f696.add(m699());
                    return;
                }
                if (str.equals("AllowedMethod")) {
                    this.f697.add(CORSRule.AllowedMethods.m538(m699()));
                    return;
                }
                if (str.equals("MaxAgeSeconds")) {
                    CORSRule cORSRule2 = this.f699;
                    Integer.parseInt(m699());
                    cORSRule2.getClass();
                } else if (str.equals("ExposeHeader")) {
                    this.f698.add(m699());
                } else if (str.equals("AllowedHeader")) {
                    this.f701.add(m699());
                }
            }
        }
    }

    public class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public MetricsFilter f749;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final MetricsConfiguration f750 = new MetricsConfiguration();

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public ArrayList f751;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f749 = new MetricsFilter();
                }
            } else if (m698("MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f751 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("MetricsConfiguration")) {
                boolean zEquals = str.equals("Id");
                MetricsConfiguration metricsConfiguration = this.f750;
                if (zEquals) {
                    m699();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        metricsConfiguration.getClass();
                        this.f749 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f749;
                    m699();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f749;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f749;
                        new MetricsAndOperator(this.f751);
                        metricsFilter3.getClass();
                        this.f751 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m699();
                        return;
                    }
                    return;
                }
            }
            if (m698("MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f751;
                    m699();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f751.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m698("MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                } else if (str.equals("Value")) {
                    m699();
                }
            }
        }
    }

    public class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public MetricsFilter f778;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public MetricsConfiguration f779;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public final ListBucketMetricsConfigurationsResult f780 = new ListBucketMetricsConfigurationsResult();

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public ArrayList f781;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListMetricsConfigurationsResult")) {
                if (str.equals("MetricsConfiguration")) {
                    this.f779 = new MetricsConfiguration();
                }
            } else if (m698("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f778 = new MetricsFilter();
                }
            } else if (m698("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f781 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("ListMetricsConfigurationsResult")) {
                boolean zEquals = str.equals("MetricsConfiguration");
                ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult = this.f780;
                if (zEquals) {
                    if (listBucketMetricsConfigurationsResult.m594() == null) {
                        listBucketMetricsConfigurationsResult.m595(new ArrayList());
                    }
                    ((ArrayList) listBucketMetricsConfigurationsResult.m594()).add(this.f779);
                    this.f779 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m699());
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m699();
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m699();
                        listBucketMetricsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Id")) {
                    MetricsConfiguration metricsConfiguration = this.f779;
                    m699();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f779.getClass();
                        this.f778 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f778;
                    m699();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f778;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f778;
                        new MetricsAndOperator(this.f781);
                        metricsFilter3.getClass();
                        this.f781 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m699();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f781;
                    m699();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f781.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m698("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                } else if (str.equals("Value")) {
                    m699();
                }
            }
        }
    }

    public class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysisDataExport f736;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public final AnalyticsConfiguration f737 = new AnalyticsConfiguration();

        /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysis f738;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public AnalyticsS3BucketDestination f739;

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public AnalyticsFilter f740;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public AnalyticsExportDestination f741;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public ArrayList f742;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f740 = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f738 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (m698("AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f742 = new ArrayList();
                }
            } else if (m698("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f736 = new StorageClassAnalysisDataExport();
                }
            } else if (m698("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f741 = new AnalyticsExportDestination();
                }
            } else if (m698("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f739 = new AnalyticsS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("AnalyticsConfiguration")) {
                boolean zEquals = str.equals("Id");
                AnalyticsConfiguration analyticsConfiguration = this.f737;
                if (zEquals) {
                    m699();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    analyticsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        analyticsConfiguration.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f740;
                    m699();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f740;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f740;
                        new AnalyticsAndOperator(this.f742);
                        analyticsFilter3.getClass();
                        this.f742 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m699();
                        return;
                    }
                    return;
                }
            }
            if (m698("AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f742;
                    m699();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f742.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m698("AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m699();
                        return;
                    }
                    return;
                }
            }
            if (m698("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f738.getClass();
                    return;
                }
                return;
            }
            if (m698("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f736;
                    m699();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f736.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f741.getClass();
                    return;
                }
                return;
            }
            if (m698("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f739;
                    m699();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f739;
                    m699();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f739;
                    m699();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f739;
                    m699();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }
    }

    public class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public AnalyticsFilter f759;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public AnalyticsConfiguration f760;

        /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
        public AnalyticsS3BucketDestination f761;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final ListBucketAnalyticsConfigurationsResult f762 = new ListBucketAnalyticsConfigurationsResult();

        /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysis f763;

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public AnalyticsExportDestination f764;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysisDataExport f765;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public ArrayList f766;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    this.f760 = new AnalyticsConfiguration();
                    return;
                }
                return;
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f759 = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f763 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f766 = new ArrayList();
                }
            } else if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f765 = new StorageClassAnalysisDataExport();
                }
            } else if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f764 = new AnalyticsExportDestination();
                }
            } else if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f761 = new AnalyticsS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("ListBucketAnalyticsConfigurationsResult")) {
                boolean zEquals = str.equals("AnalyticsConfiguration");
                ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult = this.f762;
                if (zEquals) {
                    if (listBucketAnalyticsConfigurationsResult.m590() == null) {
                        listBucketAnalyticsConfigurationsResult.m591(new ArrayList());
                    }
                    ((ArrayList) listBucketAnalyticsConfigurationsResult.m590()).add(this.f760);
                    this.f760 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m699());
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m699();
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m699();
                        listBucketAnalyticsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Id")) {
                    AnalyticsConfiguration analyticsConfiguration = this.f760;
                    m699();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    this.f760.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f760.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f759;
                    m699();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f759;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f759;
                        new AnalyticsAndOperator(this.f766);
                        analyticsFilter3.getClass();
                        this.f766 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m699();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f766;
                    m699();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f766.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m699();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m699();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f763.getClass();
                    return;
                }
                return;
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f765;
                    m699();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f765.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f764.getClass();
                    return;
                }
                return;
            }
            if (m698("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f761;
                    m699();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f761;
                    m699();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f761;
                    m699();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f761;
                    m699();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }
    }

    public class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public InventoryDestination f743;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public InventoryFilter f744;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public InventoryS3BucketDestination f745;

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public ArrayList f746;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public InventorySchedule f747;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public final InventoryConfiguration f748;

        public GetBucketInventoryConfigurationHandler() {
            new GetBucketInventoryConfigurationResult();
            this.f748 = new InventoryConfiguration();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("InventoryConfiguration")) {
                if (str.equals("Destination")) {
                    this.f743 = new InventoryDestination();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f744 = new InventoryFilter();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f747 = new InventorySchedule();
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f746 = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            if (m698("InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                this.f745 = new InventoryS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("InventoryConfiguration")) {
                boolean zEquals = str.equals("Id");
                InventoryConfiguration inventoryConfiguration = this.f748;
                if (zEquals) {
                    m699();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    inventoryConfiguration.getClass();
                    this.f743 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    "true".equals(m699());
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    inventoryConfiguration.getClass();
                    this.f744 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    m699();
                    inventoryConfiguration.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    inventoryConfiguration.getClass();
                    this.f747 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        inventoryConfiguration.getClass();
                        this.f746 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f743.getClass();
                    this.f745 = null;
                    return;
                }
                return;
            }
            if (m698("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination = this.f745;
                    m699();
                    inventoryS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f745;
                    m699();
                    inventoryS3BucketDestination2.getClass();
                    return;
                } else if (str.equals("Format")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f745;
                    m699();
                    inventoryS3BucketDestination3.getClass();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f745;
                        m699();
                        inventoryS3BucketDestination4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    InventoryFilter inventoryFilter = this.f744;
                    m699();
                    new InventoryPrefixPredicate();
                    inventoryFilter.getClass();
                    return;
                }
                return;
            }
            if (m698("InventoryConfiguration", "Schedule")) {
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f747;
                    m699();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (m698("InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f746.add(m699());
            }
        }
    }

    public class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public InventoryFilter f771;

        /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
        public InventoryDestination f772;

        /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
        public final ListBucketInventoryConfigurationsResult f773 = new ListBucketInventoryConfigurationsResult();

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public InventorySchedule f774;

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public InventoryS3BucketDestination f775;

        /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
        public ArrayList f776;

        /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
        public InventoryConfiguration f777;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo696(String str, Attributes attributes) {
            if (m698("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    this.f777 = new InventoryConfiguration();
                    return;
                }
                return;
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Destination")) {
                    this.f772 = new InventoryDestination();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f771 = new InventoryFilter();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f774 = new InventorySchedule();
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f776 = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                this.f775 = new InventoryS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo700(String str) {
            if (m698("ListInventoryConfigurationsResult")) {
                boolean zEquals = str.equals("InventoryConfiguration");
                ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult = this.f773;
                if (zEquals) {
                    if (listBucketInventoryConfigurationsResult.m592() == null) {
                        listBucketInventoryConfigurationsResult.m593(new ArrayList());
                    }
                    ((ArrayList) listBucketInventoryConfigurationsResult.m592()).add(this.f777);
                    this.f777 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m699());
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m699();
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m699();
                        listBucketInventoryConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Id")) {
                    InventoryConfiguration inventoryConfiguration = this.f777;
                    m699();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f777.getClass();
                    this.f772 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    InventoryConfiguration inventoryConfiguration2 = this.f777;
                    "true".equals(m699());
                    inventoryConfiguration2.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f777.getClass();
                    this.f771 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    InventoryConfiguration inventoryConfiguration3 = this.f777;
                    m699();
                    inventoryConfiguration3.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f777.getClass();
                    this.f774 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f777.getClass();
                        this.f776 = null;
                        return;
                    }
                    return;
                }
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f772.getClass();
                    this.f775 = null;
                    return;
                }
                return;
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination = this.f775;
                    m699();
                    inventoryS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f775;
                    m699();
                    inventoryS3BucketDestination2.getClass();
                    return;
                } else if (str.equals("Format")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f775;
                    m699();
                    inventoryS3BucketDestination3.getClass();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f775;
                        m699();
                        inventoryS3BucketDestination4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    InventoryFilter inventoryFilter = this.f771;
                    m699();
                    new InventoryPrefixPredicate();
                    inventoryFilter.getClass();
                    return;
                }
                return;
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration", "Schedule")) {
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f774;
                    m699();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (m698("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f776.add(m699());
            }
        }
    }
}
