package l;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: l.᩵ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25CY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19279 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m44463(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }
}
