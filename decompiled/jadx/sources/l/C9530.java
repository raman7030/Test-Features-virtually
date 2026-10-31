package l;

import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۢۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9530 implements InterfaceC3905 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3885 f28922;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22249 f28923;

    public C9530(C3885 c3885, C22249 c22249) {
        this.f28922 = c3885;
        this.f28923 = c22249;
    }

    @Override // l.InterfaceC3905
    /* JADX INFO: renamed from: ֫ */
    public final void mo11909(boolean z) {
        this.f28923.m49964(R.string.MT_Protector, SnackbarManager.SHORT_DURATION_MS);
    }

    @Override // l.InterfaceC3905
    /* JADX INFO: renamed from: ֫ */
    public final void mo11907(int i) {
        this.f28923.m49965(C4925.m14306(R.string.MT_Protector, Integer.valueOf(i)));
    }

    @Override // l.InterfaceC3905
    /* JADX INFO: renamed from: ۧ */
    public final void mo11910() {
        this.f28922.f12430.m14610();
    }

    @Override // l.InterfaceC3905
    /* JADX INFO: renamed from: ֫ */
    public final void mo11906() {
        this.f28922.f12416.m14610();
    }

    @Override // l.InterfaceC3905
    /* JADX INFO: renamed from: ֫ */
    public final void mo11908(PatternSyntaxException patternSyntaxException) {
        C3885.m11716(this.f28922, patternSyntaxException);
    }

    @Override // l.InterfaceC3905
    /* JADX INFO: renamed from: ۧ */
    public final void mo11911(boolean z) {
        C3885 c3885 = this.f28922;
        c3885.f12430.m14609(z);
        c3885.f12416.m14612(z);
    }
}
