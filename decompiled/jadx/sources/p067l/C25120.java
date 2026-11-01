package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C25120 implements InterfaceC8672 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16402 f80375;

    /* JADX INFO: renamed from: ֫ */
    public static C25120 m55133(AbstractC16402 abstractC16402) {
        C25120 c25120 = abstractC16402.f48203;
        return c25120 != null ? c25120 : new C25120(abstractC16402);
    }

    public C25120(AbstractC16402 abstractC16402) {
        C15671.m35602(abstractC16402, "output");
        this.f80375 = abstractC16402;
        abstractC16402.f48203 = this;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m55169(int i, int i2) {
        this.f80375.mo37234(i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55154(int i, long j) {
        this.f80375.mo37249(i, j);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m55163(int i, long j) {
        this.f80375.mo37235(i, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55134(float f, int i) {
        AbstractC16402 abstractC16402 = this.f80375;
        abstractC16402.getClass();
        abstractC16402.mo37234(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55136(int i, double d) {
        AbstractC16402 abstractC16402 = this.f80375;
        abstractC16402.getClass();
        abstractC16402.mo37235(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55137(int i, int i2) {
        this.f80375.mo37248(i, i2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m55167(int i, long j) {
        this.f80375.mo37249(i, j);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m55162(int i, int i2) {
        this.f80375.mo37248(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55138(int i, long j) {
        this.f80375.mo37235(i, j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55153(int i, int i2) {
        this.f80375.mo37234(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55145(int i, boolean z) {
        this.f80375.mo37240(i, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55141(int i, String str) {
        this.f80375.mo37236(i, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55144(int i, AbstractC7962 abstractC7962) {
        this.f80375.mo37237(i, abstractC7962);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m55159(int i, int i2) {
        this.f80375.mo37256(i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55155(int i, Object obj) {
        this.f80375.mo37251(i, (InterfaceC10467) obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55156(int i, Object obj, InterfaceC11277 interfaceC11277) {
        this.f80375.mo37239(i, (InterfaceC10467) obj, interfaceC11277);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m55139(int i, Object obj) {
        this.f80375.m37238(i, (InterfaceC10467) obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55140(int i, Object obj, InterfaceC11277 interfaceC11277) {
        AbstractC16402 abstractC16402 = this.f80375;
        abstractC16402.mo37254(i, 3);
        interfaceC11277.mo26210(obj, (InterfaceC8672) abstractC16402.f48203);
        abstractC16402.mo37254(i, 4);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public final void m55152(int i) {
        this.f80375.mo37254(i, 3);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m55135(int i) {
        this.f80375.mo37254(i, 4);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m55164(int i, Object obj) {
        boolean z = obj instanceof AbstractC7962;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37250(i, (AbstractC7962) obj);
        } else {
            abstractC16402.mo37255(i, (InterfaceC10467) obj);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m55173(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int iM37224 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM37224 += AbstractC16402.m37224(((Integer) list.get(i3)).intValue());
            }
            abstractC16402.mo37253(iM37224);
            while (i2 < list.size()) {
                abstractC16402.mo37247(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37248(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m55171(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC16402.f48200;
                i3 += 4;
            }
            abstractC16402.mo37253(i3);
            while (i2 < list.size()) {
                abstractC16402.mo37233(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37234(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m55149(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int iM37224 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM37224 += AbstractC16402.m37224(((Long) list.get(i3)).longValue());
            }
            abstractC16402.mo37253(iM37224);
            while (i2 < list.size()) {
                abstractC16402.mo37252(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37249(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m55166(int i, int i2) {
        this.f80375.mo37256(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m55148(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int iM37224 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM37224 += AbstractC16402.m37224(((Long) list.get(i3)).longValue());
            }
            abstractC16402.mo37253(iM37224);
            while (i2 < list.size()) {
                abstractC16402.mo37252(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37249(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m55170(int i, long j) {
        this.f80375.mo37249(i, (j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m55168(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC16402.f48200;
                i3 += 8;
            }
            abstractC16402.mo37253(i3);
            while (i2 < list.size()) {
                abstractC16402.mo37242(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37235(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m55160(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                int i5 = AbstractC16402.f48200;
                i3 += 4;
            }
            abstractC16402.mo37253(i3);
            while (i2 < list.size()) {
                abstractC16402.mo37233(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            float fFloatValue = ((Float) list.get(i2)).floatValue();
            abstractC16402.getClass();
            abstractC16402.mo37234(i, Float.floatToRawIntBits(fFloatValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55158(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                int i5 = AbstractC16402.f48200;
                i3 += 8;
            }
            abstractC16402.mo37253(i3);
            while (i2 < list.size()) {
                abstractC16402.mo37242(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            double dDoubleValue = ((Double) list.get(i2)).doubleValue();
            abstractC16402.getClass();
            abstractC16402.mo37235(i, Double.doubleToRawLongBits(dDoubleValue));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m55165(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int iM37224 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM37224 += AbstractC16402.m37224(((Integer) list.get(i3)).intValue());
            }
            abstractC16402.mo37253(iM37224);
            while (i2 < list.size()) {
                abstractC16402.mo37247(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37248(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55146(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                int i5 = AbstractC16402.f48200;
                i3++;
            }
            abstractC16402.mo37253(i3);
            while (i2 < list.size()) {
                abstractC16402.mo37232(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37240(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m55157(int i, List list) {
        boolean z = list instanceof InterfaceC6305;
        AbstractC16402 abstractC16402 = this.f80375;
        int i2 = 0;
        if (z) {
            InterfaceC6305 interfaceC6305 = (InterfaceC6305) list;
            while (i2 < list.size()) {
                Object objMo10519 = interfaceC6305.mo10519(i2);
                if (objMo10519 instanceof String) {
                    abstractC16402.mo37236(i, (String) objMo10519);
                } else {
                    abstractC16402.mo37237(i, (AbstractC7962) objMo10519);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37236(i, (String) list.get(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55142(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f80375.mo37237(i, (AbstractC7962) list.get(i2));
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m55147(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int iM37230 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM37230 += AbstractC16402.m37230(((Integer) list.get(i3)).intValue());
            }
            abstractC16402.mo37253(iM37230);
            while (i2 < list.size()) {
                abstractC16402.mo37253(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37256(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m55172(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                int i5 = AbstractC16402.f48200;
                i3 += 4;
            }
            abstractC16402.mo37253(i3);
            while (i2 < list.size()) {
                abstractC16402.mo37233(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37234(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m55151(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                int i5 = AbstractC16402.f48200;
                i3 += 8;
            }
            abstractC16402.mo37253(i3);
            while (i2 < list.size()) {
                abstractC16402.mo37242(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            abstractC16402.mo37235(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m55150(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int iM37230 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                iM37230 += AbstractC16402.m37230((iIntValue >> 31) ^ (iIntValue << 1));
            }
            abstractC16402.mo37253(iM37230);
            while (i2 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i2)).intValue();
                abstractC16402.mo37253((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            abstractC16402.mo37256(i, (iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m55161(int i, boolean z, List list) {
        int i2 = 0;
        AbstractC16402 abstractC16402 = this.f80375;
        if (z) {
            abstractC16402.mo37254(i, 2);
            int iM37224 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                iM37224 += AbstractC16402.m37224((jLongValue >> 63) ^ (jLongValue << 1));
            }
            abstractC16402.mo37253(iM37224);
            while (i2 < list.size()) {
                long jLongValue2 = ((Long) list.get(i2)).longValue();
                abstractC16402.mo37252((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            abstractC16402.mo37249(i, (jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55143(int i, Map map) {
        AbstractC16402 abstractC16402 = this.f80375;
        abstractC16402.getClass();
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractC16402.mo37254(i, 2);
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
