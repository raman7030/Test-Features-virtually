package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֫۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1682 {
    static {
        Pattern pattern = InterfaceC10855.f32609;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16646 m5681(InterfaceC15086 interfaceC15086) {
        if (!interfaceC15086.mo35699()) {
            return C16646.empty();
        }
        Matcher matcher = InterfaceC10855.f32609.matcher(interfaceC15086.mo35701());
        if (!matcher.matches()) {
            return C16646.empty();
        }
        return C16646.of("/* " + matcher.group(1) + "= */");
    }
}
