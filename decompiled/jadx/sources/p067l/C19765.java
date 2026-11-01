package p067l;

/* JADX INFO: renamed from: l.ᩳ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4P7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19765 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC12548 f60124;

    public C19765(InterfaceC12548 interfaceC12548) {
        super(4, (interfaceC12548.size() * 2) + 4);
        this.f60124 = interfaceC12548;
    }

    public final int hashCode() {
        C15600 c15600 = C15600.f44675;
        InterfaceC12548 interfaceC12548 = this.f60124;
        int size = interfaceC12548.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + interfaceC12548.getType(i).hashCode();
        }
        return iHashCode;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_TYPE_LIST;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        C18423 c18423M7862 = c3948.m7862();
        InterfaceC12548 interfaceC12548 = this.f60124;
        int size = interfaceC12548.size();
        for (int i = 0; i < size; i++) {
            c18423M7862.m41992(interfaceC12548.getType(i));
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        throw new RuntimeException("unsupported");
    }

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC12548 m44904() {
        return this.f60124;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        C18423 c18423M7862 = c3948.m7862();
        InterfaceC12548 interfaceC12548 = this.f60124;
        int size = interfaceC12548.size();
        if (c19705.m44765()) {
            c19705.m44760(0, m11433() + " type_list");
            c19705.m44760(4, "  size: ".concat(C16351.m37155(size)));
            for (int i = 0; i < size; i++) {
                C9566 type = interfaceC12548.getType(i);
                c19705.m44760(2, EnumC2483.f3919 + C16351.m37153(c18423M7862.m41988(type)) + " // " + type.mo4819());
            }
        }
        c19705.m44773(size);
        for (int i2 = 0; i2 < size; i2++) {
            c19705.m44770(c18423M7862.m41988(interfaceC12548.getType(i2)));
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ֫ */
    public final int mo5190(AbstractC5289 abstractC5289) {
        InterfaceC12548 interfaceC12548 = ((C19765) abstractC5289).f60124;
        C15600 c15600 = C15600.f44675;
        InterfaceC12548 interfaceC12549 = this.f60124;
        int size = interfaceC12549.size();
        int size2 = interfaceC12548.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = interfaceC12549.getType(i).compareTo(interfaceC12548.getType(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }
}
