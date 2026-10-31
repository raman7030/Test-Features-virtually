package l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩹۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22166 implements InterfaceC16233 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13223 f71937;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14873 f71938;

    public /* synthetic */ C22166(InterfaceC13223 interfaceC13223, C14873 c14873) {
        this.f71937 = interfaceC13223;
        this.f71938 = c14873;
    }

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        String str;
        InterfaceC13223 interfaceC13223;
        AtomicReference atomicReference = (AtomicReference) obj;
        if (atomicReference != null && (str = (String) atomicReference.getAndSet(null)) != null && ((interfaceC13223 = this.f71937) == null || !interfaceC13223.mo135())) {
            this.f71938.mo13218((Object) str);
        }
        return C8058.f24861;
    }
}
