package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۨۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBH8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13258 implements InterfaceC8976 {

    /* JADX INFO: renamed from: ֫ */
    public int f37225;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23986 f37226;

    public C13258(C23986 c23986) {
        this.f37226 = c23986;
        this.f37225 = C15268.m34735(0, c23986.f76188);
    }

    @Override // p067l.InterfaceC8976
    public final boolean hasNext() {
        return this.f37225 >= 0;
    }

    @Override // p067l.InterfaceC8976
    public final int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f37225;
        this.f37225 = C15268.m34735(i + 1, this.f37226.f76188);
        return i;
    }
}
