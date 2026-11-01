package p067l;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: l.۬۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8OH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14705 implements InterfaceC16716 {

    /* JADX INFO: renamed from: ᩸ */
    public final C12024 f41932;

    /* JADX INFO: renamed from: ᩹ */
    public final Context f41933;

    public C14705(Application application) {
        C12024 c12024 = new C12024();
        this.f41933 = application.getApplicationContext();
        this.f41932 = c12024;
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22753 mo8449() {
        return new C14035(this.f41933, this.f41932.mo8449());
    }
}
