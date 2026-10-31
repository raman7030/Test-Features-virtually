package l;

import android.os.Bundle;
import moe.shizuku.server.IShizukuApplication;

/* JADX INFO: renamed from: l.ۗ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3461 extends IShizukuApplication.Stub {
    @Override // moe.shizuku.server.IShizukuApplication
    public final void showPermissionConfirmation(int i, int i2, String str, int i3) {
    }

    @Override // moe.shizuku.server.IShizukuApplication
    public final void bindApplication(Bundle bundle) {
        C23216.f74606 = bundle.getInt("shizuku:attach-reply-uid", -1);
        C23216.f74607 = bundle.getInt("shizuku:attach-reply-version", -1);
        bundle.getInt("shizuku:attach-reply-patch-version", -1);
        bundle.getString("shizuku:attach-reply-secontext");
        C23216.f74605 = bundle.getBoolean("shizuku:attach-reply-permission-granted", false);
        bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
        C23216.m51527();
    }

    @Override // moe.shizuku.server.IShizukuApplication
    public final void dispatchRequestPermissionResult(int i, Bundle bundle) {
        C23216.m51510(i, bundle.getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1);
    }
}
