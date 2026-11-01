package p067l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۨۖ */
/* JADX INFO: compiled from: K22K */
/* JADX INFO: loaded from: classes4.dex */
public final class C1408 implements InterfaceC1968 {
    @Override // p067l.InterfaceC1968
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo21141(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) C1408.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                C1613.m38861(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
