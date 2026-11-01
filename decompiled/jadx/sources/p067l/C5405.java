package p067l;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5405 extends AbstractC22585 {

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C13010 f12867;

    /* JADX INFO: renamed from: ֫֫ */
    public C21499 f12868;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC6076[] f12869;

    /* JADX INFO: renamed from: ۧ֫ */
    public final ArrayList f12870;

    /* JADX INFO: renamed from: ܰ */
    public final ArrayList f12871;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f12872;

    /* JADX INFO: renamed from: ܿ֫ */
    public final AbstractC6974[] f12873;

    /* JADX INFO: renamed from: ᩳ֫ */
    public long[][] f12874;

    /* JADX INFO: renamed from: ᩺ */
    public final C19781 f12875;

    @Override // p067l.AbstractC22585
    /* JADX INFO: renamed from: ֫ */
    public final C17474 mo11863(Object obj, C17474 c17474) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f12871;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C6746) list.get(i)).f17498.equals(c17474)) {
                return ((C6746) ((List) arrayList.get(0)).get(i)).f17498;
            }
        }
        return null;
    }

    @Override // p067l.AbstractC22585
    /* JADX INFO: renamed from: ֫ */
    public final void mo11864(Object obj, AbstractC11185 abstractC11185, AbstractC6974 abstractC6974) {
        Integer num = (Integer) obj;
        if (this.f12868 != null) {
            return;
        }
        if (this.f12872 == -1) {
            this.f12872 = abstractC6974.mo15975();
        } else if (abstractC6974.mo15975() != this.f12872) {
            this.f12868 = new C21499();
            return;
        }
        int length = this.f12874.length;
        AbstractC6974[] abstractC6974Arr = this.f12873;
        if (length == 0) {
            this.f12874 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f12872, abstractC6974Arr.length);
        }
        ArrayList arrayList = this.f12870;
        arrayList.remove(abstractC11185);
        abstractC6974Arr[num.intValue()] = abstractC6974;
        if (arrayList.isEmpty()) {
            m25803(abstractC6974Arr[0]);
        }
    }

    static {
        C23718 c23718 = new C23718();
        c23718.m52738("MergingMediaSource");
        f12867 = c23718.m52735();
    }

    public C5405(InterfaceC6076... interfaceC6076Arr) {
        C19781 c19781 = new C19781();
        this.f12869 = interfaceC6076Arr;
        this.f12875 = c19781;
        this.f12870 = new ArrayList(Arrays.asList(interfaceC6076Arr));
        this.f12872 = -1;
        this.f12871 = new ArrayList(interfaceC6076Arr.length);
        for (int i = 0; i < interfaceC6076Arr.length; i++) {
            this.f12871.add(new ArrayList());
        }
        this.f12873 = new AbstractC6974[interfaceC6076Arr.length];
        this.f12874 = new long[0][];
        new HashMap();
        AbstractC21481.m48684().m52229().mo38030();
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final C13010 mo11862() {
        InterfaceC6076[] interfaceC6076Arr = this.f12869;
        return interfaceC6076Arr.length > 0 ? interfaceC6076Arr[0].mo11862() : f12867;
    }

    @Override // p067l.AbstractC11185, p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11867(C13010 c13010) {
        this.f12869[0].mo11867(c13010);
    }

    @Override // p067l.AbstractC22585, p067l.AbstractC11185
    /* JADX INFO: renamed from: ֫ */
    public final void mo11865(InterfaceC2830 interfaceC2830) {
        super.mo11865(interfaceC2830);
        int i = 0;
        while (true) {
            InterfaceC6076[] interfaceC6076Arr = this.f12869;
            if (i >= interfaceC6076Arr.length) {
                return;
            }
            m50618(Integer.valueOf(i), interfaceC6076Arr[i]);
            i++;
        }
    }

    @Override // p067l.AbstractC22585, p067l.InterfaceC6076
    /* JADX INFO: renamed from: ۧ */
    public final void mo11868() throws C21499 {
        C21499 c21499 = this.f12868;
        if (c21499 != null) {
            throw c21499;
        }
        super.mo11868();
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11441 mo11861(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        InterfaceC6076[] interfaceC6076Arr = this.f12869;
        int length = interfaceC6076Arr.length;
        InterfaceC11441[] interfaceC11441Arr = new InterfaceC11441[length];
        AbstractC6974[] abstractC6974Arr = this.f12873;
        int iMo15978 = abstractC6974Arr[0].mo15978(c17474.f52252);
        for (int i = 0; i < length; i++) {
            C17474 c17474M39841 = c17474.m39841(abstractC6974Arr[i].mo15982(iMo15978));
            interfaceC11441Arr[i] = interfaceC6076Arr[i].mo11861(c17474M39841, interfaceC23016, j - this.f12874[iMo15978][i]);
            ((List) this.f12871.get(i)).add(new C6746(c17474M39841, interfaceC11441Arr[i]));
        }
        return new C23510(this.f12875, this.f12874[iMo15978], interfaceC11441Arr);
    }

    @Override // p067l.InterfaceC6076
    /* JADX INFO: renamed from: ֫ */
    public final void mo11866(InterfaceC11441 interfaceC11441) {
        C23510 c23510 = (C23510) interfaceC11441;
        int i = 0;
        while (true) {
            InterfaceC6076[] interfaceC6076Arr = this.f12869;
            if (i >= interfaceC6076Arr.length) {
                return;
            }
            List list = (List) this.f12871.get(i);
            InterfaceC11441 interfaceC11441M52279 = c23510.m52279(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((C6746) list.get(i2)).f17497.equals(interfaceC11441M52279)) {
                    list.remove(i2);
                    break;
                }
            }
            interfaceC6076Arr[i].mo11866(c23510.m52279(i));
            i++;
        }
    }

    @Override // p067l.AbstractC22585, p067l.AbstractC11185
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11869() {
        super.mo11869();
        Arrays.fill(this.f12873, (Object) null);
        this.f12872 = -1;
        this.f12868 = null;
        ArrayList arrayList = this.f12870;
        arrayList.clear();
        Collections.addAll(arrayList, this.f12869);
    }
}
