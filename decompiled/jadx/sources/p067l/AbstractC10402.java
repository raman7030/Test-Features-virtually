package p067l;

/* JADX INFO: renamed from: l.۠᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10402 extends AbstractC5038 {
    public AbstractC10402(InterfaceC13575 interfaceC13575) {
        super(interfaceC13575);
        if (interfaceC13575 != null && interfaceC13575.getContext() != C25154.f80484) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p067l.InterfaceC13575
    public final InterfaceC16436 getContext() {
        return C25154.f80484;
    }
}
