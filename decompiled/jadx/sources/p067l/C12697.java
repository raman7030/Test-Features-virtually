package p067l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27KL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12697 extends AbstractC13171 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C19402 f35636;

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final void mo29215(int i) {
    }

    public C12697(C19402 c19402) {
        this.f35636 = c19402;
    }

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final int mo29214() {
        return this.f35636.f16715.size();
    }

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final void mo29216(int i, float f, int i2) {
        float fM14830;
        C19402 c19402 = this.f35636;
        ArrayList arrayList = c19402.f16715;
        ViewParent parent = ((ImageView) arrayList.get(i)).getParent();
        C13045.m29862((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = ((ViewGroup) parent).getLeft();
        if (i2 != -1) {
            i = i2;
        }
        ViewParent parent2 = ((ImageView) arrayList.get(i)).getParent();
        C13045.m29862((Object) parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        float left2 = ((ViewGroup) parent2).getLeft();
        if (0.0f <= f && f <= 0.1f) {
            fM14830 = c19402.m14830();
        } else if (0.1f <= f && f <= 0.9f) {
            fM14830 = (left2 - left) + c19402.m14830();
        } else {
            left = left2;
            fM14830 = c19402.m14830();
        }
        C22988 c22988 = c19402.f57939;
        if (c22988 != null) {
            c22988.m51319(left);
        }
        C22988 c22989 = c19402.f57942;
        if (c22989 != null) {
            c22989.m51319(fM14830);
        }
    }
}
