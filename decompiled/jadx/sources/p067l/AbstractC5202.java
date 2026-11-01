package p067l;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5202 extends AbstractC21296 implements InterfaceC5773 {

    /* JADX INFO: renamed from: ᩸ */
    public C5872 f12223;

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public AbstractC5202 clear() {
        this.f12223 = null;
        return (AbstractC5202) super.clear();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m11165() {
        if (this.f12223 == null) {
            int i = C20625.f63707;
            this.f12223 = new C5872(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11166(AbstractC13210 abstractC13210, C16362 c16362) {
        AbstractC7845 abstractC7845M14277 = AbstractC6285.m14277(abstractC13210);
        if (abstractC7845M14277.mo18131().m3545() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC7845M14277.mo18131().m3545().mo3542() + "\" which does not match message type \"" + getDescriptorForType().mo3542() + "\".");
        }
        m11165();
        this.f12223.m13189(abstractC7845M14277.mo18131(), abstractC7845M14277.mo18129(c16362));
        onChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m11168() {
        C5872 c5872 = this.f12223;
        return c5872 == null || c5872.m13192();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20625 m11163(AbstractC5202 abstractC5202) {
        C5872 c5872 = abstractC5202.f12223;
        if (c5872 == null) {
            return C20625.m46597();
        }
        return c5872.m13188();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC17171, p067l.InterfaceC10029
    public boolean isInitialized() {
        return super.isInitialized() && m11168();
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC5773
    public final Map getAllFields() {
        Map mapM48145 = m48145();
        C5872 c5872 = this.f12223;
        if (c5872 != null) {
            mapM48145.putAll(c5872.m13190());
        }
        return C21562.unmodifiableMap(mapM48145);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC5773
    public final Object getField(C2479 c2479) {
        if (c2479.m3527()) {
            m11164(c2479);
            C5872 c5872 = this.f12223;
            Object objM13187 = c5872 == null ? null : c5872.m13187(c2479);
            if (objM13187 != null) {
                return objM13187;
            }
            if (c2479.m3539() == EnumC19915.MESSAGE) {
                return C13880.m31582(c2479.m3548());
            }
            return c2479.m3523();
        }
        return super.getField(c2479);
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 getFieldBuilder(C2479 c2479) {
        if (c2479.m3527()) {
            m11164(c2479);
            if (c2479.m3539() != EnumC19915.MESSAGE) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            m11165();
            Object objM13180 = this.f12223.m13180((InterfaceC19954) c2479);
            if (objM13180 == null) {
                C14550 c14550 = new C14550(c2479.m3548(), 0);
                this.f12223.m13189(c2479, c14550);
                onChanged();
                return c14550;
            }
            if (objM13180 instanceof InterfaceC15830) {
                return (InterfaceC15830) objM13180;
            }
            if (objM13180 instanceof InterfaceC24548) {
                InterfaceC15830 builder = ((InterfaceC24548) objM13180).toBuilder();
                this.f12223.m13189(c2479, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getFieldBuilder(c2479);
    }

    @Override // p067l.AbstractC21296
    public final int getRepeatedFieldCount(C2479 c2479) {
        if (c2479.m3527()) {
            m11164(c2479);
            C5872 c5872 = this.f12223;
            if (c5872 == null) {
                return 0;
            }
            c5872.getClass();
            if (!c2479.mo3530()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object objM13180 = c5872.m13180((InterfaceC19954) c2479);
            if (objM13180 == null) {
                return 0;
            }
            return ((List) objM13180).size();
        }
        return super.getRepeatedFieldCount(c2479);
    }

    @Override // p067l.AbstractC21296
    public final Object getRepeatedField(C2479 c2479, int i) {
        if (c2479.m3527()) {
            m11164(c2479);
            C5872 c5872 = this.f12223;
            if (c5872 == null) {
                throw new IndexOutOfBoundsException();
            }
            return c5872.m13179(c2479, i);
        }
        return super.getRepeatedField(c2479, i);
    }

    @Override // p067l.AbstractC21296, p067l.AbstractC22045
    public final InterfaceC15830 getRepeatedFieldBuilder(C2479 c2479, int i) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            if (c2479.m3539() != EnumC19915.MESSAGE) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            Object objM13181 = this.f12223.m13181((InterfaceC19954) c2479, i);
            if (objM13181 instanceof InterfaceC15830) {
                return (InterfaceC15830) objM13181;
            }
            if (objM13181 instanceof InterfaceC24548) {
                InterfaceC15830 builder = ((InterfaceC24548) objM13181).toBuilder();
                this.f12223.m13184(c2479, i, builder);
                onChanged();
                return builder;
            }
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        return super.getRepeatedFieldBuilder(c2479, i);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC5773
    public final boolean hasField(C2479 c2479) {
        if (c2479.m3527()) {
            m11164(c2479);
            C5872 c5872 = this.f12223;
            return c5872 != null && c5872.m13191(c2479);
        }
        return super.hasField(c2479);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830
    public final InterfaceC15830 setField(C2479 c2479, Object obj) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13189(c2479, obj);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.setField(c2479, obj);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830
    public final AbstractC21296 setField(C2479 c2479, Object obj) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13189(c2479, obj);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.setField(c2479, obj);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830
    public final InterfaceC15830 clearField(C2479 c2479) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13183(c2479);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.clearField(c2479);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830
    public final AbstractC21296 clearField(C2479 c2479) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13183(c2479);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.clearField(c2479);
    }

    @Override // p067l.AbstractC21296
    public final InterfaceC15830 setRepeatedField(C2479 c2479, int i, Object obj) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13184(c2479, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.setRepeatedField(c2479, i, obj);
    }

    @Override // p067l.AbstractC21296
    public final AbstractC21296 setRepeatedField(C2479 c2479, int i, Object obj) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13184(c2479, i, obj);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.setRepeatedField(c2479, i, obj);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830
    public final InterfaceC15830 addRepeatedField(C2479 c2479, Object obj) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13185(c2479, obj);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.addRepeatedField(c2479, obj);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830
    public final AbstractC21296 addRepeatedField(C2479 c2479, Object obj) {
        if (c2479.m3527()) {
            m11164(c2479);
            m11165();
            this.f12223.m13185(c2479, obj);
            onChanged();
            return this;
        }
        return (AbstractC5202) super.addRepeatedField(c2479, obj);
    }

    @Override // p067l.AbstractC21296, p067l.InterfaceC15830
    public final InterfaceC15830 newBuilderForField(C2479 c2479) {
        if (c2479.m3527()) {
            return new C14550(c2479.m3548(), 0);
        }
        return super.newBuilderForField(c2479);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11167(AbstractC13919 abstractC13919) {
        if (abstractC13919.f39272 != null) {
            m11165();
            this.f12223.m13186(abstractC13919.f39272);
            onChanged();
        }
    }

    @Override // p067l.AbstractC21296
    public final boolean parseUnknownField(AbstractC9303 abstractC9303, C19283 c19283, int i) {
        m11165();
        abstractC9303.getClass();
        return C9796.m22864(abstractC9303, getUnknownFieldSetBuilder(), c19283, getDescriptorForType(), new C2419(this.f12223), i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11164(C2479 c2479) {
        if (c2479.m3545() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
