package p067l;

import android.content.ContextWrapper;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۜܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8827 extends AbstractC5693 implements InterfaceC22239 {

    /* JADX INFO: renamed from: ᩴ */
    public final ContextWrapper f23963;

    /* JADX INFO: renamed from: ᩵ */
    public final int f23964;

    @Override // p067l.InterfaceC3681
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo11(C23128 c23128, AbstractC21787 abstractC21787, boolean z) {
        AbstractC4804 abstractC4804 = (AbstractC4804) abstractC21787;
        ByteBuffer byteBuffer = c23128.f72704;
        byteBuffer.getClass();
        C23877.m52960(byteBuffer.hasArray());
        C23877.m52957(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f23964;
            if (iMax == -1) {
                ContextWrapper contextWrapper = this.f23963;
                if (contextWrapper != null) {
                    Point pointM12994 = C5792.m12994(contextWrapper);
                    int i = pointM12994.x;
                    int i2 = pointM12994.y;
                    C10307 c10307 = c23128.f72703;
                    if (c10307 != null) {
                        int i3 = c10307.f28552;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = c10307.f28521;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            abstractC4804.f10895 = C5989.m13428(byteBuffer.remaining(), iMax, byteBuffer.array());
            abstractC4804.f68601 = c23128.f72706;
            return null;
        } catch (C10998 e) {
            return new C11510("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new C11510(e2);
        }
    }

    public C8827(ContextWrapper contextWrapper) {
        super(new C23128[1], new AbstractC4804[1]);
        this.f23963 = contextWrapper;
        this.f23964 = -1;
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ᩳ */
    public final C23128 mo16() {
        return new C23128(1, 0);
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC21787 mo15() {
        return new C16202(this);
    }

    @Override // p067l.AbstractC5693
    /* JADX INFO: renamed from: ֫ */
    public final C10387 mo10(Throwable th) {
        return new C11510("Unexpected decode error", th);
    }
}
