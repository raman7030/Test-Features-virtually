package p067l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩹ܰ */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes.dex */
public class C1949 extends C1494 {

    /* JADX INFO: renamed from: ֫ */
    public final C0966 f75058;

    /* JADX INFO: renamed from: ۧ */
    public final Window f75059;

    public C1949(Window window, C0966 c0966) {
        this.f75059 = window;
        this.f75058 = c0966;
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ܽ */
    public final void mo12046(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m52386(4);
                    this.f75059.clearFlags(1024);
                } else if (i2 == 2) {
                    m52386(2);
                } else if (i2 == 8) {
                    this.f75058.m10046();
                }
            }
        }
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ֫ */
    public final void mo12041(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m52387(4);
                } else if (i2 == 2) {
                    m52387(2);
                } else if (i2 == 8) {
                    this.f75058.m10045();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m52387(int i) {
        View decorView = this.f75059.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m52386(int i) {
        View decorView = this.f75059.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // p067l.C1494
    /* JADX INFO: renamed from: ۧ */
    public final void mo12044(int i) {
        if (i == 0) {
            m52386(6144);
            return;
        }
        if (i == 1) {
            m52386(4096);
            m52387(2048);
        } else {
            if (i != 2) {
                return;
            }
            m52386(2048);
            m52387(4096);
        }
    }
}
