package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AbortedException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class UploadPartTask implements Callable {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Log f382 = LogFactory.m302(UploadPartTask.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TransferDBUtil f383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UploadPartRequest f385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final UploadPartTaskProgressListener f386;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UploadTask.UploadPartTaskMetadata f387;

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f387 = uploadPartTaskMetadata;
        this.f386 = new UploadPartTaskProgressListener(uploadTaskProgressListener);
        this.f385 = uploadPartRequest;
        this.f384 = amazonS3;
        this.f383 = transferDBUtil;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        TransferDBUtil transferDBUtil = this.f383;
        Log log = f382;
        TransferState transferState = TransferState.IN_PROGRESS;
        UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f387;
        uploadPartTaskMetadata.f400 = transferState;
        UploadPartRequest uploadPartRequest = this.f385;
        UploadPartTaskProgressListener uploadPartTaskProgressListener = this.f386;
        uploadPartRequest.mo159(uploadPartTaskProgressListener);
        int i = 1;
        while (true) {
            try {
                UploadPartResult uploadPartResultMo438 = this.f384.mo438(uploadPartRequest);
                TransferState transferState2 = TransferState.PART_COMPLETED;
                uploadPartTaskMetadata.f400 = transferState2;
                int iM684 = uploadPartRequest.m684();
                transferDBUtil.getClass();
                TransferDBUtil.m360(iM684, transferState2);
                int iM685 = uploadPartRequest.m684();
                String strM695 = uploadPartResultMo438.m695();
                transferDBUtil.getClass();
                TransferDBUtil.m367(iM685, strM695);
                return Boolean.TRUE;
            } catch (AbortedException unused) {
                log.mo294("Upload part aborted.");
                ProgressEvent progressEvent = new ProgressEvent(0L);
                progressEvent.m227(32);
                uploadPartTaskProgressListener.mo229(progressEvent);
                return Boolean.FALSE;
            } catch (Exception e) {
                log.mo291("Unexpected error occurred: " + e);
                ProgressEvent progressEvent2 = new ProgressEvent(0L);
                progressEvent2.m227(32);
                uploadPartTaskProgressListener.mo229(progressEvent2);
                try {
                    TransferNetworkLossHandler.m381();
                    if (!TransferNetworkLossHandler.m381().m382()) {
                        log.mo297("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        TransferState transferState3 = TransferState.WAITING_FOR_NETWORK;
                        uploadPartTaskMetadata.f400 = transferState3;
                        int iM686 = uploadPartRequest.m684();
                        transferDBUtil.getClass();
                        TransferDBUtil.m360(iM686, transferState3);
                        log.mo297("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e2) {
                    log.mo291("TransferUtilityException: [" + e2 + "]");
                }
                if (i >= 3) {
                    TransferState transferState4 = TransferState.FAILED;
                    uploadPartTaskMetadata.f400 = transferState4;
                    int iM687 = uploadPartRequest.m684();
                    transferDBUtil.getClass();
                    TransferDBUtil.m360(iM687, transferState4);
                    log.mo295("Encountered error uploading part ", e);
                    throw e;
                }
                long jRandom = (((long) (1 << i)) * 1000) + ((long) (Math.random() * 1000.0d));
                log.mo297("Retrying in " + jRandom + " ms.");
                TimeUnit.MILLISECONDS.sleep(jRandom);
                log.mo292("Retry attempt: " + i, e);
                i++;
            }
        }
    }

    public class UploadPartTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public long f388;

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final UploadTask.UploadTaskProgressListener f390;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f390 = uploadTaskProgressListener;
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ֫ */
        public final void mo229(ProgressEvent progressEvent) {
            if (32 == progressEvent.m228()) {
                UploadPartTask.f382.mo294("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f388 = 0L;
            } else {
                this.f388 = progressEvent.m226() + this.f388;
            }
            this.f390.m413(UploadPartTask.this.f385.m681(), this.f388);
        }
    }
}
