package p067l;

/* JADX INFO: renamed from: l.ۨ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13375 implements InterfaceC20276 {
    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC13375 mo15182();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo15183(char c);

    /* JADX INFO: renamed from: ᩳ */
    public static AbstractC13375 m30519() {
        return C8010.f21072;
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC13375 m30518(char c) {
        return new C23433(c);
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC13375 m30517() {
        return new C6669(' ');
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC13375 m30516() {
        return new C21422("\n\r".charAt(0), "\n\r".charAt(1));
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo27550(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo15183(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo27551(CharSequence charSequence) {
        return mo27549(charSequence) == -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo27549(CharSequence charSequence) {
        return mo27547(0, charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo27547(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C6194.m14032(i, length);
        while (i < length) {
            if (mo15183(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo27548(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (mo15183(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m30515(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
