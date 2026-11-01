package p067l;

/* JADX INFO: renamed from: l.ܶۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9UJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C16771 extends AbstractC14681 {
    public static final long serialVersionUID = 7107973622016897488L;

    /* JADX INFO: renamed from: ᩶ */
    public final String f49426;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC12000 f49427;

    /* JADX INFO: renamed from: ᩹ */
    public final String f49428;

    public C16771(C10738 c10738, String str, String str2, AbstractC12000 abstractC12000) {
        super(c10738);
        this.f49426 = str;
        this.f49428 = str2;
        this.f49427 = abstractC12000;
    }

    @Override // p067l.AbstractC14681
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23399 mo33609() {
        return (AbstractC23399) getSource();
    }

    @Override // p067l.AbstractC14681
    /* JADX INFO: renamed from: ᩳ */
    public final String mo33611() {
        return this.f49426;
    }

    @Override // p067l.AbstractC14681
    public final String getName() {
        return this.f49428;
    }

    @Override // java.util.EventObject
    public final String toString() {
        return "[ServiceEventImpl@" + System.identityHashCode(this) + "\n\tname: '" + this.f49428 + "' type: '" + this.f49426 + "' info: '" + this.f49427 + "']";
    }

    @Override // p067l.AbstractC14681
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12000 mo33610() {
        return this.f49427;
    }

    @Override // p067l.AbstractC14681
    public final Object clone() {
        return new C16771((C10738) ((AbstractC23399) getSource()), this.f49426, this.f49428, new C21467(this.f49427));
    }

    @Override // p067l.AbstractC14681
    public final AbstractC14681 clone() {
        return new C16771((C10738) ((AbstractC23399) getSource()), this.f49426, this.f49428, new C21467(this.f49427));
    }
}
