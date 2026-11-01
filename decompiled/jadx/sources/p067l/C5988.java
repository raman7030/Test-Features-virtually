package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۘ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5988 implements Supplier {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f14815;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14816;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f14817;

    public /* synthetic */ C5988(int i, Object obj, Object obj2) {
        this.f14816 = i;
        this.f14817 = obj;
        this.f14815 = obj2;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f14816;
        Object obj = this.f14815;
        Object obj2 = this.f14817;
        switch (i) {
            case 0:
                C8374 c8374 = (C8374) obj2;
                c8374.getClass();
                return new C7524(c8374, (C8612) obj);
            default:
                C8005 c8005 = ((C21294) obj2).f66988;
                AbstractC12224 abstractC12224 = ((C15828) obj).f45859;
                C13370 c13370 = C13665.f38450;
                return c8005.m18543(new C13370("compiler", "class.file.not.found", abstractC12224));
        }
    }
}
