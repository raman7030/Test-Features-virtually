package p067l;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۙ֫ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1057 {

    /* JADX INFO: renamed from: ۧ */
    public HandlerC1932 f16735;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f16738;

    /* JADX INFO: renamed from: ܽ */
    public final Object f16736 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final MediaSession.Callback f16734 = new C1827(this);

    /* JADX INFO: renamed from: ܿ */
    public WeakReference f16737 = new WeakReference(null);

    /* JADX INFO: renamed from: ֫ */
    public void mo10555() {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10556(long j) {
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo10558() {
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo10559() {
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo10560() {
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14848(InterfaceC0987 interfaceC0987, Handler handler) {
        synchronized (this.f16736) {
            this.f16737 = new WeakReference(interfaceC0987);
            HandlerC1932 handlerC1932 = this.f16735;
            HandlerC1932 handlerC1933 = null;
            if (handlerC1932 != null) {
                handlerC1932.removeCallbacksAndMessages(null);
            }
            if (interfaceC0987 != null && handler != null) {
                handlerC1933 = new HandlerC1932(this, handler.getLooper());
            }
            this.f16735 = handlerC1933;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo10557(Intent intent) {
        InterfaceC0987 interfaceC0987;
        HandlerC1932 handlerC1932;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f16736) {
                interfaceC0987 = (InterfaceC0987) this.f16737.get();
                handlerC1932 = this.f16735;
            }
            if (interfaceC0987 != null && handlerC1932 != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C22636 c22636Mo10977 = interfaceC0987.mo10977();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() == 0) {
                        if (this.f16738) {
                            handlerC1932.removeMessages(1);
                            this.f16738 = false;
                            C1805 c1805Mo10978 = interfaceC0987.mo10978();
                            if (((c1805Mo10978 == null ? 0L : c1805Mo10978.f65421) & 32) != 0) {
                                mo10559();
                            }
                            return true;
                        }
                        this.f16738 = true;
                        handlerC1932.sendMessageDelayed(handlerC1932.obtainMessage(1, c22636Mo10977), ViewConfiguration.getDoubleTapTimeout());
                        return true;
                    }
                    m14847(interfaceC0987, handlerC1932);
                    return true;
                }
                m14847(interfaceC0987, handlerC1932);
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14847(InterfaceC0987 interfaceC0987, Handler handler) {
        if (this.f16738) {
            this.f16738 = false;
            handler.removeMessages(1);
            C1805 c1805Mo10978 = interfaceC0987.mo10978();
            long j = c1805Mo10978 == null ? 0L : c1805Mo10978.f65421;
            boolean z = c1805Mo10978 != null && c1805Mo10978.f65416 == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                mo10555();
            } else {
                if (z || !z2) {
                    return;
                }
                mo10558();
            }
        }
    }
}
