package p067l;

import android.app.Notification;

/* JADX INFO: renamed from: l.ۜ᩶ */
/* JADX INFO: compiled from: N5WY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1188 extends AbstractC1293 {

    /* JADX INFO: renamed from: ۧ */
    public CharSequence f24402;

    @Override // p067l.AbstractC1293
    /* JADX INFO: renamed from: ֫ */
    public final String mo20824() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20825(String str) {
        this.f24402 = C1888.m50320(str);
    }

    @Override // p067l.AbstractC1293
    /* JADX INFO: renamed from: ֫ */
    public final void mo20826(InterfaceC1713 interfaceC1713) {
        new Notification.BigTextStyle(((C1258) interfaceC1713).mo23965()).setBigContentTitle(null).bigText(this.f24402);
    }
}
