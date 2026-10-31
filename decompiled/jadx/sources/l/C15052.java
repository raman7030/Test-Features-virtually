package l;

/* JADX INFO: renamed from: l.ܶۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15052 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC7998 f45940;

    public C15052(EnumC7998 enumC7998) {
        super("Invalid MCP Home path: " + enumC7998.name());
        this.f45940 = enumC7998;
    }
}
