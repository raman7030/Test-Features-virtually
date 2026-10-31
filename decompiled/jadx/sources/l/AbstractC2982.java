package l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2982 extends AbstractC19916 implements InterfaceC3583 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3687 f9424;

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public AbstractC2982 clear() {
        this.f9424 = null;
        return (AbstractC2982) super.clear();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9113() {
        if (this.f9424 == null) {
            int i = C19210.f60476;
            this.f9424 = new C3687(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9114(AbstractC11408 abstractC11408, C14724 c14724) {
        AbstractC5763 abstractC5763M12388 = AbstractC4121.m12388(abstractC11408);
        if (abstractC5763M12388.mo16212().m1144() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC5763M12388.mo16212().m1144().mo1141() + "\" which does not match message type \"" + getDescriptorForType().mo1141() + "\".");
        }
        m9113();
        this.f9424.m11243(abstractC5763M12388.mo16212(), abstractC5763M12388.mo16210(c14724));
        onChanged();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9116() {
        C3687 c3687 = this.f9424;
        return c3687 == null || c3687.m11246();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19210 m9111(AbstractC2982 abstractC2982) {
        C3687 c3687 = abstractC2982.f9424;
        if (c3687 == null) {
            return C19210.m44302();
        }
        return c3687.m11242();
    }

    @Override // l.AbstractC19916, l.InterfaceC15576, l.InterfaceC8060
    public boolean isInitialized() {
        return super.isInitialized() && m9116();
    }

    @Override // l.AbstractC19916, l.InterfaceC3583
    public final Map getAllFields() {
        Map mapM45833 = m45833();
        C3687 c3687 = this.f9424;
        if (c3687 != null) {
            mapM45833.putAll(c3687.m11244());
        }
        return C20195.unmodifiableMap(mapM45833);
    }

    @Override // l.AbstractC19916, l.InterfaceC3583
    public final Object getField(C0117 c0117) {
        if (c0117.m1126()) {
            m9112(c0117);
            C3687 c3687 = this.f9424;
            Object objM11241 = c3687 == null ? null : c3687.m11241(c0117);
            if (objM11241 != null) {
                return objM11241;
            }
            if (c0117.m1138() == EnumC18463.MESSAGE) {
                return C12113.m29517(c0117.m1147());
            }
            return c0117.m1122();
        }
        return super.getField(c0117);
    }

    @Override // l.AbstractC19916, l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 getFieldBuilder(C0117 c0117) {
        if (c0117.m1126()) {
            m9112(c0117);
            if (c0117.m1138() != EnumC18463.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            m9113();
            Object objM11234 = this.f9424.m11234((InterfaceC18504) c0117);
            if (objM11234 == null) {
                C12818 c12818 = new C12818(c0117.m1147(), 0);
                this.f9424.m11243(c0117, c12818);
                onChanged();
                return c12818;
            }
            if (objM11234 instanceof InterfaceC14165) {
                return (InterfaceC14165) objM11234;
            }
            if (objM11234 instanceof InterfaceC23338) {
                InterfaceC14165 builder = ((InterfaceC23338) objM11234).toBuilder();
                this.f9424.m11243(c0117, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getFieldBuilder(c0117);
    }

    @Override // l.AbstractC19916
    public final int getRepeatedFieldCount(C0117 c0117) {
        if (c0117.m1126()) {
            m9112(c0117);
            C3687 c3687 = this.f9424;
            if (c3687 == null) {
                return 0;
            }
            c3687.getClass();
            if (!c0117.mo1129()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objM11234 = c3687.m11234((InterfaceC18504) c0117);
            if (objM11234 == null) {
                return 0;
            }
            return ((List) objM11234).size();
        }
        return super.getRepeatedFieldCount(c0117);
    }

    @Override // l.AbstractC19916
    public final Object getRepeatedField(C0117 c0117, int i) {
        if (c0117.m1126()) {
            m9112(c0117);
            C3687 c3687 = this.f9424;
            if (c3687 == null) {
                throw new IndexOutOfBoundsException();
            }
            return c3687.m11233(c0117, i);
        }
        return super.getRepeatedField(c0117, i);
    }

    @Override // l.AbstractC19916, l.AbstractC20704
    public final InterfaceC14165 getRepeatedFieldBuilder(C0117 c0117, int i) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            if (c0117.m1138() != EnumC18463.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objM11235 = this.f9424.m11235((InterfaceC18504) c0117, i);
            if (objM11235 instanceof InterfaceC14165) {
                return (InterfaceC14165) objM11235;
            }
            if (objM11235 instanceof InterfaceC23338) {
                InterfaceC14165 builder = ((InterfaceC23338) objM11235).toBuilder();
                this.f9424.m11238(c0117, i, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getRepeatedFieldBuilder(c0117, i);
    }

    @Override // l.AbstractC19916, l.InterfaceC3583
    public final boolean hasField(C0117 c0117) {
        if (c0117.m1126()) {
            m9112(c0117);
            C3687 c3687 = this.f9424;
            return c3687 != null && c3687.m11245(c0117);
        }
        return super.hasField(c0117);
    }

    @Override // l.AbstractC19916, l.InterfaceC14165
    public final InterfaceC14165 setField(C0117 c0117, Object obj) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11243(c0117, obj);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.setField(c0117, obj);
    }

    @Override // l.AbstractC19916, l.InterfaceC14165
    public final AbstractC19916 setField(C0117 c0117, Object obj) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11243(c0117, obj);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.setField(c0117, obj);
    }

    @Override // l.AbstractC19916, l.InterfaceC14165
    public final InterfaceC14165 clearField(C0117 c0117) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11237(c0117);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.clearField(c0117);
    }

    @Override // l.AbstractC19916, l.InterfaceC14165
    public final AbstractC19916 clearField(C0117 c0117) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11237(c0117);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.clearField(c0117);
    }

    @Override // l.AbstractC19916
    public final InterfaceC14165 setRepeatedField(C0117 c0117, int i, Object obj) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11238(c0117, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.setRepeatedField(c0117, i, obj);
    }

    @Override // l.AbstractC19916
    public final AbstractC19916 setRepeatedField(C0117 c0117, int i, Object obj) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11238(c0117, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.setRepeatedField(c0117, i, obj);
    }

    @Override // l.AbstractC19916, l.InterfaceC14165
    public final InterfaceC14165 addRepeatedField(C0117 c0117, Object obj) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11239(c0117, obj);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.addRepeatedField(c0117, obj);
    }

    @Override // l.AbstractC19916, l.InterfaceC14165
    public final AbstractC19916 addRepeatedField(C0117 c0117, Object obj) {
        if (c0117.m1126()) {
            m9112(c0117);
            m9113();
            this.f9424.m11239(c0117, obj);
            onChanged();
            return this;
        }
        return (AbstractC2982) super.addRepeatedField(c0117, obj);
    }

    @Override // l.AbstractC19916, l.InterfaceC14165
    public final InterfaceC14165 newBuilderForField(C0117 c0117) {
        if (c0117.m1126()) {
            return new C12818(c0117.m1147(), 0);
        }
        return super.newBuilderForField(c0117);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9115(AbstractC12154 abstractC12154) {
        if (abstractC12154.f36261 != null) {
            m9113();
            this.f9424.m11240(abstractC12154.f36261);
            onChanged();
        }
    }

    @Override // l.AbstractC19916
    public final boolean parseUnknownField(AbstractC7297 abstractC7297, C17798 c17798, int i) {
        m9113();
        abstractC7297.getClass();
        return C7816.m20899(abstractC7297, getUnknownFieldSetBuilder(), c17798, getDescriptorForType(), new C0054(this.f9424), i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9112(C0117 c0117) {
        if (c0117.m1144() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
