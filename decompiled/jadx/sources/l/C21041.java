package l;

/* JADX INFO: renamed from: l.᩷ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C21041 implements InterfaceC9752 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10045 f67892 = new C10045();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m47871(C8353 c8353) {
        String str = c8353.f25614;
        return this.f67892.mo18777(c8353) || C11003.equals(str, "application/cea-608") || C11003.equals(str, "application/x-mp4-cea-608") || C11003.equals(str, "application/cea-708");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7222 m47870(C8353 c8353) {
        String str = c8353.f25614;
        int i = c8353.f25598;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new C19651(str, i);
                case "application/cea-708":
                    return new C15415(i, c8353.f25634);
            }
        }
        C10045 c10045 = this.f67892;
        if (!c10045.mo18777(c8353)) {
            throw new IllegalArgumentException(C20094.m46315("Attempted to create decoder for unsupported MIME type: ", str));
        }
        InterfaceC9773 interfaceC9773Mo18779 = c10045.mo18779(c8353);
        return new C14689(interfaceC9773Mo18779.getClass().getSimpleName().concat("Decoder"), interfaceC9773Mo18779);
    }
}
