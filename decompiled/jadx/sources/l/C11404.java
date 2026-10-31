package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K22K */
/* JADX INFO: loaded from: classes4.dex */
public final class C11404 implements InterfaceC22692 {
    @Override // l.InterfaceC22692
    /* JADX INFO: renamed from: ֫ */
    public final Drawable mo19194(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) C11404.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                C15550.m36700(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
