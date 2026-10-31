package l;

import java.io.DataInputStream;
import java.text.MessageFormat;

/* JADX INFO: renamed from: l.ܶܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DQ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15343 extends AbstractC9701 {

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public String f47009;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public String f47010;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public short f47011;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C10242 f47012;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public short f47013;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public short f47014;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public short f47015;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public short f47016;

    public AbstractC15343(DataInputStream dataInputStream, C17503 c17503, String str) {
        this.f47016 = dataInputStream.readShort();
        this.f47015 = dataInputStream.readShort();
        this.f47014 = dataInputStream.readShort();
        this.f47011 = dataInputStream.readShort();
        this.f47013 = dataInputStream.readShort();
        this.f29325 = c17503.f29325;
        this.f47012 = c17503.f35264;
        int iM28907 = c17503.m28907("Start");
        this.f47009 = String.format(MessageFormat.format("%{0}s  Length  Slot  Name    %s", Integer.valueOf(iM28907)), "Start", str);
        this.f47010 = MessageFormat.format("%{0}d  %6d  %4d  %4s  %s", Integer.valueOf(iM28907));
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ᩳ */
    public final void mo4067(int i, int i2) {
        m24664(1);
        if (i == 0) {
            m24665(mo4065());
            m24665(this.f47009);
        }
        StringBuilder sb = new StringBuilder("#");
        short s = this.f47014;
        sb.append((int) s);
        String strM24657 = m24657(6, sb.toString());
        C10242 c10242 = this.f47012;
        String strM25964 = c10242.m25964(s);
        short s2 = this.f47011;
        String strM25965 = c10242.m25964(s2);
        boolean z = this.f29326;
        short s3 = this.f47013;
        short s4 = this.f47015;
        short s5 = this.f47016;
        String str = this.f47010;
        if (!z) {
            m24665(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), m24657(6, strM25964), strM25965));
            return;
        }
        if (this.f29343) {
            m24665(String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM24657, C19370.m44628(s2, "#")));
            return;
        }
        m24658(m24657(mo6398(), String.format(str, Short.valueOf(s5), Short.valueOf(s4), Short.valueOf(s3), strM24657, String.format("%-4s", C19370.m44628(s2, "#")))));
        m24662(" // " + strM25964 + ":" + strM25965);
    }

    @Override // l.AbstractC9701
    /* JADX INFO: renamed from: ܿ */
    public final int mo6398() {
        return this.f29349 + 7;
    }
}
