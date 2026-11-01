package p067l;

import android.net.Uri;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.᩻֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes.dex */
public final class C24571 implements InterfaceC16716 {

    /* JADX INFO: renamed from: ۤ */
    public static final Uri f77789 = Uri.parse("memory://hls-playlist");

    /* JADX INFO: renamed from: ۗ */
    public final C24905 f77790;

    /* JADX INFO: renamed from: ۙ */
    public final EnumC17865 f77791;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC16716 f77792;

    /* JADX INFO: renamed from: ۬ */
    public final C16524 f77793;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC24631 f77794;

    /* JADX INFO: renamed from: ᩸ */
    public final LongSupplier f77795;

    /* JADX INFO: renamed from: ᩹ */
    public final C13291 f77796;

    public C24571(C24905 c24905, InterfaceC16716 interfaceC16716, InterfaceC24631 interfaceC24631, C13291 c13291, EnumC17865 enumC17865, LongSupplier longSupplier, C16524 c16524) {
        this.f77790 = c24905;
        this.f77792 = interfaceC16716;
        this.f77794 = interfaceC24631;
        this.f77796 = c13291;
        this.f77791 = enumC17865;
        this.f77795 = longSupplier;
        if (c16524 == null && enumC17865 == EnumC17865.f53335) {
            c16524 = new C16524();
        }
        this.f77793 = c16524;
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22753 mo8449() {
        return new C15853(this);
    }
}
