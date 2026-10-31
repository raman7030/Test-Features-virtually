package l;

import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes5.dex */
public final class C21456 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20956 f69079;

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final float mo25260() {
        return 0.35f;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        return false;
    }

    public C21456(C20956 c20956) {
        this.f69079 = c20956;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        C20956 c20956 = this.f69079;
        List list = c20956.f67727;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size() || !((AbstractC3817) ((ArrayList) c20956.f67727).get(bindingAdapterPosition)).m11516()) {
            return 0;
        }
        return AbstractC10065.m25259(0, 4);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        C20956 c20956 = this.f69079;
        List list = c20956.f67727;
        if (bindingAdapterPosition < 0 || bindingAdapterPosition >= ((ArrayList) list).size()) {
            c20956.f67725.notifyDataSetChanged();
            return;
        }
        if (C15104.m35794((AbstractC3817) ((ArrayList) c20956.f67727).get(bindingAdapterPosition))) {
            ((ArrayList) c20956.f67727).remove(bindingAdapterPosition);
            c20956.f67725.notifyItemRemoved(bindingAdapterPosition);
            if (c20956.f67725.getItemCount() == 0) {
                c20956.f67726.setVisibility(0);
                return;
            }
            return;
        }
        c20956.f67725.notifyItemChanged(bindingAdapterPosition);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final void mo25262(Canvas canvas, C13132 c13132, AbstractC3255 abstractC3255, float f, float f2, int i, boolean z) {
        if (i == 1) {
            View view = abstractC3255.itemView;
            float fAbs = 1.0f - (Math.abs(f) / (view.getWidth() / 3.0f));
            if (fAbs < 0.0f) {
                fAbs = 0.0f;
            }
            view.setAlpha(fAbs);
        }
        super.mo25262(canvas, c13132, abstractC3255, f, f2, i, z);
    }
}
