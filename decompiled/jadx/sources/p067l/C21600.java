package p067l;

import java.util.Date;
import net.p069sf.sevenzipjbinding.impl.OutItem;
import net.p069sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.᩶ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21600 {
    /* JADX INFO: renamed from: ֫ */
    public static OutItem m48802(InterfaceC6847 interfaceC6847, int i, OutItemFactory outItemFactory) {
        OutItem outItem = (OutItem) outItemFactory.createOutItem();
        C5506 c5506Mo11909 = interfaceC6847.mo11909(i);
        String str = c5506Mo11909.f13158;
        if (str.endsWith("/")) {
            outItem.setPropertyIsDir(Boolean.TRUE);
        } else {
            outItem.setDataSize(Long.valueOf(c5506Mo11909.f13156));
        }
        outItem.setPropertyLastModificationTime(new Date(c5506Mo11909.f13159));
        outItem.setPropertyPath(str);
        String str2 = c5506Mo11909.f13157;
        if (str2 != null) {
            outItem.setPropertySymLink(str2);
        }
        return outItem;
    }
}
