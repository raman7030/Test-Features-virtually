package l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3195 extends AbstractC21272 {

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C11197 f10063;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C20129 f10064;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC3901[] f10065;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f10066;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10067;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f10068;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846[] f10069;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public long[][] f10070;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18321 f10071;

    @Override // l.AbstractC21272
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15894 mo9818(Object obj, C15894 c15894) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f10067;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C4606) list.get(i)).f14670.equals(c15894)) {
                return ((C4606) ((List) arrayList.get(0)).get(i)).f14670;
            }
        }
        return null;
    }

    @Override // l.AbstractC21272
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9819(Object obj, AbstractC9277 abstractC9277, AbstractC4846 abstractC4846) {
        Integer num = (Integer) obj;
        if (this.f10064 != null) {
            return;
        }
        if (this.f10068 == -1) {
            this.f10068 = abstractC4846.mo14095();
        } else if (abstractC4846.mo14095() != this.f10068) {
            this.f10064 = new C20129();
            return;
        }
        int length = this.f10070.length;
        AbstractC4846[] abstractC4846Arr = this.f10069;
        if (length == 0) {
            this.f10070 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f10068, abstractC4846Arr.length);
        }
        ArrayList arrayList = this.f10066;
        arrayList.remove(abstractC9277);
        abstractC4846Arr[num.intValue()] = abstractC4846;
        if (arrayList.isEmpty()) {
            m23794(abstractC4846Arr[0]);
        }
    }

    static {
        C22464 c22464 = new C22464();
        c22464.m50397("MergingMediaSource");
        f10063 = c22464.m50394();
    }

    public C3195(InterfaceC3901... interfaceC3901Arr) {
        C18321 c18321 = new C18321();
        this.f10065 = interfaceC3901Arr;
        this.f10071 = c18321;
        this.f10066 = new ArrayList(Arrays.asList(interfaceC3901Arr));
        this.f10068 = -1;
        this.f10067 = new ArrayList(interfaceC3901Arr.length);
        for (int i = 0; i < interfaceC3901Arr.length; i++) {
            this.f10067.add(new ArrayList());
        }
        this.f10069 = new AbstractC4846[interfaceC3901Arr.length];
        this.f10070 = new long[0][];
        new HashMap();
        AbstractC20110.m46368().m49902().mo35872();
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11197 mo9817() {
        InterfaceC3901[] interfaceC3901Arr = this.f10065;
        return interfaceC3901Arr.length > 0 ? interfaceC3901Arr[0].mo9817() : f10063;
    }

    @Override // l.AbstractC9277, l.InterfaceC3901
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9822(C11197 c11197) {
        this.f10065[0].mo9822(c11197);
    }

    @Override // l.AbstractC21272, l.AbstractC9277
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9820(InterfaceC0486 interfaceC0486) {
        super.mo9820(interfaceC0486);
        int i = 0;
        while (true) {
            InterfaceC3901[] interfaceC3901Arr = this.f10065;
            if (i >= interfaceC3901Arr.length) {
                return;
            }
            m48287(Integer.valueOf(i), interfaceC3901Arr[i]);
            i++;
        }
    }

    @Override // l.AbstractC21272, l.InterfaceC3901
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo9823() throws C20129 {
        C20129 c20129 = this.f10064;
        if (c20129 != null) {
            throw c20129;
        }
        super.mo9823();
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9546 mo9816(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        InterfaceC3901[] interfaceC3901Arr = this.f10065;
        int length = interfaceC3901Arr.length;
        InterfaceC9546[] interfaceC9546Arr = new InterfaceC9546[length];
        AbstractC4846[] abstractC4846Arr = this.f10069;
        int iMo14098 = abstractC4846Arr[0].mo14098(c15894.f49112);
        for (int i = 0; i < length; i++) {
            C15894 c15894M37668 = c15894.m37668(abstractC4846Arr[i].mo14102(iMo14098));
            interfaceC9546Arr[i] = interfaceC3901Arr[i].mo9816(c15894M37668, interfaceC21725, j - this.f10070[iMo14098][i]);
            ((List) this.f10067.get(i)).add(new C4606(c15894M37668, interfaceC9546Arr[i]));
        }
        return new C22245(this.f10071, this.f10070[iMo14098], interfaceC9546Arr);
    }

    @Override // l.InterfaceC3901
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9821(InterfaceC9546 interfaceC9546) {
        C22245 c22245 = (C22245) interfaceC9546;
        int i = 0;
        while (true) {
            InterfaceC3901[] interfaceC3901Arr = this.f10065;
            if (i >= interfaceC3901Arr.length) {
                return;
            }
            List list = (List) this.f10067.get(i);
            InterfaceC9546 interfaceC9546M49951 = c22245.m49951(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((C4606) list.get(i2)).f14669.equals(interfaceC9546M49951)) {
                    list.remove(i2);
                    break;
                }
            }
            interfaceC3901Arr[i].mo9821(c22245.m49951(i));
            i++;
        }
    }

    @Override // l.AbstractC21272, l.AbstractC9277
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo9824() {
        super.mo9824();
        Arrays.fill(this.f10069, (Object) null);
        this.f10068 = -1;
        this.f10064 = null;
        ArrayList arrayList = this.f10066;
        arrayList.clear();
        Collections.addAll(arrayList, this.f10065);
    }
}
