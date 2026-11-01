package com.amazonaws.mobileconnectors.p060s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.model.PartETag;
import com.amazonaws.services.p061s3.model.UploadPartRequest;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0659aq;
import java.io.File;
import java.util.ArrayList;
import p067l.C14271;
import p067l.C6988;

/* JADX INFO: loaded from: classes.dex */
public class TransferDBUtil {

    /* JADX INFO: renamed from: ܽ */
    public static TransferDBBase f1450;

    /* JADX INFO: renamed from: ۧ */
    public static final Log f1449 = LogFactory.m1468(TransferDBUtil.class);

    /* JADX INFO: renamed from: ֫ */
    public static final Object f1448 = new Object();

    public TransferDBUtil(Context context) {
        new C14271();
        synchronized (f1448) {
            if (f1450 == null) {
                f1450 = new TransferDBBase(context);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m1527(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0659aq.f2425d, Integer.valueOf(transferRecord.f1488));
        contentValues.put("state", transferRecord.f1472.toString());
        contentValues.put("bytes_total", Long.valueOf(transferRecord.f1485));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f1479));
        return f1450.m1523(m1535(transferRecord.f1488), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1531(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j));
        f1450.m1523(m1535(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m1526(int i, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        if (TransferState.FAILED.equals(transferState)) {
            return f1450.m1523(m1535(i), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()});
        }
        return f1450.m1523(m1535(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m1536(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multipart_id", str);
        f1450.m1523(m1535(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1533(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("etag", str);
        f1450.m1523(m1535(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Cursor m1528(TransferType transferType, TransferState[] transferStateArr) {
        String string;
        String strM16053;
        String[] strArr;
        int length = transferStateArr.length;
        if (length <= 0) {
            f1449.mo1457("Cannot create a string of 0 or less placeholders.");
            string = null;
        } else {
            StringBuilder sb = new StringBuilder((length * 2) - 1);
            sb.append("?");
            for (int i = 1; i < length; i++) {
                sb.append(",?");
            }
            string = sb.toString();
        }
        int i2 = 0;
        if (transferType == TransferType.ANY) {
            strM16053 = C6988.m16053("state in (", string, MotionUtils.EASING_TYPE_FORMAT_END);
            strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = transferStateArr[i2].toString();
                i2++;
            }
        } else {
            String strM16054 = C6988.m16053("state in (", string, ") and type=?");
            String[] strArr2 = new String[length + 1];
            while (i2 < length) {
                strArr2[i2] = transferStateArr[i2].toString();
                i2++;
            }
            strArr2[i2] = transferType.toString();
            strM16053 = strM16054;
            strArr = strArr2;
        }
        TransferDBBase transferDBBase = f1450;
        return transferDBBase.m1524(transferDBBase.m1525(), strM16053, strArr);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static TransferRecord m1538(int i) throws Throwable {
        Cursor cursor = null;
        TransferRecord transferRecord = null;
        try {
            Cursor cursorM1524 = f1450.m1524(m1535(i), null, null);
            try {
                if (cursorM1524.moveToFirst()) {
                    transferRecord = new TransferRecord(i);
                    transferRecord.m1549(cursorM1524);
                }
                cursorM1524.close();
                return transferRecord;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM1524;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static long m1537(int i) {
        Cursor cursorM1524 = null;
        try {
            cursorM1524 = f1450.m1524(m1532(i), null, null);
            long j = 0;
            while (cursorM1524.moveToNext()) {
                if (TransferState.PART_COMPLETED.equals(TransferState.m1554(cursorM1524.getString(cursorM1524.getColumnIndexOrThrow("state"))))) {
                    j += cursorM1524.getLong(cursorM1524.getColumnIndexOrThrow("bytes_total"));
                }
            }
            cursorM1524.close();
            return j;
        } catch (Throwable th) {
            if (cursorM1524 != null) {
                cursorM1524.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1530(int i) {
        f1450.m1522(m1535(i));
    }

    /* JADX INFO: renamed from: ܳ */
    public static ArrayList m1534(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM1524 = null;
        try {
            cursorM1524 = f1450.m1524(m1532(i), null, null);
            while (cursorM1524.moveToNext()) {
                arrayList.add(new PartETag(cursorM1524.getInt(cursorM1524.getColumnIndexOrThrow("part_num")), cursorM1524.getString(cursorM1524.getColumnIndexOrThrow("etag"))));
            }
            cursorM1524.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM1524 != null) {
                cursorM1524.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m1529(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM1524 = null;
        try {
            cursorM1524 = f1450.m1524(m1532(i), null, null);
            while (cursorM1524.moveToNext()) {
                if (!TransferState.PART_COMPLETED.equals(TransferState.m1554(cursorM1524.getString(cursorM1524.getColumnIndexOrThrow("state"))))) {
                    UploadPartRequest uploadPartRequest = new UploadPartRequest();
                    uploadPartRequest.m1839(cursorM1524.getInt(cursorM1524.getColumnIndexOrThrow(C0659aq.f2425d)));
                    cursorM1524.getInt(cursorM1524.getColumnIndexOrThrow("main_upload_id"));
                    uploadPartRequest.m1843(cursorM1524.getString(cursorM1524.getColumnIndexOrThrow("bucket_name")));
                    uploadPartRequest.m1848(cursorM1524.getString(cursorM1524.getColumnIndexOrThrow("key")));
                    uploadPartRequest.m1853(str);
                    uploadPartRequest.m1841(new File(cursorM1524.getString(cursorM1524.getColumnIndexOrThrow("file"))));
                    uploadPartRequest.m1840(cursorM1524.getLong(cursorM1524.getColumnIndexOrThrow("file_offset")));
                    uploadPartRequest.m1852(cursorM1524.getInt(cursorM1524.getColumnIndexOrThrow("part_num")));
                    uploadPartRequest.m1847(cursorM1524.getLong(cursorM1524.getColumnIndexOrThrow("bytes_total")));
                    cursorM1524.getInt(cursorM1524.getColumnIndexOrThrow("is_last_part"));
                    arrayList.add(uploadPartRequest);
                }
            }
            cursorM1524.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM1524 != null) {
                cursorM1524.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static Uri m1535(int i) {
        return Uri.parse(f1450.m1525() + "/" + i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Uri m1532(int i) {
        return Uri.parse(f1450.m1525() + "/part/" + i);
    }
}
