package l;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: l.۠ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC7919 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractServiceC14974 f24512;

    public HandlerC7919(AbstractServiceC14974 abstractServiceC14974) {
        this.f24512 = abstractServiceC14974;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractServiceC14974 abstractServiceC14974 = this.f24512;
        if (abstractServiceC14974 != null) {
            abstractServiceC14974.m35457(message);
        } else {
            removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21202() {
        this.f24512 = null;
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(C12045.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21203(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }
}
