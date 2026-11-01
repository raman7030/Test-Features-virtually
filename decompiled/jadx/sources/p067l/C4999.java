package p067l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import bin.p000mt.plus.ShortcutActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 892H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4999 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractActivityC5549 f11390;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f11391;

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC17738 viewOnClickListenerC17738 = (ViewOnClickListenerC17738) abstractC5462;
        C6340 c6340 = (C6340) this.f11391.get(i);
        viewOnClickListenerC17738.f52989.setImageBitmap(c6340.m14498());
        viewOnClickListenerC17738.f52990.setText(c6340.m14500());
    }

    public C4999(AbstractActivityC5549 abstractActivityC5549) throws Throwable {
        this.f11390 = abstractActivityC5549;
        ArrayList arrayList = new ArrayList();
        this.f11391 = new ArrayList();
        for (C1201 c1201 : C1654.m40724(abstractActivityC5549)) {
            Bitmap bitmapM137 = ShortcutActivity.m137(c1201.m21281());
            if (bitmapM137 != null) {
                this.f11391.add(0, new C6340(c1201.m21281(), c1201.m21283(), bitmapM137));
            } else {
                arrayList.add(c1201.m21281());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C1654.m40727(abstractActivityC5549, (List) arrayList);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewOnClickListenerC17738(this, C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f11391.size();
    }
}
