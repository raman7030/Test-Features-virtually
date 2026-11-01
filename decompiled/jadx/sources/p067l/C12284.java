package p067l;

/* JADX INFO: renamed from: l.ۤܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final enum C12284 extends EnumC8260 {
    public /* synthetic */ C12284() {
        this("REVERSE", 1);
    }

    public C12284(String str, int i) {
        super(str, i, 0);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        return interfaceC22098.getFileName().compareTo(interfaceC22097.getFileName());
    }
}
