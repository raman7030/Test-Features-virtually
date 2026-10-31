package l;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: l.֫ۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes2.dex */
public final class C1639 extends Property {
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        C21560.m48717(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}
