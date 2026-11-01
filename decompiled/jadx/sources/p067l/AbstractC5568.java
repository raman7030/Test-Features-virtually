package p067l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۗܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5568 extends AbstractC15884 implements InterfaceC24758 {
    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object[] mo3499m(IntFunction intFunction) {
        return AbstractC11111.m25620v(this, intFunction);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: g */
    public final void mo4234g(Object obj) {
        ((InterfaceC24758) this.f45983a).mo4234g(obj);
        ((InterfaceC24758) this.f45984b).mo4234g(obj);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: e */
    public final void mo4232e(int i, Object obj) {
        InterfaceC7324 interfaceC7324 = this.f45983a;
        ((InterfaceC24758) interfaceC7324).mo4232e(i, obj);
        ((InterfaceC24758) this.f45984b).mo4232e(i + ((int) ((InterfaceC24758) interfaceC7324).count()), obj);
    }

    @Override // p067l.InterfaceC24758
    /* JADX INFO: renamed from: b */
    public final Object mo4230b() {
        long j = this.f45985c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objNewArray = newArray((int) j);
        mo4232e(0, objNewArray);
        return objNewArray;
    }

    public final String toString() {
        long j = this.f45985c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f45983a, this.f45984b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
