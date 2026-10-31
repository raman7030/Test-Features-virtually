package l;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10352 implements InterfaceC6599 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8353 f31154;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4979 f31155;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC17182 f31156;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f31157;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Executor f31158;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f31159;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Surface f31160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12035 f31161;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f31162;

    @Override // l.InterfaceC6599
    public final boolean isInitialized() {
        return true;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8749() {
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8761(C8353 c8353) {
        return true;
    }

    public C10352(C4979 c4979, InterfaceC16427 interfaceC16427) {
        this.f31155 = c4979;
        c4979.m14443(interfaceC16427);
        this.f31161 = new C12035(new C12468(this), c4979);
        this.f31157 = new ArrayDeque();
        this.f31154 = new C1297().m4440();
        this.f31159 = -9223372036854775807L;
        this.f31156 = InterfaceC17182.f52657;
        this.f31158 = new ExecutorC21641();
        this.f31162 = new C22346();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۢ */
    public final void mo8765() {
        this.f31155.m14449();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8773() {
        this.f31155.m14451();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8758(InterfaceC17182 interfaceC17182, Executor executor) {
        this.f31156 = interfaceC17182;
        this.f31158 = executor;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8772() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۧ */
    public final void mo8766(boolean z) {
        if (z) {
            this.f31155.m14450();
        }
        this.f31161.m29396();
        this.f31157.clear();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8762(boolean z) {
        return this.f31155.m14444(z);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ᩻ */
    public final void mo8774() {
        this.f31161.m29402();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8767() {
        return this.f31161.m29401();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ܿ */
    public final Surface mo8771() {
        Surface surface = this.f31160;
        C22632.m50632(surface);
        return surface;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8759(InterfaceC22618 interfaceC22618) {
        this.f31162 = interfaceC22618;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8750(float f) {
        this.f31155.m14445(f);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8755(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8752(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8754(Surface surface, C17008 c17008) {
        this.f31160 = surface;
        this.f31155.m14442(surface);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۡ */
    public final void mo8764() {
        this.f31160 = null;
        this.f31155.m14442((Surface) null);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8751(int i) {
        this.f31155.m14446(i);
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8757(C8353 c8353, long j, int i, List list) {
        C22632.m50634(list.isEmpty());
        int i2 = c8353.f25633;
        int i3 = c8353.f25609;
        C8353 c8354 = this.f31154;
        int i4 = c8354.f25633;
        C12035 c12035 = this.f31161;
        if (i2 != i4 || i3 != c8354.f25609) {
            c12035.m29397(i2, i3);
        }
        float f = c8353.f25596;
        if (f != this.f31154.f25596) {
            this.f31155.m14440(f);
        }
        this.f31154 = c8353;
        if (j != this.f31159) {
            c12035.m29398(i, j);
            this.f31159 = j;
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ۜ */
    public final void mo8763() {
        this.f31155.m14439();
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8760(long j, InterfaceC14359 interfaceC14359) {
        this.f31157.add(interfaceC14359);
        this.f31161.m29399(j);
        this.f31158.execute(new Runnable() { // from class: l.᩶ܳۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f65441.f31156.mo25025();
            }
        });
        return true;
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ֫ */
    public final void mo8753(long j, long j2) {
        try {
            this.f31161.m29400(j, j2);
        } catch (C18273 e) {
            throw new C23532(e, this.f31154);
        }
    }

    @Override // l.InterfaceC6599
    /* JADX INFO: renamed from: ܽ */
    public final void mo8770(boolean z) {
        this.f31155.m14447(z);
    }
}
