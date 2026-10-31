package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: S7EN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11838 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f35317;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f35318;

    public C11838(String str, InterfaceC20758 interfaceC20758) {
        InterfaceC20758 interfaceC20758Resolve = interfaceC20758 == null ? C8763.get(str, new String[0]) : interfaceC20758.resolve(str);
        this.f35317 = interfaceC20758Resolve;
        try {
            this.f35318 = C17229.readAllLines(interfaceC20758Resolve, StandardCharsets.UTF_8);
        } catch (IOException unused) {
        }
    }
}
