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
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public enum AwsSdkMetrics {
    ;


    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f237 = false;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final String f238 = "getQueuePollTimeoutMilli";

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static volatile Integer f239 = null;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String f240 = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f241 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f242;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String f243 = "includePerHostMetrics";

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static volatile String f244 = null;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String f245 = "metricQueueSize";

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static volatile MetricCollector f246 = null;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f247 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f248 = "hostMetricName";

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final int f249 = 1000;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String f250 = "jvmMetricName";

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String f251 = "excludeMachineMetrics";

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f252 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f253 = "metricNameSpace";

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static volatile AWSCredentialsProvider f254 = null;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static volatile String f255 = "AWSSDK/Java";

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final MetricRegistry f256;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static volatile String f257 = null;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final String f258 = "useSingleMetricNamespace";

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static volatile Long f259 = null;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static volatile Regions f260 = null;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String f261 = "cloudwatchRegion";

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static volatile String f262 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String f264 = "credentialFile";

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String f265 = "com.amazonaws.management:type=AwsSdkMetrics";

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static boolean f266;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m317() {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m307(AWSCredentialsProvider aWSCredentialsProvider) {
        f254 = aWSCredentialsProvider;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m308(MetricCollector metricCollector) {
        f246 = metricCollector;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m325() {
        if (f246 != null) {
            f246.getClass();
        }
        if (f266) {
            throw new IllegalStateException("Reentrancy is not allowed");
        }
        f266 = true;
        try {
            try {
                MetricCollector factory = ((MetricCollector.Factory) Class.forName(f240).newInstance()).getInstance();
                if (factory != null) {
                    m308(factory);
                    f266 = false;
                    return true;
                }
            } catch (Exception e) {
                LogFactory.m302(AwsSdkMetrics.class).mo298("Failed to enable the default metrics", e);
            }
            f266 = false;
            return false;
        } catch (Throwable th) {
            f266 = false;
            throw th;
        }
    }

    static {
        String property = System.getProperty("com.amazonaws.sdk.enableDefaultMetrics");
        boolean z = property != null;
        f242 = z;
        if (z) {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (String str : property.split(",")) {
                String strTrim = str.trim();
                if (!z2 && f251.equals(strTrim)) {
                    z2 = true;
                } else if (!z3 && f243.equals(strTrim)) {
                    z3 = true;
                } else if (z4 || !f258.equals(strTrim)) {
                    String[] strArrSplit = strTrim.split("=");
                    if (strArrSplit.length == 2) {
                        String strTrim2 = strArrSplit[0].trim();
                        String strTrim3 = strArrSplit[1].trim();
                        try {
                            if (f264.equals(strTrim2)) {
                                m322(strTrim3);
                            } else if (f261.equals(strTrim2)) {
                                f260 = Regions.m426(strTrim3);
                            } else if (f245.equals(strTrim2)) {
                                Integer num = new Integer(strTrim3);
                                if (num.intValue() < 1) {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                                f239 = num;
                            } else if (f238.equals(strTrim2)) {
                                Long l2 = new Long(strTrim3);
                                if (l2.intValue() < 1000) {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                                f259 = l2;
                            } else if (f253.equals(strTrim2)) {
                                f255 = strTrim3;
                            } else if (f250.equals(strTrim2)) {
                                f262 = strTrim3;
                            } else if (f248.equals(strTrim2)) {
                                f244 = strTrim3;
                            } else {
                                LogFactory.m302(AwsSdkMetrics.class).mo294("Ignoring unrecognized parameter: " + strTrim);
                            }
                        } catch (Exception e) {
                            LogFactory.m302(AwsSdkMetrics.class).mo292("Ignoring failure", e);
                        }
                    } else {
                        continue;
                    }
                } else {
                    z4 = true;
                }
            }
            f247 = z2;
            f241 = z3;
            f237 = z4;
        }
        f256 = new MetricRegistry();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static RequestMetricCollector m329() {
        if (f246 == null && m340()) {
            m325();
        }
        if (f246 == null) {
            return RequestMetricCollector.f275;
        }
        ((MetricCollector.AnonymousClass1) f246).getClass();
        return RequestMetricCollector.f275;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ServiceMetricCollector m339() {
        if (f246 == null && m340()) {
            m325();
        }
        if (f246 == null) {
            return ServiceMetricCollector.f276;
        }
        ((MetricCollector.AnonymousClass1) f246).getClass();
        return ServiceMetricCollector.f276;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m321() {
        return f246;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m330() {
        if (f246 == null && m340()) {
            m325();
        }
        return f246 == null ? MetricCollector.f273 : f246;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m313(boolean z) {
        f247 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m324(boolean z) {
        f241 = z;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m340() {
        return f242;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m327() {
        return f237;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m332(boolean z) {
        f237 = z;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m337() {
        return f247;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m328() {
        return f241;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m316() {
        if (f241) {
            return true;
        }
        String str = f244;
        return (str == null ? "" : str.trim()).length() > 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m306() {
        m308(MetricCollector.f273);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m314(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f256.m344(metricType);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m315(Collection collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        return f256.m345(collection);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m323(Collection collection) {
        f256.m346(collection);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m326(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f256.m347(metricType);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Set m318() {
        return f256.m343();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static AWSCredentialsProvider m341() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(f240)) {
                return f254;
            }
        }
        SecurityException securityException = new SecurityException();
        LogFactory.m302(AwsSdkMetrics.class).mo298("Illegal attempt to access the credential provider", securityException);
        throw securityException;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static Regions m319() {
        return f260;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m309(Regions regions) {
        f260 = regions;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m333() {
        return f257;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m312(String str) {
        m322(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m322(String str) {
        final PropertiesCredentials propertiesCredentials = new PropertiesCredentials(new File(str));
        synchronized (AwsSdkMetrics.class) {
            f254 = new AWSCredentialsProvider() { // from class: com.amazonaws.metrics.AwsSdkMetrics.1
                @Override // com.amazonaws.auth.AWSCredentialsProvider
                /* JADX INFO: renamed from: ֫ */
                public final AWSCredentials mo208() {
                    return propertiesCredentials;
                }
            };
            f257 = str;
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Integer m304() {
        return f239;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m310(Integer num) {
        f239 = num;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Long m305() {
        return f259;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m311(Long l2) {
        f259 = l2;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m336() {
        return f255;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m334(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        f255 = str;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String m320() {
        return f262;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m335(String str) {
        f262 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m338() {
        return f244;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m331(String str) {
        f244 = str;
    }

    public class MetricRegistry {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final HashSet f268;

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public volatile Set f269;

        public MetricRegistry() {
            HashSet hashSet = new HashSet();
            this.f268 = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            m342();
        }

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        private void m342() {
            this.f269 = C20195.unmodifiableSet(new HashSet(this.f268));
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean m344(MetricType metricType) {
            boolean zAdd;
            synchronized (this.f268) {
                zAdd = this.f268.add(metricType);
                if (zAdd) {
                    m342();
                }
            }
            return zAdd;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean m345(Collection collection) {
            boolean zAddAll;
            synchronized (this.f268) {
                zAddAll = this.f268.addAll(collection);
                if (zAddAll) {
                    m342();
                }
            }
            return zAddAll;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0015 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:12:0x0017 A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x000b A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0013 A[Catch: all -> 0x0029, DONT_GENERATE, TryCatch #0 {, blocks: (B:5:0x0005, B:13:0x0019, B:15:0x0024, B:16:0x0027, B:7:0x000b, B:9:0x0013, B:12:0x0017), top: B:21:0x0005 }] */
        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final void m346(Collection collection) {
            synchronized (this.f268) {
                if (collection != null) {
                    if (collection.size() == 0) {
                        if (this.f268.size() == 0) {
                            return;
                        }
                        if (collection == null) {
                            collection = Collections.EMPTY_LIST;
                        }
                    }
                } else {
                    if (this.f268.size() == 0) {
                        return;
                    }
                    if (collection == null) {
                        collection = Collections.EMPTY_LIST;
                    }
                }
                this.f268.clear();
                if (!m345(collection)) {
                    m342();
                }
            }
        }

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final boolean m347(MetricType metricType) {
            boolean zRemove;
            synchronized (this.f268) {
                zRemove = this.f268.remove(metricType);
                if (zRemove) {
                    m342();
                }
            }
            return zRemove;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final Set m343() {
            return this.f269;
        }
    }
}
