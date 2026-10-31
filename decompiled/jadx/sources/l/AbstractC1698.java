package l;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.֫۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1698 extends AbstractC9460 implements InterfaceC2404 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumMap f5886;

    @Override // l.InterfaceC2404
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Properties mo5712(InterfaceC2404 interfaceC2404, InterfaceC8754 interfaceC8754) {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, interfaceC8754);
        return properties;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1698) && ((C14163) this.f28700).equals(((AbstractC1698) obj).f28700);
    }

    public final int hashCode() {
        return ((C14163) this.f28700).hashCode();
    }

    @Override // l.AbstractC9460
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8754[] mo5713() {
        return EnumC12075.values();
    }

    @Override // l.AbstractC9460
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection mo5710(InterfaceC8754 interfaceC8754) {
        return (Collection) this.f5886.get(interfaceC8754);
    }

    @Override // l.InterfaceC2404
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Properties mo5711() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, ("\"" + toString() + "\"").replaceAll("\n", ""));
        return properties;
    }

    @Override // l.AbstractC9460
    public final String toString() {
        return ((C14163) this.f28700).f42767.toString();
    }
}
