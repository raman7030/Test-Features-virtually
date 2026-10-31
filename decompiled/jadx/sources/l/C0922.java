package l;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: VA36 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0922 implements InterfaceC15779 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7978 f3546;

    public C0922(C7978 c7978) {
        this.f3546 = c7978;
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo3327(Object obj) {
        return ((C8460) obj).m22145();
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo3328(Object obj) {
        return ((C8460) obj).m22144();
    }

    @Override // l.InterfaceC15779
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo3326(String str) {
        String strM39731 = AbstractC16891.m39731(str);
        C7978 c7978 = this.f3546;
        List list = (List) C5378.stream(c7978.f24638.m26591(c7978.m21279(strM39731))).skip(1L).collect(C22976.toList());
        if (c7978.f24636 == null && !list.isEmpty()) {
            try {
                C7978.m21278(c7978, list, strM39731);
            } catch (IOException unused) {
            }
        }
        return list;
    }
}
