package p067l;

/* JADX INFO: renamed from: l.ۢۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P61M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11259 extends AbstractC21988 {

    /* JADX INFO: renamed from: ֫ */
    public int f31354;

    /* JADX INFO: renamed from: ۧ */
    public boolean f31355;

    /* JADX INFO: renamed from: ܽ */
    public boolean f31356;

    /* JADX INFO: renamed from: ᩳ */
    public final StringBuilder f31357;

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21988 mo26166() {
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21988 mo26172() {
        return this;
    }

    public C11259() {
        this(new StringBuilder());
    }

    public C11259(StringBuilder sb) {
        this.f31354 = 1;
        this.f31357 = sb;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۧ */
    public final void mo26168(String str) {
        boolean z = this.f31355;
        StringBuilder sb = this.f31357;
        if (!z) {
            this.f31355 = true;
            sb.append('<');
        }
        sb.append(str);
        sb.append(':');
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC21988 mo26169() {
        this.f31357.append(':');
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC21988 mo26173() {
        this.f31357.append('^');
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ֫ */
    public final void mo26162(char c) {
        this.f31357.append(c);
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩳ */
    public final void mo26174(String str) {
        StringBuilder sb = this.f31357;
        sb.append('T');
        sb.append(str);
        sb.append(';');
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21988 mo26161() {
        this.f31357.append('[');
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ֫ */
    public final void mo26163(String str) {
        StringBuilder sb = this.f31357;
        sb.append('L');
        sb.append(str);
        this.f31354 <<= 1;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۢ */
    public final void mo26165() {
        int i = this.f31354;
        int i2 = i & 1;
        StringBuilder sb = this.f31357;
        if (i2 == 0) {
            this.f31354 = i | 1;
            sb.append('<');
        }
        sb.append('*');
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21988 mo26167(char c) {
        int i = this.f31354;
        int i2 = i & 1;
        StringBuilder sb = this.f31357;
        if (i2 == 0) {
            this.f31354 = i | 1;
            sb.append('<');
        }
        if (c != '=') {
            sb.append(c);
        }
        return (this.f31354 & Integer.MIN_VALUE) == 0 ? this : new C11259(sb);
    }

    public final String toString() {
        return this.f31357.toString();
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC21988 mo26164() {
        boolean z = this.f31355;
        StringBuilder sb = this.f31357;
        if (z) {
            this.f31355 = false;
            sb.append('>');
        }
        if (!this.f31356) {
            sb.append('(');
        }
        sb.append(')');
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩷ */
    public final AbstractC21988 mo26175() {
        if (this.f31355) {
            this.f31355 = false;
            this.f31357.append('>');
        }
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC21988 mo26176() {
        boolean z = this.f31355;
        StringBuilder sb = this.f31357;
        if (z) {
            this.f31355 = false;
            sb.append('>');
        }
        if (!this.f31356) {
            this.f31356 = true;
            sb.append('(');
        }
        return this;
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܽ */
    public final void mo26170() {
        int i = this.f31354 & 1;
        StringBuilder sb = this.f31357;
        if (i == 1) {
            sb.append('>');
        }
        this.f31354 >>>= 1;
        sb.append(';');
    }

    @Override // p067l.AbstractC21988
    /* JADX INFO: renamed from: ܽ */
    public final void mo26171(String str) {
        int i = this.f31354 & 1;
        StringBuilder sb = this.f31357;
        if (i == 1) {
            sb.append('>');
        }
        this.f31354 >>>= 1;
        sb.append('.');
        sb.append(str);
        this.f31354 <<= 1;
    }
}
