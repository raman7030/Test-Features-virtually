package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۚ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5347 extends AbstractC8169 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f16664;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f16665;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14518 f16666;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f16667;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f16668;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f16669;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f16670;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f16671;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public StringBuilder f16672;

    public AbstractC5347(EnumC1113 enumC1113) {
        super(enumC1113);
        this.f16672 = new StringBuilder();
        this.f16668 = false;
        this.f16670 = false;
        this.f16671 = false;
    }

    @Override // l.AbstractC8169
    /* JADX INFO: renamed from: ֫ */
    public AbstractC5347 mo1924() {
        this.f16665 = null;
        this.f16669 = null;
        this.f16667 = null;
        AbstractC8169.m21645(this.f16672);
        this.f16664 = null;
        this.f16668 = false;
        this.f16670 = false;
        this.f16671 = false;
        this.f16666 = null;
        return this;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m15312() {
        String string;
        if (this.f16666 == null) {
            this.f16666 = new C14518();
        }
        String str = this.f16667;
        StringBuilder sb = this.f16672;
        if (str != null) {
            String strTrim = str.trim();
            this.f16667 = strTrim;
            if (strTrim.length() > 0) {
                if (this.f16670) {
                    string = sb.length() > 0 ? sb.toString() : this.f16664;
                } else {
                    string = this.f16668 ? "" : null;
                }
                this.f16666.put(this.f16667, string);
            }
        }
        this.f16667 = null;
        this.f16668 = false;
        this.f16670 = false;
        AbstractC8169.m21645(sb);
        this.f16664 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15306() {
        if (this.f16667 != null) {
            m15312();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m15309() {
        String str = this.f16665;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.f16665;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15310(String str) {
        String str2 = this.f16665;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f16665 = str;
        this.f16669 = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15304(String str) {
        String str2 = this.f16667;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f16667 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15303(char c) {
        m15304(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15311() {
        this.f16668 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15305(int[] iArr) {
        this.f16670 = true;
        String str = this.f16664;
        StringBuilder sb = this.f16672;
        if (str != null) {
            sb.append(str);
            this.f16664 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15307(char c) {
        this.f16670 = true;
        String str = this.f16664;
        StringBuilder sb = this.f16672;
        if (str != null) {
            sb.append(str);
            this.f16664 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15308(String str) {
        this.f16670 = true;
        String str2 = this.f16664;
        StringBuilder sb = this.f16672;
        if (str2 != null) {
            sb.append(str2);
            this.f16664 = null;
        }
        if (sb.length() == 0) {
            this.f16664 = str;
        } else {
            sb.append(str);
        }
    }
}
