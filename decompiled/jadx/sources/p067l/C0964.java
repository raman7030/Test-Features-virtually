package p067l;

import org.bouncycastle.pqc.crypto.newhope.Params;

/* JADX INFO: renamed from: l.ۖۤ */
/* JADX INFO: compiled from: S2ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0964 {

    /* JADX INFO: renamed from: ܿ */
    public static final byte[] f10634 = new byte[Params.POLY_BYTES];

    /* JADX INFO: renamed from: ֫ */
    public int f10635;

    /* JADX INFO: renamed from: ۧ */
    public char f10636;

    /* JADX INFO: renamed from: ܽ */
    public final int f10637;

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence f10638;

    static {
        for (int i = 0; i < 1792; i++) {
            f10634[i] = Character.getDirectionality(i);
        }
    }

    public C0964(CharSequence charSequence) {
        this.f10638 = charSequence;
        this.f10637 = charSequence.length();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m9976() {
        byte directionality;
        this.f10635 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f10635;
            if (i4 < this.f10637 && i == 0) {
                CharSequence charSequence = this.f10638;
                char cCharAt = charSequence.charAt(i4);
                this.f10636 = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence, this.f10635);
                    this.f10635 = Character.charCount(iCodePointAt) + this.f10635;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    this.f10635++;
                    char c = this.f10636;
                    directionality = c < 1792 ? f10634[c] : Character.getDirectionality(c);
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
                while (this.f10635 > 0) {
                    switch (m9975()) {
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

    /* JADX INFO: renamed from: ܽ */
    public final int m9977() {
        this.f10635 = this.f10637;
        int i = 0;
        int i2 = 0;
        while (this.f10635 > 0) {
            byte bM9975 = m9975();
            if (bM9975 == 0) {
                if (i == 0) {
                    return -1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM9975 == 1 || bM9975 == 2) {
                if (i == 0) {
                    return 1;
                }
                if (i2 == 0) {
                    i2 = i;
                }
            } else if (bM9975 != 9) {
                switch (bM9975) {
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

    /* JADX INFO: renamed from: ֫ */
    public final byte m9975() {
        int i = this.f10635 - 1;
        CharSequence charSequence = this.f10638;
        char cCharAt = charSequence.charAt(i);
        this.f10636 = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f10635);
            this.f10635 -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f10635--;
        char c = this.f10636;
        return c < 1792 ? f10634[c] : Character.getDirectionality(c);
    }
}
