package bin.p000mt.plugin.api.util;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p067l.HandlerC4427;

/* JADX INFO: loaded from: classes.dex */
public class UIUpdaterGroup {

    /* JADX INFO: renamed from: id */
    public final int f25id = ID_COUNTER.getAndIncrement();
    public final WeakReference myRef = new WeakReference(this);
    public final List updaters = new ArrayList();
    public static final AtomicInteger ID_COUNTER = new AtomicInteger();
    public static final Handler HANDLER = new HandlerC4427(Looper.getMainLooper());

    public UIUpdater registerUpdater(Consumer consumer) {
        UIUpdater uIUpdater = new UIUpdater(this, consumer);
        this.updaters.add(uIUpdater);
        return uIUpdater;
    }

    public void schedulePendingUpdates() {
        Handler handler = HANDLER;
        if (handler.hasMessages(this.f25id)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(this.f25id, this.myRef), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processPendingUpdates() {
        int size = this.updaters.size();
        for (int i = 0; i < size; i++) {
            ((UIUpdater) this.updaters.get(i)).processPendingUpdate();
        }
    }
}
