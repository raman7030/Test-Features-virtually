package p067l;

/* JADX INFO: renamed from: l.᩷ᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8QH */
/* JADX INFO: loaded from: classes5.dex */
public final class C22366 implements InterfaceC11637 {

    /* JADX INFO: renamed from: ۧ */
    public final C11915 f70578 = new C11915();

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50201(C10307 c10307) {
        String str = c10307.f28528;
        return this.f70578.mo20731(c10307) || C12826.equals(str, "application/cea-608") || C12826.equals(str, "application/x-mp4-cea-608") || C12826.equals(str, "application/cea-708");
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9232 m50200(C10307 c10307) {
        String str = c10307.f28528;
        int i = c10307.f28512;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new C21045(str, i);
                case "application/cea-708":
                    return new C17019(i, c10307.f28548);
            }
        }
        C11915 c11915 = this.f70578;
        if (!c11915.mo20731(c10307)) {
            throw new IllegalArgumentException(C21466.m48631("Attempted to create decoder for unsupported MIME type: ", str));
        }
        InterfaceC11657 interfaceC11657Mo20733 = c11915.mo20733(c10307);
        return new C16329(interfaceC11657Mo20733.getClass().getSimpleName().concat("Decoder"), interfaceC11657Mo20733);
    }
}
