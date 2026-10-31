package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֫᩹ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O17J */
/* JADX INFO: loaded from: classes2.dex */
public final class C2120 extends AbstractC21087 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17642 f7082;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11293 f7083;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120(C11293 c11293, C11293 c11294, InterfaceC6975 interfaceC6975) {
        super(c11294, interfaceC6975);
        this.f7083 = c11293;
    }

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo7026() {
        C19697 c19697Mo27937 = this.f7083.mo27937();
        try {
            this.f7082 = c19697Mo27937.m45366(this.f68007.mo23554());
            return this.f7082.m41291();
        } finally {
            c19697Mo27937.f63634 = 0L;
        }
    }

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7024(int i) {
        C19697 c19697Mo27937 = null;
        try {
            c19697Mo27937 = this.f7083.mo27937();
            c19697Mo27937.m45356(this.f68007.mo23554(), i, false, false);
            this.f7083.mo27930();
            c19697Mo27937.f63634 = 0L;
        } catch (IOException unused) {
            if (c19697Mo27937 != null) {
                c19697Mo27937.f63634 = 0L;
            }
        } catch (Throwable th) {
            if (c19697Mo27937 != null) {
                c19697Mo27937.f63634 = 0L;
            }
            throw th;
        }
    }

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo7023() {
        C17642 c17642 = this.f7082;
        if (c17642 == null) {
            return -1L;
        }
        return ((long) c17642.m41283()) | (((long) this.f7082.m41281()) << 32);
    }

    @Override // l.AbstractC21087
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7025(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        C19697 c19697Mo27937 = null;
        try {
            c19697Mo27937 = this.f7083.mo27937();
            c19697Mo27937.m45355(this.f68007.mo23554(), i, i2, false, false);
            this.f7083.mo27930();
            c19697Mo27937.f63634 = 0L;
        } catch (IOException unused) {
            if (c19697Mo27937 != null) {
                c19697Mo27937.f63634 = 0L;
            }
        } catch (Throwable th) {
            if (c19697Mo27937 != null) {
                c19697Mo27937.f63634 = 0L;
            }
            throw th;
        }
    }
}
