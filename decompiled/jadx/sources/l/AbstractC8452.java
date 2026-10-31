package l;

/* JADX INFO: renamed from: l.۠᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8452 extends AbstractC2808 {
    public AbstractC8452(InterfaceC11791 interfaceC11791) {
        super(interfaceC11791);
        if (interfaceC11791 != null && interfaceC11791.getContext() != C23974.f77731) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // l.InterfaceC11791
    public final InterfaceC14801 getContext() {
        return C23974.f77731;
    }
}
