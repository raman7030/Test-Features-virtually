package p067l;

/* JADX INFO: renamed from: l.ۗ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QI */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5143 implements InterfaceC20276 {
    @Override // p067l.InterfaceC20276
    public final boolean apply(Object obj) {
        InterfaceC21431 interfaceC21431 = (InterfaceC21431) obj;
        if (!(interfaceC21431 instanceof InterfaceC18943)) {
            return false;
        }
        InterfaceC16446 interfaceC16446M11853 = C5398.m11853((InterfaceC18943) interfaceC21431);
        InterfaceC19157 interfaceC19157M42024of = C18486.m42024of((Object[]) new String[]{"stream", "parallelStream", "toBuilder"});
        C12826.requireNonNull(interfaceC16446M11853);
        return interfaceC19157M42024of.anyMatch(new C20411(1, interfaceC16446M11853));
    }
}
