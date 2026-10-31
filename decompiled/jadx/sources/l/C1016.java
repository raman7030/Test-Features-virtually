package l;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: l.֨ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8HP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1016 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f3745 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f3744 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f3743 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18656 m3527(String str) {
        try {
            return m3528(str);
        } catch (NumberFormatException | C9080 | XmlPullParserException unused) {
            C19956.m46037("Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18656 m3528(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!C18420.m42843(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C9080.m23440("Couldn't find xmp metadata", (Throwable) null);
        }
        AbstractC14545 abstractC14545Of = AbstractC14545.of();
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (C18420.m42843(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strM42841 = C18420.m42841(xmlPullParserNewPullParser, f3745[i2]);
                    if (strM42841 != null) {
                        if (Integer.parseInt(strM42841) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strM42842 = C18420.m42841(xmlPullParserNewPullParser, f3744[i3]);
                                if (strM42842 != null) {
                                    j = Long.parseLong(strM42842);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i < 2) {
                                String strM42843 = C18420.m42841(xmlPullParserNewPullParser, f3743[i]);
                                if (strM42843 != null) {
                                    abstractC14545Of = AbstractC14545.of((Object) new C3839("image/jpeg", 0L, 0L), (Object) new C3839("video/mp4", Long.parseLong(strM42843), 0L));
                                    break;
                                }
                                i++;
                            } else {
                                abstractC14545Of = AbstractC14545.of();
                                break;
                            }
                        }
                    }
                }
                return null;
            }
            if (C18420.m42843(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC14545Of = m3526(xmlPullParserNewPullParser, "Container", "Item");
            } else if (C18420.m42843(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC14545Of = m3526(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!C18420.m42842(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC14545Of.isEmpty()) {
            break loop0;
        }
        return new C18656(j, abstractC14545Of);
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14545 m3526(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C18420.m42843(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM42841 = C18420.m42841(xmlPullParser, strConcat3);
                String strM42842 = C18420.m42841(xmlPullParser, strConcat4);
                String strM42843 = C18420.m42841(xmlPullParser, strConcat5);
                String strM42844 = C18420.m42841(xmlPullParser, strConcat6);
                if (strM42841 == null || strM42842 == null) {
                    return AbstractC14545.of();
                }
                c1846.m16264(new C3839(strM42841, strM42843 != null ? Long.parseLong(strM42843) : 0L, strM42844 != null ? Long.parseLong(strM42844) : 0L));
            }
        } while (!C18420.m42842(xmlPullParser, strConcat2));
        return c1846.m6131();
    }
}
