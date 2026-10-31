package l;

/* JADX INFO: renamed from: l.᩹֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8HW */
/* JADX INFO: loaded from: classes.dex */
public final class C21935 implements InterfaceC15583 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f70241;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f70242;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f70243;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f70245;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f70240 = new C17714(10);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f70244 = -9223372036854775807L;

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1000() {
        this.f70242 = false;
        this.f70244 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 5);
        this.f70241 = interfaceC19383Mo3429;
        C1297 c1297 = new C1297();
        c1297.m4469(c19259.m44444());
        c1297.m4462("video/mp2t");
        c1297.m4465("application/id3");
        interfaceC19383Mo3429.mo8456(c1297.m4440());
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1001(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.f70242 = true;
        this.f70244 = j;
        this.f70245 = 0;
        this.f70243 = 0;
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        C22632.m50632(this.f70241);
        if (this.f70242) {
            int iM41457 = c17714.m41457();
            int i = this.f70243;
            if (i < 10) {
                int iMin = Math.min(iM41457, 10 - i);
                byte[] bArrM41482 = c17714.m41482();
                int iM41485 = c17714.m41485();
                C17714 c17715 = this.f70240;
                System.arraycopy(bArrM41482, iM41485, c17715.m41482(), this.f70243, iMin);
                if (this.f70243 + iMin == 10) {
                    c17715.m41484(0);
                    if (73 != c17715.m41456() || 68 != c17715.m41456() || 51 != c17715.m41456()) {
                        C19956.m46037("Discarding invalid ID3 tag");
                        this.f70242 = false;
                        return;
                    } else {
                        c17715.m41478(3);
                        this.f70245 = c17715.m41467() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM41457, this.f70245 - this.f70243);
            this.f70241.mo8453(iMin2, c17714);
            this.f70243 += iMin2;
        }
    }

    @Override // l.InterfaceC15583
    /* JADX INFO: renamed from: ֫ */
    public final void mo1004(boolean z) {
        int i;
        C22632.m50632(this.f70241);
        if (this.f70242 && (i = this.f70245) != 0 && this.f70243 == i) {
            C22632.m50634(this.f70244 != -9223372036854775807L);
            this.f70241.mo8455(this.f70244, 1, this.f70245, 0, null);
            this.f70242 = false;
        }
    }
}
