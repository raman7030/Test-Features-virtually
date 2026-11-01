package p067l;

import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10565 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ IBinder f29257;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f29258;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C2517 f29259;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C3188 f29260;

    public RunnableC10565(C2517 c2517, C3188 c3188, String str, IBinder iBinder) {
        this.f29259 = c2517;
        this.f29260 = c3188;
        this.f29258 = str;
        this.f29257 = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11868 c11868 = (C11868) this.f29259.f4113.f48755.getOrDefault(this.f29260.f6126.getBinder(), null);
        if (c11868 == null) {
            return;
        }
        HashMap map = c11868.f33078;
        String str = this.f29258;
        IBinder iBinder = this.f29257;
        if (iBinder == null) {
            map.remove(str);
            return;
        }
        List list = (List) map.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((C1349) it.next()).f33658) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                map.remove(str);
            }
        }
    }
}
