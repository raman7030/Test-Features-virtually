package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.p061s3.AmazonS3;
import com.amazonaws.services.p061s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.CannedAccessControlList;
import com.amazonaws.services.p061s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.p061s3.model.ObjectMetadata;
import com.amazonaws.services.p061s3.model.ObjectTagging;
import com.amazonaws.services.p061s3.model.PutObjectRequest;
import com.amazonaws.services.p061s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.p061s3.model.Tag;
import com.amazonaws.services.p061s3.model.UploadPartRequest;
import com.amazonaws.services.p061s3.util.Mimetypes;
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

    /* JADX INFO: renamed from: ۜ */
    public static final Log f1551 = LogFactory.m1468(UploadTask.class);

    /* JADX INFO: renamed from: ᩻ */
    public static final HashMap f1552 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final TransferDBUtil f1553;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f1554;

    /* JADX INFO: renamed from: ܳ */
    public HashMap f1555 = new HashMap();

    /* JADX INFO: renamed from: ܽ */
    public final AmazonS3 f1556;

    /* JADX INFO: renamed from: ܿ */
    public final TransferRecord f1557;

    /* JADX INFO: renamed from: ᩳ */
    public final TransferStatusUpdater f1558;

    public class UploadPartTaskMetadata {

        /* JADX INFO: renamed from: ֫ */
        public long f1559;

        /* JADX INFO: renamed from: ۧ */
        public TransferState f1560;

        /* JADX INFO: renamed from: ܽ */
        public Future f1561;
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f1552.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f1557 = transferRecord;
        this.f1556 = amazonS3;
        this.f1553 = transferDBUtil;
        this.f1558 = transferStatusUpdater;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map;
        AmazonS3 amazonS3;
        TransferRecord transferRecord = this.f1557;
        TransferStatusUpdater transferStatusUpdater = this.f1558;
        Log log = f1551;
        try {
            TransferNetworkLossHandler.m1547();
            if (!TransferNetworkLossHandler.m1547().m1548()) {
                log.mo1463("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                transferStatusUpdater.m1561(transferRecord.f1488, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.mo1457("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.m1561(transferRecord.f1488, TransferState.IN_PROGRESS);
        int i = transferRecord.f1466;
        long j = 0;
        AmazonS3 amazonS4 = this.f1556;
        if (i != 1 || transferRecord.f1492 != 0) {
            if (i != 0) {
                return Boolean.FALSE;
            }
            PutObjectRequest putObjectRequestM1576 = m1576(transferRecord);
            ProgressListener progressListenerM1564 = transferStatusUpdater.m1564(transferRecord.f1488);
            long length = putObjectRequestM1576.m1679().length();
            TransferUtility.m1571(putObjectRequestM1576);
            putObjectRequestM1576.mo1326(progressListenerM1564);
            try {
                amazonS4.mo1602(putObjectRequestM1576);
                this.f1558.m1560(transferRecord.f1488, length, length, true);
                transferStatusUpdater.m1561(transferRecord.f1488, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (Exception e2) {
                if (TransferState.PENDING_CANCEL.equals(transferRecord.f1472)) {
                    int i2 = transferRecord.f1488;
                    TransferState transferState = TransferState.CANCELED;
                    transferStatusUpdater.m1561(i2, transferState);
                    log.mo1463("Transfer is " + transferState);
                    return Boolean.FALSE;
                }
                if (TransferState.PENDING_PAUSE.equals(transferRecord.f1472)) {
                    int i3 = transferRecord.f1488;
                    TransferState transferState2 = TransferState.PAUSED;
                    transferStatusUpdater.m1561(i3, transferState2);
                    log.mo1463("Transfer is " + transferState2);
                    new ProgressEvent(0L).m1393(32);
                    ((TransferStatusUpdater.TransferProgressListener) progressListenerM1564).mo1395(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
                try {
                    TransferNetworkLossHandler.m1547();
                    if (!TransferNetworkLossHandler.m1547().m1548()) {
                        log.mo1463("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        transferStatusUpdater.m1561(transferRecord.f1488, TransferState.WAITING_FOR_NETWORK);
                        log.mo1460("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).m1393(32);
                        ((TransferStatusUpdater.TransferProgressListener) progressListenerM1564).mo1395(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e3) {
                    log.mo1457("TransferUtilityException: [" + e3 + "]");
                }
                if (RetryUtils.m1599(e2)) {
                    log.mo1463("Transfer is interrupted. " + e2);
                    transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                log.mo1460("Failed to upload: " + transferRecord.f1488 + " due to " + e2.getMessage());
                transferStatusUpdater.m1562(transferRecord.f1488, e2);
                transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
        String str = transferRecord.f1483;
        TransferDBUtil transferDBUtil = this.f1553;
        if (str == null || str.isEmpty()) {
            PutObjectRequest putObjectRequestM1577 = m1576(transferRecord);
            TransferUtility.m1570(putObjectRequestM1577);
            try {
                String strM1577 = m1577(putObjectRequestM1577);
                transferRecord.f1483 = strM1577;
                int i4 = transferRecord.f1488;
                transferDBUtil.getClass();
                TransferDBUtil.m1536(i4, strM1577);
            } catch (AmazonClientException e4) {
                log.mo1461("Error initiating multipart upload: " + transferRecord.f1488 + " due to " + e4.getMessage(), e4);
                transferStatusUpdater.m1562(transferRecord.f1488, e4);
                transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } else {
            int i5 = transferRecord.f1488;
            transferDBUtil.getClass();
            long jM1537 = TransferDBUtil.m1537(i5);
            if (jM1537 > 0) {
                log.mo1463(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f1488), Long.valueOf(jM1537)));
            }
            j = jM1537;
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(j);
        this.f1558.m1560(transferRecord.f1488, j, transferRecord.f1485, false);
        int i6 = transferRecord.f1488;
        String str2 = transferRecord.f1483;
        transferDBUtil.getClass();
        this.f1554 = TransferDBUtil.m1529(i6, str2);
        log.mo1463("Multipart upload " + transferRecord.f1488 + " in " + this.f1554.size() + " parts.");
        Iterator it = this.f1554.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f1555;
            if (!zHasNext) {
                break;
            }
            UploadPartRequest uploadPartRequest = (UploadPartRequest) it.next();
            TransferUtility.m1570(uploadPartRequest);
            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.f1559 = 0L;
            uploadPartTaskMetadata.f1560 = TransferState.WAITING;
            map.put(Integer.valueOf(uploadPartRequest.m1846()), uploadPartTaskMetadata);
            uploadPartTaskMetadata.f1561 = TransferThreadPool.m1567(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, uploadPartRequest, amazonS4, this.f1553));
            it = it;
        }
        try {
            Iterator it2 = map.values().iterator();
            boolean zBooleanValue = true;
            while (it2.hasNext()) {
                zBooleanValue &= ((Boolean) ((UploadPartTaskMetadata) it2.next()).f1561.get()).booleanValue();
            }
            if (!zBooleanValue) {
                try {
                    TransferNetworkLossHandler.m1547();
                    if (!TransferNetworkLossHandler.m1547().m1548()) {
                        log.mo1463("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        transferStatusUpdater.m1561(transferRecord.f1488, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e5) {
                    log.mo1457("TransferUtilityException: [" + e5 + "]");
                }
            }
            log.mo1463("Completing the multi-part upload transfer for " + transferRecord.f1488);
            try {
                CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(transferRecord.f1468, transferRecord.f1473, transferRecord.f1483, TransferDBUtil.m1534(transferRecord.f1488));
                TransferUtility.m1570(completeMultipartUploadRequest);
                amazonS3 = amazonS4;
                try {
                    amazonS3.mo1600(completeMultipartUploadRequest);
                    TransferStatusUpdater transferStatusUpdater2 = this.f1558;
                    int i7 = transferRecord.f1488;
                    long j2 = transferRecord.f1485;
                    transferStatusUpdater2.m1560(i7, j2, j2, true);
                    transferStatusUpdater.m1561(transferRecord.f1488, TransferState.COMPLETED);
                    return Boolean.TRUE;
                } catch (AmazonClientException e6) {
                    e = e6;
                    AmazonClientException amazonClientException = e;
                    log.mo1461("Failed to complete multipart: " + transferRecord.f1488 + " due to " + amazonClientException.getMessage(), amazonClientException);
                    int i8 = transferRecord.f1488;
                    String str3 = transferRecord.f1468;
                    String str4 = transferRecord.f1473;
                    String str5 = transferRecord.f1483;
                    log.mo1463("Aborting the multipart since complete multipart failed.");
                    try {
                        amazonS3.mo1605(new AbortMultipartUploadRequest(str3, str4, str5));
                        log.mo1460("Successfully aborted multipart upload: " + i8);
                    } catch (AmazonClientException e7) {
                        log.mo1458("Failed to abort the multipart upload: " + i8, e7);
                    }
                    transferStatusUpdater.m1562(transferRecord.f1488, amazonClientException);
                    transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            } catch (AmazonClientException e8) {
                e = e8;
                amazonS3 = amazonS4;
            }
        } catch (Exception e9) {
            log.mo1457("Upload resulted in an exception. " + e9);
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                ((UploadPartTaskMetadata) it3.next()).f1561.cancel(true);
            }
            if (TransferState.PENDING_CANCEL.equals(transferRecord.f1472)) {
                int i9 = transferRecord.f1488;
                TransferState transferState3 = TransferState.CANCELED;
                transferStatusUpdater.m1561(i9, transferState3);
                log.mo1463("Transfer is " + transferState3);
                return Boolean.FALSE;
            }
            if (TransferState.PENDING_PAUSE.equals(transferRecord.f1472)) {
                int i10 = transferRecord.f1488;
                TransferState transferState4 = TransferState.PAUSED;
                transferStatusUpdater.m1561(i10, transferState4);
                log.mo1463("Transfer is " + transferState4);
                return Boolean.FALSE;
            }
            for (UploadPartTaskMetadata uploadPartTaskMetadata2 : map.values()) {
                TransferState transferState5 = TransferState.WAITING_FOR_NETWORK;
                if (transferState5.equals(uploadPartTaskMetadata2.f1560)) {
                    log.mo1463("Individual part is WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m1561(transferRecord.f1488, transferState5);
                    return Boolean.FALSE;
                }
            }
            try {
                TransferNetworkLossHandler.m1547();
                if (!TransferNetworkLossHandler.m1547().m1548()) {
                    log.mo1463("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                    transferStatusUpdater.m1561(transferRecord.f1488, TransferState.WAITING_FOR_NETWORK);
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e10) {
                log.mo1457("TransferUtilityException: [" + e10 + "]");
            }
            if (RetryUtils.m1599(e9)) {
                log.mo1463("Transfer is interrupted. " + e9);
                transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                return Boolean.FALSE;
            }
            log.mo1461("Error encountered during multi-part upload: " + transferRecord.f1488 + " due to " + e9.getMessage(), e9);
            transferStatusUpdater.m1562(transferRecord.f1488, e9);
            transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m1577(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(putObjectRequest.m1684(), putObjectRequest.m1670());
        initiateMultipartUploadRequest.m1746(putObjectRequest.m1682());
        initiateMultipartUploadRequest.f1770 = putObjectRequest.m1685();
        initiateMultipartUploadRequest.m1748(putObjectRequest.m1671());
        initiateMultipartUploadRequest.m1747(putObjectRequest.m1669());
        TransferUtility.m1570(initiateMultipartUploadRequest);
        return this.f1556.mo1601(initiateMultipartUploadRequest).m1755();
    }

    /* JADX INFO: renamed from: ֫ */
    public static PutObjectRequest m1576(TransferRecord transferRecord) {
        File file = new File(transferRecord.f1482);
        PutObjectRequest putObjectRequest = new PutObjectRequest(file, transferRecord.f1468, transferRecord.f1473);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.m1782(file.length());
        String str = transferRecord.f1491;
        if (str != null) {
            objectMetadata.m1784(str);
        }
        String str2 = transferRecord.f1477;
        if (str2 != null) {
            objectMetadata.m1795(str2);
        }
        String str3 = transferRecord.f1476;
        if (str3 != null) {
            objectMetadata.m1804(str3);
        }
        String str4 = transferRecord.f1484;
        if (str4 != null) {
            objectMetadata.m1803(str4);
        } else {
            objectMetadata.m1803(Mimetypes.m1894().m1895(file));
        }
        String str5 = transferRecord.f1469;
        if (str5 != null) {
            putObjectRequest.m1677(str5);
        }
        if (transferRecord.f1471 != null) {
            objectMetadata.m1798(new Date(Long.valueOf(transferRecord.f1471).longValue()));
        }
        String str6 = transferRecord.f1493;
        if (str6 != null) {
            objectMetadata.mo1651(str6);
        }
        Map map = transferRecord.f1478;
        if (map != null) {
            objectMetadata.m1786(map);
            String str7 = (String) transferRecord.f1478.get("x-amz-tagging");
            if (str7 != null) {
                try {
                    String[] strArrSplit = str7.split(C0233a.f1084p);
                    ArrayList arrayList = new ArrayList();
                    for (String str8 : strArrSplit) {
                        String[] strArrSplit2 = str8.split("=");
                        arrayList.add(new Tag(strArrSplit2[0], strArrSplit2[1]));
                    }
                    putObjectRequest.m1666(new ObjectTagging(arrayList));
                } catch (Exception e) {
                    f1551.mo1461("Error in passing the object tags as request headers.", e);
                }
            }
            String str9 = (String) transferRecord.f1478.get("x-amz-website-redirect-location");
            if (str9 != null) {
                putObjectRequest.m1668(str9);
            }
            String str10 = (String) transferRecord.f1478.get("x-amz-request-payer");
            if (str10 != null) {
                putObjectRequest.m1813("requester".equals(str10));
            }
        }
        String str11 = transferRecord.f1475;
        if (str11 != null) {
            objectMetadata.m1791(str11);
        }
        String str12 = transferRecord.f1490;
        if (str12 != null) {
            putObjectRequest.m1667(new SSEAwsKeyManagementParams(str12));
        }
        putObjectRequest.m1665(objectMetadata);
        String str13 = transferRecord.f1487;
        putObjectRequest.m1664(str13 == null ? null : (CannedAccessControlList) f1552.get(str13));
        return putObjectRequest;
    }

    public class UploadTaskProgressListener implements ProgressListener {

        /* JADX INFO: renamed from: ֫ */
        public final long f1562;

        /* JADX INFO: renamed from: ۧ */
        public long f1563;

        /* JADX INFO: renamed from: ֫ */
        public final synchronized void m1579(int i, long j) {
            UploadPartTaskMetadata uploadPartTaskMetadata = (UploadPartTaskMetadata) UploadTask.this.f1555.get(Integer.valueOf(i));
            if (uploadPartTaskMetadata == null) {
                UploadTask.f1551.mo1463("Update received for unknown part. Ignoring.");
                return;
            }
            uploadPartTaskMetadata.f1559 = j;
            long j2 = this.f1562;
            Iterator it = UploadTask.this.f1555.entrySet().iterator();
            while (it.hasNext()) {
                j2 += ((UploadPartTaskMetadata) ((Map.Entry) it.next()).getValue()).f1559;
            }
            if (j2 > this.f1563 && j2 <= UploadTask.this.f1557.f1485) {
                UploadTask.this.f1558.m1560(UploadTask.this.f1557.f1488, j2, UploadTask.this.f1557.f1485, true);
                this.f1563 = j2;
            }
        }

        @Override // com.amazonaws.event.ProgressListener
        /* JADX INFO: renamed from: ֫ */
        public final void mo1395(ProgressEvent progressEvent) {
        }

        public UploadTaskProgressListener(long j) {
            this.f1563 = j;
            this.f1562 = j;
        }
    }
}
