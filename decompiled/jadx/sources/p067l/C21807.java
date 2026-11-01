package p067l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩶᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21807 {

    /* JADX INFO: renamed from: ֫ */
    public C19695 f68622;

    /* JADX INFO: renamed from: ۧ */
    public C17170 f68624;

    /* JADX INFO: renamed from: ܳ */
    public int f68625;

    /* JADX INFO: renamed from: ܿ */
    public final Handler f68627;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC8205 f68628;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC23818 f68629;

    /* JADX INFO: renamed from: ۜ */
    public float f68623 = 1.0f;

    /* JADX INFO: renamed from: ܽ */
    public int f68626 = 0;

    /* JADX INFO: renamed from: ֫ */
    public static void m49173(C21807 c21807, int i) {
        c21807.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                c21807.m49172(4);
                return;
            }
            InterfaceC23818 interfaceC23818 = c21807.f68629;
            if (interfaceC23818 != null) {
                ((C21315) interfaceC23818).m48311(0);
            }
            c21807.m49172(3);
            return;
        }
        if (i == -1) {
            InterfaceC23818 interfaceC23819 = c21807.f68629;
            if (interfaceC23819 != null) {
                ((C21315) interfaceC23819).m48311(-1);
            }
            c21807.m49174();
            c21807.m49172(1);
            return;
        }
        if (i != 1) {
            C10050.m23419(i, "Unknown focus change type: ");
            return;
        }
        c21807.m49172(2);
        InterfaceC23818 interfaceC238110 = c21807.f68629;
        if (interfaceC238110 != null) {
            ((C21315) interfaceC238110).m48311(1);
        }
    }

    public C21807(final Context context, Looper looper, InterfaceC23818 interfaceC23818) {
        this.f68628 = C4362.m9097(new InterfaceC8205() { // from class: l.᩸᩹֫
            @Override // p067l.InterfaceC8205
            public final Object get() {
                return C4431.m9260(context);
            }
        });
        this.f68629 = interfaceC23818;
        this.f68627 = new Handler(looper);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m49175() {
        return this.f68623;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49177(C19695 c19695) {
        if (C12826.equals(this.f68622, c19695)) {
            return;
        }
        this.f68622 = c19695;
        int i = c19695 == null ? 0 : 1;
        this.f68625 = i;
        C23877.m52956("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49178() {
        this.f68629 = null;
        m49174();
        m49172(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [l.ܶ᩹֫] */
    /* JADX INFO: renamed from: ֫ */
    public final int m49176(int i, boolean z) {
        int i2;
        C21866 c21866M38870;
        if (i == 1 || (i2 = this.f68625) != 1) {
            m49174();
            m49172(0);
            return 1;
        }
        if (!z) {
            int i3 = this.f68626;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.f68626 != 2) {
            C17170 c17170 = this.f68624;
            if (c17170 == null) {
                if (c17170 == null) {
                    c21866M38870 = new C21866(i2);
                } else {
                    c21866M38870 = c17170.m38870();
                }
                C19695 c19695 = this.f68622;
                c19695.getClass();
                c21866M38870.m49317(c19695);
                c21866M38870.m49318(false);
                c21866M38870.m49316(new AudioManager.OnAudioFocusChangeListener() { // from class: l.ܶ᩹֫
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i4) {
                        C21807.m49173(this.f50544, i4);
                    }
                }, this.f68627);
                this.f68624 = c21866M38870.m49315();
            }
            if (C4431.m9263((AudioManager) this.f68628.get(), this.f68624) == 1) {
                m49172(2);
                return 1;
            }
            m49172(1);
            return -1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m49174() {
        int i = this.f68626;
        if (i == 1 || i == 0 || this.f68624 == null) {
            return;
        }
        C4431.m9262((AudioManager) this.f68628.get(), this.f68624);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49172(int i) {
        if (this.f68626 == i) {
            return;
        }
        this.f68626 = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f68623 == f) {
            return;
        }
        this.f68623 = f;
        InterfaceC23818 interfaceC23818 = this.f68629;
        if (interfaceC23818 != null) {
            ((C21315) interfaceC23818).m48330();
        }
    }
}
