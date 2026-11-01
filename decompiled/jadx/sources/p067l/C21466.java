package p067l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.alipay.sdk.p010m.p050t0.C0215b;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩶ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BPK */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21466 implements InterfaceC9934, InterfaceC24274, ShapeAppearanceModel.CornerSizeUnaryOperator, InterfaceC24013 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f67712;

    public /* synthetic */ C21466(int i) {
        this.f67712 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m48630(int i, int i2, int i3, int i4) {
        return ((i + i2) * i3) + i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m48631(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static StringBuilder m48632(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13902 m48634(C6091 c6091, long j, String str, Object[] objArr) {
        c6091.mo11117(j, str, objArr);
        C13902 c13902 = new C13902();
        c13902.m31626();
        return c13902;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m48635(Cursor cursor) throws Exception {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            C1457.m32630((ExecutorService) cursor);
            return;
        }
        if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
            return;
        }
        if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
            return;
        }
        if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
        } else if (cursor instanceof DrmManagerClient) {
            ((DrmManagerClient) cursor).release();
        } else {
            if (!(cursor instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) cursor).release();
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }

    @Override // p067l.InterfaceC24274
    /* JADX INFO: renamed from: ֫ */
    public int mo4456(String str, boolean z) {
        C10748 c10748 = C15556.f44442;
        return 1;
    }

    @Override // p067l.InterfaceC24013
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC13285 mo34265(C6972 c6972) {
        return new C24406(c6972);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        switch (this.f67712) {
            case 3:
                ((InterfaceC2950) obj).mo4859(C19735.m44863(new C6562("Player release timed out."), C0215b.f1001d));
                break;
            default:
                ((InterfaceC3443) obj).getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Comparator m48633(InterfaceC6713 interfaceC6713, Comparator comparator) {
        return comparator instanceof InterfaceC6713 ? interfaceC6713.mo11718((InterfaceC6713) comparator) : C10162.$default$thenComparing(interfaceC6713, comparator);
    }
}
