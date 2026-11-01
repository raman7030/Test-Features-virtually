package p067l;

/* JADX INFO: renamed from: l.ۨ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13799 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f38990;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Object f38991;

    public /* synthetic */ C13799(int i, Object obj) {
        this.f38990 = i;
        this.f38991 = obj;
    }

    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        switch (this.f38990) {
            case 0:
                AbstractC7291.m16752((AbstractC7291) this.f38991, (Integer) obj);
                break;
            case 1:
                C18028 c18028 = (C18028) this.f38991;
                C12704 c12704 = (C12704) obj;
                c12704.m29217().setText(c18028.m41063());
                c12704.m29219().setText(c18028.m41059());
                break;
            default:
                C22671.m50737((C22671) this.f38991, (String) obj);
                break;
        }
    }
}
