package com.amazonaws.mobileconnectors.s3.transferutility;

import com.alipay.sdk.m.w.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.util.Mimetypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class UploadTask implements Callable {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Log f391 = LogFactory.m302(UploadTask.class);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final HashMap f392 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TransferDBUtil f393;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f394;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f395 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f396;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TransferRecord f397;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TransferStatusUpdater f398;

    public class UploadPartTaskMetadata {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public long f399;

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public TransferState f400;

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public Future f401;
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f392.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f397 = transferRecord;
        this.f396 = amazonS3;
        this.f393 = transferDBUtil;
        this.f398 = transferStatusUpdater;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map;
        AmazonS3 amazonS3;
        TransferRecord transferRecord = this.f397;
        TransferStatusUpdater transferStatusUpdater = this.f398;
        Log log = f391;
        try {
            TransferNetworkLossHandler.m381();
            if (!TransferNetworkLossHandler.m381().m382()) {
                log.mo297("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.mo291("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.m395(transferRecord.f328, TransferState.IN_PROGRESS);
        int i = transferRecord.f306;
        long j = 0;
        AmazonS3 amazonS4 = this.f396;
        if (i != 1 || transferRecord.f332 != 0) {
            if (i != 0) {
                return Boolean.FALSE;
            }
            PutObjectRequest putObjectRequestM410 = m410(transferRecord);
            ProgressListener progressListenerM398 = transferStatusUpdater.m398(transferRecord.f328);
            long length = putObjectRequestM410.m513().length();
            TransferUtility.m405(putObjectRequestM410);
            putObjectRequestM410.mo159(progressListenerM398);
            try {
                amazonS4.mo436(putObjectRequestM410);
                this.f398.m394(transferRecord.f328, length, length, true);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (Exception e2) {
                if (TransferState.PENDING_CANCEL.equals(transferRecord.f312)) {
                    int i2 = transferRecord.f328;
                    TransferState transferState = TransferState.CANCELED;
                    transferStatusUpdater.m395(i2, transferState);
                    log.mo297("Transfer is " + transferState);
                    return Boolean.FALSE;
                }
                if (TransferState.PENDING_PAUSE.equals(transferRecord.f312)) {
                    int i3 = transferRecord.f328;
                    TransferState transferState2 = TransferState.PAUSED;
                    transferStatusUpdater.m395(i3, transferState2);
                    log.mo297("Transfer is " + transferState2);
                    new ProgressEvent(0L).m227(32);
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerM398).mo229(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
                try {
                    TransferNetworkLossHandler.m381();
                    if (!TransferNetworkLossHandler.m381().m382()) {
                        log.mo297("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                        log.mo294("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).m227(32);
                        ((TransferStatusUpdater.TransferProgressListener) progressListenerM398).mo229(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e3) {
                    log.mo291("TransferUtilityException: [" + e3 + "]");
                }
                if (RetryUtils.m433(e2)) {
                    log.mo297("Transfer is interrupted. " + e2);
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                log.mo294("Failed to upload: " + transferRecord.f328 + " due to " + e2.getMessage());
                transferStatusUpdater.m396(transferRecord.f328, e2);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
        String str = transferRecord.f323;
        TransferDBUtil transferDBUtil = this.f393;
        if (str == null || str.isEmpty()) {
            PutObjectRequest putObjectRequestM411 = m410(transferRecord);
            TransferUtility.m404(putObjectRequestM411);
            try {
                String strM411 = m411(putObjectRequestM411);
                transferRecord.f323 = strM411;
                int i4 = transferRecord.f328;
                transferDBUtil.getClass();
                TransferDBUtil.m370(i4, strM411);
            } catch (AmazonClientException e4) {
                log.mo295("Error initiating multipart upload: " + transferRecord.f328 + " due to " + e4.getMessage(), e4);
                transferStatusUpdater.m396(transferRecord.f328, e4);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            int i5 = transferRecord.f328;
            transferDBUtil.getClass();
            long jM371 = TransferDBUtil.m371(i5);
            if (jM371 > 0) {
                log.mo297(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f328), Long.valueOf(jM371)));
            }
            j = jM371;
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(j);
        this.f398.m394(transferRecord.f328, j, transferRecord.f325, false);
        int i6 = transferRecord.f328;
        String str2 = transferRecord.f323;
        transferDBUtil.getClass();
        this.f394 = TransferDBUtil.m363(i6, str2);
        log.mo297("Multipart upload " + transferRecord.f328 + " in " + this.f394.size() + " parts.");
        Iterator it = this.f394.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f395;
            if (!zHasNext) {
                break;
            }
            UploadPartRequest uploadPartRequest = (UploadPartRequest) it.next();
            TransferUtility.m404(uploadPartRequest);
            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.f399 = 0L;
            uploadPartTaskMetadata.f400 = TransferState.WAITING;
            map.put(Integer.valueOf(uploadPartRequest.m681()), uploadPartTaskMetadata);
            uploadPartTaskMetadata.f401 = TransferThreadPool.m401(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, uploadPartRequest, amazonS4, this.f393));
            it = it;
        }
        try {
            Iterator it2 = map.values().iterator();
            boolean zBooleanValue = true;
            while (it2.hasNext()) {
                zBooleanValue &= ((Boolean) ((UploadPartTaskMetadata) it2.next()).f401.get()).booleanValue();
            }
            if (!zBooleanValue) {
                try {
                    TransferNetworkLossHandler.m381();
                    if (!TransferNetworkLossHandler.m381().m382()) {
                        log.mo297("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e5) {
                    log.mo291("TransferUtilityException: [" + e5 + "]");
                }
            }
            log.mo297("Completing the multi-part upload transfer for " + transferRecord.f328);
            try {
                CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(transferRecord.f308, transferRecord.f313, transferRecord.f323, TransferDBUtil.m368(transferRecord.f328));
                TransferUtility.m404(completeMultipartUploadRequest);
                amazonS3 = amazonS4;
                try {
                    amazonS3.mo434(completeMultipartUploadRequest);
                    TransferStatusUpdater transferStatusUpdater2 = this.f398;
                    int i7 = transferRecord.f328;
                    long j2 = transferRecord.f325;
                    transferStatusUpdater2.m394(i7, j2, j2, true);
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.COMPLETED);
                    return Boolean.TRUE;
                } catch (AmazonClientException e6) {
                    e = e6;
                    AmazonClientException amazonClientException = e;
                    log.mo295("Failed to complete multipart: " + transferRecord.f328 + " due to " + amazonClientException.getMessage(), amazonClientException);
                    int i8 = transferRecord.f328;
                    String str3 = transferRecord.f308;
                    String str4 = transferRecord.f313;
                    String str5 = transferRecord.f323;
                    log.mo297("Aborting the multipart since complete multipart failed.");
                    try {
                        amazonS3.mo439(new AbortMultipartUploadRequest(str3, str4, str5));
                        log.mo294("Successfully aborted multipart upload: " + i8);
                    } catch (AmazonClientException e7) {
                        log.mo292("Failed to abort the multipart upload: " + i8, e7);
                    }
                    transferStatusUpdater.m396(transferRecord.f328, amazonClientException);
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            } catch (AmazonClientException e8) {
                e = e8;
                amazonS3 = amazonS4;
            }
        } catch (Exception e9) {
            log.mo291("Upload resulted in an exception. " + e9);
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                ((UploadPartTaskMetadata) it3.next()).f401.cancel(true);
            }
            if (TransferState.PENDING_CANCEL.equals(transferRecord.f312)) {
                int i9 = transferRecord.f328;
                TransferState transferState3 = TransferState.CANCELED;
                transferStatusUpdater.m395(i9, transferState3);
                log.mo297("Transfer is " + transferState3);
                return Boolean.FALSE;
            }
            if (TransferState.PENDING_PAUSE.equals(transferRecord.f312)) {
                int i10 = transferRecord.f328;
                TransferState transferState4 = TransferState.PAUSED;
                transferStatusUpdater.m395(i10, transferState4);
                log.mo297("Transfer is " + transferState4);
                return Boolean.FALSE;
            }
            for (UploadPartTaskMetadata uploadPartTaskMetadata2 : map.values()) {
                TransferState transferState5 = TransferState.WAITING_FOR_NETWORK;
                if (transferState5.equals(uploadPartTaskMetadata2.f400)) {
                    log.mo297("Individual part is WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m395(transferRecord.f328, transferState5);
                    return Boolean.FALSE;
                }
            }
            try {
                TransferNetworkLossHandler.m381();
                if (!TransferNetworkLossHandler.m381().m382()) {
                    log.mo297("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e10) {
                log.mo291("TransferUtilityException: [" + e10 + "]");
            }
            if (RetryUtils.m433(e9)) {
                log.mo297("Transfer is interrupted. " + e9);
                transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                return Boolean.FALSE;
            }
            log.mo295("Error encountered during multi-part upload: " + transferRecord.f328 + " due to " + e9.getMessage(), e9);
            transferStatusUpdater.m396(transferRecord.f328, e9);
            transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m411(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(putObjectRequest.m518(), putObjectRequest.m504());
        initiateMultipartUploadRequest.m580(putObjectRequest.m516());
        initiateMultipartUploadRequest.f610 = putObjectRequest.m519();
        initiateMultipartUploadRequest.m582(putObjectRequest.m505());
        initiateMultipartUploadRequest.m581(putObjectRequest.m503());
        TransferUtility.m404(initiateMultipartUploadRequest);
        return this.f396.mo435(initiateMultipartUploadRequest).m589();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PutObjectRequest m410(TransferRecord transferRecord) {
        File file = new File(transferRecord.f322);
        PutObjectRequest putObjectRequest = new PutObjectRequest(file, transferRecord.f308, transferRecord.f313);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.m616(file.length());
        String str = transferRecord.f331;
        if (str != null) {
            objectMetadata.m618(str);
        }
        String str2 = transferRecord.f317;
        if (str2 != null) {
            objectMetadata.m629(str2);
        }
        String str3 = transferRecord.f316;
        if (str3 != null) {
            objectMetadata.m638(str3);
        }
        String str4 = transferRecord.f324;
        if (str4 != null) {
            objectMetadata.m637(str4);
        } else {
            objectMetadata.m637(Mimetypes.m729().m730(file));
        }
        String str5 = transferRecord.f309;
        if (str5 != null) {
            putObjectRequest.m511(str5);
        }
        if (transferRecord.f311 != null) {
            objectMetadata.m632(new Date(Long.valueOf(transferRecord.f311).longValue()));
        }
        String str6 = transferRecord.f333;
        if (str6 != null) {
            objectMetadata.mo485(str6);
        }
        Map map = transferRecord.f318;
        if (map != null) {
            objectMetadata.m620(map);
            String str7 = (String) transferRecord.f318.get("x-amz-tagging");
            if (str7 != null) {
                try {
                    String[] strArrSplit = str7.split(a.p);
                    ArrayList arrayList = new ArrayList();
                    for (String str8 : strArrSplit) {
                        String[] strArrSplit2 = str8.split("=");
                        arrayList.add(new Tag(strArrSplit2[0], strArrSplit2[1]));
                    }
                    putObjectRequest.m500(new ObjectTagging(arrayList));
                } catch (Exception e) {
                    f391.mo295("Error in passing the object tags as request headers.", e);
                }
            }
            String str9 = (String) transferRecord.f318.get("x-amz-website-redirect-location");
            if (str9 != null) {
                putObjectRequest.m502(str9);
            }
            String str10 = (String) transferRecord.f318.get("x-amz-request-payer");
            if (str10 != null) {
                putObjectRequest.m648("requester".equals(str10));
            }
        }
        String str11 = transferRecord.f315;
        if (str11 != null) {
            objectMetadata.m625(str11);
        }
        String str12 = transferRecord.f330;
        if (str12 != null) {
            putObjectRequest.m501(new SSEAwsKeyManagementParams(str12));
        }
        putObjectRequest.m499(objectMetadata);
        String str13 = transferRecord.f327;
        putObjectRequest.m498(str13 == null ? null : (CannedAccessControlList) f392.get(str13));
        return putObjectRequest;
    }

    public class UploadTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final long f402;

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public long f403;

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final synchronized void m413(int i, long j) {
            UploadPartTaskMetadata uploadPartTaskMetadata = (UploadPartTaskMetadata) UploadTask.this.f395.get(Integer.valueOf(i));
            if (uploadPartTaskMetadata == null) {
                UploadTask.f391.mo297("Update received for unknown part. Ignoring.");
                return;
            }
            uploadPartTaskMetadata.f399 = j;
            long j2 = this.f402;
            Iterator it = UploadTask.this.f395.entrySet().iterator();
            while (it.hasNext()) {
                j2 += ((UploadPartTaskMetadata) ((Map.Entry) it.next()).getValue()).f399;
            }
            if (j2 > this.f403 && j2 <= UploadTask.this.f397.f325) {
                UploadTask.this.f398.m394(UploadTask.this.f397.f328, j2, UploadTask.this.f397.f325, true);
                this.f403 = j2;
            }
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ֫ */
        public final void mo229(ProgressEvent progressEvent) {
        }

        public UploadTaskProgressListener(long j) {
            this.f403 = j;
            this.f402 = j;
        }
    }
}
