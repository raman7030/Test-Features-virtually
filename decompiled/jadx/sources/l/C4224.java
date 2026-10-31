package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes2.dex */
public final class C4224 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C4314 f13699 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f13700;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12399 f13701;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17013 f13702;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C22364 f13703;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumSet f13704;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2107 f13705;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6319 f13706;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9310 f13708;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5572 f13709;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC9163[] f13707 = {new C18335(this), new C17629(this), new C21158(this), new C14806(this), new C7046(this)};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23252 f13710 = new C23252();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC16923 f13711 = new C14079(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4224 m12719(C2903 c2903) {
        C4224 c4224 = (C4224) c2903.m8838(f13699);
        return c4224 == null ? new C4224(c2903) : c4224;
    }

    public C4224(C2903 c2903) {
        c2903.m8841(f13699, this);
        this.f13706 = C6319.m17456(c2903);
        this.f13703 = C22364.m50099(c2903);
        this.f13708 = C9310.m23901(c2903);
        this.f13701 = C12399.m30567(c2903);
        this.f13709 = C5572.m15819(c2903);
        C17013 c17013M39896 = C17013.m39896(c2903);
        this.f13702 = c17013M39896;
        this.f13705 = new C2107(c17013M39896);
        String strM28824 = C11781.m28823(c2903).m28824("find");
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        this.f13700 = EnumC10637.f32012.m26686(enumC16280M38301);
        this.f13704 = EnumC11280.m27892(strM28824, enumC16280M38301);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12722(C9869 c9869) {
        String str;
        String str2;
        AbstractC11349 abstractC11349M39902;
        C22364 c22364 = this.f13703;
        C14397 c14397M7266 = c22364.m7266();
        C5572 c5572 = this.f13709;
        c5572.getClass();
        HashMap map = c5572.f17260;
        c5572.f17260 = new HashMap();
        try {
            C1755 c1755 = c9869.f29845;
            AbstractC5144 abstractC5144 = c9869.f29848;
            c22364.m7284(c1755.f6075.f4745);
            AbstractC11349 abstractC11349 = (AbstractC11349) abstractC5144;
            EnumC1296 enumC1296 = ((C8604) c1755.f6073).f26285.f23673.f17559;
            EnumC1296 enumC1297 = EnumC1296.f4582;
            C17013 c17013 = this.f13702;
            if (enumC1296 == enumC1297) {
                c17013.f52172 = -1;
                str = "\n";
                str2 = "Analyzer error when processing: ";
                try {
                    abstractC11349M39902 = c17013.m39902(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, C2609.of(abstractC5144));
                } catch (Throwable th) {
                    th = th;
                    try {
                        StringBuilder sb = new StringBuilder(str2);
                        sb.append(c9869.f29848);
                        sb.append(":");
                        sb.append(th.toString());
                        String str3 = str;
                        sb.append(str3);
                        sb.append((String) C22311.stream(th.getStackTrace()).map(new C4563(11)).collect(C22976.joining(str3)));
                        C12171.m29640(sb.toString());
                        throw null;
                    } catch (Throwable th2) {
                        c22364.m7284(c14397M7266.m34390());
                        c5572.f17260 = map;
                        throw th2;
                    }
                }
            } else {
                str = "\n";
                str2 = "Analyzer error when processing: ";
                abstractC5144 = null;
                abstractC11349M39902 = abstractC11349;
            }
            C12399 c12399 = this.f13701;
            C23420 c23420 = this.f13708.f28246;
            C2813 c2813 = new C2813(c17013);
            c2813.f8787 = c9869;
            c2813.f8788 = abstractC5144;
            c12399.m30568(abstractC11349M39902, c1755, c23420, c2813, new C11964(c9869), EnumC7480.ANALYZER, new C21095(c5572));
            c9869.f29844.mo19027(c9869.f29849, c9869.f29846, c9869.f29847);
            c22364.m7284(c14397M7266.m34390());
            c5572.f17260 = map;
        } catch (Throwable th3) {
            th = th3;
            str = "\n";
            str2 = "Analyzer error when processing: ";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12721(C1755 c1755) {
        this.f13711.mo33690(c1755);
    }
}
