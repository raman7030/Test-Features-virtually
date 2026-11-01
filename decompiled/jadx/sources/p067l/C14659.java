package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۬ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public class C14659 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ WeakReference f41840;

    public C14659(WeakReference weakReference) {
        this.f41840 = weakReference;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            interfaceC24784.getLifecycle().mo21807(this);
            C14146 c14146 = (C14146) this.f41840.get();
            if (c14146 != null) {
                c14146.m32450();
            }
        }
    }
}
