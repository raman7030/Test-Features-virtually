package l;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10494 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26388(int i) {
        return (i & 240) >>> 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26389(Canvas canvas, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutM42973 = C18485.m42973(spanned);
            if (layoutM42973 != null) {
                return layoutM42973.getWidth();
            }
            TextView textViewM44269 = C19191.m44269(spanned);
            if (textViewM44269 != null) {
                return (textViewM44269.getWidth() - textViewM44269.getPaddingLeft()) - textViewM44269.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10410 m26390(C12918 c12918, C18729 c18729) {
        int iM43364 = c18729.m43364();
        try {
            int iM43358 = c18729.m43358();
            int i = iM43358 & 31;
            int i2 = iM43358 >>> 5;
            if (i == 0) {
                C11166.m27694(i2, 0);
                return new C11137((byte) c18729.m43377());
            }
            if (i == 6) {
                C11166.m27694(i2, 7);
                return new C16074(c18729.m43374(i2 + 1));
            }
            if (i == 2) {
                C11166.m27694(i2, 1);
                return new C0552((short) c18729.m43370(i2 + 1));
            }
            if (i == 3) {
                C11166.m27694(i2, 1);
                return new C16780((char) c18729.m43380(i2 + 1));
            }
            if (i == 4) {
                C11166.m27694(i2, 3);
                return new C9020(c18729.m43370(i2 + 1));
            }
            if (i == 16) {
                C11166.m27694(i2, 3);
                return new C9726(Float.intBitsToFloat(c18729.m43372(i2 + 1)));
            }
            if (i == 17) {
                C11166.m27694(i2, 7);
                return new C18192(Double.longBitsToDouble(c18729.m43367(i2 + 1)));
            }
            switch (i) {
                case 21:
                    C11166.m27694(i2, 3);
                    return new C7315(c12918, c18729, i2);
                case 22:
                    C11166.m27694(i2, 3);
                    return new C13664(c12918, c18729, i2);
                case 23:
                    C11166.m27694(i2, 3);
                    return new C1510(c12918, c18729, i2);
                case 24:
                    C11166.m27694(i2, 3);
                    return new C10683(c12918, c18729, i2);
                case 25:
                    C11166.m27694(i2, 3);
                    return new C11549(c12918, c18729, i2);
                case 26:
                    C11166.m27694(i2, 3);
                    return new C22837(c12918, c18729, i2);
                case 27:
                    C11166.m27694(i2, 3);
                    return new C5904(c12918, c18729, i2);
                case 28:
                    C11166.m27694(i2, 0);
                    return new C10138(c12918, c18729);
                case 29:
                    C11166.m27694(i2, 0);
                    return new C12959(c12918, c18729);
                case 30:
                    C11166.m27694(i2, 0);
                    return C19604.f63303;
                case 31:
                    C11166.m27694(i2, 1);
                    return i2 == 1 ? C1964.f6581 : C1964.f6582;
                default:
                    throw new C15431(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
            }
        } catch (Exception e) {
            throw C15431.m36467(e, "Error while reading encoded value at offset 0x%x", Integer.valueOf(iM43364));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26391(C18729 c18729) {
        int iM43364 = c18729.m43364();
        try {
            int iM43358 = c18729.m43358();
            int i = iM43358 & 31;
            if (i == 0) {
                c18729.m43376();
                return;
            }
            if (i != 6 && i != 2 && i != 3 && i != 4 && i != 16 && i != 17) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                    case 28:
                        int iM43368 = c18729.m43368();
                        for (int i2 = 0; i2 < iM43368; i2++) {
                            m26391(c18729);
                        }
                        return;
                    case 29:
                        C12959.m31527(c18729);
                        return;
                    case 30:
                    case 31:
                        return;
                    default:
                        throw new C15431(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
                }
            }
            c18729.m43356((iM43358 >>> 5) + 1);
        } catch (Exception e) {
            throw C15431.m36467(e, "Error while skipping encoded value at offset 0x%x", Integer.valueOf(iM43364));
        }
    }
}
