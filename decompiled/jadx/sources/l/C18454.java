package l;

/* JADX INFO: renamed from: l.ᩴ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18454 extends AbstractDialogInterfaceOnClickListenerC22687 {

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f57233;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f57234;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5048[] f57235;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18454(AbstractActivityC3346 abstractActivityC3346, C5048[] c5048Arr, boolean[] zArr) {
        super(abstractActivityC3346);
        this.f57235 = c5048Arr;
        this.f57234 = zArr;
        this.f57233 = 0;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC22687
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3443() {
        int i = this.f57233;
        C5048[] c5048Arr = this.f57235;
        C5048 c5048 = c5048Arr[i];
        String str = c5048.f15877;
        String str2 = c5048.f15877;
        C11003.requireNonNull(str);
        C11003.requireNonNull(c5048.f15878);
        if (!this.f57234[0]) {
            m50703(str2, c5048.f15878);
        } else {
            m50703(c5048.f15878, str2);
        }
        int i2 = this.f57233 + 1;
        this.f57233 = i2;
        return i2 < c5048Arr.length;
    }
}
