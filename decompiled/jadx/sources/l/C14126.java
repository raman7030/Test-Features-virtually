package l;

import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ܰ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14126 extends AbstractC22967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14798 f42607;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42608;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42609;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f42610;

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo6176() {
        return true;
    }

    public C14126(String str, String str2, C14798 c14798, Uri uri) {
        this.f42608 = str;
        this.f42609 = str2;
        this.f42607 = c14798;
        this.f42610 = uri;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩻ */
    public final String mo6180() {
        return this.f42608;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6177() {
        return this.f42609;
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo6178() {
        return this.f42607.mo27926();
    }

    @Override // l.AbstractC22967
    /* JADX INFO: renamed from: ᩵ */
    public final C11679 mo6179() throws IOException {
        try {
            Cursor cursorQuery = C4925.m14336().query(this.f42610, null, null, null, null);
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
            C11679 c11679 = new C11679(this.f42608, jMax, j2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c11679;
        } catch (RuntimeException e) {
            throw new IOException("Could not query image content metadata", e);
        }
    }
}
