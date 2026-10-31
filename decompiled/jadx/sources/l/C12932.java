package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۬ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public class C12932 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ WeakReference f38799;

    public C12932(WeakReference weakReference) {
        this.f38799 = weakReference;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            interfaceC23586.getLifecycle().mo19834(this);
            C12392 c12392 = (C12392) this.f38799.get();
            if (c12392 != null) {
                c12392.m30386();
            }
        }
    }
}
