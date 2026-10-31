package l;

/* JADX INFO: renamed from: l.ܺᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4OL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16103 implements InterfaceC9216 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49636;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f49637;

    public AbstractC16103(int i, String str) {
        this.f49636 = i;
        this.f49637 = str;
    }

    @Override // l.InterfaceC9216
    /* JADX INFO: renamed from: ᩻ */
    public final int mo23657() {
        return this.f49636;
    }

    @Override // l.InterfaceC9216
    public final String getPackageName() {
        return this.f49637;
    }

    @Override // l.InterfaceC8510
    /* JADX INFO: renamed from: ֫ */
    public final void mo12336(InterfaceC8510 interfaceC8510) {
        InterfaceC9216 interfaceC9216 = (InterfaceC9216) interfaceC8510;
        if (this.f49636 != interfaceC9216.mo23657()) {
            throw new RuntimeException();
        }
        if (!C11003.equals(this.f49637, interfaceC9216.getPackageName())) {
            throw new RuntimeException();
        }
    }
}
