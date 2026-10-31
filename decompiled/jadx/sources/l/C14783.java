package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14783 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f45152;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4201 f45153;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f45154;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f45155 = new ArrayList();

    public C14783(Context context, XmlResourceParser xmlResourceParser) {
        this.f45152 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69991);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f45154 = typedArrayObtainStyledAttributes.getResourceId(index, this.f45154);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f45152);
                this.f45152 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C4201 c4201 = new C4201();
                    this.f45153 = c4201;
                    c4201.m12685((C17606) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
