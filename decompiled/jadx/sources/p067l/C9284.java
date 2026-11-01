package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69GV */
/* JADX INFO: loaded from: classes2.dex */
public final class C9284 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC4410 f25233 = C13128.m30022(C9284.class);

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013d, code lost:
    
        if (r3 == p067l.EnumC9460.STATUS_BUFFER_OVERFLOW.getValue()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
    
        if (r3 == p067l.EnumC9460.STATUS_NOTIFY_ENUM_DIR.getValue()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        if (r3 == p067l.EnumC9460.STATUS_MORE_PROCESSING_REQUIRED.getValue()) goto L65;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18158 m21498(AbstractC3131 abstractC3131, C19500 c19500) {
        C18158 c24193;
        EnumC24036 enumC24036M54620 = ((C24864) c19500.m23026()).m54620();
        int[] iArr = C15318.f43716;
        switch (iArr[enumC24036M54620.ordinal()]) {
            case 1:
                c24193 = new C24193();
                break;
            case 2:
                c24193 = new C25180();
                break;
            case 3:
                c24193 = new C17803();
                break;
            case 4:
                c24193 = new C5064();
                break;
            case 5:
                c24193 = new C8100();
                break;
            case 6:
                c24193 = new C21512();
                break;
            case 7:
                c24193 = new C16816();
                new ArrayList();
                break;
            case 8:
                c24193 = new C4393();
                break;
            case 9:
                c24193 = new C6759();
                break;
            case 10:
                c24193 = new C19816();
                break;
            case 11:
                c24193 = new C22853();
                break;
            case 12:
                c24193 = new C5418();
                break;
            case 13:
                c24193 = new C20487();
                break;
            case 14:
                c24193 = new C14135();
                break;
            case 15:
                c24193 = new C13111();
                break;
            case 16:
                c24193 = new C11770();
                break;
            case 17:
                c24193 = new C10112();
                break;
            case 18:
                c24193 = new C12124();
                break;
            default:
                f25233.mo9175("Unknown SMB2 Message Command type: " + enumC24036M54620);
                throw new C12776("Unknown SMB2 Message Command type: " + enumC24036M54620);
        }
        long jM54605 = ((C24864) c19500.m23026()).m54605();
        if (!EnumC9460.m21962(jM54605) || jM54605 == EnumC9460.STATUS_PENDING.getValue()) {
            EnumC24036 enumC24036M54621 = ((C24864) c19500.m23026()).m54620();
            long jM54606 = ((C24864) c19500.m23026()).m54605();
            int i = iArr[enumC24036M54621.ordinal()];
            if (i != 2) {
                if (i != 7) {
                    if (i != 10) {
                        if (i == 14) {
                            long jM33812 = ((C14805) abstractC3131).m33812();
                            if (jM33812 != 1130508) {
                            }
                        } else if (i == 15) {
                        }
                        c24193.m41366(c19500);
                        return c24193;
                    }
                }
            }
        }
        c24193.m41365(c19500);
        return c24193;
    }
}
