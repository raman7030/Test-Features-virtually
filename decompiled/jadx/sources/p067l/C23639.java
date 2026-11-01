package p067l;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ܺۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23639 extends AbstractC13919 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ۤ */
    public static final InterfaceC13820 f75254;

    /* JADX INFO: renamed from: ۫ */
    public static final C23639 f75255;

    /* JADX INFO: renamed from: ۗ */
    public byte f75256;

    /* JADX INFO: renamed from: ۙ */
    public C8041 f75257;

    /* JADX INFO: renamed from: ۬ */
    public List f75258;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f75259;

    /* JADX INFO: renamed from: ᩹ */
    public int f75260;

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        C14589 c14589 = new C14589(this);
        if ((this.f75260 & 2) != 0) {
            abstractC16402.mo37240(33, this.f75259);
        }
        if ((this.f75260 & 1) != 0) {
            abstractC16402.mo37251(34, m52593());
        }
        for (int i = 0; i < this.f75258.size(); i++) {
            abstractC16402.mo37251(EnumC5674.f13813, (InterfaceC10467) this.f75258.get(i));
        }
        c14589.m33381(536870912, abstractC16402);
        getUnknownFields().writeTo(abstractC16402);
    }

    static {
        C22006.m49606(EnumC8594.PUBLIC, C23639.class.getName());
        f75255 = new C23639();
        f75254 = new C16932();
    }

    public C23639(C22969 c22969) {
        super(c22969);
        this.f75259 = false;
        this.f75256 = (byte) -1;
    }

    public C23639() {
        this.f75259 = false;
        this.f75256 = (byte) -1;
        this.f75258 = Collections.EMPTY_LIST;
    }

    @Override // p067l.AbstractC6285
    public final C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C12539.f35209;
        c11650.m26787(C23639.class, C22969.class);
        return c11650;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m52591() {
        return (this.f75260 & 1) != 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C8041 m52593() {
        C8041 c8041 = this.f75257;
        return c8041 == null ? C8041.getDefaultInstance() : c8041;
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m52590() {
        return (this.f75260 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m52592() {
        return this.f75259;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        byte b = this.f75256;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m52591() || m52593().isInitialized()) {
            for (int i = 0; i < this.f75258.size(); i++) {
                if (!((C3821) this.f75258.get(i)).isInitialized()) {
                    this.f75256 = (byte) 0;
                    return false;
                }
            }
            if (!m31639()) {
                this.f75256 = (byte) 0;
                return false;
            }
            this.f75256 = (byte) 1;
            return true;
        }
        this.f75256 = (byte) 0;
        return false;
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM37227 = (this.f75260 & 2) != 0 ? AbstractC16402.m37227(33) : 0;
        if ((this.f75260 & 1) != 0) {
            iM37227 += AbstractC16402.m37229(34, m52593());
        }
        for (int i2 = 0; i2 < this.f75258.size(); i2++) {
            iM37227 += AbstractC16402.m37229(EnumC5674.f13813, (InterfaceC10467) this.f75258.get(i2));
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
        if (!(obj instanceof C23639)) {
            return super.equals(obj);
        }
        C23639 c23639 = (C23639) obj;
        if (m52591() != c23639.m52591()) {
            return false;
        }
        if ((!m52591() || m52593().equals(c23639.m52593())) && m52590() == c23639.m52590()) {
            return (!m52590() || this.f75259 == c23639.f75259) && this.f75258.equals(c23639.f75258) && getUnknownFields().equals(c23639.getUnknownFields()) && m31640().equals(c23639.m31640());
        }
        return false;
    }

    @Override // p067l.AbstractC10645
    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = C12539.f35191.hashCode() + 779;
        if (m52591()) {
            iHashCode = C6316.m14441(iHashCode, 37, 34, 53) + m52593().hashCode();
        }
        if (m52590()) {
            iHashCode = C6316.m14441(iHashCode, 37, 33, 53) + C15671.m35601(this.f75259);
        }
        if (this.f75258.size() > 0) {
            iHashCode = C6316.m14441(iHashCode, 37, EnumC5674.f13813, 53) + this.f75258.hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (AbstractC10645.m24463(iHashCode, m31640()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C22969 newBuilder() {
        return f75255.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return f75255.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 newBuilderForType() {
        return f75255.toBuilder();
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C22969 toBuilder() {
        int i = 0;
        if (this == f75255) {
            return new C22969(i);
        }
        C22969 c22969 = new C22969(i);
        c22969.m51293(this);
        return c22969;
    }

    @Override // p067l.AbstractC10645
    public final InterfaceC15830 newBuilderForType(InterfaceC11316 interfaceC11316) {
        return new C22969(interfaceC11316, 0);
    }

    public static C23639 getDefaultInstance() {
        return f75255;
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f75254;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f75255;
    }

    @Override // p067l.AbstractC13919, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return f75255;
    }
}
