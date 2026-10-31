package l;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.֫ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAJX */
/* JADX INFO: loaded from: classes2.dex */
public class C1539 extends C10712 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f5426;

    @Override // l.C10712
    @InterfaceC4801
    public synchronized long getNativeInstance() {
        long nativeInstance;
        nativeInstance = this.f5426;
        if (nativeInstance == -1) {
            nativeInstance = super.getNativeInstance();
            this.f5426 = nativeInstance;
        }
        return nativeInstance;
    }

    public C1539(int i) {
        super(1);
        this.f5426 = -1L;
    }

    public C1539() {
        this.f5426 = -1L;
    }

    public C1539(C1539 c1539) {
        super(c1539);
        this.f5426 = -1L;
    }

    @Override // android.graphics.Paint
    public final void reset() {
        super.reset();
        this.f5426 = -1L;
    }

    @Override // android.graphics.Paint
    public final void set(Paint paint) {
        super.set(paint);
        this.f5426 = -1L;
    }

    @Override // android.graphics.Paint
    public final Shader setShader(Shader shader) {
        Shader shader2 = super.setShader(shader);
        this.f5426 = -1L;
        return shader2;
    }

    @Override // android.graphics.Paint
    public final ColorFilter setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = super.setColorFilter(colorFilter);
        this.f5426 = -1L;
        return colorFilter2;
    }

    @Override // android.graphics.Paint
    public final Typeface setTypeface(Typeface typeface) {
        Typeface typeface2 = super.setTypeface(typeface);
        this.f5426 = -1L;
        return typeface2;
    }
}
