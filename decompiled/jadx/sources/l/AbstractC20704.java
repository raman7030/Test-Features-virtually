package l;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9Q4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20704 extends AbstractC2359 implements InterfaceC14165 {
    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7675mergeFrom(AbstractC7297 abstractC7297) {
        return mergeFrom(abstractC7297, (C17798) C1570.f5566);
    }

    @Override // l.InterfaceC9228, l.InterfaceC14165
    public /* bridge */ /* synthetic */ InterfaceC8522 build() {
        return build();
    }

    @Override // l.InterfaceC9228, l.InterfaceC14165
    public /* bridge */ /* synthetic */ InterfaceC8522 buildPartial() {
        return buildPartial();
    }

    @Override // l.AbstractC2359, l.InterfaceC9228
    public /* bridge */ /* synthetic */ InterfaceC9228 mergeFrom(InterfaceC8522 interfaceC8522) {
        return super.mergeFrom(interfaceC8522);
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7670clone() {
        throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
    }

    public boolean hasOneof(C14934 c14934) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public C0117 getOneofFieldDescriptor(C14934 c14934) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    @Override // 
    public AbstractC20704 clearOneof(C14934 c14934) {
        throw new UnsupportedOperationException("clearOneof() is not implemented.");
    }

    @Override // 
    public AbstractC20704 clear() {
        Iterator it = getAllFields().entrySet().iterator();
        while (it.hasNext()) {
            clearField((C0117) ((Map.Entry) it.next()).getKey());
        }
        return this;
    }

    public List findInitializationErrors() {
        return C7816.m20896(this);
    }

    public String getInitializationErrorString() {
        return C7816.m20895(findInitializationErrors());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC2359
    public AbstractC20704 internalMergeFrom(AbstractC3770 abstractC3770) {
        return mergeFrom((InterfaceC23338) abstractC3770);
    }

    @Override // l.InterfaceC14165
    public AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338) {
        return mergeFrom(interfaceC23338, interfaceC23338.getAllFields());
    }

    public AbstractC20704 mergeFrom(InterfaceC23338 interfaceC23338, Map map) {
        if (interfaceC23338.getDescriptorForType() != getDescriptorForType()) {
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }
        for (Map.Entry entry : map.entrySet()) {
            C0117 c0117 = (C0117) entry.getKey();
            if (c0117.mo1129()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    addRepeatedField(c0117, it.next());
                }
            } else if (c0117.m1138() == EnumC18463.MESSAGE) {
                InterfaceC23338 interfaceC23339 = (InterfaceC23338) getField(c0117);
                if (interfaceC23339 == interfaceC23339.getDefaultInstanceForType()) {
                    setField(c0117, entry.getValue());
                } else {
                    setField(c0117, interfaceC23339.newBuilderForType().mergeFrom(interfaceC23339).mergeFrom((InterfaceC23338) entry.getValue()).build());
                }
            } else {
                setField(c0117, entry.getValue());
            }
        }
        mergeUnknownFields(interfaceC23338.getUnknownFields());
        return this;
    }

    @Override // l.AbstractC2359, l.InterfaceC9228
    public AbstractC20704 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        int iMo19567;
        abstractC7297.getClass();
        C14186 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
        C19106 c19106 = new C19106(this);
        C17757 descriptorForType = getDescriptorForType();
        do {
            iMo19567 = abstractC7297.mo19567();
            if (iMo19567 == 0) {
                break;
            }
        } while (C7816.m20899(abstractC7297, unknownFieldSetBuilder, c17798, descriptorForType, c19106, iMo19567));
        if (unknownFieldSetBuilder != null) {
            setUnknownFieldSetBuilder(unknownFieldSetBuilder);
        }
        return this;
    }

    public C14186 getUnknownFieldSetBuilder() {
        C9249 unknownFields = getUnknownFields();
        int i = C9249.f28024;
        C14186 c14186M33836 = C14186.m33836();
        c14186M33836.m33842(unknownFields);
        return c14186M33836;
    }

    public void setUnknownFieldSetBuilder(C14186 c14186) {
        setUnknownFields(c14186.build());
    }

    @Override // 
    public AbstractC20704 mergeUnknownFields(C9249 c9249) {
        C9249 unknownFields = getUnknownFields();
        int i = C9249.f28024;
        C14186 c14186M33836 = C14186.m33836();
        c14186M33836.m33842(unknownFields);
        c14186M33836.m33842(c9249);
        setUnknownFields(c14186M33836.build());
        return this;
    }

    public InterfaceC14165 getFieldBuilder(C0117 c0117) {
        throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
    }

    public InterfaceC14165 getRepeatedFieldBuilder(C0117 c0117, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
    }

    public String toString() {
        int i = C11490.f34303;
        return C10079.f30364.m25331(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17715 m47318(InterfaceC23338 interfaceC23338) {
        ArrayList<String> arrayListM20896 = C7816.m20896(interfaceC23338);
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : arrayListM20896) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return new C17715(sb.toString());
    }

    public void markClean() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    public void dispose() {
        throw new IllegalStateException("Should be overridden by subclasses.");
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7673mergeFrom(AbstractC5886 abstractC5886) {
        return (AbstractC20704) super.mo7673mergeFrom(abstractC5886);
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7674mergeFrom(AbstractC5886 abstractC5886, C17798 c17798) {
        return (AbstractC20704) super.mo7674mergeFrom(abstractC5886, c17798);
    }

    @Override // l.AbstractC2359, l.InterfaceC9228
    public AbstractC20704 mergeFrom(byte[] bArr) {
        return (AbstractC20704) super.mergeFrom(bArr);
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7676mergeFrom(byte[] bArr, int i, int i2) {
        return (AbstractC20704) super.mo7676mergeFrom(bArr, i, i2);
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7678mergeFrom(byte[] bArr, C17798 c17798) {
        return (AbstractC20704) super.mo7678mergeFrom(bArr, c17798);
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7677mergeFrom(byte[] bArr, int i, int i2, C17798 c17798) {
        return (AbstractC20704) super.mo7677mergeFrom(bArr, i, i2, c17798);
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7671mergeFrom(InputStream inputStream) {
        return (AbstractC20704) super.mo7671mergeFrom(inputStream);
    }

    @Override // l.AbstractC2359
    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC20704 mo7672mergeFrom(InputStream inputStream, C17798 c17798) {
        return (AbstractC20704) super.mo7672mergeFrom(inputStream, c17798);
    }
}
