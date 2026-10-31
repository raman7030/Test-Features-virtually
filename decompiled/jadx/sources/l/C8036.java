package l;

/* JADX INFO: renamed from: l.۠۟ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8036 extends AbstractC9198 {
    public final /* synthetic */ int h;

    public /* synthetic */ C8036(int i) {
        this.h = i;
    }

    @Override // l.AbstractC9198
    public final InterfaceC18204 e0() {
        switch (this.h) {
            case 0:
                return new C4009();
            case 1:
                return new C3387();
            case 2:
                return new C16252();
            default:
                return new C16708();
        }
    }

    @Override // l.AbstractC9198, l.InterfaceC21048
    public final Object b(AbstractC12725 abstractC12725, InterfaceC15234 interfaceC15234) {
        switch (this.h) {
            case 0:
                return EnumC7330.SIZED.s(abstractC12725.m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.b(abstractC12725, interfaceC15234);
            case 1:
                return EnumC7330.SIZED.s(abstractC12725.m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.b(abstractC12725, interfaceC15234);
            case 2:
                return EnumC7330.SIZED.s(abstractC12725.m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.b(abstractC12725, interfaceC15234);
            default:
                return EnumC7330.SIZED.s(abstractC12725.m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.b(abstractC12725, interfaceC15234);
        }
    }

    @Override // l.AbstractC9198, l.InterfaceC21048
    public final Object e(AbstractC9198 abstractC9198, InterfaceC15234 interfaceC15234) {
        switch (this.h) {
            case 0:
                return EnumC7330.SIZED.s(((AbstractC12725) abstractC9198).m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.e(abstractC9198, interfaceC15234);
            case 1:
                return EnumC7330.SIZED.s(((AbstractC12725) abstractC9198).m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.e(abstractC9198, interfaceC15234);
            case 2:
                return EnumC7330.SIZED.s(((AbstractC12725) abstractC9198).m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.e(abstractC9198, interfaceC15234);
            default:
                return EnumC7330.SIZED.s(((AbstractC12725) abstractC9198).m) ? Long.valueOf(interfaceC15234.getExactSizeIfKnown()) : (Long) super.e(abstractC9198, interfaceC15234);
        }
    }

    @Override // l.AbstractC9198, l.InterfaceC21048
    public final int j() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return EnumC7330.r;
    }
}
