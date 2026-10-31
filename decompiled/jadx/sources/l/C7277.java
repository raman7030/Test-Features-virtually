package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69GV */
/* JADX INFO: loaded from: classes2.dex */
public final class C7277 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f22342 = C11321.m27961(C7277.class);

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013d, code lost:
    
        if (r3 == l.EnumC7462.STATUS_BUFFER_OVERFLOW.getValue()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
    
        if (r3 == l.EnumC7462.STATUS_NOTIFY_ENUM_DIR.getValue()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        if (r3 == l.EnumC7462.STATUS_MORE_PROCESSING_REQUIRED.getValue()) goto L65;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C16614 m19531(AbstractC0803 abstractC0803, C18026 c18026) {
        C16614 c22964;
        EnumC22799 enumC22799M52217 = ((C23670) c18026.m21061()).m52217();
        int[] iArr = C13626.f40636;
        switch (iArr[enumC22799M52217.ordinal()]) {
            case 1:
                c22964 = new C22964();
                break;
            case 2:
                c22964 = new C24002();
                break;
            case 3:
                c22964 = new C16240();
                break;
            case 4:
                c22964 = new C2836();
                break;
            case 5:
                c22964 = new C6031();
                break;
            case 6:
                c22964 = new C20143();
                break;
            case 7:
                c22964 = new C15202();
                new ArrayList();
                break;
            case 8:
                c22964 = new C2130();
                break;
            case 9:
                c22964 = new C4620();
                break;
            case 10:
                c22964 = new C18358();
                break;
            case 11:
                c22964 = new C21554();
                break;
            case 12:
                c22964 = new C3209();
                break;
            case 13:
                c22964 = new C19064();
                break;
            case 14:
                c22964 = new C12381();
                break;
            case 15:
                c22964 = new C11303();
                break;
            case 16:
                c22964 = new C9892();
                break;
            case 17:
                c22964 = new C8148();
                break;
            case 18:
                c22964 = new C10265();
                break;
            default:
                f22342.mo7080("Unknown SMB2 Message Command type: " + enumC22799M52217);
                throw new C10951("Unknown SMB2 Message Command type: " + enumC22799M52217);
        }
        long jM52202 = ((C23670) c18026.m21061()).m52202();
        if (!EnumC7462.m19987(jM52202) || jM52202 == EnumC7462.STATUS_PENDING.getValue()) {
            EnumC22799 enumC22799M52218 = ((C23670) c18026.m21061()).m52217();
            long jM52203 = ((C23670) c18026.m21061()).m52202();
            int i = iArr[enumC22799M52218.ordinal()];
            if (i != 2) {
                if (i != 7) {
                    if (i != 10) {
                        if (i == 14) {
                            long jM31722 = ((C13086) abstractC0803).m31722();
                            if (jM31722 != 1130508) {
                            }
                        } else if (i == 15) {
                        }
                        c22964.m39139(c18026);
                        return c22964;
                    }
                }
            }
        }
        c22964.m39138(c18026);
        return c22964;
    }
}
