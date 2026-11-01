package p067l;

import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: l.۬᩺ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1507 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    public WindowInsets mDispachedInsets;
    public final int mDispatchMode;

    public void onEnd(C1704 c1704) {
    }

    public void onPrepare(C1704 c1704) {
    }

    public abstract C1914 onProgress(C1914 c1914, List list);

    public C1017 onStart(C1704 c1704, C1017 c1017) {
        return c1017;
    }

    public AbstractC1507(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }
}
