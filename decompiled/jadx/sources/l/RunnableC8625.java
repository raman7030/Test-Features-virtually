package l;

import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8625 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IBinder f26339;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f26340;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f26341;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f26342;

    public RunnableC8625(C0157 c0157, C0863 c0863, String str, IBinder iBinder) {
        this.f26341 = c0157;
        this.f26342 = c0863;
        this.f26340 = str;
        this.f26339 = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9996 c9996 = (C9996) this.f26341.f1338.f45642.getOrDefault(this.f26342.f3353.getBinder(), null);
        if (c9996 == null) {
            return;
        }
        HashMap map = c9996.f30118;
        String str = this.f26340;
        IBinder iBinder = this.f26339;
        if (iBinder == null) {
            map.remove(str);
            return;
        }
        List list = (List) map.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((C10220) it.next()).f30697) {
                    it.remove();
                }
            }
            if (list.size() == 0) {
                map.remove(str);
            }
        }
    }
}
