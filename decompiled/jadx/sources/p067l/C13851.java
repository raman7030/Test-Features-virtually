package p067l;

import android.content.ComponentName;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.۫֨ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q13J */
/* JADX INFO: loaded from: classes4.dex */
public final class C13851 implements InterfaceC7796 {

    /* JADX INFO: renamed from: ֫ */
    public ComponentName f39145;

    /* JADX INFO: renamed from: ۧ */
    public boolean f39146;

    /* JADX INFO: renamed from: ܽ */
    public boolean f39147;

    public C13851(ComponentName componentName, boolean z, boolean z2) {
        this.f39145 = componentName;
        this.f39147 = z;
        this.f39146 = z2;
    }

    @Override // p067l.InterfaceC7796
    /* JADX INFO: renamed from: ܽ */
    public final ComponentName mo10963() {
        return this.f39145;
    }

    @Override // p067l.InterfaceC7796
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo10961() {
        return this.f39147;
    }

    @Override // p067l.InterfaceC7796
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10959() {
        return this.f39146;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31528(final C18107 c18107, final InterfaceC19370 interfaceC19370) {
        if (C11840.m27140(c18107, interfaceC19370)) {
            C11245.m26044(interfaceC19370, OpenAuthTask.Duplex);
            C11840.m27139(c18107, interfaceC19370, this.f39145);
        } else {
            C20966.m47304(c18107, interfaceC19370, new InterfaceC20295() { // from class: l.۬֨ܿ
                @Override // p067l.InterfaceC20295
                /* JADX INFO: renamed from: ۧ */
                public final void mo8469(AbstractC17043 abstractC17043) {
                    InterfaceC19370 interfaceC19371 = interfaceC19370;
                    C11245.m26044(interfaceC19371, OpenAuthTask.Duplex);
                    C7816.m18080(c18107.m41282(), abstractC17043, interfaceC19371.mo39137()).m18086(this.f41441);
                }
            });
        }
    }
}
