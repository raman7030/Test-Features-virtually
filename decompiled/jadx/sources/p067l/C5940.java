package p067l;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3Y1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5940 {
    /* JADX INFO: renamed from: ֫ */
    public static void m13317(InterfaceC2704 interfaceC2704, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(interfaceC2704.mo3628().size());
        for (Map.Entry entry : interfaceC2704.mo3628().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4599 m13316(Class cls, String str) {
        try {
            return new C4599(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }
}
