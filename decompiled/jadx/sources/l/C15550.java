package l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QB18 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15550 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36700(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36698(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Drawable m36699(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }
}
