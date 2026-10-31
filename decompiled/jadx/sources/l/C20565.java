package l;

import android.os.SystemClock;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩷֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20565 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f66239;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f66240;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f66241;

    public C20565(C7864 c7864, String str) {
        this.f66241 = c7864;
        this.f66239 = str;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        C7864 c7864 = this.f66241;
        c7864.f24374.m30314(c7864.f24384, true, false);
        c7864.f24382 = true;
        c7864.f24376 = false;
        c7864.f24369.m36677(".xml");
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C19401 {
        C7864 c7864 = this.f66241;
        c7864.f24372.m29734();
        if (c7864.f24385) {
            C11005 c11005M34233 = c7864.m34233(c7864.f24368.m36268());
            if (c11005M34233.m27336()) {
                try {
                    if (C7864.m21078(c7864, C12951.m31485(c11005M34233.m27337()))) {
                        this.f66240 = true;
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c7864.f24385) {
                String strM44856 = c7864.f24368.m44856(this.f66239);
                if (c7864.f24385) {
                    C12392 c12392 = c7864.f24374;
                    c12392.m30337(c7864.m34236(c7864.f24368.m36268()).m27340(), strM44856);
                    while (c7864.f24385 && c12392.m30370()) {
                        SystemClock.sleep(10L);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C7864 c7864 = this.f66241;
        if (c7864.f24385) {
            if (this.f66240) {
                c7864.f24374.m30410();
                if (c7864.f24377 != null) {
                    c7864.f24377.setEnabled(!c7864.f24374.m30441());
                    c7864.f24380.setChecked(c7864.f24374.m30441());
                }
                C7864.m21110(c7864);
                c7864.f24374.invalidate();
            } else {
                c7864.f24374.m30360();
                c7864.f24374.m30456(false);
                c7864.f24374.m30303();
            }
            c7864.f43260.putBoolean("changed", c7864.f24374.m30297());
            try {
                c7864.m34239(c7864.f24368.m36268());
            } catch (IOException unused) {
            }
            C4925.m14316(new Runnable() { // from class: l.ۜ֫ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C7864 c7865 = this.f19937.f66241;
                    c7865.f24378 = true;
                    if (c7865.f24385) {
                        C7864.m21114(c7865);
                    }
                }
            }, 200L);
            c7864.m21115();
            c7864.f24374.requestFocus();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C7864 c7864 = this.f66241;
        c7864.f24386.m11384((Throwable) exc);
        c7864.f24376 = true;
        if (c7864.f24385) {
            c7864.f24374.mo25910((CharSequence) exc.toString());
            c7864.f24374.m30407(true);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C7864 c7864 = this.f66241;
        if (c7864.f24385) {
            c7864.f24374.m30314(c7864.f24384, false, !c7864.f24376);
        }
        c7864.f24382 = false;
        c7864.f24375 = true;
    }
}
