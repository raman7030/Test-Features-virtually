package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21466 extends AbstractC19916 implements InterfaceC4532 {
    public int bitField0_;
    public long compressionFactor_;
    public int cowVersion_;
    public C14311 groupsBuilder_;
    public List groups_;
    public boolean snapshotEnabled_;
    public Object vabcCompressionParam_;
    public boolean vabcEnabled_;
    public C15722 vabcFeatureSetBuilder_;
    public C15319 vabcFeatureSet_;

    public /* synthetic */ C21466(int i) {
        this();
    }

    public /* synthetic */ C21466(InterfaceC9415 interfaceC9415, int i) {
        this(interfaceC9415);
    }

    public static final C17757 getDescriptor() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC19916
    public C9766 internalGetFieldAccessorTable() {
        C9766 c9766 = C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_fieldAccessorTable;
        c9766.m24773(C22171.class, C21466.class);
        return c9766;
    }

    public C21466() {
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    public C21466(InterfaceC9415 interfaceC9415) {
        super(interfaceC9415);
        this.groups_ = Collections.EMPTY_LIST;
        this.vabcCompressionParam_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC4121.alwaysUseFieldBuilders) {
            getGroupsFieldBuilder();
            getVabcFeatureSetFieldBuilder();
        }
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public C21466 clear() {
        super.clear();
        this.bitField0_ = 0;
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            this.groups_ = Collections.EMPTY_LIST;
        } else {
            this.groups_ = null;
            c14311.m34169();
        }
        this.bitField0_ &= -2;
        this.snapshotEnabled_ = false;
        this.vabcEnabled_ = false;
        this.vabcCompressionParam_ = "";
        this.cowVersion_ = 0;
        this.vabcFeatureSet_ = null;
        C15722 c15722 = this.vabcFeatureSetBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.vabcFeatureSetBuilder_ = null;
        }
        this.compressionFactor_ = 0L;
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        return C20260.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionMetadata_descriptor;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public C22171 getDefaultInstanceForType() {
        return C22171.getDefaultInstance();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C22171 build() {
        C22171 c22171BuildPartial = buildPartial();
        if (c22171BuildPartial.isInitialized()) {
            return c22171BuildPartial;
        }
        throw AbstractC20704.m47318((InterfaceC23338) c22171BuildPartial);
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public C22171 buildPartial() {
        C22171 c22171 = new C22171(this);
        buildPartialRepeatedFields(c22171);
        if (this.bitField0_ != 0) {
            buildPartial0(c22171);
        }
        onBuilt();
        return c22171;
    }

    private void buildPartialRepeatedFields(C22171 c22171) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            if ((this.bitField0_ & 1) != 0) {
                this.groups_ = C20195.unmodifiableList(this.groups_);
                this.bitField0_ &= -2;
            }
            c22171.groups_ = this.groups_;
            return;
        }
        c22171.groups_ = c14311.m34163();
    }

    private void buildPartial0(C22171 c22171) {
        int i;
        C15319 c15319;
        int i2 = this.bitField0_;
        if ((i2 & 2) != 0) {
            c22171.snapshotEnabled_ = this.snapshotEnabled_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            c22171.vabcEnabled_ = this.vabcEnabled_;
            i |= 2;
        }
        if ((i2 & 8) != 0) {
            c22171.vabcCompressionParam_ = this.vabcCompressionParam_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c22171.cowVersion_ = this.cowVersion_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            C15722 c15722 = this.vabcFeatureSetBuilder_;
            if (c15722 == null) {
                c15319 = this.vabcFeatureSet_;
            } else {
                c15319 = (C15319) c15722.m37099();
            }
            c22171.vabcFeatureSet_ = c15319;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            c22171.compressionFactor_ = this.compressionFactor_;
            i |= 32;
        }
        c22171.bitField0_ |= i;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public C21466 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C22171) {
            return mergeFrom((C22171) interfaceC23338);
        }
        super.mergeFrom(interfaceC23338);
        return this;
    }

    public C21466 mergeFrom(C22171 c22171) {
        if (c22171 == C22171.getDefaultInstance()) {
            return this;
        }
        if (this.groupsBuilder_ == null) {
            if (!c22171.groups_.isEmpty()) {
                if (this.groups_.isEmpty()) {
                    this.groups_ = c22171.groups_;
                    this.bitField0_ &= -2;
                } else {
                    ensureGroupsIsMutable();
                    this.groups_.addAll(c22171.groups_);
                }
                onChanged();
            }
        } else if (!c22171.groups_.isEmpty()) {
            if (this.groupsBuilder_.m34174()) {
                this.groupsBuilder_.m34172();
                this.groupsBuilder_ = null;
                this.groups_ = c22171.groups_;
                this.bitField0_ &= -2;
                this.groupsBuilder_ = AbstractC4121.alwaysUseFieldBuilders ? getGroupsFieldBuilder() : null;
            } else {
                this.groupsBuilder_.m34161(c22171.groups_);
            }
        }
        if (c22171.hasSnapshotEnabled()) {
            setSnapshotEnabled(c22171.getSnapshotEnabled());
        }
        if (c22171.hasVabcEnabled()) {
            setVabcEnabled(c22171.getVabcEnabled());
        }
        if (c22171.hasVabcCompressionParam()) {
            this.vabcCompressionParam_ = c22171.vabcCompressionParam_;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (c22171.hasCowVersion()) {
            setCowVersion(c22171.getCowVersion());
        }
        if (c22171.hasVabcFeatureSet()) {
            mergeVabcFeatureSet(c22171.getVabcFeatureSet());
        }
        if (c22171.hasCompressionFactor()) {
            setCompressionFactor(c22171.getCompressionFactor());
        }
        mergeUnknownFields(c22171.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        for (int i = 0; i < getGroupsCount(); i++) {
            if (!getGroups(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC20704, l.AbstractC2359, l.InterfaceC9228
    public C21466 mergeFrom(AbstractC7297 abstractC7297, C17798 c17798) {
        c17798.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo19567 = abstractC7297.mo19567();
                    if (iMo19567 != 0) {
                        if (iMo19567 == 10) {
                            C5238 c5238 = (C5238) abstractC7297.mo19552(C5238.parser(), c17798);
                            C14311 c14311 = this.groupsBuilder_;
                            if (c14311 == null) {
                                ensureGroupsIsMutable();
                                this.groups_.add(c5238);
                            } else {
                                c14311.m34166(c5238);
                            }
                        } else if (iMo19567 == 16) {
                            this.snapshotEnabled_ = abstractC7297.mo19571();
                            this.bitField0_ |= 2;
                        } else if (iMo19567 == 24) {
                            this.vabcEnabled_ = abstractC7297.mo19571();
                            this.bitField0_ |= 4;
                        } else if (iMo19567 == 34) {
                            this.vabcCompressionParam_ = abstractC7297.mo19566();
                            this.bitField0_ |= 8;
                        } else if (iMo19567 == 40) {
                            this.cowVersion_ = abstractC7297.mo19577();
                            this.bitField0_ |= 16;
                        } else if (iMo19567 == 50) {
                            abstractC7297.mo19556(getVabcFeatureSetFieldBuilder().m37104(), c17798);
                            this.bitField0_ |= 32;
                        } else if (iMo19567 == 56) {
                            this.compressionFactor_ = abstractC7297.mo19578();
                            this.bitField0_ |= 64;
                        } else if (!super.parseUnknownField(abstractC7297, c17798, iMo19567)) {
                        }
                    }
                    z = true;
                } catch (C2025 e) {
                    throw e.m6586();
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

    @Override // l.InterfaceC4532
    public List getGroupsList() {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            return C20195.unmodifiableList(this.groups_);
        }
        return c14311.m34175();
    }

    @Override // l.InterfaceC4532
    public int getGroupsCount() {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            return this.groups_.size();
        }
        return c14311.m34167();
    }

    @Override // l.InterfaceC4532
    public C5238 getGroups(int i) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            return (C5238) this.groups_.get(i);
        }
        return (C5238) c14311.m34164(i);
    }

    public C21466 setGroups(int i, C5238 c5238) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            c5238.getClass();
            ensureGroupsIsMutable();
            this.groups_.set(i, c5238);
            onChanged();
            return this;
        }
        c14311.m34170(i, c5238);
        return this;
    }

    public C21466 setGroups(int i, C0298 c0298) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            ensureGroupsIsMutable();
            this.groups_.set(i, c0298.build());
            onChanged();
            return this;
        }
        c14311.m34170(i, c0298.build());
        return this;
    }

    public C21466 addGroups(C5238 c5238) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            c5238.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(c5238);
            onChanged();
            return this;
        }
        c14311.m34166(c5238);
        return this;
    }

    public C21466 addGroups(int i, C5238 c5238) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            c5238.getClass();
            ensureGroupsIsMutable();
            this.groups_.add(i, c5238);
            onChanged();
            return this;
        }
        c14311.m34165(i, c5238);
        return this;
    }

    public C21466 addGroups(C0298 c0298) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(c0298.build());
            onChanged();
            return this;
        }
        c14311.m34166(c0298.build());
        return this;
    }

    public C21466 addGroups(int i, C0298 c0298) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            ensureGroupsIsMutable();
            this.groups_.add(i, c0298.build());
            onChanged();
            return this;
        }
        c14311.m34165(i, c0298.build());
        return this;
    }

    public C21466 addAllGroups(Iterable iterable) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            ensureGroupsIsMutable();
            AbstractC2359.m7667(iterable, this.groups_);
            onChanged();
            return this;
        }
        c14311.m34161(iterable);
        return this;
    }

    public C21466 clearGroups() {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            this.groups_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }
        c14311.m34169();
        return this;
    }

    public C21466 removeGroups(int i) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            ensureGroupsIsMutable();
            this.groups_.remove(i);
            onChanged();
            return this;
        }
        c14311.m34173(i);
        return this;
    }

    public C0298 getGroupsBuilder(int i) {
        return (C0298) getGroupsFieldBuilder().m34158(i);
    }

    @Override // l.InterfaceC4532
    public InterfaceC8060 getGroupsOrBuilder(int i) {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 == null) {
            return (InterfaceC8060) this.groups_.get(i);
        }
        return (InterfaceC8060) c14311.m34168(i);
    }

    @Override // l.InterfaceC4532
    public List getGroupsOrBuilderList() {
        C14311 c14311 = this.groupsBuilder_;
        if (c14311 != null) {
            return c14311.m34162();
        }
        return C20195.unmodifiableList(this.groups_);
    }

    public C0298 addGroupsBuilder() {
        return (C0298) getGroupsFieldBuilder().m34160(C5238.getDefaultInstance());
    }

    public C0298 addGroupsBuilder(int i) {
        return (C0298) getGroupsFieldBuilder().m34159(i, C5238.getDefaultInstance());
    }

    public List getGroupsBuilderList() {
        return getGroupsFieldBuilder().m34171();
    }

    private C14311 getGroupsFieldBuilder() {
        if (this.groupsBuilder_ == null) {
            this.groupsBuilder_ = new C14311(this.groups_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
            this.groups_ = null;
        }
        return this.groupsBuilder_;
    }

    @Override // l.InterfaceC4532
    public boolean hasSnapshotEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC4532
    public boolean getSnapshotEnabled() {
        return this.snapshotEnabled_;
    }

    public C21466 setSnapshotEnabled(boolean z) {
        this.snapshotEnabled_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C21466 clearSnapshotEnabled() {
        this.bitField0_ &= -3;
        this.snapshotEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC4532
    public boolean hasVabcEnabled() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC4532
    public boolean getVabcEnabled() {
        return this.vabcEnabled_;
    }

    public C21466 setVabcEnabled(boolean z) {
        this.vabcEnabled_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C21466 clearVabcEnabled() {
        this.bitField0_ &= -5;
        this.vabcEnabled_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC4532
    public boolean hasVabcCompressionParam() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC4532
    public String getVabcCompressionParam() {
        Object obj = this.vabcCompressionParam_;
        if (!(obj instanceof String)) {
            AbstractC5886 abstractC5886 = (AbstractC5886) obj;
            String strM16501 = abstractC5886.m16501();
            if (abstractC5886.mo16500()) {
                this.vabcCompressionParam_ = strM16501;
            }
            return strM16501;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC4532
    public AbstractC5886 getVabcCompressionParamBytes() {
        Object obj = this.vabcCompressionParam_;
        if (obj instanceof String) {
            AbstractC5886 abstractC5886M16491 = AbstractC5886.m16491((String) obj);
            this.vabcCompressionParam_ = abstractC5886M16491;
            return abstractC5886M16491;
        }
        return (AbstractC5886) obj;
    }

    public C21466 setVabcCompressionParam(String str) {
        str.getClass();
        this.vabcCompressionParam_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C21466 clearVabcCompressionParam() {
        this.vabcCompressionParam_ = C22171.getDefaultInstance().getVabcCompressionParam();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C21466 setVabcCompressionParamBytes(AbstractC5886 abstractC5886) {
        abstractC5886.getClass();
        this.vabcCompressionParam_ = abstractC5886;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC4532
    public boolean hasCowVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC4532
    public int getCowVersion() {
        return this.cowVersion_;
    }

    public C21466 setCowVersion(int i) {
        this.cowVersion_ = i;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C21466 clearCowVersion() {
        this.bitField0_ &= -17;
        this.cowVersion_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC4532
    public boolean hasVabcFeatureSet() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC4532
    public C15319 getVabcFeatureSet() {
        C15722 c15722 = this.vabcFeatureSetBuilder_;
        if (c15722 == null) {
            C15319 c15319 = this.vabcFeatureSet_;
            return c15319 == null ? C15319.getDefaultInstance() : c15319;
        }
        return (C15319) c15722.m37103();
    }

    public C21466 setVabcFeatureSet(C15319 c15319) {
        C15722 c15722 = this.vabcFeatureSetBuilder_;
        if (c15722 == null) {
            c15319.getClass();
            this.vabcFeatureSet_ = c15319;
        } else {
            c15722.m37100(c15319);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C21466 setVabcFeatureSet(C8265 c8265) {
        C15722 c15722 = this.vabcFeatureSetBuilder_;
        if (c15722 == null) {
            this.vabcFeatureSet_ = c8265.build();
        } else {
            c15722.m37100(c8265.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C21466 mergeVabcFeatureSet(C15319 c15319) {
        C15319 c153110;
        C15722 c15722 = this.vabcFeatureSetBuilder_;
        if (c15722 == null) {
            if ((this.bitField0_ & 32) != 0 && (c153110 = this.vabcFeatureSet_) != null && c153110 != C15319.getDefaultInstance()) {
                getVabcFeatureSetBuilder().mergeFrom(c15319);
            } else {
                this.vabcFeatureSet_ = c15319;
            }
        } else {
            c15722.m37098(c15319);
        }
        if (this.vabcFeatureSet_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C21466 clearVabcFeatureSet() {
        this.bitField0_ &= -33;
        this.vabcFeatureSet_ = null;
        C15722 c15722 = this.vabcFeatureSetBuilder_;
        if (c15722 != null) {
            c15722.m37102();
            this.vabcFeatureSetBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C8265 getVabcFeatureSetBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C8265) getVabcFeatureSetFieldBuilder().m37104();
    }

    @Override // l.InterfaceC4532
    public InterfaceC22376 getVabcFeatureSetOrBuilder() {
        C15722 c15722 = this.vabcFeatureSetBuilder_;
        if (c15722 != null) {
            return (InterfaceC22376) c15722.m37101();
        }
        C15319 c15319 = this.vabcFeatureSet_;
        return c15319 == null ? C15319.getDefaultInstance() : c15319;
    }

    private C15722 getVabcFeatureSetFieldBuilder() {
        if (this.vabcFeatureSetBuilder_ == null) {
            this.vabcFeatureSetBuilder_ = new C15722(getVabcFeatureSet(), getParentForChildren(), isClean());
            this.vabcFeatureSet_ = null;
        }
        return this.vabcFeatureSetBuilder_;
    }

    @Override // l.InterfaceC4532
    public boolean hasCompressionFactor() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC4532
    public long getCompressionFactor() {
        return this.compressionFactor_;
    }

    public C21466 setCompressionFactor(long j) {
        this.compressionFactor_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C21466 clearCompressionFactor() {
        this.bitField0_ &= -65;
        this.compressionFactor_ = 0L;
        onChanged();
        return this;
    }
}
