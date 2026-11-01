package p067l;

import java.util.IllegalFormatPrecisionException;
import java.util.UnknownFormatConversionException;

/* JADX INFO: renamed from: l.᩷ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes4.dex */
public final class C22175 {

    /* JADX INFO: renamed from: ֫ */
    public int f70160;

    /* JADX INFO: renamed from: ۧ */
    public final String f70161;

    /* JADX INFO: renamed from: ܽ */
    public String f70162;

    public C22175(String str, int i) {
        String strM49984;
        this.f70161 = str;
        this.f70160 = i;
        if (m49983()) {
            strM49984 = m49984();
            if (m49981() == '$') {
                m49982();
            } else if (strM49984.charAt(0) == '0') {
                this.f70160 -= strM49984.length();
            }
            strM49984 = null;
        } else {
            strM49984 = null;
        }
        if (strM49984 == null) {
            while (",-(+# 0<".indexOf(m49981()) >= 0) {
                m49982();
            }
        }
        if (strM49984 == null && m49983()) {
            m49984();
        }
        if (m49981() == '.') {
            m49982();
            if (!m49983()) {
                throw new IllegalFormatPrecisionException(m49981());
            }
            m49984();
        }
        if (m49981() == 't' || m49981() == 'T') {
            m49982();
        }
        m49982();
        this.f70162 = str.substring(i - 1, this.f70160);
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m49984() {
        int i = this.f70160;
        while (m49983()) {
            m49982();
        }
        return this.f70161.substring(i, this.f70160);
    }

    /* JADX INFO: renamed from: ܳ */
    private char m49981() {
        int i = this.f70160;
        String str = this.f70161;
        if (i == str.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        return str.charAt(this.f70160);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m49982() {
        if (this.f70160 == this.f70161.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        this.f70160++;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m49983() {
        return this.f70160 != this.f70161.length() && Character.isDigit(m49981());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49985() {
        return this.f70160;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m49986() {
        return this.f70162;
    }
}
