package l;

import android.content.res.Configuration;

/* JADX INFO: renamed from: l.ۛ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6382 implements InterfaceC13041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19745;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19746;

    public /* synthetic */ C6382(int i, Object obj) {
        this.f19745 = i;
        this.f19746 = obj;
    }

    @Override // l.InterfaceC13041
    public final void accept(Object obj) {
        switch (this.f19745) {
            case 0:
                AbstractC5180.m14841((AbstractC5180) this.f19746, (Configuration) obj);
                break;
            default:
                ((C17930) obj).m41940().setText(((C16477) this.f19746).m38841());
                break;
        }
    }
}
