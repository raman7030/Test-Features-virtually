package p067l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: F7CM */
/* JADX INFO: loaded from: classes4.dex */
public final class C10667 extends C8792 {

    /* JADX INFO: renamed from: ۙ */
    public C17450 f29504;

    /* JADX INFO: renamed from: ᩶ */
    public String f29505;

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        return 2;
    }

    public C10667(C5263 c5263, String str) {
        super(c5263, EnumC6799.f17649);
        this.f29504 = null;
        this.f29505 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24542(C5263 c5263, Function function) {
        C17450 c17450M11355 = c5263.m11355(function);
        this.f29504 = c17450M11355;
        String str = this.f29505;
        if (c17450M11355 != null) {
            c17450M11355.f52180.f10654 = str;
        } else {
            this.f29504 = c5263.m11354(str);
        }
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        if (this.f29504 != null) {
            super.mo5157(interfaceC2756);
            ((C8121) interfaceC2756).m18818(this.f29504.f23817);
        }
    }
}
