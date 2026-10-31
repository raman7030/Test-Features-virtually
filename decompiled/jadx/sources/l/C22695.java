package l;

import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public class C22695 implements InterfaceC5762 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Messenger f73329;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f73330 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public MediaBrowserService f73331;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC14974 f73332;

    public C22695(AbstractServiceC14974 abstractServiceC14974) {
        this.f73332 = abstractServiceC14974;
    }

    @Override // l.InterfaceC5762
    public void onCreate() {
        C11407 c11407 = new C11407(this, this.f73332);
        this.f73331 = c11407;
        c11407.onCreate();
    }
}
