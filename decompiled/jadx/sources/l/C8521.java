package l;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۡ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes3.dex */
public final class C8521 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f26037;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f26038;

    public C8521(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.f26038 = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = C3603.f11424;
        this.f26037 = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        C3603.m11023(this.f26037, new Runnable() { // from class: l.ۢ֡֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f27928.f26038.onAudioFocusChange(i);
            }
        });
    }
}
