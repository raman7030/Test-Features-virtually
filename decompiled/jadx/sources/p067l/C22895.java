package p067l;

import android.util.TypedValue;
import com.google.android.material.chip.Chip;

/* JADX INFO: renamed from: l.᩸۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C22895 {
    /* JADX INFO: renamed from: ֫ */
    public static C16858 m51122(XmlResourceParserC12128 xmlResourceParserC12128, int[] iArr, C14281 c14281) {
        C16858 c16858 = new C16858(xmlResourceParserC12128, iArr.length);
        int attributeCount = xmlResourceParserC12128.getAttributeCount();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < attributeCount; i3++) {
                if (xmlResourceParserC12128.getAttributeNameResource(i3) == i2) {
                    int i4 = i * 2;
                    int iM28045 = xmlResourceParserC12128.m28045(i3);
                    int iM28042 = xmlResourceParserC12128.m28042(i3);
                    if (iM28045 == 1) {
                        TypedValue typedValue = new TypedValue();
                        c14281.m32842(iM28042, typedValue, true);
                        int i5 = typedValue.type;
                        int i6 = typedValue.data;
                        if (i5 == 3) {
                            int iM12359 = xmlResourceParserC12128.m28040().m34285(typedValue.string.toString()).m12359();
                            iM28045 = i5;
                            iM28042 = iM12359;
                        } else {
                            iM28045 = i5;
                            iM28042 = i6;
                        }
                    }
                    int[] iArr2 = c16858.f49918;
                    iArr2[i4] = iM28045;
                    iArr2[i4 + 1] = iM28042;
                    break;
                }
            }
        }
        return c16858;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2004 m51123(C16858 c16858, XmlResourceParserC12128 xmlResourceParserC12128, String str, int i) {
        if (xmlResourceParserC12128.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null) {
            TypedValue typedValue = new TypedValue();
            c16858.m38371(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return C1759.m45241(typedValue.data);
            }
            if (i2 == 1 || i2 == 2) {
                return C1759.m45241(-16777216);
            }
        }
        return C1759.m45241(0);
    }
}
