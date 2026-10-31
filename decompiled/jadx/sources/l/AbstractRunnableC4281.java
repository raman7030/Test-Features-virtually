package l;

/* JADX INFO: renamed from: l.ۘ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC4281 extends AbstractFutureC8723 implements Runnable, InterfaceC9926 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile AbstractRunnableC4281 f13829;

    /* JADX INFO: renamed from: ֫ */
    public abstract FutureC3575 mo2888(int i);

    /* JADX INFO: renamed from: ܳ */
    public abstract boolean mo5012();

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo12867() {
        return null;
    }

    @Override // l.AbstractFutureC8723, java.lang.Runnable
    public final void run() {
        mo2888(1);
    }

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo12866() {
        mo2888(1);
        return false;
    }
}
