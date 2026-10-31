package l;

/* JADX INFO: renamed from: l.᩶ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19991 extends AbstractC16876 implements InterfaceC19763 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C19991 f64723 = new C19991(2);

    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        InterfaceC18330 interfaceC18330 = (InterfaceC18330) obj2;
        if (!(interfaceC18330 instanceof InterfaceC15941)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? interfaceC18330 : Integer.valueOf(iIntValue + 1);
    }
}
