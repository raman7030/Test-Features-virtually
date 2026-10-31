package l;

/* JADX INFO: renamed from: l.ۢۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P61M */
/* JADX INFO: loaded from: classes3.dex */
public final class C9355 extends AbstractC20644 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f28405;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f28406;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f28407;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f28408;

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24156() {
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24162() {
        return this;
    }

    public C9355() {
        this(new StringBuilder());
    }

    public C9355(StringBuilder sb) {
        this.f28405 = 1;
        this.f28408 = sb;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo24158(String str) {
        boolean z = this.f28406;
        StringBuilder sb = this.f28408;
        if (!z) {
            this.f28406 = true;
            sb.append('<');
        }
        sb.append(str);
        sb.append(':');
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24159() {
        this.f28408.append(':');
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24163() {
        this.f28408.append('^');
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24152(char c) {
        this.f28408.append(c);
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo24164(String str) {
        StringBuilder sb = this.f28408;
        sb.append('T');
        sb.append(str);
        sb.append(';');
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24151() {
        this.f28408.append('[');
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24153(String str) {
        StringBuilder sb = this.f28408;
        sb.append('L');
        sb.append(str);
        this.f28405 <<= 1;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo24155() {
        int i = this.f28405;
        int i2 = i & 1;
        StringBuilder sb = this.f28408;
        if (i2 == 0) {
            this.f28405 = i | 1;
            sb.append('<');
        }
        sb.append('*');
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24157(char c) {
        int i = this.f28405;
        int i2 = i & 1;
        StringBuilder sb = this.f28408;
        if (i2 == 0) {
            this.f28405 = i | 1;
            sb.append('<');
        }
        if (c != '=') {
            sb.append(c);
        }
        return (this.f28405 & Integer.MIN_VALUE) == 0 ? this : new C9355(sb);
    }

    public final String toString() {
        return this.f28408.toString();
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24154() {
        boolean z = this.f28406;
        StringBuilder sb = this.f28408;
        if (z) {
            this.f28406 = false;
            sb.append('>');
        }
        if (!this.f28407) {
            sb.append('(');
        }
        sb.append(')');
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24165() {
        if (this.f28406) {
            this.f28406 = false;
            this.f28408.append('>');
        }
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC20644 mo24166() {
        boolean z = this.f28406;
        StringBuilder sb = this.f28408;
        if (z) {
            this.f28406 = false;
            sb.append('>');
        }
        if (!this.f28407) {
            this.f28407 = true;
            sb.append('(');
        }
        return this;
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo24160() {
        int i = this.f28405 & 1;
        StringBuilder sb = this.f28408;
        if (i == 1) {
            sb.append('>');
        }
        this.f28405 >>>= 1;
        sb.append(';');
    }

    @Override // l.AbstractC20644
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo24161(String str) {
        int i = this.f28405 & 1;
        StringBuilder sb = this.f28408;
        if (i == 1) {
            sb.append('>');
        }
        this.f28405 >>>= 1;
        sb.append('.');
        sb.append(str);
        this.f28405 <<= 1;
    }
}
