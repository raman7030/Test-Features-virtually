package p067l;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: l.֨ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8HP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3334 {

    /* JADX INFO: renamed from: ܽ */
    public static final String[] f6519 = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: ۧ */
    public static final String[] f6518 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f6517 = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX INFO: renamed from: ֫ */
    public static C20099 m5814(String str) {
        try {
            return m5815(str);
        } catch (NumberFormatException | C10998 | XmlPullParserException unused) {
            C21334.m48351("Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C20099 m5815(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!C19874.m45116(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C10998.m25387("Couldn't find xmp metadata", (Throwable) null);
        }
        AbstractC16192 abstractC16192M36872of = AbstractC16192.m36872of();
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (C19874.m45116(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strM45114 = C19874.m45114(xmlPullParserNewPullParser, f6519[i2]);
                    if (strM45114 != null) {
                        if (Integer.parseInt(strM45114) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strM45115 = C19874.m45114(xmlPullParserNewPullParser, f6518[i3]);
                                if (strM45115 != null) {
                                    j = Long.parseLong(strM45115);
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
                                String strM45116 = C19874.m45114(xmlPullParserNewPullParser, f6517[i]);
                                if (strM45116 != null) {
                                    abstractC16192M36872of = AbstractC16192.m36874of((Object) new C6017("image/jpeg", 0L, 0L), (Object) new C6017("video/mp4", Long.parseLong(strM45116), 0L));
                                    break;
                                }
                                i++;
                            } else {
                                abstractC16192M36872of = AbstractC16192.m36872of();
                                break;
                            }
                        }
                    }
                }
                return null;
            }
            if (C19874.m45116(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC16192M36872of = m5813(xmlPullParserNewPullParser, "Container", "Item");
            } else if (C19874.m45116(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC16192M36872of = m5813(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!C19874.m45115(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC16192M36872of.isEmpty()) {
            break loop0;
        }
        return new C20099(j, abstractC16192M36872of);
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16192 m5813(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (C19874.m45116(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM45114 = C19874.m45114(xmlPullParser, strConcat3);
                String strM45115 = C19874.m45114(xmlPullParser, strConcat4);
                String strM45116 = C19874.m45114(xmlPullParser, strConcat5);
                String strM45117 = C19874.m45114(xmlPullParser, strConcat6);
                if (strM45114 == null || strM45115 == null) {
                    return AbstractC16192.m36872of();
                }
                c4123.m18184(new C6017(strM45114, strM45116 != null ? Long.parseLong(strM45116) : 0L, strM45117 != null ? Long.parseLong(strM45117) : 0L));
            }
        } while (!C19874.m45115(xmlPullParser, strConcat2));
        return c4123.m8329();
    }
}
