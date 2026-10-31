package l;

/* JADX INFO: renamed from: l.۫ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W7RE */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12496 implements InterfaceC19763 {
    @Override // l.InterfaceC19763
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6973(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC18330 interfaceC18330 = (InterfaceC18330) obj2;
        C11233.m27805(str, "acc");
        C11233.m27805(interfaceC18330, "element");
        if (str.length() == 0) {
            return interfaceC18330.toString();
        }
        return str + ", " + interfaceC18330;
    }
}
