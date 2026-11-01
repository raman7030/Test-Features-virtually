package p067l;

import android.net.Uri;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M7MY */
/* JADX INFO: loaded from: classes4.dex */
public final class C20170 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f62428 = new C6088(5, 1.0f, false);

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m45649(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f62428.get(uri);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45648(Uri uri, byte[] bArr) {
        uri.getClass();
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m45650(Uri uri) {
        uri.getClass();
        return (byte[]) this.f62428.remove(uri);
    }
}
