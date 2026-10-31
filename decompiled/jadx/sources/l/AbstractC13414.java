package l;

import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13414 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    public WindowInsets mDispachedInsets;
    public final int mDispatchMode;

    public void onEnd(C17376 c17376) {
    }

    public void onPrepare(C17376 c17376) {
    }

    public abstract C21610 onProgress(C21610 c21610, List list);

    public C3537 onStart(C17376 c17376, C3537 c3537) {
        return c3537;
    }

    public AbstractC13414(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }
}
