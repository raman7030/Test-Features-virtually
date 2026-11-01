package p067l;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4LW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14909 extends AbstractViewOnLongClickListenerC16250 {

    /* JADX INFO: renamed from: ۛ */
    public AbstractViewOnClickListenerC14239 f42521;

    /* JADX INFO: renamed from: ۤ */
    public final ImageView f42522;

    public C14909(AbstractActivityC5549 abstractActivityC5549, View view) {
        super(abstractActivityC5549, view);
        ImageView imageView = (ImageView) view.findViewById(R.id.MT_Protector);
        this.f42522 = imageView;
        imageView.setImageResource(R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final void mo34117(Resources.Theme theme) {
        C21272.m48052(this.itemView);
        this.f47809.setTextColor(C23223.f72984);
        this.f42522.setImageResource(R.drawable.MT_Protector);
    }
}
