package p067l;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7771 extends C15556 {

    /* JADX INFO: renamed from: ۡ֫ */
    public final /* synthetic */ C23194 f20387;

    public C7771(C23194 c23194) {
        this.f20387 = c23194;
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final int getItemViewType(int i) {
        C23194 c23194 = this.f20387;
        if (!c23194.f72873.isEmpty()) {
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            if (i2 < c23194.f72873.size()) {
                return 1;
            }
            i = i2 - c23194.f72873.size();
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
            viewM34686.findViewById(R.id.more).setOnClickListener(new View.OnClickListener() { // from class: l.᩵᩻ۢ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final C7771 c7771 = this.f66581;
                    C1898 c1898 = new C1898(c7771.f20387.requireContext(), view, 0);
                    c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                    c1898.m50636(new InterfaceC1583() { // from class: l.֡᩻ۢ
                        @Override // p067l.InterfaceC1583
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            c7771.f20387.f72875.m32121();
                            return true;
                        }
                    });
                    c1898.m50639();
                }
            });
            return new C20512(viewM34686);
        }
        if (i == 1) {
            return new ViewOnClickListenerC17157(this.f20387, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
        }
        if (i != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View viewM34687 = C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false);
        ((TextView) viewM34687.findViewById(R.id.textView)).setText(R.string.MT_Protector);
        return new C20512(viewM34687);
    }

    @Override // p067l.C15556, p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C23194 c23194 = this.f20387;
        if (!c23194.f72873.isEmpty()) {
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            if (i2 < c23194.f72873.size()) {
                ((ViewOnClickListenerC17157) abstractC5462).m38867((String) c23194.f72873.get(i2));
                return;
            }
            i = i2 - c23194.f72873.size();
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
        C23194 c23194 = this.f20387;
        return !c23194.f72873.isEmpty() ? c23194.f72873.size() + 1 + itemCount : itemCount;
    }

    @Override // p067l.C15556
    /* JADX INFO: renamed from: ۜ */
    public final int mo17934() {
        C23194 c23194 = this.f20387;
        if (c23194.f72873.isEmpty()) {
            return 1;
        }
        return c23194.f72873.size() + 2;
    }
}
