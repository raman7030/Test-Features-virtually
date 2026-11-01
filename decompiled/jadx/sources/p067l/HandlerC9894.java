package p067l;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.۠ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC9894 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public AbstractServiceC16599 f27427;

    public HandlerC9894(AbstractServiceC16599 abstractServiceC16599) {
        this.f27427 = abstractServiceC16599;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractServiceC16599 abstractServiceC16599 = this.f27427;
        if (abstractServiceC16599 != null) {
            abstractServiceC16599.m37613(message);
        } else {
            removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23168() {
        this.f27427 = null;
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(C1439.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23169(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }
}
