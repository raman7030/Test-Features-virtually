package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12103 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36174;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36175;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36176;

    public /* synthetic */ RunnableC12103(int i, Object obj, Object obj2) {
        this.f36175 = i;
        this.f36176 = obj;
        this.f36174 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, l.᩸ۛ֫] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36175) {
            case 0:
                InterfaceC20758 interfaceC20758 = (InterfaceC20758) this.f36176;
                AbstractC15440 abstractC15440 = (AbstractC15440) this.f36174;
                try {
                    if (C17229.exists(interfaceC20758, new EnumC14406[0])) {
                        C23721.m52302(interfaceC20758);
                    }
                    abstractC15440.mo23552();
                    return;
                } catch (IOException e) {
                    throw new C13452(e);
                }
            default:
                C15036 c15036 = (C15036) this.f36176;
                this.f36174.mo21135(c15036.f45822, c15036.f45821);
                return;
        }
    }
}
