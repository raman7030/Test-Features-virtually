package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21694 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C13259 f68318 = C13259.m30304("\\n *\\.(end +)?([afm][a-z]+)");

    /* JADX INFO: renamed from: ֫ */
    public C14146 f68319;

    /* JADX INFO: renamed from: ۧ */
    public final List f68320;

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence f68321;

    /* JADX INFO: renamed from: ֫ */
    public static C21694 m48968(CharSequence charSequence) {
        return new C21694(charSequence);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    public C21694(CharSequence charSequence) {
        this.f68321 = charSequence;
        C13929 c13929Matcher = f68318.matcher(charSequence);
        LinkedList<C23705> linkedList = new LinkedList();
        while (true) {
            if (c13929Matcher.find()) {
                int i = c13929Matcher.start(1) != -1 ? 1 : 0;
                String strGroup = c13929Matcher.group(2);
                strGroup.getClass();
                switch (strGroup) {
                    case "annotation":
                        linkedList.addFirst(new C23705(i, c13929Matcher.start(2)));
                        break;
                    case "method":
                        linkedList.addFirst(new C23705(i != 0 ? 5 : 4, c13929Matcher.start(2)));
                        break;
                    case "field":
                        linkedList.addFirst(new C23705(i == 0 ? 2 : 3, c13929Matcher.start(2)));
                        break;
                }
            } else {
                LinkedList linkedList2 = new LinkedList();
                boolean z = false;
                for (C23705 c23705 : linkedList) {
                    int i2 = c23705.f75436;
                    if (i2 == 2) {
                        if (z) {
                            z = false;
                        } else {
                            linkedList2.addFirst(new C23705(3, c23705.f75435));
                        }
                        linkedList2.addFirst(c23705);
                    } else if (i2 == 3) {
                        linkedList2.addFirst(c23705);
                        z = true;
                    } else {
                        linkedList2.addFirst(c23705);
                    }
                }
                this.f68320 = C21562.unmodifiableList(linkedList2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48977(C14146 c14146) {
        this.f68319 = c14146;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48975(String str, int i, int i2, String str2) {
        C13929 c13929Matcher = C7612.f19921.matcher(this.f68321);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C23705 c23705 : this.f68320) {
            int i5 = c23705.f75436;
            int i6 = c23705.f75435;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        i4++;
                        if (c13929Matcher.lookingAt(i6) && str.equals(c13929Matcher.m31662("name")) && str2.equals(c13929Matcher.m31662("type"))) {
                            iStart = c13929Matcher.start();
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
                    m48970(i2, iStart, i6);
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
        m48969(iStart);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48976(String str, int i, String str2, String str3, int i2) {
        C13929 c13929Matcher = C7612.f19922.matcher(this.f68321);
        int i3 = -1;
        int iStart = 0;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        for (C23705 c23705 : this.f68320) {
            int i5 = c23705.f75436;
            int i6 = c23705.f75435;
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
                    m48970(i2, iStart, i6);
                    return;
                }
                i4--;
            } else if (i5 == 2) {
                i4++;
            } else if (i5 == 3) {
                i4--;
            } else if (i5 == 4) {
                i4++;
                if (c13929Matcher.lookingAt(i6)) {
                    if (str.equals(c13929Matcher.m31662("name"))) {
                        if (str2.equals(c13929Matcher.m31662("parameters"))) {
                            if (str3.equals(c13929Matcher.m31662("type"))) {
                                iStart = c13929Matcher.start();
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
        m48969(iStart);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48974(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = -1;
        for (C23705 c23705 : this.f68320) {
            int i6 = c23705.f75436;
            int i7 = c23705.f75435;
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
                    m48970(i2, i3, i7);
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
        m48969(i3);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48969(int i) {
        this.f68319.mo27941(i);
        this.f68319.invalidate();
        this.f68319.m32601();
        this.f68319.m32491(i, false);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m48971(int i, int i2) {
        this.f68319.mo27944(i, i2);
        this.f68319.invalidate();
        this.f68319.m32601();
        this.f68319.m32491(i, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48970(int i, int i2, int i3) {
        char cM28343;
        boolean z;
        CharSequence charSequence = this.f68321;
        C12306 c12306 = new C12306(i2, i3, charSequence);
        if (c12306.m28339(C0184a.f880h) && (i = i - 1) < 0) {
            z = true;
            break;
        }
        loop0: while (true) {
            int i4 = i - 1;
            if (i < 0) {
                z = true;
                break;
            }
            while (!c12306.m28345() && (cM28343 = c12306.m28343()) != '=') {
                z = false;
                if (cM28343 == '\"') {
                    if (!c12306.m28341()) {
                        break loop0;
                    }
                } else if (cM28343 == '\'' && !c12306.m28347()) {
                    break loop0;
                }
            }
            i = i4;
        }
        c12306.m28340();
        if (z) {
            m48971(c12306.m28342(), new C12306(c12306.m28342(), charSequence.length(), charSequence).m28338());
        } else {
            m48969(c12306.m28342());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23035 m48973(String str, String str2, String str3) {
        C13929 c13929Matcher = C7612.f19922.matcher(this.f68321);
        for (C23705 c23705 : this.f68320) {
            if (c23705.f75436 == 4 && c13929Matcher.lookingAt(c23705.f75435) && str.equals(c13929Matcher.m31662("name")) && str2.equals(c13929Matcher.m31662("parameters")) && str3.equals(c13929Matcher.m31662("type"))) {
                return new C23035(c13929Matcher);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int[] m48979(String str, String str2, String str3) {
        C13259 c13259 = C7612.f19922;
        CharSequence charSequence = this.f68321;
        C13929 c13929Matcher = c13259.matcher(charSequence);
        boolean z = true;
        int iEnd = 0;
        for (C23705 c23705 : this.f68320) {
            if (z) {
                if (c23705.f75436 == 4 && c13929Matcher.lookingAt(c23705.f75435) && str.equals(c13929Matcher.m31662("name")) && str2.equals(c13929Matcher.m31662("parameters")) && str3.equals(c13929Matcher.m31662("type"))) {
                    iEnd = c13929Matcher.end();
                    z = false;
                }
            } else if (c23705.f75436 == 5) {
                return new int[]{iEnd + 1, TextUtils.lastIndexOf(charSequence, '\n', c23705.f75435)};
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48978(String str, int i, String str2, String str3, int i2) {
        int i3;
        char cCharAt;
        C13259 c13259 = C7612.f19922;
        CharSequence charSequence = this.f68321;
        C13929 c13929Matcher = c13259.matcher(charSequence);
        int iEnd = -1;
        boolean z = false;
        for (C23705 c23705 : this.f68320) {
            int i4 = c23705.f75436;
            int i5 = c23705.f75435;
            if (i4 == 4) {
                if (c13929Matcher.lookingAt(i5) && str.equals(c13929Matcher.m31662("name")) && str2.equals(c13929Matcher.m31662("parameters"))) {
                    if (str3.equals(c13929Matcher.m31662("type"))) {
                        iEnd = c13929Matcher.end();
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
        C12306 c12306 = new C12306(iEnd, charSequence.length(), charSequence);
        int i7 = i;
        while (!c12306.m28345()) {
            String strM28348 = c12306.m28348();
            if (strM28348.length() > 0 && !strM28348.startsWith(":") && !strM28348.startsWith("#") && !strM28348.equals("nop")) {
                char cCharAt3 = strM28348.charAt(0);
                if ('a' <= cCharAt3 && cCharAt3 <= 'z') {
                    i3 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    i7 = i3;
                } else if (cCharAt3 == '.' && (strM28348.startsWith(".array-data") || strM28348.startsWith(".packed-switch") || strM28348.startsWith(".sparse-switch"))) {
                    i3 = i7 - 1;
                    if (i7 == 0) {
                        break;
                    }
                    i7 = i3;
                }
            }
        }
        int i8 = i2;
        while (!c12306.m28345() && i8 >= 0) {
            if (!c12306.m28348().isEmpty()) {
                i8--;
            }
        }
        int iM28346 = c12306.m28346();
        int iM28344 = c12306.m28344();
        C12306 c12307 = new C12306(iM28346, iM28344, charSequence);
        if (c12307.m28339('\"')) {
            int iM28342 = c12307.m28342();
            if (c12307.m28341()) {
                m48971(iM28342, c12307.m28342() - 1);
                return;
            }
        }
        m48971(iM28346, iM28344);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23035 m48972(String str, String str2) {
        C13929 c13929Matcher = C7612.f19921.matcher(this.f68321);
        for (C23705 c23705 : this.f68320) {
            if (c23705.f75436 == 2 && c13929Matcher.lookingAt(c23705.f75435) && str.equals(c13929Matcher.m31662("name")) && str2.equals(c13929Matcher.m31662("type"))) {
                return new C23035(c13929Matcher);
            }
        }
        return null;
    }
}
