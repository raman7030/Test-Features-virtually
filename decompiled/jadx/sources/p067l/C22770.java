package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C22770 extends AbstractC21296 implements InterfaceC6676 {
    public int bitField0_;
    public long compressionFactor_;
    public int cowVersion_;
    public C15969 groupsBuilder_;
    public List groups_;
    public boolean snapshotEnabled_;
    public Object vabcCompressionParam_;
    public boolean vabcEnabled_;
    public C17310 vabcFeatureSetBuilder_;
    public C16928 vabcFeatureSet_;

    public /* synthetic */ C22770(int i) {
        this();
    }

    public /* synthetic */ C22770(InterfaceC11316 interfaceC11316, int i) {
        this(interfaceC11316);
    }

    public static final C19244 getDescriptor() {
        return C21624.f68159x4f937aef;
    }

    @Override // p067l.AbstractC21296
    public C11650 internalGetFieldAccessorTable() {
        C11650 c11650 = C21624.f68160x38cc426d;
        c11650.m26787(C23440.class, C22770.class);
        return c11650;
    }

    public C22770() {
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    public C22770(InterfaceC11316 interfaceC11316) {
        super(interfaceC11316);
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC6285.alwaysUseFieldBuilders) {
            getGroupsFieldBuilder();
            getVabcFeatureSetFieldBuilder();
        }
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public C22770 clear() {
        super.clear();
        this.bitField0_ = 0;
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            this.groups_ = Collections.EMPTY_LIST;
        } else {
            this.groups_ = null;
            c15969.m36302();
        }
        this.bitField0_ &= -2;
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.vabcFeatureSet_ = null;
        C17310 c17310 = this.vabcFeatureSetBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.vabcFeatureSetBuilder_ = null;
        }
        this.compressionFactor_ = 0L;
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C19244 getDescriptorForType() {
        return C21624.f68159x4f937aef;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public C23440 getDefaultInstanceForType() {
        return C23440.getDefaultInstance();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C23440 build() {
        C23440 c23440BuildPartial = buildPartial();
        if (c23440BuildPartial.isInitialized()) {
            return c23440BuildPartial;
        }
        throw AbstractC22045.m49645((InterfaceC24548) c23440BuildPartial);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public C23440 buildPartial() {
        C23440 c23440 = new C23440(this);
        buildPartialRepeatedFields(c23440);
        if (this.bitField0_ != 0) {
            buildPartial0(c23440);
        }
        onBuilt();
        return c23440;
    }

    private void buildPartialRepeatedFields(C23440 c23440) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            if ((this.bitField0_ & 1) != 0) {
                this.groups_ = C21562.unmodifiableList(this.groups_);
                this.bitField0_ &= -2;
            }
            c23440.groups_ = this.groups_;
            return;
        }
        c23440.groups_ = c15969.m36296();
    }

    private void buildPartial0(C23440 c23440) {
        int i;
        C16928 c16928;
        int i2 = this.bitField0_;
        if ((i2 & 2) != 0) {
            c23440.snapshotEnabled_ = this.snapshotEnabled_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            c23440.vabcEnabled_ = this.vabcEnabled_;
            i |= 2;
        }
        if ((i2 & 8) != 0) {
            c23440.vabcCompressionParam_ = this.vabcCompressionParam_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c23440.cowVersion_ = this.cowVersion_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            C17310 c17310 = this.vabcFeatureSetBuilder_;
            if (c17310 == null) {
                c16928 = this.vabcFeatureSet_;
            } else {
                c16928 = (C16928) c17310.m39268();
            }
            c23440.vabcFeatureSet_ = c16928;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            c23440.compressionFactor_ = this.compressionFactor_;
            i |= 32;
        }
        c23440.bitField0_ |= i;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public C22770 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C23440) {
            return mergeFrom((C23440) interfaceC24548);
        }
        super.mergeFrom(interfaceC24548);
        return this;
    }

    public C22770 mergeFrom(C23440 c23440) {
        if (c23440 == C23440.getDefaultInstance()) {
            return this;
        }
        if (this.groupsBuilder_ == null) {
            if (!c23440.groups_.isEmpty()) {
                if (this.groups_.isEmpty()) {
                    this.groups_ = c23440.groups_;
                    this.bitField0_ &= -2;
                } else {
                    ensureGroupsIsMutable();
                    this.groups_.addAll(c23440.groups_);
                }
                onChanged();
            }
        } else if (!c23440.groups_.isEmpty()) {
            if (this.groupsBuilder_.m36307()) {
                this.groupsBuilder_.m36305();
                this.groupsBuilder_ = null;
                this.groups_ = c23440.groups_;
                this.bitField0_ &= -2;
                this.groupsBuilder_ = AbstractC6285.alwaysUseFieldBuilders ? getGroupsFieldBuilder() : null;
            } else {
                this.groupsBuilder_.m36294(c23440.groups_);
            }
        }
        if (c23440.hasSnapshotEnabled()) {
            setSnapshotEnabled(c23440.getSnapshotEnabled());
        }
        if (c23440.hasVabcEnabled()) {
            setVabcEnabled(c23440.getVabcEnabled());
        }
        if (c23440.hasVabcCompressionParam()) {
            this.vabcCompressionParam_ = c23440.vabcCompressionParam_;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (c23440.hasCowVersion()) {
            setCowVersion(c23440.getCowVersion());
        }
        if (c23440.hasVabcFeatureSet()) {
            mergeVabcFeatureSet(c23440.getVabcFeatureSet());
        }
        if (c23440.hasCompressionFactor()) {
            setCompressionFactor(c23440.getCompressionFactor());
        }
        mergeUnknownFields(c23440.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610, p067l.InterfaceC11138
    public C22770 mergeFrom(AbstractC9303 abstractC9303, C19283 c19283) {
        c19283.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo21535 = abstractC9303.mo21535();
                    if (iMo21535 != 0) {
                        if (iMo21535 == 10) {
                            C7347 c7347 = (C7347) abstractC9303.mo21520(C7347.parser(), c19283);
                            C15969 c15969 = this.groupsBuilder_;
                            if (c15969 == null) {
                                ensureGroupsIsMutable();
                                this.groups_.add(c7347);
                            } else {
                                c15969.m36299(c7347);
                            }
                        } else if (iMo21535 == 16) {
                            this.snapshotEnabled_ = abstractC9303.mo21539();
                            this.bitField0_ |= 2;
                        } else if (iMo21535 == 24) {
                            this.vabcEnabled_ = abstractC9303.mo21539();
                            this.bitField0_ |= 4;
                        } else if (iMo21535 == 34) {
                            this.vabcCompressionParam_ = abstractC9303.mo21534();
                            this.bitField0_ |= 8;
                        } else if (iMo21535 == 40) {
                            this.cowVersion_ = abstractC9303.mo21545();
                            this.bitField0_ |= 16;
                        } else if (iMo21535 == 50) {
                            abstractC9303.mo21524(getVabcFeatureSetFieldBuilder().m39273(), c19283);
                            this.bitField0_ |= 32;
                        } else if (iMo21535 == 56) {
                            this.compressionFactor_ = abstractC9303.mo21546();
                            this.bitField0_ |= 64;
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

    private void ensureGroupsIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.groups_ = new ArrayList(this.groups_);
            this.bitField0_ |= 1;
        }
    }

    @Override // p067l.InterfaceC6676
    public List getGroupsList() {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            return C21562.unmodifiableList(this.groups_);
        }
        return c15969.m36308();
    }

    @Override // p067l.InterfaceC6676
    public int getGroupsCount() {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            return this.groups_.size();
        }
        return c15969.m36300();
    }

    @Override // p067l.InterfaceC6676
    public C7347 getGroups(int i) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            return (C7347) this.groups_.get(i);
        }
        return (C7347) c15969.m36297(i);
    }

    public C22770 setGroups(int i, C7347 c7347) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            c7347.getClass();
            ensureGroupsIsMutable();
            this.groups_.set(i, c7347);
            onChanged();
            return this;
        }
        c15969.m36303(i, c7347);
        return this;
    }

    public C22770 setGroups(int i, C2652 c2652) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            ensureGroupsIsMutable();
            this.groups_.set(i, c2652.build());
            onChanged();
            return this;
        }
        c15969.m36303(i, c2652.build());
        return this;
    }

    public C22770 addGroups(C7347 c7347) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            c7347.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(c7347);
            onChanged();
            return this;
        }
        c15969.m36299(c7347);
        return this;
    }

    public C22770 addGroups(int i, C7347 c7347) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            c7347.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(i, c7347);
            onChanged();
            return this;
        }
        c15969.m36298(i, c7347);
        return this;
    }

    public C22770 addGroups(C2652 c2652) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(c2652.build());
            onChanged();
            return this;
        }
        c15969.m36299(c2652.build());
        return this;
    }

    public C22770 addGroups(int i, C2652 c2652) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(i, c2652.build());
            onChanged();
            return this;
        }
        c15969.m36298(i, c2652.build());
        return this;
    }

    public C22770 addAllGroups(Iterable iterable) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            ensureGroupsIsMutable();
            AbstractC4610.m9738(iterable, this.groups_);
            onChanged();
            return this;
        }
        c15969.m36294(iterable);
        return this;
    }

    public C22770 clearGroups() {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            this.groups_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }
        c15969.m36302();
        return this;
    }

    public C22770 removeGroups(int i) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            ensureGroupsIsMutable();
            this.groups_.remove(i);
            onChanged();
            return this;
        }
        c15969.m36306(i);
        return this;
    }

    public C2652 getGroupsBuilder(int i) {
        return (C2652) getGroupsFieldBuilder().m36291(i);
    }

    @Override // p067l.InterfaceC6676
    public InterfaceC10029 getGroupsOrBuilder(int i) {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 == null) {
            return (InterfaceC10029) this.groups_.get(i);
        }
        return (InterfaceC10029) c15969.m36301(i);
    }

    @Override // p067l.InterfaceC6676
    public List getGroupsOrBuilderList() {
        C15969 c15969 = this.groupsBuilder_;
        if (c15969 != null) {
            return c15969.m36295();
        }
        return C21562.unmodifiableList(this.groups_);
    }

    public C2652 addGroupsBuilder() {
        return (C2652) getGroupsFieldBuilder().m36293(C7347.getDefaultInstance());
    }

    public C2652 addGroupsBuilder(int i) {
        return (C2652) getGroupsFieldBuilder().m36292(i, C7347.getDefaultInstance());
    }

    public List getGroupsBuilderList() {
        return getGroupsFieldBuilder().m36304();
    }

    private C15969 getGroupsFieldBuilder() {
        if (this.groupsBuilder_ == null) {
            this.groupsBuilder_ = new C15969(this.groups_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
            this.groups_ = null;
        }
        return this.groupsBuilder_;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p067l.InterfaceC6676
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    public C22770 setSnapshotEnabled(boolean z) {
        this.snapshotEnabled_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C22770 clearSnapshotEnabled() {
        this.bitField0_ &= -3;
        this.snapshotEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p067l.InterfaceC6676
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    public C22770 setVabcEnabled(boolean z) {
        this.vabcEnabled_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C22770 clearVabcEnabled() {
        this.bitField0_ &= -5;
        this.vabcEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p067l.InterfaceC6676
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (!(obj instanceof String)) {
            AbstractC7962 abstractC7962 = (AbstractC7962) obj;
            String strM18427 = abstractC7962.m18427();
            if (abstractC7962.mo18426()) {
                this.vabcCompressionParam_ = strM18427;
            }
            return strM18427;
        }
        return (String) obj;
    }

    @Override // p067l.InterfaceC6676
    public AbstractC7962 getVabcCompressionParamBytes() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            AbstractC7962 abstractC7962M18417 = AbstractC7962.m18417((String) obj);
            this.vabcCompressionParam_ = abstractC7962M18417;
            return abstractC7962M18417;
        }
        return (AbstractC7962) obj;
    }

    public C22770 setVabcCompressionParam(String str) {
        str.getClass();
        this.vabcCompressionParam_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C22770 clearVabcCompressionParam() {
        this.vabcCompressionParam_ = C23440.getDefaultInstance().getVabcCompressionParam();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C22770 setVabcCompressionParamBytes(AbstractC7962 abstractC7962) {
        abstractC7962.getClass();
        this.vabcCompressionParam_ = abstractC7962;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasCowVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // p067l.InterfaceC6676
    public int getCowVersion() {
        return this.cowVersion_;
    }

    public C22770 setCowVersion(int i) {
        this.cowVersion_ = i;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C22770 clearCowVersion() {
        this.bitField0_ &= -17;
        this.cowVersion_ = 0;
        onChanged();
        return this;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // p067l.InterfaceC6676
    public C16928 getVabcFeatureSet() {
        C17310 c17310 = this.vabcFeatureSetBuilder_;
        if (c17310 == null) {
            C16928 c16928 = this.vabcFeatureSet_;
            return c16928 == null ? C16928.getDefaultInstance() : c16928;
        }
        return (C16928) c17310.m39272();
    }

    public C22770 setVabcFeatureSet(C16928 c16928) {
        C17310 c17310 = this.vabcFeatureSetBuilder_;
        if (c17310 == null) {
            c16928.getClass();
            this.vabcFeatureSet_ = c16928;
        } else {
            c17310.m39269(c16928);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C22770 setVabcFeatureSet(C10224 c10224) {
        C17310 c17310 = this.vabcFeatureSetBuilder_;
        if (c17310 == null) {
            this.vabcFeatureSet_ = c10224.build();
        } else {
            c17310.m39269(c10224.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C22770 mergeVabcFeatureSet(C16928 c16928) {
        C16928 c16929;
        C17310 c17310 = this.vabcFeatureSetBuilder_;
        if (c17310 == null) {
            if ((this.bitField0_ & 32) != 0 && (c16929 = this.vabcFeatureSet_) != null && c16929 != C16928.getDefaultInstance()) {
                getVabcFeatureSetBuilder().mergeFrom(c16928);
            } else {
                this.vabcFeatureSet_ = c16928;
            }
        } else {
            c17310.m39267(c16928);
        }
        if (this.vabcFeatureSet_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C22770 clearVabcFeatureSet() {
        this.bitField0_ &= -33;
        this.vabcFeatureSet_ = null;
        C17310 c17310 = this.vabcFeatureSetBuilder_;
        if (c17310 != null) {
            c17310.m39271();
            this.vabcFeatureSetBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C10224 getVabcFeatureSetBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C10224) getVabcFeatureSetFieldBuilder().m39273();
    }

    @Override // p067l.InterfaceC6676
    public InterfaceC23635 getVabcFeatureSetOrBuilder() {
        C17310 c17310 = this.vabcFeatureSetBuilder_;
        if (c17310 != null) {
            return (InterfaceC23635) c17310.m39270();
        }
        C16928 c16928 = this.vabcFeatureSet_;
        return c16928 == null ? C16928.getDefaultInstance() : c16928;
    }

    private C17310 getVabcFeatureSetFieldBuilder() {
        if (this.vabcFeatureSetBuilder_ == null) {
            this.vabcFeatureSetBuilder_ = new C17310(getVabcFeatureSet(), getParentForChildren(), isClean());
            this.vabcFeatureSet_ = null;
        }
        return this.vabcFeatureSetBuilder_;
    }

    @Override // p067l.InterfaceC6676
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // p067l.InterfaceC6676
    public long getCompressionFactor() {
        return this.compressionFactor_;
    }

    public C22770 setCompressionFactor(long j) {
        this.compressionFactor_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C22770 clearCompressionFactor() {
        this.bitField0_ &= -65;
        this.compressionFactor_ = 0L;
        onChanged();
        return this;
    }
}
