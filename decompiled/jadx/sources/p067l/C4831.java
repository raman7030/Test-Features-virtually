package p067l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7MW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4831 implements InterfaceC24947 {

    /* JADX INFO: renamed from: ֫ */
    public final C20266 f10988;

    /* JADX INFO: renamed from: ۧ */
    public final C5318 f10989;

    /* JADX INFO: renamed from: ܳ */
    public final int f10990 = 4;

    /* JADX INFO: renamed from: ܽ */
    public final long f10991 = C12782.m29334();

    /* JADX INFO: renamed from: ܿ */
    public volatile Object f10992;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC17570 f10993;

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ۧ */
    public final void mo8653() {
    }

    public C4831(InterfaceC22753 interfaceC22753, C5318 c5318, InterfaceC17570 interfaceC17570) {
        this.f10988 = new C20266(interfaceC22753);
        this.f10989 = c5318;
        this.f10993 = interfaceC17570;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m10248() {
        return this.f10992;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m10247() {
        return this.f10988.m45774();
    }

    /* JADX INFO: renamed from: ܳ */
    public final Uri m10246() {
        return this.f10988.m45776();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Map m10249() {
        return this.f10988.m45773();
    }

    @Override // p067l.InterfaceC24947
    /* JADX INFO: renamed from: ֫ */
    public final void mo8651() {
        this.f10988.m45775();
        C21412 c21412 = new C21412(this.f10988, this.f10989);
        try {
            c21412.m48549();
            Uri uriMo4021 = this.f10988.mo4021();
            uriMo4021.getClass();
            this.f10992 = this.f10993.mo36005(uriMo4021, c21412);
        } finally {
            C5792.m13000(c21412);
        }
    }
}
