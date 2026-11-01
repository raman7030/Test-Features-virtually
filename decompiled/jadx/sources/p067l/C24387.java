package p067l;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩺ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N7KG */
/* JADX INFO: loaded from: classes.dex */
public final class C24387 {

    /* JADX INFO: renamed from: ᩷ */
    public static final C6468 f77200 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final boolean f77201;

    /* JADX INFO: renamed from: ۜ */
    public final HashSet f77202 = new HashSet();

    /* JADX INFO: renamed from: ۧ */
    public final boolean f77203;

    /* JADX INFO: renamed from: ܳ */
    public final C6859 f77204;

    /* JADX INFO: renamed from: ܽ */
    public final C6953 f77205;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f77206;

    /* JADX INFO: renamed from: ᩳ */
    public final C23623 f77207;

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC17840 f77208;

    /* JADX INFO: renamed from: ֫ */
    public static C24387 m53737(C5127 c5127) {
        C24387 c24387 = (C24387) c5127.m10905(f77200);
        return c24387 == null ? new C24387(c5127) : c24387;
    }

    public C24387(C5127 c5127) {
        c5127.m10908(f77200, this);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f77201 = c13565M30871.m30880(EnumC2483.f3986);
        C23623 c23623M52439 = C23623.m52439(c5127);
        this.f77207 = c23623M52439;
        C6953 c6953M15930 = C6953.m15930(c5127);
        this.f77205 = c6953M15930;
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f77208 = enumC17840M40515;
        EnumC21706 enumC21706 = EnumC21706.PREVIEW;
        this.f77204 = new C6859(c23623M52439, enumC17840M40515, c6953M15930.m15935(enumC21706), "preview", enumC21706);
        this.f77203 = c13565M30871.m30879("forcePreview");
        HashMap map = new HashMap();
        for (EnumC12720 enumC12720 : EnumC12720.values()) {
            int i = enumC12720.f35734;
            EnumC17840 enumC17840M40514 = EnumC17840.m40514(enumC12720.f35733);
            if (enumC17840M40514 != null) {
                map.put(Integer.valueOf(i), enumC17840M40514);
            }
        }
        this.f77206 = map;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53745() {
        this.f77202.add(this.f77207.m52457());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53741(InterfaceC5323 interfaceC5323, C12895 c12895) {
        this.f77204.m15720(interfaceC5323, c12895);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53744(InterfaceC19740 interfaceC19740) {
        return this.f77202.contains(interfaceC19740);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53740(InterfaceC5323 interfaceC5323, EnumC12477 enumC12477) {
        C12895 c12895;
        C1446.m31704(this.f77201);
        C1446.m31704(m53747(enumC12477));
        if (this.f77205.m15936(EnumC21706.PREVIEW)) {
            return;
        }
        this.f77202.add(this.f77207.m52457());
        if (enumC12477.m28725()) {
            C13370 c13370M28727 = enumC12477.m28727();
            C12895 c12896 = C15675.f45417;
            c12895 = new C12895("compiler", "preview.feature.use.plural", c13370M28727);
        } else {
            C13370 c13370M28728 = enumC12477.m28727();
            C12895 c12897 = C15675.f45417;
            c12895 = new C12895("compiler", "preview.feature.use", c13370M28728);
        }
        this.f77204.m15720(interfaceC5323, c12895);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53743() {
        return this.f77201;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53746(InterfaceC19740 interfaceC19740, int i) {
        C1446.m31704(this.f77201);
        EnumC21706 enumC21706 = EnumC21706.PREVIEW;
        if (this.f77205.m15935(enumC21706)) {
            HashSet hashSet = this.f77202;
            C23623 c23623 = this.f77207;
            hashSet.add(c23623.m52457());
            String str = ((EnumC17840) this.f77206.get(Integer.valueOf(i))).f53238;
            C12895 c12895 = C15675.f45417;
            c23623.m9360(enumC21706, (InterfaceC5323) null, new C12895("compiler", "preview.feature.use.classfile", interfaceC19740, str));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m53747(EnumC12477 enumC12477) {
        int i = C13659.f38429[enumC12477.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return this.f77203;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14040 m53738(EnumC12477 enumC12477) {
        C1446.m31704(!this.f77201);
        if (enumC12477.m28725()) {
            C13370 c13370M28727 = enumC12477.m28727();
            C14040 c14040 = C8300.f21997;
            return new C14040("compiler", "preview.feature.disabled.plural", c13370M28727);
        }
        C13370 c13370M28728 = enumC12477.m28727();
        C14040 c14041 = C8300.f21997;
        return new C14040("compiler", "preview.feature.disabled", c13370M28728);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14040 m53739(InterfaceC19740 interfaceC19740, int i) {
        C1446.m31704(!this.f77201);
        String str = ((EnumC17840) this.f77206.get(Integer.valueOf(i))).f53238;
        C14040 c14040 = C8300.f21997;
        return new C14040("compiler", "preview.feature.disabled.classfile", interfaceC19740, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53748() {
        this.f77204.m15719();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53742(AbstractC14355 abstractC14355, EnumC12477 enumC12477) {
        boolean zM53747 = m53747(enumC12477);
        C23623 c23623 = this.f77207;
        boolean z = this.f77201;
        if (zM53747 && !z) {
            c23623.m9359(EnumC21417.SOURCE_LEVEL, abstractC14355, m53738(enumC12477));
            return;
        }
        EnumC17840 enumC17840 = this.f77208;
        if (!enumC12477.m28726(enumC17840)) {
            c23623.m9359(EnumC21417.SOURCE_LEVEL, abstractC14355, enumC12477.m28724(enumC17840.f53238));
        }
        if (z && m53747(enumC12477)) {
            m53740((InterfaceC5323) abstractC14355, enumC12477);
        }
    }
}
