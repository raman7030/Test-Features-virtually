package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes.dex */
public final class C23933 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18289 f77613;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77614 = new ArrayList();

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC7000) abstractC3255).f21606.setImageResource(((EnumC21999) this.f77614.get(i)).f70507);
    }

    public C23933(C18289 c18289) {
        this.f77613 = c18289;
        for (EnumC21999 enumC21999 : EnumC21999.values()) {
            if (!enumC21999.f70508) {
                this.f77614.add(enumC21999);
            }
        }
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC7000(viewGroup.getContext());
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f77614.size();
    }
}
