package p067l;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7B6 */
/* JADX INFO: loaded from: classes.dex */
public final class C24146 extends ContentResolver {
    @Override // android.content.ContentResolver
    public final String[] getStreamTypes(Uri uri, String str) {
        return new String[0];
    }

    @Override // android.content.ContentResolver
    public final List getPersistedUriPermissions() {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.ContentResolver
    public final List getOutgoingPersistedUriPermissions() {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Uri uri, ContentObserver contentObserver) {
        throw m53393("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Uri uri, ContentObserver contentObserver, boolean z) {
        throw m53393("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Uri uri, ContentObserver contentObserver, int i) {
        throw m53393("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void notifyChange(Collection collection, ContentObserver contentObserver, int i) {
        throw m53393("notifyChange");
    }

    @Override // android.content.ContentResolver
    public final void takePersistableUriPermission(Uri uri, int i) {
        throw m53393("takePersistableUriPermission");
    }

    @Override // android.content.ContentResolver
    public final void releasePersistableUriPermission(Uri uri, int i) {
        throw m53393("releasePersistableUriPermission");
    }

    /* JADX INFO: renamed from: ֫ */
    public static SecurityException m53393(String str) {
        return new SecurityException("Decryptor ContentResolver denied: ".concat(str));
    }
}
