package p067l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.᩻֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N12S */
/* JADX INFO: loaded from: classes.dex */
public final class C24556 {
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17043 m54158(C18107 c18107, int i, String str) {
        return c18107.m41219(C7050.m16224(i) + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(Long.valueOf(System.currentTimeMillis())) + "." + str, true);
    }
}
