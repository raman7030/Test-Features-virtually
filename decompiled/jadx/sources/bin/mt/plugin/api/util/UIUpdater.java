package bin.mt.plugin.api.util;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class UIUpdater {
    public static final Object NOT_SET = new Object();
    public final AtomicReference pendingData = new AtomicReference(NOT_SET);
    public final Consumer uiConsumer;
    public final UIUpdaterGroup updaterGroup;

    public UIUpdater(UIUpdaterGroup uIUpdaterGroup, Consumer consumer) {
        this.updaterGroup = uIUpdaterGroup;
        this.uiConsumer = consumer;
    }

    public void submitUpdate(Object obj) {
        if (ThreadUtil.isInUiThread()) {
            this.pendingData.set(NOT_SET);
            this.uiConsumer.mo12762accept(obj);
        } else {
            this.pendingData.set(obj);
            this.updaterGroup.schedulePendingUpdates();
        }
    }

    public void processPendingUpdate() {
        AtomicReference atomicReference = this.pendingData;
        Object obj = NOT_SET;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != obj) {
            this.uiConsumer.mo12762accept(andSet);
        }
    }
}
