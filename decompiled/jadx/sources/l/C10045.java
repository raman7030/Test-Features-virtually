package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8QH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10045 implements InterfaceC6950 {
    @Override // l.InterfaceC6950
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18777(C8353 c8353) {
        String str = c8353.f25614;
        return C11003.equals(str, "text/x-ssa") || C11003.equals(str, "text/vtt") || C11003.equals(str, "application/x-mp4-vtt") || C11003.equals(str, "application/x-subrip") || C11003.equals(str, "application/x-quicktime-tx3g") || C11003.equals(str, "application/pgs") || C11003.equals(str, "application/vobsub") || C11003.equals(str, "application/dvbsubs") || C11003.equals(str, "application/ttml+xml");
    }

    @Override // l.InterfaceC6950
    /* JADX INFO: renamed from: ۧ */
    public final int mo18778(C8353 c8353) {
        String str = c8353.f25614;
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
        throw new IllegalArgumentException(C20094.m46315("Unsupported MIME type: ", str));
    }

    @Override // l.InterfaceC6950
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC9773 mo18779(C8353 c8353) {
        String str = c8353.f25614;
        List list = c8353.f25634;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new C2032(list);
                case "application/pgs":
                    return new C16848();
                case "application/x-mp4-vtt":
                    return new C22493();
                case "text/vtt":
                    return new C14025();
                case "application/x-quicktime-tx3g":
                    return new C8382(list);
                case "text/x-ssa":
                    return new C17554(list);
                case "application/vobsub":
                    return new C21788(list);
                case "application/x-subrip":
                    return new C21083();
                case "application/ttml+xml":
                    return new C18966();
            }
        }
        throw new IllegalArgumentException(C20094.m46315("Unsupported MIME type: ", str));
    }
}
