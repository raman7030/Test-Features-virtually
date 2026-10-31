package l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8HT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8529 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26056;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383[] f26057;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f26058;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26059;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f26060;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f26061 = -9223372036854775807L;

    public C8529(List list) {
        this.f26060 = list;
        this.f26057 = new InterfaceC19383[list.size()];
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f26058 = false;
        this.f26061 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        int i = 0;
        while (true) {
            InterfaceC19383[] interfaceC19383Arr = this.f26057;
            if (i >= interfaceC19383Arr.length) {
                return;
            }
            C2325 c2325 = (C2325) this.f26060.get(i);
            c19259.m44443();
            InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 3);
            C1297 c1297 = new C1297();
            c1297.m4469(c19259.m44444());
            c1297.m4462("video/mp2t");
            c1297.m4465("application/dvbsubs");
            c1297.m4446(Collections.singletonList(c2325.f7459));
            c1297.m4471(c2325.f7460);
            interfaceC19383Mo3429.mo8456(c1297.m4440());
            interfaceC19383Arr[i] = interfaceC19383Mo3429;
            i++;
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f26058 = true;
        this.f26061 = j;
        this.f26059 = 0;
        this.f26056 = 2;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
        if (this.f26058) {
            C22632.m50634(this.f26061 != -9223372036854775807L);
            for (InterfaceC19383 interfaceC19383 : this.f26057) {
                interfaceC19383.mo8455(this.f26061, 1, this.f26059, 0, null);
            }
            this.f26058 = false;
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        boolean z;
        boolean z2;
        if (this.f26058) {
            if (this.f26056 == 2) {
                if (c17714.m41457() == 0) {
                    z2 = false;
                } else {
                    if (c17714.m41456() != 32) {
                        this.f26058 = false;
                    }
                    this.f26056--;
                    z2 = this.f26058;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.f26056 == 1) {
                if (c17714.m41457() == 0) {
                    z = false;
                } else {
                    if (c17714.m41456() != 0) {
                        this.f26058 = false;
                    }
                    this.f26056--;
                    z = this.f26058;
                }
                if (!z) {
                    return;
                }
            }
            int iM41485 = c17714.m41485();
            int iM41457 = c17714.m41457();
            for (InterfaceC19383 interfaceC19383 : this.f26057) {
                c17714.m41484(iM41485);
                interfaceC19383.mo8453(iM41457, c17714);
            }
            this.f26059 += iM41457;
        }
    }
}
