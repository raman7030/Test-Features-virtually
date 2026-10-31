package l;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5684 extends C13876 {

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21912 f17540;

    public C5684(C21912 c21912) {
        this.f17540 = c21912;
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemViewType(int i) {
        C21912 c21912 = this.f17540;
        if (!c21912.f70159.isEmpty()) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (i2 < c21912.f70159.size()) {
                return 1;
            }
            i = i2 - c21912.f70159.size();
        }
        if (i == 0) {
            return 2;
        }
        return super.getItemViewType(i - 1);
    }

    @Override // l.C13876, l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewM32583 = C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false);
            ((TextView) viewM32583.findViewById(R.id.textView)).setText(R.string.MT_Protector);
            viewM32583.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: l.᩵᩻ۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C5684 c5684 = this.f63944;
                    C21282 c21282 = new C21282(c5684.f17540.requireContext(), view, 0);
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c21282.m48302(new InterfaceC14930() { // from class: l.֡᩻ۢ
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            c5684.f17540.f70161.m30060();
                            return true;
                        }
                    });
                    c21282.m48305();
                }
            });
            return new C19090(viewM32583);
        }
        if (i == 1) {
            return new ViewOnClickListenerC15560(this.f17540, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View viewM32584 = C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false);
        ((TextView) viewM32584.findViewById(R.id.textView)).setText(R.string.MT_Protector);
        return new C19090(viewM32584);
    }

    @Override // l.C13876, l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C21912 c21912 = this.f17540;
        if (!c21912.f70159.isEmpty()) {
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            if (i2 < c21912.f70159.size()) {
                ((ViewOnClickListenerC15560) abstractC3255).m36706((String) c21912.f70159.get(i2));
                return;
            }
            i = i2 - c21912.f70159.size();
        }
        if (i > 0) {
            super.onBindViewHolder(abstractC3255, i - 1);
        }
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemCount() {
        int itemCount = super.getItemCount();
        if (itemCount > 0) {
            itemCount++;
        }
        C21912 c21912 = this.f17540;
        return !c21912.f70159.isEmpty() ? c21912.f70159.size() + 1 + itemCount : itemCount;
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int mo15999() {
        C21912 c21912 = this.f17540;
        if (c21912.f70159.isEmpty()) {
            return 1;
        }
        return c21912.f70159.size() + 2;
    }
}
