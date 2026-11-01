package com.amazonaws.services.p061s3.model.transform;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.p061s3.internal.ObjectExpirationResult;
import com.amazonaws.services.p061s3.internal.S3HttpUtils;
import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.p061s3.internal.S3VersionResult;
import com.amazonaws.services.p061s3.internal.ServerSideEncryptionResult;
import com.amazonaws.services.p061s3.internal.ServiceUtils;
import com.amazonaws.services.p061s3.model.AbortIncompleteMultipartUpload;
import com.amazonaws.services.p061s3.model.AccessControlList;
import com.amazonaws.services.p061s3.model.AmazonS3Exception;
import com.amazonaws.services.p061s3.model.Bucket;
import com.amazonaws.services.p061s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.p061s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.p061s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.p061s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.p061s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.p061s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.p061s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.p061s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.p061s3.model.CORSRule;
import com.amazonaws.services.p061s3.model.CanonicalGrantee;
import com.amazonaws.services.p061s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.p061s3.model.CopyObjectResult;
import com.amazonaws.services.p061s3.model.DeleteObjectsResult;
import com.amazonaws.services.p061s3.model.EmailAddressGrantee;
import com.amazonaws.services.p061s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.p061s3.model.Grant;
import com.amazonaws.services.p061s3.model.Grantee;
import com.amazonaws.services.p061s3.model.GroupGrantee;
import com.amazonaws.services.p061s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.p061s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.p061s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.p061s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.p061s3.model.MultiObjectDeleteException;
import com.amazonaws.services.p061s3.model.MultipartUpload;
import com.amazonaws.services.p061s3.model.MultipartUploadListing;
import com.amazonaws.services.p061s3.model.ObjectListing;
import com.amazonaws.services.p061s3.model.Owner;
import com.amazonaws.services.p061s3.model.PartListing;
import com.amazonaws.services.p061s3.model.PartSummary;
import com.amazonaws.services.p061s3.model.Permission;
import com.amazonaws.services.p061s3.model.RedirectRule;
import com.amazonaws.services.p061s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.p061s3.model.ReplicationRule;
import com.amazonaws.services.p061s3.model.RoutingRule;
import com.amazonaws.services.p061s3.model.RoutingRuleCondition;
import com.amazonaws.services.p061s3.model.S3ObjectSummary;
import com.amazonaws.services.p061s3.model.S3VersionSummary;
import com.amazonaws.services.p061s3.model.Tag;
import com.amazonaws.services.p061s3.model.TagSet;
import com.amazonaws.services.p061s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.p061s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.p061s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.p061s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.p061s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.p061s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.p061s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.p061s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.p061s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.p061s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.p061s3.model.inventory.InventoryDestination;
import com.amazonaws.services.p061s3.model.inventory.InventoryFilter;
import com.amazonaws.services.p061s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.p061s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.p061s3.model.inventory.InventorySchedule;
import com.amazonaws.services.p061s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.p061s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.p061s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.p061s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.p061s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.p061s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.p061s3.model.metrics.MetricsFilter;
import com.amazonaws.services.p061s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.p061s3.model.metrics.MetricsTagPredicate;
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
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;
import p067l.AbstractC18164;
import p067l.C5136;

/* JADX INFO: loaded from: classes.dex */
public class XmlResponsesSaxParser {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f1849 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static final Log f1850 = LogFactory.m1468(XmlResponsesSaxParser.class);

    /* JADX INFO: renamed from: ֫ */
    public XMLReader f1851;

    public XmlResponsesSaxParser() {
        this.f1851 = null;
        try {
            this.f1851 = XMLReaderFactory.createXMLReader();
        } catch (SAXException e) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f1851 = XMLReaderFactory.createXMLReader();
            } catch (SAXException unused) {
                throw new AmazonClientException("Couldn't initialize a sax driver for the XMLReader", e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1878(DefaultHandler defaultHandler, InputStream inputStream) throws IOException {
        XMLReader xMLReader = this.f1851;
        Log log = f1850;
        try {
            if (log.mo1459()) {
                log.mo1460("Parsing XML response document with handler: " + defaultHandler.getClass());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C0233a.f1077D));
            xMLReader.setContentHandler(defaultHandler);
            xMLReader.setErrorHandler(defaultHandler);
            xMLReader.parse(new InputSource(bufferedReader));
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (log.mo1462()) {
                    log.mo1461("Unable to close response InputStream up after XML parse failure", e2);
                }
            }
            throw new AmazonClientException("Failed to parse XML document with handler " + defaultHandler.getClass(), th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1873(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1875(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            f1850.mo1461("Unable to parse integer value '" + str + "'", e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m1876(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            f1850.mo1461("Unable to parse long value '" + str + "'", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1874(String str, boolean z) {
        if (!z) {
            return str;
        }
        int i = S3HttpUtils.f1660;
        if (str == null) {
            return null;
        }
        try {
            return C5136.decode(str, C0233a.f1077D);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ListBucketHandler m1877(InputStream inputStream, boolean z) throws IOException {
        ListBucketHandler listBucketHandler = new ListBucketHandler(z);
        Log log = f1850;
        if (log.mo1459()) {
            log.mo1460("Sanitizing XML document destined for handler " + ListBucketHandler.class);
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C0233a.f1077D));
            char[] cArr = new char[8192];
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i != -1) {
                    sb.append(cArr, 0, i);
                } else {
                    bufferedReader.close();
                    m1878(listBucketHandler, new ByteArrayInputStream(sb.toString().replaceAll("\r", "&#013;").getBytes(StringUtils.f2004)));
                    return listBucketHandler;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (log.mo1462()) {
                    log.mo1461("Unable to close response InputStream after failure sanitizing XML document", e2);
                }
            }
            throw new AmazonClientException("Failed to sanitize XML document destined for handler " + ListBucketHandler.class, th);
        }
    }

    public class ListBucketHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۬ */
        public final boolean f1929;

        /* JADX INFO: renamed from: ۗ */
        public final ObjectListing f1927 = new ObjectListing();

        /* JADX INFO: renamed from: ᩶ */
        public S3ObjectSummary f1930 = null;

        /* JADX INFO: renamed from: ۙ */
        public Owner f1928 = null;

        public ListBucketHandler(boolean z) {
            this.f1929 = z;
        }

        /* JADX INFO: renamed from: ܽ */
        public final ObjectListing m1893() {
            return this.f1927;
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListBucketResult")) {
                if (str.equals("Contents")) {
                    S3ObjectSummary s3ObjectSummary = new S3ObjectSummary();
                    this.f1930 = s3ObjectSummary;
                    s3ObjectSummary.m1827(this.f1927.m1772());
                    return;
                }
                return;
            }
            if (m1863("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f1928 = new Owner();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            boolean zM1862 = m1862();
            String strM1824 = null;
            ObjectListing objectListing = this.f1927;
            if (zM1862) {
                if (str.equals("ListBucketResult") && objectListing.m1778() && objectListing.m1777() == null) {
                    if (!objectListing.m1779().isEmpty()) {
                        strM1824 = ((S3ObjectSummary) objectListing.m1779().get(objectListing.m1779().size() - 1)).m1824();
                    } else if (objectListing.m1775().isEmpty()) {
                        XmlResponsesSaxParser.f1850.mo1457("S3 response indicates truncated results, but contains no object summaries or common prefixes.");
                    } else {
                        strM1824 = (String) objectListing.m1775().get(objectListing.m1775().size() - 1);
                    }
                    objectListing.m1776(strM1824);
                    return;
                }
                return;
            }
            boolean zM1863 = m1863("ListBucketResult");
            boolean z = this.f1929;
            if (zM1863) {
                if (str.equals("Name")) {
                    objectListing.m1773(m1864());
                    if (XmlResponsesSaxParser.f1850.mo1459()) {
                        XmlResponsesSaxParser.f1850.mo1460("Examining listing for bucket: " + objectListing.m1772());
                        return;
                    }
                    return;
                }
                if (str.equals("Prefix")) {
                    XmlResponsesSaxParser.m1874(XmlResponsesSaxParser.m1873(m1864()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("Marker")) {
                    XmlResponsesSaxParser.m1874(XmlResponsesSaxParser.m1873(m1864()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("NextMarker")) {
                    objectListing.m1776(XmlResponsesSaxParser.m1874(m1864(), z));
                    return;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.m1875(m1864());
                    objectListing.getClass();
                    return;
                }
                if (str.equals("Delimiter")) {
                    XmlResponsesSaxParser.m1874(XmlResponsesSaxParser.m1873(m1864()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m1864();
                    int i = XmlResponsesSaxParser.f1849;
                    objectListing.getClass();
                    return;
                } else {
                    if (str.equals("IsTruncated")) {
                        String strM1954 = StringUtils.m1954(m1864());
                        if (strM1954.startsWith("false")) {
                            objectListing.m1774(false);
                            return;
                        } else {
                            if (strM1954.startsWith("true")) {
                                objectListing.m1774(true);
                                return;
                            }
                            throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strM1954));
                        }
                    }
                    if (str.equals("Contents")) {
                        objectListing.m1779().add(this.f1930);
                        this.f1930 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketResult", "Contents")) {
                if (str.equals("Key")) {
                    this.f1930.m1832(XmlResponsesSaxParser.m1874(m1864(), z));
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary = this.f1930;
                    String strM1864 = m1864();
                    int i2 = ServiceUtils.f1672;
                    s3ObjectSummary.m1828(DateUtils.m1937(strM1864));
                    return;
                }
                if (str.equals("ETag")) {
                    this.f1930.m1830(ServiceUtils.m1652(m1864()));
                    return;
                }
                if (str.equals("Size")) {
                    this.f1930.m1825(XmlResponsesSaxParser.m1876(m1864()));
                    return;
                }
                if (str.equals("StorageClass")) {
                    this.f1930.m1833(m1864());
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f1930.m1826(this.f1928);
                        this.f1928 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketResult", "Contents", "Owner")) {
                if (str.equals("ID")) {
                    this.f1928.m1807(m1864());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f1928.m1806(m1864());
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                objectListing.m1775().add(XmlResponsesSaxParser.m1874(m1864(), z));
            }
        }
    }

    public class ListObjectsV2Handler extends AbstractHandler {

        /* JADX INFO: renamed from: ۙ */
        public Owner f1945;

        /* JADX INFO: renamed from: ᩶ */
        public S3ObjectSummary f1946;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f1946 = new S3ObjectSummary();
                    throw null;
                }
            } else if (m1863("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f1945 = new Owner();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1862()) {
                if (str.equals("ListBucketResult")) {
                    throw null;
                }
                return;
            }
            if (m1863("ListBucketResult")) {
                if (str.equals("Name")) {
                    m1864();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    m1864();
                    int i = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.m1875(m1864());
                    throw null;
                }
                if (str.equals("NextContinuationToken")) {
                    m1864();
                    throw null;
                }
                if (str.equals("ContinuationToken")) {
                    m1864();
                    throw null;
                }
                if (str.equals("StartAfter")) {
                    m1864();
                    int i2 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("KeyCount")) {
                    XmlResponsesSaxParser.m1875(m1864());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    m1864();
                    int i3 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    m1864();
                    int i4 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    String strM1954 = StringUtils.m1954(m1864());
                    if (strM1954.startsWith("false") || strM1954.startsWith("true")) {
                        throw null;
                    }
                    throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strM1954));
                }
                if (str.equals("Contents")) {
                    throw null;
                }
                return;
            }
            if (m1863("ListBucketResult", "Contents")) {
                if (str.equals("Key")) {
                    String strM1864 = m1864();
                    S3ObjectSummary s3ObjectSummary = this.f1946;
                    int i5 = XmlResponsesSaxParser.f1849;
                    s3ObjectSummary.m1832(strM1864);
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary2 = this.f1946;
                    String strM1865 = m1864();
                    int i6 = ServiceUtils.f1672;
                    s3ObjectSummary2.m1828(DateUtils.m1937(strM1865));
                    return;
                }
                if (str.equals("ETag")) {
                    this.f1946.m1830(ServiceUtils.m1652(m1864()));
                    return;
                }
                if (str.equals("Size")) {
                    this.f1946.m1825(XmlResponsesSaxParser.m1876(m1864()));
                    return;
                }
                if (str.equals("StorageClass")) {
                    this.f1946.m1833(m1864());
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f1946.m1826(this.f1945);
                        this.f1945 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketResult", "Contents", "Owner")) {
                if (str.equals("ID")) {
                    this.f1945.m1807(m1864());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f1945.m1806(m1864());
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                throw null;
            }
        }
    }

    public class ListAllMyBucketsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public final ArrayList f1918 = new ArrayList();

        /* JADX INFO: renamed from: ۙ */
        public Owner f1917 = null;

        /* JADX INFO: renamed from: ۗ */
        public Bucket f1916 = null;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListAllMyBucketsResult")) {
                if (str.equals("Owner")) {
                    this.f1917 = new Owner();
                }
            } else if (m1863("ListAllMyBucketsResult", "Buckets") && str.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f1916 = bucket;
                bucket.m1692(this.f1917);
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("ListAllMyBucketsResult", "Owner")) {
                if (str.equals("ID")) {
                    this.f1917.m1807(m1864());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f1917.m1806(m1864());
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListAllMyBucketsResult", "Buckets")) {
                if (str.equals("Bucket")) {
                    this.f1918.add(this.f1916);
                    this.f1916 = null;
                    return;
                }
                return;
            }
            if (m1863("ListAllMyBucketsResult", "Buckets", "Bucket")) {
                if (str.equals("Name")) {
                    this.f1916.m1693(m1864());
                } else if (str.equals("CreationDate")) {
                    this.f1916.m1694(DateUtils.m1937(m1864()));
                }
            }
        }
    }

    public class AccessControlListHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public final AccessControlList f1854 = new AccessControlList();

        /* JADX INFO: renamed from: ۙ */
        public Grantee f1853 = null;

        /* JADX INFO: renamed from: ۗ */
        public Permission f1852 = null;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            String value;
            if (m1863("AccessControlPolicy")) {
                if (str.equals("Owner")) {
                    this.f1854.m1687(new Owner());
                    return;
                }
                return;
            }
            if (m1863("AccessControlPolicy", "AccessControlList", "Grant") && str.equals("Grantee")) {
                int i = XmlResponsesSaxParser.f1849;
                Charset charset = StringUtils.f2004;
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
                    this.f1853 = new EmailAddressGrantee();
                } else if ("CanonicalUser".equals(value)) {
                    this.f1853 = new CanonicalGrantee();
                } else {
                    "Group".equals(value);
                }
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            boolean zM1863 = m1863("AccessControlPolicy", "Owner");
            AccessControlList accessControlList = this.f1854;
            if (zM1863) {
                if (str.equals("ID")) {
                    accessControlList.m1688().m1807(m1864());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        accessControlList.m1688().m1806(m1864());
                        return;
                    }
                    return;
                }
            }
            if (m1863("AccessControlPolicy", "AccessControlList")) {
                if (str.equals("Grant")) {
                    Grantee grantee = this.f1853;
                    Permission permission = this.f1852;
                    ((LinkedList) accessControlList.m1686()).add(new Grant(grantee, permission));
                    this.f1853 = null;
                    this.f1852 = null;
                    return;
                }
                return;
            }
            if (m1863("AccessControlPolicy", "AccessControlList", "Grant")) {
                if (str.equals("Permission")) {
                    this.f1852 = Permission.m1811(m1864());
                    return;
                }
                return;
            }
            if (m1863("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                if (str.equals("ID")) {
                    this.f1853.mo1705(m1864());
                    return;
                }
                if (str.equals("EmailAddress")) {
                    this.f1853.mo1705(m1864());
                    return;
                }
                if (str.equals("URI")) {
                    this.f1853 = GroupGrantee.m1741(m1864());
                } else if (str.equals("DisplayName")) {
                    CanonicalGrantee canonicalGrantee = (CanonicalGrantee) this.f1853;
                    m1864();
                    canonicalGrantee.getClass();
                }
            }
        }
    }

    public class BucketLoggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public final BucketLoggingConfiguration f1869 = new BucketLoggingConfiguration();

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("BucketLoggingStatus", "LoggingEnabled")) {
                boolean zEquals = str.equals("TargetBucket");
                BucketLoggingConfiguration bucketLoggingConfiguration = this.f1869;
                if (zEquals) {
                    bucketLoggingConfiguration.m1699(m1864());
                } else if (str.equals("TargetPrefix")) {
                    bucketLoggingConfiguration.m1700(m1864());
                }
            }
        }
    }

    public class BucketLocationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1862() && str.equals("LocationConstraint")) {
                m1864().getClass();
            }
        }
    }

    public class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* JADX INFO: renamed from: ۫ */
        public final CopyObjectResult f1890 = new CopyObjectResult();

        /* JADX INFO: renamed from: ᩶ */
        public String f1892 = null;

        /* JADX INFO: renamed from: ۗ */
        public String f1888 = null;

        /* JADX INFO: renamed from: ۬ */
        public String f1891 = null;

        /* JADX INFO: renamed from: ۙ */
        public String f1889 = null;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractSSEHandler
        /* JADX INFO: renamed from: ܳ */
        public final ServerSideEncryptionResult mo1866() {
            return this.f1890;
        }

        /* JADX INFO: renamed from: ۘ */
        public final Date m1882() {
            return this.f1890.m1723();
        }

        /* JADX INFO: renamed from: ᩴ */
        public final String m1887() {
            return this.f1890.m1716();
        }

        @Override // com.amazonaws.services.p061s3.internal.S3VersionResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo1644(String str) {
            this.f1890.mo1644(str);
        }

        /* JADX INFO: renamed from: ܺ */
        public final Date m1886() {
            return this.f1890.m1720();
        }

        @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo1634(Date date) {
            this.f1890.mo1634(date);
        }

        /* JADX INFO: renamed from: ۖ */
        public final String m1881() {
            return this.f1890.m1718();
        }

        @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ܽ */
        public final void mo1635(String str) {
            this.f1890.mo1635(str);
        }

        /* JADX INFO: renamed from: ᩻ */
        public final String m1890() {
            return this.f1890.m1721();
        }

        /* JADX INFO: renamed from: ۜ */
        public final String m1883() {
            return this.f1892;
        }

        /* JADX INFO: renamed from: ᩷ */
        public final String m1889() {
            return this.f1889;
        }

        /* JADX INFO: renamed from: ۢ */
        public final String m1885() {
            return this.f1888;
        }

        /* JADX INFO: renamed from: ۡ */
        public final String m1884() {
            return this.f1891;
        }

        /* JADX INFO: renamed from: ᩵ */
        public final boolean m1888() {
            return this.f1890.m1722();
        }

        @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo1631(boolean z) {
            this.f1890.mo1631(z);
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (!m1862() || str.equals("CopyObjectResult") || str.equals("CopyPartResult")) {
                return;
            }
            str.equals("Error");
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("CopyObjectResult") || m1863("CopyPartResult")) {
                boolean zEquals = str.equals("LastModified");
                CopyObjectResult copyObjectResult = this.f1890;
                if (zEquals) {
                    String strM1864 = m1864();
                    int i = ServiceUtils.f1672;
                    copyObjectResult.m1717(DateUtils.m1937(strM1864));
                    return;
                } else {
                    if (str.equals("ETag")) {
                        copyObjectResult.m1719(ServiceUtils.m1652(m1864()));
                        return;
                    }
                    return;
                }
            }
            if (m1863("Error")) {
                if (str.equals("Code")) {
                    this.f1892 = m1864();
                    return;
                }
                if (str.equals("Message")) {
                    this.f1888 = m1864();
                } else if (str.equals("RequestId")) {
                    this.f1891 = m1864();
                } else if (str.equals("HostId")) {
                    this.f1889 = m1864();
                }
            }
        }
    }

    public class RequestPaymentConfigurationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("RequestPaymentConfiguration") && str.equals("Payer")) {
                m1864();
            }
        }
    }

    public class ListVersionsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public Owner f1950;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListVersionsResult")) {
                if (str.equals(AbstractC0213e.f983g)) {
                    new S3VersionSummary();
                    throw null;
                }
                if (str.equals("DeleteMarker")) {
                    new S3VersionSummary();
                    throw null;
                }
                return;
            }
            if ((m1863("ListVersionsResult", AbstractC0213e.f983g) || m1863("ListVersionsResult", "DeleteMarker")) && str.equals("Owner")) {
                this.f1950 = new Owner();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("ListVersionsResult")) {
                if (str.equals("Name")) {
                    m1864();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    m1864();
                    int i = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("KeyMarker")) {
                    m1864();
                    int i2 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("VersionIdMarker")) {
                    m1864();
                    int i3 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    Integer.parseInt(m1864());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    m1864();
                    int i4 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    m1864();
                    int i5 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("NextKeyMarker")) {
                    m1864();
                    int i6 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                if (str.equals("NextVersionIdMarker")) {
                    m1864();
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m1864());
                    throw null;
                }
                if (str.equals(AbstractC0213e.f983g) || str.equals("DeleteMarker")) {
                    throw null;
                }
                return;
            }
            if (m1863("ListVersionsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    m1864();
                    int i7 = XmlResponsesSaxParser.f1849;
                    throw null;
                }
                return;
            }
            if (m1863("ListVersionsResult", AbstractC0213e.f983g) || m1863("ListVersionsResult", "DeleteMarker")) {
                if (str.equals("Key")) {
                    m1864();
                    int i8 = XmlResponsesSaxParser.f1849;
                    return;
                }
                if (str.equals("VersionId")) {
                    m1864();
                    return;
                }
                if (str.equals("IsLatest")) {
                    "true".equals(m1864());
                    return;
                }
                if (str.equals("LastModified")) {
                    String strM1864 = m1864();
                    int i9 = ServiceUtils.f1672;
                    DateUtils.m1937(strM1864);
                    return;
                } else {
                    if (str.equals("ETag")) {
                        ServiceUtils.m1652(m1864());
                        return;
                    }
                    if (str.equals("Size")) {
                        Long.parseLong(m1864());
                        return;
                    } else if (str.equals("Owner")) {
                        this.f1950 = null;
                        return;
                    } else {
                        if (str.equals("StorageClass")) {
                            m1864();
                            return;
                        }
                        return;
                    }
                }
            }
            if (m1863("ListVersionsResult", AbstractC0213e.f983g, "Owner") || m1863("ListVersionsResult", "DeleteMarker", "Owner")) {
                if (str.equals("ID")) {
                    this.f1950.m1807(m1864());
                } else if (str.equals("DisplayName")) {
                    this.f1950.m1806(m1864());
                }
            }
        }
    }

    public class BucketWebsiteConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public final BucketWebsiteConfiguration f1882 = new BucketWebsiteConfiguration();

        /* JADX INFO: renamed from: ۙ */
        public RoutingRuleCondition f1880 = null;

        /* JADX INFO: renamed from: ۗ */
        public RedirectRule f1879 = null;

        /* JADX INFO: renamed from: ۬ */
        public RoutingRule f1881 = null;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f1879 = new RedirectRule();
                }
            } else if (m1863("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f1881 = new RoutingRule();
                }
            } else if (m1863("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f1880 = new RoutingRuleCondition();
                } else if (str.equals("Redirect")) {
                    this.f1879 = new RedirectRule();
                }
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            boolean zM1863 = m1863("WebsiteConfiguration");
            BucketWebsiteConfiguration bucketWebsiteConfiguration = this.f1882;
            if (zM1863) {
                if (str.equals("RedirectAllRequestsTo")) {
                    bucketWebsiteConfiguration.getClass();
                    this.f1879 = null;
                    return;
                }
                return;
            }
            if (m1863("WebsiteConfiguration", "IndexDocument")) {
                if (str.equals("Suffix")) {
                    m1864();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m1863("WebsiteConfiguration", "ErrorDocument")) {
                if (str.equals("Key")) {
                    m1864();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m1863("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    bucketWebsiteConfiguration.m1703().add(this.f1881);
                    this.f1881 = null;
                    return;
                }
                return;
            }
            if (m1863("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f1881.getClass();
                    this.f1880 = null;
                    return;
                } else {
                    if (str.equals("Redirect")) {
                        this.f1881.getClass();
                        this.f1879 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str.equals("KeyPrefixEquals")) {
                    RoutingRuleCondition routingRuleCondition = this.f1880;
                    m1864();
                    routingRuleCondition.getClass();
                    return;
                } else {
                    if (str.equals("HttpErrorCodeReturnedEquals")) {
                        RoutingRuleCondition routingRuleCondition2 = this.f1880;
                        m1864();
                        routingRuleCondition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("WebsiteConfiguration", "RedirectAllRequestsTo") || m1863("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                if (str.equals("Protocol")) {
                    RedirectRule redirectRule = this.f1879;
                    m1864();
                    redirectRule.getClass();
                    return;
                }
                if (str.equals("HostName")) {
                    RedirectRule redirectRule2 = this.f1879;
                    m1864();
                    redirectRule2.getClass();
                    return;
                }
                if (str.equals("ReplaceKeyPrefixWith")) {
                    RedirectRule redirectRule3 = this.f1879;
                    m1864();
                    redirectRule3.getClass();
                } else if (str.equals("ReplaceKeyWith")) {
                    RedirectRule redirectRule4 = this.f1879;
                    m1864();
                    redirectRule4.getClass();
                } else if (str.equals("HttpRedirectCode")) {
                    RedirectRule redirectRule5 = this.f1879;
                    m1864();
                    redirectRule5.getClass();
                }
            }
        }
    }

    public class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public final BucketVersioningConfiguration f1878 = new BucketVersioningConfiguration();

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("VersioningConfiguration")) {
                boolean zEquals = str.equals("Status");
                BucketVersioningConfiguration bucketVersioningConfiguration = this.f1878;
                if (zEquals) {
                    m1864();
                    bucketVersioningConfiguration.getClass();
                } else if (str.equals("MfaDelete")) {
                    String strM1864 = m1864();
                    if (strM1864.equals("Disabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else if (strM1864.equals("Enabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else {
                        bucketVersioningConfiguration.getClass();
                    }
                }
            }
        }
    }

    public class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public final BucketAccelerateConfiguration f1855 = new BucketAccelerateConfiguration();

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("AccelerateConfiguration") && str.equals("Status")) {
                m1864();
                this.f1855.getClass();
            }
        }
    }

    public class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* JADX INFO: renamed from: ۗ */
        public String f1883;

        /* JADX INFO: renamed from: ۙ */
        public String f1884;

        /* JADX INFO: renamed from: ۫ */
        public CompleteMultipartUploadResult f1885;

        /* JADX INFO: renamed from: ۬ */
        public String f1886;

        /* JADX INFO: renamed from: ᩶ */
        public AmazonS3Exception f1887;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractSSEHandler
        /* JADX INFO: renamed from: ܳ */
        public final ServerSideEncryptionResult mo1866() {
            return this.f1885;
        }

        @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo1634(Date date) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f1885;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ܽ */
        public final void mo1635(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f1885;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.p061s3.internal.S3VersionResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo1644(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f1885;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
        /* JADX INFO: renamed from: ֫ */
        public final void mo1631(boolean z) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f1885;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        /* JADX INFO: renamed from: ۜ */
        public final CompleteMultipartUploadResult m1879() {
            return this.f1885;
        }

        /* JADX INFO: renamed from: ᩻ */
        public final AmazonS3Exception m1880() {
            return this.f1887;
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1862() && str.equals("CompleteMultipartUploadResult")) {
                this.f1885 = new CompleteMultipartUploadResult();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            AmazonS3Exception amazonS3Exception;
            if (m1862()) {
                if (!str.equals("Error") || (amazonS3Exception = this.f1887) == null) {
                    return;
                }
                amazonS3Exception.m1311(this.f1884);
                this.f1887.m1315(this.f1886);
                this.f1887.m1691(this.f1883);
                return;
            }
            if (m1863("CompleteMultipartUploadResult")) {
                if (str.equals("Location")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult = this.f1885;
                    m1864();
                    completeMultipartUploadResult.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult2 = this.f1885;
                    m1864();
                    completeMultipartUploadResult2.getClass();
                    return;
                } else if (str.equals("Key")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult3 = this.f1885;
                    m1864();
                    completeMultipartUploadResult3.getClass();
                    return;
                } else {
                    if (str.equals("ETag")) {
                        CompleteMultipartUploadResult completeMultipartUploadResult4 = this.f1885;
                        ServiceUtils.m1652(m1864());
                        completeMultipartUploadResult4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("Error")) {
                if (str.equals("Code")) {
                    this.f1884 = m1864();
                    return;
                }
                if (str.equals("Message")) {
                    this.f1887 = new AmazonS3Exception(m1864());
                } else if (str.equals("RequestId")) {
                    this.f1886 = m1864();
                } else if (str.equals("HostId")) {
                    this.f1883 = m1864();
                }
            }
        }
    }

    public class InitiateMultipartUploadHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩶ */
        public final InitiateMultipartUploadResult f1915 = new InitiateMultipartUploadResult();

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
        }

        /* JADX INFO: renamed from: ܽ */
        public final InitiateMultipartUploadResult m1892() {
            return this.f1915;
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("InitiateMultipartUploadResult")) {
                boolean zEquals = str.equals("Bucket");
                InitiateMultipartUploadResult initiateMultipartUploadResult = this.f1915;
                if (zEquals) {
                    m1864();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("Key")) {
                    m1864();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("UploadId")) {
                    initiateMultipartUploadResult.m1754(m1864());
                }
            }
        }
    }

    public class ListMultipartUploadsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public final MultipartUploadListing f1942 = new MultipartUploadListing();

        /* JADX INFO: renamed from: ۙ */
        public Owner f1943;

        /* JADX INFO: renamed from: ᩶ */
        public MultipartUpload f1944;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListMultipartUploadsResult")) {
                if (str.equals("Upload")) {
                    this.f1944 = new MultipartUpload();
                }
            } else if (m1863("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f1943 = new Owner();
                }
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            boolean zM1863 = m1863("ListMultipartUploadsResult");
            MultipartUploadListing multipartUploadListing = this.f1942;
            if (zM1863) {
                if (str.equals("Bucket")) {
                    m1864();
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("KeyMarker")) {
                    m1864();
                    int i = XmlResponsesSaxParser.f1849;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("Delimiter")) {
                    m1864();
                    int i2 = XmlResponsesSaxParser.f1849;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    m1864();
                    int i3 = XmlResponsesSaxParser.f1849;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("UploadIdMarker")) {
                    m1864();
                    int i4 = XmlResponsesSaxParser.f1849;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("NextKeyMarker")) {
                    m1864();
                    int i5 = XmlResponsesSaxParser.f1849;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("NextUploadIdMarker")) {
                    m1864();
                    int i6 = XmlResponsesSaxParser.f1849;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("MaxUploads")) {
                    Integer.parseInt(m1864());
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m1864();
                    int i7 = XmlResponsesSaxParser.f1849;
                    multipartUploadListing.getClass();
                    return;
                } else if (str.equals("IsTruncated")) {
                    Boolean.parseBoolean(m1864());
                    multipartUploadListing.getClass();
                    return;
                } else {
                    if (str.equals("Upload")) {
                        ((ArrayList) multipartUploadListing.m1771()).add(this.f1944);
                        this.f1944 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListMultipartUploadsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    multipartUploadListing.m1770().add(m1864());
                    return;
                }
                return;
            }
            if (m1863("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Key")) {
                    MultipartUpload multipartUpload = this.f1944;
                    m1864();
                    multipartUpload.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    MultipartUpload multipartUpload2 = this.f1944;
                    m1864();
                    multipartUpload2.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    this.f1944.getClass();
                    this.f1943 = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    this.f1944.getClass();
                    this.f1943 = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    MultipartUpload multipartUpload3 = this.f1944;
                    m1864();
                    multipartUpload3.getClass();
                    return;
                } else {
                    if (str.equals("Initiated")) {
                        MultipartUpload multipartUpload4 = this.f1944;
                        String strM1864 = m1864();
                        int i8 = ServiceUtils.f1672;
                        DateUtils.m1937(strM1864);
                        multipartUpload4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListMultipartUploadsResult", "Upload", "Owner") || m1863("ListMultipartUploadsResult", "Upload", "Initiator")) {
                if (str.equals("ID")) {
                    this.f1943.m1807(XmlResponsesSaxParser.m1873(m1864()));
                } else if (str.equals("DisplayName")) {
                    this.f1943.m1806(XmlResponsesSaxParser.m1873(m1864()));
                }
            }
        }
    }

    public class ListPartsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public final PartListing f1947 = new PartListing();

        /* JADX INFO: renamed from: ۙ */
        public PartSummary f1948;

        /* JADX INFO: renamed from: ᩶ */
        public Owner f1949;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListPartsResult")) {
                if (str.equals("Part")) {
                    this.f1948 = new PartSummary();
                } else if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f1949 = new Owner();
                }
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("ListPartsResult")) {
                boolean zEquals = str.equals("Bucket");
                PartListing partListing = this.f1947;
                if (zEquals) {
                    m1864();
                    partListing.getClass();
                    return;
                }
                if (str.equals("Key")) {
                    m1864();
                    partListing.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    m1864();
                    partListing.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    partListing.getClass();
                    this.f1949 = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    partListing.getClass();
                    this.f1949 = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    m1864();
                    partListing.getClass();
                    return;
                }
                if (str.equals("PartNumberMarker")) {
                    m1864();
                    String strM1873 = XmlResponsesSaxParser.m1873(m1864());
                    (strM1873 != null ? Integer.valueOf(Integer.parseInt(strM1873)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("NextPartNumberMarker")) {
                    m1864();
                    String strM1874 = XmlResponsesSaxParser.m1873(m1864());
                    (strM1874 != null ? Integer.valueOf(Integer.parseInt(strM1874)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("MaxParts")) {
                    m1864();
                    String strM1875 = XmlResponsesSaxParser.m1873(m1864());
                    (strM1875 != null ? Integer.valueOf(Integer.parseInt(strM1875)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m1864();
                    int i = XmlResponsesSaxParser.f1849;
                    partListing.getClass();
                    return;
                } else if (str.equals("IsTruncated")) {
                    Boolean.parseBoolean(m1864());
                    partListing.getClass();
                    return;
                } else {
                    if (str.equals("Part")) {
                        ((ArrayList) partListing.m1810()).add(this.f1948);
                        this.f1948 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListPartsResult", "Part")) {
                if (str.equals("PartNumber")) {
                    PartSummary partSummary = this.f1948;
                    Integer.parseInt(m1864());
                    partSummary.getClass();
                    return;
                }
                if (str.equals("LastModified")) {
                    PartSummary partSummary2 = this.f1948;
                    String strM1864 = m1864();
                    int i2 = ServiceUtils.f1672;
                    DateUtils.m1937(strM1864);
                    partSummary2.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    PartSummary partSummary3 = this.f1948;
                    ServiceUtils.m1652(m1864());
                    partSummary3.getClass();
                    return;
                } else {
                    if (str.equals("Size")) {
                        PartSummary partSummary4 = this.f1948;
                        Long.parseLong(m1864());
                        partSummary4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListPartsResult", "Owner") || m1863("ListPartsResult", "Initiator")) {
                if (str.equals("ID")) {
                    this.f1949.m1807(XmlResponsesSaxParser.m1873(m1864()));
                } else if (str.equals("DisplayName")) {
                    this.f1949.m1806(XmlResponsesSaxParser.m1873(m1864()));
                }
            }
        }
    }

    public class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public String f1870;

        /* JADX INFO: renamed from: ۙ */
        public ReplicationRule f1871;

        /* JADX INFO: renamed from: ۬ */
        public ReplicationDestinationConfig f1872;

        /* JADX INFO: renamed from: ᩶ */
        public final BucketReplicationConfiguration f1873 = new BucketReplicationConfiguration();

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ReplicationConfiguration")) {
                if (str.equals("Rule")) {
                    this.f1871 = new ReplicationRule();
                }
            } else if (m1863("ReplicationConfiguration", "Rule") && str.equals("Destination")) {
                this.f1872 = new ReplicationDestinationConfig();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("ReplicationConfiguration")) {
                boolean zEquals = str.equals("Rule");
                BucketReplicationConfiguration bucketReplicationConfiguration = this.f1873;
                if (zEquals) {
                    bucketReplicationConfiguration.m1701(this.f1870, this.f1871);
                    this.f1871 = null;
                    this.f1870 = null;
                    this.f1872 = null;
                    return;
                }
                if (str.equals("Role")) {
                    m1864();
                    bucketReplicationConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m1863("ReplicationConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    this.f1870 = m1864();
                    return;
                }
                if (str.equals("Prefix")) {
                    ReplicationRule replicationRule = this.f1871;
                    String strM1864 = m1864();
                    replicationRule.getClass();
                    if (strM1864 == null) {
                        throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
                    }
                    return;
                }
                if (str.equals("Status")) {
                    ReplicationRule replicationRule2 = this.f1871;
                    m1864();
                    replicationRule2.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        ReplicationRule replicationRule3 = this.f1871;
                        ReplicationDestinationConfig replicationDestinationConfig = this.f1872;
                        replicationRule3.getClass();
                        if (replicationDestinationConfig == null) {
                            throw new IllegalArgumentException("Destination cannot be null in the replication rule");
                        }
                        return;
                    }
                    return;
                }
            }
            if (m1863("ReplicationConfiguration", "Rule", "Destination")) {
                if (str.equals("Bucket")) {
                    ReplicationDestinationConfig replicationDestinationConfig2 = this.f1872;
                    String strM1865 = m1864();
                    replicationDestinationConfig2.getClass();
                    if (strM1865 == null) {
                        throw new IllegalArgumentException("Bucket name cannot be null");
                    }
                    return;
                }
                if (str.equals("StorageClass")) {
                    ReplicationDestinationConfig replicationDestinationConfig3 = this.f1872;
                    m1864();
                    replicationDestinationConfig3.getClass();
                }
            }
        }
    }

    public class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public HashMap f1874;

        /* JADX INFO: renamed from: ۙ */
        public String f1875;

        /* JADX INFO: renamed from: ۬ */
        public String f1876;

        /* JADX INFO: renamed from: ᩶ */
        public final BucketTaggingConfiguration f1877 = new BucketTaggingConfiguration();

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("Tagging") && str.equals("TagSet")) {
                this.f1874 = new HashMap();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            String str2;
            if (m1863("Tagging")) {
                if (str.equals("TagSet")) {
                    this.f1877.m1702().add(new TagSet(this.f1874));
                    this.f1874 = null;
                    return;
                }
                return;
            }
            if (m1863("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    String str3 = this.f1875;
                    if (str3 != null && (str2 = this.f1876) != null) {
                        this.f1874.put(str3, str2);
                    }
                    this.f1875 = null;
                    this.f1876 = null;
                    return;
                }
                return;
            }
            if (m1863("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f1875 = m1864();
                } else if (str.equals("Value")) {
                    this.f1876 = m1864();
                }
            }
        }
    }

    public class GetObjectTaggingHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public ArrayList f1912;

        /* JADX INFO: renamed from: ۙ */
        public String f1913;

        /* JADX INFO: renamed from: ᩶ */
        public String f1914;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("Tagging") && str.equals("TagSet")) {
                this.f1912 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("Tagging") && str.equals("TagSet")) {
                this.f1912 = null;
            }
            if (m1863("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    this.f1912.add(new Tag(this.f1914, this.f1913));
                    this.f1914 = null;
                    this.f1913 = null;
                    return;
                }
                return;
            }
            if (m1863("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f1914 = m1864();
                } else if (str.equals("Value")) {
                    this.f1913 = m1864();
                }
            }
        }
    }

    public class DeleteObjectsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public final DeleteObjectsResponse f1893 = new DeleteObjectsResponse();

        /* JADX INFO: renamed from: ᩶ */
        public DeleteObjectsResult.DeletedObject f1895 = null;

        /* JADX INFO: renamed from: ۙ */
        public MultiObjectDeleteException.DeleteError f1894 = null;

        /* JADX INFO: renamed from: ܽ */
        public final DeleteObjectsResponse m1891() {
            return this.f1893;
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f1895 = new DeleteObjectsResult.DeletedObject();
                } else if (str.equals("Error")) {
                    this.f1894 = new MultiObjectDeleteException.DeleteError();
                }
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("DeleteResult")) {
                boolean zEquals = str.equals("Deleted");
                DeleteObjectsResponse deleteObjectsResponse = this.f1893;
                if (zEquals) {
                    ((ArrayList) deleteObjectsResponse.m1630()).add(this.f1895);
                    this.f1895 = null;
                    return;
                }
                if (str.equals("Error")) {
                    ((ArrayList) deleteObjectsResponse.m1632()).add(this.f1894);
                    this.f1894 = null;
                    return;
                }
                return;
            }
            if (m1863("DeleteResult", "Deleted")) {
                if (str.equals("Key")) {
                    DeleteObjectsResult.DeletedObject deletedObject = this.f1895;
                    m1864();
                    deletedObject.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    DeleteObjectsResult.DeletedObject deletedObject2 = this.f1895;
                    m1864();
                    deletedObject2.getClass();
                    return;
                } else if (str.equals("DeleteMarker")) {
                    DeleteObjectsResult.DeletedObject deletedObject3 = this.f1895;
                    m1864().equals("true");
                    deletedObject3.getClass();
                    return;
                } else {
                    if (str.equals("DeleteMarkerVersionId")) {
                        DeleteObjectsResult.DeletedObject deletedObject4 = this.f1895;
                        m1864();
                        deletedObject4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("DeleteResult", "Error")) {
                if (str.equals("Key")) {
                    this.f1894.m1769(m1864());
                    return;
                }
                if (str.equals("VersionId")) {
                    MultiObjectDeleteException.DeleteError deleteError = this.f1894;
                    m1864();
                    deleteError.getClass();
                } else if (str.equals("Code")) {
                    MultiObjectDeleteException.DeleteError deleteError2 = this.f1894;
                    m1864();
                    deleteError2.getClass();
                } else if (str.equals("Message")) {
                    MultiObjectDeleteException.DeleteError deleteError3 = this.f1894;
                    m1864();
                    deleteError3.getClass();
                }
            }
        }
    }

    public class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public final BucketLifecycleConfiguration f1862 = new BucketLifecycleConfiguration(new ArrayList());

        /* JADX INFO: renamed from: ۙ */
        public ArrayList f1863;

        /* JADX INFO: renamed from: ۛ */
        public BucketLifecycleConfiguration.Transition f1864;

        /* JADX INFO: renamed from: ۤ */
        public BucketLifecycleConfiguration.Rule f1865;

        /* JADX INFO: renamed from: ۫ */
        public BucketLifecycleConfiguration.NoncurrentVersionTransition f1866;

        /* JADX INFO: renamed from: ۬ */
        public LifecycleFilter f1867;

        /* JADX INFO: renamed from: ᩶ */
        public AbortIncompleteMultipartUpload f1868;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f1865 = new BucketLifecycleConfiguration.Rule();
                    return;
                }
                return;
            }
            if (m1863("LifecycleConfiguration", "Rule")) {
                if (str.equals(AbstractC18164.LOG_TAG)) {
                    this.f1864 = new BucketLifecycleConfiguration.Transition();
                    return;
                }
                if (str.equals("NoncurrentVersionTransition")) {
                    this.f1866 = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
                    return;
                } else if (str.equals("AbortIncompleteMultipartUpload")) {
                    this.f1868 = new AbortIncompleteMultipartUpload();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f1867 = new LifecycleFilter();
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", "Filter") && str.equals("And")) {
                this.f1863 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    ((ArrayList) this.f1862.m1696()).add(this.f1865);
                    this.f1865 = null;
                    return;
                }
                return;
            }
            if (m1863("LifecycleConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    BucketLifecycleConfiguration.Rule rule = this.f1865;
                    m1864();
                    rule.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    BucketLifecycleConfiguration.Rule rule2 = this.f1865;
                    m1864();
                    rule2.getClass();
                    return;
                }
                if (str.equals("Status")) {
                    BucketLifecycleConfiguration.Rule rule3 = this.f1865;
                    m1864();
                    rule3.getClass();
                    return;
                }
                if (str.equals(AbstractC18164.LOG_TAG)) {
                    this.f1865.m1698(this.f1864);
                    this.f1864 = null;
                    return;
                }
                if (str.equals("NoncurrentVersionTransition")) {
                    this.f1865.m1697(this.f1866);
                    this.f1866 = null;
                    return;
                } else if (str.equals("AbortIncompleteMultipartUpload")) {
                    this.f1865.getClass();
                    this.f1868 = null;
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f1865.getClass();
                        this.f1867 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str.equals("Date")) {
                    BucketLifecycleConfiguration.Rule rule4 = this.f1865;
                    String strM1864 = m1864();
                    int i = ServiceUtils.f1672;
                    DateUtils.m1937(strM1864);
                    rule4.getClass();
                    return;
                }
                if (str.equals("Days")) {
                    BucketLifecycleConfiguration.Rule rule5 = this.f1865;
                    Integer.parseInt(m1864());
                    rule5.getClass();
                    return;
                } else {
                    if (str.equals("ExpiredObjectDeleteMarker") && "true".equals(m1864())) {
                        this.f1865.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", AbstractC18164.LOG_TAG)) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.Transition transition = this.f1864;
                    m1864();
                    transition.getClass();
                    return;
                } else {
                    if (str.equals("Date")) {
                        BucketLifecycleConfiguration.Transition transition2 = this.f1864;
                        String strM1865 = m1864();
                        int i2 = ServiceUtils.f1672;
                        DateUtils.m1937(strM1865);
                        transition2.getClass();
                        return;
                    }
                    if (str.equals("Days")) {
                        BucketLifecycleConfiguration.Transition transition3 = this.f1864;
                        Integer.parseInt(m1864());
                        transition3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str.equals("NoncurrentDays")) {
                    BucketLifecycleConfiguration.Rule rule6 = this.f1865;
                    Integer.parseInt(m1864());
                    rule6.getClass();
                    return;
                }
                return;
            }
            if (m1863("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = this.f1866;
                    m1864();
                    noncurrentVersionTransition.getClass();
                    return;
                } else {
                    if (str.equals("NoncurrentDays")) {
                        BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition2 = this.f1866;
                        Integer.parseInt(m1864());
                        noncurrentVersionTransition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (str.equals("DaysAfterInitiation")) {
                    this.f1868.m1659(Integer.parseInt(m1864()));
                    return;
                }
                return;
            }
            if (m1863("LifecycleConfiguration", "Rule", "Filter")) {
                if (str.equals("Prefix")) {
                    LifecycleFilter lifecycleFilter = this.f1867;
                    m1864();
                    new LifecyclePrefixPredicate();
                    lifecycleFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    LifecycleFilter lifecycleFilter2 = this.f1867;
                    new LifecycleTagPredicate();
                    lifecycleFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        LifecycleFilter lifecycleFilter3 = this.f1867;
                        new LifecycleAndOperator(this.f1863);
                        lifecycleFilter3.getClass();
                        this.f1863 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m1864();
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f1863;
                    m1864();
                    arrayList.add(new LifecyclePrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f1863.add(new LifecycleTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m1863("LifecycleConfiguration", "Rule", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                } else if (str.equals("Value")) {
                    m1864();
                }
            }
        }
    }

    public class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۫ */
        public CORSRule f1859;

        /* JADX INFO: renamed from: ۬ */
        public final BucketCrossOriginConfiguration f1860 = new BucketCrossOriginConfiguration(new ArrayList());

        /* JADX INFO: renamed from: ۙ */
        public ArrayList f1857 = null;

        /* JADX INFO: renamed from: ۗ */
        public ArrayList f1856 = null;

        /* JADX INFO: renamed from: ۤ */
        public ArrayList f1858 = null;

        /* JADX INFO: renamed from: ᩶ */
        public LinkedList f1861 = null;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f1859 = new CORSRule();
                    return;
                }
                return;
            }
            if (m1863("CORSConfiguration", "CORSRule")) {
                if (str.equals("AllowedOrigin")) {
                    if (this.f1856 == null) {
                        this.f1856 = new ArrayList();
                    }
                } else if (str.equals("AllowedMethod")) {
                    if (this.f1857 == null) {
                        this.f1857 = new ArrayList();
                    }
                } else if (str.equals("ExposeHeader")) {
                    if (this.f1858 == null) {
                        this.f1858 = new ArrayList();
                    }
                } else if (str.equals("AllowedHeader") && this.f1861 == null) {
                    this.f1861 = new LinkedList();
                }
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f1859.getClass();
                    this.f1859.getClass();
                    this.f1859.getClass();
                    this.f1859.getClass();
                    this.f1861 = null;
                    this.f1857 = null;
                    this.f1856 = null;
                    this.f1858 = null;
                    ((ArrayList) this.f1860.m1695()).add(this.f1859);
                    this.f1859 = null;
                    return;
                }
                return;
            }
            if (m1863("CORSConfiguration", "CORSRule")) {
                if (str.equals("ID")) {
                    CORSRule cORSRule = this.f1859;
                    m1864();
                    cORSRule.getClass();
                    return;
                }
                if (str.equals("AllowedOrigin")) {
                    this.f1856.add(m1864());
                    return;
                }
                if (str.equals("AllowedMethod")) {
                    this.f1857.add(CORSRule.AllowedMethods.m1704(m1864()));
                    return;
                }
                if (str.equals("MaxAgeSeconds")) {
                    CORSRule cORSRule2 = this.f1859;
                    Integer.parseInt(m1864());
                    cORSRule2.getClass();
                } else if (str.equals("ExposeHeader")) {
                    this.f1858.add(m1864());
                } else if (str.equals("AllowedHeader")) {
                    this.f1861.add(m1864());
                }
            }
        }
    }

    public class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public MetricsFilter f1909;

        /* JADX INFO: renamed from: ۙ */
        public final MetricsConfiguration f1910 = new MetricsConfiguration();

        /* JADX INFO: renamed from: ᩶ */
        public ArrayList f1911;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f1909 = new MetricsFilter();
                }
            } else if (m1863("MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f1911 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("MetricsConfiguration")) {
                boolean zEquals = str.equals("Id");
                MetricsConfiguration metricsConfiguration = this.f1910;
                if (zEquals) {
                    m1864();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        metricsConfiguration.getClass();
                        this.f1909 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f1909;
                    m1864();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f1909;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f1909;
                        new MetricsAndOperator(this.f1911);
                        metricsFilter3.getClass();
                        this.f1911 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m1864();
                        return;
                    }
                    return;
                }
            }
            if (m1863("MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f1911;
                    m1864();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f1911.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m1863("MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                } else if (str.equals("Value")) {
                    m1864();
                }
            }
        }
    }

    public class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public MetricsFilter f1938;

        /* JADX INFO: renamed from: ۙ */
        public MetricsConfiguration f1939;

        /* JADX INFO: renamed from: ۬ */
        public final ListBucketMetricsConfigurationsResult f1940 = new ListBucketMetricsConfigurationsResult();

        /* JADX INFO: renamed from: ᩶ */
        public ArrayList f1941;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListMetricsConfigurationsResult")) {
                if (str.equals("MetricsConfiguration")) {
                    this.f1939 = new MetricsConfiguration();
                }
            } else if (m1863("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f1938 = new MetricsFilter();
                }
            } else if (m1863("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f1941 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("ListMetricsConfigurationsResult")) {
                boolean zEquals = str.equals("MetricsConfiguration");
                ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult = this.f1940;
                if (zEquals) {
                    if (listBucketMetricsConfigurationsResult.m1760() == null) {
                        listBucketMetricsConfigurationsResult.m1761(new ArrayList());
                    }
                    ((ArrayList) listBucketMetricsConfigurationsResult.m1760()).add(this.f1939);
                    this.f1939 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m1864());
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m1864();
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m1864();
                        listBucketMetricsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Id")) {
                    MetricsConfiguration metricsConfiguration = this.f1939;
                    m1864();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f1939.getClass();
                        this.f1938 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f1938;
                    m1864();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f1938;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f1938;
                        new MetricsAndOperator(this.f1941);
                        metricsFilter3.getClass();
                        this.f1941 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m1864();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f1941;
                    m1864();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f1941.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                } else if (str.equals("Value")) {
                    m1864();
                }
            }
        }
    }

    public class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public StorageClassAnalysisDataExport f1896;

        /* JADX INFO: renamed from: ۙ */
        public final AnalyticsConfiguration f1897 = new AnalyticsConfiguration();

        /* JADX INFO: renamed from: ۛ */
        public StorageClassAnalysis f1898;

        /* JADX INFO: renamed from: ۤ */
        public AnalyticsS3BucketDestination f1899;

        /* JADX INFO: renamed from: ۫ */
        public AnalyticsFilter f1900;

        /* JADX INFO: renamed from: ۬ */
        public AnalyticsExportDestination f1901;

        /* JADX INFO: renamed from: ᩶ */
        public ArrayList f1902;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f1900 = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f1898 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (m1863("AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f1902 = new ArrayList();
                }
            } else if (m1863("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f1896 = new StorageClassAnalysisDataExport();
                }
            } else if (m1863("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f1901 = new AnalyticsExportDestination();
                }
            } else if (m1863("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f1899 = new AnalyticsS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("AnalyticsConfiguration")) {
                boolean zEquals = str.equals("Id");
                AnalyticsConfiguration analyticsConfiguration = this.f1897;
                if (zEquals) {
                    m1864();
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
            if (m1863("AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f1900;
                    m1864();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f1900;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f1900;
                        new AnalyticsAndOperator(this.f1902);
                        analyticsFilter3.getClass();
                        this.f1902 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m1864();
                        return;
                    }
                    return;
                }
            }
            if (m1863("AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f1902;
                    m1864();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f1902.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m1863("AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m1864();
                        return;
                    }
                    return;
                }
            }
            if (m1863("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f1898.getClass();
                    return;
                }
                return;
            }
            if (m1863("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f1896;
                    m1864();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f1896.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f1901.getClass();
                    return;
                }
                return;
            }
            if (m1863("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f1899;
                    m1864();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f1899;
                    m1864();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f1899;
                    m1864();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f1899;
                    m1864();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }
    }

    public class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public AnalyticsFilter f1919;

        /* JADX INFO: renamed from: ۙ */
        public AnalyticsConfiguration f1920;

        /* JADX INFO: renamed from: ۛ */
        public AnalyticsS3BucketDestination f1921;

        /* JADX INFO: renamed from: ۤ */
        public final ListBucketAnalyticsConfigurationsResult f1922 = new ListBucketAnalyticsConfigurationsResult();

        /* JADX INFO: renamed from: ۨ */
        public StorageClassAnalysis f1923;

        /* JADX INFO: renamed from: ۫ */
        public AnalyticsExportDestination f1924;

        /* JADX INFO: renamed from: ۬ */
        public StorageClassAnalysisDataExport f1925;

        /* JADX INFO: renamed from: ᩶ */
        public ArrayList f1926;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    this.f1920 = new AnalyticsConfiguration();
                    return;
                }
                return;
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f1919 = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f1923 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f1926 = new ArrayList();
                }
            } else if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f1925 = new StorageClassAnalysisDataExport();
                }
            } else if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f1924 = new AnalyticsExportDestination();
                }
            } else if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f1921 = new AnalyticsS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("ListBucketAnalyticsConfigurationsResult")) {
                boolean zEquals = str.equals("AnalyticsConfiguration");
                ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult = this.f1922;
                if (zEquals) {
                    if (listBucketAnalyticsConfigurationsResult.m1756() == null) {
                        listBucketAnalyticsConfigurationsResult.m1757(new ArrayList());
                    }
                    ((ArrayList) listBucketAnalyticsConfigurationsResult.m1756()).add(this.f1920);
                    this.f1920 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m1864());
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m1864();
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m1864();
                        listBucketAnalyticsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Id")) {
                    AnalyticsConfiguration analyticsConfiguration = this.f1920;
                    m1864();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    this.f1920.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f1920.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f1919;
                    m1864();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f1919;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f1919;
                        new AnalyticsAndOperator(this.f1926);
                        analyticsFilter3.getClass();
                        this.f1926 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m1864();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f1926;
                    m1864();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f1926.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m1864();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m1864();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f1923.getClass();
                    return;
                }
                return;
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f1925;
                    m1864();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f1925.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f1924.getClass();
                    return;
                }
                return;
            }
            if (m1863("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f1921;
                    m1864();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f1921;
                    m1864();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f1921;
                    m1864();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f1921;
                    m1864();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }
    }

    public class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public InventoryDestination f1903;

        /* JADX INFO: renamed from: ۙ */
        public InventoryFilter f1904;

        /* JADX INFO: renamed from: ۤ */
        public InventoryS3BucketDestination f1905;

        /* JADX INFO: renamed from: ۫ */
        public ArrayList f1906;

        /* JADX INFO: renamed from: ۬ */
        public InventorySchedule f1907;

        /* JADX INFO: renamed from: ᩶ */
        public final InventoryConfiguration f1908;

        public GetBucketInventoryConfigurationHandler() {
            new GetBucketInventoryConfigurationResult();
            this.f1908 = new InventoryConfiguration();
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("InventoryConfiguration")) {
                if (str.equals("Destination")) {
                    this.f1903 = new InventoryDestination();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f1904 = new InventoryFilter();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f1907 = new InventorySchedule();
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f1906 = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            if (m1863("InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                this.f1905 = new InventoryS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("InventoryConfiguration")) {
                boolean zEquals = str.equals("Id");
                InventoryConfiguration inventoryConfiguration = this.f1908;
                if (zEquals) {
                    m1864();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    inventoryConfiguration.getClass();
                    this.f1903 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    "true".equals(m1864());
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    inventoryConfiguration.getClass();
                    this.f1904 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    m1864();
                    inventoryConfiguration.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    inventoryConfiguration.getClass();
                    this.f1907 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        inventoryConfiguration.getClass();
                        this.f1906 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f1903.getClass();
                    this.f1905 = null;
                    return;
                }
                return;
            }
            if (m1863("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination = this.f1905;
                    m1864();
                    inventoryS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f1905;
                    m1864();
                    inventoryS3BucketDestination2.getClass();
                    return;
                } else if (str.equals("Format")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f1905;
                    m1864();
                    inventoryS3BucketDestination3.getClass();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f1905;
                        m1864();
                        inventoryS3BucketDestination4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    InventoryFilter inventoryFilter = this.f1904;
                    m1864();
                    new InventoryPrefixPredicate();
                    inventoryFilter.getClass();
                    return;
                }
                return;
            }
            if (m1863("InventoryConfiguration", "Schedule")) {
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f1907;
                    m1864();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (m1863("InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f1906.add(m1864());
            }
        }
    }

    public class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۗ */
        public InventoryFilter f1931;

        /* JADX INFO: renamed from: ۙ */
        public InventoryDestination f1932;

        /* JADX INFO: renamed from: ۛ */
        public final ListBucketInventoryConfigurationsResult f1933 = new ListBucketInventoryConfigurationsResult();

        /* JADX INFO: renamed from: ۤ */
        public InventorySchedule f1934;

        /* JADX INFO: renamed from: ۫ */
        public InventoryS3BucketDestination f1935;

        /* JADX INFO: renamed from: ۬ */
        public ArrayList f1936;

        /* JADX INFO: renamed from: ᩶ */
        public InventoryConfiguration f1937;

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ֫ */
        public final void mo1861(String str, Attributes attributes) {
            if (m1863("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    this.f1937 = new InventoryConfiguration();
                    return;
                }
                return;
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Destination")) {
                    this.f1932 = new InventoryDestination();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f1931 = new InventoryFilter();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f1934 = new InventorySchedule();
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f1936 = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                this.f1935 = new InventoryS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.p061s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo1865(String str) {
            if (m1863("ListInventoryConfigurationsResult")) {
                boolean zEquals = str.equals("InventoryConfiguration");
                ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult = this.f1933;
                if (zEquals) {
                    if (listBucketInventoryConfigurationsResult.m1758() == null) {
                        listBucketInventoryConfigurationsResult.m1759(new ArrayList());
                    }
                    ((ArrayList) listBucketInventoryConfigurationsResult.m1758()).add(this.f1937);
                    this.f1937 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m1864());
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m1864();
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m1864();
                        listBucketInventoryConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Id")) {
                    InventoryConfiguration inventoryConfiguration = this.f1937;
                    m1864();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f1937.getClass();
                    this.f1932 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    InventoryConfiguration inventoryConfiguration2 = this.f1937;
                    "true".equals(m1864());
                    inventoryConfiguration2.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f1937.getClass();
                    this.f1931 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    InventoryConfiguration inventoryConfiguration3 = this.f1937;
                    m1864();
                    inventoryConfiguration3.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f1937.getClass();
                    this.f1934 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f1937.getClass();
                        this.f1936 = null;
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f1932.getClass();
                    this.f1935 = null;
                    return;
                }
                return;
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination = this.f1935;
                    m1864();
                    inventoryS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f1935;
                    m1864();
                    inventoryS3BucketDestination2.getClass();
                    return;
                } else if (str.equals("Format")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f1935;
                    m1864();
                    inventoryS3BucketDestination3.getClass();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f1935;
                        m1864();
                        inventoryS3BucketDestination4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    InventoryFilter inventoryFilter = this.f1931;
                    m1864();
                    new InventoryPrefixPredicate();
                    inventoryFilter.getClass();
                    return;
                }
                return;
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration", "Schedule")) {
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f1934;
                    m1864();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (m1863("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f1936.add(m1864());
            }
        }
    }
}
