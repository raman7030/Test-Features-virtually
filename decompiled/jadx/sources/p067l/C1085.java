package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۙ᩸ */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1085 {

    /* JADX INFO: renamed from: ֫ */
    public int f18323;

    /* JADX INFO: renamed from: ۧ */
    public SparseArray f18324 = new SparseArray();

    public C1085(Context context, XmlResourceParser xmlResourceParser) {
        this.f18323 = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72701);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f18323 = typedArrayObtainStyledAttributes.getResourceId(index, this.f18323);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            C1960 c1960 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                C1960 c1961 = new C1960(context, xmlResourceParser);
                                this.f18324.put(c1961.f75663, c1961);
                                c1960 = c1961;
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C1855 c1855 = new C1855(context, xmlResourceParser);
                                if (c1960 != null) {
                                    c1960.f75664.add(c1855);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16175(float f, float f2, int i, int i2) {
        C1960 c1960 = (C1960) this.f18324.get(i2);
        if (c1960 == null) {
            return i2;
        }
        ArrayList<C1855> arrayList = c1960.f75664;
        int i3 = c1960.f75662;
        if (f != -1.0f && f2 != -1.0f) {
            C1855 c1855 = null;
            for (C1855 c1856 : arrayList) {
                if (c1856.m49155(f, f2)) {
                    if (i != c1856.f68596) {
                        c1855 = c1856;
                    }
                }
            }
            return c1855 != null ? c1855.f68596 : i3;
        }
        if (i3 != i) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (i == ((C1855) it.next()).f68596) {
                }
            }
            return i3;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX INFO: renamed from: ֫ */
    public final int m16176(int i) {
        C1960 c1960;
        float f = -1;
        int i2 = 0;
        SparseArray sparseArray = this.f18324;
        if (-1 == i) {
            if (i == -1) {
                c1960 = (C1960) sparseArray.valueAt(0);
            } else {
                c1960 = (C1960) sparseArray.get(-1);
            }
            if (c1960 != null) {
                ArrayList arrayList = c1960.f75664;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((C1855) arrayList.get(i2)).m49155(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? c1960.f75662 : ((C1855) arrayList.get(i2)).f68596;
                }
            }
        } else {
            C1960 c1961 = (C1960) sparseArray.get(i);
            if (c1961 != null) {
                ArrayList arrayList2 = c1961.f75664;
                while (i2 < arrayList2.size()) {
                    if (((C1855) arrayList2.get(i2)).m49155(f, f)) {
                        return i2 == -1 ? c1961.f75662 : ((C1855) arrayList2.get(i2)).f68596;
                    }
                    i2++;
                }
                i2 = -1;
                if (i2 == -1) {
                }
            }
        }
        return -1;
    }
}
