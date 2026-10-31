package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 178J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15081 implements InterfaceC20419 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19008 f46072;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC1677 f46073;

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20419 mo18048() {
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20419 mo18049(C10045 c10045) {
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20419 mo18050(boolean z) {
        return this;
    }

    public C15081(C19008 c19008, InterfaceC1677 interfaceC1677) {
        this.f46072 = c19008;
        this.f46073 = interfaceC1677;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1368[] mo18051(Uri uri, Map map) {
        InterfaceC1368[] interfaceC1368ArrMo18051 = this.f46072.mo18051(uri, map);
        InterfaceC1368[] interfaceC1368Arr = new InterfaceC1368[interfaceC1368ArrMo18051.length];
        for (int i = 0; i < interfaceC1368ArrMo18051.length; i++) {
            InterfaceC1368 c8027 = interfaceC1368ArrMo18051[i];
            if (c8027.mo4843() instanceof C12825) {
                c8027 = new C8027(c8027, this.f46073, uri);
            }
            interfaceC1368Arr[i] = c8027;
        }
        return interfaceC1368Arr;
    }
}
