package l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes5.dex */
public final class C20045 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20956 f64956;

    public C20045(C20956 c20956) {
        this.f64956 = c20956;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ((ViewOnClickListenerC6844) abstractC3255).mo1617((AbstractC3817) ((ArrayList) this.f64956.f67727).get(i));
    }

    @Override // l.AbstractC19902
    public final void onViewRecycled(AbstractC3255 abstractC3255) {
        ((ViewOnClickListenerC6844) abstractC3255).mo1617((AbstractC3817) null);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC6844(this.f64956.f67724, viewGroup);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return ((ArrayList) this.f64956.f67727).size();
    }
}
