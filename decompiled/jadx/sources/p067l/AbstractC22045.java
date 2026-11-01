package p067l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22045 extends AbstractC4610 implements InterfaceC15830 {
    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56044mergeFrom(AbstractC9303 abstractC9303) {
        return mergeFrom(abstractC9303, (C19283) C3860.f8347);
    }

    @Override // p067l.InterfaceC11138, p067l.InterfaceC15830
    public /* bridge */ /* synthetic */ InterfaceC10467 build() {
        return build();
    }

    @Override // p067l.InterfaceC11138, p067l.InterfaceC15830
    public /* bridge */ /* synthetic */ InterfaceC10467 buildPartial() {
        return buildPartial();
    }

    @Override // p067l.AbstractC4610, p067l.InterfaceC11138
    public /* bridge */ /* synthetic */ InterfaceC11138 mergeFrom(InterfaceC10467 interfaceC10467) {
        return super.mergeFrom(interfaceC10467);
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56039clone() {
        throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
    }

    public boolean hasOneof(C16561 c16561) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C2479 getOneofFieldDescriptor(C16561 c16561) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // 
    public AbstractC22045 clearOneof(C16561 c16561) {
        throw new UnsupportedOperationException("clearOneof() is not implemented.");
    }

    @Override // 
    public AbstractC22045 clear() {
        Iterator it = getAllFields().entrySet().iterator();
        while (it.hasNext()) {
            clearField((C2479) ((Map.Entry) it.next()).getKey());
        }
        return this;
    }

    public List findInitializationErrors() {
        return C9796.m22861(this);
    }

    public String getInitializationErrorString() {
        return C9796.m22860(findInitializationErrors());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC4610
    public AbstractC22045 internalMergeFrom(AbstractC5951 abstractC5951) {
        return mergeFrom((InterfaceC24548) abstractC5951);
    }

    @Override // p067l.InterfaceC15830
    public AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548) {
        return mergeFrom(interfaceC24548, interfaceC24548.getAllFields());
    }

    public AbstractC22045 mergeFrom(InterfaceC24548 interfaceC24548, Map map) {
        if (interfaceC24548.getDescriptorForType() != getDescriptorForType()) {
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }
        for (Map.Entry entry : map.entrySet()) {
            C2479 c2479 = (C2479) entry.getKey();
            if (c2479.mo3530()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    addRepeatedField(c2479, it.next());
                }
            } else if (c2479.m3539() == EnumC19915.MESSAGE) {
                InterfaceC24548 interfaceC24549 = (InterfaceC24548) getField(c2479);
                if (interfaceC24549 == interfaceC24549.getDefaultInstanceForType()) {
                    setField(c2479, entry.getValue());
                } else {
                    setField(c2479, interfaceC24549.newBuilderForType().mergeFrom(interfaceC24549).mergeFrom((InterfaceC24548) entry.getValue()).build());
                }
            } else {
                setField(c2479, entry.getValue());
            }
        }
        mergeUnknownFields(interfaceC24548.getUnknownFields());
        return this;
    }

    @Override // p067l.AbstractC4610, p067l.InterfaceC11138
    public AbstractC22045 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        int iMo21535;
        abstractC9303.getClass();
        C15850 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
        C20526 c20526 = new C20526(this);
        C19244 descriptorForType = getDescriptorForType();
        do {
            iMo21535 = abstractC9303.mo21535();
            if (iMo21535 == 0) {
                break;
            }
        } while (C9796.m22864(abstractC9303, unknownFieldSetBuilder, c19283, descriptorForType, c20526, iMo21535));
        if (unknownFieldSetBuilder != null) {
            setUnknownFieldSetBuilder(unknownFieldSetBuilder);
        }
        return this;
    }

    public C15850 getUnknownFieldSetBuilder() {
        C11158 unknownFields = getUnknownFields();
        int i = C11158.f30970;
        C15850 c15850M35968 = C15850.m35968();
        c15850M35968.m35974(unknownFields);
        return c15850M35968;
    }

    public void setUnknownFieldSetBuilder(C15850 c15850) {
        setUnknownFields(c15850.build());
    }

    @Override // 
    public AbstractC22045 mergeUnknownFields(C11158 c11158) {
        C11158 unknownFields = getUnknownFields();
        int i = C11158.f30970;
        C15850 c15850M35968 = C15850.m35968();
        c15850M35968.m35974(unknownFields);
        c15850M35968.m35974(c11158);
        setUnknownFields(c15850M35968.build());
        return this;
    }

    public InterfaceC15830 getFieldBuilder(C2479 c2479) {
        throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
    }

    public InterfaceC15830 getRepeatedFieldBuilder(C2479 c2479, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
    }

    public String toString() {
        int i = C13288.f37300;
        return C11947.f33325.m27350(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19204 m49645(InterfaceC24548 interfaceC24548) {
        ArrayList<String> arrayListM22861 = C9796.m22861(interfaceC24548);
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : arrayListM22861) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return new C19204(sb.toString());
    }

    public void markClean() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    public void dispose() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56042mergeFrom(AbstractC7962 abstractC7962) {
        return (AbstractC22045) super.mo56042mergeFrom(abstractC7962);
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56043mergeFrom(AbstractC7962 abstractC7962, C19283 c19283) {
        return (AbstractC22045) super.mo56043mergeFrom(abstractC7962, c19283);
    }

    @Override // p067l.AbstractC4610, p067l.InterfaceC11138
    public AbstractC22045 mergeFrom(byte[] bArr) {
        return (AbstractC22045) super.mergeFrom(bArr);
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56045mergeFrom(byte[] bArr, int i, int i2) {
        return (AbstractC22045) super.mo56045mergeFrom(bArr, i, i2);
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56047mergeFrom(byte[] bArr, C19283 c19283) {
        return (AbstractC22045) super.mo56047mergeFrom(bArr, c19283);
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56046mergeFrom(byte[] bArr, int i, int i2, C19283 c19283) {
        return (AbstractC22045) super.mo56046mergeFrom(bArr, i, i2, c19283);
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56040mergeFrom(InputStream inputStream) {
        return (AbstractC22045) super.mo56040mergeFrom(inputStream);
    }

    @Override // p067l.AbstractC4610
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC22045 mo56041mergeFrom(InputStream inputStream, C19283 c19283) {
        return (AbstractC22045) super.mo56041mergeFrom(inputStream, c19283);
    }
}
