package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.Defcon;

/* JADX INFO: loaded from: classes.dex */
public class ReportPolicy {
    public static final int BATCH_AT_LAUNCH = 1;
    public static final int BATCH_AT_TERMINATE = 2;
    public static final int BATCH_BY_INTERVAL = 6;
    public static final int DAILY = 4;
    public static final int IMMEDIATE = 3;
    public static final int QUASI_REALTIME_POLICY = 11;
    public static final int REALTIME = 0;
    public static final int SMART_POLICY = 8;
    public static final int WIFIONLY = 5;

    public class ReportAtLaunch extends ReportStrategy {
        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return z;
        }
    }

    public class ReportRealtime extends ReportStrategy {
        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return true;
        }
    }

    public class ReportStrategy {
        public boolean isValid() {
            return true;
        }

        public boolean shouldSendMessage(boolean z) {
            return true;
        }
    }

    public static boolean isValid(int i) {
        if (i == 8 || i == 11) {
            return true;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public class ReportQuasiRealtime extends ReportStrategy {
        public static long DEFAULT_REPORT_INTERVAL = 15000;
        public static long MAX_REPORT_INTERVAL = 90000;
        public static long MIN_REPORT_INTERVAL = 3000;
        public long mReportInterval;

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return true;
        }

        public long getReportInterval() {
            return this.mReportInterval;
        }

        public void setReportInterval(long j) {
            if (j >= MIN_REPORT_INTERVAL && j <= MAX_REPORT_INTERVAL) {
                this.mReportInterval = j;
            } else {
                this.mReportInterval = DEFAULT_REPORT_INTERVAL;
            }
        }
    }

    public class ReportByInterval extends ReportStrategy {
        public static long MAX_REPORT_INTERVAL = 86400000;
        public static long MIN_REPORT_INTERVAL = 90000;
        public long mReportInterval;
        public StatTracer mTracer;

        public ReportByInterval(StatTracer statTracer, long j) {
            this.mTracer = statTracer;
            setReportInterval(j);
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return z || System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.mReportInterval;
        }

        public void setReportInterval(long j) {
            long j2 = MIN_REPORT_INTERVAL;
            if (j >= j2 && j <= MAX_REPORT_INTERVAL) {
                this.mReportInterval = j;
            } else {
                this.mReportInterval = j2;
            }
        }

        public long getReportInterval() {
            return this.mReportInterval;
        }

        public static boolean isValidValue(int i) {
            return ((long) i) >= MIN_REPORT_INTERVAL;
        }
    }

    public class ReportDaily extends ReportStrategy {
        public long HOURS_DAY = 86400000;
        public StatTracer mTracer;

        public ReportDaily(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.HOURS_DAY;
        }
    }

    public class ReportWifiOnly extends ReportStrategy {
        public Context mContext;

        public ReportWifiOnly(Context context) {
            this.mContext = context;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return DeviceConfig.isWiFiAvailable(this.mContext);
        }
    }

    public class DefconPolicy extends ReportStrategy {
        public Defcon defcon;
        public StatTracer tracer;

        public DefconPolicy(StatTracer statTracer, Defcon defcon) {
            this.tracer = statTracer;
            this.defcon = defcon;
        }

        public boolean shouldSendMessageByInstant() {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastInstantBuildTime(UMModuleRegister.getAppContext()) >= this.defcon.getReqInterval();
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.defcon.getReqInterval();
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean isValid() {
            return this.defcon.isOpen();
        }
    }

    public class LatentPolicy extends ReportStrategy {
        public long latency;
        public long start;

        public LatentPolicy(int i) {
            this.start = 0L;
            this.latency = i;
            this.start = System.currentTimeMillis();
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return System.currentTimeMillis() - this.start >= this.latency;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean isValid() {
            return System.currentTimeMillis() - this.start < this.latency;
        }
    }

    public class SmartPolicy extends ReportStrategy {
        public final long ReportInterval = 10800000;
        public StatTracer mTracer;

        public SmartPolicy(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= 10800000;
        }
    }

    public class DebugPolicy extends ReportStrategy {
        public final long ReportInterval = 15000;
        public StatTracer mTracer;

        public DebugPolicy(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        @Override // com.umeng.commonsdk.statistics.common.ReportPolicy.ReportStrategy
        public boolean shouldSendMessage(boolean z) {
            return System.currentTimeMillis() - UMEnvelopeBuild.getLastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= 15000;
        }
    }
}
