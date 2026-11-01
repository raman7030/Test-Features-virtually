package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.᩹۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBIX */
/* JADX INFO: loaded from: classes.dex */
public final enum C23543 extends EnumC16660 {
    public /* synthetic */ C23543() {
        this("RcdataLessthanSign", 10);
    }

    public C23543(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC16660
    /* JADX INFO: renamed from: ֫ */
    public void mo3888(C16836 c16836, C8791 c8791) {
        if (c8791.m20341('/')) {
            c16836.m38184();
            c16836.m38182(EnumC16660.f49000);
            return;
        }
        if (c8791.m20335() && c16836.m38177() != null) {
            String str = "</" + c16836.m38177();
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (c8791.m20345(lowerCase) <= -1 && c8791.m20345(upperCase) <= -1) {
                AbstractC7450 abstractC7450M38178 = c16836.m38178(false);
                String strM38177 = c16836.m38177();
                abstractC7450M38178.f19504 = strM38177;
                abstractC7450M38178.f19508 = strM38177 != null ? strM38177.toLowerCase(locale) : "";
                c16836.f49836 = abstractC7450M38178;
                c16836.m38189();
                c8791.m20329();
                c16836.m38191(EnumC16660.f48962);
                return;
            }
        }
        c16836.m38180("<");
        c16836.m38191(EnumC16660.f49006);
    }
}
