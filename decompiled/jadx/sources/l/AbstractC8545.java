package l;

/* JADX INFO: renamed from: l.ۡ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8545 extends AbstractC2195 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f26117;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15578 f26118;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f26122;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f26123;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f26126;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f26124 = new StringBuilder();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f26125 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f26121 = new StringBuilder();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f26120 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f26119 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f26116 = false;

    @Override // l.AbstractC2195
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC8545 mo7259() {
        super.mo7259();
        this.f26117 = null;
        this.f26122 = null;
        AbstractC2195.m7249(this.f26124);
        this.f26123 = null;
        this.f26125 = false;
        AbstractC2195.m7249(this.f26121);
        this.f26126 = null;
        this.f26119 = false;
        this.f26120 = false;
        this.f26116 = false;
        this.f26118 = null;
        return this;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m22255() {
        String string;
        if (this.f26118 == null) {
            this.f26118 = new C15578();
        }
        boolean z = this.f26125;
        StringBuilder sb = this.f26121;
        StringBuilder sb2 = this.f26124;
        if (z && this.f26118.size() < 512) {
            String strTrim = (sb2.length() > 0 ? sb2.toString() : this.f26123).trim();
            if (strTrim.length() > 0) {
                if (this.f26120) {
                    string = sb.length() > 0 ? sb.toString() : this.f26126;
                } else {
                    string = this.f26119 ? "" : null;
                }
                this.f26118.m36727(strTrim, string);
            }
        }
        AbstractC2195.m7249(sb2);
        this.f26123 = null;
        this.f26125 = false;
        AbstractC2195.m7249(sb);
        this.f26126 = null;
        this.f26120 = false;
        this.f26119 = false;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m22252() {
        return this.f26118 != null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22258() {
        if (this.f26125) {
            m22255();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m22251() {
        String str = this.f26117;
        if (str == null || str.length() == 0) {
            throw new C14167("Must be false");
        }
        return this.f26117;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m22257(String str) {
        this.f26117 = str;
        this.f26122 = C23340.m51750(str.trim());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22256(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.f26117;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.f26117 = strReplace;
        this.f26122 = C23340.m51750(strReplace.trim());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22248(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        this.f26125 = true;
        String str2 = this.f26123;
        StringBuilder sb = this.f26124;
        if (str2 != null) {
            sb.append(str2);
            this.f26123 = null;
        }
        if (sb.length() == 0) {
            this.f26123 = strReplace;
        } else {
            sb.append(strReplace);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22250() {
        this.f26119 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22247(char c) {
        this.f26125 = true;
        String str = this.f26123;
        StringBuilder sb = this.f26124;
        if (str != null) {
            sb.append(str);
            this.f26123 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22249(int[] iArr) {
        this.f26120 = true;
        String str = this.f26126;
        StringBuilder sb = this.f26121;
        if (str != null) {
            sb.append(str);
            this.f26126 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22253(char c) {
        this.f26120 = true;
        String str = this.f26126;
        StringBuilder sb = this.f26121;
        if (str != null) {
            sb.append(str);
            this.f26126 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22254(String str) {
        this.f26120 = true;
        String str2 = this.f26126;
        StringBuilder sb = this.f26121;
        if (str2 != null) {
            sb.append(str2);
            this.f26126 = null;
        }
        if (sb.length() == 0) {
            this.f26126 = str;
        } else {
            sb.append(str);
        }
    }
}
