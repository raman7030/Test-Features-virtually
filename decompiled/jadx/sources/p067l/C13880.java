package p067l;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13880 extends AbstractC10645 {

    /* JADX INFO: renamed from: ۗ */
    public final C11158 f39198;

    /* JADX INFO: renamed from: ۙ */
    public final C19244 f39199;

    /* JADX INFO: renamed from: ᩶ */
    public final C2479[] f39200;

    /* JADX INFO: renamed from: ᩸ */
    public final C20625 f39201;

    /* JADX INFO: renamed from: ᩹ */
    public int f39202 = -1;

    public C13880(C19244 c19244, C20625 c20625, C2479[] c2479Arr, C11158 c11158) {
        this.f39199 = c19244;
        this.f39201 = c20625;
        this.f39200 = c2479Arr;
        this.f39198 = c11158;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13880 m31582(C19244 c19244) {
        return new C13880(c19244, C20625.m46597(), new C2479[c19244.mo3533().m49079()], C11158.m25741());
    }

    @Override // p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return this.f39199;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return m31582(this.f39199);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return m31582(this.f39199);
    }

    @Override // p067l.InterfaceC5773
    public final Map getAllFields() {
        return this.f39201.m46615();
    }

    @Override // p067l.InterfaceC5773
    public final C11158 getUnknownFields() {
        return this.f39198;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        Iterator it = this.f39199.getFields().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C20625 c20625 = this.f39201;
            if (zHasNext) {
                C2479 c2479 = (C2479) it.next();
                if (c2479.m3529() && !c20625.m46613(c2479)) {
                    return false;
                }
            } else {
                return c20625.m46622();
            }
        }
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        boolean zM41616 = this.f39199.m43838().m41616();
        C11158 c11158 = this.f39198;
        C20625 c20625 = this.f39201;
        if (zM41616) {
            c20625.m46610(abstractC16402);
            c11158.m25744(abstractC16402);
        } else {
            c20625.m46616(abstractC16402);
            c11158.writeTo(abstractC16402);
        }
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final int getSerializedSize() {
        int iM46620;
        int serializedSize;
        int i = this.f39202;
        if (i != -1) {
            return i;
        }
        boolean zM41616 = this.f39199.m43838().m41616();
        C11158 c11158 = this.f39198;
        C20625 c20625 = this.f39201;
        if (zM41616) {
            iM46620 = c20625.m46618();
            serializedSize = c11158.m25746();
        } else {
            iM46620 = c20625.m46620();
            serializedSize = c11158.getSerializedSize();
        }
        int i2 = serializedSize + iM46620;
        this.f39202 = i2;
        return i2;
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final C14550 newBuilderForType() {
        return new C14550(this.f39199, 0);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC11138 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC24548) this);
    }

    @Override // p067l.AbstractC10645, p067l.InterfaceC10467
    public final InterfaceC15830 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC24548) this);
    }

    @Override // p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return new C6504(this);
    }

    @Override // p067l.InterfaceC5773
    public final Object getField(C2479 c2479) {
        if (c2479.m3545() == this.f39199) {
            Object objM46607 = this.f39201.m46607((InterfaceC19954) c2479);
            if (objM46607 != null) {
                return objM46607;
            }
            if (c2479.mo3530()) {
                return Collections.EMPTY_LIST;
            }
            if (c2479.m3539() == EnumC19915.MESSAGE) {
                return m31582(c2479.m3548());
            }
            return c2479.m3523();
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // p067l.InterfaceC5773
    public final boolean hasField(C2479 c2479) {
        if (c2479.m3545() == this.f39199) {
            return this.f39201.m46613(c2479);
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // p067l.AbstractC10645
    public final C2479 getOneofFieldDescriptor(C16561 c16561) {
        if (c16561.m37541() == this.f39199) {
            return this.f39200[c16561.m37539()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // p067l.AbstractC10645
    public final boolean hasOneof(C16561 c16561) {
        if (c16561.m37541() == this.f39199) {
            return this.f39200[c16561.m37539()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }
}
