package p067l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes4.dex */
public final class C16701 implements InterfaceC21775 {

    /* JADX INFO: renamed from: ᩸ */
    public final C20434 f49190;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC3962 f49191;

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21775 mo19998() {
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21775 mo19999(C11915 c11915) {
        return this;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21775 mo20000(boolean z) {
        return this;
    }

    public C16701(C20434 c20434, InterfaceC3962 interfaceC3962) {
        this.f49190 = c20434;
        this.f49191 = interfaceC3962;
    }

    @Override // p067l.InterfaceC21775
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3669[] mo20001(Uri uri, Map map) {
        InterfaceC3669[] interfaceC3669ArrMo20001 = this.f49190.mo20001(uri, map);
        InterfaceC3669[] interfaceC3669Arr = new InterfaceC3669[interfaceC3669ArrMo20001.length];
        for (int i = 0; i < interfaceC3669ArrMo20001.length; i++) {
            InterfaceC3669 c9997 = interfaceC3669ArrMo20001[i];
            if (c9997.mo7081() instanceof C14557) {
                c9997 = new C9997(c9997, this.f49191, uri);
            }
            interfaceC3669Arr[i] = c9997;
        }
        return interfaceC3669Arr;
    }
}
