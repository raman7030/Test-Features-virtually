package p067l;

/* JADX INFO: renamed from: l.ۘܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6151 implements InterfaceC24346 {

    /* JADX INFO: renamed from: ֫ */
    public final C4810 f15436;

    /* JADX INFO: renamed from: ۧ */
    public int f15437;

    /* JADX INFO: renamed from: ܽ */
    public final C13618 f15438;

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final int mo8402() {
        return -1;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ܽ */
    public final void mo8409(int i) {
    }

    public C6151(C13618 c13618, C4810 c4810) {
        this.f15438 = c13618;
        this.f15436 = c4810;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final void mo8406() {
        int i = this.f15437 + 1;
        this.f15437 = i;
        if ((i & 1023) == 0) {
            this.f15436.m10153();
        }
        this.f15438.mo8406();
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final int mo8405(int i) {
        int i2 = this.f15437 + 1;
        this.f15437 = i2;
        if ((i2 & 1023) == 0) {
            this.f15436.m10153();
        }
        return this.f15438.mo8405(i);
    }

    @Override // p067l.InterfaceC16219
    public final int index() {
        return this.f15438.index();
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final void mo8403(int i) {
        this.f15438.mo8403(i);
    }

    @Override // p067l.InterfaceC16219
    public final int size() {
        return this.f15438.size();
    }

    @Override // p067l.InterfaceC24346
    /* JADX INFO: renamed from: ֫ */
    public final String mo13949(C16399 c16399) {
        return this.f15438.mo13949(c16399);
    }
}
