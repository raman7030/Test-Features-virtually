package p067l;

/* JADX INFO: renamed from: l.۫ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14295 extends EnumC8260 {
    public /* synthetic */ C14295() {
        this("FORWARD", 0);
    }

    public C14295(String str, int i) {
        super(str, i, 0);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC22097 interfaceC22097, InterfaceC22097 interfaceC22098) {
        return interfaceC22097.getFileName().compareTo(interfaceC22098.getFileName());
    }
}
