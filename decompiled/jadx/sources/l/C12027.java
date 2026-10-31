package l;

/* JADX INFO: renamed from: l.ۨ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12027 implements InterfaceC13041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35979;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35980;

    public /* synthetic */ C12027(int i, Object obj) {
        this.f35979 = i;
        this.f35980 = obj;
    }

    @Override // l.InterfaceC13041
    public final void accept(Object obj) {
        switch (this.f35979) {
            case 0:
                AbstractC5180.m14842((AbstractC5180) this.f35980, (Integer) obj);
                break;
            case 1:
                C16477 c16477 = (C16477) this.f35980;
                C10875 c10875 = (C10875) obj;
                c10875.m27172().setText(c16477.m38837());
                c10875.m27174().setText(c16477.m38833());
                break;
            default:
                C21362.m48401((C21362) this.f35980, (String) obj);
                break;
        }
    }
}
