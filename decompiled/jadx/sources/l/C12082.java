package l;

import android.content.ComponentName;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.۫֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q13J */
/* JADX INFO: loaded from: classes4.dex */
public final class C12082 implements InterfaceC5711 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ComponentName f36134;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f36135;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f36136;

    public C12082(ComponentName componentName, boolean z, boolean z2) {
        this.f36134 = componentName;
        this.f36136 = z;
        this.f36135 = z2;
    }

    @Override // l.InterfaceC5711
    /* JADX INFO: renamed from: ܽ */
    public final ComponentName mo8896() {
        return this.f36134;
    }

    @Override // l.InterfaceC5711
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8894() {
        return this.f36136;
    }

    @Override // l.InterfaceC5711
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8892() {
        return this.f36135;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29466(final C16560 c16560, final InterfaceC17889 interfaceC17889) {
        if (C9966.m25123(c16560, interfaceC17889)) {
            C9340.m24035(interfaceC17889, OpenAuthTask.Duplex);
            C9966.m25122(c16560, interfaceC17889, this.f36134);
        } else {
            C19568.m45009(c16560, interfaceC17889, new InterfaceC18862() { // from class: l.۬֨ܿ
                @Override // l.InterfaceC18862
                /* JADX INFO: renamed from: ۧ */
                public final void mo6267(AbstractC15440 abstractC15440) {
                    InterfaceC17889 interfaceC178810 = interfaceC17889;
                    C9340.m24035(interfaceC178810, OpenAuthTask.Duplex);
                    C5732.m16161(c16560.m39056(), abstractC15440, interfaceC178810.mo36971()).m16167(this.f38401);
                }
            });
        }
    }
}
