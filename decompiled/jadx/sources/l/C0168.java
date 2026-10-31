package l;

/* JADX INFO: renamed from: l.֡ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0168 implements InterfaceC13965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18514 f1380;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19220 f1381;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C0874 f1382;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19119 f1383 = new C19119();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19220 f1384;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f1385;

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo1294(String str) {
        C19220 c19220 = new C19220();
        c19220.f60523 = str;
        C19220 c19221 = this.f1381;
        C19119 c19119 = this.f1383;
        if (c19221 == null) {
            this.f1381 = c19220;
        } else {
            ((C19220) c19119.m42525()).f60521.add(c19220);
        }
        c19119.add(c19220);
        this.f1384 = c19220;
        this.f1385 = 1;
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1291(String str, String str2) {
        C18514 c18514 = new C18514();
        c18514.f57373 = str;
        c18514.f57377 = str2;
        C19119 c19119 = this.f1383;
        int i = ((C19220) c19119.m42525()).f26371;
        c18514.f57381 = i;
        c18514.f57380 = i;
        ((C19220) c19119.m42525()).f60522.add(c18514);
        this.f1380 = c18514;
        this.f1385 = 2;
    }

    @Override // l.InterfaceC13965
    public final void text(String str) {
        if (this.f1385 == 3) {
            C0874 c0874 = this.f1382;
            CharSequence charSequence = c0874.f3437;
            if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).append(str);
                return;
            }
            StringBuilder sb = new StringBuilder(charSequence);
            sb.append(str);
            c0874.f3437 = sb;
            return;
        }
        C0874 c0875 = new C0874();
        c0875.f3437 = str;
        ((C19220) this.f1383.m42525()).f60521.add(c0875);
        this.f1382 = c0875;
        this.f1385 = 3;
    }

    @Override // l.InterfaceC13965
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1290(String str) {
        if (!((C19220) this.f1383.pop()).f60523.equals(str)) {
            throw new RuntimeException();
        }
        this.f1385 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19220 m1287() {
        if (this.f1381 == null || !this.f1383.isEmpty()) {
            throw new RuntimeException();
        }
        return this.f1381;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1297(int i, int i2, int i3) {
        if (this.f1385 != 1) {
            throw new IllegalStateException();
        }
        C19220 c19220 = this.f1384;
        c19220.f26371 = i;
        c19220.f26369 = i2;
        c19220.f26372 = i3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1296(int i) {
        int i2 = this.f1385;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        this.f1384.f26370 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1289(int i, int i2, int i3) {
        if (this.f1385 != 2) {
            throw new IllegalStateException();
        }
        C18514 c18514 = this.f1380;
        c18514.f57380 = i;
        c18514.f57376 = i2;
        c18514.f57379 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1288(int i) {
        if (this.f1385 != 2) {
            throw new IllegalStateException();
        }
        this.f1380.f57378 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1293(int i, int i2, int i3) {
        if (this.f1385 != 2) {
            throw new IllegalStateException();
        }
        C18514 c18514 = this.f1380;
        c18514.f57381 = i;
        c18514.f57382 = i2;
        c18514.f57375 = i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1292(int i) {
        if (this.f1385 != 2) {
            throw new IllegalStateException();
        }
        this.f1380.f57374 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m1299(int i, int i2, int i3) {
        if (this.f1385 != 3) {
            throw new IllegalStateException();
        }
        C0874 c0874 = this.f1382;
        c0874.f26371 = i;
        c0874.f26369 = i2;
        c0874.f26372 = i3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m1298(int i) {
        if (this.f1385 != 3) {
            throw new IllegalStateException();
        }
        this.f1382.f26370 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m1295() {
        return this.f1385 == 3;
    }
}
