package p067l;

import com.amazonaws.services.p061s3.model.DeleteObjectsRequest;
import com.amazonaws.services.p061s3.model.S3ObjectSummary;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4055 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f8928;

    public /* synthetic */ C4055(int i) {
        this.f8928 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f8928) {
            case 0:
                int i = C22161.f70085;
                return "invalid index into the constant_pool table";
            case 1:
                return ((InterfaceC19370) obj).getPath();
            case 2:
                int i2 = C9202.f24903;
                return new DeleteObjectsRequest.KeyVersion(((S3ObjectSummary) obj).m1824());
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
            case 6:
                return ((EnumC24233) obj).m53547();
            case 7:
                return (C11281) ((AbstractC13154) obj);
            default:
                return C7480.stream(((C20391) obj).f63044);
        }
    }
}
