package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23939 implements InterfaceC6633 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14766 f77623;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23939 m52727(AbstractC14766 abstractC14766) {
        C23939 c23939 = abstractC14766.f45089;
        return c23939 != null ? c23939 : new C23939(abstractC14766);
    }

    public C23939(AbstractC14766 abstractC14766) {
        C13997.m33482(abstractC14766, "output");
        this.f77623 = abstractC14766;
        abstractC14766.f45089 = this;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52763(int i, int i2) {
        this.f77623.mo35087(i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52748(int i, long j) {
        this.f77623.mo35102(i, j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52757(int i, long j) {
        this.f77623.mo35088(i, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52728(float f, int i) {
        AbstractC14766 abstractC14766 = this.f77623;
        abstractC14766.getClass();
        abstractC14766.mo35087(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52730(int i, double d) {
        AbstractC14766 abstractC14766 = this.f77623;
        abstractC14766.getClass();
        abstractC14766.mo35088(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52731(int i, int i2) {
        this.f77623.mo35101(i, i2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m52761(int i, long j) {
        this.f77623.mo35102(i, j);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52756(int i, int i2) {
        this.f77623.mo35101(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52732(int i, long j) {
        this.f77623.mo35088(i, j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52747(int i, int i2) {
        this.f77623.mo35087(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52739(int i, boolean z) {
        this.f77623.mo35093(i, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52735(int i, String str) {
        this.f77623.mo35089(i, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52738(int i, AbstractC5886 abstractC5886) {
        this.f77623.mo35090(i, abstractC5886);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m52753(int i, int i2) {
        this.f77623.mo35109(i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52749(int i, Object obj) {
        this.f77623.mo35104(i, (InterfaceC8522) obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52750(int i, Object obj, InterfaceC9374 interfaceC9374) {
        this.f77623.mo35092(i, (InterfaceC8522) obj, interfaceC9374);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52733(int i, Object obj) {
        this.f77623.m35091(i, (InterfaceC8522) obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52734(int i, Object obj, InterfaceC9374 interfaceC9374) {
        AbstractC14766 abstractC14766 = this.f77623;
        abstractC14766.mo35107(i, 3);
        interfaceC9374.mo24200(obj, (InterfaceC6633) abstractC14766.f45089);
        abstractC14766.mo35107(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52746(int i) {
        this.f77623.mo35107(i, 3);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52729(int i) {
        this.f77623.mo35107(i, 4);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52758(int i, Object obj) {
        boolean z = obj instanceof AbstractC5886;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35103(i, (AbstractC5886) obj);
        } else {
            abstractC14766.mo35108(i, (InterfaceC8522) obj);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m52767(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int iM35077 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35077 += AbstractC14766.m35077(((Integer) list.get(i3)).intValue());
            }
            abstractC14766.mo35106(iM35077);
            while (i2 < list.size()) {
                abstractC14766.mo35100(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35101(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52765(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC14766.f45086;
                i3 += 4;
            }
            abstractC14766.mo35106(i3);
            while (i2 < list.size()) {
                abstractC14766.mo35086(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35087(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m52743(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int iM35077 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35077 += AbstractC14766.m35077(((Long) list.get(i3)).longValue());
            }
            abstractC14766.mo35106(iM35077);
            while (i2 < list.size()) {
                abstractC14766.mo35105(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35102(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m52760(int i, int i2) {
        this.f77623.mo35109(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m52742(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int iM35077 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35077 += AbstractC14766.m35077(((Long) list.get(i3)).longValue());
            }
            abstractC14766.mo35106(iM35077);
            while (i2 < list.size()) {
                abstractC14766.mo35105(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35102(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52764(int i, long j) {
        this.f77623.mo35102(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m52762(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC14766.f45086;
                i3 += 8;
            }
            abstractC14766.mo35106(i3);
            while (i2 < list.size()) {
                abstractC14766.mo35095(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35088(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m52754(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                int i5 = AbstractC14766.f45086;
                i3 += 4;
            }
            abstractC14766.mo35106(i3);
            while (i2 < list.size()) {
                abstractC14766.mo35086(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            float fFloatValue = ((Float) list.get(i2)).floatValue();
            abstractC14766.getClass();
            abstractC14766.mo35087(i, Float.floatToRawIntBits(fFloatValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52752(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                int i5 = AbstractC14766.f45086;
                i3 += 8;
            }
            abstractC14766.mo35106(i3);
            while (i2 < list.size()) {
                abstractC14766.mo35095(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            double dDoubleValue = ((Double) list.get(i2)).doubleValue();
            abstractC14766.getClass();
            abstractC14766.mo35088(i, Double.doubleToRawLongBits(dDoubleValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52759(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int iM35077 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35077 += AbstractC14766.m35077(((Integer) list.get(i3)).intValue());
            }
            abstractC14766.mo35106(iM35077);
            while (i2 < list.size()) {
                abstractC14766.mo35100(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35101(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52740(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                int i5 = AbstractC14766.f45086;
                i3++;
            }
            abstractC14766.mo35106(i3);
            while (i2 < list.size()) {
                abstractC14766.mo35085(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35093(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52751(int i, List list) {
        boolean z = list instanceof InterfaceC4142;
        AbstractC14766 abstractC14766 = this.f77623;
        int i2 = 0;
        if (z) {
            InterfaceC4142 interfaceC4142 = (InterfaceC4142) list;
            while (i2 < list.size()) {
                Object objMo8472 = interfaceC4142.mo8472(i2);
                if (objMo8472 instanceof String) {
                    abstractC14766.mo35089(i, (String) objMo8472);
                } else {
                    abstractC14766.mo35090(i, (AbstractC5886) objMo8472);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35089(i, (String) list.get(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52736(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f77623.mo35090(i, (AbstractC5886) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m52741(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int iM35083 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM35083 += AbstractC14766.m35083(((Integer) list.get(i3)).intValue());
            }
            abstractC14766.mo35106(iM35083);
            while (i2 < list.size()) {
                abstractC14766.mo35106(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35109(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52766(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC14766.f45086;
                i3 += 4;
            }
            abstractC14766.mo35106(i3);
            while (i2 < list.size()) {
                abstractC14766.mo35086(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35087(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m52745(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC14766.f45086;
                i3 += 8;
            }
            abstractC14766.mo35106(i3);
            while (i2 < list.size()) {
                abstractC14766.mo35095(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC14766.mo35088(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m52744(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int iM35083 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                iM35083 += AbstractC14766.m35083((iIntValue >> 31) ^ (iIntValue << 1));
            }
            abstractC14766.mo35106(iM35083);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC14766.mo35106((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC14766.mo35109(i, (iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m52755(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC14766 abstractC14766 = this.f77623;
        if (z) {
            abstractC14766.mo35107(i, 2);
            int iM35077 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                iM35077 += AbstractC14766.m35077((jLongValue >> 63) ^ (jLongValue << 1));
            }
            abstractC14766.mo35106(iM35077);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC14766.mo35105((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC14766.mo35102(i, (jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52737(int i, Map map) {
        AbstractC14766 abstractC14766 = this.f77623;
        abstractC14766.getClass();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC14766.mo35107(i, 2);
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
