package p067l;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.֫ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAJX */
/* JADX INFO: loaded from: classes2.dex */
public class C3831 extends C12549 {

    /* JADX INFO: renamed from: ֫ */
    public long f8208;

    @Override // p067l.C12549
    @InterfaceC1080
    public synchronized long getNativeInstance() {
        long nativeInstance;
        nativeInstance = this.f8208;
        if (nativeInstance == -1) {
            nativeInstance = super.getNativeInstance();
            this.f8208 = nativeInstance;
        }
        return nativeInstance;
    }

    public C3831(int i) {
        super(1);
        this.f8208 = -1L;
    }

    public C3831() {
        this.f8208 = -1L;
    }

    public C3831(C3831 c3831) {
        super(c3831);
        this.f8208 = -1L;
    }

    @Override // android.graphics.Paint
    public final void reset() {
        super.reset();
        this.f8208 = -1L;
    }

    @Override // android.graphics.Paint
    public final void set(Paint paint) {
        super.set(paint);
        this.f8208 = -1L;
    }

    @Override // android.graphics.Paint
    public final Shader setShader(Shader shader) {
        Shader shader2 = super.setShader(shader);
        this.f8208 = -1L;
        return shader2;
    }

    @Override // android.graphics.Paint
    public final ColorFilter setColorFilter(ColorFilter colorFilter) {
        ColorFilter colorFilter2 = super.setColorFilter(colorFilter);
        this.f8208 = -1L;
        return colorFilter2;
    }

    @Override // android.graphics.Paint
    public final Typeface setTypeface(Typeface typeface) {
        Typeface typeface2 = super.setTypeface(typeface);
        this.f8208 = -1L;
        return typeface2;
    }
}
