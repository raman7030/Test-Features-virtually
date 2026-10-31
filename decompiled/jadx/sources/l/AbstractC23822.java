package l;

/* JADX INFO: renamed from: l.᩻ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBA1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23822 implements InterfaceC12575 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f77092;

    public AbstractC23822(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        this.f77092 = str;
    }

    @Override // l.InterfaceC12575
    public final String getName() {
        return this.f77092;
    }
}
