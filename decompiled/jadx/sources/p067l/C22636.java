package p067l;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩸ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I22G */
/* JADX INFO: loaded from: classes4.dex */
public final class C22636 {

    /* JADX INFO: renamed from: ֫ */
    public C6542 f71415;

    public C22636(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C21295 c21295 = new C21295(str, i, i2);
            C23306.m51910(i, i2, str);
            this.f71415 = c21295;
            return;
        }
        this.f71415 = new C6542(str, i, i2);
    }

    public C22636(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strM48144 = C21295.m48144(remoteUserInfo);
        if (strM48144 == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(strM48144)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f71415 = new C21295(remoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22636)) {
            return false;
        }
        return this.f71415.equals(((C22636) obj).f71415);
    }

    public final int hashCode() {
        return this.f71415.hashCode();
    }
}
