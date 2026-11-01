package p067l;

import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6812 extends AbstractC5462 {

    /* JADX INFO: renamed from: ֫ */
    public final TextView f17687;

    /* JADX INFO: renamed from: ۧ */
    public final TextView f17688;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C5471 f17689;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6812(C5471 c5471, View view) {
        super(view);
        this.f17689 = c5471;
        this.f17688 = (TextView) view.findViewById(R.id.MT_Protector);
        this.f17687 = (TextView) view.findViewById(R.id.MT_Protector);
        C21272.m48052(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.᩶۬᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6812 c6812 = this.f68004;
                C5471 c5472 = c6812.f17689;
                int bindingAdapterPosition = c6812.getBindingAdapterPosition();
                if (bindingAdapterPosition <= 0 || bindingAdapterPosition > c5472.f13051.f65337.size()) {
                    return;
                }
                C5471.m12030(c5472, ((C20115) c5472.f13051.f65337.get(bindingAdapterPosition - 1)).f62234);
            }
        });
    }
}
