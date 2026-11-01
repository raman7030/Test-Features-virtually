package p067l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩶ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21296 extends AbstractC22045 {
    public InterfaceC11316 builderParent;
    public boolean isClean;
    public C23307 meAsParent;
    public Object unknownFieldsOrBuilder;

    public abstract C11650 internalGetFieldAccessorTable();

    public AbstractC21296() {
        this(null);
    }

    public AbstractC21296(InterfaceC11316 interfaceC11316) {
        this.unknownFieldsOrBuilder = C11158.m25741();
        this.builderParent = interfaceC11316;
    }

    @Override // p067l.AbstractC22045
    public void dispose() {
        this.builderParent = null;
    }

    public void onBuilt() {
        if (this.builderParent != null) {
            markClean();
        }
    }

    @Override // p067l.AbstractC22045
    public void markClean() {
        this.isClean = true;
    }

    public boolean isClean() {
        return this.isClean;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610
    /* JADX INFO: renamed from: clone */
    public AbstractC21296 mo56039clone() {
        AbstractC21296 abstractC21296 = (AbstractC21296) getDefaultInstanceForType().newBuilderForType();
        abstractC21296.mergeFrom(buildPartial());
        return abstractC21296;
    }

    @Override // p067l.AbstractC22045
    /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
    public AbstractC21296 clear() {
        this.unknownFieldsOrBuilder = C11158.m25741();
        onChanged();
        return this;
    }

    public C19244 getDescriptorForType() {
        return internalGetFieldAccessorTable().f32496;
    }

    public Map getAllFields() {
        return C21562.unmodifiableMap(m48145());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public Map m48145() {
        TreeMap treeMap = new TreeMap();
        List fields = internalGetFieldAccessorTable().f32496.getFields();
        int iM37542 = 0;
        while (iM37542 < fields.size()) {
            C2479 oneofFieldDescriptor = (C2479) fields.get(iM37542);
            C16561 c16561M3540 = oneofFieldDescriptor.m3540();
            if (c16561M3540 != null) {
                iM37542 += c16561M3540.m37542() - 1;
                if (hasOneof(c16561M3540)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(c16561M3540);
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            } else if (oneofFieldDescriptor.mo3530()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
            }
            iM37542++;
        }
        return treeMap;
    }

    public InterfaceC15830 newBuilderForField(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18208();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public InterfaceC15830 getFieldBuilder(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18221(this);
    }

    @Override // p067l.AbstractC22045
    public InterfaceC15830 getRepeatedFieldBuilder(C2479 c2479, int i) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18209(this, i);
    }

    @Override // p067l.AbstractC22045
    public boolean hasOneof(C16561 c16561) {
        return C11650.m26786(internalGetFieldAccessorTable(), c16561).mo34723(this);
    }

    @Override // p067l.AbstractC22045
    public C2479 getOneofFieldDescriptor(C16561 c16561) {
        return C11650.m26786(internalGetFieldAccessorTable(), c16561).mo34721(this);
    }

    public boolean hasField(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18218(this);
    }

    public Object getField(C2479 c2479) {
        Object objMo18213 = C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18213(this);
        return c2479.mo3530() ? C21562.unmodifiableList((List) objMo18213) : objMo18213;
    }

    @Override // p067l.InterfaceC15830
    public AbstractC21296 setField(C2479 c2479, Object obj) {
        C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18212(this, obj);
        return this;
    }

    @Override // p067l.InterfaceC15830
    public AbstractC21296 clearField(C2479 c2479) {
        C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18210(this);
        return this;
    }

    @Override // p067l.AbstractC22045
    public AbstractC21296 clearOneof(C16561 c16561) {
        C11650.m26786(internalGetFieldAccessorTable(), c16561).mo34720(this);
        return this;
    }

    public int getRepeatedFieldCount(C2479 c2479) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18219(this);
    }

    public Object getRepeatedField(C2479 c2479, int i) {
        return C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18214(this, i);
    }

    @Override // 
    public AbstractC21296 setRepeatedField(C2479 c2479, int i, Object obj) {
        C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18211(this, i, obj);
        return this;
    }

    @Override // p067l.InterfaceC15830
    public AbstractC21296 addRepeatedField(C2479 c2479, Object obj) {
        C11650.m26784(internalGetFieldAccessorTable(), c2479).mo18215(this, obj);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC21296 m48147(C11158 c11158) {
        this.unknownFieldsOrBuilder = c11158;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC15830
    public AbstractC21296 setUnknownFields(C11158 c11158) {
        return m48147(c11158);
    }

    public AbstractC21296 setUnknownFieldsProto3(C11158 c11158) {
        return m48147(c11158);
    }

    @Override // p067l.AbstractC22045
    public AbstractC21296 mergeUnknownFields(C11158 c11158) {
        if (C11158.m25741().equals(c11158)) {
            return this;
        }
        if (C11158.m25741().equals(this.unknownFieldsOrBuilder)) {
            this.unknownFieldsOrBuilder = c11158;
            onChanged();
            return this;
        }
        getUnknownFieldSetBuilder().m35974(c11158);
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    public boolean isInitialized() {
        for (C2479 c2479 : getDescriptorForType().getFields()) {
            if (c2479.m3529() && !hasField(c2479)) {
                return false;
            }
            if (c2479.m3539() == EnumC19915.MESSAGE) {
                if (c2479.mo3530()) {
                    Iterator it = ((List) getField(c2479)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC24548) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c2479) && !((InterfaceC24548) getField(c2479)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC5773
    public final C11158 getUnknownFields() {
        Object obj = this.unknownFieldsOrBuilder;
        if (!(obj instanceof C11158)) {
            return ((C15850) obj).build();
        }
        return (C11158) obj;
    }

    public boolean parseUnknownField(AbstractC9303 abstractC9303, C19283 c19283, int i) {
        abstractC9303.getClass();
        return getUnknownFieldSetBuilder().m35975(i, abstractC9303);
    }

    public final void mergeUnknownLengthDelimitedField(int i, AbstractC7962 abstractC7962) {
        getUnknownFieldSetBuilder().m35971(i, abstractC7962);
    }

    public final void mergeUnknownVarintField(int i, int i2) {
        getUnknownFieldSetBuilder().m35970(i, i2);
    }

    @Override // p067l.AbstractC22045
    public C15850 getUnknownFieldSetBuilder() {
        Object obj = this.unknownFieldsOrBuilder;
        if (obj instanceof C11158) {
            C15850 c15850M35968 = C15850.m35968();
            c15850M35968.m35974((C11158) obj);
            this.unknownFieldsOrBuilder = c15850M35968;
        }
        onChanged();
        return (C15850) this.unknownFieldsOrBuilder;
    }

    @Override // p067l.AbstractC22045
    public void setUnknownFieldSetBuilder(C15850 c15850) {
        this.unknownFieldsOrBuilder = c15850;
        onChanged();
    }

    public InterfaceC11316 getParentForChildren() {
        if (this.meAsParent == null) {
            this.meAsParent = new C23307(this);
        }
        return this.meAsParent;
    }

    public final void onChanged() {
        InterfaceC11316 interfaceC11316;
        if (!this.isClean || (interfaceC11316 = this.builderParent) == null) {
            return;
        }
        interfaceC11316.mo26264();
        this.isClean = false;
    }

    public AbstractC3761 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C15691 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public AbstractC3761 internalGetMutableMapFieldReflection(int i) {
        return internalGetMutableMapField(i);
    }

    @Deprecated
    public C15691 internalGetMutableMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }
}
