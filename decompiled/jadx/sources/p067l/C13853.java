package p067l;

import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C13853 {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (AbstractC7936.f20816a) {
            return fileChannel;
        }
        int i = C17875.f53421e;
        if (fileChannel instanceof C17875) {
            return (C17875) fileChannel;
        }
        return new C17875(fileChannel, false, false, null);
    }

    public static FileChannel open(InterfaceC22097 interfaceC22097, InterfaceC24778... interfaceC24778Arr) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, interfaceC24778Arr);
        return AbstractC7936.f20817b ? FileChannel.open(C9730.m22751l(interfaceC22097), AbstractC24029.m53252u(hashSet), AbstractC24029.m53224N(new InterfaceC23437[0])) : AbstractC24029.m53230T(interfaceC22097, hashSet);
    }
}
