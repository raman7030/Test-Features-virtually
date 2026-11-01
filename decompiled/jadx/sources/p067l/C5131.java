package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5131 extends AbstractC10214 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ CharSequence[] f12054;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AtomicInteger f12055;

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final View mo10912(Main main) {
        return null;
    }

    public C5131(CharSequence[] charSequenceArr, AtomicInteger atomicInteger) {
        this.f12054 = charSequenceArr;
        this.f12055 = atomicInteger;
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final void mo10913(C20671 c20671) {
        c20671.m46727(R.string.MT_Protector);
        c20671.m46723(this.f12054, -1, new DialogInterfaceOnClickListenerC6472(0, this.f12055));
    }

    @Override // p067l.AbstractC10214
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10914(View view) {
        return this.f12055.get() >= 0;
    }
}
