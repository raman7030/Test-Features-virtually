package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.᩺ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes.dex */
public final class C24370 {

    /* JADX INFO: renamed from: ֫ */
    public final int f77158;

    /* JADX INFO: renamed from: ۧ */
    public final int f77159;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC7587 f77160;

    /* JADX INFO: renamed from: ᩳ */
    public final CharSequence f77161;

    public C24370(CharSequence charSequence, EnumC7587 enumC7587) {
        int iHashCode;
        int iM29889;
        this.f77161 = charSequence;
        this.f77160 = enumC7587;
        int i = C13642.f38394[enumC7587.ordinal()];
        if (i == 1) {
            if ((charSequence instanceof String) || (charSequence instanceof C19165)) {
                iHashCode = charSequence.hashCode();
            } else {
                iHashCode = C13061.m29889(0, charSequence.length(), charSequence);
            }
            iM29889 = iHashCode;
        } else if (i == 2) {
            int iM12346 = C5575.m12346(0, charSequence.length(), charSequence);
            iM29889 = C13061.m29889(iM12346, C5575.m12342(iM12346, charSequence.length(), charSequence), charSequence);
        } else if (i == 3) {
            int length = charSequence.length();
            iM29889 = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = charSequence.charAt(i2);
                if (!C13061.m29890(cCharAt)) {
                    iM29889 = (iM29889 * 31) + cCharAt;
                }
            }
        } else {
            throw new IllegalArgumentException(enumC7587.name());
        }
        this.f77158 = iM29889;
        int length2 = charSequence.length();
        int i3 = 0;
        for (int i4 = 0; i4 < length2; i4++) {
            if (!C13061.m29890(charSequence.charAt(i4))) {
                i3++;
            }
        }
        this.f77159 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m53725() {
        return this.f77161;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m53726() {
        return this.f77159;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24370.class != obj.getClass()) {
            return false;
        }
        C24370 c24370 = (C24370) obj;
        if (this.f77158 != c24370.f77158) {
            return false;
        }
        CharSequence charSequence = c24370.f77161;
        int[] iArr = C13642.f38394;
        EnumC7587 enumC7587 = this.f77160;
        int i = iArr[enumC7587.ordinal()];
        CharSequence charSequence2 = this.f77161;
        if (i == 1) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i == 2) {
            return C13061.m29897(charSequence2, charSequence);
        }
        if (i == 3) {
            return C13061.m29893(charSequence2, charSequence);
        }
        throw new IllegalArgumentException(enumC7587.toString());
    }

    public final int hashCode() {
        return this.f77158;
    }
}
