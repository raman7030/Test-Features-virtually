package p067l;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۡ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10466 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: ֫ */
    public final Handler f28952;

    /* JADX INFO: renamed from: ۧ */
    public final AudioManager.OnAudioFocusChangeListener f28953;

    public C10466(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f28953 = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = C5792.f14228;
        this.f28952 = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        C5792.m12999(this.f28952, new Runnable() { // from class: l.ۢ֡֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f30874.f28953.onAudioFocusChange(i);
            }
        });
    }
}
