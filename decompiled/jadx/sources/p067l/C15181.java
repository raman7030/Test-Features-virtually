package p067l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܰ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C15181 extends AbstractC13171 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C9147 f43334;

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final void mo29215(int i) {
    }

    public C15181(C9147 c9147) {
        this.f43334 = c9147;
    }

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final int mo29214() {
        return this.f43334.f16715.size();
    }

    @Override // p067l.AbstractC13171
    /* JADX INFO: renamed from: ֫ */
    public final void mo29216(int i, float f, int i2) {
        C9147 c9147 = this.f43334;
        float fM14828 = (c9147.m14828() * 2) + c9147.m14830();
        ViewParent parent = ((ImageView) c9147.f16715.get(i)).getParent();
        C13045.m29862((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = (fM14828 * f) + ((ViewGroup) parent).getLeft();
        C22988 c22988 = c9147.f24793;
        if (c22988 != null) {
            c22988.m51319(left);
        }
    }
}
