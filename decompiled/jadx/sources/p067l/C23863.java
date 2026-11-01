package p067l;

import android.graphics.Color;
import android.text.Layout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes.dex */
public final class C23863 extends AbstractC24037 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f75791;

    static {
        HashMap map = new HashMap();
        f75791 = map;
        map.put("darkgray", -5658199);
        map.put("gray", -8355712);
        map.put("lightgray", -2894893);
        map.put("darkgrey", -5658199);
        map.put("grey", -8355712);
        C17520.m39895(map, "lightgrey", -2894893, -16744448, "green");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX INFO: renamed from: ֫ */
    public static int m52940(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
            case "accent":
                return C23223.f72969;
            case "primary":
                return C23223.f72985;
            case "text":
                return C23223.f72995;
            case "error":
                return C23223.f73004;
            case "warning":
                return C23223.f72975;
            case "divider":
                return C23223.f72994;
            case "textsecondary":
                return C23223.f72980;
            default:
                Integer num = (Integer) f75791.get(lowerCase);
                if (num != null) {
                    return num.intValue();
                }
                if (lowerCase.startsWith("#")) {
                    String strSubstring = lowerCase.substring(1);
                    if (C11774.m27012(strSubstring)) {
                        return C11774.m27016(strSubstring);
                    }
                }
                if (Character.isLetter(lowerCase.charAt(0))) {
                    try {
                        return Color.parseColor(lowerCase);
                    } catch (IllegalArgumentException unused) {
                        return -1;
                    }
                }
                try {
                    return C16858.m38366(-1, lowerCase);
                } catch (NumberFormatException unused2) {
                    return -1;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p067l.AbstractC24037
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8182(C20408 c20408, InterfaceC15712 interfaceC15712, InterfaceC16855 interfaceC16855) {
        int i;
        ForegroundColorSpan foregroundColorSpan;
        BackgroundColorSpan backgroundColorSpan;
        TypefaceSpan typefaceSpan;
        Object relativeSizeSpan;
        Layout.Alignment alignment;
        ForegroundColorSpan foregroundColorSpan2;
        String strName = interfaceC16855.name();
        strName.getClass();
        int i2 = 0;
        byte b = -1;
        switch (strName.hashCode()) {
            case 3148879:
                if (strName.equals("font")) {
                    b = 0;
                }
                break;
            case 92903173:
                if (strName.equals("align")) {
                    b = 1;
                }
                break;
            case 94842723:
                if (strName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR)) {
                    b = 2;
                }
                break;
        }
        Object[] objArr = null;
        backgroundColorSpan = null;
        BackgroundColorSpan backgroundColorSpan2 = null;
        objArr = null;
        switch (b) {
            case 0:
                String str = (String) interfaceC16855.attributes().get(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
                if (str != null) {
                    foregroundColorSpan = new ForegroundColorSpan(m52940(str));
                    i = 1;
                } else {
                    i = 0;
                    foregroundColorSpan = null;
                }
                String str2 = (String) interfaceC16855.attributes().get("background-color");
                if (str2 != null) {
                    backgroundColorSpan = new BackgroundColorSpan(m52940(str2));
                    i++;
                } else {
                    backgroundColorSpan = null;
                }
                String str3 = (String) interfaceC16855.attributes().get("face");
                if (str3 != null) {
                    typefaceSpan = new TypefaceSpan(str3);
                    i++;
                } else {
                    typefaceSpan = null;
                }
                String str4 = (String) interfaceC16855.attributes().get("size");
                if (str4 != null) {
                    C9091 c9091 = new C9091();
                    if (C11774.m27010(str4, c9091)) {
                        int i3 = c9091.f24648;
                        if (i3 == 5) {
                            relativeSizeSpan = new AbsoluteSizeSpan(TypedValue.complexToDimensionPixelSize(c9091.f24647, C7050.m16235().getDisplayMetrics()));
                        } else if (i3 == 6) {
                            relativeSizeSpan = new RelativeSizeSpan(TypedValue.complexToFraction(c9091.f24647, 1.0f, 1.0f));
                        } else if (i3 == 4) {
                            relativeSizeSpan = new RelativeSizeSpan(Float.intBitsToFloat(c9091.f24647));
                        } else {
                            relativeSizeSpan = null;
                        }
                        i++;
                    } else {
                        relativeSizeSpan = null;
                    }
                } else {
                    relativeSizeSpan = null;
                }
                if (i > 0) {
                    if (i == 1) {
                        if (foregroundColorSpan != null) {
                            return foregroundColorSpan;
                        }
                        if (backgroundColorSpan != null) {
                            return backgroundColorSpan;
                        }
                        return typefaceSpan != null ? typefaceSpan : relativeSizeSpan;
                    }
                    objArr = new Object[i];
                    if (foregroundColorSpan != null) {
                        objArr[0] = foregroundColorSpan;
                        i2 = 1;
                    }
                    if (backgroundColorSpan != null) {
                        objArr[i2] = backgroundColorSpan;
                        i2++;
                    }
                    if (typefaceSpan != null) {
                        objArr[i2] = typefaceSpan;
                        i2++;
                    }
                    if (relativeSizeSpan != null) {
                        objArr[i2] = relativeSizeSpan;
                    }
                }
                return objArr;
            case 1:
                if (interfaceC16855.attributes().containsKey("center")) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (interfaceC16855.attributes().containsKey("end")) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
                return new AlignmentSpan.Standard(alignment);
            case 2:
                if (C23223.m51768()) {
                    String str5 = (String) interfaceC16855.attributes().get("night");
                    foregroundColorSpan2 = str5 != null ? new ForegroundColorSpan(m52940(str5)) : null;
                    String str6 = (String) interfaceC16855.attributes().get("night-background");
                    if (str6 != null) {
                        backgroundColorSpan2 = new BackgroundColorSpan(m52940(str6));
                    }
                } else {
                    String str7 = (String) interfaceC16855.attributes().get("day");
                    foregroundColorSpan2 = str7 != null ? new ForegroundColorSpan(m52940(str7)) : null;
                    String str8 = (String) interfaceC16855.attributes().get("day-background");
                    if (str8 != null) {
                        backgroundColorSpan2 = new BackgroundColorSpan(m52940(str8));
                    }
                }
                if (foregroundColorSpan2 == null || backgroundColorSpan2 == null) {
                    return foregroundColorSpan2 != null ? foregroundColorSpan2 : backgroundColorSpan2;
                }
                return new Object[]{foregroundColorSpan2, backgroundColorSpan2};
            default:
                return objArr;
        }
    }

    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo8183() {
        return Arrays.asList("font", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "align");
    }
}
