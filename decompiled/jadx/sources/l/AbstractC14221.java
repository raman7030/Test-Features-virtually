package l;

/* JADX INFO: renamed from: l.ܳ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14221 implements InterfaceC5214 {
    public final InterfaceC5214 a;
    public final InterfaceC5214 b;
    public final long c;

    @Override // l.InterfaceC5214
    public final int o() {
        return 2;
    }

    public AbstractC14221(InterfaceC5214 interfaceC5214, InterfaceC5214 interfaceC5215) {
        this.a = interfaceC5214;
        this.b = interfaceC5215;
        this.c = interfaceC5215.count() + interfaceC5214.count();
    }

    @Override // l.InterfaceC5214
    public final InterfaceC5214 a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC5214
    public final long count() {
        return this.c;
    }

    @Override // l.InterfaceC5214
    public /* bridge */ /* synthetic */ InterfaceC23558 a(int i) {
        return (InterfaceC23558) a(i);
    }
}
