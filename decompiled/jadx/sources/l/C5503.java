package l;

/* JADX INFO: renamed from: l.ۚܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes3.dex */
public class C5503 implements InterfaceC11544 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f17057;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f17058;

    public C5503(int i, Object obj) {
        this.f17057 = i;
        this.f17058 = obj;
    }

    @Override // l.InterfaceC11544
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo15639() {
        return this.f17057;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17058;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Integer.valueOf(mo15639());
    }
}
