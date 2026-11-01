package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۢۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11426 implements InterfaceC6080 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C6061 f31868;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C23514 f31869;

    public C11426(C6061 c6061, C23514 c23514) {
        this.f31868 = c6061;
        this.f31869 = c23514;
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13845(boolean z) {
        this.f31869.m52292(R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13843(int i) {
        this.f31869.m52293(C7050.m16203(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ۧ */
    public final void mo13846() {
        this.f31868.f15237.m16517();
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13842() {
        this.f31868.f15223.m16517();
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ֫ */
    public final void mo13844(PatternSyntaxException patternSyntaxException) {
        C6061.m13652(this.f31868, patternSyntaxException);
    }

    @Override // p067l.InterfaceC6080
    /* JADX INFO: renamed from: ۧ */
    public final void mo13847(boolean z) {
        C6061 c6061 = this.f31868;
        c6061.f15237.m16516(z);
        c6061.f15223.m16519(z);
    }
}
