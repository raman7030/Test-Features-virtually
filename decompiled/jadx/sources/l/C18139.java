package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18139 implements InterfaceC8491 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f56430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f56431;

    public C18139(C22372 c22372, View view) {
        this.f56430 = c22372;
        this.f56431 = view;
    }

    @Override // l.InterfaceC8491
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2494 mo12761() {
        C22372 c22372 = this.f56430;
        if (!c22372.m50167()) {
            return null;
        }
        C11915 c11915 = c22372.f72506;
        return new C16727(this, c11915.f35628, c11915.f35631, c11915);
    }

    @Override // l.InterfaceC8491
    /* JADX INFO: renamed from: ֫ */
    public final View mo12760() {
        return this.f56431.findViewById(R.id.MT_Protector);
    }
}
