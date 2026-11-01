package p067l;

/* JADX INFO: renamed from: l.᩻ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBA1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25009 implements InterfaceC14320 {

    /* JADX INFO: renamed from: ֫ */
    public final String f79843;

    public AbstractC25009(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.f79843 = str;
    }

    @Override // p067l.InterfaceC14320
    public final String getName() {
        return this.f79843;
    }
}
