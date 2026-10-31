package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4GI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2907 extends AbstractC8255 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence[] f9256;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f9257;

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View mo8845(Main main) {
        return null;
    }

    public C2907(CharSequence[] charSequenceArr, AtomicInteger atomicInteger) {
        this.f9256 = charSequenceArr;
        this.f9257 = atomicInteger;
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8846(C19258 c19258) {
        c19258.m44433(R.string.MT_Protector);
        c19258.m44429(this.f9256, -1, new DialogInterfaceOnClickListenerC4318(0, this.f9257));
    }

    @Override // l.AbstractC8255
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8847(View view) {
        return this.f9257.get() >= 0;
    }
}
