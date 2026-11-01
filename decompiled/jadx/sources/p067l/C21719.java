package p067l;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: l.᩶ᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C21719 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ View f68405;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5625 f68406;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C21438 f68407;

    public C21719(C5625 c5625, C21438 c21438, View view) {
        this.f68406 = c5625;
        this.f68407 = c21438;
        this.f68405 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC15012 interfaceC15012M12464;
        C5625 c5625 = this.f68406;
        boolean z = false;
        if (c5625.f13613 != null && !c5625.f13613.mo8700().isEmpty()) {
            boolean z2 = c5625.f13613 instanceof C15270;
            C13002 c13002M12445 = C5625.m12445(z2);
            c13002M12445.m29820((String) this.f68407.getItem(i));
            if (!z2 && !c5625.f13610.equals(c13002M12445.m29819())) {
                z = true;
            }
            c5625.f13616 = z;
            if (c5625.f13613.mo8697()) {
                c5625.m12446(i, c13002M12445);
            }
        } else {
            c5625.f13616 = false;
        }
        if (System.currentTimeMillis() - c5625.f13617 > 300 && (interfaceC15012M12464 = c5625.m12464()) != null) {
            c5625.mo12462(interfaceC15012M12464);
        }
        C5625.m12448(c5625, this.f68405);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C5625 c5625 = this.f68406;
        c5625.f13616 = false;
        C5625.m12448(c5625, this.f68405);
    }
}
