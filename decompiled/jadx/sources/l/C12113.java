package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.۫ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12113 extends AbstractC8709 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C9249 f36186;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17757 f36187;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0117[] f36188;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19210 f36189;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f36190 = -1;

    public C12113(C17757 c17757, C19210 c19210, C0117[] c0117Arr, C9249 c9249) {
        this.f36187 = c17757;
        this.f36189 = c19210;
        this.f36188 = c0117Arr;
        this.f36186 = c9249;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12113 m29517(C17757 c17757) {
        return new C12113(c17757, C19210.m44302(), new C0117[c17757.mo1132().m46756()], C9249.m23740());
    }

    @Override // l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return this.f36187;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return m29517(this.f36187);
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return m29517(this.f36187);
    }

    @Override // l.InterfaceC3583
    public final Map getAllFields() {
        return this.f36189.m44320();
    }

    @Override // l.InterfaceC3583
    public final C9249 getUnknownFields() {
        return this.f36186;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        Iterator it = this.f36187.getFields().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C19210 c19210 = this.f36189;
            if (zHasNext) {
                C0117 c0117 = (C0117) it.next();
                if (c0117.m1128() && !c19210.m44318(c0117)) {
                    return false;
                }
            } else {
                return c19210.m44327();
            }
        }
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        boolean zM39380 = this.f36187.m41593().m39380();
        C9249 c9249 = this.f36186;
        C19210 c19210 = this.f36189;
        if (zM39380) {
            c19210.m44315(abstractC14766);
            c9249.m23743(abstractC14766);
        } else {
            c19210.m44321(abstractC14766);
            c9249.writeTo(abstractC14766);
        }
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int iM44325;
        int serializedSize;
        int i = this.f36190;
        if (i != -1) {
            return i;
        }
        boolean zM39380 = this.f36187.m41593().m39380();
        C9249 c9249 = this.f36186;
        C19210 c19210 = this.f36189;
        if (zM39380) {
            iM44325 = c19210.m44323();
            serializedSize = c9249.m23745();
        } else {
            iM44325 = c19210.m44325();
            serializedSize = c9249.getSerializedSize();
        }
        int i2 = serializedSize + iM44325;
        this.f36190 = i2;
        return i2;
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C12818 newBuilderForType() {
        return new C12818(this.f36187, 0);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC23338) this);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 toBuilder() {
        return newBuilderForType().mergeFrom((InterfaceC23338) this);
    }

    @Override // l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return new C4352(this);
    }

    @Override // l.InterfaceC3583
    public final Object getField(C0117 c0117) {
        if (c0117.m1144() == this.f36187) {
            Object objM44312 = this.f36189.m44312((InterfaceC18504) c0117);
            if (objM44312 != null) {
                return objM44312;
            }
            if (c0117.mo1129()) {
                return Collections.EMPTY_LIST;
            }
            if (c0117.m1138() == EnumC18463.MESSAGE) {
                return m29517(c0117.m1147());
            }
            return c0117.m1122();
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // l.InterfaceC3583
    public final boolean hasField(C0117 c0117) {
        if (c0117.m1144() == this.f36187) {
            return this.f36189.m44318(c0117);
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // l.AbstractC8709
    public final C0117 getOneofFieldDescriptor(C14934 c14934) {
        if (c14934.m35389() == this.f36187) {
            return this.f36188[c14934.m35387()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC8709
    public final boolean hasOneof(C14934 c14934) {
        if (c14934.m35389() == this.f36187) {
            return this.f36188[c14934.m35387()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }
}
