package p067l;

import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public class C23937 implements InterfaceC7844 {

    /* JADX INFO: renamed from: ֫ */
    public Messenger f76055;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f76056 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public MediaBrowserService f76057;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractServiceC16599 f76058;

    public C23937(AbstractServiceC16599 abstractServiceC16599) {
        this.f76058 = abstractServiceC16599;
    }

    @Override // p067l.InterfaceC7844
    public void onCreate() {
        C13209 c13209 = new C13209(this, this.f76058);
        this.f76057 = c13209;
        c13209.onCreate();
    }
}
