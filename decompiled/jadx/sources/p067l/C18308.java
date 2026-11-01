package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18308 extends AbstractC4938 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EnumC21702 f54674c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Predicate f54675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18308(EnumC21702 enumC21702, Predicate predicate) {
        super(enumC21702);
        this.f54674c = enumC21702;
        this.f54675d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f11241a) {
            return;
        }
        boolean zTest = this.f54675d.test(obj);
        EnumC21702 enumC21702 = this.f54674c;
        if (zTest == enumC21702.f68337a) {
            this.f11241a = true;
            this.f11242b = enumC21702.f68338b;
        }
    }
}
