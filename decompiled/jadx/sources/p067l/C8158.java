package p067l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۛܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8158 extends AbstractC22241 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13523 f21527;

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        C13523 c13523 = this.f21527;
        char[] cArr = c13523.f38005;
        int i = c13523.f38006;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] == c) {
                return true;
            }
            i = i2;
        }
    }

    public C8158(C13523 c13523) {
        this.f21527 = c13523;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C14193(this);
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC17480 iterator() {
        return new C14193(this);
    }

    @Override // p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return new C12182(this, 0, this.f21527.f38006);
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public final void mo12109(InterfaceC24857 interfaceC24857) {
        C13523 c13523 = this.f21527;
        char[] cArr = c13523.f38005;
        int i = c13523.f38006;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC24857.mo20276(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f21527.f38006;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f21527.f38006 = 0;
    }
}
