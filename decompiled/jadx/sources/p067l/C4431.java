package p067l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: renamed from: l.ۖ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E7TV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4431 {

    /* JADX INFO: renamed from: ֫ */
    public static AudioManager f9951;

    /* JADX INFO: renamed from: ֫ */
    public static synchronized AudioManager m9260(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            f9951 = null;
        }
        AudioManager audioManager = f9951;
        if (audioManager != null) {
            return audioManager;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
            C15968 c15968 = new C15968();
            C12710.m29223().execute(new RunnableC11834(1, applicationContext, c15968));
            c15968.m36282();
            AudioManager audioManager2 = f9951;
            audioManager2.getClass();
            return audioManager2;
        }
        AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
        f9951 = audioManager3;
        audioManager3.getClass();
        return audioManager3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m9261(Context context, C15968 c15968) {
        f9951 = (AudioManager) context.getSystemService("audio");
        c15968.m36284();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m9263(AudioManager audioManager, C17170 c17170) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioManager.requestAudioFocus(c17170.m38873());
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerM38872 = c17170.m38872();
        c17170.m38871().getClass();
        return audioManager.requestAudioFocus(onAudioFocusChangeListenerM38872, 3, c17170.m38874());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9262(AudioManager audioManager, C17170 c17170) {
        if (Build.VERSION.SDK_INT >= 26) {
            audioManager.abandonAudioFocusRequest(c17170.m38873());
        } else {
            audioManager.abandonAudioFocus(c17170.m38872());
        }
    }
}
