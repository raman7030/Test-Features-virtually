package p067l;

import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: l.۬ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1474 {
    public AbstractC1474() {
        new Binder();
        if (Build.VERSION.SDK_INT >= 26) {
            new C0984(this);
        } else {
            new C1054(this);
        }
    }
}
