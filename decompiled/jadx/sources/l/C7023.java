package l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7023 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17606 f21665;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f21669 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f21667 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public SparseArray f21668 = new SparseArray();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SparseArray f21666 = new SparseArray();

    public C7023(Context context, C17606 c17606, int i) {
        String str;
        this.f21665 = c17606;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C14783 c14783 = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m18989(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                C14783 c14784 = new C14783(context, xml);
                                this.f21668.put(c14784.f45154, c14784);
                                c14783 = c14784;
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
                                C23956 c23956 = new C23956(context, xml);
                                if (c14783 != null) {
                                    c14783.f45155.add(c23956);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18990(float f, float f2, int i) {
        C4201 c4201;
        C14783 c14783;
        int i2 = this.f21669;
        int i3 = 0;
        C17606 c17606 = this.f21665;
        SparseArray sparseArray = this.f21668;
        if (i2 == i) {
            if (i == -1) {
                c14783 = (C14783) sparseArray.valueAt(0);
            } else {
                c14783 = (C14783) sparseArray.get(i2);
            }
            int i4 = this.f21667;
            if (i4 == -1 || !((C23956) c14783.f45155.get(i4)).m52781(f, f2)) {
                ArrayList arrayList = c14783.f45155;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((C23956) arrayList.get(i3)).m52781(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                ArrayList arrayList2 = c14783.f45155;
                if (this.f21667 == i3) {
                    return;
                }
                C4201 c4202 = i3 == -1 ? null : ((C23956) arrayList2.get(i3)).f77674;
                if (i3 != -1) {
                    int i5 = ((C23956) arrayList2.get(i3)).f77673;
                }
                if (c4202 == null) {
                    return;
                }
                this.f21667 = i3;
                c4202.m12676(c17606);
                return;
            }
            return;
        }
        this.f21669 = i;
        C14783 c14784 = (C14783) sparseArray.get(i);
        ArrayList arrayList3 = c14784.f45155;
        while (true) {
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (((C23956) arrayList3.get(i3)).m52781(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList arrayList4 = c14784.f45155;
        if (i3 == -1) {
            c4201 = c14784.f45153;
        } else {
            c4201 = ((C23956) arrayList4.get(i3)).f77674;
        }
        if (i3 != -1) {
            int i6 = ((C23956) arrayList4.get(i3)).f77673;
        }
        if (c4201 == null) {
            return;
        }
        this.f21667 = i3;
        c4201.m12676(c17606);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18989(Context context, XmlResourceParser xmlResourceParser) {
        C4201 c4201 = new C4201();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                c4201.m12672(context, xmlResourceParser);
                this.f21666.put(identifier, c4201);
                return;
            }
        }
    }
}
