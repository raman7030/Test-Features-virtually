package p067l;

import android.media.session.MediaSessionManager;

/* JADX INFO: renamed from: l.᩶ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J219 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21295 extends C6542 {
    public C21295(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m48144(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
