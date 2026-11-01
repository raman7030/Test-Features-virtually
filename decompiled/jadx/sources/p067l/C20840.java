package p067l;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: D7LF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20840 extends AbstractC14409 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C2733 f65485;

    /* JADX INFO: renamed from: ᩸ */
    public LinkedHashSet f65487 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩹ */
    public LinkedHashSet f65488 = new LinkedHashSet();

    /* JADX INFO: renamed from: ᩶ */
    public LinkedHashMap f65486 = new LinkedHashMap();

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return null;
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo14564(C3108 c3108, Object obj) {
        m47072(c3108);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        return (Void) c7251.f18916.mo5291(this, (Object) null);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        AbstractC6462 abstractC6462M4259 = this.f65485.m4259(c10485);
        if (abstractC6462M4259.m14777(EnumC11353.UNDETVAR)) {
            m47072((C3108) abstractC6462M4259);
        }
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        return (Void) c21215.f66703.mo5291(this, (Object) null);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        c21333.mo7201().mo5291(this, (Object) null);
        Iterator it = c21333.mo14802().iterator();
        while (it.hasNext()) {
            ((AbstractC6462) it.next()).mo5291(this, (Object) null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.AbstractCollection, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.AbstractCollection, java.util.Collection] */
    /* JADX INFO: renamed from: ֫ */
    public final void m47072(C3108 c3108) {
        EnumC20544[] enumC20544Arr;
        int i;
        Iterator it;
        ?? M10288;
        C3108 c3109 = c3108;
        AbstractC6462 abstractC6462 = c3109.f16992;
        if (this.f65488.add(abstractC6462)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singleton(abstractC6462));
            LinkedHashMap linkedHashMap = this.f65486;
            Set set = (Set) C15525.getOrDefault(linkedHashMap, abstractC6462, linkedHashSet);
            EnumC20544[] enumC20544ArrValues = EnumC20544.values();
            int length = enumC20544ArrValues.length;
            char c = 0;
            int i2 = 0;
            while (i2 < length) {
                EnumC20544 enumC20544 = enumC20544ArrValues[i2];
                EnumC20544[] enumC20544Arr2 = new EnumC20544[1];
                enumC20544Arr2[c] = enumC20544;
                Iterator it2 = c3109.m5292(enumC20544Arr2).iterator();
                while (it2.hasNext()) {
                    AbstractC6462 abstractC6463 = (AbstractC6462) it2.next();
                    C2733 c2733 = this.f65485;
                    AbstractC6462 abstractC6462M4259 = c2733.m4259(abstractC6463);
                    if (abstractC6462M4259.m14777(EnumC11353.UNDETVAR)) {
                        C3108 c31010 = (C3108) c2733.m4259(abstractC6463);
                        EnumC20544[] enumC20544ArrValues2 = EnumC20544.values();
                        int length2 = enumC20544ArrValues2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                enumC20544Arr = enumC20544ArrValues;
                                i = length;
                                it = it2;
                                set.add(abstractC6463);
                                this.f65487.add(abstractC6463);
                                break;
                            }
                            enumC20544Arr = enumC20544ArrValues;
                            EnumC20544 enumC20545 = enumC20544ArrValues2[i3];
                            i = length;
                            int i4 = 1;
                            it = it2;
                            C4848 c4848M5292 = c3109.m5292(enumC20545);
                            if (enumC20545 == enumC20544) {
                                M10288 = c4848M5292;
                                i4 = 1;
                                M10288 = c4848M5292.m10288(C4848.m10276of((Object) abstractC6463));
                            }
                            M10288 = c4848M5292;
                            EnumC20544[] enumC20544Arr3 = new EnumC20544[i4];
                            enumC20544Arr3[0] = enumC20545;
                            C4848 c4848M5293 = c31010.m5292(enumC20544Arr3);
                            ?? M10289 = c4848M5293;
                            if (enumC20545 == enumC20544.mo9305()) {
                                M10289 = c4848M5293.m10288(C4848.m10276of((Object) abstractC6462));
                            }
                            if (!M10288.containsAll(M10289) || !M10289.containsAll(M10288)) {
                                abstractC6462M4259.mo5291(this, (Object) null);
                                break;
                            }
                            i3++;
                            c3109 = c3108;
                            enumC20544ArrValues = enumC20544Arr;
                            length = i;
                            it2 = it;
                        }
                    } else {
                        abstractC6462M4259.mo5291(this, (Object) null);
                        enumC20544Arr = enumC20544ArrValues;
                        i = length;
                        it = it2;
                    }
                    c3109 = c3108;
                    enumC20544ArrValues = enumC20544Arr;
                    length = i;
                    it2 = it;
                }
                i2++;
                c = 0;
                c3109 = c3108;
            }
            linkedHashMap.put(abstractC6462, set);
        }
    }

    public C20840(C2733 c2733) {
        this.f65485 = c2733;
    }
}
