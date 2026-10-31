package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩹ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAMH */
/* JADX INFO: loaded from: classes.dex */
public class C22315 extends C13142 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2500 f72332;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Window f72333;

    public C22315(Window window, C2500 c2500) {
        this.f72333 = window;
        this.f72332 = c2500;
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ܽ */
    public final void mo10013(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m50055(4);
                    this.f72333.clearFlags(1024);
                } else if (i2 == 2) {
                    m50055(2);
                } else if (i2 == 8) {
                    this.f72332.m7998();
                }
            }
        }
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ֫ */
    public final void mo10008(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    m50056(4);
                } else if (i2 == 2) {
                    m50056(2);
                } else if (i2 == 8) {
                    this.f72332.m7997();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m50056(int i) {
        View decorView = this.f72333.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m50055(int i) {
        View decorView = this.f72333.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // l.C13142
    /* JADX INFO: renamed from: ۧ */
    public final void mo10011(int i) {
        if (i == 0) {
            m50055(6144);
            return;
        }
        if (i == 1) {
            m50055(4096);
            m50056(2048);
        } else {
            if (i != 2) {
                return;
            }
            m50055(2048);
            m50056(4096);
        }
    }
}
