package p067l;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;

/* JADX INFO: renamed from: l.ۘܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2CV */
/* JADX INFO: loaded from: classes2.dex */
public final class ResultReceiverC6157 extends ResultReceiver {

    /* JADX INFO: renamed from: ᩹ */
    public static int f15447;

    /* JADX INFO: renamed from: ᩸ */
    public volatile int f15448;

    public ResultReceiverC6157() {
        super(null);
        this.f15448 = -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13951() {
        this.f15448 = -1;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f15448 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m13950() {
        if (f15447 > 10) {
            return -1;
        }
        for (int i = 0; this.f15448 == -1 && i < 60; i += 5) {
            SystemClock.sleep(5L);
        }
        if (this.f15448 == -1) {
            f15447++;
        } else {
            f15447 = 0;
        }
        return this.f15448;
    }
}
