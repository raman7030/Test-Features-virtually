package p067l;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes4.dex */
public final class C18599 {

    /* JADX INFO: renamed from: ֫ */
    public int f55537;

    /* JADX INFO: renamed from: ۜ */
    public int f55538;

    /* JADX INFO: renamed from: ۡ */
    public List f55539;

    /* JADX INFO: renamed from: ۢ */
    public boolean f55540;

    /* JADX INFO: renamed from: ۧ */
    public int f55541;

    /* JADX INFO: renamed from: ܳ */
    public int f55542;

    /* JADX INFO: renamed from: ܺ */
    public int f55543;

    /* JADX INFO: renamed from: ܽ */
    public int f55544;

    /* JADX INFO: renamed from: ܿ */
    public int f55545;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f55546;

    /* JADX INFO: renamed from: ᩷ */
    public int f55547;

    /* JADX INFO: renamed from: ᩻ */
    public int f55548;

    /* JADX INFO: renamed from: ֫ */
    public final View m42323(C4792 c4792) {
        List list = this.f55539;
        if (list == null) {
            View viewM10106 = c4792.m10106(this.f55541);
            this.f55541 += this.f55545;
            return viewM10106;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((AbstractC5462) this.f55539.get(i)).itemView;
            C16190 c16190 = (C16190) view.getLayoutParams();
            if (!c16190.f47660.isRemoved() && this.f55541 == c16190.f47660.getLayoutPosition()) {
                m42324(view);
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42324(View view) {
        int layoutPosition;
        int size = this.f55539.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC5462) this.f55539.get(i2)).itemView;
            C16190 c16190 = (C16190) view3.getLayoutParams();
            if (view3 != view && !c16190.f47660.isRemoved() && (layoutPosition = (c16190.f47660.getLayoutPosition() - this.f55541) * this.f55545) >= 0 && layoutPosition < i) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f55541 = -1;
        } else {
            this.f55541 = ((C16190) view2.getLayoutParams()).f47660.getLayoutPosition();
        }
    }
}
