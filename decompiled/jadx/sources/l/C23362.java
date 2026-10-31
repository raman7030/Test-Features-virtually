package l;

import android.net.Uri;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.᩻֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes.dex */
public final class C23362 implements InterfaceC15097 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Uri f75043 = Uri.parse("memory://hls-playlist");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23713 f75044;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC16306 f75045;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f75046;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14895 f75047;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC23425 f75048;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LongSupplier f75049;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11493 f75050;

    public C23362(C23713 c23713, InterfaceC15097 interfaceC15097, InterfaceC23425 interfaceC23425, C11493 c11493, EnumC16306 enumC16306, LongSupplier longSupplier, C14895 c14895) {
        this.f75044 = c23713;
        this.f75046 = interfaceC15097;
        this.f75048 = interfaceC23425;
        this.f75050 = c11493;
        this.f75045 = enumC16306;
        this.f75049 = longSupplier;
        if (c14895 == null && enumC16306 == EnumC16306.f50168) {
            c14895 = new C14895();
        }
        this.f75047 = c14895;
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21449 mo6247() {
        return new C14189(this);
    }
}
