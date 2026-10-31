package l;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: renamed from: l.ܳ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14516 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20868 f44497;

    public C14516(C20868 c20868) {
        this.f44497 = c20868;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C20868 c20868 = this.f44497;
        c20868.m47686(C18045.m42101(c20868.f67536, this.f44497.f67529, this.f44497.f67531));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (C3603.m11029(this.f44497.f67531, audioDeviceInfoArr)) {
            this.f44497.f67531 = null;
        }
        C20868 c20868 = this.f44497;
        c20868.m47686(C18045.m42101(c20868.f67536, this.f44497.f67529, this.f44497.f67531));
    }
}
