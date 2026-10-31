package l;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: l.᩶᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C20453 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18231 f65946;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15575 f65948;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f65949;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Handler f65951;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6141 f65952;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC22569 f65953;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f65947 = 1.0f;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f65950 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46850(C20453 c20453, int i) {
        c20453.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                c20453.m46849(4);
                return;
            }
            InterfaceC22569 interfaceC22569 = c20453.f65953;
            if (interfaceC22569 != null) {
                ((C19936) interfaceC22569).m45998(0);
            }
            c20453.m46849(3);
            return;
        }
        if (i == -1) {
            InterfaceC22569 interfaceC225610 = c20453.f65953;
            if (interfaceC225610 != null) {
                ((C19936) interfaceC225610).m45998(-1);
            }
            c20453.m46851();
            c20453.m46849(1);
            return;
        }
        if (i != 1) {
            C8083.m21451(i, "Unknown focus change type: ");
            return;
        }
        c20453.m46849(2);
        InterfaceC22569 interfaceC225611 = c20453.f65953;
        if (interfaceC225611 != null) {
            ((C19936) interfaceC225611).m45998(1);
        }
    }

    public C20453(final Context context, Looper looper, InterfaceC22569 interfaceC22569) {
        this.f65952 = C2097.m6971(new InterfaceC6141() { // from class: l.᩸᩹֫
            @Override // l.InterfaceC6141
            public final Object get() {
                return C2171.m7181(context);
            }
        });
        this.f65953 = interfaceC22569;
        this.f65951 = new Handler(looper);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m46852() {
        return this.f65947;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46854(C18231 c18231) {
        if (C11003.equals(this.f65946, c18231)) {
            return;
        }
        this.f65946 = c18231;
        int i = c18231 == null ? 0 : 1;
        this.f65949 = i;
        C22632.m50630("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46855() {
        this.f65953 = null;
        m46851();
        m46849(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [l.ܶ᩹֫] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46853(int i, boolean z) {
        int i2;
        C20516 c20516M36709;
        if (i == 1 || (i2 = this.f65949) != 1) {
            m46851();
            m46849(0);
            return 1;
        }
        if (!z) {
            int i3 = this.f65950;
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        } else if (this.f65950 != 2) {
            C15575 c15575 = this.f65948;
            if (c15575 == null) {
                if (c15575 == null) {
                    c20516M36709 = new C20516(i2);
                } else {
                    c20516M36709 = c15575.m36709();
                }
                C18231 c18231 = this.f65946;
                c18231.getClass();
                c20516M36709.m46994(c18231);
                c20516M36709.m46995(false);
                c20516M36709.m46993(new AudioManager.OnAudioFocusChangeListener() { // from class: l.ܶ᩹֫
                    @Override // android.media.AudioManager.OnAudioFocusChangeListener
                    public final void onAudioFocusChange(int i4) {
                        C20453.m46850(this.f47412, i4);
                    }
                }, this.f65951);
                this.f65948 = c20516M36709.m46992();
            }
            if (C2171.m7184((AudioManager) this.f65952.get(), this.f65948) == 1) {
                m46849(2);
                return 1;
            }
            m46849(1);
            return -1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m46851() {
        int i = this.f65950;
        if (i == 1 || i == 0 || this.f65948 == null) {
            return;
        }
        C2171.m7183((AudioManager) this.f65952.get(), this.f65948);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46849(int i) {
        if (this.f65950 == i) {
            return;
        }
        this.f65950 = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f65947 == f) {
            return;
        }
        this.f65947 = f;
        InterfaceC22569 interfaceC22569 = this.f65953;
        if (interfaceC22569 != null) {
            ((C19936) interfaceC22569).m46017();
        }
    }
}
