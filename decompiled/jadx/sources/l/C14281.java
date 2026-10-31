package l;

import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.ܳۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14281 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43046;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f43047;

    public /* synthetic */ C14281(int i, Object obj) {
        this.f43046 = i;
        this.f43047 = obj;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f43046) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.f43047;
                int i = ((Boolean) obj).booleanValue() ? 0 : 8;
                if (progressBar.getVisibility() != i) {
                    progressBar.setVisibility(i);
                }
                break;
            case 1:
                C5561.m15764((C5561) this.f43047);
                break;
            case 2:
                C13865.m33225((C13865) this.f43047, (C19452) obj);
                break;
            default:
                C21912.m49317((C21912) this.f43047, (C12366) obj);
                break;
        }
    }
}
