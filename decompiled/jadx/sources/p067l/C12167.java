package p067l;

/* JADX INFO: renamed from: l.ۤ۬ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C12167 {
    /* JADX INFO: renamed from: ֫ */
    public static void m28089(CharSequence charSequence, EnumC19980 enumC19980, C5660 c5660, C20651 c20651, boolean z, C20438 c20438) {
        try {
            C20195.m45697();
            C2759 c2759M28087 = m28087(charSequence, enumC19980, c20651);
            if (c2759M28087 == null) {
                c20438.append(charSequence);
            } else {
                C20195.m45697();
                new C17511(c2759M28087, c5660, c20651, z, c20438).m39887();
            }
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C6113 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2759 m28087(CharSequence charSequence, EnumC19980 enumC19980, C20651 c20651) {
        C14178 c14178M28088;
        C14178 c14178M28089 = m28088(charSequence, enumC19980, c20651, null);
        if (c14178M28089 != null && enumC19980 != EnumC19980.JSON && C19524.m44356(c14178M28089.f40433.m8412())) {
            C19524 c19524 = c14178M28089.f40430;
            int i = 0;
            while (true) {
                if (i >= 3 || (c14178M28088 = m28088(charSequence, enumC19980, c20651, c19524)) == null) {
                    c14178M28089 = null;
                    break;
                }
                C19524 c19525 = c14178M28088.f40430;
                if (c19524.m44359(c19525, c14178M28088.f40433.m8412())) {
                    c14178M28089 = c14178M28088;
                    break;
                }
                i++;
                c19524 = c19525;
            }
        }
        if (c14178M28089 == null) {
            return null;
        }
        C2759 c2759 = c14178M28089.f40431;
        c2759.m4325(c14178M28089.f40432);
        c2759.m4326(c2759.f4647);
        return c2759;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14178 m28088(CharSequence charSequence, EnumC19980 enumC19980, C20651 c20651, C19524 c19524) {
        C20195 c20195 = new C20195(charSequence);
        C2544 c2544 = new C2544(c20195);
        c2544.m54802(new C3430(c2544, c20195));
        EnumC19980 enumC19981 = EnumC19980.JSON;
        c2544.m23219(enumC19980 == enumC19981);
        c2544.m23218(c19524);
        c2544.m45727();
        C14848 c14848 = new C14848(c2544, charSequence.length());
        c14848.m8408();
        C2759 c2759 = new C2759(charSequence, c14848, enumC19980, c20651.m46666(), c19524);
        AbstractC5461 c4101 = enumC19980 == enumC19981 ? new C4101(c14848) : new C6802(c14848);
        c4101.m45726(new C10807(c4101, new C24888(c4101.mo3738())));
        c4101.m11985(enumC19980 == EnumC19980.TYPESCRIPT);
        c4101.m11984(c19524);
        c4101.m45727();
        c4101.m45725(c2759);
        c4101.m26578(new C16170());
        boolean z = enumC19980 != enumC19981 && C19524.m44356(c14848.m8412());
        C18853 c18853 = new C18853(enumC19980 == enumC19981, (c19524 == null && z) ? false : true, z);
        c4101.m26582();
        c4101.m26574(c18853);
        try {
            if (c4101 instanceof C4101) {
                ((C4101) c4101).m8246();
            } else {
                while (c14848.mo8405(1) != -1) {
                    int iIndex = c14848.index();
                    ((C6802) c4101).m15548();
                    if (c14848.index() == iIndex) {
                        c14848.mo8406();
                    }
                }
            }
            return new C14178(c14848, c2759, c18853);
        } catch (C20866 unused) {
            return null;
        }
    }
}
