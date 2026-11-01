package p067l;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩷֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C21866 {

    /* JADX INFO: renamed from: ֫ */
    public C19695 f68784;

    /* JADX INFO: renamed from: ۧ */
    public Handler f68785;

    /* JADX INFO: renamed from: ܽ */
    public int f68786;

    /* JADX INFO: renamed from: ܿ */
    public boolean f68787;

    /* JADX INFO: renamed from: ᩳ */
    public AudioManager.OnAudioFocusChangeListener f68788;

    /* JADX INFO: renamed from: ֫ */
    public final void m49316(C17111 c17111, Handler handler) {
        handler.getClass();
        this.f68788 = c17111;
        this.f68785 = handler;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49317(C19695 c19695) {
        c19695.getClass();
        this.f68784 = c19695;
    }

    public C21866(int i) {
        this.f68784 = C19695.f59870;
        this.f68786 = i;
    }

    public C21866(C17170 c17170) {
        this.f68786 = c17170.m38874();
        this.f68788 = c17170.m38872();
        this.f68785 = c17170.m38875();
        this.f68784 = c17170.m38871();
        this.f68787 = c17170.m38876();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49318(boolean z) {
        this.f68787 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17170 m49315() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f68788;
        if (onAudioFocusChangeListener != null) {
            Handler handler = this.f68785;
            handler.getClass();
            return new C17170(this.f68786, onAudioFocusChangeListener, handler, this.f68784, this.f68787);
        }
        throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
    }
}
