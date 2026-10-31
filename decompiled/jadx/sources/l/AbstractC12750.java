package l;

import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: l.۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12750 {
    public AbstractC12750() {
        new Binder();
        if (Build.VERSION.SDK_INT >= 26) {
            new C2873(this);
        } else {
            new C4284(this);
        }
    }
}
