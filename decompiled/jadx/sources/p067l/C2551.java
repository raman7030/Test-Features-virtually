package p067l;

import java.text.ParsePosition;

/* JADX INFO: renamed from: l.֡ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public class C2551 {

    /* JADX INFO: renamed from: a */
    public String f4203a;

    /* JADX INFO: renamed from: b */
    public String f4204b;

    /* JADX INFO: renamed from: c */
    public final char f4205c;

    /* JADX INFO: renamed from: d */
    public C2551 f4206d;

    /* JADX INFO: renamed from: e */
    public C2551 f4207e;

    /* JADX INFO: renamed from: b */
    public boolean mo3743b(char c, char c2) {
        return c == c2;
    }

    public C2551(String str, String str2, C2551 c2551) {
        this.f4203a = str;
        this.f4204b = str2;
        this.f4206d = c2551;
        if (str.isEmpty()) {
            this.f4205c = (char) 65535;
        } else {
            this.f4205c = this.f4203a.charAt(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m3744c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo3746e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f4203a.length() + index;
        C2551 c2551 = this.f4206d;
        if (c2551 != null && length2 != length) {
            while (!mo3743b(c2551.f4205c, charSequence.charAt(length2))) {
                c2551 = c2551.f4207e;
                if (c2551 == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strM3744c = c2551.m3744c(charSequence, parsePosition);
            if (strM3744c != null) {
                return strM3744c;
            }
        }
        parsePosition.setIndex(length2);
        return this.f4204b;
    }

    /* JADX INFO: renamed from: d */
    public C2551 mo3745d(String str, String str2, C2551 c2551) {
        return new C2551(str, str2, c2551);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo3746e(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f4203a, i);
        }
        int length = this.f4203a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!mo3743b(this.f4203a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3742a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f4203a.length() && mo3743b(str.charAt(i), this.f4203a.charAt(i))) {
            i++;
        }
        if (i == this.f4203a.length()) {
            if (i < str.length()) {
                String strSubstring = str.substring(i);
                for (C2551 c2551 = this.f4206d; c2551 != null; c2551 = c2551.f4207e) {
                    if (mo3743b(c2551.f4205c, strSubstring.charAt(0))) {
                        return c2551.m3742a(strSubstring, str2);
                    }
                }
                C2551 c2551Mo3745d = mo3745d(strSubstring, str2, null);
                c2551Mo3745d.f4207e = this.f4206d;
                this.f4206d = c2551Mo3745d;
                return true;
            }
            this.f4204b = str2;
            return true;
        }
        C2551 c2551Mo3745d2 = mo3745d(this.f4203a.substring(i), this.f4204b, this.f4206d);
        this.f4203a = str.substring(0, i);
        this.f4206d = c2551Mo3745d2;
        if (i < str.length()) {
            this.f4206d.f4207e = mo3745d(str.substring(i), str2, null);
            this.f4204b = null;
            return true;
        }
        this.f4204b = str2;
        return true;
    }
}
