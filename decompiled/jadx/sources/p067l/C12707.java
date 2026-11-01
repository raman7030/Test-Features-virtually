package p067l;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.view.View;

/* JADX INFO: renamed from: l.ۧ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12707 implements InterfaceC17399 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4566 f35688;

    public C12707(C4566 c4566) {
        this.f35688 = c4566;
    }

    @Override // p067l.InterfaceC17399
    /* JADX INFO: renamed from: ֫ */
    public final void mo7949(C7816 c7816, InterfaceC7796 interfaceC7796, C11169 c11169) {
        PackageManager packageManagerM16217 = C7050.m16217();
        ComponentName componentNameMo10963 = interfaceC7796.mo10963();
        if (componentNameMo10963.equals(C4566.m9641(packageManagerM16217))) {
            ApplicationC21448.f67649.edit().remove("dsai").apply();
        } else {
            ApplicationC21448.f67649.edit().putString("dsai", componentNameMo10963.flattenToString()).apply();
        }
        this.f35688.mo9048();
    }

    @Override // p067l.InterfaceC17399
    /* JADX INFO: renamed from: ֫ */
    public final void mo7948(View view, C7816 c7816, InterfaceC7796 interfaceC7796, C11169 c11169) {
        c7816.m18084(interfaceC7796);
    }
}
