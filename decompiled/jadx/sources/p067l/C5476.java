package p067l;

import java.util.Iterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.ۗܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5476 extends AbstractC2793 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C13523 f13111;

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C5476(C13523 c13523) {
        this.f13111 = c13523;
    }

    @Override // p067l.InterfaceC7838
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo11024(char c) {
        return this.f13111.m30688(c) != -1;
    }

    @Override // p067l.AbstractC2793
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4381(char c) {
        C13523 c13523 = this.f13111;
        int iM30688 = c13523.m30688(c);
        if (iM30688 == -1) {
            return false;
        }
        int i = (c13523.f38006 - iM30688) - 1;
        char[] cArr = c13523.f38010;
        int i2 = iM30688 + 1;
        System.arraycopy(cArr, i2, cArr, iM30688, i);
        char[] cArr2 = c13523.f38005;
        System.arraycopy(cArr2, i2, cArr2, iM30688, i);
        c13523.f38006--;
        return true;
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21570(this);
    }

    @Override // p067l.AbstractC22241, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC17480 iterator() {
        return new C21570(this);
    }

    @Override // p067l.AbstractC2793, p067l.AbstractC22241, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18307 spliterator() {
        return new C6817(this, 0, this.f13111.f38006);
    }

    @Override // p067l.AbstractC22241, p067l.InterfaceC11447
    /* JADX INFO: renamed from: ֫ */
    public final void mo12109(InterfaceC24857 interfaceC24857) {
        C13523 c13523 = this.f13111;
        char[] cArr = c13523.f38010;
        int i = c13523.f38006;
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC24857.mo20276(cArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13111.f38006;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f13111.f38006 = 0;
    }
}
