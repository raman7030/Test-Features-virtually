package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19608 implements InterfaceC10439 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23631 f59644;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ View f59645;

    public C19608(C23631 c23631, View view) {
        this.f59644 = c23631;
        this.f59645 = view;
    }

    @Override // p067l.InterfaceC10439
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4739 mo14637() {
        C23631 c23631 = this.f59644;
        if (!c23631.m52507()) {
            return null;
        }
        C13693 c13693 = c23631.f75231;
        return new C18266(this, c13693.f38637, c13693.f38640, c13693);
    }

    @Override // p067l.InterfaceC10439
    /* JADX INFO: renamed from: ֫ */
    public final View mo14636() {
        return this.f59645.findViewById(R.id.MT_Protector);
    }
}
