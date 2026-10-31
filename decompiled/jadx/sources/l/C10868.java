package l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10868 extends AbstractC11367 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17923 f32659;

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27170(int i) {
    }

    public C10868(C17923 c17923) {
        this.f32659 = c17923;
    }

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo27169() {
        return this.f32659.f13900.size();
    }

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27171(int i, float f, int i2) {
        float fM12966;
        C17923 c17923 = this.f32659;
        ArrayList arrayList = c17923.f13900;
        ViewParent parent = ((ImageView) arrayList.get(i)).getParent();
        C11233.m27800((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = ((ViewGroup) parent).getLeft();
        if (i2 != -1) {
            i = i2;
        }
        ViewParent parent2 = ((ImageView) arrayList.get(i)).getParent();
        C11233.m27800((Object) parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        float left2 = ((ViewGroup) parent2).getLeft();
        if (0.0f <= f && f <= 0.1f) {
            fM12966 = c17923.m12966();
        } else if (0.1f <= f && f <= 0.9f) {
            fM12966 = (left2 - left) + c17923.m12966();
        } else {
            left = left2;
            fM12966 = c17923.m12966();
        }
        C21696 c21696 = c17923.f54742;
        if (c21696 != null) {
            c21696.m48970(left);
        }
        C21696 c21697 = c17923.f54745;
        if (c21697 != null) {
            c21697.m48970(fM12966);
        }
    }
}
