package p067l;

/* JADX INFO: renamed from: l.ۡ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10489 extends AbstractC4454 {

    /* JADX INFO: renamed from: ۘ */
    public String f29032;

    /* JADX INFO: renamed from: ۜ */
    public C17173 f29033;

    /* JADX INFO: renamed from: ܺ */
    public String f29037;

    /* JADX INFO: renamed from: ܿ */
    public String f29038;

    /* JADX INFO: renamed from: ᩻ */
    public String f29041;

    /* JADX INFO: renamed from: ᩳ */
    public final StringBuilder f29039 = new StringBuilder();

    /* JADX INFO: renamed from: ᩷ */
    public boolean f29040 = false;

    /* JADX INFO: renamed from: ܳ */
    public final StringBuilder f29036 = new StringBuilder();

    /* JADX INFO: renamed from: ۢ */
    public boolean f29035 = false;

    /* JADX INFO: renamed from: ۡ */
    public boolean f29034 = false;

    /* JADX INFO: renamed from: ۖ */
    public boolean f29031 = false;

    @Override // p067l.AbstractC4454
    /* JADX INFO: renamed from: ᩻, reason: merged with bridge method [inline-methods] */
    public AbstractC10489 mo9338() {
        super.mo9338();
        this.f29032 = null;
        this.f29037 = null;
        AbstractC4454.m9328(this.f29039);
        this.f29038 = null;
        this.f29040 = false;
        AbstractC4454.m9328(this.f29036);
        this.f29041 = null;
        this.f29034 = false;
        this.f29035 = false;
        this.f29031 = false;
        this.f29033 = null;
        return this;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m24223() {
        String string;
        if (this.f29033 == null) {
            this.f29033 = new C17173();
        }
        boolean z = this.f29040;
        StringBuilder sb = this.f29036;
        StringBuilder sb2 = this.f29039;
        if (z && this.f29033.size() < 512) {
            String strTrim = (sb2.length() > 0 ? sb2.toString() : this.f29038).trim();
            if (strTrim.length() > 0) {
                if (this.f29035) {
                    string = sb.length() > 0 ? sb.toString() : this.f29041;
                } else {
                    string = this.f29034 ? "" : null;
                }
                this.f29033.m38888(strTrim, string);
            }
        }
        AbstractC4454.m9328(sb2);
        this.f29038 = null;
        this.f29040 = false;
        AbstractC4454.m9328(sb);
        this.f29041 = null;
        this.f29035 = false;
        this.f29034 = false;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m24220() {
        return this.f29033 != null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m24226() {
        if (this.f29040) {
            m24223();
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m24219() {
        String str = this.f29032;
        if (str == null || str.length() == 0) {
            throw new C15832("Must be false");
        }
        return this.f29032;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m24225(String str) {
        this.f29032 = str;
        this.f29037 = C24550.m54147(str.trim());
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24224(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.f29032;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.f29032 = strReplace;
        this.f29037 = C24550.m54147(strReplace.trim());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24216(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        this.f29040 = true;
        String str2 = this.f29038;
        StringBuilder sb = this.f29039;
        if (str2 != null) {
            sb.append(str2);
            this.f29038 = null;
        }
        if (sb.length() == 0) {
            this.f29038 = strReplace;
        } else {
            sb.append(strReplace);
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m24218() {
        this.f29034 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24215(char c) {
        this.f29040 = true;
        String str = this.f29038;
        StringBuilder sb = this.f29039;
        if (str != null) {
            sb.append(str);
            this.f29038 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24217(int[] iArr) {
        this.f29035 = true;
        String str = this.f29041;
        StringBuilder sb = this.f29036;
        if (str != null) {
            sb.append(str);
            this.f29041 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24221(char c) {
        this.f29035 = true;
        String str = this.f29041;
        StringBuilder sb = this.f29036;
        if (str != null) {
            sb.append(str);
            this.f29041 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24222(String str) {
        this.f29035 = true;
        String str2 = this.f29041;
        StringBuilder sb = this.f29036;
        if (str2 != null) {
            sb.append(str2);
            this.f29041 = null;
        }
        if (sb.length() == 0) {
            this.f29041 = str;
        } else {
            sb.append(str);
        }
    }
}
