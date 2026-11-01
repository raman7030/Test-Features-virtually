package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15629 extends C18882 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C9595 f44728;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC15359 f44729 = null;

    /* JADX INFO: renamed from: ᩸ */
    public IOException f44730 = null;

    /* JADX INFO: renamed from: ᩹ */
    public DataInputStream f44731;

    /* JADX INFO: renamed from: ֫ */
    public final void m35517(DataInputStream dataInputStream) {
        this.f44731 = dataInputStream;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m35520() {
        try {
            return this.f44731.readUnsignedByte();
        } catch (IOException e) {
            this.f44730 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m35521() {
        try {
            return this.f44731.readUnsignedShort();
        } catch (IOException e) {
            this.f44730 = e;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m35519(EnumC19222 enumC19222) throws IOException {
        this.f44730 = null;
        this.f44729 = null;
        this.f44728.f38257.m48090("Target Type: " + enumC19222.m43791(), new Object[0]);
        m42972(enumC19222);
        IOException iOException = this.f44730;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15359 m35518() {
        return this.f44729;
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m35516() {
        return this.f44730 != null;
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ᩷ */
    public final void mo31430(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("Type Param Target: ", new Object[0]);
        int iM35520 = m35520();
        c9595.f38257.m48090(C19768.m44906(iM35520, "{ param_index: ", C0249l.f1198d), new Object[0]);
        if (m35516()) {
            return;
        }
        this.f44729 = new C24077(enumC19222, iM35520);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ᩻ */
    public final void mo31431(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("SuperType Target: ", new Object[0]);
        int iM35521 = m35521();
        c9595.f38257.m48090(C19768.m44906(iM35521, "{ type_index: ", C0249l.f1198d), new Object[0]);
        if (m35516()) {
            return;
        }
        this.f44729 = new C14019(enumC19222, iM35521);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۡ */
    public final void mo31421(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("TypeParam Bound Target: ", new Object[0]);
        int iM35520 = m35520();
        if (m35516()) {
            return;
        }
        int iM35521 = m35520();
        if (m35516()) {
            return;
        }
        c9595.f38257.m48090(C20780.m46928("{ param_index: ", iM35520, " bound_index: ", C0249l.f1198d, iM35521), new Object[0]);
        this.f44729 = new C13349(enumC19222, iM35520, iM35521);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ܽ */
    public final void mo31427(EnumC19222 enumC19222) {
        this.f44728.f38257.m48090("Empty Target: ", new Object[0]);
        if (m35516()) {
            return;
        }
        this.f44729 = new C22737(enumC19222);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ܿ */
    public final void mo31428(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("MethodFormalParam Target: ", new Object[0]);
        int iM35520 = m35520();
        c9595.f38257.m48090(C19768.m44906(iM35520, "{ param_index: ", C0249l.f1198d), new Object[0]);
        if (m35516()) {
            return;
        }
        this.f44729 = new C23407(enumC19222, iM35520);
    }

    public C15629(C9595 c9595) {
        this.f44728 = c9595;
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۜ */
    public final void mo31420(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("Throws Target: ", new Object[0]);
        int iM35521 = m35521();
        c9595.f38257.m48090(C19768.m44906(iM35521, "{ exception_index: ", C0249l.f1198d), new Object[0]);
        if (m35516()) {
            return;
        }
        this.f44729 = new C12008(enumC19222, iM35521);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ᩳ */
    public final void mo31429(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48090("LocalVar Target: ", new Object[0]);
        int iM35521 = m35521();
        if (m35516()) {
            return;
        }
        C5302 c5302 = new C5302(enumC19222, iM35521);
        this.f44729 = c5302;
        for (int i = 0; i < iM35521; i++) {
            int iM35522 = m35521();
            if (m35516()) {
                return;
            }
            int iM35523 = m35521();
            if (m35516()) {
                return;
            }
            int iM35524 = m35521();
            c9595.f38257.m48087(C19768.m44906(i, "LocalVar[", "]: "), new Object[0]);
            c9595.f38257.m48090(C5410.m11876(iM35524, C0249l.f1198d, C21720.m49005("{ startPC: ", iM35522, ", length: ", ", CPX: ", iM35523)), new Object[0]);
            c5302.m11480(iM35522, iM35523, iM35524);
        }
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۧ */
    public final void mo31424(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("Catch Target: ", new Object[0]);
        int iM35521 = m35521();
        c9595.f38257.m48090(C19768.m44906(iM35521, "{ catch_index: ", C0249l.f1198d), new Object[0]);
        if (m35516()) {
            return;
        }
        this.f44729 = new C16700(enumC19222, iM35521);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ܳ */
    public final void mo31425(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("Offset Target: ", new Object[0]);
        int iM35521 = m35521();
        c9595.f38257.m48090(C19768.m44906(iM35521, "{ offset_index: ", C0249l.f1198d), new Object[0]);
        if (m35516()) {
            return;
        }
        this.f44729 = new C14689(enumC19222, iM35521);
    }

    @Override // p067l.C18882
    /* JADX INFO: renamed from: ۢ */
    public final void mo31422(EnumC19222 enumC19222) {
        C9595 c9595 = this.f44728;
        c9595.f38257.m48087("TypeArg Target: ", new Object[0]);
        int iM35521 = m35521();
        if (m35516()) {
            return;
        }
        int iM35520 = m35520();
        if (m35516()) {
            return;
        }
        c9595.f38257.m48090(C20780.m46928("{ offset: ", iM35521, " type_index: ", C0249l.f1198d, iM35520), new Object[0]);
        this.f44729 = new C7984(enumC19222, iM35521, iM35520);
    }
}
