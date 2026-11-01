package p067l;

import android.view.View;
import android.widget.Button;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۫ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2CZ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC14061 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f39647;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f39648;

    public /* synthetic */ ViewOnClickListenerC14061(int i, Object obj) {
        this.f39647 = i;
        this.f39648 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f39647) {
            case 0:
                C8026.m18603((C8026) this.f39648);
                break;
            case 1:
                ((C18600) this.f39648).m42335();
                view.setEnabled(false);
                ((Button) view).setTextColor(-7829368);
                break;
            case 2:
                C9842 c9842 = (C9842) this.f39648;
                C1898 c1898 = new C1898(c9842.requireContext(), view, 0);
                C0994 c0994M50638 = c1898.m50638();
                String strM20011 = C8597.m20011(30, C11419.m26414(c9842.m23088()) + ".xml");
                String strM20012 = C8597.m20011(30, c9842.m23088().concat(".xml"));
                c0994M50638.add(R.string.MT_Protector, 0, 0, strM20011);
                c0994M50638.add(R.string.MT_Protector, 1, 0, strM20012);
                c0994M50638.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                c1898.m50636(new C22721(c9842));
                c1898.m50639();
                break;
            default:
                ActivityC9368.m21768((ActivityC9368) this.f39648);
                break;
        }
    }
}
