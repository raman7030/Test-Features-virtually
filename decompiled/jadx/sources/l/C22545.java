package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AL */
/* JADX INFO: loaded from: classes.dex */
public final class C22545 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f72935;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f72936;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f72937 = new ArrayList();

    public C22545(Context context, XmlResourceParser xmlResourceParser) {
        this.f72935 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69991);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f72936 = typedArrayObtainStyledAttributes.getResourceId(index, this.f72936);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f72935);
                this.f72935 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
