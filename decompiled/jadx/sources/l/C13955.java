package l;

/* JADX INFO: renamed from: l.ܰܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R85J */
/* JADX INFO: loaded from: classes4.dex */
public final class C13955 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f41651;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15387 f41652;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f41653 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20328 f41654;

    static {
        int i = 0;
        f41652 = new C23128(i);
        f41651 = new C23128(i);
    }

    public C13955(C20328 c20328) {
        this.f41654 = c20328;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        InterfaceC21739 interfaceC21739 = (InterfaceC21739) c16469.m38778().getAnnotation(InterfaceC21739.class);
        if (interfaceC21739 == null) {
            return null;
        }
        return m33403(this.f41654, c12524, c16469, interfaceC21739, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 m33403(C20328 c20328, C12524 c12524, C16469 c16469, InterfaceC21739 interfaceC21739, boolean z) {
        InterfaceC15387 interfaceC15387;
        AbstractC8333 c15282;
        Object objMo12796 = c20328.m46639(C16469.m38775(interfaceC21739.value()), true).mo12796();
        boolean zNullSafe = interfaceC21739.nullSafe();
        if (objMo12796 instanceof AbstractC8333) {
            c15282 = (AbstractC8333) objMo12796;
        } else if (objMo12796 instanceof InterfaceC15387) {
            InterfaceC15387 interfaceC15388 = (InterfaceC15387) objMo12796;
            if (z) {
                InterfaceC15387 interfaceC15389 = (InterfaceC15387) this.f41653.putIfAbsent(c16469.m38778(), interfaceC15388);
                if (interfaceC15389 != null) {
                    interfaceC15388 = interfaceC15389;
                }
            }
            c15282 = interfaceC15388.mo8743(c12524, c16469);
        } else {
            boolean z2 = objMo12796 instanceof InterfaceC17505;
            if (z2 || (objMo12796 instanceof InterfaceC11819)) {
                InterfaceC17505 interfaceC17505 = z2 ? (InterfaceC17505) objMo12796 : null;
                InterfaceC11819 interfaceC11819 = objMo12796 instanceof InterfaceC11819 ? (InterfaceC11819) objMo12796 : null;
                if (z) {
                    interfaceC15387 = f41652;
                } else {
                    interfaceC15387 = f41651;
                }
                c15282 = new C15282(interfaceC17505, interfaceC11819, c12524, c16469, interfaceC15387, zNullSafe);
                zNullSafe = false;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo12796.getClass().getName() + " as a @JsonAdapter for " + c16469.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (c15282 == null || !zNullSafe) ? c15282 : c15282.m21935();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33404(InterfaceC15387 interfaceC15387, C16469 c16469) {
        C11003.requireNonNull(c16469);
        C11003.requireNonNull(interfaceC15387);
        if (interfaceC15387 != f41652) {
            Class clsM38778 = c16469.m38778();
            ConcurrentMapC10942 concurrentMapC10942 = this.f41653;
            InterfaceC15387 interfaceC15388 = (InterfaceC15387) concurrentMapC10942.get(clsM38778);
            if (interfaceC15388 == null) {
                InterfaceC21739 interfaceC21739 = (InterfaceC21739) clsM38778.getAnnotation(InterfaceC21739.class);
                if (interfaceC21739 == null) {
                    return false;
                }
                Class clsValue = interfaceC21739.value();
                if (!InterfaceC15387.class.isAssignableFrom(clsValue)) {
                    return false;
                }
                InterfaceC15387 interfaceC15389 = (InterfaceC15387) this.f41654.m46639(C16469.m38775(clsValue), true).mo12796();
                InterfaceC15387 interfaceC153810 = (InterfaceC15387) concurrentMapC10942.putIfAbsent(clsM38778, interfaceC15389);
                if (interfaceC153810 != null) {
                    interfaceC15389 = interfaceC153810;
                }
                if (interfaceC15389 != interfaceC15387) {
                    return false;
                }
            } else if (interfaceC15388 != interfaceC15387) {
                return false;
            }
        }
        return true;
    }
}
