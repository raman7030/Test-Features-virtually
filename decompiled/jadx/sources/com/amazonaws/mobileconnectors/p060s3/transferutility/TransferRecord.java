package com.amazonaws.mobileconnectors.p060s3.transferutility;

import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.AmazonS3;
import com.amazonaws.util.json.JsonUtils;
import com.umeng.analytics.pro.C0659aq;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Future;
import p067l.C10965;
import p067l.C14271;
import p067l.C15611;
import p067l.C16322;
import p067l.C20998;
import p067l.C9577;

/* JADX INFO: loaded from: classes.dex */
public class TransferRecord {

    /* JADX INFO: renamed from: ۛ */
    public static final Log f1465 = LogFactory.m1468(TransferRecord.class);

    /* JADX INFO: renamed from: ֡ */
    public int f1466;

    /* JADX INFO: renamed from: ֨ */
    public int f1467;

    /* JADX INFO: renamed from: ֫ */
    public String f1468;

    /* JADX INFO: renamed from: ۖ */
    public String f1469;

    /* JADX INFO: renamed from: ۗ */
    public Future f1470;

    /* JADX INFO: renamed from: ۘ */
    public String f1471;

    /* JADX INFO: renamed from: ۙ */
    public TransferState f1472;

    /* JADX INFO: renamed from: ۚ */
    public String f1473;

    /* JADX INFO: renamed from: ۜ */
    public C14271 f1474 = new C14271();

    /* JADX INFO: renamed from: ۠ */
    public String f1475;

    /* JADX INFO: renamed from: ۡ */
    public String f1476;

    /* JADX INFO: renamed from: ۢ */
    public String f1477;

    /* JADX INFO: renamed from: ۤ */
    public Map f1478;

    /* JADX INFO: renamed from: ۧ */
    public long f1479;

    /* JADX INFO: renamed from: ۫ */
    public TransferType f1480;

    /* JADX INFO: renamed from: ۬ */
    public TransferUtilityOptions f1481;

    /* JADX INFO: renamed from: ܳ */
    public String f1482;

    /* JADX INFO: renamed from: ܶ */
    public String f1483;

    /* JADX INFO: renamed from: ܺ */
    public String f1484;

    /* JADX INFO: renamed from: ܽ */
    public long f1485;

    /* JADX INFO: renamed from: ܿ */
    public String f1486;

    /* JADX INFO: renamed from: ᩳ */
    public String f1487;

    /* JADX INFO: renamed from: ᩴ */
    public int f1488;

    /* JADX INFO: renamed from: ᩵ */
    public int f1489;

    /* JADX INFO: renamed from: ᩶ */
    public String f1490;

    /* JADX INFO: renamed from: ᩷ */
    public String f1491;

    /* JADX INFO: renamed from: ᩸ */
    public int f1492;

    /* JADX INFO: renamed from: ᩹ */
    public String f1493;

    /* JADX INFO: renamed from: ᩻ */
    public long f1494;

    public TransferRecord(int i) {
        this.f1488 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1549(Cursor cursor) {
        this.f1488 = cursor.getInt(cursor.getColumnIndexOrThrow(C0659aq.f2425d));
        this.f1467 = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        this.f1480 = TransferType.m1568(cursor.getString(cursor.getColumnIndexOrThrow("type")));
        this.f1472 = TransferState.m1554(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.f1468 = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f1473 = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f1485 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total"));
        this.f1479 = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f1466 = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f1489 = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f1492 = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f1486 = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f1482 = cursor.getString(cursor.getColumnIndexOrThrow("file"));
        this.f1483 = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f1494 = cursor.getLong(cursor.getColumnIndexOrThrow("file_offset"));
        this.f1484 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f1477 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f1476 = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f1491 = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.f1478 = JsonUtils.m1976(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.f1471 = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.f1493 = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.f1490 = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.f1475 = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.f1487 = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.f1469 = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options"));
        try {
            this.f1481 = (TransferUtilityOptions) this.f1474.m32798(string);
        } catch (C16322 e) {
            f1465.mo1461("Failed to deserialize: " + string + ", setting to default", e);
            this.f1481 = new TransferUtilityOptions();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1550(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (m1551() || this.f1492 != 0 || TransferState.COMPLETED.equals(this.f1472) || !m1552(transferStatusUpdater, connectivityManager)) {
            return;
        }
        if (this.f1480.equals(TransferType.DOWNLOAD)) {
            this.f1470 = TransferThreadPool.m1567(new DownloadTask(this, amazonS3, transferStatusUpdater));
        } else {
            this.f1470 = TransferThreadPool.m1567(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m1553(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        if (m1552(transferStatusUpdater, connectivityManager)) {
            return false;
        }
        TransferState transferState = this.f1472;
        if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
            return false;
        }
        if (m1551()) {
            this.f1470.cancel(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1551() {
        Future future = this.f1470;
        return (future == null || future.isDone()) ? false : true;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("[id:");
        sb.append(this.f1488);
        sb.append(",bucketName:");
        sb.append(this.f1468);
        sb.append(",key:");
        sb.append(this.f1473);
        sb.append(",file:");
        sb.append(this.f1482);
        sb.append(",type:");
        sb.append(this.f1480);
        sb.append(",bytesTotal:");
        sb.append(this.f1485);
        sb.append(",bytesCurrent:");
        sb.append(this.f1479);
        sb.append(",fileOffset:");
        sb.append(this.f1494);
        sb.append(",state:");
        sb.append(this.f1472);
        sb.append(",cannedAcl:");
        sb.append(this.f1487);
        sb.append(",mainUploadId:");
        sb.append(this.f1467);
        sb.append(",isMultipart:");
        sb.append(this.f1466);
        sb.append(",isLastPart:");
        sb.append(this.f1489);
        sb.append(",partNumber:");
        sb.append(this.f1492);
        sb.append(",multipartId:");
        sb.append(this.f1483);
        sb.append(",eTag:");
        sb.append(this.f1486);
        sb.append(",storageClass:");
        sb.append(this.f1469);
        sb.append(",userMetadata:");
        sb.append(this.f1478.toString());
        sb.append(",transferUtilityOptions:");
        TransferUtilityOptions transferUtilityOptions = this.f1481;
        C14271 c14271 = this.f1474;
        c14271.getClass();
        if (transferUtilityOptions == null) {
            C9577 c9577 = C9577.f26370;
            StringBuilder sb2 = new StringBuilder();
            try {
                c14271.m32803(c9577, c14271.m32801(C20998.m47337(sb2)));
                string = sb2.toString();
            } catch (IOException e) {
                throw new C15611(e);
            }
        } else {
            Class<?> cls = transferUtilityOptions.getClass();
            StringBuilder sb3 = new StringBuilder();
            try {
                c14271.m32802(transferUtilityOptions, cls, c14271.m32801(C20998.m47337(sb3)));
                string = sb3.toString();
            } catch (IOException e2) {
                throw new C15611(e2);
            }
        }
        return C10965.m25286(sb, string, "]");
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m1552(TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        TransferNetworkConnectionType transferNetworkConnectionType;
        if (connectivityManager == null || (transferUtilityOptions = this.f1481) == null || (transferNetworkConnectionType = transferUtilityOptions.f1541) == null || transferNetworkConnectionType.m1543(connectivityManager)) {
            return true;
        }
        f1465.mo1463("Network Connection " + this.f1481.f1541 + " is not available.");
        transferStatusUpdater.m1561(this.f1488, TransferState.WAITING_FOR_NETWORK);
        return false;
    }
}
