package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10899 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۛ */
    public static final C10899 f30199;

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f30200 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC13820 f30201;

    /* JADX INFO: renamed from: ۗ */
    public int f30202;

    /* JADX INFO: renamed from: ۙ */
    public C8041 f30203;

    /* JADX INFO: renamed from: ۫ */
    public List f30204;

    /* JADX INFO: renamed from: ۬ */
    public byte f30205;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f30206;

    /* JADX INFO: renamed from: ᩹ */
    public int f30207;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f30207 & 1) != 0) {
            abstractC16402.mo37240(33, this.f30206);
        }
        if ((this.f30207 & 2) != 0) {
            abstractC16402.mo37248(34, this.f30202);
        }
        if ((this.f30207 & 4) != 0) {
            abstractC16402.mo37251(35, m25140());
        }
        for (int i = 0; i < this.f30204.size(); i++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f30204.get(i));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C10899.class.getName());
        f30199 = new C10899();
        f30201 = new C24980();
    }

    public C10899(C8887 c8887) {
        super(c8887);
        this.f30206 = false;
        this.f30202 = 0;
        this.f30205 = (byte) -1;
    }

    public C10899() {
        this.f30206 = false;
        this.f30205 = (byte) -1;
        this.f30202 = 0;
        this.f30204 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35228;
        c11650.m26787(C10899.class, C8887.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m25138() {
        return (this.f30207 & 1) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m25139() {
        return this.f30206;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m25142() {
        return (this.f30207 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۖ */
    public final EnumC11570 m25137() {
        EnumC11570 enumC11570M26634 = EnumC11570.m26634(this.f30202);
        return enumC11570M26634 == null ? EnumC11570.IDEMPOTENCY_UNKNOWN : enumC11570M26634;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m25141() {
        return (this.f30207 & 4) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C8041 m25140() {
        C8041 c8041 = this.f30203;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f30205;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m25141() || m25140().isInitialized()) {
            for (int i = 0; i < this.f30204.size(); i++) {
                if (!((C3821) this.f30204.get(i)).isInitialized()) {
                    this.f30205 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f30205 = (byte) 0;
                return false;
            }
            this.f30205 = (byte) 1;
            return true;
        }
        this.f30205 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37227 = (this.f30207 & 1) != 0 ? AbstractC16402.m37227(33) : 0;
        if ((this.f30207 & 2) != 0) {
            iM37227 += AbstractC16402.m37226(34, this.f30202);
        }
        if ((this.f30207 & 4) != 0) {
            iM37227 += AbstractC16402.m37229(35, m25140());
        }
        for (int i2 = 0; i2 < this.f30204.size(); i2++) {
            iM37227 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f30204.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM37227 + m31642();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // p067l.AbstractC10645
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10899)) {
            return super.equals(obj);
        }
        C10899 c10899 = (C10899) obj;
        if (m25138() != c10899.m25138()) {
            return false;
        }
        if ((m25138() && this.f30206 != c10899.f30206) || m25142() != c10899.m25142()) {
            return false;
        }
        if ((!m25142() || this.f30202 == c10899.f30202) && m25141() == c10899.m25141()) {
            return (!m25141() || m25140().equals(c10899.m25140())) && this.f30204.equals(c10899.f30204) && getUnknownFields().equals(c10899.getUnknownFields()) && m31640().equals(c10899.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35211.hashCode() + 779;
        if (m25138()) {
            iHashCode = C6316.m14441(iHashCode, 37, 33, 53) + C15671.m35601(this.f30206);
        }
        if (m25142()) {
            iHashCode = C6316.m14441(iHashCode, 37, 34, 53) + this.f30202;
        }
        if (m25141()) {
            iHashCode = C6316.m14441(iHashCode, 37, 35, 53) + m25140().hashCode();
        }
        if (this.f30204.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f30204.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C8887 newBuilder() {
        return f30199.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f30199.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f30199.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C8887 toBuilder() {
        int i = 0;
        if (this == f30199) {
            return new C8887(i);
        }
        C8887 c8887 = new C8887(i);
        c8887.m20495(this);
        return c8887;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C8887(interfaceC11316, 0);
    }

    public static C10899 getDefaultInstance() {
        return f30199;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f30201;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f30199;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f30199;
    }
}
