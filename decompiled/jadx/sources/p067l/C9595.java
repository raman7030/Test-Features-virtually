package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۟ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9595 extends C8493 {

    /* JADX INFO: renamed from: ۖۧ */
    public AbstractC15359 f26406;

    /* JADX INFO: renamed from: ۘۧ */
    public final C15629 f26407;

    /* JADX INFO: renamed from: ᩴۧ */
    public final C3799 f26408;

    public C9595(AbstractC13599 abstractC13599, boolean z) {
        super(abstractC13599, z);
        this.f26407 = new C15629(this);
        this.f26406 = null;
        this.f26408 = new C3799();
        this.f22802 = "@T+";
        this.f22804 = "@T-";
    }

    @Override // p067l.C8493
    /* JADX INFO: renamed from: ۧ */
    public final void mo19750(DataInputStream dataInputStream) {
        int unsignedByte = dataInputStream.readUnsignedByte();
        EnumC19222 enumC19222M43787 = EnumC19222.m43787(unsignedByte);
        if (enumC19222M43787 == null) {
            throw new IOException(C19768.m44906(unsignedByte, "Bad target type: ", " in TypeAnnotationData"));
        }
        C15629 c15629 = this.f26407;
        c15629.m35517(dataInputStream);
        c15629.m35519(enumC19222M43787);
        this.f26406 = c15629.m35518();
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        this.f38257.m48090(C19768.m44906(unsignedByte2, "[TypeAnnotationData.read]: Reading Location (length = ", ")."), new Object[0]);
        this.f38257.m48087("[TypeAnnotationData.read]: [ ", new Object[0]);
        for (int i = 0; i < unsignedByte2; i++) {
            int unsignedByte3 = dataInputStream.readUnsignedByte();
            String strM28847 = EnumC12517.values()[unsignedByte3].m28847();
            char unsignedByte4 = (char) dataInputStream.readUnsignedByte();
            this.f26408.m7413(new C18551(unsignedByte3, unsignedByte4));
            this.f38257.m48087(" " + strM28847 + MotionUtils.EASING_TYPE_FORMAT_START + unsignedByte3 + "," + unsignedByte4 + "), ", new Object[0]);
        }
        this.f38257.m48090("] ", new Object[0]);
        super.mo19750(dataInputStream);
    }

    @Override // p067l.C8493
    /* JADX INFO: renamed from: ᩹ */
    public final void mo19751() {
        if (isEmpty()) {
            m26668(" { { }");
        } else {
            m26676(" {");
            mo24245(EnumC8234.INLINED_ELEMENT);
            super.mo19751();
        }
        m26668(this.f26406.m34951());
        String string = this.f26408.toString();
        int length = string.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                m26668(string.concat(" "));
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        m26668(C0249l.f1198d);
    }
}
