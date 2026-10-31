package l;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩻۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23689 extends ContentObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ContentResolver f76720;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Uri f76721;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20868 f76722;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23689(C20868 c20868, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f76722 = c20868;
        this.f76720 = contentResolver;
        this.f76721 = uri;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52227() {
        this.f76720.registerContentObserver(this.f76721, false, this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52228() {
        this.f76720.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C20868 c20868 = this.f76722;
        c20868.m47686(C18045.m42101(c20868.f67536, c20868.f67529, c20868.f67531));
    }
}
