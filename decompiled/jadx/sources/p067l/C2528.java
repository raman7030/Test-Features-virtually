package p067l;

/* JADX INFO: renamed from: l.֡ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1FE */
/* JADX INFO: loaded from: classes2.dex */
public final class C2528 implements InterfaceC15641 {

    /* JADX INFO: renamed from: ֫ */
    public C19964 f4154;

    /* JADX INFO: renamed from: ۧ */
    public C20635 f4155;

    /* JADX INFO: renamed from: ܳ */
    public C3199 f4156;

    /* JADX INFO: renamed from: ܽ */
    public C20539 f4157 = new C20539();

    /* JADX INFO: renamed from: ܿ */
    public C20635 f4158;

    /* JADX INFO: renamed from: ᩳ */
    public int f4159;

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ۧ */
    public final void mo3702(String str) {
        C20635 c20635 = new C20635();
        c20635.f63754 = str;
        C20635 c20636 = this.f4155;
        C20539 c20539 = this.f4157;
        if (c20636 == null) {
            this.f4155 = c20635;
        } else {
            ((C20635) c20539.m44784()).f63752.add(c20635);
        }
        c20539.add(c20635);
        this.f4158 = c20635;
        this.f4159 = 1;
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3699(String str, String str2) {
        C19964 c19964 = new C19964();
        c19964.f60594 = str;
        c19964.f60598 = str2;
        C20539 c20539 = this.f4157;
        int i = ((C20635) c20539.m44784()).f29289;
        c19964.f60602 = i;
        c19964.f60601 = i;
        ((C20635) c20539.m44784()).f63753.add(c19964);
        this.f4154 = c19964;
        this.f4159 = 2;
    }

    @Override // p067l.InterfaceC15641
    public final void text(String str) {
        if (this.f4159 == 3) {
            C3199 c3199 = this.f4156;
            CharSequence charSequence = c3199.f6210;
            if (charSequence instanceof StringBuilder) {
                ((StringBuilder) charSequence).append(str);
                return;
            }
            StringBuilder sb = new StringBuilder(charSequence);
            sb.append(str);
            c3199.f6210 = sb;
            return;
        }
        C3199 c31910 = new C3199();
        c31910.f6210 = str;
        ((C20635) this.f4157.m44784()).f63752.add(c31910);
        this.f4156 = c31910;
        this.f4159 = 3;
    }

    @Override // p067l.InterfaceC15641
    /* JADX INFO: renamed from: ֫ */
    public final void mo3698(String str) {
        if (!((C20635) this.f4157.pop()).f63754.equals(str)) {
            throw new RuntimeException();
        }
        this.f4159 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20635 m3695() {
        if (this.f4155 == null || !this.f4157.isEmpty()) {
            throw new RuntimeException();
        }
        return this.f4155;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m3705(int i, int i2, int i3) {
        if (this.f4159 != 1) {
            throw new IllegalStateException();
        }
        C20635 c20635 = this.f4158;
        c20635.f29289 = i;
        c20635.f29287 = i2;
        c20635.f29290 = i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m3704(int i) {
        int i2 = this.f4159;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        this.f4158.f29288 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3697(int i, int i2, int i3) {
        if (this.f4159 != 2) {
            throw new IllegalStateException();
        }
        C19964 c19964 = this.f4154;
        c19964.f60601 = i;
        c19964.f60597 = i2;
        c19964.f60600 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3696(int i) {
        if (this.f4159 != 2) {
            throw new IllegalStateException();
        }
        this.f4154.f60599 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3701(int i, int i2, int i3) {
        if (this.f4159 != 2) {
            throw new IllegalStateException();
        }
        C19964 c19964 = this.f4154;
        c19964.f60602 = i;
        c19964.f60603 = i2;
        c19964.f60596 = i3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3700(int i) {
        if (this.f4159 != 2) {
            throw new IllegalStateException();
        }
        this.f4154.f60595 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m3707(int i, int i2, int i3) {
        if (this.f4159 != 3) {
            throw new IllegalStateException();
        }
        C3199 c3199 = this.f4156;
        c3199.f29289 = i;
        c3199.f29287 = i2;
        c3199.f29290 = i3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m3706(int i) {
        if (this.f4159 != 3) {
            throw new IllegalStateException();
        }
        this.f4156.f29288 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m3703() {
        return this.f4159 == 3;
    }
}
