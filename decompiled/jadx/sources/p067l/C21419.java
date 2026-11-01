package p067l;

import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes5.dex */
public final class C21419 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C22285 f67598;

    public C21419(C22285 c22285) {
        this.f67598 = c22285;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ((ViewOnClickListenerC8873) abstractC5462).mo4017((AbstractC5996) ((ArrayList) this.f67598.f70412).get(i));
    }

    @Override // p067l.AbstractC21283
    public final void onViewRecycled(AbstractC5462 abstractC5462) {
        ((ViewOnClickListenerC8873) abstractC5462).mo4017((AbstractC5996) null);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC8873(this.f67598.f70409, viewGroup);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return ((ArrayList) this.f67598.f70412).size();
    }
}
