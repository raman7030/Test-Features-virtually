package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes.dex */
public final class C23178 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9089 f74504;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f74505;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13132 f74506;

    public C23178(C5561 c5561, int i) {
        this.f74505 = i;
        C13132 c13132 = (C13132) c5561.f17216.m10216(R.layout.MT_Protector);
        this.f74506 = c13132;
        C9089 c9089 = new C9089(c5561, c13132, this);
        this.f74504 = c9089;
        c13132.setVerticalScrollBarEnabled(false);
        c13132.setAdapter(c9089);
        c13132.setOnClickListener(new View.OnClickListener() { // from class: l.ۨᩴܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23178.m51404(this.f35520);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51404(C23178 c23178) {
        C9089 c9089 = c23178.f74504;
        if (c9089.f27548) {
            c9089.m23463();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m51406(C23178 c23178) {
        c23178.f74506.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C6951 m51408(C23178 c23178) {
        return C9068.m23415(c23178.f74505);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51410() {
        try {
            return C9068.m23415(this.f74505).m18793();
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51411(C16828 c16828) {
        return C9068.m23415(this.f74505).m18780(c16828);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51412(int i) {
        C9068.m23415(this.f74505).m18782(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51413(int i, int i2) {
        try {
            C9068.m23415(this.f74505).m18783(i, i2);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m51414() {
        return C9068.m23415(this.f74505).m18794();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16828 m51415(int i) {
        return C9068.m23415(this.f74505).m18789(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51416() {
        return C9068.m23415(this.f74505).m18797();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51417(int i) {
        try {
            C9068.m23415(this.f74505).m18783(i, 0);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m51418() {
        C9068.m23415(this.f74505).m18796();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m51419() {
        return C9068.m23415(this.f74505).m18787();
    }
}
