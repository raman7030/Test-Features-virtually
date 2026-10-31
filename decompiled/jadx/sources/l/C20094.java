package l;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.alipay.sdk.m.t0.b;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: l.᩶ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BPK */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20094 implements InterfaceC7961, InterfaceC23049, ShapeAppearanceModel.CornerSizeUnaryOperator, InterfaceC22775 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f65072;

    public /* synthetic */ C20094(int i) {
        this.f65072 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46314(int i, int i2, int i3, int i4) {
        return ((i + i2) * i3) + i4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46315(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static StringBuilder m46316(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12136 m46318(C3917 c3917, long j, String str, Object[] objArr) {
        c3917.mo9065(j, str, objArr);
        C12136 c12136 = new C12136();
        c12136.m29561();
        return c12136;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46319(Cursor cursor) throws Exception {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            C12397.m30566((ExecutorService) cursor);
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

    @Override // l.InterfaceC23049
    /* JADX INFO: renamed from: ֫ */
    public int mo2075(String str, boolean z) {
        C8817 c8817 = C13876.f41361;
        return 1;
    }

    @Override // l.InterfaceC22775
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11487 mo32166(C4844 c4844) {
        return new C23188(c4844);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        switch (this.f65072) {
            case 3:
                ((InterfaceC0612) obj).mo2503(C18273.m42604(new C4413("Player release timed out."), b.d));
                break;
            default:
                ((InterfaceC1131) obj).getClass();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Comparator m46317(InterfaceC4571 interfaceC4571, Comparator comparator) {
        return comparator instanceof InterfaceC4571 ? interfaceC4571.mo9674((InterfaceC4571) comparator) : C8200.$default$thenComparing(interfaceC4571, comparator);
    }
}
