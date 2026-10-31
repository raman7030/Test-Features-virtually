package l;

/* JADX INFO: renamed from: l.ۙܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4735 implements InterfaceC18330 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17624 f15020;

    public AbstractC4735(InterfaceC17624 interfaceC17624) {
        this.f15020 = interfaceC17624;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ InterfaceC14801 mo13851(InterfaceC14801 interfaceC14801) {
        return C16918.m39767(this, interfaceC14801);
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ۧ */
    public /* bridge */ InterfaceC14801 mo9085(InterfaceC17624 interfaceC17624) {
        return C16918.m39768(this, interfaceC17624);
    }

    @Override // l.InterfaceC18330
    public final InterfaceC17624 getKey() {
        return this.f15020;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC18330 mo9082(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        if (C11233.m27802(getKey(), interfaceC17624)) {
            return this;
        }
        return null;
    }

    @Override // l.InterfaceC14801
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo13850(Object obj, InterfaceC19763 interfaceC19763) {
        return interfaceC19763.mo6973(obj, this);
    }
}
