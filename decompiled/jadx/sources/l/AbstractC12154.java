package l;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12154 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19210 f36261;

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public /* bridge */ /* synthetic */ InterfaceC8522 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public AbstractC12154() {
        this.f36261 = C19210.m44301();
    }

    public AbstractC12154(AbstractC2982 abstractC2982) {
        super(abstractC2982);
        this.f36261 = AbstractC2982.m9111(abstractC2982);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m29576(AbstractC11408 abstractC11408) {
        AbstractC5763 abstractC5763M12388 = AbstractC4121.m12388(abstractC11408);
        if (abstractC5763M12388.mo16212().m1144() != getDescriptorForType()) {
            throw new IllegalArgumentException("Extension is for type \"" + abstractC5763M12388.mo16212().m1144().mo1141() + "\" which does not match message type \"" + getDescriptorForType().mo1141() + "\".");
        }
        C0117 c0117Mo16212 = abstractC5763M12388.mo16212();
        Object objM44312 = this.f36261.m44312((InterfaceC18504) c0117Mo16212);
        if (objM44312 == null) {
            if (c0117Mo16212.mo1129()) {
                return Collections.EMPTY_LIST;
            }
            if (c0117Mo16212.m1138() == EnumC18463.MESSAGE) {
                return abstractC5763M12388.mo16213();
            }
            return abstractC5763M12388.mo16209(c0117Mo16212.m1122());
        }
        return abstractC5763M12388.mo16209(objM44312);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m29574() {
        return this.f36261.m44327();
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public boolean isInitialized() {
        return super.isInitialized() && this.f36261.m44327();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m29577() {
        return this.f36261.m44325();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Map m29575() {
        return this.f36261.m44320();
    }

    @Override // l.AbstractC4121, l.InterfaceC3583
    public final Map getAllFields() {
        Map mapM12369 = m12369(false);
        mapM12369.putAll(this.f36261.m44320());
        return C20195.unmodifiableMap(mapM12369);
    }

    @Override // l.AbstractC4121
    public final Map getAllFieldsRaw() {
        Map mapM12369 = m12369(false);
        mapM12369.putAll(this.f36261.m44320());
        return C20195.unmodifiableMap(mapM12369);
    }

    @Override // l.AbstractC4121, l.InterfaceC3583
    public final boolean hasField(C0117 c0117) {
        if (c0117.m1126()) {
            m29573(c0117);
            return this.f36261.m44318(c0117);
        }
        return super.hasField(c0117);
    }

    @Override // l.AbstractC4121, l.InterfaceC3583
    public final Object getField(C0117 c0117) {
        if (c0117.m1126()) {
            m29573(c0117);
            Object objM44312 = this.f36261.m44312((InterfaceC18504) c0117);
            if (objM44312 != null) {
                return objM44312;
            }
            if (c0117.mo1129()) {
                return Collections.EMPTY_LIST;
            }
            if (c0117.m1138() == EnumC18463.MESSAGE) {
                return C12113.m29517(c0117.m1147());
            }
            return c0117.m1122();
        }
        return super.getField(c0117);
    }

    @Override // l.AbstractC4121
    public final int getRepeatedFieldCount(C0117 c0117) {
        if (c0117.m1126()) {
            m29573(c0117);
            C19210 c19210 = this.f36261;
            c19210.getClass();
            if (!c0117.mo1129()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM44312 = c19210.m44312((InterfaceC18504) c0117);
            if (objM44312 == null) {
                return 0;
            }
            return ((List) objM44312).size();
        }
        return super.getRepeatedFieldCount(c0117);
    }

    @Override // l.AbstractC4121
    public final Object getRepeatedField(C0117 c0117, int i) {
        if (c0117.m1126()) {
            m29573(c0117);
            C19210 c19210 = this.f36261;
            c19210.getClass();
            if (!c0117.mo1129()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objM44312 = c19210.m44312((InterfaceC18504) c0117);
            if (objM44312 == null) {
                throw new IndexOutOfBoundsException();
            }
            return ((List) objM44312).get(i);
        }
        return super.getRepeatedField(c0117, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29573(C0117 c0117) {
        if (c0117.m1144() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }
}
