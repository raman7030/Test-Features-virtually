package p067l;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: l.᩵ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C20691 {
    /* JADX INFO: renamed from: ֫ */
    public static ObjectAnimator m46757(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }
}
