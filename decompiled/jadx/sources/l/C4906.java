package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes2.dex */
public final class C4906 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15490;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SparseArray f15491 = new SparseArray();

    public C4906(Context context, XmlResourceParser xmlResourceParser) {
        this.f15490 = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69992);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f15490 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15490);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            C22545 c22545 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                C22545 c22546 = new C22545(context, xmlResourceParser);
                                this.f15491.put(c22546.f72936, c22546);
                                c22545 = c22546;
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
                                C20429 c20429 = new C20429(context, xmlResourceParser);
                                if (c22545 != null) {
                                    c22545.f72937.add(c20429);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14278(float f, float f2, int i, int i2) {
        C22545 c22545 = (C22545) this.f15491.get(i2);
        if (c22545 == null) {
            return i2;
        }
        ArrayList<C20429> arrayList = c22545.f72937;
        int i3 = c22545.f72935;
        if (f != -1.0f && f2 != -1.0f) {
            C20429 c20429 = null;
            for (C20429 c204210 : arrayList) {
                if (c204210.m46832(f, f2)) {
                    if (i != c204210.f65921) {
                        c20429 = c204210;
                    }
                }
            }
            return c20429 != null ? c20429.f65921 : i3;
        }
        if (i3 != i) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (i == ((C20429) it.next()).f65921) {
                }
            }
            return i3;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14279(int i) {
        C22545 c22545;
        float f = -1;
        int i2 = 0;
        SparseArray sparseArray = this.f15491;
        if (-1 == i) {
            if (i == -1) {
                c22545 = (C22545) sparseArray.valueAt(0);
            } else {
                c22545 = (C22545) sparseArray.get(-1);
            }
            if (c22545 != null) {
                ArrayList arrayList = c22545.f72937;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((C20429) arrayList.get(i2)).m46832(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? c22545.f72935 : ((C20429) arrayList.get(i2)).f65921;
                }
            }
        } else {
            C22545 c22546 = (C22545) sparseArray.get(i);
            if (c22546 != null) {
                ArrayList arrayList2 = c22546.f72937;
                while (i2 < arrayList2.size()) {
                    if (((C20429) arrayList2.get(i2)).m46832(f, f)) {
                        return i2 == -1 ? c22546.f72935 : ((C20429) arrayList2.get(i2)).f65921;
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
