package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes5.dex */
public class C18701 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public WeakReference f59139;

    public C18701(DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407) {
        this.f59139 = new WeakReference(dialogInterfaceOnClickListenerC19407);
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        DialogInterfaceOnClickListenerC19407 dialogInterfaceOnClickListenerC19407 = (DialogInterfaceOnClickListenerC19407) this.f59139.get();
        if (dialogInterfaceOnClickListenerC19407 == null) {
            interfaceC23586.getLifecycle().mo19834(this);
        } else if (enumC22901 == EnumC22901.ON_RESUME) {
            dialogInterfaceOnClickListenerC19407.m44719();
        }
    }
}
