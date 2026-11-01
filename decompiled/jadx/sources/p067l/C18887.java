package p067l;

/* JADX INFO: renamed from: l.ܿܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1DS */
/* JADX INFO: loaded from: classes5.dex */
public class C18887 implements InterfaceC13348 {

    /* JADX INFO: renamed from: ᩸ */
    public char f56387;

    /* JADX INFO: renamed from: ᩹ */
    public Object f56388;

    public C18887(char c, Object obj) {
        this.f56387 = c;
        this.f56388 = obj;
    }

    @Override // p067l.InterfaceC13348
    /* JADX INFO: renamed from: ܿ */
    public final char mo25825() {
        return this.f56387;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f56388;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Character.valueOf(mo25825());
    }
}
