package l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes2.dex */
public final class C2767 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f8596;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f8597;

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ViewOnClickListenerC16171 viewOnClickListenerC16171 = (ViewOnClickListenerC16171) abstractC3255;
        C4178 c4178 = (C4178) this.f8597.get(i);
        viewOnClickListenerC16171.f49823.setImageBitmap(c4178.m12623());
        viewOnClickListenerC16171.f49824.setText(c4178.m12625());
    }

    public C2767(AbstractActivityC3346 abstractActivityC3346) throws Throwable {
        this.f8596 = abstractActivityC3346;
        ArrayList arrayList = new ArrayList();
        this.f8597 = new ArrayList();
        for (C7232 c7232 : C16362.m38507(abstractActivityC3346)) {
            Bitmap bitmapM139 = ShortcutActivity.m139(c7232.m19332());
            if (bitmapM139 != null) {
                this.f8597.add(0, new C4178(c7232.m19332(), c7232.m19334(), bitmapM139));
            } else {
                arrayList.add(c7232.m19332());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C16362.m38510(abstractActivityC3346, (List) arrayList);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC16171(this, C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f8597.size();
    }
}
