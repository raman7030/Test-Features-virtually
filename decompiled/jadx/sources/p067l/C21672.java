package p067l;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩶ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes5.dex */
public final class C21672 implements InterfaceC6919 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22097 f68254;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC9159 f68255;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f68256;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C13625 f68257;

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6362() {
        return true;
    }

    public C21672(C13625 c13625, InterfaceC22097 interfaceC22097) throws IOException {
        this.f68257 = c13625;
        this.f68254 = interfaceC22097;
        if (c13625.f70538 != null && interfaceC22097.toString().endsWith(".jar")) {
            Map mapSingletonMap = Collections.singletonMap("multi-release", c13625.f70538);
            C3646 c3646M10411 = c13625.f38345.m10411();
            if (c3646M10411 == null) {
                C1446.m31702("should have been caught before!");
                throw null;
            }
            try {
                this.f68255 = c3646M10411.newFileSystem(interfaceC22097, mapSingletonMap);
            } catch (ZipException e) {
                throw new IOException("ZipException opening \"" + interfaceC22097.getFileName() + "\": " + e.getMessage(), e);
            }
        } else {
            this.f68255 = c13625.f38345.m10411().newFileSystem(interfaceC22097, (Map) null);
        }
        this.f68256 = new HashMap();
        for (InterfaceC22097 interfaceC22098 : this.f68255.getRootDirectories()) {
            C18743.walkFileTree(interfaceC22098, C13625.f38340, Integer.MAX_VALUE, new C23013(this, interfaceC22098));
        }
    }

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ֫ */
    public final void mo6361(InterfaceC22097 interfaceC22097, C12204 c12204, Set set, boolean z, C20271 c20271) {
        InterfaceC22097 interfaceC22098 = (InterfaceC22097) this.f68256.get(c12204);
        if (interfaceC22098 == null) {
            return;
        }
        C18743.walkFileTree(interfaceC22098, C13625.f38338, z ? Integer.MAX_VALUE : 1, new C23683(this, set, c20271));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48876(C21672 c21672, InterfaceC22097 interfaceC22097) {
        if (interfaceC22097 == null) {
            return true;
        }
        String string = interfaceC22097.toString();
        if (string.endsWith("/")) {
            string = C17073.m38720(1, 0, string);
        }
        return EnumC5698.m12682(string);
    }

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19740 mo6360(InterfaceC22097 interfaceC22097, C8180 c8180) {
        InterfaceC22097 interfaceC22098 = (InterfaceC22097) this.f68256.get(c8180.m18959());
        if (interfaceC22098 == null) {
            return null;
        }
        String str = c8180.f38099;
        InterfaceC22097 interfaceC22097Resolve = interfaceC22098.resolve(str.substring(str.lastIndexOf(47) + 1));
        if (!C18743.exists(interfaceC22097Resolve, new EnumC16060[0])) {
            return null;
        }
        int i = AbstractC14215.f40494;
        return new C5498(this.f68257, interfaceC22097Resolve, interfaceC22097, 0);
    }

    @Override // p067l.InterfaceC6919
    public final void close() {
        this.f68255.close();
    }

    @Override // p067l.InterfaceC6919
    /* JADX INFO: renamed from: ֫ */
    public final Iterable mo6359() {
        return this.f68256.keySet();
    }
}
