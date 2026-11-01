package p067l;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤܰ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12195 extends C15556 {

    /* JADX INFO: renamed from: ۡ֫ */
    public final /* synthetic */ C15546 f34099;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12195(C15546 c15546) {
        super(C15556.m35366("<>"));
        this.f34099 = c15546;
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final int getItemViewType(int i) {
        C15546 c15546 = this.f34099;
        if (!c15546.f44422.isEmpty()) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (i2 < c15546.f44422.size()) {
                return 1;
            }
            i = i2 - c15546.f44422.size();
        }
        if (i == 0) {
            return 2;
        }
        return super.getItemViewType(i - 1);
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            View viewM34686 = C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
            ((TextView) viewM34686.findViewById(R.id.textView)).setText(R.string.MT_Protector);
            viewM34686.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: l.۬ܰ᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C12195 c12195 = this.f42411;
                    C1898 c1898 = new C1898(c12195.f34099.requireContext(), view, 0);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50636(new InterfaceC1583() { // from class: l.۫ܰ᩷
                        @Override // p067l.InterfaceC1583
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            c12195.f34099.f44424.m47140();
                            return true;
                        }
                    });
                    c1898.m50639();
                }
            });
            return new C5489(viewM34686);
        }
        if (i == 1) {
            return new ViewOnClickListenerC24264(this.f34099, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View viewM34687 = C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
        ((TextView) viewM34687.findViewById(R.id.textView)).setText(R.string.MT_Protector);
        return new C5489(viewM34687);
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C15546 c15546 = this.f34099;
        if (!c15546.f44422.isEmpty()) {
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            if (i2 < c15546.f44422.size()) {
                ((ViewOnClickListenerC24264) abstractC5462).m53600((String) c15546.f44422.get(i2));
                return;
            }
            i = i2 - c15546.f44422.size();
        }
        if (i > 0) {
            super.onBindViewHolder(abstractC5462, i - 1);
        }
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final int getItemCount() {
        int itemCount = super.getItemCount();
        if (itemCount > 0) {
            itemCount++;
        }
        C15546 c15546 = this.f34099;
        return !c15546.f44422.isEmpty() ? c15546.f44422.size() + 1 + itemCount : itemCount;
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۜ */
    public final int mo17934() {
        C15546 c15546 = this.f34099;
        if (c15546.f44422.isEmpty()) {
            return 1;
        }
        return c15546.f44422.size() + 2;
    }
}
