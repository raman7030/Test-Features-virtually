package p067l;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* JADX INFO: renamed from: l.ܳ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C16164 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22201 f47603;

    public C16164(C22201 c22201) {
        this.f47603 = c22201;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C22201 c22201 = this.f47603;
        c22201.m50016(C19518.m44352(c22201.f70222, this.f47603.f70215, this.f47603.f70217));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (C5792.m13005(this.f47603.f70217, audioDeviceInfoArr)) {
            this.f47603.f70217 = null;
        }
        C22201 c22201 = this.f47603;
        c22201.m50016(C19518.m44352(c22201.f70222, this.f47603.f70215, this.f47603.f70217));
    }
}
