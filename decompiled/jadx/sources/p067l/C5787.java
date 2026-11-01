package p067l;

/* JADX INFO: renamed from: l.ۘ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5787 extends AbstractC10481 {
    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ֫ */
    public final int mo12970(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ۧ */
    public final int mo12971(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC10481
    /* JADX INFO: renamed from: ᩳ */
    public final int mo12972(int i, byte[] bArr) {
        C17856 c17856 = this.f28992;
        int i2 = c17856.f53291;
        c17856.f53291 = 0;
        int iM40548 = c17856.m40548(i, bArr) + i;
        AbstractC10481.m24185(this.f28986, iM40548, bArr);
        AbstractC10481.m24185(this.f29005, iM40548 + 2, bArr);
        int i3 = (iM40548 + 4) - i;
        this.f28992.f53291 = i2;
        return i3;
    }

    @Override // p067l.AbstractC10481
    public final String toString() {
        return new String(C10965.m25286(new StringBuilder("NodeStatusRequest["), super.toString(), "]"));
    }
}
