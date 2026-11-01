package p067l;

/* JADX INFO: renamed from: l.᩸۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: UAXR */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22885 extends AbstractC5196 implements InterfaceC18880 {
    public /* synthetic */ AbstractC22885(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۘ */
    public abstract AbstractC22885 mo38204();

    public AbstractC22885() {
    }

    @Override // p067l.AbstractC5196
    public String toString() {
        AbstractC22885 abstractC22885Mo38204;
        String str;
        int i = C11505.f32105;
        AbstractC22885 abstractC22885 = C5945.f14659;
        if (this == abstractC22885) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC22885Mo38204 = abstractC22885.mo38204();
            } catch (UnsupportedOperationException unused) {
                abstractC22885Mo38204 = null;
            }
            str = this == abstractC22885Mo38204 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C12846.m29416(this);
    }
}
