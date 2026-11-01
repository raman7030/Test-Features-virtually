package p067l;

/* JADX INFO: renamed from: l.۫ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W7RE */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14245 implements InterfaceC21152 {
    @Override // p067l.InterfaceC21152
    /* JADX INFO: renamed from: ֫ */
    public final Object mo9100(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC19790 interfaceC19790 = (InterfaceC19790) obj2;
        C13045.m29867(str, "acc");
        C13045.m29867(interfaceC19790, "element");
        if (str.length() == 0) {
            return interfaceC19790.toString();
        }
        return str + ", " + interfaceC19790;
    }
}
