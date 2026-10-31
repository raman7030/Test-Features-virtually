package l;

import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2459 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f7846 = new byte[Params.POLY_BYTES];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7847;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f7848;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f7849;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f7850;

    static {
        for (int i = 0; i < 1792; i++) {
            f7846[i] = Character.getDirectionality(i);
        }
    }

    public C2459(CharSequence charSequence) {
        this.f7850 = charSequence;
        this.f7849 = charSequence.length();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7928() {
        byte directionality;
        this.f7847 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f7847;
            if (i4 < this.f7849 && i == 0) {
                CharSequence charSequence = this.f7850;
                char cCharAt = charSequence.charAt(i4);
                this.f7848 = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence, this.f7847);
                    this.f7847 = Character.charCount(iCodePointAt) + this.f7847;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    this.f7847++;
                    char c = this.f7848;
                    directionality = c < 1792 ? f7846[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (this.f7847 > 0) {
                    switch (m7927()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m7929() {
        this.f7847 = this.f7849;
        int i = 0;
        int i2 = 0;
        while (this.f7847 > 0) {
            byte bM7927 = m7927();
            if (bM7927 == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM7927 == 1 || bM7927 == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM7927 != 9) {
                switch (bM7927) {
                    case 14:
                    case 15:
                        if (i2 == i) {
                            return -1;
                        }
                        i--;
                        break;
                    case 16:
                    case 17:
                        if (i2 == i) {
                            return 1;
                        }
                        i--;
                        break;
                    case 18:
                        i++;
                        break;
                    default:
                        if (i2 == 0) {
                            i2 = i;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m7927() {
        int i = this.f7847 - 1;
        CharSequence charSequence = this.f7850;
        char cCharAt = charSequence.charAt(i);
        this.f7848 = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f7847);
            this.f7847 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f7847--;
        char c = this.f7848;
        return c < 1792 ? f7846[c] : Character.getDirectionality(c);
    }
}
