package p067l;

import android.view.ViewGroup;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes2.dex */
public final class C3224 extends AbstractC21283 {
    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        C9930 c9930 = (C9930) abstractC5462;
        switch (DialogInterfaceOnDismissListenerC16634.f48889[i]) {
            case 0:
                c9930.f27510.setText(C7050.m16224(R.string.MT_Protector).concat(" ->"));
                c9930.f27509.setImageResource(R.drawable.MT_Protector);
                break;
            case 1:
                c9930.f27510.setText(C7050.m16224(R.string.MT_Protector).concat(" ->"));
                c9930.f27509.setImageResource(R.drawable.MT_Protector);
                break;
            case 2:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 3:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 4:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 5:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 6:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 7:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 8:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 9:
                c9930.m23230(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
        }
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9930(C1514.m34686(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC16634.f48889.length;
    }
}
