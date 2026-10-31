package l;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.ᩴ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18420 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m42842(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m42843(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42841(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
