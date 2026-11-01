package p067l;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ۡ֨ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes3.dex */
public final class C10496 {

    /* JADX INFO: renamed from: ֫ */
    public Paint f29063;

    /* JADX INFO: renamed from: ۜ */
    public C18522 f29064;

    /* JADX INFO: renamed from: ۧ */
    public boolean f29065;

    /* JADX INFO: renamed from: ܳ */
    public C22015 f29066;

    /* JADX INFO: renamed from: ܽ */
    public boolean f29067;

    /* JADX INFO: renamed from: ܿ */
    public Paint f29068;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f29069;

    /* JADX INFO: renamed from: ᩻ */
    public C18522 f29070;

    public C10496() {
        Paint paint = new Paint();
        this.f29063 = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.f29068 = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f29066 = C22015.m49618();
    }

    public C10496(C10496 c10496) {
        this.f29065 = c10496.f29065;
        this.f29067 = c10496.f29067;
        this.f29063 = new Paint(c10496.f29063);
        this.f29068 = new Paint(c10496.f29068);
        C18522 c18522 = c10496.f29064;
        if (c18522 != null) {
            this.f29064 = new C18522(c18522);
        }
        C18522 c18523 = c10496.f29070;
        if (c18523 != null) {
            this.f29070 = new C18522(c18523);
        }
        this.f29069 = c10496.f29069;
        try {
            this.f29066 = (C22015) c10496.f29066.clone();
        } catch (CloneNotSupportedException unused) {
            this.f29066 = C22015.m49618();
        }
    }
}
