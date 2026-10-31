package l;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;

/* JADX INFO: renamed from: l.᩸ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08N4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21512 implements InterfaceC6695 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AudioTrack m48680(C1111 c1111, C18231 c18231, int i, Context context) {
        boolean z = c1111.f4055;
        int i2 = c1111.f4056;
        int i3 = c1111.f4054;
        int i4 = c1111.f4057;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(m48679(c18231, z)).setAudioFormat(C3603.m11040(i4, i3, i2)).setTransferMode(1).setBufferSizeInBytes(c1111.f4053).setSessionId(i);
            if (i5 >= 29) {
                sessionId.setOffloadedPlayback(c1111.f4058);
            }
            if (i5 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            return sessionId.build();
        }
        return new AudioTrack(m48679(c18231, z), C3603.m11040(i4, i3, i2), c1111.f4053, 1, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AudioAttributes m48679(C18231 c18231, boolean z) {
        if (!z) {
            return c18231.m42474().f51620;
        }
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }
}
