package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.Selection;
import android.text.method.TextKeyListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܰۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC13637 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f40655;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f40656;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40657;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f40658;

    public HandlerC13637(C12392 c12392) {
        super(Looper.getMainLooper());
        this.f40658 = false;
        this.f40657 = false;
        this.f40655 = new WeakReference(c12392);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C12392 c12392 = (C12392) this.f40655.get();
        if (c12392 != null) {
            switch (message.what) {
                case 1:
                    if (!c12392.f37304) {
                        c12392.m30291(Selection.getSelectionEnd(c12392.f37322), false);
                    }
                    break;
                case 2:
                    c12392.m30299(-1);
                    break;
                case 3:
                    if (c12392.f37172) {
                        c12392.m30240();
                        this.f40658 = true;
                    } else {
                        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c12392.f37314) - 1500);
                        if (iUptimeMillis < 0) {
                            int i = -iUptimeMillis;
                            if (i < 1500) {
                                removeMessages(3);
                                sendEmptyMessageDelayed(3, i);
                            }
                            this.f40658 = true;
                        } else if (iUptimeMillis < 300) {
                            this.f40658 = true;
                            c12392.invalidate();
                            removeMessages(3);
                            sendEmptyMessage(3);
                        } else if (this.f40658) {
                            this.f40658 = false;
                            c12392.invalidate();
                        }
                    }
                    break;
                case 4:
                    if (!this.f40656) {
                        c12392.invalidate();
                        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
                        break;
                    }
                    break;
                case 5:
                    if (c12392.f37294) {
                        c12392.m30187();
                        this.f40657 = true;
                    } else {
                        int iUptimeMillis2 = (int) ((SystemClock.uptimeMillis() - c12392.f37309) - 1500);
                        if (iUptimeMillis2 < 0) {
                            int i2 = -iUptimeMillis2;
                            if (i2 < 1500) {
                                removeMessages(5);
                                sendEmptyMessageDelayed(5, i2);
                            }
                            this.f40657 = true;
                        } else if (iUptimeMillis2 < 300) {
                            this.f40657 = true;
                            c12392.invalidate();
                            removeMessages(5);
                            sendEmptyMessage(5);
                        } else if (this.f40657) {
                            this.f40657 = false;
                            c12392.invalidate();
                        }
                    }
                    break;
                case 6:
                    TextKeyListener textKeyListener = C12392.f37169;
                    c12392.invalidate();
                    InterfaceC18702 interfaceC18702 = c12392.f37245.f73253;
                    if (interfaceC18702 != null) {
                        interfaceC18702.mo21666();
                    }
                    break;
                case 7:
                    c12392.f37258.mo8173();
                    c12392.m30289();
                    break;
                case 8:
                    C12392.m30218(c12392);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32775() {
        if (this.f40656) {
            return;
        }
        removeMessages(4);
        this.f40656 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32776() {
        this.f40656 = false;
        C12392 c12392 = (C12392) this.f40655.get();
        if (c12392 == null || this.f40656) {
            return;
        }
        c12392.invalidate();
        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }
}
