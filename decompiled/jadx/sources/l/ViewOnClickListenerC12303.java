package l;

import android.view.View;
import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC12303 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36632;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36633;

    public /* synthetic */ ViewOnClickListenerC12303(int i, Object obj) {
        this.f36632 = i;
        this.f36633 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36632) {
            case 0:
                C5953.m16677((C5953) this.f36633);
                break;
            case 1:
                ((C17079) this.f36633).m40090();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                break;
            case 2:
                C7864 c7864 = (C7864) this.f36633;
                C21282 c21282 = new C21282(c7864.requireContext(), view, 0);
                C3060 c3060M48304 = c21282.m48304();
                String strM18061 = C6554.m18061(30, C9523.m24404(c7864.m21123()) + ".xml");
                String strM18062 = C6554.m18061(30, c7864.m21123().concat(".xml"));
                c3060M48304.add(R.string.MT_Protector, 0, 0, strM18061);
                c3060M48304.add(R.string.MT_Protector, 1, 0, strM18062);
                c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c21282.m48302(new C21415(c7864));
                c21282.m48305();
                break;
            default:
                ActivityC7365.m19795((ActivityC7365) this.f36633);
                break;
        }
    }
}
