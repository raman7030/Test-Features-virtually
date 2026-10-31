package l;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: l.ۧۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10812 extends Property {
    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int iRound = Math.round(pointF.x);
        int iRound2 = Math.round(pointF.y);
        C21560.m48717(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
    }
}
