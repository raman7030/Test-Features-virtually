package com.amazonaws.mobileconnectors.s3.transferutility;

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
import l.C4860;

/* JADX INFO: loaded from: classes.dex */
public class TransferDBBase {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Log f282 = LogFactory.m302(TransferDBBase.class);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f283 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri f284;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SQLiteDatabase f285;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TransferDatabaseHelper f286;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UriMatcher f287;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m357(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate;
        int iMatch = this.f287.match(uri);
        m355();
        if (iMatch == 10) {
            iUpdate = this.f285.update("awstransfer", contentValues, str, strArr);
        } else if (iMatch == 20) {
            String lastPathSegment = uri.getLastPathSegment();
            if (TextUtils.isEmpty(str)) {
                iUpdate = this.f285.update("awstransfer", contentValues, "_id=" + lastPathSegment, null);
            } else {
                iUpdate = this.f285.update("awstransfer", contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
            }
        } else {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        return iUpdate;
    }

    public TransferDBBase(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        TransferDatabaseHelper transferDatabaseHelper = new TransferDatabaseHelper(context);
        this.f286 = transferDatabaseHelper;
        this.f285 = transferDatabaseHelper.getWritableDatabase();
        this.f284 = Uri.parse("content://" + packageName + "/transfers");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f287 = uriMatcher;
        uriMatcher.addURI(packageName, "transfers", 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri m359() {
        return this.f284;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Cursor m358(Uri uri, String str, String[] strArr) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("awstransfer");
        int iMatch = this.f287.match(uri);
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
        m355();
        return sQLiteQueryBuilder.query(this.f285, null, str, strArr, null, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m356(Uri uri) {
        int iMatch = this.f287.match(uri);
        m355();
        if (iMatch == 10) {
            return this.f285.delete("awstransfer", null, null);
        }
        if (iMatch != 20) {
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (!TextUtils.isEmpty(null)) {
            return this.f285.delete("awstransfer", C4860.m14172("_id=", lastPathSegment, " and null"), null);
        }
        return this.f285.delete("awstransfer", "_id=" + lastPathSegment, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m355() {
        synchronized (f283) {
            if (!this.f285.isOpen()) {
                this.f285 = this.f286.getWritableDatabase();
            }
        }
    }
}
