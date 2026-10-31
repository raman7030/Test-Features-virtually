package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.umeng.analytics.pro.aq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class TransferNetworkLossHandler extends BroadcastReceiver {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static TransferNetworkLossHandler f299;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Log f300 = LogFactory.m302(TransferNetworkLossHandler.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ConnectivityManager f301;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TransferDBUtil f302;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public TransferStatusUpdater f303;

    public TransferNetworkLossHandler(Context context) {
        this.f301 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f302 = new TransferDBUtil(context);
        this.f303 = TransferStatusUpdater.m390(context);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized TransferNetworkLossHandler m379(Context context) {
        if (f299 == null) {
            f299 = new TransferNetworkLossHandler(context);
        }
        return f299;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized TransferNetworkLossHandler m381() {
        TransferNetworkLossHandler transferNetworkLossHandler;
        transferNetworkLossHandler = f299;
        if (transferNetworkLossHandler == null) {
            f300.mo291("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
            throw new TransferUtilityException("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
        }
        return transferNetworkLossHandler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Log log = f300;
            log.mo297("Network connectivity changed detected.");
            log.mo297("Network connected: " + m382());
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (TransferNetworkLossHandler.this.m382()) {
                        TransferNetworkLossHandler.m380(TransferNetworkLossHandler.this);
                        return;
                    }
                    TransferNetworkLossHandler transferNetworkLossHandler = TransferNetworkLossHandler.this;
                    synchronized (transferNetworkLossHandler) {
                        for (TransferRecord transferRecord : transferNetworkLossHandler.f303.m393().values()) {
                            if (S3ClientReference.m353(Integer.valueOf(transferRecord.f328)) != null && transferRecord.m387(transferNetworkLossHandler.f303, transferNetworkLossHandler.f301)) {
                                transferNetworkLossHandler.f303.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                            }
                        }
                    }
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m382() {
        NetworkInfo activeNetworkInfo = this.f301.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m380(TransferNetworkLossHandler transferNetworkLossHandler) {
        TransferRecord transferRecordM392;
        synchronized (transferNetworkLossHandler) {
            try {
                int i = 0;
                TransferState[] transferStateArr = {TransferState.WAITING_FOR_NETWORK};
                f300.mo294("Loading transfers from database...");
                ArrayList<Integer> arrayList = new ArrayList();
                Cursor cursorM362 = null;
                try {
                    TransferDBUtil transferDBUtil = transferNetworkLossHandler.f302;
                    TransferType transferType = TransferType.ANY;
                    transferDBUtil.getClass();
                    cursorM362 = TransferDBUtil.m362(transferType, transferStateArr);
                    while (cursorM362.moveToNext()) {
                        int i2 = cursorM362.getInt(cursorM362.getColumnIndexOrThrow(aq.d));
                        if (transferNetworkLossHandler.f303.m392(i2) == null) {
                            TransferRecord transferRecord = new TransferRecord(i2);
                            transferRecord.m383(cursorM362);
                            transferNetworkLossHandler.f303.m397(transferRecord);
                            i++;
                        }
                        arrayList.add(Integer.valueOf(i2));
                    }
                    f300.mo294("Closing the cursor for resumeAllTransfers");
                    cursorM362.close();
                    try {
                        for (Integer num : arrayList) {
                            AmazonS3 amazonS3M353 = S3ClientReference.m353(num);
                            if (amazonS3M353 != null && (transferRecordM392 = transferNetworkLossHandler.f303.m392(num.intValue())) != null && !transferRecordM392.m385()) {
                                transferRecordM392.m384(amazonS3M353, transferNetworkLossHandler.f302, transferNetworkLossHandler.f303, transferNetworkLossHandler.f301);
                            }
                        }
                    } catch (Exception e) {
                        f300.mo291("Error in resuming the transfers." + e.getMessage());
                    }
                    f300.mo294(i + " transfers are loaded from database.");
                } catch (Throwable th) {
                    if (cursorM362 != null) {
                        f300.mo294("Closing the cursor for resumeAllTransfers");
                        cursorM362.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
