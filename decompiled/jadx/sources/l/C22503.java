package l;

import android.app.Notification;

/* JADX INFO: renamed from: l.᩹᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes.dex */
public final class C22503 implements InterfaceC13330 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Notification f72826;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f72827;

    public C22503(String str, Notification notification) {
        this.f72827 = str;
        this.f72826 = notification;
    }

    @Override // l.InterfaceC13330
    /* JADX INFO: renamed from: ֫ */
    public final void mo32312(InterfaceC16277 interfaceC16277) {
        interfaceC16277.mo5014(this.f72827, this.f72826);
    }

    public final String toString() {
        return C9045.m23341(new StringBuilder("NotifyTask[packageName:"), this.f72827, ", id:1006, tag:null]");
    }
}
