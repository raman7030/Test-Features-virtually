package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩸ */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes.dex */
public final class C1960 {

    /* JADX INFO: renamed from: ֫ */
    public int f75662;

    /* JADX INFO: renamed from: ۧ */
    public int f75663;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f75664 = new ArrayList();

    public C1960(Context context, XmlResourceParser xmlResourceParser) {
        this.f75662 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72700);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f75663 = typedArrayObtainStyledAttributes.getResourceId(index, this.f75663);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f75662);
                this.f75662 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
