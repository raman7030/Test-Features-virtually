package p067l;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩻۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24882 extends ContentObserver {

    /* JADX INFO: renamed from: ֫ */
    public final ContentResolver f79470;

    /* JADX INFO: renamed from: ۧ */
    public final Uri f79471;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C22201 f79472;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24882(C22201 c22201, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f79472 = c22201;
        this.f79470 = contentResolver;
        this.f79471 = uri;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54630() {
        this.f79470.registerContentObserver(this.f79471, false, this);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54631() {
        this.f79470.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        C22201 c22201 = this.f79472;
        c22201.m50016(C19518.m44352(c22201.f70222, c22201.f70215, c22201.f70217));
    }
}
