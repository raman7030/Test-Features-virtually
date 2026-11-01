package p067l;

/* JADX INFO: renamed from: l.ۚܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes3.dex */
public class C7599 implements InterfaceC13340 {

    /* JADX INFO: renamed from: ᩸ */
    public int f19896;

    /* JADX INFO: renamed from: ᩹ */
    public Object f19897;

    public C7599(int i, Object obj) {
        this.f19896 = i;
        this.f19897 = obj;
    }

    @Override // p067l.InterfaceC13340
    /* JADX INFO: renamed from: ֫ */
    public final int mo17550() {
        return this.f19896;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19897;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Integer.valueOf(mo17550());
    }
}
