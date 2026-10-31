package l;

/* JADX INFO: renamed from: l.᩵᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC19735 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21851 f63760;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63761;

    public RunnableC19735(AbstractC21851 abstractC21851, String str) {
        this.f63760 = abstractC21851;
        this.f63761 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC21851 abstractC21851 = this.f63760;
        AbstractC19902 adapter = abstractC21851.f70012.getAdapter();
        if (!(adapter instanceof InterfaceC22556)) {
            if (adapter != 0) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        String str = this.f63761;
        int iMo17606 = ((InterfaceC22556) adapter).mo17606(str);
        if (iMo17606 != -1) {
            abstractC21851.f70012.scrollToPosition(iMo17606);
        } else {
            adapter.registerAdapterDataObserver(new C15499(adapter, abstractC21851.f70012, str));
        }
    }
}
