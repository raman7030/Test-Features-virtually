package p067l;

import android.app.Notification;

/* JADX INFO: renamed from: l.᩹᩶ */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes.dex */
public final class C1958 implements InterfaceC1503 {

    /* JADX INFO: renamed from: ֫ */
    public final Notification f75552;

    /* JADX INFO: renamed from: ۧ */
    public final String f75553;

    public C1958(String str, Notification notification) {
        this.f75553 = str;
        this.f75552 = notification;
    }

    @Override // p067l.InterfaceC1503
    /* JADX INFO: renamed from: ֫ */
    public final void mo34412(InterfaceC1649 interfaceC1649) {
        interfaceC1649.mo7257(this.f75553, this.f75552);
    }

    public final String toString() {
        return C10965.m25286(new StringBuilder("NotifyTask[packageName:"), this.f75553, ", id:1006, tag:null]");
    }
}
