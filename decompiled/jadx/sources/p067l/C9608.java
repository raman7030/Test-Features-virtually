package p067l;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes3.dex */
public final class C9608 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24951 f26474;

    public C9608(C24951 c24951) {
        this.f26474 = c24951;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        String strM16203;
        ViewOnClickListenerC16233 viewOnClickListenerC16233 = (ViewOnClickListenerC16233) abstractC5462;
        viewOnClickListenerC16233.f47778.setVisibility(0);
        C24951 c24951 = this.f26474;
        C16903 c16903 = (C16903) ((ArrayList) c24951.m54834()).get(i);
        viewOnClickListenerC16233.f47775.setText(c16903.m38467());
        TextView textView = viewOnClickListenerC16233.f47777;
        C12962 c12962 = c16903.f50053;
        C12962 c12963 = c16903.f50052;
        if (c12963 == null) {
            strM16203 = c12962.mo29722();
        } else {
            strM16203 = C7050.m16203(R.string.MT_Protector, c12962.mo29722(), c12963.mo29722());
        }
        textView.setText(strM16203);
        if (c24951.f79669.f4847) {
            viewOnClickListenerC16233.itemView.setBackgroundColor(c24951.f79672.get(i) ? C23223.f72997 : 0);
        } else if (viewOnClickListenerC16233.itemView.getBackground() instanceof ColorDrawable) {
            C21272.m48052(viewOnClickListenerC16233.itemView);
        }
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C24951 c24951 = this.f26474;
        return new ViewOnClickListenerC16233(c24951, LayoutInflater.from(c24951.f79669).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return ((ArrayList) this.f26474.m54834()).size();
    }
}
