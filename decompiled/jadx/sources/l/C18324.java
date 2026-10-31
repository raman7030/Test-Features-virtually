package l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18324 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f56973;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f56974;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1556 f56975;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnTouchListenerC17618) abstractC3255).m41179((C13900) this.f56974.get(i), this.f56975);
    }

    public C18324(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList) {
        this.f56973 = abstractActivityC3346;
        this.f56974 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42704(C1556 c1556) {
        this.f56975 = c1556;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractActivityC3346 abstractActivityC3346 = this.f56973;
        return new ViewOnTouchListenerC17618(abstractActivityC3346, LayoutInflater.from(abstractActivityC3346).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f56974.size();
    }
}
