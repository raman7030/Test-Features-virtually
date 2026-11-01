package p067l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13919 extends AbstractC6285 implements InterfaceC5773 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public final C20625 f39272;

    @Override // p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public /* bridge */ /* synthetic */ InterfaceC10467 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public AbstractC13919() {
        this.f39272 = C20625.m46596();
    }

    public AbstractC13919(AbstractC5202 abstractC5202) {
        super(abstractC5202);
        this.f39272 = AbstractC5202.m11163(abstractC5202);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m31641(AbstractC13210 abstractC13210) {
        AbstractC7845 abstractC7845M14277 = AbstractC6285.m14277(abstractC13210);
        if (abstractC7845M14277.mo18131().m3545() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC7845M14277.mo18131().m3545().mo3542() + "\" which does not match message type \"" + getDescriptorForType().mo3542() + "\".");
        }
        C2479 c2479Mo18131 = abstractC7845M14277.mo18131();
        Object objM46607 = this.f39272.m46607((InterfaceC19954) c2479Mo18131);
        if (objM46607 == null) {
            if (c2479Mo18131.mo3530()) {
                return Collections.EMPTY_LIST;
            }
            if (c2479Mo18131.m3539() == EnumC19915.MESSAGE) {
                return abstractC7845M14277.mo18132();
            }
            return abstractC7845M14277.mo18128(c2479Mo18131.m3523());
        }
        return abstractC7845M14277.mo18128(objM46607);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m31639() {
        return this.f39272.m46622();
    }

    @Override // p067l.AbstractC6285, p067l.AbstractC10645, p067l.InterfaceC17171, p067l.InterfaceC10029
    public boolean isInitialized() {
        return super.isInitialized() && this.f39272.m46622();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m31642() {
        return this.f39272.m46620();
    }

    /* JADX INFO: renamed from: ۢ */
    public final Map m31640() {
        return this.f39272.m46615();
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC5773
    public final Map getAllFields() {
        Map mapM14258 = m14258(false);
        mapM14258.putAll(this.f39272.m46615());
        return C21562.unmodifiableMap(mapM14258);
    }

    @Override // p067l.AbstractC6285
    public final Map getAllFieldsRaw() {
        Map mapM14258 = m14258(false);
        mapM14258.putAll(this.f39272.m46615());
        return C21562.unmodifiableMap(mapM14258);
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC5773
    public final boolean hasField(C2479 c2479) {
        if (c2479.m3527()) {
            m31638(c2479);
            return this.f39272.m46613(c2479);
        }
        return super.hasField(c2479);
    }

    @Override // p067l.AbstractC6285, p067l.InterfaceC5773
    public final Object getField(C2479 c2479) {
        if (c2479.m3527()) {
            m31638(c2479);
            Object objM46607 = this.f39272.m46607((InterfaceC19954) c2479);
            if (objM46607 != null) {
                return objM46607;
            }
            if (c2479.mo3530()) {
                return Collections.EMPTY_LIST;
            }
            if (c2479.m3539() == EnumC19915.MESSAGE) {
                return C13880.m31582(c2479.m3548());
            }
            return c2479.m3523();
        }
        return super.getField(c2479);
    }

    @Override // p067l.AbstractC6285
    public final int getRepeatedFieldCount(C2479 c2479) {
        if (c2479.m3527()) {
            m31638(c2479);
            C20625 c20625 = this.f39272;
            c20625.getClass();
            if (!c2479.mo3530()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM46607 = c20625.m46607((InterfaceC19954) c2479);
            if (objM46607 == null) {
                return 0;
            }
            return ((List) objM46607).size();
        }
        return super.getRepeatedFieldCount(c2479);
    }

    @Override // p067l.AbstractC6285
    public final Object getRepeatedField(C2479 c2479, int i) {
        if (c2479.m3527()) {
            m31638(c2479);
            C20625 c20625 = this.f39272;
            c20625.getClass();
            if (!c2479.mo3530()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM46607 = c20625.m46607((InterfaceC19954) c2479);
            if (objM46607 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List) objM46607).get(i);
        }
        return super.getRepeatedField(c2479, i);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31638(C2479 c2479) {
        if (c2479.m3545() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
