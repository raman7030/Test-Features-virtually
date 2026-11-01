package com.amazonaws.metrics;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSServiceMetrics;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public enum AwsSdkMetrics {
    ;


    /* JADX INFO: renamed from: ֡֫ */
    public static volatile boolean f1397 = false;

    /* JADX INFO: renamed from: ֫֫ */
    public static final String f1398 = "getQueuePollTimeoutMilli";

    /* JADX INFO: renamed from: ۖ֫ */
    public static volatile Integer f1399 = null;

    /* JADX INFO: renamed from: ۗ */
    public static final String f1400 = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";

    /* JADX INFO: renamed from: ۘ֫ */
    public static volatile boolean f1401 = false;

    /* JADX INFO: renamed from: ۙ */
    public static final boolean f1402;

    /* JADX INFO: renamed from: ۛ */
    public static final String f1403 = "includePerHostMetrics";

    /* JADX INFO: renamed from: ۜ֫ */
    public static volatile String f1404 = null;

    /* JADX INFO: renamed from: ۟ */
    public static final String f1405 = "metricQueueSize";

    /* JADX INFO: renamed from: ۡ֫ */
    public static volatile MetricCollector f1406 = null;

    /* JADX INFO: renamed from: ۢ֫ */
    public static volatile boolean f1407 = false;

    /* JADX INFO: renamed from: ۤ */
    public static final String f1408 = "hostMetricName";

    /* JADX INFO: renamed from: ۧ֫ */
    public static final int f1409 = 1000;

    /* JADX INFO: renamed from: ۨ */
    public static final String f1410 = "jvmMetricName";

    /* JADX INFO: renamed from: ۫ */
    public static final String f1411 = "excludeMachineMetrics";

    /* JADX INFO: renamed from: ۬ */
    public static final String f1412 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ܰ */
    public static final String f1413 = "metricNameSpace";

    /* JADX INFO: renamed from: ܳ֫ */
    public static volatile AWSCredentialsProvider f1414 = null;

    /* JADX INFO: renamed from: ܺ֫ */
    public static volatile String f1415 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ܽ֫ */
    public static final MetricRegistry f1416;

    /* JADX INFO: renamed from: ܿ֫ */
    public static volatile String f1417 = null;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final String f1418 = "useSingleMetricNamespace";

    /* JADX INFO: renamed from: ᩴ֫ */
    public static volatile Long f1419 = null;

    /* JADX INFO: renamed from: ᩵֫ */
    public static volatile Regions f1420 = null;

    /* JADX INFO: renamed from: ᩶ */
    public static final String f1421 = "cloudwatchRegion";

    /* JADX INFO: renamed from: ᩷֫ */
    public static volatile String f1422 = null;

    /* JADX INFO: renamed from: ᩹ */
    public static final String f1424 = "credentialFile";

    /* JADX INFO: renamed from: ᩺ */
    public static final String f1425 = "com.amazonaws.management:type=AwsSdkMetrics";

    /* JADX INFO: renamed from: ᩻֫ */
    public static boolean f1426;

    /* JADX INFO: renamed from: ۙ */
    public static boolean m1483() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m1473(AWSCredentialsProvider aWSCredentialsProvider) {
        f1414 = aWSCredentialsProvider;
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized void m1474(MetricCollector metricCollector) {
        f1406 = metricCollector;
    }

    /* JADX INFO: renamed from: ۧ */
    public static synchronized boolean m1491() {
        if (f1406 != null) {
            f1406.getClass();
        }
        if (f1426) {
            throw new IllegalStateException("Reentrancy is not allowed");
        }
        f1426 = true;
        try {
            try {
                MetricCollector factory = ((MetricCollector.Factory) Class.forName(f1400).newInstance()).getInstance();
                if (factory != null) {
                    m1474(factory);
                    f1426 = false;
                    return true;
                }
            } catch (Exception e) {
                LogFactory.m1468(AwsSdkMetrics.class).mo1464("Failed to enable the default metrics", e);
            }
            f1426 = false;
            return false;
        } catch (Throwable th) {
            f1426 = false;
            throw th;
        }
    }

    static {
        String property = System.getProperty("com.amazonaws.sdk.enableDefaultMetrics");
        boolean z = property != null;
        f1402 = z;
        if (z) {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (String str : property.split(",")) {
                String strTrim = str.trim();
                if (!z2 && f1411.equals(strTrim)) {
                    z2 = true;
                } else if (!z3 && f1403.equals(strTrim)) {
                    z3 = true;
                } else if (z4 || !f1418.equals(strTrim)) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length == 2) {
                        String strTrim2 = strArrSplit[0].trim();
                        String strTrim3 = strArrSplit[1].trim();
                        try {
                            if (f1424.equals(strTrim2)) {
                                m1488(strTrim3);
                            } else if (f1421.equals(strTrim2)) {
                                f1420 = Regions.m1592(strTrim3);
                            } else if (f1405.equals(strTrim2)) {
                                Integer num = new Integer(strTrim3);
                                if (num.intValue() < 1) {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                                f1399 = num;
                            } else if (f1398.equals(strTrim2)) {
                                Long l2 = new Long(strTrim3);
                                if (l2.intValue() < 1000) {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                                f1419 = l2;
                            } else if (f1413.equals(strTrim2)) {
                                f1415 = strTrim3;
                            } else if (f1410.equals(strTrim2)) {
                                f1422 = strTrim3;
                            } else if (f1408.equals(strTrim2)) {
                                f1404 = strTrim3;
                            } else {
                                LogFactory.m1468(AwsSdkMetrics.class).mo1460("Ignoring unrecognized parameter: " + strTrim);
                            }
                        } catch (Exception e) {
                            LogFactory.m1468(AwsSdkMetrics.class).mo1458("Ignoring failure", e);
                        }
                    } else {
                        continue;
                    }
                } else {
                    z4 = true;
                }
            }
            f1407 = z2;
            f1401 = z3;
            f1397 = z4;
        }
        f1416 = new MetricRegistry();
    }

    /* JADX INFO: renamed from: ܶ */
    public static RequestMetricCollector m1495() {
        if (f1406 == null && m1506()) {
            m1491();
        }
        if (f1406 == null) {
            return RequestMetricCollector.f1435;
        }
        ((MetricCollector.C02611) f1406).getClass();
        return RequestMetricCollector.f1435;
    }

    /* JADX INFO: renamed from: ᩸ */
    public static ServiceMetricCollector m1505() {
        if (f1406 == null && m1506()) {
            m1491();
        }
        if (f1406 == null) {
            return ServiceMetricCollector.f1436;
        }
        ((MetricCollector.C02611) f1406).getClass();
        return ServiceMetricCollector.f1436;
    }

    /* JADX INFO: renamed from: ۢ */
    public static MetricCollector m1487() {
        return f1406;
    }

    /* JADX INFO: renamed from: ܺ */
    public static MetricCollector m1496() {
        if (f1406 == null && m1506()) {
            m1491();
        }
        return f1406 == null ? MetricCollector.f1433 : f1406;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1479(boolean z) {
        f1407 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1490(boolean z) {
        f1401 = z;
    }

    /* JADX INFO: renamed from: ᩹ */
    public static boolean m1506() {
        return f1402;
    }

    /* JADX INFO: renamed from: ۫ */
    public static boolean m1493() {
        return f1397;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m1498(boolean z) {
        f1397 = z;
    }

    /* JADX INFO: renamed from: ᩶ */
    public static boolean m1503() {
        return f1407;
    }

    /* JADX INFO: renamed from: ۬ */
    public static boolean m1494() {
        return f1401;
    }

    /* JADX INFO: renamed from: ۗ */
    public static boolean m1482() {
        if (f1401) {
            return true;
        }
        String str = f1404;
        return (str == null ? "" : str.trim()).length() > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1472() {
        m1474(MetricCollector.f1433);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1480(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f1416.m1510(metricType);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1481(Collection collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        return f1416.m1511(collection);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1489(Collection collection) {
        f1416.m1512(collection);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m1492(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f1416.m1513(metricType);
    }

    /* JADX INFO: renamed from: ۚ */
    public static Set m1484() {
        return f1416.m1509();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static AWSCredentialsProvider m1507() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(f1400)) {
                return f1414;
            }
        }
        SecurityException securityException = new SecurityException();
        LogFactory.m1468(AwsSdkMetrics.class).mo1464("Illegal attempt to access the credential provider", securityException);
        throw securityException;
    }

    /* JADX INFO: renamed from: ۠ */
    public static Regions m1485() {
        return f1420;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1475(Regions regions) {
        f1420 = regions;
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m1499() {
        return f1417;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1478(String str) {
        m1488(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1488(String str) {
        final PropertiesCredentials propertiesCredentials = new PropertiesCredentials(new File(str));
        synchronized (AwsSdkMetrics.class) {
            f1414 = new AWSCredentialsProvider() { // from class: com.amazonaws.metrics.AwsSdkMetrics.1
                @Override // com.amazonaws.auth.AWSCredentialsProvider
                /* JADX INFO: renamed from: ֫ */
                public final AWSCredentials mo1374() {
                    return propertiesCredentials;
                }
            };
            f1417 = str;
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public static Integer m1470() {
        return f1399;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1476(Integer num) {
        f1399 = num;
    }

    /* JADX INFO: renamed from: ֨ */
    public static Long m1471() {
        return f1419;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1477(Long l2) {
        f1419 = l2;
    }

    /* JADX INFO: renamed from: ᩴ */
    public static String m1502() {
        return f1415;
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m1500(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        f1415 = str;
    }

    /* JADX INFO: renamed from: ۡ */
    public static String m1486() {
        return f1422;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m1501(String str) {
        f1422 = str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static String m1504() {
        return f1404;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m1497(String str) {
        f1404 = str;
    }

    public class MetricRegistry {

        /* JADX INFO: renamed from: ֫ */
        public final HashSet f1428;

        /* JADX INFO: renamed from: ۧ */
        public volatile Set f1429;

        public MetricRegistry() {
            HashSet hashSet = new HashSet();
            this.f1428 = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            m1508();
        }

        /* JADX INFO: renamed from: ۧ */
        private void m1508() {
            this.f1429 = C21562.unmodifiableSet(new HashSet(this.f1428));
        }

        /* JADX INFO: renamed from: ֫ */
        public final boolean m1510(MetricType metricType) {
            boolean zAdd;
            synchronized (this.f1428) {
                zAdd = this.f1428.add(metricType);
                if (zAdd) {
                    m1508();
                }
            }
            return zAdd;
        }

        /* JADX INFO: renamed from: ֫ */
        public final boolean m1511(Collection collection) {
            boolean zAddAll;
            synchronized (this.f1428) {
                zAddAll = this.f1428.addAll(collection);
                if (zAddAll) {
                    m1508();
                }
            }
            return zAddAll;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0015 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:12:0x0017 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x000b A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x0029, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX INFO: renamed from: ۧ */
        public final void m1512(Collection collection) {
            synchronized (this.f1428) {
                if (collection != null) {
                    if (collection.size() == 0) {
                        if (this.f1428.size() == 0) {
                            return;
                        }
                        if (collection == null) {
                            collection = Collections.EMPTY_LIST;
                        }
                    }
                } else {
                    if (this.f1428.size() == 0) {
                        return;
                    }
                    if (collection == null) {
                        collection = Collections.EMPTY_LIST;
                    }
                }
                this.f1428.clear();
                if (!m1511(collection)) {
                    m1508();
                }
            }
        }

        /* JADX INFO: renamed from: ۧ */
        public final boolean m1513(MetricType metricType) {
            boolean zRemove;
            synchronized (this.f1428) {
                zRemove = this.f1428.remove(metricType);
                if (zRemove) {
                    m1508();
                }
            }
            return zRemove;
        }

        /* JADX INFO: renamed from: ֫ */
        public final Set m1509() {
            return this.f1429;
        }
    }
}
