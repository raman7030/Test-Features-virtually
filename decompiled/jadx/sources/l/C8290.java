package l;

import android.util.FloatProperty;

/* JADX INFO: renamed from: l.۠ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB43 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8290 extends AbstractC15344 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatProperty f25466;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8290(String str, FloatProperty floatProperty) {
        super(str);
        this.f25466 = floatProperty;
    }

    @Override // l.AbstractC15344
    public final float getValue(Object obj) {
        return ((Float) this.f25466.get(obj)).floatValue();
    }

    @Override // l.AbstractC15344
    public final void setValue(Object obj, float f) {
        this.f25466.setValue(obj, f);
    }
}
