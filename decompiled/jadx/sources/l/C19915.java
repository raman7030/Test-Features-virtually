package l;

import android.media.session.MediaSessionManager;

/* JADX INFO: renamed from: l.᩶ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J219 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19915 extends C4392 {
    public C19915(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m45832(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
