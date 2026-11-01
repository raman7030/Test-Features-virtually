package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۚ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7450 extends AbstractC10132 {

    /* JADX INFO: renamed from: ۜ */
    public String f19503;

    /* JADX INFO: renamed from: ۢ */
    public String f19504;

    /* JADX INFO: renamed from: ۧ */
    public C16166 f19505;

    /* JADX INFO: renamed from: ܳ */
    public String f19506;

    /* JADX INFO: renamed from: ܽ */
    public boolean f19507;

    /* JADX INFO: renamed from: ܿ */
    public String f19508;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f19509;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f19510;

    /* JADX INFO: renamed from: ᩻ */
    public StringBuilder f19511;

    public AbstractC7450(EnumC3426 enumC3426) {
        super(enumC3426);
        this.f19511 = new StringBuilder();
        this.f19507 = false;
        this.f19509 = false;
        this.f19510 = false;
    }

    @Override // p067l.AbstractC10132
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7450 mo4316() {
        this.f19504 = null;
        this.f19508 = null;
        this.f19506 = null;
        AbstractC10132.m23614(this.f19511);
        this.f19503 = null;
        this.f19507 = false;
        this.f19509 = false;
        this.f19510 = false;
        this.f19505 = null;
        return this;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m17220() {
        String string;
        if (this.f19505 == null) {
            this.f19505 = new C16166();
        }
        String str = this.f19506;
        StringBuilder sb = this.f19511;
        if (str != null) {
            String strTrim = str.trim();
            this.f19506 = strTrim;
            if (strTrim.length() > 0) {
                if (this.f19509) {
                    string = sb.length() > 0 ? sb.toString() : this.f19503;
                } else {
                    string = this.f19507 ? "" : null;
                }
                this.f19505.put(this.f19506, string);
            }
        }
        this.f19506 = null;
        this.f19507 = false;
        this.f19509 = false;
        AbstractC10132.m23614(sb);
        this.f19503 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17214() {
        if (this.f19506 != null) {
            m17220();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m17217() {
        String str = this.f19504;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.f19504;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17218(String str) {
        String str2 = this.f19504;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f19504 = str;
        this.f19508 = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17212(String str) {
        String str2 = this.f19506;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f19506 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17211(char c) {
        m17212(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m17219() {
        this.f19507 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17213(int[] iArr) {
        this.f19509 = true;
        String str = this.f19503;
        StringBuilder sb = this.f19511;
        if (str != null) {
            sb.append(str);
            this.f19503 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17215(char c) {
        this.f19509 = true;
        String str = this.f19503;
        StringBuilder sb = this.f19511;
        if (str != null) {
            sb.append(str);
            this.f19503 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17216(String str) {
        this.f19509 = true;
        String str2 = this.f19503;
        StringBuilder sb = this.f19511;
        if (str2 != null) {
            sb.append(str2);
            this.f19503 = null;
        }
        if (sb.length() == 0) {
            this.f19503 = str;
        } else {
            sb.append(str);
        }
    }
}
