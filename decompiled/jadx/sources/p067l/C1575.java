package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩸ */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C1575 {

    /* JADX INFO: renamed from: ֫ */
    public int f48266;

    /* JADX INFO: renamed from: ۧ */
    public C1050 f48267;

    /* JADX INFO: renamed from: ܽ */
    public int f48268;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f48269 = new ArrayList();

    public C1575(Context context, XmlResourceParser xmlResourceParser) {
        this.f48266 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C1925.f72700);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f48268 = typedArrayObtainStyledAttributes.getResourceId(index, this.f48268);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f48266);
                this.f48266 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C1050 c1050 = new C1050();
                    this.f48267 = c1050;
                    c1050.m14561((C1715) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
