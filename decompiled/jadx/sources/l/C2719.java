package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBI6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2719 implements InterfaceC6952 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f8489 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4130 f8490;

    public C2719(C4130 c4130) {
        this.f8490 = c4130;
    }

    @Override // l.InterfaceC6952
    public final boolean hasNext() {
        return this.f8489 < this.f8490.f13092.size();
    }

    @Override // l.InterfaceC6952
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C21064 c21064 = this.f8490.f13092;
        int i = this.f8489;
        this.f8489 = i + 1;
        return c21064.get(i);
    }
}
