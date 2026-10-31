package l;

import android.app.Notification;

/* JADX INFO: renamed from: l.ۜ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6981 extends AbstractC9098 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f21522;

    @Override // l.AbstractC9098
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo18870() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18871(String str) {
        this.f21522 = C21093.m47990(str);
    }

    @Override // l.AbstractC9098
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18872(InterfaceC17564 interfaceC17564) {
        new Notification.BigTextStyle(((C8392) interfaceC17564).mo21994()).setBigContentTitle(null).bigText(this.f21522);
    }
}
