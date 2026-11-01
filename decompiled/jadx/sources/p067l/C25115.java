package p067l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes.dex */
public final class C25115 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final C19751 f80365;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f80366 = new ArrayList();

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnClickListenerC9022) abstractC5462).f24487.setImageResource(((EnumC23276) this.f80366.get(i)).f73221);
    }

    public C25115(C19751 c19751) {
        this.f80365 = c19751;
        for (EnumC23276 enumC23276 : EnumC23276.values()) {
            if (!enumC23276.f73222) {
                this.f80366.add(enumC23276);
            }
        }
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC9022(viewGroup.getContext());
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f80366.size();
    }
}
