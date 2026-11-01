package p067l;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes5.dex */
public final class C22760 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C22285 f71777;

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final float mo27277() {
        return 0.35f;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        return false;
    }

    public C22760(C22285 c22285) {
        this.f71777 = c22285;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        C22285 c22285 = this.f71777;
        List list = c22285.f70412;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size() || !((AbstractC5996) ((ArrayList) c22285.f70412).get(bindingAdapterPosition)).m13452()) {
            return 0;
        }
        return AbstractC11934.m27276(0, 4);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        C22285 c22285 = this.f71777;
        List list = c22285.f70412;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size()) {
            c22285.f70410.notifyDataSetChanged();
            return;
        }
        if (C16723.m37952((AbstractC5996) ((ArrayList) c22285.f70412).get(bindingAdapterPosition))) {
            ((ArrayList) c22285.f70412).remove(bindingAdapterPosition);
            c22285.f70410.notifyItemRemoved(bindingAdapterPosition);
            if (c22285.f70410.getItemCount() == 0) {
                c22285.f70411.setVisibility(0);
                return;
            }
            return;
        }
        c22285.f70410.notifyItemChanged(bindingAdapterPosition);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final void mo27279(Canvas canvas, C14849 c14849, AbstractC5462 abstractC5462, float f, float f2, int i, boolean z) {
        if (i == 1) {
            View view = abstractC5462.itemView;
            float fAbs = 1.0f - (Math.abs(f) / (view.getWidth() / 3.0f));
            if (fAbs < 0.0f) {
                fAbs = 0.0f;
            }
            view.setAlpha(fAbs);
        }
        super.mo27279(canvas, c14849, abstractC5462, f, f2, i, z);
    }
}
