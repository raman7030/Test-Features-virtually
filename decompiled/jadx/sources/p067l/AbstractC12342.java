package p067l;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۤ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WH */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12342 {
    /* JADX INFO: renamed from: ֫ */
    public static int m28421(int i) {
        return (i & 240) >>> 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m28422(Canvas canvas, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutM45249 = C19936.m45249(spanned);
            if (layoutM45249 != null) {
                return layoutM45249.getWidth();
            }
            TextView textViewM46564 = C20607.m46564(spanned);
            if (textViewM46564 != null) {
                return (textViewM46564.getWidth() - textViewM46564.getPaddingLeft()) - textViewM46564.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC12262 m28423(C14645 c14645, C20168 c20168) {
        int iM45631 = c20168.m45631();
        try {
            int iM45625 = c20168.m45625();
            int i = iM45625 & 31;
            int i2 = iM45625 >>> 5;
            if (i == 0) {
                C12981.m29756(i2, 0);
                return new C12953((byte) c20168.m45644());
            }
            if (i == 6) {
                C12981.m29756(i2, 7);
                return new C17645(c20168.m45641(i2 + 1));
            }
            if (i == 2) {
                C12981.m29756(i2, 1);
                return new C2893((short) c20168.m45637(i2 + 1));
            }
            if (i == 3) {
                C12981.m29756(i2, 1);
                return new C18316((char) c20168.m45647(i2 + 1));
            }
            if (i == 4) {
                C12981.m29756(i2, 3);
                return new C10941(c20168.m45637(i2 + 1));
            }
            if (i == 16) {
                C12981.m29756(i2, 3);
                return new C11612(Float.intBitsToFloat(c20168.m45639(i2 + 1)));
            }
            if (i == 17) {
                C12981.m29756(i2, 7);
                return new C19658(Double.longBitsToDouble(c20168.m45634(i2 + 1)));
            }
            switch (i) {
                case 21:
                    C12981.m29756(i2, 3);
                    return new C9320(c14645, c20168, i2);
                case 22:
                    C12981.m29756(i2, 3);
                    return new C15354(c14645, c20168, i2);
                case 23:
                    C12981.m29756(i2, 3);
                    return new C3803(c14645, c20168, i2);
                case 24:
                    C12981.m29756(i2, 3);
                    return new C12521(c14645, c20168, i2);
                case 25:
                    C12981.m29756(i2, 3);
                    return new C13344(c14645, c20168, i2);
                case 26:
                    C12981.m29756(i2, 3);
                    return new C24072(c14645, c20168, i2);
                case 27:
                    C12981.m29756(i2, 3);
                    return new C7979(c14645, c20168, i2);
                case 28:
                    C12981.m29756(i2, 0);
                    return new C12003(c14645, c20168);
                case 29:
                    C12981.m29756(i2, 0);
                    return new C14684(c14645, c20168);
                case 30:
                    C12981.m29756(i2, 0);
                    return C21000.f65921;
                case 31:
                    C12981.m29756(i2, 1);
                    return i2 == 1 ? C4235.f9360 : C4235.f9361;
                default:
                    throw new C17034(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
            }
        } catch (Exception e) {
            throw C17034.m38625(e, "Error while reading encoded value at offset 0x%x", Integer.valueOf(iM45631));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28424(C20168 c20168) {
        int iM45631 = c20168.m45631();
        try {
            int iM45625 = c20168.m45625();
            int i = iM45625 & 31;
            if (i == 0) {
                c20168.m45643();
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
                        int iM45635 = c20168.m45635();
                        for (int i2 = 0; i2 < iM45635; i2++) {
                            m28424(c20168);
                        }
                        return;
                    case 29:
                        C14684.m33613(c20168);
                        return;
                    case 30:
                    case 31:
                        return;
                    default:
                        throw new C17034(null, "Invalid encoded_value type: 0x%x", Integer.valueOf(i));
                }
            }
            c20168.m45623((iM45625 >>> 5) + 1);
        } catch (Exception e) {
            throw C17034.m38625(e, "Error while skipping encoded value at offset 0x%x", Integer.valueOf(iM45631));
        }
    }
}
