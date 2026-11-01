package p067l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: l.ܿ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U647 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19132 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f57114;

    /* JADX INFO: renamed from: ۜ */
    public C9074 f57115;

    /* JADX INFO: renamed from: ۢ */
    public String f57116;

    /* JADX INFO: renamed from: ۧ */
    public SharedPreferences.Editor f57117;

    /* JADX INFO: renamed from: ܳ */
    public Object f57118;

    /* JADX INFO: renamed from: ܽ */
    public long f57119 = 0;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC13098 f57120;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f57121;

    /* JADX INFO: renamed from: ᩷ */
    public SharedPreferences f57122;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC19803 f57123;

    public C19132(Context context) {
        this.f57114 = context;
        m43515(context.getPackageName() + "_preferences");
    }

    /* JADX INFO: renamed from: ֫ */
    public static SharedPreferences m43511(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m43521() {
        long j;
        synchronized (this) {
            j = this.f57119;
            this.f57119 = 1 + j;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43515(String str) {
        this.f57116 = str;
        this.f57122 = null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final SharedPreferences m43522() {
        if (this.f57122 == null) {
            this.f57122 = this.f57114.getSharedPreferences(this.f57116, 0);
        }
        return this.f57122;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C9074 m43524() {
        return this.f57115;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m43520(C9074 c9074) {
        C9074 c9075 = this.f57115;
        if (c9074 == c9075) {
            return false;
        }
        if (c9075 != null) {
            c9075.mo9046();
        }
        this.f57115 = c9074;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4360 m43513(CharSequence charSequence) {
        C9074 c9074 = this.f57115;
        if (c9074 == null) {
            return null;
        }
        return c9074.m12695(charSequence);
    }

    /* JADX INFO: renamed from: ֫ */
    public final SharedPreferences.Editor m43512() {
        if (this.f57121) {
            if (this.f57117 == null) {
                this.f57117 = m43522().edit();
            }
            return this.f57117;
        }
        return m43522().edit();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m43526() {
        return !this.f57121;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9074 m43514(Context context, int i, C9074 c9074) {
        this.f57121 = true;
        C9074 c9075 = (C9074) new C4380(context, this).m9126(i, c9074);
        c9075.m9026(this);
        SharedPreferences.Editor editor = this.f57117;
        if (editor != null) {
            editor.apply();
        }
        this.f57121 = false;
        return c9075;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43517(InterfaceC13098 interfaceC13098) {
        this.f57120 = interfaceC13098;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43516(AbstractC12898 abstractC12898) {
        InterfaceC13098 interfaceC13098 = this.f57120;
        if (interfaceC13098 != null) {
            interfaceC13098.mo10708(abstractC12898);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43519(InterfaceC19803 interfaceC19803) {
        this.f57123 = interfaceC19803;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC19803 m43525() {
        return this.f57123;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43518(InterfaceC18461 interfaceC18461) {
        this.f57118 = interfaceC18461;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ܽ᩹ۧ] */
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC18461 m43523() {
        return this.f57118;
    }
}
