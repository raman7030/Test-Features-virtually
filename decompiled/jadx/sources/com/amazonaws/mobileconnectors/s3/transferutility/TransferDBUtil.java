package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.aq;
import java.io.File;
import java.util.ArrayList;
import l.C12524;
import l.C4860;

/* JADX INFO: loaded from: classes.dex */
public class TransferDBUtil {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static TransferDBBase f290;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Log f289 = LogFactory.m302(TransferDBUtil.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f288 = new Object();

    public TransferDBUtil(Context context) {
        new C12524();
        synchronized (f288) {
            if (f290 == null) {
                f290 = new TransferDBBase(context);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m361(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(aq.d, Integer.valueOf(transferRecord.f328));
        contentValues.put("state", transferRecord.f312.toString());
        contentValues.put("bytes_total", Long.valueOf(transferRecord.f325));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f319));
        return f290.m357(m369(transferRecord.f328), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m365(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j));
        f290.m357(m369(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m360(int i, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        if (TransferState.FAILED.equals(transferState)) {
            return f290.m357(m369(i), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()});
        }
        return f290.m357(m369(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m370(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multipart_id", str);
        f290.m357(m369(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m367(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("etag", str);
        f290.m357(m369(i), contentValues, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Cursor m362(TransferType transferType, TransferState[] transferStateArr) {
        String string;
        String strM14172;
        String[] strArr;
        int length = transferStateArr.length;
        if (length <= 0) {
            f289.mo291("Cannot create a string of 0 or less placeholders.");
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
            strM14172 = C4860.m14172("state in (", string, MotionUtils.EASING_TYPE_FORMAT_END);
            strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = transferStateArr[i2].toString();
                i2++;
            }
        } else {
            String strM14173 = C4860.m14172("state in (", string, ") and type=?");
            String[] strArr2 = new String[length + 1];
            while (i2 < length) {
                strArr2[i2] = transferStateArr[i2].toString();
                i2++;
            }
            strArr2[i2] = transferType.toString();
            strM14172 = strM14173;
            strArr = strArr2;
        }
        TransferDBBase transferDBBase = f290;
        return transferDBBase.m358(transferDBBase.m359(), strM14172, strArr);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static TransferRecord m372(int i) throws Throwable {
        Cursor cursor = null;
        TransferRecord transferRecord = null;
        try {
            Cursor cursorM358 = f290.m358(m369(i), null, null);
            try {
                if (cursorM358.moveToFirst()) {
                    transferRecord = new TransferRecord(i);
                    transferRecord.m383(cursorM358);
                }
                cursorM358.close();
                return transferRecord;
            } catch (Throwable th) {
                th = th;
                cursor = cursorM358;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long m371(int i) {
        Cursor cursorM358 = null;
        try {
            cursorM358 = f290.m358(m366(i), null, null);
            long j = 0;
            while (cursorM358.moveToNext()) {
                if (TransferState.PART_COMPLETED.equals(TransferState.m388(cursorM358.getString(cursorM358.getColumnIndexOrThrow("state"))))) {
                    j += cursorM358.getLong(cursorM358.getColumnIndexOrThrow("bytes_total"));
                }
            }
            cursorM358.close();
            return j;
        } catch (Throwable th) {
            if (cursorM358 != null) {
                cursorM358.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m364(int i) {
        f290.m356(m369(i));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m368(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM358 = null;
        try {
            cursorM358 = f290.m358(m366(i), null, null);
            while (cursorM358.moveToNext()) {
                arrayList.add(new PartETag(cursorM358.getInt(cursorM358.getColumnIndexOrThrow("part_num")), cursorM358.getString(cursorM358.getColumnIndexOrThrow("etag"))));
            }
            cursorM358.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM358 != null) {
                cursorM358.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m363(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorM358 = null;
        try {
            cursorM358 = f290.m358(m366(i), null, null);
            while (cursorM358.moveToNext()) {
                if (!TransferState.PART_COMPLETED.equals(TransferState.m388(cursorM358.getString(cursorM358.getColumnIndexOrThrow("state"))))) {
                    UploadPartRequest uploadPartRequest = new UploadPartRequest();
                    uploadPartRequest.m674(cursorM358.getInt(cursorM358.getColumnIndexOrThrow(aq.d)));
                    cursorM358.getInt(cursorM358.getColumnIndexOrThrow("main_upload_id"));
                    uploadPartRequest.m678(cursorM358.getString(cursorM358.getColumnIndexOrThrow("bucket_name")));
                    uploadPartRequest.m683(cursorM358.getString(cursorM358.getColumnIndexOrThrow("key")));
                    uploadPartRequest.m688(str);
                    uploadPartRequest.m676(new File(cursorM358.getString(cursorM358.getColumnIndexOrThrow("file"))));
                    uploadPartRequest.m675(cursorM358.getLong(cursorM358.getColumnIndexOrThrow("file_offset")));
                    uploadPartRequest.m687(cursorM358.getInt(cursorM358.getColumnIndexOrThrow("part_num")));
                    uploadPartRequest.m682(cursorM358.getLong(cursorM358.getColumnIndexOrThrow("bytes_total")));
                    cursorM358.getInt(cursorM358.getColumnIndexOrThrow("is_last_part"));
                    arrayList.add(uploadPartRequest);
                }
            }
            cursorM358.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursorM358 != null) {
                cursorM358.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Uri m369(int i) {
        return Uri.parse(f290.m359() + "/" + i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m366(int i) {
        return Uri.parse(f290.m359() + "/part/" + i);
    }
}
