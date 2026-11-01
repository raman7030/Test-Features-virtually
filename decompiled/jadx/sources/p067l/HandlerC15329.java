package p067l;

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
public final class HandlerC15329 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f43735;

    /* JADX INFO: renamed from: ۧ */
    public boolean f43736;

    /* JADX INFO: renamed from: ܽ */
    public boolean f43737;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f43738;

    public HandlerC15329(C14146 c14146) {
        super(Looper.getMainLooper());
        this.f43738 = false;
        this.f43737 = false;
        this.f43735 = new WeakReference(c14146);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C14146 c14146 = (C14146) this.f43735.get();
        if (c14146 != null) {
            switch (message.what) {
                case 1:
                    if (!c14146.f40321) {
                        c14146.m32355(Selection.getSelectionEnd(c14146.f40339), false);
                    }
                    break;
                case 2:
                    c14146.m32363(-1);
                    break;
                case 3:
                    if (c14146.f40189) {
                        c14146.m32304();
                        this.f43738 = true;
                    } else {
                        int iUptimeMillis = (int) ((SystemClock.uptimeMillis() - c14146.f40331) - 1500);
                        if (iUptimeMillis < 0) {
                            int i = -iUptimeMillis;
                            if (i < 1500) {
                                removeMessages(3);
                                sendEmptyMessageDelayed(3, i);
                            }
                            this.f43738 = true;
                        } else if (iUptimeMillis < 300) {
                            this.f43738 = true;
                            c14146.invalidate();
                            removeMessages(3);
                            sendEmptyMessage(3);
                        } else if (this.f43738) {
                            this.f43738 = false;
                            c14146.invalidate();
                        }
                    }
                    break;
                case 4:
                    if (!this.f43736) {
                        c14146.invalidate();
                        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
                        break;
                    }
                    break;
                case 5:
                    if (c14146.f40311) {
                        c14146.m32251();
                        this.f43737 = true;
                    } else {
                        int iUptimeMillis2 = (int) ((SystemClock.uptimeMillis() - c14146.f40326) - 1500);
                        if (iUptimeMillis2 < 0) {
                            int i2 = -iUptimeMillis2;
                            if (i2 < 1500) {
                                removeMessages(5);
                                sendEmptyMessageDelayed(5, i2);
                            }
                            this.f43737 = true;
                        } else if (iUptimeMillis2 < 300) {
                            this.f43737 = true;
                            c14146.invalidate();
                            removeMessages(5);
                            sendEmptyMessage(5);
                        } else if (this.f43737) {
                            this.f43737 = false;
                            c14146.invalidate();
                        }
                    }
                    break;
                case 6:
                    TextKeyListener textKeyListener = C14146.f40186;
                    c14146.invalidate();
                    InterfaceC20143 interfaceC20143 = c14146.f40262.f75978;
                    if (interfaceC20143 != null) {
                        interfaceC20143.mo23635();
                    }
                    break;
                case 7:
                    c14146.f40275.mo10206();
                    c14146.m32353();
                    break;
                case 8:
                    C14146.m32282(c14146);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34890() {
        if (this.f43736) {
            return;
        }
        removeMessages(4);
        this.f43736 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34891() {
        this.f43736 = false;
        C14146 c14146 = (C14146) this.f43735.get();
        if (c14146 == null || this.f43736) {
            return;
        }
        c14146.invalidate();
        sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }
}
