package p067l;

/* JADX INFO: renamed from: l.᩻ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes.dex */
public class C24626 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6125 f77961;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC23995 f77962;

    /* JADX INFO: renamed from: ܽ */
    public final C17010 f77963;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C11216 f77964;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC6462 f77965;

    /* JADX INFO: renamed from: ֫ */
    public boolean mo8843(AbstractC7257 abstractC7257) {
        return false;
    }

    public C24626(C11216 c11216, C17010 c17010, AbstractC6462 abstractC6462) {
        this(c11216, c17010, abstractC6462, c11216.f31163.f49905, EnumC23995.f76209);
    }

    public C24626(C11216 c11216, C17010 c17010, AbstractC6462 abstractC6462, InterfaceC6125 interfaceC6125) {
        this(c11216, c17010, abstractC6462, interfaceC6125, EnumC23995.f76209);
    }

    public C24626(C11216 c11216, C17010 c17010, AbstractC6462 abstractC6462, InterfaceC6125 interfaceC6125, EnumC23995 enumC23995) {
        this.f77964 = c11216;
        this.f77963 = c17010;
        this.f77965 = abstractC6462;
        this.f77961 = interfaceC6125;
        this.f77962 = enumC23995;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 mo15456(InterfaceC5323 interfaceC5323, AbstractC6462 abstractC6462) {
        return this.f77964.f31163.m38267(interfaceC5323, abstractC6462, this.f77965, this.f77961);
    }

    /* JADX INFO: renamed from: ֫ */
    public C24626 mo40740(AbstractC6462 abstractC6462) {
        return new C24626(this.f77964, this.f77963, abstractC6462, this.f77961, this.f77962);
    }

    /* JADX INFO: renamed from: ֫ */
    public C24626 mo40739(InterfaceC6125 interfaceC6125) {
        return new C24626(this.f77964, this.f77963, this.f77965, interfaceC6125, this.f77962);
    }

    /* JADX INFO: renamed from: ֫ */
    public C24626 mo40741(AbstractC6462 abstractC6462, InterfaceC6125 interfaceC6125, EnumC23995 enumC23995) {
        return new C24626(this.f77964, this.f77963, abstractC6462, interfaceC6125, enumC23995);
    }

    /* JADX INFO: renamed from: ֫ */
    public C24626 mo40742(EnumC23995 enumC23995) {
        return new C24626(this.f77964, this.f77963, this.f77965, this.f77961, enumC23995);
    }

    public final String toString() {
        AbstractC6462 abstractC6462 = this.f77965;
        return abstractC6462 != null ? abstractC6462.toString() : "";
    }
}
