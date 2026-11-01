package p067l;

import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C15794 extends AbstractC24196 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16433 f45693;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ String f45694;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f45695;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ Uri f45696;

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo8378() {
        return true;
    }

    public C15794(String str, String str2, C16433 c16433, Uri uri) {
        this.f45694 = str;
        this.f45695 = str2;
        this.f45693 = c16433;
        this.f45696 = uri;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩻ */
    public final String mo8382() {
        return this.f45694;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8379() {
        return this.f45695;
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo8380() {
        return this.f45693.mo29987();
    }

    @Override // p067l.AbstractC24196
    /* JADX INFO: renamed from: ᩵ */
    public final C13468 mo8381() throws IOException {
        try {
            Cursor cursorQuery = C7050.m16233().query(this.f45696, null, null, null, null);
            long jMax = -1;
            long j = 0;
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        int columnIndex2 = cursorQuery.getColumnIndex("last_modified");
                        if (columnIndex >= 0 && !cursorQuery.isNull(columnIndex)) {
                            jMax = Math.max(-1L, cursorQuery.getLong(columnIndex));
                        }
                        if (columnIndex2 >= 0 && !cursorQuery.isNull(columnIndex2)) {
                            j = cursorQuery.getLong(columnIndex2);
                        }
                    }
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            long j2 = j;
            C13468 c13468 = new C13468(this.f45694, jMax, j2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c13468;
        } catch (RuntimeException e) {
            throw new IOException("Could not query image content metadata", e);
        }
    }
}
