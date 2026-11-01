package p067l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۟᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8LZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9704 {

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f26764 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: ֫ */
    public int f26765 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f26766 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final void m22651(C25079 c25079) {
        for (int i = 0; i < c25079.m55048(); i++) {
            InterfaceC16361 interfaceC16361M55049 = c25079.m55049(i);
            if (interfaceC16361M55049 instanceof C4200) {
                C4200 c4200 = (C4200) interfaceC16361M55049;
                if ("iTunSMPB".equals(c4200.f9244) && m22650(c4200.f9246)) {
                    return;
                }
            } else if (interfaceC16361M55049 instanceof C8894) {
                C8894 c8894 = (C8894) interfaceC16361M55049;
                if ("com.apple.iTunes".equals(c8894.f24103) && "iTunSMPB".equals(c8894.f24102) && m22650(c8894.f24104)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22650(String str) {
        Matcher matcher = f26764.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = C5792.f14228;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.f26765 = i;
            this.f26766 = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
