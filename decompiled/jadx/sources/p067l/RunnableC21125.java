package p067l;

/* JADX INFO: renamed from: l.᩵᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21125 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC23136 f66391;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String f66392;

    public RunnableC21125(AbstractC23136 abstractC23136, String str) {
        this.f66391 = abstractC23136;
        this.f66392 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC23136 abstractC23136 = this.f66391;
        AbstractC21283 adapter = abstractC23136.f72721.getAdapter();
        if (!(adapter instanceof InterfaceC23806)) {
            if (adapter != 0) {
                throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
            }
            return;
        }
        String str = this.f66392;
        int iMo19546 = ((InterfaceC23806) adapter).mo19546(str);
        if (iMo19546 != -1) {
            abstractC23136.f72721.scrollToPosition(iMo19546);
        } else {
            adapter.registerAdapterDataObserver(new C17099(adapter, abstractC23136.f72721, str));
        }
    }
}
