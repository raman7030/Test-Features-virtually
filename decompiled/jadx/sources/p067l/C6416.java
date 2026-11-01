package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۘ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes3.dex */
public final class C6416 implements InterfaceC6080 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C17143 f16612;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23514 f16613;

    public C6416(C17143 c17143, C23514 c23514) {
        this.f16612 = c17143;
        this.f16613 = c23514;
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13845(boolean z) {
        this.f16613.m52292(z ? R.string.MT_Protector : R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13843(int i) {
        this.f16613.m52293(C7050.m16203(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ۧ */
    public final void mo13846() {
        this.f16612.f51067.m16517();
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13842() {
        this.f16612.f51053.m16517();
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13844(PatternSyntaxException patternSyntaxException) {
        C17143.m38812(this.f16612, patternSyntaxException);
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ۧ */
    public final void mo13847(boolean z) {
        C17143 c17143 = this.f16612;
        c17143.f51067.m16516(z);
        c17143.f51053.m16519(z);
    }
}
