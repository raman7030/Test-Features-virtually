package p067l;

import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩺ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes.dex */
public final class C24397 {

    /* JADX INFO: renamed from: ֫ */
    public final C11007 f77248;

    /* JADX INFO: renamed from: ۧ */
    public final int f77249;

    /* JADX INFO: renamed from: ܽ */
    public final C14849 f77250;

    public C24397(C7654 c7654, int i) {
        this.f77249 = i;
        C14849 c14849 = (C14849) c7654.f20056.m12252(R.layout.MT_Protector);
        this.f77250 = c14849;
        C11007 c11007 = new C11007(c7654, c14849, this);
        this.f77248 = c11007;
        c14849.setVerticalScrollBarEnabled(false);
        c14849.setAdapter(c11007);
        c14849.setOnClickListener(new View.OnClickListener() { // from class: l.ۨᩴܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C24397.m53800(this.f38530);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53800(C24397 c24397) {
        C11007 c11007 = c24397.f77248;
        if (c11007.f30485) {
            c11007.m25410();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static void m53802(C24397 c24397) {
        c24397.f77250.getAdapter().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ܿ */
    public static C8975 m53804(C24397 c24397) {
        return C10987.m25361(c24397.f77249);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53806() {
        try {
            return C10987.m25361(this.f77249).m20747();
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53807(C18362 c18362) {
        return C10987.m25361(this.f77249).m20734(c18362);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53808(int i) {
        C10987.m25361(this.f77249).m20736(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53809(int i, int i2) {
        try {
            C10987.m25361(this.f77249).m20737(i, i2);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m53810() {
        return C10987.m25361(this.f77249).m20748();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18362 m53811(int i) {
        return C10987.m25361(this.f77249).m20743(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m53812() {
        return C10987.m25361(this.f77249).m20751();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m53813(int i) {
        try {
            C10987.m25361(this.f77249).m20737(i, 0);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m53814() {
        C10987.m25361(this.f77249).m20750();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m53815() {
        return C10987.m25361(this.f77249).m20741();
    }
}
