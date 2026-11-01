package p067l;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;

/* JADX INFO: renamed from: l.۠᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: LB2O */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10400 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final Object f28761;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC17043 f28762;

    /* JADX INFO: renamed from: ᩸ */
    public final Bundle f28763;

    /* JADX INFO: renamed from: ᩹ */
    public final C11996 f28764;

    public RunnableC10400(AbstractC17043 abstractC17043, Bundle bundle, Object obj) {
        this.f28762 = abstractC17043;
        this.f28763 = bundle;
        this.f28764 = null;
        this.f28761 = obj;
    }

    public RunnableC10400(AbstractC17043 abstractC17043, C11996 c11996, Object obj) {
        this.f28762 = abstractC17043;
        this.f28763 = null;
        this.f28764 = c11996;
        this.f28761 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m24095();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24095() {
        synchronized (this.f28761) {
            if (this.f28763 == null && this.f28764 == null) {
                this.f28762.mo25503();
            } else {
                this.f28762.mo37342();
                Bundle bundle = this.f28763;
                if (bundle != null) {
                    if (bundle.isEmpty()) {
                        this.f28762.mo25503();
                    } else {
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            this.f28763.writeToParcel(parcelObtain, 0);
                            this.f28762.m38660(parcelObtain.marshall());
                            parcelObtain.recycle();
                        } catch (Throwable th) {
                            parcelObtain.recycle();
                            throw th;
                        }
                    }
                } else {
                    this.f28762.m38654(this.f28764);
                }
            }
        }
    }
}
