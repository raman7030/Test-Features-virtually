package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C4675 extends AbstractC3255 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextView f14858;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f14859;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f14860;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4675(C3264 c3264, View view) {
        super(view);
        this.f14860 = c3264;
        this.f14859 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f14858 = (TextView) view.findViewById(R.id.MT_Protector);
        C19890.m45741(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.᩶۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4675 c4675 = this.f65357;
                C3264 c3265 = c4675.f14860;
                int bindingAdapterPosition = c4675.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c3265.f10243.f62726.size()) {
                    return;
                }
                C3264.m9997(c3265, ((C18673) c3265.f10243.f62726.get(bindingAdapterPosition - 1)).f59011);
            }
        });
    }
}
