package p067l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S7EN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13619 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 f38322;

    /* JADX INFO: renamed from: ۧ */
    public List f38323;

    public C13619(String str, InterfaceC22097 interfaceC22097) {
        InterfaceC22097 interfaceC22097Resolve = interfaceC22097 == null ? C10697.get(str, new String[0]) : interfaceC22097.resolve(str);
        this.f38322 = interfaceC22097Resolve;
        try {
            this.f38323 = C18743.readAllLines(interfaceC22097Resolve, StandardCharsets.UTF_8);
        } catch (IOException unused) {
        }
    }
}
