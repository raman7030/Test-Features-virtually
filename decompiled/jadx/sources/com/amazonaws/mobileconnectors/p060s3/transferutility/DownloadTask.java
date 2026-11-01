package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.p061s3.AmazonS3;
import com.amazonaws.services.p061s3.model.GetObjectRequest;
import com.amazonaws.services.p061s3.model.S3Object;
import com.amazonaws.services.p061s3.model.S3ObjectInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class DownloadTask implements Callable {

    /* JADX INFO: renamed from: ᩳ */
    public static final Log f1437 = LogFactory.m1468(DownloadTask.class);

    /* JADX INFO: renamed from: ֫ */
    public final TransferRecord f1438;

    /* JADX INFO: renamed from: ۧ */
    public final AmazonS3 f1439;

    /* JADX INFO: renamed from: ܽ */
    public final TransferStatusUpdater f1440;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.f1438 = transferRecord;
        this.f1439 = amazonS3;
        this.f1440 = transferStatusUpdater;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        Log log = f1437;
        TransferStatusUpdater transferStatusUpdater = this.f1440;
        TransferRecord transferRecord = this.f1438;
        try {
            TransferNetworkLossHandler.m1547();
            if (!TransferNetworkLossHandler.m1547().m1548()) {
                log.mo1463("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                transferStatusUpdater.m1561(transferRecord.f1488, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.mo1457("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.m1561(transferRecord.f1488, TransferState.IN_PROGRESS);
        ProgressListener progressListenerM1564 = transferStatusUpdater.m1564(transferRecord.f1488);
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.f1468, transferRecord.f1473);
            TransferUtility.m1571(getObjectRequest);
            File file = new File(transferRecord.f1482);
            long length = file.length();
            if (length > 0) {
                try {
                    log.mo1460(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f1488), Long.valueOf(length)));
                    getObjectRequest.m1734(length, -1L);
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    if (TransferState.PENDING_CANCEL.equals(transferRecord.f1472)) {
                        int i = transferRecord.f1488;
                        TransferState transferState = TransferState.CANCELED;
                        transferStatusUpdater.m1561(i, transferState);
                        log.mo1463("Transfer is " + transferState);
                        return Boolean.FALSE;
                    }
                    if (TransferState.PENDING_PAUSE.equals(transferRecord.f1472)) {
                        int i2 = transferRecord.f1488;
                        TransferState transferState2 = TransferState.PAUSED;
                        transferStatusUpdater.m1561(i2, transferState2);
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
                    if (RetryUtils.m1599(exc)) {
                        log.mo1463("Transfer is interrupted. " + exc);
                        transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                        return Boolean.FALSE;
                    }
                    log.mo1460("Failed to download: " + transferRecord.f1488 + " due to " + exc.getMessage());
                    transferStatusUpdater.m1562(transferRecord.f1488, exc);
                    transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            }
            getObjectRequest.mo1326(progressListenerM1564);
            S3Object s3ObjectMo1603 = this.f1439.mo1603(getObjectRequest);
            if (s3ObjectMo1603 == null) {
                transferStatusUpdater.m1562(transferRecord.f1488, new IllegalStateException("AmazonS3.getObject returns null"));
                transferStatusUpdater.m1561(transferRecord.f1488, TransferState.FAILED);
                return Boolean.FALSE;
            }
            long jM1802 = s3ObjectMo1603.m1819().m1802();
            this.f1440.m1560(transferRecord.f1488, length, jM1802, true);
            m1518(s3ObjectMo1603.m1815(), file);
            this.f1440.m1560(transferRecord.f1488, jM1802, jM1802, true);
            transferStatusUpdater.m1561(transferRecord.f1488, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1518(S3ObjectInputStream s3ObjectInputStream, File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        Log log = f1437;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, file.length() > 0));
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = s3ObjectInputStream.read(bArr);
                        if (i != -1) {
                            bufferedOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                log.mo1464("got exception", e);
                            }
                        }
                    }
                    bufferedOutputStream.close();
                    try {
                        s3ObjectInputStream.close();
                    } catch (IOException e2) {
                        log.mo1464("got exception", e2);
                    }
                } catch (SocketTimeoutException e3) {
                    e = e3;
                    String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
                    log.mo1457(str);
                    throw new AmazonClientException(str, e);
                } catch (IOException e4) {
                    e = e4;
                    throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
                } catch (Throwable th) {
                    th = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e5) {
                            log.mo1464("got exception", e5);
                        }
                    }
                    if (s3ObjectInputStream != null) {
                        try {
                            s3ObjectInputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            log.mo1464("got exception", e6);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (SocketTimeoutException e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        }
    }
}
