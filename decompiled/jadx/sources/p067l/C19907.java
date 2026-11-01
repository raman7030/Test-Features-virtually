package p067l;

/* JADX INFO: renamed from: l.ᩴ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19907 extends AbstractDialogInterfaceOnClickListenerC23930 {

    /* JADX INFO: renamed from: ܽ֫ */
    public int f60451;

    /* JADX INFO: renamed from: ܿ֫ */
    public final /* synthetic */ boolean[] f60452;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ C7166[] f60453;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19907(AbstractActivityC5549 abstractActivityC5549, C7166[] c7166Arr, boolean[] zArr) {
        super(abstractActivityC5549);
        this.f60453 = c7166Arr;
        this.f60452 = zArr;
        this.f60451 = 0;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC23930
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5746() {
        int i = this.f60451;
        C7166[] c7166Arr = this.f60453;
        C7166 c7166 = c7166Arr[i];
        String str = c7166.f18709;
        String str2 = c7166.f18709;
        C12826.requireNonNull(str);
        C12826.requireNonNull(c7166.f18710);
        if (!this.f60452[0]) {
            m53029(str2, c7166.f18710);
        } else {
            m53029(c7166.f18710, str2);
        }
        int i2 = this.f60451 + 1;
        this.f60451 = i2;
        return i2 < c7166Arr.length;
    }
}
