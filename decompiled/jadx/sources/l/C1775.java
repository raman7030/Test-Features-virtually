package l;

import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1775 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6153;

    public /* synthetic */ C1775(int i) {
        this.f6153 = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f6153) {
            case 0:
                int i = C20826.f67402;
                return "invalid index into the constant_pool table";
            case 1:
                return ((InterfaceC17889) obj).getPath();
            case 2:
                int i2 = C7190.f22025;
                return new DeleteObjectsRequest.KeyVersion(((S3ObjectSummary) obj).m659());
            case 3:
                return ((DynamicScheme) obj).tertiaryPalette;
            case 4:
                return ((DynamicScheme) obj).neutralPalette;
            case 5:
                return MaterialDynamicColors.lambda$textHintInverse$161((DynamicScheme) obj);
            case 6:
                return ((EnumC23006) obj).m51154();
            case 7:
                return (C9378) ((AbstractC11349) obj);
            default:
                return C5378.stream(((C18963) obj).f59815);
        }
    }
}
