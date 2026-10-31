package l;

import android.app.Application;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: renamed from: l.ۘۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 94XI */
/* JADX INFO: loaded from: classes3.dex */
public final class C3893 extends AbstractC2482 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Application f12453;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Uri f12454;

    @Override // l.AbstractC2482
    /* JADX INFO: renamed from: ֫ */
    public final String mo7970() throws Throwable {
        Throwable th;
        Exception e;
        Cursor cursorQuery;
        Object obj = "_display_name";
        Object obj2 = null;
        try {
            try {
                try {
                    cursorQuery = this.f12453.getContentResolver().query(this.f12454, new String[]{"_display_name"}, null, null, null);
                    try {
                        if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                            try {
                                C20094.m46319(cursorQuery);
                                return null;
                            } catch (RuntimeException e2) {
                                throw e2;
                            }
                        }
                        String string = cursorQuery.getString(0);
                        try {
                            C20094.m46319(cursorQuery);
                            return string;
                        } catch (RuntimeException e3) {
                            throw e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        e.toString();
                        Cursor cursor = cursorQuery;
                        obj = cursor;
                        if (cursor != null) {
                            try {
                                Cursor cursor2 = cursor;
                                C20094.m46319(cursor2);
                                obj = cursor2;
                            } catch (RuntimeException e5) {
                                throw e5;
                            }
                        }
                        return null;
                    }
                } catch (Exception unused) {
                    return null;
                }
            } catch (Exception e6) {
                e = e6;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                Cursor cursor3 = (Cursor) obj2;
                if (cursor3 != null) {
                    try {
                        C20094.m46319(cursor3);
                    } catch (RuntimeException e7) {
                        throw e7;
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            obj2 = obj;
            th = th3;
        }
    }

    public C3893(Application application, Uri uri) {
        this.f12453 = application;
        this.f12454 = uri;
    }
}
