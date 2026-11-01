package p067l;

/* JADX INFO: renamed from: l.ܰܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R85J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15631 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ۙ */
    public static final InterfaceC16992 f44732;

    /* JADX INFO: renamed from: ᩶ */
    public static final InterfaceC16992 f44733;

    /* JADX INFO: renamed from: ᩸ */
    public final ConcurrentMapC12768 f44734 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ᩹ */
    public final C21688 f44735;

    static {
        int i = 0;
        f44733 = new C24349(i);
        f44732 = new C24349(i);
    }

    public C15631(C21688 c21688) {
        this.f44735 = c21688;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        InterfaceC23029 interfaceC23029 = (InterfaceC23029) c18020.m41004().getAnnotation(InterfaceC23029.class);
        if (interfaceC23029 == null) {
            return null;
        }
        return m35522(this.f44735, c14271, c18020, interfaceC23029, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 m35522(C21688 c21688, C14271 c14271, C18020 c18020, InterfaceC23029 interfaceC23029, boolean z) {
        InterfaceC16992 interfaceC16992;
        AbstractC10288 c16892;
        Object objMo14676 = c21688.m48962(C18020.m41001(interfaceC23029.value()), true).mo14676();
        boolean zNullSafe = interfaceC23029.nullSafe();
        if (objMo14676 instanceof AbstractC10288) {
            c16892 = (AbstractC10288) objMo14676;
        } else if (objMo14676 instanceof InterfaceC16992) {
            InterfaceC16992 interfaceC16993 = (InterfaceC16992) objMo14676;
            if (z) {
                InterfaceC16992 interfaceC16994 = (InterfaceC16992) this.f44734.putIfAbsent(c18020.m41004(), interfaceC16993);
                if (interfaceC16994 != null) {
                    interfaceC16993 = interfaceC16994;
                }
            }
            c16892 = interfaceC16993.mo10810(c14271, c18020);
        } else {
            boolean z2 = objMo14676 instanceof InterfaceC19005;
            if (z2 || (objMo14676 instanceof InterfaceC13601)) {
                InterfaceC19005 interfaceC19005 = z2 ? (InterfaceC19005) objMo14676 : null;
                InterfaceC13601 interfaceC13601 = objMo14676 instanceof InterfaceC13601 ? (InterfaceC13601) objMo14676 : null;
                if (z) {
                    interfaceC16992 = f44733;
                } else {
                    interfaceC16992 = f44732;
                }
                c16892 = new C16892(interfaceC19005, interfaceC13601, c14271, c18020, interfaceC16992, zNullSafe);
                zNullSafe = false;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objMo14676.getClass().getName() + " as a @JsonAdapter for " + c18020.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        return (c16892 == null || !zNullSafe) ? c16892 : c16892.m23905();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35523(InterfaceC16992 interfaceC16992, C18020 c18020) {
        C12826.requireNonNull(c18020);
        C12826.requireNonNull(interfaceC16992);
        if (interfaceC16992 != f44733) {
            Class clsM41004 = c18020.m41004();
            ConcurrentMapC12768 concurrentMapC12768 = this.f44734;
            InterfaceC16992 interfaceC16993 = (InterfaceC16992) concurrentMapC12768.get(clsM41004);
            if (interfaceC16993 == null) {
                InterfaceC23029 interfaceC23029 = (InterfaceC23029) clsM41004.getAnnotation(InterfaceC23029.class);
                if (interfaceC23029 == null) {
                    return false;
                }
                Class clsValue = interfaceC23029.value();
                if (!InterfaceC16992.class.isAssignableFrom(clsValue)) {
                    return false;
                }
                InterfaceC16992 interfaceC16994 = (InterfaceC16992) this.f44735.m48962(C18020.m41001(clsValue), true).mo14676();
                InterfaceC16992 interfaceC16995 = (InterfaceC16992) concurrentMapC12768.putIfAbsent(clsM41004, interfaceC16994);
                if (interfaceC16995 != null) {
                    interfaceC16994 = interfaceC16995;
                }
                if (interfaceC16994 != interfaceC16992) {
                    return false;
                }
            } else if (interfaceC16993 != interfaceC16992) {
                return false;
            }
        }
        return true;
    }
}
