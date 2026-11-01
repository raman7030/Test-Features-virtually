package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes5.dex */
public class C20142 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ᩸ */
    public WeakReference f62361;

    public C20142(DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813) {
        this.f62361 = new WeakReference(dialogInterfaceOnClickListenerC20813);
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        DialogInterfaceOnClickListenerC20813 dialogInterfaceOnClickListenerC20813 = (DialogInterfaceOnClickListenerC20813) this.f62361.get();
        if (dialogInterfaceOnClickListenerC20813 == null) {
            interfaceC24784.getLifecycle().mo21807(this);
        } else if (enumC24133 == EnumC24133.ON_RESUME) {
            dialogInterfaceOnClickListenerC20813.m47013();
        }
    }
}
