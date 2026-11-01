package p067l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.֫۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3967 {
    static {
        Pattern pattern = InterfaceC12685.f35585;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18189 m7911(InterfaceC16706 interfaceC16706) {
        if (!interfaceC16706.mo37857()) {
            return C18189.empty();
        }
        Matcher matcher = InterfaceC12685.f35585.matcher(interfaceC16706.mo37859());
        if (!matcher.matches()) {
            return C18189.empty();
        }
        return C18189.m41402of("/* " + matcher.group(1) + "= */");
    }
}
