package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۡ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 251F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11029 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ Pattern f30543;

    /* JADX INFO: renamed from: ܳ */
    public final C11084 f30544;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f30545;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractViewOnClickListenerC17733 f30546;

    public C11029(AbstractViewOnClickListenerC17733 abstractViewOnClickListenerC17733, Pattern pattern, String str) {
        this.f30546 = abstractViewOnClickListenerC17733;
        this.f30543 = pattern;
        this.f30545 = str;
        this.f30544 = C11084.m25530(abstractViewOnClickListenerC17733.f52967);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f30546.f52967, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f30546.mo5141(this.f30543, this.f30545);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f30544.m25532()) {
            this.f30546.mo5140();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f30544.m25532()) {
            this.f30546.f52967.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
