package l;

/* JADX INFO: renamed from: l.ۨ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11393 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12366 f34084;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12098 f34083 = C12098.m29512();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f34085 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5748 f34082 = new C5748(0, this);

    public C11393(C12366 c12366) {
        this.f34084 = c12366;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22681 m28157(String str) {
        if (str.length() <= 2) {
            return null;
        }
        return (C22681) C17997.computeIfAbsent(this.f34085, str, this.f34082);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22681 m28156(C11393 c11393, String str) {
        InterfaceC13508 interfaceC13508M30066 = c11393.f34084.m30066(C15472.m36561(1, 1, str));
        if (interfaceC13508M30066 == null) {
            return c11393.f34083.m29513(str);
        }
        C7980 c7980Mo31674 = ((C13071) interfaceC13508M30066).mo31674();
        if (c7980Mo31674 == null) {
            return null;
        }
        return new C22681(c7980Mo31674);
    }
}
