package l;

/* JADX INFO: renamed from: l.ܿܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1DS */
/* JADX INFO: loaded from: classes5.dex */
public class C17381 implements InterfaceC11553 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char f53201;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f53202;

    public C17381(char c, Object obj) {
        this.f53201 = c;
        this.f53202 = obj;
    }

    @Override // l.InterfaceC11553
    /* JADX INFO: renamed from: ܿ */
    public final char mo23816() {
        return this.f53201;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f53202;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return Character.valueOf(mo23816());
    }
}
