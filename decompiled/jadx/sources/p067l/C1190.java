package p067l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۜ᩸ */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1190 {

    /* JADX INFO: renamed from: ֫ */
    public final C1715 f24546;

    /* JADX INFO: renamed from: ᩳ */
    public int f24550 = -1;

    /* JADX INFO: renamed from: ܽ */
    public int f24548 = -1;

    /* JADX INFO: renamed from: ܿ */
    public SparseArray f24549 = new SparseArray();

    /* JADX INFO: renamed from: ۧ */
    public SparseArray f24547 = new SparseArray();

    public C1190(Context context, C1715 c1715, int i) {
        String str;
        this.f24546 = c1715;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C1575 c1575 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m20946(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C1575 c1576 = new C1575(context, xml);
                                this.f24549.put(c1576.f48268, c1576);
                                c1575 = c1576;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C2030 c2030 = new C2030(context, xml);
                                if (c1575 != null) {
                                    c1575.f48269.add(c2030);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20947(float f, float f2, int i) {
        C1050 c1050;
        C1575 c1575;
        int i2 = this.f24550;
        int i3 = 0;
        C1715 c1715 = this.f24546;
        SparseArray sparseArray = this.f24549;
        if (i2 == i) {
            if (i == -1) {
                c1575 = (C1575) sparseArray.valueAt(0);
            } else {
                c1575 = (C1575) sparseArray.get(i2);
            }
            int i4 = this.f24548;
            if (i4 == -1 || !((C2030) c1575.f48269.get(i4)).m55187(f, f2)) {
                ArrayList arrayList = c1575.f48269;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((C2030) arrayList.get(i3)).m55187(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                ArrayList arrayList2 = c1575.f48269;
                if (this.f24548 == i3) {
                    return;
                }
                C1050 c1051 = i3 == -1 ? null : ((C2030) arrayList2.get(i3)).f80426;
                if (i3 != -1) {
                    int i5 = ((C2030) arrayList2.get(i3)).f80425;
                }
                if (c1051 == null) {
                    return;
                }
                this.f24548 = i3;
                c1051.m14552(c1715);
                return;
            }
            return;
        }
        this.f24550 = i;
        C1575 c1576 = (C1575) sparseArray.get(i);
        ArrayList arrayList3 = c1576.f48269;
        while (true) {
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (((C2030) arrayList3.get(i3)).m55187(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList arrayList4 = c1576.f48269;
        if (i3 == -1) {
            c1050 = c1576.f48267;
        } else {
            c1050 = ((C2030) arrayList4.get(i3)).f80426;
        }
        if (i3 != -1) {
            int i6 = ((C2030) arrayList4.get(i3)).f80425;
        }
        if (c1050 == null) {
            return;
        }
        this.f24548 = i3;
        c1050.m14552(c1715);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20946(Context context, XmlResourceParser xmlResourceParser) {
        C1050 c1050 = new C1050();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                c1050.m14548(context, xmlResourceParser);
                this.f24547.put(identifier, c1050);
                return;
            }
        }
    }
}
