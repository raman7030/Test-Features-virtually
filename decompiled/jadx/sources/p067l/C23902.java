package p067l;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Properties;

/* JADX INFO: renamed from: l.᩺֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23902 extends AbstractC3982 {

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC13174 f75896;

    public C23902(C15828 c15828) {
        EnumC13174 enumC13174;
        super(c15828);
        this.f8665 = new EnumMap(EnumC13844.class);
        for (EnumC13844 enumC13844 : EnumC13844.values()) {
            this.f8665.put(enumC13844, new ArrayList());
        }
        InterfaceC19740 interfaceC19740 = c15828.f45854;
        if ((interfaceC19740 == null && c15828.f45858 == null) || (interfaceC19740 != null && interfaceC19740.mo23287() == EnumC18398.CLASS)) {
            enumC13174 = EnumC13174.CLASS;
        } else {
            enumC13174 = EnumC13174.SOURCE;
        }
        this.f75896 = enumC13174;
    }

    @Override // p067l.AbstractC3982, p067l.InterfaceC4653
    /* JADX INFO: renamed from: ֫ */
    public final Properties mo7944() {
        Properties propertiesMo7944 = super.mo7944();
        propertiesMo7944.put("style", this.f75896.f37024);
        propertiesMo7944.put("shape", "ellipse");
        return propertiesMo7944;
    }
}
