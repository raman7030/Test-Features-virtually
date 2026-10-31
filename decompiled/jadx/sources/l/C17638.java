package l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: l.ܿ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U647 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17638 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f53921;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C7055 f53922;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f53923;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SharedPreferences.Editor f53924;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f53925;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f53926 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC11289 f53927;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f53928;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public SharedPreferences f53929;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC18344 f53930;

    public C17638(Context context) {
        this.f53921 = context;
        m41269(context.getPackageName() + "_preferences");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SharedPreferences m41265(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m41275() {
        long j;
        synchronized (this) {
            j = this.f53926;
            this.f53926 = 1 + j;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41269(String str) {
        this.f53923 = str;
        this.f53929 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final SharedPreferences m41276() {
        if (this.f53929 == null) {
            this.f53929 = this.f53921.getSharedPreferences(this.f53923, 0);
        }
        return this.f53929;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7055 m41278() {
        return this.f53922;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41274(C7055 c7055) {
        C7055 c7056 = this.f53922;
        if (c7055 == c7056) {
            return false;
        }
        if (c7056 != null) {
            c7056.mo6920();
        }
        this.f53922 = c7055;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2095 m41267(CharSequence charSequence) {
        C7055 c7055 = this.f53922;
        if (c7055 == null) {
            return null;
        }
        return c7055.m10700(charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SharedPreferences.Editor m41266() {
        if (this.f53928) {
            if (this.f53924 == null) {
                this.f53924 = m41276().edit();
            }
            return this.f53924;
        }
        return m41276().edit();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m41280() {
        return !this.f53928;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7055 m41268(Context context, int i, C7055 c7055) {
        this.f53928 = true;
        C7055 c7056 = (C7055) new C2116(context, this).m7015(i, c7055);
        c7056.m6900(this);
        SharedPreferences.Editor editor = this.f53924;
        if (editor != null) {
            editor.apply();
        }
        this.f53928 = false;
        return c7056;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41271(InterfaceC11289 interfaceC11289) {
        this.f53927 = interfaceC11289;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41270(AbstractC11079 abstractC11079) {
        InterfaceC11289 interfaceC11289 = this.f53927;
        if (interfaceC11289 != null) {
            interfaceC11289.mo8648(abstractC11079);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41273(InterfaceC18344 interfaceC18344) {
        this.f53930 = interfaceC18344;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18344 m41279() {
        return this.f53930;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41272(InterfaceC16932 interfaceC16932) {
        this.f53925 = interfaceC16932;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ܽ᩹ۧ] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16932 m41277() {
        return this.f53925;
    }
}
