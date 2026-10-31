package l;

import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public class C12084 {
    public static FileChannel convertMaybeLegacyFileChannelFromLibrary(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        if (AbstractC5858.a) {
            return fileChannel;
        }
        int i = C16316.e;
        if (fileChannel instanceof C16316) {
            return (C16316) fileChannel;
        }
        return new C16316(fileChannel, false, false, null);
    }

    public static FileChannel open(InterfaceC20758 interfaceC20758, InterfaceC23579... interfaceC23579Arr) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, interfaceC23579Arr);
        return AbstractC5858.b ? FileChannel.open(C7745.l(interfaceC20758), AbstractC22791.u(hashSet), AbstractC22791.N(new InterfaceC22168[0])) : AbstractC22791.T(interfaceC20758, hashSet);
    }
}
