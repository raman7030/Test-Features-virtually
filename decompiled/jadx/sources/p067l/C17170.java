package p067l;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܺ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17170 {

    /* JADX INFO: renamed from: ֫ */
    public final C19695 f51121;

    /* JADX INFO: renamed from: ۧ */
    public final Handler f51122;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f51123;

    /* JADX INFO: renamed from: ܽ */
    public final int f51124;

    /* JADX INFO: renamed from: ܿ */
    public final AudioManager.OnAudioFocusChangeListener f51125;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f51126;

    public C17170(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C19695 c19695, boolean z) {
        this.f51124 = i;
        this.f51122 = handler;
        this.f51121 = c19695;
        this.f51123 = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.f51125 = new C10466(onAudioFocusChangeListener, handler);
        } else {
            this.f51125 = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f51126 = new AudioFocusRequest.Builder(i).setAudioAttributes(c19695.m44733().f54801).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f51126 = null;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m38874() {
        return this.f51124;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19695 m38871() {
        return this.f51121;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m38876() {
        return this.f51123;
    }

    /* JADX INFO: renamed from: ܳ */
    public final AudioManager.OnAudioFocusChangeListener m38872() {
        return this.f51125;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Handler m38875() {
        return this.f51122;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21866 m38870() {
        return new C21866(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17170)) {
            return false;
        }
        C17170 c17170 = (C17170) obj;
        return this.f51124 == c17170.f51124 && this.f51123 == c17170.f51123 && C12826.equals(this.f51125, c17170.f51125) && C12826.equals(this.f51122, c17170.f51122) && C12826.equals(this.f51121, c17170.f51121);
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f51124), this.f51125, this.f51122, this.f51121, Boolean.valueOf(this.f51123));
    }

    /* JADX INFO: renamed from: ܽ */
    public final AudioFocusRequest m38873() {
        Object obj = this.f51126;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
