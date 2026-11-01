package p067l;

import android.util.FloatProperty;

/* JADX INFO: renamed from: l.۠ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB43 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10247 extends AbstractC16951 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ FloatProperty f28376;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10247(String str, FloatProperty floatProperty) {
        super(str);
        this.f28376 = floatProperty;
    }

    @Override // p067l.AbstractC16951
    public final float getValue(Object obj) {
        return ((Float) this.f28376.get(obj)).floatValue();
    }

    @Override // p067l.AbstractC16951
    public final void setValue(Object obj, float f) {
        this.f28376.setValue(obj, f);
    }
}
