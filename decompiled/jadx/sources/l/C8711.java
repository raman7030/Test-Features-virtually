package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N67V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8711 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26511;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f26512;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7299 f26513;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15765 f26514;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11242 f26515;

    public C8711(InterfaceC7299 interfaceC7299, C14416 c14416, C15765 c15765) {
        this.f26513 = interfaceC7299;
        this.f26515 = c14416;
        this.f26514 = c15765;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22502(int i) {
        this.f26511 = 0;
        this.f26512 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22504(int i, int i2, C7382 c7382, C23589 c23589, C7382 c7383) {
        InterfaceC7299 interfaceC7299 = this.f26513;
        int iMo16505 = interfaceC7299.mo16505(c7382);
        int iMo16506 = ((C14416) this.f26515).mo16505(c23589);
        int iMo16507 = interfaceC7299.mo16505(c7383);
        m22501(i);
        C15765 c15765 = this.f26514;
        if (iMo16507 == -1) {
            c15765.write(3);
            C15765.m37168(c15765, i2);
            C15765.m37168(c15765, iMo16505 + 1);
            C15765.m37168(c15765, iMo16506 + 1);
            return;
        }
        c15765.write(4);
        C15765.m37168(c15765, i2);
        C15765.m37168(c15765, iMo16505 + 1);
        C15765.m37168(c15765, iMo16506 + 1);
        C15765.m37168(c15765, iMo16507 + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22503(int i, int i2) {
        m22501(i);
        C15765 c15765 = this.f26514;
        c15765.write(5);
        C15765.m37168(c15765, i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22509(int i, int i2) {
        m22501(i);
        C15765 c15765 = this.f26514;
        c15765.write(6);
        C15765.m37168(c15765, i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22508(int i) {
        m22501(i);
        this.f26514.write(7);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22506(int i) {
        m22501(i);
        this.f26514.write(8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22507(int i, int i2) {
        int i3 = i2 - this.f26512;
        int i4 = i - this.f26511;
        if (i4 < 0) {
            throw new C15431(null, "debug info items must have non-decreasing code addresses", new Object[0]);
        }
        C15765 c15765 = this.f26514;
        if (i3 < -4 || i3 > 10) {
            if (i3 != 0) {
                c15765.write(2);
                C15765.m37167(c15765, i3);
                this.f26512 = i2;
            }
            i3 = 0;
        }
        if ((i3 < 2 && i4 > 16) || (i3 > 1 && i4 > 15)) {
            m22501(i);
            i4 = 0;
        }
        c15765.write((byte) (i3 + 4 + (i4 * 15) + 10));
        this.f26512 += i3;
        this.f26511 += i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22505(int i, C7382 c7382) {
        m22501(i);
        C15765 c15765 = this.f26514;
        c15765.write(9);
        C15765.m37168(c15765, this.f26513.mo16505(c7382) + 1);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22501(int i) throws IOException {
        int i2 = i - this.f26511;
        if (i2 > 0) {
            C15765 c15765 = this.f26514;
            c15765.write(1);
            c15765.getClass();
            C15765.m37168(c15765, i2);
            this.f26511 = i;
        }
    }
}
