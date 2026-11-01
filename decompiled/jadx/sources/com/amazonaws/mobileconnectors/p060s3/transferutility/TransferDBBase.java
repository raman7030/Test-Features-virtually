package com.amazonaws.mobileconnectors.p060s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import p067l.C6988;

/* JADX INFO: loaded from: classes.dex */
public class TransferDBBase {

    /* JADX INFO: renamed from: ܳ */
    public static final Log f1442 = LogFactory.m1468(TransferDBBase.class);

    /* JADX INFO: renamed from: ܿ */
    public static final Object f1443 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final Uri f1444;

    /* JADX INFO: renamed from: ۧ */
    public SQLiteDatabase f1445;

    /* JADX INFO: renamed from: ܽ */
    public final TransferDatabaseHelper f1446;

    /* JADX INFO: renamed from: ᩳ */
    public final UriMatcher f1447;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m1523(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate;
        int iMatch = this.f1447.match(uri);
        m1521();
        if (iMatch == 10) {
            iUpdate = this.f1445.update("awstransfer", contentValues, str, strArr);
        } else if (iMatch == 20) {
            String lastPathSegment = uri.getLastPathSegment();
            if (TextUtils.isEmpty(str)) {
                iUpdate = this.f1445.update("awstransfer", contentValues, "_id=" + lastPathSegment, null);
            } else {
                iUpdate = this.f1445.update("awstransfer", contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
            }
        } else {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        return iUpdate;
    }

    public TransferDBBase(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        TransferDatabaseHelper transferDatabaseHelper = new TransferDatabaseHelper(context);
        this.f1446 = transferDatabaseHelper;
        this.f1445 = transferDatabaseHelper.getWritableDatabase();
        this.f1444 = Uri.parse("content://" + packageName + "/transfers");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f1447 = uriMatcher;
        uriMatcher.addURI(packageName, "transfers", 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Uri m1525() {
        return this.f1444;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Cursor m1524(Uri uri, String str, String[] strArr) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("awstransfer");
        int iMatch = this.f1447.match(uri);
        if (iMatch == 10) {
            sQLiteQueryBuilder.appendWhere("part_num=0");
        } else if (iMatch == 20) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
        } else if (iMatch == 30) {
            sQLiteQueryBuilder.appendWhere("main_upload_id=" + uri.getLastPathSegment());
        } else if (iMatch == 40) {
            sQLiteQueryBuilder.appendWhere("state=");
            sQLiteQueryBuilder.appendWhereEscapeString(uri.getLastPathSegment());
        } else {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        m1521();
        return sQLiteQueryBuilder.query(this.f1445, null, str, strArr, null, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m1522(Uri uri) {
        int iMatch = this.f1447.match(uri);
        m1521();
        if (iMatch == 10) {
            return this.f1445.delete("awstransfer", null, null);
        }
        if (iMatch != 20) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (!TextUtils.isEmpty(null)) {
            return this.f1445.delete("awstransfer", C6988.m16053("_id=", lastPathSegment, " and null"), null);
        }
        return this.f1445.delete("awstransfer", "_id=" + lastPathSegment, null);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m1521() {
        synchronized (f1443) {
            if (!this.f1445.isOpen()) {
                this.f1445 = this.f1446.getWritableDatabase();
            }
        }
    }
}
