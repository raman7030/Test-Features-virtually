package l;

/* JADX INFO: renamed from: l.ۨ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11581 implements InterfaceC18842 {
    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC11581 mo13299();

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo13300(char c);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC11581 m28473() {
        return C5936.f18218;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC11581 m28472(char c) {
        return new C22164(c);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC11581 m28471() {
        return new C4525(' ');
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC11581 m28470() {
        return new C20048("\n\r".charAt(0), "\n\r".charAt(1));
    }

    /* JADX INFO: renamed from: ܽ */
    public boolean mo25531(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo13300(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo25532(CharSequence charSequence) {
        return mo25530(charSequence) == -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo25530(CharSequence charSequence) {
        return mo25528(0, charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo25528(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C4025.m12112(i, length);
        while (i < length) {
            if (mo13300(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo25529(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (mo13300(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28469(char c) {
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
