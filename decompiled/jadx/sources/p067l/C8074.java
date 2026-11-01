package p067l;

/* JADX INFO: renamed from: l.ۛۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8074 extends AbstractC18408 implements InterfaceC21152 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C14779 f21297;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8074(C14779 c14779) {
        super(2);
        this.f21297 = c14779;
    }

    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC19790 interfaceC19790 = (InterfaceC19790) obj2;
        InterfaceC19119 key = interfaceC19790.getKey();
        InterfaceC19790 interfaceC19790Mo11134 = this.f21297.f42125.mo11134(key);
        if (key != InterfaceC12175.f34023) {
            return Integer.valueOf(interfaceC19790 != interfaceC19790Mo11134 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        InterfaceC12175 interfaceC12175 = (InterfaceC12175) interfaceC19790Mo11134;
        InterfaceC12175 parent = (InterfaceC12175) interfaceC19790;
        while (true) {
            if (parent != null) {
                if (parent == interfaceC12175 || !(parent instanceof C3262)) {
                    break;
                }
                InterfaceC17264 interfaceC17264M44383 = ((C3262) parent).m44383();
                parent = interfaceC17264M44383 != null ? interfaceC17264M44383.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent != interfaceC12175) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC12175 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
        if (interfaceC12175 != null) {
            iIntValue++;
        }
        return Integer.valueOf(iIntValue);
    }
}
