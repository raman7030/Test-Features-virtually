package p067l;

import java.io.DataInputStream;
import java.text.MessageFormat;

/* JADX INFO: renamed from: l.ܶܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DQ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16950 extends AbstractC11588 {

    /* JADX INFO: renamed from: ۗ֫ */
    public String f50134;

    /* JADX INFO: renamed from: ۙ֫ */
    public String f50135;

    /* JADX INFO: renamed from: ۛ֫ */
    public short f50136;

    /* JADX INFO: renamed from: ۤ֫ */
    public C12102 f50137;

    /* JADX INFO: renamed from: ۨ֫ */
    public short f50138;

    /* JADX INFO: renamed from: ۫֫ */
    public short f50139;

    /* JADX INFO: renamed from: ۬֫ */
    public short f50140;

    /* JADX INFO: renamed from: ᩺֫ */
    public short f50141;

    public AbstractC16950(DataInputStream dataInputStream, C19003 c19003, String str) {
        this.f50141 = dataInputStream.readShort();
        this.f50140 = dataInputStream.readShort();
        this.f50139 = dataInputStream.readShort();
        this.f50136 = dataInputStream.readShort();
        this.f50138 = dataInputStream.readShort();
        this.f32274 = c19003.f32274;
        this.f50137 = c19003.f38266;
        int iM30956 = c19003.m30956("Start");
        this.f50134 = String.format(MessageFormat.format("%{0}s  Length  Slot  Name    %s", Integer.valueOf(iM30956)), "Start", str);
        this.f50135 = MessageFormat.format("%{0}d  %6d  %4d  %4s  %s", Integer.valueOf(iM30956));
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6311(int i, int i2) {
        m26678(1);
        if (i == 0) {
            m26679(mo6309());
            m26679(this.f50134);
        }
        StringBuilder sb = new StringBuilder("#");
        short s = this.f50139;
        sb.append((int) s);
        String strM26671 = m26671(6, sb.toString());
        C12102 c12102 = this.f50137;
        String strM27986 = c12102.m27986(s);
        short s2 = this.f50136;
        String strM27987 = c12102.m27986(s2);
        boolean z = this.f32275;
        short s3 = this.f50138;
        short s4 = this.f50140;
        short s5 = this.f50141;
        String str = this.f50135;
        if (!z) {
            m26679(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), m26671(6, strM27986), strM27987));
            return;
        }
        if (this.f32292) {
            m26679(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM26671, C20778.m46922(s2, "#")));
            return;
        }
        m26672(m26671(mo8555(), String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM26671, String.format("%-4s", C20778.m46922(s2, "#")))));
        m26676(" // " + strM27986 + ":" + strM27987);
    }

    @Override // p067l.AbstractC11588
    /* JADX INFO: renamed from: ܿ */
    public final int mo8555() {
        return this.f32298 + 7;
    }
}
