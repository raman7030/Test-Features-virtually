package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67MK */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13941 implements InterfaceC18218 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f41622 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f41623;

    public AbstractC13941(long j) {
        this.f41623 = j;
    }

    @Override // l.InterfaceC18218
    public final boolean next() {
        long j = this.f41622 + 1;
        this.f41622 = j;
        return !(j > this.f41623);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33382() {
        long j = this.f41622;
        if (j < 0 || j > this.f41623) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m33383() {
        return this.f41622;
    }
}
