package com.amazonaws.mobileconnectors.p060s3.transferutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.AmazonS3;
import com.umeng.analytics.pro.C0659aq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TransferNetworkLossHandler extends BroadcastReceiver {

    /* JADX INFO: renamed from: ܿ */
    public static TransferNetworkLossHandler f1459;

    /* JADX INFO: renamed from: ᩳ */
    public static final Log f1460 = LogFactory.m1468(TransferNetworkLossHandler.class);

    /* JADX INFO: renamed from: ֫ */
    public final ConnectivityManager f1461;

    /* JADX INFO: renamed from: ۧ */
    public TransferDBUtil f1462;

    /* JADX INFO: renamed from: ܽ */
    public TransferStatusUpdater f1463;

    public TransferNetworkLossHandler(Context context) {
        this.f1461 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f1462 = new TransferDBUtil(context);
        this.f1463 = TransferStatusUpdater.m1556(context);
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized TransferNetworkLossHandler m1545(Context context) {
        if (f1459 == null) {
            f1459 = new TransferNetworkLossHandler(context);
        }
        return f1459;
    }

    /* JADX INFO: renamed from: ۧ */
    public static synchronized TransferNetworkLossHandler m1547() {
        TransferNetworkLossHandler transferNetworkLossHandler;
        transferNetworkLossHandler = f1459;
        if (transferNetworkLossHandler == null) {
            f1460.mo1457("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            throw new TransferUtilityException("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
        }
        return transferNetworkLossHandler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Log log = f1460;
            log.mo1463("Network connectivity changed detected.");
            log.mo1463("Network connected: " + m1548());
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (TransferNetworkLossHandler.this.m1548()) {
                        TransferNetworkLossHandler.m1546(TransferNetworkLossHandler.this);
                        return;
                    }
                    TransferNetworkLossHandler transferNetworkLossHandler = TransferNetworkLossHandler.this;
                    synchronized (transferNetworkLossHandler) {
                        for (TransferRecord transferRecord : transferNetworkLossHandler.f1463.m1559().values()) {
                            if (S3ClientReference.m1519(Integer.valueOf(transferRecord.f1488)) != null && transferRecord.m1553(transferNetworkLossHandler.f1463, transferNetworkLossHandler.f1461)) {
                                transferNetworkLossHandler.f1463.m1561(transferRecord.f1488, TransferState.WAITING_FOR_NETWORK);
                            }
                        }
                    }
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1548() {
        NetworkInfo activeNetworkInfo = this.f1461.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1546(TransferNetworkLossHandler transferNetworkLossHandler) {
        TransferRecord transferRecordM1558;
        synchronized (transferNetworkLossHandler) {
            int i = 0;
            TransferState[] transferStateArr = {TransferState.WAITING_FOR_NETWORK};
            f1460.mo1460("Loading transfers from database...");
            ArrayList<Integer> arrayList = new ArrayList();
            Cursor cursorM1528 = null;
            try {
                TransferDBUtil transferDBUtil = transferNetworkLossHandler.f1462;
                TransferType transferType = TransferType.ANY;
                transferDBUtil.getClass();
                cursorM1528 = TransferDBUtil.m1528(transferType, transferStateArr);
                while (cursorM1528.moveToNext()) {
                    int i2 = cursorM1528.getInt(cursorM1528.getColumnIndexOrThrow(C0659aq.f2425d));
                    if (transferNetworkLossHandler.f1463.m1558(i2) == null) {
                        TransferRecord transferRecord = new TransferRecord(i2);
                        transferRecord.m1549(cursorM1528);
                        transferNetworkLossHandler.f1463.m1563(transferRecord);
                        i++;
                    }
                    arrayList.add(Integer.valueOf(i2));
                }
                f1460.mo1460("Closing the cursor for resumeAllTransfers");
                cursorM1528.close();
                try {
                    for (Integer num : arrayList) {
                        AmazonS3 amazonS3M1519 = S3ClientReference.m1519(num);
                        if (amazonS3M1519 != null && (transferRecordM1558 = transferNetworkLossHandler.f1463.m1558(num.intValue())) != null && !transferRecordM1558.m1551()) {
                            transferRecordM1558.m1550(amazonS3M1519, transferNetworkLossHandler.f1462, transferNetworkLossHandler.f1463, transferNetworkLossHandler.f1461);
                        }
                    }
                } catch (Exception e) {
                    f1460.mo1457("Error in resuming the transfers." + e.getMessage());
                }
                f1460.mo1460(i + " transfers are loaded from database.");
            } catch (Throwable th) {
                if (cursorM1528 != null) {
                    f1460.mo1460("Closing the cursor for resumeAllTransfers");
                    cursorM1528.close();
                }
                throw th;
            }
        }
    }
}
