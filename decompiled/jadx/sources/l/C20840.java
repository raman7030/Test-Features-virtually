package l;

import java.util.IllegalFormatPrecisionException;
import java.util.UnknownFormatConversionException;

/* JADX INFO: renamed from: l.᩷ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20840 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f67477;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f67478;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f67479;

    public C20840(String str, int i) {
        String strM47656;
        this.f67478 = str;
        this.f67477 = i;
        if (m47655()) {
            strM47656 = m47656();
            if (m47653() == '$') {
                m47654();
            } else if (strM47656.charAt(0) == '0') {
                this.f67477 -= strM47656.length();
            }
            strM47656 = null;
        } else {
            strM47656 = null;
        }
        if (strM47656 == null) {
            while (",-(+# 0<".indexOf(m47653()) >= 0) {
                m47654();
            }
        }
        if (strM47656 == null && m47655()) {
            m47656();
        }
        if (m47653() == '.') {
            m47654();
            if (!m47655()) {
                throw new IllegalFormatPrecisionException(m47653());
            }
            m47656();
        }
        if (m47653() == 't' || m47653() == 'T') {
            m47654();
        }
        m47654();
        this.f67479 = str.substring(i - 1, this.f67477);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m47656() {
        int i = this.f67477;
        while (m47655()) {
            m47654();
        }
        return this.f67478.substring(i, this.f67477);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private char m47653() {
        int i = this.f67477;
        String str = this.f67478;
        if (i == str.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        return str.charAt(this.f67477);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m47654() {
        if (this.f67477 == this.f67478.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        this.f67477++;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m47655() {
        return this.f67477 != this.f67478.length() && Character.isDigit(m47653());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47657() {
        return this.f67477;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m47658() {
        return this.f67479;
    }
}
