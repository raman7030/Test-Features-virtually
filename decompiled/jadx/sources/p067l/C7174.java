package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7174 extends AbstractC3150 {

    /* JADX INFO: renamed from: ۗ */
    public final C2479[] f18726;

    /* JADX INFO: renamed from: ۙ */
    public final C11198[] f18727;

    /* JADX INFO: renamed from: ۛ */
    public final C7174[] f18728;

    /* JADX INFO: renamed from: ۤ */
    public C12045 f18729;

    /* JADX INFO: renamed from: ۨ */
    public final C22598[] f18730;

    /* JADX INFO: renamed from: ۫ */
    public final C24608 f18731;

    /* JADX INFO: renamed from: ۬ */
    public final C19244[] f18732;

    /* JADX INFO: renamed from: ᩶ */
    public final C7174[] f18733;

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final C12045 mo3533() {
        return this.f18729;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f18729;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f18729.getName();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f18729.getName();
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m16487() {
        return this.f18729.m27587();
    }

    /* JADX INFO: renamed from: ֨ */
    public final List m16485() {
        return C21562.unmodifiableList(Arrays.asList(this.f18732));
    }

    /* JADX INFO: renamed from: ֡ */
    public final List m16484() {
        return C21562.unmodifiableList(Arrays.asList(this.f18727));
    }

    /* JADX INFO: renamed from: ۚ */
    public final List m16486() {
        return C21562.unmodifiableList(Arrays.asList(this.f18726));
    }

    /* JADX INFO: renamed from: ܺ */
    public final List m16489() {
        return C21562.unmodifiableList(Arrays.asList(this.f18733));
    }

    /* JADX INFO: renamed from: ܶ */
    public final List m16488() {
        return C21562.unmodifiableList(Arrays.asList(this.f18728));
    }

    /* JADX INFO: renamed from: ᩴ */
    public final EnumC5674 m16490() {
        C12045 c12045 = this.f18729;
        String strM27588 = c12045.m27588();
        if (strM27588.equals("proto3")) {
            return EnumC5674.EDITION_PROTO3;
        }
        if (strM27588.equals("editions")) {
            return c12045.m27602();
        }
        return EnumC5674.EDITION_PROTO2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7174 m16480(C12045 c12045, C7174[] c7174Arr) throws C8515 {
        C7174 c7174 = new C7174(c12045, c7174Arr, new C24608(c7174Arr));
        for (C19244 c19244 : c7174.f18732) {
            c19244.m43832();
        }
        for (C22598 c22598 : c7174.f18730) {
            C22598.m50644(c22598);
        }
        for (C2479 c2479 : c7174.f18726) {
            C2479.m3520(c2479);
        }
        return c7174;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7174 m16481(String[] strArr, C7174[] c7174Arr) {
        byte[] bytes;
        if (strArr.length == 1) {
            bytes = strArr[0].getBytes(C15671.f44806);
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            bytes = sb.toString().getBytes(C15671.f44806);
        }
        try {
            C12045 from = C12045.parseFrom(bytes);
            try {
                return m16480(from, c7174Arr);
            } catch (C8515 e) {
                throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
            }
        } catch (C4293 e2) {
            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
        }
    }

    public C7174(C12045 c12045, C7174[] c7174Arr, C24608 c24608) throws C8515 {
        C19244[] c19244Arr;
        C11198[] c11198Arr;
        C22598[] c22598Arr;
        C2479[] c2479Arr;
        super(0);
        this.f18731 = c24608;
        this.f18729 = c12045;
        this.f18733 = (C7174[]) c7174Arr.clone();
        HashMap map = new HashMap();
        for (C7174 c7174 : c7174Arr) {
            map.put(c7174.f18729.getName(), c7174);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c12045.m27600(); i++) {
            int iM27598 = c12045.m27598(i);
            if (iM27598 < 0 || iM27598 >= c12045.m27589()) {
                throw new C8515(this, "Invalid public dependency index.");
            }
            C7174 c7175 = (C7174) map.get(c12045.m27585(iM27598));
            if (c7175 != null) {
                arrayList.add(c7175);
            }
        }
        C7174[] c7174Arr2 = new C7174[arrayList.size()];
        this.f18728 = c7174Arr2;
        arrayList.toArray(c7174Arr2);
        c24608.m54248(this, this.f18729.m27587());
        if (c12045.m27596() <= 0) {
            c19244Arr = C23268.f73124;
        } else {
            c19244Arr = new C19244[c12045.m27596()];
        }
        this.f18732 = c19244Arr;
        for (int i2 = 0; i2 < c12045.m27596(); i2++) {
            this.f18732[i2] = new C19244(c12045.m27599(i2), this);
        }
        if (c12045.m27592() <= 0) {
            c11198Arr = C23268.f73126;
        } else {
            c11198Arr = new C11198[c12045.m27592()];
        }
        this.f18727 = c11198Arr;
        for (int i3 = 0; i3 < c12045.m27592(); i3++) {
            this.f18727[i3] = new C11198(c12045.m27593(i3), this, null);
        }
        if (c12045.m27601() <= 0) {
            c22598Arr = C23268.f73130;
        } else {
            c22598Arr = new C22598[c12045.m27601()];
        }
        this.f18730 = c22598Arr;
        for (int i4 = 0; i4 < c12045.m27601(); i4++) {
            this.f18730[i4] = new C22598(c12045.m27594(i4), this);
        }
        if (c12045.m27591() <= 0) {
            c2479Arr = C23268.f73128;
        } else {
            c2479Arr = new C2479[c12045.m27591()];
        }
        this.f18726 = c2479Arr;
        for (int i5 = 0; i5 < c12045.m27591(); i5++) {
            this.f18726[i5] = new C2479(c12045.m27597(i5), this, null, i5, true);
        }
    }

    public C7174(String str, C19244 c19244) {
        super(0);
        this.f5767 = null;
        C24608 c24608 = new C24608(new C7174[0]);
        this.f18731 = c24608;
        C14056 c14056NewBuilder = C12045.newBuilder();
        c14056NewBuilder.m31897(c19244.mo3542() + ".placeholder.proto");
        c14056NewBuilder.m31901(str);
        c14056NewBuilder.m31900(c19244.mo3533());
        C12045 c12045BuildPartial = c14056NewBuilder.buildPartial();
        if (c12045BuildPartial.isInitialized()) {
            this.f18729 = c12045BuildPartial;
            this.f18733 = new C7174[0];
            this.f18728 = new C7174[0];
            this.f18732 = new C19244[]{c19244};
            this.f18727 = C23268.f73126;
            this.f18730 = C23268.f73130;
            this.f18726 = C23268.f73128;
            c24608.m54248(this, str);
            c24608.m54247(c19244);
            return;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c12045BuildPartial);
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m16491() {
        try {
            m16483();
        } catch (C8515 e) {
            throw new IllegalArgumentException("Invalid features for \"" + this.f18729.getName() + "\".", e);
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    private void m16483() {
        if (this.f5766 != null) {
            return;
        }
        synchronized (this) {
            if (this.f5766 != null) {
                return;
            }
            m5384(this.f18729.m27586().m21750());
            for (C19244 c19244 : this.f18732) {
                c19244.m43831();
            }
            for (C11198 c11198 : this.f18727) {
                C11198.m25858(c11198);
            }
            for (C22598 c22598 : this.f18730) {
                C22598.m50643(c22598);
            }
            for (C2479 c2479 : this.f18726) {
                C2479.m3519(c2479);
            }
        }
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ᩷ */
    public final C8041 mo3547() {
        C2676 c2676NewBuilder = C8041.newBuilder();
        if (m16490().getNumber() >= EnumC5674.EDITION_2023.getNumber()) {
            return c2676NewBuilder.build();
        }
        if (m16490() == EnumC5674.EDITION_PROTO2 && this.f18729.m27586().m21756()) {
            C17683 c17683 = C25080.f80008;
            C18374 c18374NewBuilder = C16362.newBuilder();
            c18374NewBuilder.m41854(EnumC19045.VERIFY);
            C16362 c16362BuildPartial = c18374NewBuilder.buildPartial();
            if (!c16362BuildPartial.isInitialized()) {
                throw AbstractC22045.m49645((InterfaceC24548) c16362BuildPartial);
            }
            c2676NewBuilder.m11166(c17683, c16362BuildPartial);
        }
        return c2676NewBuilder.build();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3551() {
        return m16490().getNumber() < EnumC5674.EDITION_2023.getNumber() && m16490() == EnumC5674.EDITION_PROTO2 && this.f18729.m27586().m21756();
    }
}
