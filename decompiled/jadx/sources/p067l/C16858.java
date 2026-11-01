package p067l;

import android.text.TextUtils;
import android.util.TypedValue;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBKJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16858 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f49918;

    /* JADX INFO: renamed from: ۧ */
    public final TypedValue f49919 = new TypedValue();

    /* JADX INFO: renamed from: ܽ */
    public final XmlResourceParserC12128 f49920;

    public C16858(XmlResourceParserC12128 xmlResourceParserC12128, int i) {
        this.f49920 = xmlResourceParserC12128;
        this.f49918 = new int[i * 2];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m38374(int i) {
        return this.f49918[i * 2];
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m38370(int i) {
        int i2 = i * 2;
        int[] iArr = this.f49918;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return null;
        }
        if (i3 == 3) {
            return this.f49920.m28035(iArr[i2 + 1]).toString();
        }
        TypedValue typedValue = this.f49919;
        if (!m38367(i2, typedValue)) {
            throw new RuntimeException(C1514.m34687(new StringBuilder("getString of bad type: 0x"), i3));
        }
        CharSequence charSequenceCoerceToString = typedValue.coerceToString();
        if (charSequenceCoerceToString != null) {
            return charSequenceCoerceToString.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38372(boolean z) {
        int[] iArr = this.f49918;
        int i = iArr[10];
        if (i != 0) {
            if (i >= 16 && i <= 31) {
                return iArr[11] != 0;
            }
            TypedValue typedValue = this.f49919;
            if (!m38367(10, typedValue)) {
                throw new RuntimeException(C1514.m34687(new StringBuilder("getBoolean of bad type: 0x"), i));
            }
            CharSequence charSequenceCoerceToString = typedValue.coerceToString();
            if (!TextUtils.isEmpty(charSequenceCoerceToString)) {
                return charSequenceCoerceToString.equals("1") || charSequenceCoerceToString.equals("true") || charSequenceCoerceToString.equals("TRUE");
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38369(int i, int i2) {
        int i3 = i * 2;
        int[] iArr = this.f49918;
        int i4 = iArr[i3];
        if (i4 == 0) {
            return i2;
        }
        if (i4 >= 16 && i4 <= 31) {
            return iArr[i3 + 1];
        }
        TypedValue typedValue = this.f49919;
        if (m38367(i3, typedValue)) {
            return m38366(i2, typedValue.coerceToString());
        }
        throw new RuntimeException(C1514.m34687(new StringBuilder("getInt of bad type: 0x"), i4));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m38366(int i, CharSequence charSequence) {
        int i2;
        int i3;
        if (TextUtils.isEmpty(charSequence)) {
            return i;
        }
        String string = charSequence.toString();
        int length = string.length();
        if ('-' == string.charAt(0)) {
            i2 = -1;
            i3 = 1;
        } else {
            i2 = 1;
            i3 = 0;
        }
        int i4 = 16;
        if ('0' == string.charAt(i3)) {
            if (i3 == length - 1) {
                return 0;
            }
            int i5 = i3 + 1;
            char cCharAt = string.charAt(i5);
            if ('x' == cCharAt || 'X' == cCharAt) {
                i3 += 2;
            } else {
                i4 = 8;
                i3 = i5;
            }
        } else if ('#' == string.charAt(i3)) {
            i3++;
        } else {
            i4 = 10;
        }
        return Integer.parseInt(string.substring(i3), i4) * i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m38373(float f, int i) {
        CharSequence charSequenceCoerceToString;
        int i2 = i * 2;
        int[] iArr = this.f49918;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return f;
        }
        if (i3 == 4) {
            return Float.intBitsToFloat(iArr[i2 + 1]);
        }
        if (i3 >= 16 && i3 <= 31) {
            return iArr[i2 + 1];
        }
        TypedValue typedValue = this.f49919;
        if (!m38367(i2, typedValue) || (charSequenceCoerceToString = typedValue.coerceToString()) == null) {
            throw new RuntimeException(C1514.m34687(new StringBuilder("getFloat of bad type: 0x"), i3));
        }
        return Float.parseFloat(charSequenceCoerceToString.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m38368(float f, int i) {
        int i2 = i * 2;
        int[] iArr = this.f49918;
        int i3 = iArr[i2];
        if (i3 == 0) {
            return f;
        }
        if (i3 == 5) {
            return TypedValue.complexToDimension(iArr[i2 + 1], C7050.m16235().getDisplayMetrics());
        }
        if (i3 != 2) {
            throw new UnsupportedOperationException(C1514.m34687(C15033.m34408(i, "Can't convert value at index ", " to dimension: type=0x"), i3));
        }
        TypedValue typedValue = this.f49919;
        m38367(i2, typedValue);
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38371(int i, TypedValue typedValue) {
        m38367(i * 2, typedValue);
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m38367(int i, TypedValue typedValue) {
        int[] iArr = this.f49918;
        int i2 = iArr[i];
        if (i2 == 0) {
            return false;
        }
        typedValue.type = i2;
        int i3 = iArr[i + 1];
        typedValue.data = i3;
        typedValue.string = i2 == 3 ? this.f49920.m28035(i3) : null;
        return true;
    }

    public final String toString() {
        return Arrays.toString(this.f49918);
    }
}
