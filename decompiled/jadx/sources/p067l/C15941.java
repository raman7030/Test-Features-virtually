package p067l;

import android.widget.ProgressBar;

/* JADX INFO: renamed from: l.ܳۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB32 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15941 implements InterfaceC3326 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f46138;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f46139;

    public /* synthetic */ C15941(int i, Object obj) {
        this.f46138 = i;
        this.f46139 = obj;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final void mo4017(Object obj) {
        switch (this.f46138) {
            case 0:
                ProgressBar progressBar = (ProgressBar) this.f46139;
                int i = ((Boolean) obj).booleanValue() ? 0 : 8;
                if (progressBar.getVisibility() != i) {
                    progressBar.setVisibility(i);
                }
                break;
            case 1:
                C7654.m17679((C7654) this.f46139);
                break;
            case 2:
                C15546.m35344((C15546) this.f46139, (C20856) obj);
                break;
            default:
                C23194.m51670((C23194) this.f46139, (C14121) obj);
                break;
        }
    }
}
