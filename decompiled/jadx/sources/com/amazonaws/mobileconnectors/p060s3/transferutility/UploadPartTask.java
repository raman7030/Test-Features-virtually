package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.amazonaws.AbortedException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.AmazonS3;
import com.amazonaws.services.p061s3.model.UploadPartRequest;
import com.amazonaws.services.p061s3.model.UploadPartResult;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartTask implements Callable {

    /* JADX INFO: renamed from: ܳ */
    public static final Log f1542 = LogFactory.m1468(UploadPartTask.class);

    /* JADX INFO: renamed from: ֫ */
    public final TransferDBUtil f1543;

    /* JADX INFO: renamed from: ۧ */
    public final AmazonS3 f1544;

    /* JADX INFO: renamed from: ܽ */
    public final UploadPartRequest f1545;

    /* JADX INFO: renamed from: ܿ */
    public final UploadPartTaskProgressListener f1546;

    /* JADX INFO: renamed from: ᩳ */
    public final UploadTask.UploadPartTaskMetadata f1547;

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f1547 = uploadPartTaskMetadata;
        this.f1546 = new UploadPartTaskProgressListener(uploadTaskProgressListener);
        this.f1545 = uploadPartRequest;
        this.f1544 = amazonS3;
        this.f1543 = transferDBUtil;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        TransferDBUtil transferDBUtil = this.f1543;
        Log log = f1542;
        TransferState transferState = TransferState.IN_PROGRESS;
        UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f1547;
        uploadPartTaskMetadata.f1560 = transferState;
        UploadPartRequest uploadPartRequest = this.f1545;
        UploadPartTaskProgressListener uploadPartTaskProgressListener = this.f1546;
        uploadPartRequest.mo1326(uploadPartTaskProgressListener);
        int i = 1;
        while (true) {
            try {
                UploadPartResult uploadPartResultMo1604 = this.f1544.mo1604(uploadPartRequest);
                TransferState transferState2 = TransferState.PART_COMPLETED;
                uploadPartTaskMetadata.f1560 = transferState2;
                int iM1849 = uploadPartRequest.m1849();
                transferDBUtil.getClass();
                TransferDBUtil.m1526(iM1849, transferState2);
                int iM18410 = uploadPartRequest.m1849();
                String strM1860 = uploadPartResultMo1604.m1860();
                transferDBUtil.getClass();
                TransferDBUtil.m1533(iM18410, strM1860);
                return Boolean.TRUE;
            } catch (AbortedException unused) {
                log.mo1460("Upload part aborted.");
                ProgressEvent progressEvent = new ProgressEvent(0L);
                progressEvent.m1393(32);
                uploadPartTaskProgressListener.mo1395(progressEvent);
                return Boolean.FALSE;
            } catch (Exception e) {
                log.mo1457("Unexpected error occurred: " + e);
                ProgressEvent progressEvent2 = new ProgressEvent(0L);
                progressEvent2.m1393(32);
                uploadPartTaskProgressListener.mo1395(progressEvent2);
                try {
                    TransferNetworkLossHandler.m1547();
                    if (!TransferNetworkLossHandler.m1547().m1548()) {
                        log.mo1463("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        TransferState transferState3 = TransferState.WAITING_FOR_NETWORK;
                        uploadPartTaskMetadata.f1560 = transferState3;
                        int iM18411 = uploadPartRequest.m1849();
                        transferDBUtil.getClass();
                        TransferDBUtil.m1526(iM18411, transferState3);
                        log.mo1463("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e2) {
                    log.mo1457("TransferUtilityException: [" + e2 + "]");
                }
                if (i >= 3) {
                    TransferState transferState4 = TransferState.FAILED;
                    uploadPartTaskMetadata.f1560 = transferState4;
                    int iM18412 = uploadPartRequest.m1849();
                    transferDBUtil.getClass();
                    TransferDBUtil.m1526(iM18412, transferState4);
                    log.mo1461("Encountered error uploading part ", e);
                    throw e;
                }
                long jRandom = (((long) (1 << i)) * 1000) + ((long) (Math.random() * 1000.0d));
                log.mo1463("Retrying in " + jRandom + " ms.");
                TimeUnit.MILLISECONDS.sleep(jRandom);
                log.mo1458("Retry attempt: " + i, e);
                i++;
            }
        }
    }

    public class UploadPartTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ֫ */
        public long f1548;

        /* JADX INFO: renamed from: ܽ */
        public final UploadTask.UploadTaskProgressListener f1550;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f1550 = uploadTaskProgressListener;
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ֫ */
        public final void mo1395(ProgressEvent progressEvent) {
            if (32 == progressEvent.m1394()) {
                UploadPartTask.f1542.mo1460("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f1548 = 0L;
            } else {
                this.f1548 = progressEvent.m1392() + this.f1548;
            }
            this.f1550.m1579(UploadPartTask.this.f1545.m1846(), this.f1548);
        }
    }
}
