package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۨۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11458 implements InterfaceC6952 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34229;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22746 f34230;

    public C11458(C22746 c22746) {
        this.f34230 = c22746;
        this.f34229 = C13573.m32623(0, c22746.f73462);
    }

    @Override // l.InterfaceC6952
    public final boolean hasNext() {
        return this.f34229 >= 0;
    }

    @Override // l.InterfaceC6952
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f34229;
        this.f34229 = C13573.m32623(i + 1, this.f34230.f73462);
        return i;
    }
}
