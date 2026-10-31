package l;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: l.ܺ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15575 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18231 f47989;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Handler f47990;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f47991;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f47992;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener f47993;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f47994;

    public C15575(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C18231 c18231, boolean z) {
        this.f47992 = i;
        this.f47990 = handler;
        this.f47989 = c18231;
        this.f47991 = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.f47993 = new C8521(onAudioFocusChangeListener, handler);
        } else {
            this.f47993 = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f47994 = new AudioFocusRequest.Builder(i).setAudioAttributes(c18231.m42474().f51620).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f47994 = null;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m36713() {
        return this.f47992;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18231 m36710() {
        return this.f47989;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m36715() {
        return this.f47991;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AudioManager.OnAudioFocusChangeListener m36711() {
        return this.f47993;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Handler m36714() {
        return this.f47990;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20516 m36709() {
        return new C20516(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15575)) {
            return false;
        }
        C15575 c15575 = (C15575) obj;
        return this.f47992 == c15575.f47992 && this.f47991 == c15575.f47991 && C11003.equals(this.f47993, c15575.f47993) && C11003.equals(this.f47990, c15575.f47990) && C11003.equals(this.f47989, c15575.f47989);
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f47992), this.f47993, this.f47990, this.f47989, Boolean.valueOf(this.f47991));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AudioFocusRequest m36712() {
        Object obj = this.f47994;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
