package com.amazonaws.mobileconnectors.p060s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p067l.C21562;
import p067l.ConcurrentMapC12768;

/* JADX INFO: loaded from: classes.dex */
public class TransferStatusUpdater {

    /* JADX INFO: renamed from: ܳ */
    public static TransferDBUtil f1516;

    /* JADX INFO: renamed from: ᩻ */
    public static TransferStatusUpdater f1520;

    /* JADX INFO: renamed from: ֫ */
    public final Handler f1521;

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f1522;

    /* JADX INFO: renamed from: ᩳ */
    public static final Log f1519 = LogFactory.m1468(TransferStatusUpdater.class);

    /* JADX INFO: renamed from: ܿ */
    public static final HashSet f1518 = new HashSet(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));

    /* JADX INFO: renamed from: ܽ */
    public static final Map f1517 = new ConcurrentMapC12768() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    /* JADX INFO: renamed from: ֫ */
    public final synchronized TransferRecord m1558(int i) {
        return (TransferRecord) this.f1522.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Map m1559() {
        return C21562.unmodifiableMap(this.f1522);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m1560(int i, long j, long j2, boolean z) {
        TransferRecord transferRecord = (TransferRecord) this.f1522.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.f1479 = j;
            transferRecord.f1485 = j2;
        }
        f1516.getClass();
        TransferDBUtil.m1531(i, j);
        if (z) {
            Map map = f1517;
            synchronized (map) {
                List list = (List) ((ConcurrentMapC12768) map).get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f1521.post(new Runnable(i, j, j2) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f1524.m1539();
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m1563(TransferRecord transferRecord) {
        this.f1522.put(Integer.valueOf(transferRecord.f1488), transferRecord);
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m1565(int i) {
        f1516.getClass();
        TransferRecord transferRecordM1538 = TransferDBUtil.m1538(i);
        if (transferRecordM1538 != null) {
            String str = transferRecordM1538.f1482;
            if (new File(str).getName().startsWith("aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002")) {
                new File(str).delete();
            }
        }
        S3ClientReference.m1520(Integer.valueOf(i));
        f1516.getClass();
        TransferDBUtil.m1530(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized TransferStatusUpdater m1556(Context context) {
        if (f1520 == null) {
            TransferDBUtil transferDBUtil = new TransferDBUtil(context);
            f1516 = transferDBUtil;
            f1520 = new TransferStatusUpdater(transferDBUtil);
        }
        return f1520;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m1561(int i, TransferState transferState) {
        boolean zContains = f1518.contains(transferState);
        TransferRecord transferRecord = (TransferRecord) this.f1522.get(Integer.valueOf(i));
        if (transferRecord == null) {
            f1516.getClass();
            if (TransferDBUtil.m1526(i, transferState) == 0) {
                f1519.mo1466("Failed to update the status of transfer " + i);
            }
        } else {
            zContains |= transferState.equals(transferRecord.f1472);
            transferRecord.f1472 = transferState;
            f1516.getClass();
            if (TransferDBUtil.m1527(transferRecord) == 0) {
                f1519.mo1466("Failed to update the status of transfer " + i);
            }
        }
        if (zContains) {
            return;
        }
        if (TransferState.COMPLETED.equals(transferState)) {
            m1565(i);
        }
        Map map = f1517;
        synchronized (map) {
            List list = (List) ((ConcurrentMapC12768) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f1521.post(new Runnable(i, transferState) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1523.m1541();
                        }
                    });
                }
                if (TransferState.m1555(transferState)) {
                    list.clear();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized ProgressListener m1564(int i) {
        TransferRecord transferRecordM1558;
        transferRecordM1558 = m1558(i);
        if (transferRecordM1558 == null) {
            f1519.mo1463("TransferStatusUpdater doesn't track the transfer: " + i);
            throw new IllegalArgumentException("transfer " + i + " doesn't exist");
        }
        f1519.mo1463("Creating a new progress listener for transfer: " + i);
        return new TransferProgressListener(transferRecordM1558);
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        f1516 = transferDBUtil;
        this.f1521 = new Handler(Looper.getMainLooper());
        this.f1522 = new ConcurrentMapC12768();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1562(int i, Exception exc) {
        Map map = f1517;
        synchronized (map) {
            List list = (List) ((ConcurrentMapC12768) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f1521.post(new Runnable(i, exc) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f1525.m1540();
                        }
                    });
                }
            }
        }
    }

    public class TransferProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ֫ */
        public long f1526;

        /* JADX INFO: renamed from: ܽ */
        public final TransferRecord f1528;

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ֫ */
        public final synchronized void mo1395(ProgressEvent progressEvent) {
            if (32 == progressEvent.m1394()) {
                TransferStatusUpdater.f1519.mo1463("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f1526 = 0L;
            } else {
                long jM1392 = this.f1526 + progressEvent.m1392();
                this.f1526 = jM1392;
                TransferRecord transferRecord = this.f1528;
                if (jM1392 > transferRecord.f1479) {
                    transferRecord.f1479 = jM1392;
                    TransferStatusUpdater.this.m1560(transferRecord.f1488, jM1392, transferRecord.f1485, true);
                }
            }
        }

        public TransferProgressListener(TransferRecord transferRecord) {
            this.f1528 = transferRecord;
        }
    }
}
