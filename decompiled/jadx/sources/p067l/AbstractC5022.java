package p067l;

/* JADX INFO: renamed from: l.ۖ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5022 {

    /* JADX INFO: renamed from: ֫ */
    public final C8374 f11502;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10681(char c);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10684(AbstractC12224 abstractC12224);

    /* JADX INFO: renamed from: ֫ */
    public void mo10685(C15828 c15828) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10686(byte[] bArr);

    public AbstractC5022(C8374 c8374) {
        this.f11502 = c8374;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo10688(AbstractC6462 abstractC6462) {
        throw new C17761(abstractC6462);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo10687(AbstractC6462 abstractC6462) {
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        if (i == 14) {
            C21215 c21215 = (C21215) abstractC6462;
            EnumC17268 enumC17268 = c21215.f66702;
            int i2 = C12889.f36248[enumC17268.ordinal()];
            if (i2 == 1) {
                mo10681('+');
                mo10687(c21215.f66703);
                return;
            } else if (i2 == 2) {
                mo10681('-');
                mo10687(c21215.f66703);
                return;
            } else {
                if (i2 == 3) {
                    mo10681('*');
                    return;
                }
                throw new AssertionError(enumC17268);
            }
        }
        if (i == 18) {
            C11945 c11945 = (C11945) abstractC6462;
            m10682(c11945.f33323);
            mo10687(c11945.f16992);
            return;
        }
        if (i != 19) {
            switch (i) {
                case 1:
                    mo10681('[');
                    mo10687(((C7251) abstractC6462).f18916);
                    return;
                case 2:
                    if (abstractC6462.mo7388()) {
                        mo10688(abstractC6462);
                    }
                    mo10681('L');
                    m10683(abstractC6462);
                    mo10681(';');
                    return;
                case 3:
                    mo10681('B');
                    return;
                case 4:
                    mo10681('C');
                    return;
                case 5:
                    mo10681('S');
                    return;
                case 6:
                    mo10681('I');
                    return;
                case 7:
                    mo10681('J');
                    return;
                case 8:
                    mo10681('F');
                    return;
                case 9:
                    mo10681('D');
                    return;
                case 10:
                    mo10681('Z');
                    return;
                case 11:
                    mo10681('V');
                    return;
                case 12:
                    if (((C10485) abstractC6462).mo24195()) {
                        mo10688(abstractC6462);
                    }
                    mo10681('T');
                    mo10684(abstractC6462.f16705.f20408);
                    mo10681(';');
                    return;
                default:
                    throw new AssertionError("typeSig " + abstractC6462.mo5577());
            }
        }
        C12497 c12497 = (C12497) abstractC6462;
        mo10681('(');
        for (C4848 c4848 = c12497.f35030; c4848.m10293(); c4848 = c4848.f11035) {
            mo10687((AbstractC6462) c4848.f11034);
        }
        mo10681(')');
        mo10687(c12497.f35031);
        for (C4848 c4849 = c12497.f35032; c4849.m10293(); c4849 = c4849.f11035) {
            if (((AbstractC6462) c4849.f11034).m14777(EnumC11353.TYPEVAR)) {
                for (C4848 c48410 = c12497.f35032; c48410.m10293(); c48410 = c48410.f11035) {
                    mo10681('^');
                    mo10687((AbstractC6462) c48410.f11034);
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10683(AbstractC6462 abstractC6462) {
        AbstractC12224 abstractC12224M28201;
        C21333 c21333 = (C21333) abstractC6462;
        C15828 c15828 = (C15828) c21333.f16705;
        mo10685(c15828);
        AbstractC6462 abstractC6462Mo7201 = c21333.mo7201();
        if (abstractC6462Mo7201.mo14798().m10293()) {
            EnumC3600 enumC3600 = c15828.f20407.f20405;
            EnumC3600 enumC3601 = EnumC3600.f7343;
            C8374 c8374 = this.f11502;
            boolean z = enumC3600 == enumC3601 || c15828.f20408 == c8374.f22471.f21725;
            if (z) {
                abstractC6462Mo7201 = c8374.m19459(abstractC6462Mo7201);
            }
            m10683(abstractC6462Mo7201);
            mo10681(z ? '$' : '.');
            C1446.m31704(c15828.f45859.m28205(c15828.f20407.m17990().f45859));
            if (z) {
                abstractC12224M28201 = c15828.f45859.m28201(c15828.f20407.m17990().f45859.mo5098() + 1, c15828.f45859.mo5098());
            } else {
                abstractC12224M28201 = c15828.f20408;
            }
            mo10684(abstractC12224M28201);
        } else {
            mo10686(C19839.m45084(c15828.f45859));
        }
        if (c21333.mo14802().m10293()) {
            mo10681('<');
            for (C4848 c4848Mo14802 = c21333.mo14802(); c4848Mo14802.m10293(); c4848Mo14802 = c4848Mo14802.f11035) {
                mo10687((AbstractC6462) c4848Mo14802.f11034);
            }
            mo10681('>');
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10682(C4848 c4848) {
        mo10681('<');
        while (c4848.m10293()) {
            C10485 c10485 = (C10485) c4848.f11034;
            mo10684(c10485.f16705.f20408);
            C4848 c4848M19424 = this.f11502.m19424(c10485);
            if ((((AbstractC6462) c4848M19424.f11034).f16705.mo18003() & 512) != 0) {
                mo10681(':');
            }
            while (c4848M19424.m10293()) {
                mo10681(':');
                mo10687((AbstractC6462) c4848M19424.f11034);
                c4848M19424 = c4848M19424.f11035;
            }
            c4848 = c4848.f11035;
        }
        mo10681('>');
    }
}
