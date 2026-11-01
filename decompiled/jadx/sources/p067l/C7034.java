package p067l;

/* JADX INFO: renamed from: l.ۙ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C7034 extends Thread {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC5693 f18331;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7034(AbstractC5693 abstractC5693) {
        super("ExoPlayer:SimpleDecoder");
        this.f18331 = abstractC5693;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AbstractC5693.m12673(this.f18331);
    }
}
