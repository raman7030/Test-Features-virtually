package l;

import android.os.Looper;

/* JADX INFO: renamed from: l.ۧۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: I7U9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10784 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f32436;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f32437;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f32438;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f32439;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1611 f32440;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f32441;

    public C10784(Object obj, Looper looper, Looper looper2, C14185 c14185, InterfaceC1611 interfaceC1611) {
        this.f32436 = c14185.mo33832(looper, null);
        this.f32439 = c14185.mo33832(looper2, null);
        this.f32441 = obj;
        this.f32437 = obj;
        this.f32440 = interfaceC1611;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26986(InterfaceC16724 interfaceC16724, InterfaceC16724 interfaceC16725) {
        C22632.m50634(Looper.myLooper() == this.f32439.mo17764());
        this.f32438++;
        m26985((Runnable) new RunnableC20923(1, this, interfaceC16725));
        Object objApply = interfaceC16724.apply(this.f32441);
        Object obj = this.f32441;
        this.f32441 = objApply;
        if (obj.equals(objApply)) {
            return;
        }
        this.f32440.mo5475(obj, objApply);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26982(C10784 c10784, InterfaceC16724 interfaceC16724) {
        Object objApply = interfaceC16724.apply(c10784.f32437);
        c10784.f32437 = objApply;
        RunnableC6061 runnableC6061 = new RunnableC6061(1, c10784, objApply);
        InterfaceC19251 interfaceC19251 = c10784.f32439;
        if (interfaceC19251.mo17764().getThread().isAlive()) {
            interfaceC19251.mo17760(runnableC6061);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26983(C10784 c10784, Object obj) {
        int i = c10784.f32438 - 1;
        c10784.f32438 = i;
        if (i == 0) {
            Object obj2 = c10784.f32441;
            c10784.f32441 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c10784.f32440.mo5475(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26984(Object obj) {
        this.f32437 = obj;
        RunnableC18175 runnableC18175 = new RunnableC18175(1, this, obj);
        InterfaceC19251 interfaceC19251 = this.f32439;
        if (interfaceC19251.mo17764().getThread().isAlive()) {
            interfaceC19251.mo17760(runnableC18175);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26981(C10784 c10784, Object obj) {
        if (c10784.f32438 == 0) {
            Object obj2 = c10784.f32441;
            c10784.f32441 = obj;
            if (obj2.equals(obj)) {
                return;
            }
            c10784.f32440.mo5475(obj2, obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26985(Runnable runnable) {
        InterfaceC19251 interfaceC19251 = this.f32436;
        if (interfaceC19251.mo17764().getThread().isAlive()) {
            interfaceC19251.mo17760(runnable);
        }
    }
}
