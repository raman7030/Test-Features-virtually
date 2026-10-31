package l;

/* JADX INFO: renamed from: l.ܶۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15154 extends AbstractC12955 {
    public static final long serialVersionUID = 7107973622016897488L;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f46307;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10134 f46308;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f46309;

    public C15154(C8806 c8806, String str, String str2, AbstractC10134 abstractC10134) {
        super(c8806);
        this.f46307 = str;
        this.f46309 = str2;
        this.f46308 = abstractC10134;
    }

    @Override // l.AbstractC12955
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22128 mo31522() {
        return (AbstractC22128) getSource();
    }

    @Override // l.AbstractC12955
    /* JADX INFO: renamed from: ᩳ */
    public final String mo31524() {
        return this.f46307;
    }

    @Override // l.AbstractC12955
    public final String getName() {
        return this.f46309;
    }

    @Override // java.util.EventObject
    public final String toString() {
        return "[ServiceEventImpl@" + System.identityHashCode(this) + "\n\tname: '" + this.f46309 + "' type: '" + this.f46307 + "' info: '" + this.f46308 + "']";
    }

    @Override // l.AbstractC12955
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC10134 mo31523() {
        return this.f46308;
    }

    @Override // l.AbstractC12955
    public final Object clone() {
        return new C15154((C8806) ((AbstractC22128) getSource()), this.f46307, this.f46309, new C20095(this.f46308));
    }

    @Override // l.AbstractC12955
    public final AbstractC12955 clone() {
        return new C15154((C8806) ((AbstractC22128) getSource()), this.f46307, this.f46309, new C20095(this.f46308));
    }
}
