package p067l;

import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C15342 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17043 f43799 = C17853.f53277.m38684("tc");

    static {
        C7050.m16212(new RunnableC23624(1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34916() {
        AbstractC17043 abstractC17043 = f43799;
        abstractC17043.m38684(C0655am.f2275aC).mo25503();
        abstractC17043.m38684("o").mo25503();
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m34919(boolean z) throws C20807 {
        AbstractC17043 abstractC17043M38684 = f43799.m38684("o");
        byte[] bArrM55023 = null;
        if (!z && abstractC17043M38684.mo25094()) {
            try {
                C14677 c14677M38686 = abstractC17043M38684.m38686();
                if (Math.abs(System.currentTimeMillis() - c14677M38686.readLong()) < 3600000) {
                    bArrM55023 = c14677M38686.m33583();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM55023 == null) {
            C25065 c25065M44755 = C19701.m44739(4209).m44755();
            if (c25065M44755.m55016()) {
                bArrM55023 = c25065M44755.m55023();
                try {
                    C11996 c11996 = new C11996();
                    c11996.m27451(System.currentTimeMillis());
                    c11996.m27454(bArrM55023);
                    abstractC17043M38684.m38654(c11996);
                } catch (Exception unused2) {
                }
            } else {
                throw new C20807(C3865.m7621(c25065M44755, R.string.MT_Protector));
            }
        }
        C14677 c14677M33572 = C14677.m33572(bArrM55023);
        ArrayList arrayList = new ArrayList();
        int i = c14677M33572.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C4615(c14677M33572));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m34915(boolean z) throws C20807 {
        AbstractC17043 abstractC17043M38684 = f43799.m38684(C0655am.f2275aC);
        byte[] bArrM55023 = null;
        if (!z && abstractC17043M38684.mo25094()) {
            try {
                C14677 c14677M38686 = abstractC17043M38684.m38686();
                if (Math.abs(System.currentTimeMillis() - c14677M38686.readLong()) < 3600000) {
                    bArrM55023 = c14677M38686.m33583();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM55023 == null) {
            C19701 c19701M44739 = C19701.m44739(4199);
            C25065 c25065M44755 = C24414.m53856() ? c19701M44739.m44755() : c19701M44739.m44756();
            if (c25065M44755.m55016()) {
                bArrM55023 = c25065M44755.m55023();
                try {
                    C11996 c11996 = new C11996();
                    c11996.m27451(System.currentTimeMillis());
                    c11996.m27454(bArrM55023);
                    abstractC17043M38684.m38654(c11996);
                } catch (Exception unused2) {
                }
            } else {
                throw new C20807(C3865.m7621(c25065M44755, R.string.MT_Protector));
            }
        }
        C14677 c14677M33572 = C14677.m33572(bArrM55023);
        int i = c14677M33572.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C20038(c14677M33572));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m34918(int i, String str) {
        AbstractC17043 abstractC17043M38684 = f43799.m38684("d" + i);
        if (!abstractC17043M38684.mo25094()) {
            return null;
        }
        try {
            C14677 c14677M38686 = abstractC17043M38684.m38686();
            if (c14677M38686.m33593().equals(str)) {
                return c14677M38686.m33583();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m34917(int i) throws C20807 {
        AbstractC17043 abstractC17043M38684 = f43799.m38684("d" + i);
        C19701 c19701M44739 = C19701.m44739(4200);
        c19701M44739.m44749(i);
        C25065 c25065M44755 = C24414.m53856() ? c19701M44739.m44755() : c19701M44739.m44756();
        if (c25065M44755.m55016()) {
            String[] strArr = {c25065M44755.m55011(), c25065M44755.m55011()};
            byte[] bArrM13642 = C6054.m13642(strArr[0]);
            try {
                abstractC17043M38684.mo37342();
                C11996 c11996 = new C11996();
                c11996.m27459(strArr[1]);
                c11996.m27454(bArrM13642);
                abstractC17043M38684.m38654(c11996);
            } catch (Exception unused) {
            }
            return bArrM13642;
        }
        throw new C20807(C3865.m7621(c25065M44755, R.string.MT_Protector));
    }
}
