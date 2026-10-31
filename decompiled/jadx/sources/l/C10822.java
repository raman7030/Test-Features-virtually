package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes3.dex */
public final class C10822 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Interpolator f32550;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21882 f32551;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f32552;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f32548 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1080 f32549 = new C1649(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f32547 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27057(C15530 c15530) {
        if (this.f32552) {
            return;
        }
        this.f32547.add(c15530);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27058(C15530 c15530, C15530 c15531) {
        ArrayList arrayList = this.f32547;
        arrayList.add(c15530);
        c15531.m36606(c15530.m36604());
        arrayList.add(c15531);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27061() {
        if (this.f32552) {
            return;
        }
        for (C15530 c15530 : this.f32547) {
            long j = this.f32548;
            if (j >= 0) {
                c15530.m36600(j);
            }
            Interpolator interpolator = this.f32550;
            if (interpolator != null) {
                c15530.m36601(interpolator);
            }
            if (this.f32551 != null) {
                c15530.m36602(this.f32549);
            }
            c15530.m36607();
        }
        this.f32552 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27059() {
        this.f32552 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27054() {
        if (this.f32552) {
            Iterator it = this.f32547.iterator();
            while (it.hasNext()) {
                ((C15530) it.next()).m36598();
            }
            this.f32552 = false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27060() {
        if (this.f32552) {
            return;
        }
        this.f32548 = 250L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27055(Interpolator interpolator) {
        if (this.f32552) {
            return;
        }
        this.f32550 = interpolator;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27056(C1080 c1080) {
        if (this.f32552) {
            return;
        }
        this.f32551 = c1080;
    }
}
