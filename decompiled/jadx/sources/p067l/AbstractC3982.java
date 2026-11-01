package p067l;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.֫۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3982 extends AbstractC11359 implements InterfaceC4653 {

    /* JADX INFO: renamed from: ᩹ */
    public EnumMap f8665;

    @Override // p067l.InterfaceC4653
    /* JADX INFO: renamed from: ֫ */
    public final Properties mo7945(InterfaceC4653 interfaceC4653, InterfaceC10688 interfaceC10688) {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, interfaceC10688);
        return properties;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC3982) && ((C15828) this.f31649).equals(((AbstractC3982) obj).f31649);
    }

    public final int hashCode() {
        return ((C15828) this.f31649).hashCode();
    }

    @Override // p067l.AbstractC11359
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC10688[] mo7946() {
        return EnumC13844.values();
    }

    @Override // p067l.AbstractC11359
    /* JADX INFO: renamed from: ֫ */
    public final Collection mo7943(InterfaceC10688 interfaceC10688) {
        return (Collection) this.f8665.get(interfaceC10688);
    }

    @Override // p067l.InterfaceC4653
    /* JADX INFO: renamed from: ֫ */
    public Properties mo7944() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, ("\"" + toString() + "\"").replaceAll("\n", ""));
        return properties;
    }

    @Override // p067l.AbstractC11359
    public final String toString() {
        return ((C15828) this.f31649).f45855.toString();
    }
}
