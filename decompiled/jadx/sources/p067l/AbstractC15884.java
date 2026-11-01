package p067l;

/* JADX INFO: renamed from: l.ܳ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15884 implements InterfaceC7324 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7324 f45983a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7324 f45984b;

    /* JADX INFO: renamed from: c */
    public final long f45985c;

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: o */
    public final int mo3500o() {
        return 2;
    }

    public AbstractC15884(InterfaceC7324 interfaceC7324, InterfaceC7324 interfaceC7325) {
        this.f45983a = interfaceC7324;
        this.f45984b = interfaceC7325;
        this.f45985c = interfaceC7325.count() + interfaceC7324.count();
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public final InterfaceC7324 mo3496a(int i) {
        if (i == 0) {
            return this.f45983a;
        }
        if (i == 1) {
            return this.f45984b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p067l.InterfaceC7324
    public final long count() {
        return this.f45985c;
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC24758 mo3496a(int i) {
        return (InterfaceC24758) mo3496a(i);
    }
}
