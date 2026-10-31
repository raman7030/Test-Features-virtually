package l;

import android.text.TextUtils;
import com.alipay.sdk.m.p.a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20334 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11459 f65644 = C11459.m28260("\\n *\\.(end +)?([afm][a-z]+)");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12392 f65645;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f65646;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f65647;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20334 m46645(CharSequence charSequence) {
        return new C20334(charSequence);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    public C20334(CharSequence charSequence) {
        this.f65647 = charSequence;
        C12164 c12164Matcher = f65644.matcher(charSequence);
        LinkedList<C22450> linkedList = new LinkedList();
        while (true) {
            if (c12164Matcher.find()) {
                int i = c12164Matcher.start(1) != -1 ? 1 : 0;
                String strGroup = c12164Matcher.group(2);
                strGroup.getClass();
                switch (strGroup) {
                    case "annotation":
                        linkedList.addFirst(new C22450(i, c12164Matcher.start(2)));
                        break;
                    case "method":
                        linkedList.addFirst(new C22450(i != 0 ? 5 : 4, c12164Matcher.start(2)));
                        break;
                    case "field":
                        linkedList.addFirst(new C22450(i == 0 ? 2 : 3, c12164Matcher.start(2)));
                        break;
                }
            } else {
                LinkedList linkedList2 = new LinkedList();
                boolean z = false;
                for (C22450 c22450 : linkedList) {
                    int i2 = c22450.f72710;
                    if (i2 == 2) {
                        if (z) {
                            z = false;
                        } else {
                            linkedList2.addFirst(new C22450(3, c22450.f72709));
                        }
                        linkedList2.addFirst(c22450);
                    } else if (i2 == 3) {
                        linkedList2.addFirst(c22450);
                        z = true;
                    } else {
                        linkedList2.addFirst(c22450);
                    }
                }
                this.f65646 = C20195.unmodifiableList(linkedList2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46654(C12392 c12392) {
        this.f65645 = c12392;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46652(String str, int i, int i2, String str2) {
        C12164 c12164Matcher = C5517.f17080.matcher(this.f65647);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C22450 c22450 : this.f65646) {
            int i5 = c22450.f72710;
            int i6 = c22450.f72709;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        i4++;
                        if (c12164Matcher.lookingAt(i6) && str.equals(c12164Matcher.m29597("name")) && str2.equals(c12164Matcher.m29597("type"))) {
                            iStart = c12164Matcher.start();
                            z = true;
                        }
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            i4++;
                        } else if (i5 != 5) {
                        }
                    } else if (z) {
                        z = false;
                    }
                } else if (z && z2 && i4 == 2) {
                    m46647(i2, iStart, i6);
                    return;
                }
                i4--;
            } else {
                i4++;
                if (z && !z2 && i4 == 2) {
                    i3++;
                    if (i3 == i) {
                        z2 = true;
                    }
                    iStart = i6;
                }
            }
        }
        m46646(iStart);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46653(String str, int i, String str2, String str3, int i2) {
        C12164 c12164Matcher = C5517.f17081.matcher(this.f65647);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C22450 c22450 : this.f65646) {
            int i5 = c22450.f72710;
            int i6 = c22450.f72709;
            if (i5 == 0) {
                i4++;
                if (z && !z2 && i4 == 2) {
                    i3++;
                    if (i3 == i) {
                        z2 = true;
                    }
                    iStart = i6;
                }
            } else if (i5 == 1) {
                if (z && z2 && i4 == 2) {
                    m46647(i2, iStart, i6);
                    return;
                }
                i4--;
            } else if (i5 == 2) {
                i4++;
            } else if (i5 == 3) {
                i4--;
            } else if (i5 == 4) {
                i4++;
                if (c12164Matcher.lookingAt(i6)) {
                    if (str.equals(c12164Matcher.m29597("name"))) {
                        if (str2.equals(c12164Matcher.m29597("parameters"))) {
                            if (str3.equals(c12164Matcher.m29597("type"))) {
                                iStart = c12164Matcher.start();
                                z = true;
                            }
                        }
                    }
                }
            } else if (i5 == 5) {
                if (z) {
                    z = false;
                }
                i4--;
            }
        }
        m46646(iStart);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46651(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = -1;
        for (C22450 c22450 : this.f65646) {
            int i6 = c22450.f72710;
            int i7 = c22450.f72709;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                }
                            }
                        }
                    }
                    i4++;
                } else if (z && i4 == 1) {
                    m46647(i2, i3, i7);
                    return;
                }
                i4--;
            } else {
                i4++;
                if (!z && i4 == 1) {
                    i5++;
                    if (i5 == i) {
                        z = true;
                    }
                    i3 = i7;
                }
            }
        }
        m46646(i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46646(int i) {
        this.f65645.mo25919(i);
        this.f65645.invalidate();
        this.f65645.m30537();
        this.f65645.m30427(i, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46648(int i, int i2) {
        this.f65645.mo25922(i, i2);
        this.f65645.invalidate();
        this.f65645.m30537();
        this.f65645.m30427(i, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46647(int i, int i2, int i3) {
        char cM26313;
        boolean z;
        CharSequence charSequence = this.f65647;
        C10456 c10456 = new C10456(i2, i3, charSequence);
        if (c10456.m26309(a.h) && (i = i - 1) < 0) {
            z = true;
            break;
        }
        loop0: while (true) {
            int i4 = i - 1;
            if (i < 0) {
                z = true;
                break;
            }
            while (!c10456.m26315() && (cM26313 = c10456.m26313()) != '=') {
                z = false;
                if (cM26313 == '\"') {
                    if (!c10456.m26311()) {
                        break loop0;
                    }
                } else if (cM26313 == '\'' && !c10456.m26317()) {
                    break loop0;
                }
            }
            i = i4;
        }
        c10456.m26310();
        if (z) {
            m46648(c10456.m26312(), new C10456(c10456.m26312(), charSequence.length(), charSequence).m26308());
        } else {
            m46646(c10456.m26312());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21745 m46650(String str, String str2, String str3) {
        C12164 c12164Matcher = C5517.f17081.matcher(this.f65647);
        for (C22450 c22450 : this.f65646) {
            if (c22450.f72710 == 4 && c12164Matcher.lookingAt(c22450.f72709) && str.equals(c12164Matcher.m29597("name")) && str2.equals(c12164Matcher.m29597("parameters")) && str3.equals(c12164Matcher.m29597("type"))) {
                return new C21745(c12164Matcher);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] m46656(String str, String str2, String str3) {
        C11459 c11459 = C5517.f17081;
        CharSequence charSequence = this.f65647;
        C12164 c12164Matcher = c11459.matcher(charSequence);
        boolean z = true;
        int iEnd = 0;
        for (C22450 c22450 : this.f65646) {
            if (z) {
                if (c22450.f72710 == 4 && c12164Matcher.lookingAt(c22450.f72709) && str.equals(c12164Matcher.m29597("name")) && str2.equals(c12164Matcher.m29597("parameters")) && str3.equals(c12164Matcher.m29597("type"))) {
                    iEnd = c12164Matcher.end();
                    z = false;
                }
            } else if (c22450.f72710 == 5) {
                return new int[]{iEnd + 1, TextUtils.lastIndexOf(charSequence, '\n', c22450.f72709)};
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46655(String str, int i, String str2, String str3, int i2) {
        int i3;
        char cCharAt;
        C11459 c11459 = C5517.f17081;
        CharSequence charSequence = this.f65647;
        C12164 c12164Matcher = c11459.matcher(charSequence);
        int iEnd = -1;
        boolean z = false;
        for (C22450 c22450 : this.f65646) {
            int i4 = c22450.f72710;
            int i5 = c22450.f72709;
            if (i4 == 4) {
                if (c12164Matcher.lookingAt(i5) && str.equals(c12164Matcher.m29597("name")) && str2.equals(c12164Matcher.m29597("parameters"))) {
                    if (str3.equals(c12164Matcher.m29597("type"))) {
                        iEnd = c12164Matcher.end();
                        z = true;
                    }
                }
            } else if (!z) {
                continue;
            } else if (i4 == 5) {
                while (true) {
                    int i6 = iEnd + 1;
                    if (i6 >= charSequence.length()) {
                        iEnd = i6;
                        break;
                    }
                    char cCharAt2 = charSequence.charAt(i6);
                    if ((cCharAt2 == '\r' || cCharAt2 == '\n') && (iEnd = iEnd + 2) < charSequence.length() && ((cCharAt = charSequence.charAt(iEnd)) == '\r' || cCharAt == '\n')) {
                        break;
                    } else {
                        iEnd = i6;
                    }
                }
            } else if (i4 == 0 || i4 == 1) {
                iEnd = i5;
            }
        }
        if (iEnd == -1) {
            return;
        }
        C10456 c10456 = new C10456(iEnd, charSequence.length(), charSequence);
        int i7 = i;
        while (!c10456.m26315()) {
            String strM26318 = c10456.m26318();
            if (strM26318.length() > 0 && !strM26318.startsWith(":") && !strM26318.startsWith("#") && !strM26318.equals("nop")) {
                char cCharAt3 = strM26318.charAt(0);
                if ('a' <= cCharAt3 && cCharAt3 <= 'z') {
                    i3 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    i7 = i3;
                } else if (cCharAt3 == '.' && (strM26318.startsWith(".array-data") || strM26318.startsWith(".packed-switch") || strM26318.startsWith(".sparse-switch"))) {
                    i3 = i7 - 1;
                    if (i7 == 0) {
                        break;
                    }
                    i7 = i3;
                }
            }
        }
        int i8 = i2;
        while (!c10456.m26315() && i8 >= 0) {
            if (!c10456.m26318().isEmpty()) {
                i8--;
            }
        }
        int iM26316 = c10456.m26316();
        int iM26314 = c10456.m26314();
        C10456 c10457 = new C10456(iM26316, iM26314, charSequence);
        if (c10457.m26309('\"')) {
            int iM26312 = c10457.m26312();
            if (c10457.m26311()) {
                m46648(iM26312, c10457.m26312() - 1);
                return;
            }
        }
        m46648(iM26316, iM26314);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21745 m46649(String str, String str2) {
        C12164 c12164Matcher = C5517.f17080.matcher(this.f65647);
        for (C22450 c22450 : this.f65646) {
            if (c22450.f72710 == 2 && c12164Matcher.lookingAt(c22450.f72709) && str.equals(c12164Matcher.m29597("name")) && str2.equals(c12164Matcher.m29597("type"))) {
                return new C21745(c12164Matcher);
            }
        }
        return null;
    }
}
