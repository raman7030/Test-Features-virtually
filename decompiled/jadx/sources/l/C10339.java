package l;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10339 extends C13876 {

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13865 f31137;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10339(C13865 c13865) {
        super(C13876.m33247("<>"));
        this.f31137 = c13865;
    }

    @Override // l.C13876, l.AbstractC19902
    public final int getItemViewType(int i) {
        C13865 c13865 = this.f31137;
        if (!c13865.f41341.isEmpty()) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (i2 < c13865.f41341.size()) {
                return 1;
            }
            i = i2 - c13865.f41341.size();
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
            viewM32583.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: l.۬ܰ᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C10339 c10339 = this.f39349;
                    C21282 c21282 = new C21282(c10339.f31137.requireContext(), view, 0);
                    c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c21282.m48302(new InterfaceC14930() { // from class: l.۫ܰ᩷
                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            c10339.f31137.f41343.m44844();
                            return true;
                        }
                    });
                    c21282.m48305();
                }
            });
            return new C3283(viewM32583);
        }
        if (i == 1) {
            return new ViewOnClickListenerC23038(this.f31137, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View viewM32584 = C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false);
        ((TextView) viewM32584.findViewById(R.id.textView)).setText(R.string.MT_Protector);
        return new C3283(viewM32584);
    }

    @Override // l.C13876, l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C13865 c13865 = this.f31137;
        if (!c13865.f41341.isEmpty()) {
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            if (i2 < c13865.f41341.size()) {
                ((ViewOnClickListenerC23038) abstractC3255).m51207((String) c13865.f41341.get(i2));
                return;
            }
            i = i2 - c13865.f41341.size();
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
        C13865 c13865 = this.f31137;
        return !c13865.f41341.isEmpty() ? c13865.f41341.size() + 1 + itemCount : itemCount;
    }

    @Override // l.C13876
    /* JADX INFO: renamed from: ۜ */
    public final int mo15999() {
        C13865 c13865 = this.f31137;
        if (c13865.f41341.isEmpty()) {
            return 1;
        }
        return c13865.f41341.size() + 2;
    }
}
