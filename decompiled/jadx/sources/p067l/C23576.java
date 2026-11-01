package p067l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes.dex */
public final class C23576 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5471 f75057;

    @Override // p067l.AbstractC21283
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public C23576(C5471 c5471) {
        this.f75057 = c5471;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C5471 c5471 = this.f75057;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(c5471.f13044);
        if (i == 0) {
            return new C22906(layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
        }
        return new C6812(c5471, layoutInflaterFrom.inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C5471 c5471 = this.f75057;
        if (i == 0) {
            C5471.m12016(c5471, abstractC5462.itemView);
            return;
        }
        C20115 c20115 = (C20115) c5471.f13051.f65337.get(i - 1);
        C6812 c6812 = (C6812) abstractC5462;
        c6812.f17688.setText(c20115.f62231);
        c6812.f17687.setText(c20115.f62234);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f75057.f13051.f65337.size() + 1;
    }
}
