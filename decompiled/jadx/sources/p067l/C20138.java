package p067l;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: l.ᩴۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5XC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20138 {

    /* JADX INFO: renamed from: ֡ */
    public float f62330;

    /* JADX INFO: renamed from: ֨ */
    public float f62331;

    /* JADX INFO: renamed from: ֫ */
    public int f62332;

    /* JADX INFO: renamed from: ۖ */
    public float f62333;

    /* JADX INFO: renamed from: ۘ */
    public float f62334;

    /* JADX INFO: renamed from: ۚ */
    public float f62335;

    /* JADX INFO: renamed from: ۜ */
    public int f62336;

    /* JADX INFO: renamed from: ۠ */
    public float f62337;

    /* JADX INFO: renamed from: ۡ */
    public float f62338;

    /* JADX INFO: renamed from: ۢ */
    public int f62339;

    /* JADX INFO: renamed from: ۧ */
    public Path f62340;

    /* JADX INFO: renamed from: ܳ */
    public int f62341;

    /* JADX INFO: renamed from: ܶ */
    public final RectF f62342 = new RectF();

    /* JADX INFO: renamed from: ܺ */
    public final Paint f62343;

    /* JADX INFO: renamed from: ܽ */
    public int f62344;

    /* JADX INFO: renamed from: ܿ */
    public float f62345;

    /* JADX INFO: renamed from: ᩳ */
    public final Paint f62346;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f62347;

    /* JADX INFO: renamed from: ᩵ */
    public float f62348;

    /* JADX INFO: renamed from: ᩷ */
    public int[] f62349;

    /* JADX INFO: renamed from: ᩻ */
    public final Paint f62350;

    public C20138() {
        Paint paint = new Paint();
        this.f62343 = paint;
        Paint paint2 = new Paint();
        this.f62346 = paint2;
        Paint paint3 = new Paint();
        this.f62350 = paint3;
        this.f62348 = 0.0f;
        this.f62338 = 0.0f;
        this.f62334 = 0.0f;
        this.f62337 = 5.0f;
        this.f62345 = 1.0f;
        this.f62332 = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45578(int i) {
        this.f62336 = i;
        this.f62339 = this.f62349[i];
    }
}
