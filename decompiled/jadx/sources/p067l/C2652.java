package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.֡۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C2652 extends AbstractC21296 implements InterfaceC10029 {
    public int bitField0_;
    public Object name_;
    public C4964 partitionNames_;
    public long size_;

    public /* synthetic */ C2652(int i) {
        this();
    }

    public /* synthetic */ C2652(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    public static final C19244 getDescriptor() {
        return C21624.f68157x5ee982bf;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68158xe8c57a3d;
        c11650.m26787(C7347.class, C2652.class);
        return c11650;
    }

    public C2652() {
        this.name_ = "";
        this.partitionNames_ = C4964.m10513();
    }

    public C2652(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.name_ = "";
        this.partitionNames_ = C4964.m10513();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C2652 clear() {
        super.clear();
        this.bitField0_ = 0;
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C4964.m10513();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68157x5ee982bf;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C7347 getDefaultInstanceForType() {
        return C7347.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C7347 build() {
        C7347 c7347BuildPartial = buildPartial();
        if (c7347BuildPartial.isInitialized()) {
            return c7347BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c7347BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C7347 buildPartial() {
        C7347 c7347 = new C7347(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c7347);
        }
        onBuilt();
        return c7347;
    }

    private void buildPartial0(C7347 c7347) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c7347.name_ = this.name_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c7347.size_ = this.size_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            this.partitionNames_.mo46787();
            c7347.partitionNames_ = this.partitionNames_;
        }
        c7347.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C2652 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C7347) {
            return mergeFrom((C7347) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C2652 mergeFrom(C7347 c7347) {
        if (c7347 == C7347.getDefaultInstance()) {
            return this;
        }
        if (c7347.hasName()) {
            this.name_ = c7347.name_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c7347.hasSize()) {
            setSize(c7347.getSize());
        }
        if (!c7347.partitionNames_.isEmpty()) {
            if (this.partitionNames_.isEmpty()) {
                this.partitionNames_ = c7347.partitionNames_;
                this.bitField0_ |= 4;
            } else {
                ensurePartitionNamesIsMutable();
                this.partitionNames_.addAll(c7347.partitionNames_);
            }
            onChanged();
        }
        mergeUnknownFields(c7347.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return hasName();
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C2652 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            this.name_ = abstractC9303.mo21534();
                            this.bitField0_ |= 1;
                        } else if (iMo21535 == 16) {
                            this.size_ = abstractC9303.mo21546();
                            this.bitField0_ |= 2;
                        } else if (iMo21535 == 26) {
                            AbstractC7962 abstractC7962Mo21534 = abstractC9303.mo21534();
                            ensurePartitionNamesIsMutable();
                            this.partitionNames_.mo10516(abstractC7962Mo21534);
                        } else if (!super.parseUnknownField(abstractC9303, c19283, iMo21535)) {
                        }
                    }
                    z = true;
                } catch (C4293 e) {
                    throw e.m8712();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC10029
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p067l.InterfaceC10029
    public String getName() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.name_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC10029
    public AbstractC7962 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.name_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C2652 setName(String str) {
        str.getClass();
        this.name_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C2652 clearName() {
        this.name_ = C7347.getDefaultInstance().getName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C2652 setNameBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.name_ = abstractC7962;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC10029
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC10029
    public long getSize() {
        return this.size_;
    }

    public C2652 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C2652 clearSize() {
        this.bitField0_ &= -3;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    private void ensurePartitionNamesIsMutable() {
        if (!this.partitionNames_.mo46785()) {
            this.partitionNames_ = new C4964(this.partitionNames_);
        }
        this.bitField0_ |= 4;
    }

    @Override // p067l.InterfaceC10029
    public InterfaceC9126 getPartitionNamesList() {
        this.partitionNames_.mo46787();
        return this.partitionNames_;
    }

    @Override // p067l.InterfaceC10029
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // p067l.InterfaceC10029
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // p067l.InterfaceC10029
    public AbstractC7962 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m10515(i);
    }

    public C2652 setPartitionNames(int i, String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.set(i, str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C2652 addPartitionNames(String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.add(str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C2652 addAllPartitionNames(Iterable iterable) {
        ensurePartitionNamesIsMutable();
        AbstractC4610.m9738(iterable, (List) this.partitionNames_);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C2652 clearPartitionNames() {
        this.partitionNames_ = C4964.m10513();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C2652 addPartitionNamesBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.mo10516(abstractC7962);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }
}
