package p067l;

/* JADX INFO: renamed from: l.᩶ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21368 extends AbstractC18408 implements InterfaceC21152 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C21368 f67365 = new C21368(2);

    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        InterfaceC19790 interfaceC19790 = (InterfaceC19790) obj2;
        if (!(interfaceC19790 instanceof InterfaceC17519)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? interfaceC19790 : Integer.valueOf(iIntValue + 1);
    }
}
