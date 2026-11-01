package p067l;

/* JADX INFO: renamed from: l.۟᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5E7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9737 extends AbstractC7666 {

    /* JADX INFO: renamed from: ۬ */
    public String f26894;

    public C9737(AbstractC10348[] abstractC10348Arr, String str) {
        super(EnumC3642.FILLED_ARRAY, abstractC10348Arr);
        this.f26894 = str;
    }

    @Override // p067l.AbstractC7666, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C9737(m17751(), this.f26894);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C9737(m17752(c3702), this.f26894);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        AbstractC10348[] abstractC10348Arr;
        StringBuilder sbM17248 = C7470.m17248("new ");
        sbM17248.append(C2805.m4425(this.f26894));
        sbM17248.append("[]{");
        int i = 0;
        while (true) {
            abstractC10348Arr = this.f20109;
            if (i >= abstractC10348Arr.length) {
                break;
            }
            sbM17248.append(abstractC10348Arr[i]);
            sbM17248.append(", ");
            i++;
        }
        if (abstractC10348Arr.length > 0) {
            sbM17248.setLength(sbM17248.length() - 2);
        }
        sbM17248.append('}');
        return sbM17248.toString();
    }
}
