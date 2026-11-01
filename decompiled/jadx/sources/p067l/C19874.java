package p067l;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ᩴ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19874 {
    /* JADX INFO: renamed from: ۧ */
    public static boolean m45115(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m45116(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45114(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
