package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11915 implements InterfaceC8974 {
    @Override // p067l.InterfaceC8974
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20731(C10307 c10307) {
        String str = c10307.f28528;
        return C12826.equals(str, "text/x-ssa") || C12826.equals(str, "text/vtt") || C12826.equals(str, "application/x-mp4-vtt") || C12826.equals(str, "application/x-subrip") || C12826.equals(str, "application/x-quicktime-tx3g") || C12826.equals(str, "application/pgs") || C12826.equals(str, "application/vobsub") || C12826.equals(str, "application/dvbsubs") || C12826.equals(str, "application/ttml+xml");
    }

    @Override // p067l.InterfaceC8974
    /* JADX INFO: renamed from: ۧ */
    public final int mo20732(C10307 c10307) {
        String str = c10307.f28528;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(C21466.m48631("Unsupported MIME type: ", str));
    }

    @Override // p067l.InterfaceC8974
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC11657 mo20733(C10307 c10307) {
        String str = c10307.f28528;
        List list = c10307.f28548;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C4300(list);
                case "application/pgs":
                    return new C18381();
                case "application/x-mp4-vtt":
                    return new C23746();
                case "text/vtt":
                    return new C15698();
                case "application/x-quicktime-tx3g":
                    return new C10335(list);
                case "text/x-ssa":
                    return new C19052(list);
                case "application/vobsub":
                    return new C23076(list);
                case "application/x-subrip":
                    return new C22406();
                case "application/ttml+xml":
                    return new C20394();
            }
        }
        throw new IllegalArgumentException(C21466.m48631("Unsupported MIME type: ", str));
    }
}
