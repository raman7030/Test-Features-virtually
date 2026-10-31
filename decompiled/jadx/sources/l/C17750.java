package l;

/* JADX INFO: renamed from: l.ᩳ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17750 extends AbstractC18456 {
    public static final C12453 c;
    public static final C12453 d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return C16646.of(this.b);
        }
        return null;
    }

    static {
        EnumC8578 enumC8578 = EnumC8578.REFERENCE;
        c = new C12453(true, enumC8578, C16646.empty(), new C10964(18), new C3639(13));
        d = new C12453(false, enumC8578, C16646.empty(), new C10964(18), new C3639(13));
    }
}
