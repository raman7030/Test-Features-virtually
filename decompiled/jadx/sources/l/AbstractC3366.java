package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۗܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3366 extends AbstractC14221 implements InterfaceC23558 {
    @Override // l.InterfaceC5214
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC9198.v(this, intFunction);
    }

    @Override // l.InterfaceC23558
    public final void g(Object obj) {
        ((InterfaceC23558) this.a).g(obj);
        ((InterfaceC23558) this.b).g(obj);
    }

    @Override // l.InterfaceC23558
    public final void e(int i, Object obj) {
        InterfaceC5214 interfaceC5214 = this.a;
        ((InterfaceC23558) interfaceC5214).e(i, obj);
        ((InterfaceC23558) this.b).e(i + ((int) ((InterfaceC23558) interfaceC5214).count()), obj);
    }

    @Override // l.InterfaceC23558
    public final Object b() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        e(0, objNewArray);
        return objNewArray;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
