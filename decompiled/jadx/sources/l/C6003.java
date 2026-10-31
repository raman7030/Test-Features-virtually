package l;

/* JADX INFO: renamed from: l.ۛۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AMS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6003 extends AbstractC16876 implements InterfaceC19763 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13058 f18442;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6003(C13058 c13058) {
        super(2);
        this.f18442 = c13058;
    }

    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        InterfaceC18330 interfaceC18330 = (InterfaceC18330) obj2;
        InterfaceC17624 key = interfaceC18330.getKey();
        InterfaceC18330 interfaceC18330Mo9082 = this.f18442.f39077.mo9082(key);
        if (key != InterfaceC10318.f31060) {
            return Integer.valueOf(interfaceC18330 != interfaceC18330Mo9082 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        InterfaceC10318 interfaceC10318 = (InterfaceC10318) interfaceC18330Mo9082;
        InterfaceC10318 parent = (InterfaceC10318) interfaceC18330;
        while (true) {
            if (parent != null) {
                if (parent == interfaceC10318 || !(parent instanceof C0940)) {
                    break;
                }
                InterfaceC15673 interfaceC15673M42131 = ((C0940) parent).m42131();
                parent = interfaceC15673M42131 != null ? interfaceC15673M42131.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent != interfaceC10318) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC10318 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
        if (interfaceC10318 != null) {
            iIntValue++;
        }
        return Integer.valueOf(iIntValue);
    }
}
