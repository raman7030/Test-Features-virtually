package p067l;

import android.util.FloatProperty;

/* JADX INFO: renamed from: l.ܶܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB43 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16951 {
    public final String mPropertyName;

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f);

    public AbstractC16951(String str) {
        this.mPropertyName = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16951 m38529(FloatProperty floatProperty) {
        return new C10247(floatProperty.getName(), floatProperty);
    }
}
