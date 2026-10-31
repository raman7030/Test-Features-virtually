package l;

/* JADX INFO: renamed from: l.ܿ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17030 extends AbstractC5036 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Boolean f52203;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Boolean f52204;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC0802 f52205;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5036 m39992() {
        this.f52203 = Boolean.TRUE;
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC5036 m39993() {
        this.f52204 = Boolean.TRUE;
        return this;
    }

    @Override // l.AbstractC5036
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5036 mo14550(EnumC0802 enumC0802) {
        if (enumC0802 == null) {
            throw new NullPointerException("Null style");
        }
        this.f52205 = enumC0802;
        return this;
    }

    @Override // l.AbstractC5036
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7858 mo14551() {
        Boolean bool = this.f52203;
        if (bool == null || this.f52204 == null || this.f52205 == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f52203 == null) {
                sb.append(" formatJavadoc");
            }
            if (this.f52204 == null) {
                sb.append(" reorderModifiers");
            }
            if (this.f52205 == null) {
                sb.append(" style");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }
        return new C14207(bool.booleanValue(), this.f52204.booleanValue(), this.f52205);
    }
}
