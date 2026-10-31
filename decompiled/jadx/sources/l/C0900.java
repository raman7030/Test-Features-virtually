package l;

import android.view.ViewGroup;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨ۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 657B */
/* JADX INFO: loaded from: classes2.dex */
public final class C0900 extends AbstractC19902 {
    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C7956 c7956 = (C7956) abstractC3255;
        switch (DialogInterfaceOnDismissListenerC15010.f45772[i]) {
            case 0:
                c7956.f24596.setText(C4925.m14327(R.string.MT_Protector).concat(" ->"));
                c7956.f24595.setImageResource(R.drawable.MT_Protector);
                break;
            case 1:
                c7956.f24596.setText(C4925.m14327(R.string.MT_Protector).concat(" ->"));
                c7956.f24595.setImageResource(R.drawable.MT_Protector);
                break;
            case 2:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 3:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 4:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 5:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 6:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 7:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 8:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
            case 9:
                c7956.m21264(R.string.MT_Protector, R.drawable.MT_Protector);
                break;
        }
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7956(C13540.m32583(viewGroup, R.layout.MT_Protector, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return DialogInterfaceOnDismissListenerC15010.f45772.length;
    }
}
