package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۢ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9874 implements InterfaceC1008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29890;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29891;

    public /* synthetic */ C9874(int i, Object obj) {
        this.f29890 = i;
        this.f29891 = obj;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final void mo1617(Object obj) {
        switch (this.f29890) {
            case 0:
                ((TextView) this.f29891).setText(C21100.m48031(((Integer) obj).intValue()));
                break;
            default:
                C20956.m47772((C20956) this.f29891, (Iterable) obj);
                break;
        }
    }
}
