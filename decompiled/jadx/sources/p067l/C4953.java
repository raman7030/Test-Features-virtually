package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4953 implements InterfaceC8976 {

    /* JADX INFO: renamed from: ֫ */
    public int f11284 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C6294 f11285;

    public C4953(C6294 c6294) {
        this.f11285 = c6294;
    }

    @Override // p067l.InterfaceC8976
    public final boolean hasNext() {
        return this.f11284 < this.f11285.f15906.size();
    }

    @Override // p067l.InterfaceC8976
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C22388 c22388 = this.f11285.f15906;
        int i = this.f11284;
        this.f11284 = i + 1;
        return c22388.get(i);
    }
}
