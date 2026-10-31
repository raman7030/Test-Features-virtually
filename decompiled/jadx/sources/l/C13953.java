package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13953 extends C17375 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7604 f41647;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC13669 f41648 = null;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IOException f41649 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DataInputStream f41650;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33398(DataInputStream dataInputStream) {
        this.f41650 = dataInputStream;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m33401() {
        try {
            return this.f41650.readUnsignedByte();
        } catch (IOException e) {
            this.f41649 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m33402() {
        try {
            return this.f41650.readUnsignedShort();
        } catch (IOException e) {
            this.f41649 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m33400(EnumC17734 enumC17734) throws IOException {
        this.f41649 = null;
        this.f41648 = null;
        this.f41647.f35255.m45778("Target Type: " + enumC17734.m41546(), new Object[0]);
        m40720(enumC17734);
        IOException iOException = this.f41649;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13669 m33399() {
        return this.f41648;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m33397() {
        return this.f41649 != null;
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ᩷ */
    public final void mo29370(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("Type Param Target: ", new Object[0]);
        int iM33401 = m33401();
        c7604.f35255.m45778(C18307.m42645(iM33401, "{ param_index: ", l.d), new Object[0]);
        if (m33397()) {
            return;
        }
        this.f41648 = new C22842(enumC17734, iM33401);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ᩻ */
    public final void mo29371(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("SuperType Target: ", new Object[0]);
        int iM33402 = m33402();
        c7604.f35255.m45778(C18307.m42645(iM33402, "{ type_index: ", l.d), new Object[0]);
        if (m33397()) {
            return;
        }
        this.f41648 = new C12259(enumC17734, iM33402);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۡ */
    public final void mo29361(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("TypeParam Bound Target: ", new Object[0]);
        int iM33401 = m33401();
        if (m33397()) {
            return;
        }
        int iM33402 = m33401();
        if (m33397()) {
            return;
        }
        c7604.f35255.m45778(C19373.m44634("{ param_index: ", iM33401, " bound_index: ", l.d, iM33402), new Object[0]);
        this.f41648 = new C11554(enumC17734, iM33401, iM33402);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ܽ */
    public final void mo29367(EnumC17734 enumC17734) {
        this.f41647.f35255.m45778("Empty Target: ", new Object[0]);
        if (m33397()) {
            return;
        }
        this.f41648 = new C21432(enumC17734);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ܿ */
    public final void mo29368(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("MethodFormalParam Target: ", new Object[0]);
        int iM33401 = m33401();
        c7604.f35255.m45778(C18307.m42645(iM33401, "{ param_index: ", l.d), new Object[0]);
        if (m33397()) {
            return;
        }
        this.f41648 = new C22137(enumC17734, iM33401);
    }

    public C13953(C7604 c7604) {
        this.f41647 = c7604;
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۜ */
    public final void mo29360(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("Throws Target: ", new Object[0]);
        int iM33402 = m33402();
        c7604.f35255.m45778(C18307.m42645(iM33402, "{ exception_index: ", l.d), new Object[0]);
        if (m33397()) {
            return;
        }
        this.f41648 = new C10143(enumC17734, iM33402);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ᩳ */
    public final void mo29369(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45778("LocalVar Target: ", new Object[0]);
        int iM33402 = m33402();
        if (m33397()) {
            return;
        }
        C3087 c3087 = new C3087(enumC17734, iM33402);
        this.f41648 = c3087;
        for (int i = 0; i < iM33402; i++) {
            int iM33403 = m33402();
            if (m33397()) {
                return;
            }
            int iM33404 = m33402();
            if (m33397()) {
                return;
            }
            int iM33405 = m33402();
            c7604.f35255.m45775(C18307.m42645(i, "LocalVar[", "]: "), new Object[0]);
            c7604.f35255.m45778(C3200.m9831(iM33405, l.d, C20361.m46682("{ startPC: ", iM33403, ", length: ", ", CPX: ", iM33404)), new Object[0]);
            c3087.m9437(iM33403, iM33404, iM33405);
        }
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۧ */
    public final void mo29364(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("Catch Target: ", new Object[0]);
        int iM33402 = m33402();
        c7604.f35255.m45778(C18307.m42645(iM33402, "{ catch_index: ", l.d), new Object[0]);
        if (m33397()) {
            return;
        }
        this.f41648 = new C15080(enumC17734, iM33402);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ܳ */
    public final void mo29365(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("Offset Target: ", new Object[0]);
        int iM33402 = m33402();
        c7604.f35255.m45778(C18307.m42645(iM33402, "{ offset_index: ", l.d), new Object[0]);
        if (m33397()) {
            return;
        }
        this.f41648 = new C12964(enumC17734, iM33402);
    }

    @Override // l.C17375
    /* JADX INFO: renamed from: ۢ */
    public final void mo29362(EnumC17734 enumC17734) {
        C7604 c7604 = this.f41647;
        c7604.f35255.m45775("TypeArg Target: ", new Object[0]);
        int iM33402 = m33402();
        if (m33397()) {
            return;
        }
        int iM33401 = m33401();
        if (m33397()) {
            return;
        }
        c7604.f35255.m45778(C19373.m44634("{ offset: ", iM33402, " type_index: ", l.d, iM33401), new Object[0]);
        this.f41648 = new C5909(enumC17734, iM33402, iM33401);
    }
}
