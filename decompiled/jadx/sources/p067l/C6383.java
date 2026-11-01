package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes2.dex */
public final class C6383 {

    /* JADX INFO: renamed from: ۖ */
    public static final C6468 f16512 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final boolean f16513;

    /* JADX INFO: renamed from: ۜ */
    public final C14152 f16514;

    /* JADX INFO: renamed from: ۡ */
    public final C18537 f16515;

    /* JADX INFO: renamed from: ۢ */
    public final C23623 f16516;

    /* JADX INFO: renamed from: ۧ */
    public final EnumSet f16517;

    /* JADX INFO: renamed from: ܳ */
    public final C4371 f16518;

    /* JADX INFO: renamed from: ܺ */
    public final C8374 f16519;

    /* JADX INFO: renamed from: ܿ */
    public final C11216 f16521;

    /* JADX INFO: renamed from: ᩳ */
    public final C7664 f16522;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC11077[] f16520 = {new C19794(this), new C19123(this), new C22477(this), new C16440(this), new C9065(this)};

    /* JADX INFO: renamed from: ᩷ */
    public C24467 f16523 = new C24467();

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC18452 f16524 = new C15749(this);

    /* JADX INFO: renamed from: ֫ */
    public static C6383 m14595(C5127 c5127) {
        C6383 c6383 = (C6383) c5127.m10905(f16512);
        return c6383 == null ? new C6383(c5127) : c6383;
    }

    public C6383(C5127 c5127) {
        c5127.m10908(f16512, this);
        this.f16519 = C8374.m19396(c5127);
        this.f16516 = C23623.m52439(c5127);
        this.f16521 = C11216.m25910(c5127);
        this.f16514 = C14152.m32631(c5127);
        this.f16522 = C7664.m17734(c5127);
        C18537 c18537M42139 = C18537.m42139(c5127);
        this.f16515 = c18537M42139;
        this.f16518 = new C4371(c18537M42139);
        String strM30872 = C13565.m30871(c5127).m30872("find");
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f16513 = EnumC12477.f34983.m28726(enumC17840M40515);
        this.f16517 = EnumC13089.m29953(strM30872, enumC17840M40515);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14598(C11748 c11748) {
        String str;
        String str2;
        AbstractC13154 abstractC13154M42145;
        C23623 c23623 = this.f16516;
        C16051 c16051M9345 = c23623.m9345();
        C7664 c7664 = this.f16522;
        c7664.getClass();
        HashMap map = c7664.f20100;
        c7664.f20100 = new HashMap();
        try {
            C4036 c4036 = c11748.f32802;
            AbstractC7257 abstractC7257 = c11748.f32805;
            c23623.m9363(c4036.f8851.f7516);
            AbstractC13154 abstractC13154 = (AbstractC13154) abstractC7257;
            EnumC3600 enumC3600 = ((C10545) c4036.f8849).f29201.f26587.f20405;
            EnumC3600 enumC3601 = EnumC3600.f7354;
            C18537 c18537 = this.f16515;
            if (enumC3600 == enumC3601) {
                c18537.f55352 = -1;
                str = "\n";
                str2 = "Analyzer error when processing: ";
                try {
                    abstractC13154M42145 = c18537.m42145(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, C4848.m10276of(abstractC7257));
                } catch (Throwable th) {
                    th = th;
                    try {
                        StringBuilder sb = new StringBuilder(str2);
                        sb.append(c11748.f32805);
                        sb.append(":");
                        sb.append(th.toString());
                        String str3 = str;
                        sb.append(str3);
                        sb.append((String) C23573.stream(th.getStackTrace()).map(new C6705(11)).collect(C24205.joining(str3)));
                        C1446.m31702(sb.toString());
                        throw null;
                    } catch (Throwable th2) {
                        c23623.m9363(c16051M9345.m36524());
                        c7664.f20100 = map;
                        throw th2;
                    }
                }
            } else {
                str = "\n";
                str2 = "Analyzer error when processing: ";
                abstractC7257 = null;
                abstractC13154M42145 = abstractC13154;
            }
            C14152 c14152 = this.f16514;
            C24626 c24626 = this.f16521.f31195;
            C5042 c5042 = new C5042(c18537);
            c5042.f11581 = c11748;
            c5042.f11582 = abstractC7257;
            c14152.m32632(abstractC13154M42145, c4036, c24626, c5042, new C13739(c11748), EnumC9477.ANALYZER, new C22417(c7664));
            c11748.f32801.mo20984(c11748.f32806, c11748.f32803, c11748.f32804);
            c23623.m9363(c16051M9345.m36524());
            c7664.f20100 = map;
        } catch (Throwable th3) {
            th = th3;
            str = "\n";
            str2 = "Analyzer error when processing: ";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14597(C4036 c4036) {
        this.f16524.mo35815(c4036);
    }
}
