package p067l;

import java.io.IOException;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۚ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5XS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7676 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m17776(C15568 c15568, long j) {
        C6322 c6322 = c15568.f44485;
        if (c6322 != null) {
            for (C8393 c8393 : c6322.f16386) {
                switch (C21088.f66247[c8393.mo5081().ordinal()]) {
                    case 1:
                        if (((C5021) c8393).mo9101() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        if (((InterfaceC19733) c8393).mo9101() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 6:
                        if (((C12397) c8393).mo9101() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 7:
                        if (((C4370) c8393).mo9101() == j) {
                            return true;
                        }
                        break;
                        break;
                    case 8:
                        Iterator itM35838 = ((C15768) c8393).m35838();
                        while (itM35838.hasNext()) {
                            if (j == ((C24486) itM35838.next()).f77492) {
                                return true;
                            }
                        }
                        break;
                    case 9:
                        Iterator itM37316 = ((C16419) c8393).m37316();
                        while (itM37316.hasNext()) {
                            C19102 c19102 = (C19102) itM37316.next();
                            int i = (c19102.f56990 + c19102.f56991) - 1;
                            long j2 = 0;
                            int i2 = 0;
                            while (i >= c19102.f56990) {
                                j2 = (j2 << (i2 * 8)) | ((long) (c19102.f56989[i] & 255));
                                i--;
                                i2++;
                            }
                            if (j2 == j) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17777(C15568 c15568, String str) {
        if (c15568.f44483.f73398.m30317().toLowerCase().contains(str)) {
            return true;
        }
        C6322 c6322 = c15568.f44485;
        if (c6322 != null) {
            for (AbstractC4310 abstractC4310 : c6322.f16386) {
                switch (C21088.f66247[abstractC4310.mo5081().ordinal()]) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        EnumC9004 enumC9004 = abstractC4310.f9623.f80335;
                        if (enumC9004 == EnumC9004.string) {
                            if (((C13266) ((AbstractC18391) abstractC4310).m41867()).m30317().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC9004 == EnumC9004.method) {
                            C23324 c23324 = (C23324) ((AbstractC18391) abstractC4310).m41867();
                            if (c23324.f73398.m30317().toLowerCase().contains(str) || c23324.f73395.m53168().toLowerCase().contains(str) || c23324.f73397.m33398().toLowerCase().contains(str)) {
                                return true;
                            }
                        } else if (enumC9004 != EnumC9004.field) {
                            continue;
                        } else {
                            C19971 c19971 = (C19971) ((AbstractC18391) abstractC4310).m41867();
                            if (c19971.f60619.m30317().toLowerCase().contains(str) || c19971.f60615.m53168().toLowerCase().contains(str) || c19971.f60618.m53168().toLowerCase().contains(str)) {
                                return true;
                            }
                        }
                        break;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m17778(C15568 c15568, Pattern pattern) {
        C14381 c14381 = new C14381(c15568.f44485);
        StringBuilder sb = new StringBuilder(4096);
        try {
            c14381.m32988(new C6977(sb));
            return pattern.matcher(sb.toString()).find();
        } catch (IOException unused) {
            return false;
        }
    }
}
