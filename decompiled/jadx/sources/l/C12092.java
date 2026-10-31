package l;

/* JADX INFO: renamed from: l.۫֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12092 implements InterfaceC18842 {
    @Override // l.InterfaceC18842
    public final boolean apply(Object obj) {
        InterfaceC20058 interfaceC20058 = (InterfaceC20058) obj;
        if (!(interfaceC20058 instanceof InterfaceC10886)) {
            return false;
        }
        InterfaceC20058 expression = ((InterfaceC10886) interfaceC20058).getExpression();
        return (expression instanceof InterfaceC9680) && ((InterfaceC9680) expression).getType() == null;
    }
}
