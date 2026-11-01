package p067l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩹۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23435 implements InterfaceC17797 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC14936 f74659;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C16503 f74660;

    public /* synthetic */ C23435(InterfaceC14936 interfaceC14936, C16503 c16503) {
        this.f74659 = interfaceC14936;
        this.f74660 = c16503;
    }

    @Override // p067l.InterfaceC17797
    public final Object invoke(Object obj) {
        String str;
        InterfaceC14936 interfaceC14936;
        AtomicReference atomicReference = (AtomicReference) obj;
        if (atomicReference != null && (str = (String) atomicReference.getAndSet(null)) != null && ((interfaceC14936 = this.f74659) == null || !interfaceC14936.mo133())) {
            this.f74660.mo15100((Object) str);
        }
        return C10027.f27775;
    }
}
