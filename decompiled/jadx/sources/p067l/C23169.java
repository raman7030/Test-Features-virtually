package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩸᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9F8 */
/* JADX INFO: loaded from: classes.dex */
public final class C23169 extends AbstractC3722 {

    /* JADX INFO: renamed from: ۧ */
    public List f72779;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f72780;

    public C23169() {
        super(EnumC10428.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f72779 = new ArrayList();
    }

    public C23169(byte[] bArr, List list) {
        super(EnumC10428.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f72779 = list;
        this.f72780 = (byte[]) bArr.clone();
    }

    @Override // p067l.AbstractC3722
    /* JADX INFO: renamed from: ᩳ */
    public final int mo5153(C2460 c2460) {
        List list = this.f72779;
        if (list == null) {
            throw new IllegalStateException("There should be at least 1 hash algorithm provided");
        }
        if (this.f72780 == null) {
            throw new IllegalStateException("A salt should be provided");
        }
        c2460.m28111(list.size());
        c2460.m28111(this.f72780.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c2460.m28111((int) ((EnumC7430) it.next()).getValue());
        }
        byte[] bArr = this.f72780;
        c2460.m28102(bArr.length, bArr);
        return (list.size() * 2) + 4 + this.f72780.length;
    }

    @Override // p067l.AbstractC3722
    /* JADX INFO: renamed from: ۧ */
    public final void mo5152(C2460 c2460) throws C14862 {
        int iM28125 = c2460.m28125();
        int iM28126 = c2460.m28125();
        for (int i = 0; i < iM28125; i++) {
            int iM28127 = c2460.m28125();
            EnumC7430 enumC7430 = (EnumC7430) C16873.m38440(iM28127, EnumC7430.class, null);
            if (enumC7430 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3HashAlgorithm with value '%d'", Integer.valueOf(iM28127)));
            }
            this.f72779.add(enumC7430);
        }
        byte[] bArr = new byte[iM28126];
        c2460.m28112(iM28126, bArr);
        this.f72780 = bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m51624() {
        return this.f72779;
    }
}
