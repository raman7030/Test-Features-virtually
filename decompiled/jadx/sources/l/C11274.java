package l;

import java.security.PrivilegedAction;

/* JADX INFO: renamed from: l.ۧ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11274 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        AbstractC13389 abstractC13389 = AbstractC11503.a;
        String property = System.getProperty("java.nio.file.spi.DefaultFileSystemProvider");
        if (property != null) {
            for (String str : property.split(",")) {
                try {
                    abstractC13389 = (AbstractC13389) Class.forName(str, true, ClassLoader.getSystemClassLoader()).getDeclaredConstructor(AbstractC13389.class).newInstance(abstractC13389);
                    if (!abstractC13389.getScheme().equals("file")) {
                        throw new Error("Default provider must use scheme 'file'");
                    }
                } catch (Exception e) {
                    throw new Error(e);
                }
            }
        }
        return abstractC13389;
    }
}
