package org.bouncycastle.asn1.util;

import com.google.android.material.motion.MotionUtils;
import l.C16014;
import l.C7166;
import l.EnumC0121;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLBitString;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes.dex */
public class ASN1Dump {
    public static final int SAMPLE_SIZE = 32;
    public static final String TAB = "    ";

    public static void appendAscString(StringBuilder sb, byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 != i + i2; i3++) {
            byte b = bArr[i3];
            if (b >= 32 && b <= 126) {
                sb.append((char) b);
            }
        }
    }

    public static String dumpAsString(Object obj) {
        return dumpAsString(obj, false);
    }

    public static String dumpAsString(Object obj, boolean z) {
        ASN1Primitive aSN1Primitive;
        if (obj instanceof ASN1Primitive) {
            aSN1Primitive = (ASN1Primitive) obj;
        } else {
            if (!(obj instanceof ASN1Encodable)) {
                return "unknown object type " + obj.toString();
            }
            aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        }
        StringBuilder sb = new StringBuilder();
        _dumpAsString("", z, aSN1Primitive, sb);
        return sb.toString();
    }

    public static void dumpBinaryDataAsString(StringBuilder sb, String str, byte[] bArr) {
        if (bArr.length < 1) {
            return;
        }
        String strLineSeparator = Strings.lineSeparator();
        String strM37867 = C16014.m37867(str, TAB);
        for (int i = 0; i < bArr.length; i += 32) {
            int iMin = Math.min(bArr.length - i, 32);
            sb.append(strM37867);
            sb.append(Hex.toHexString(bArr, i, iMin));
            for (int i2 = iMin; i2 < 32; i2++) {
                sb.append(EnumC0121.f1143);
            }
            sb.append(TAB);
            appendAscString(sb, bArr, i, iMin);
            sb.append(strLineSeparator);
        }
    }

    public static void _dumpAsString(String str, boolean z, ASN1Primitive aSN1Primitive, StringBuilder sb) {
        String str2;
        String str3;
        String str4;
        String str5;
        String strLineSeparator = Strings.lineSeparator();
        sb.append(str);
        if (aSN1Primitive instanceof ASN1Null) {
            sb.append("NULL");
            sb.append(strLineSeparator);
            return;
        }
        int i = 0;
        if (aSN1Primitive instanceof ASN1Sequence) {
            if (aSN1Primitive instanceof BERSequence) {
                str5 = "BER Sequence";
            } else {
                str5 = aSN1Primitive instanceof DERSequence ? "DER Sequence" : "Sequence";
            }
            sb.append(str5);
            sb.append(strLineSeparator);
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String strM37867 = C16014.m37867(str, TAB);
            int size = aSN1Sequence.size();
            while (i < size) {
                _dumpAsString(strM37867, z, aSN1Sequence.getObjectAt(i).toASN1Primitive(), sb);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1Set) {
            if (aSN1Primitive instanceof BERSet) {
                str4 = "BER Set";
            } else {
                str4 = aSN1Primitive instanceof DERSet ? "DER Set" : "Set";
            }
            sb.append(str4);
            sb.append(strLineSeparator);
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            String strM37868 = C16014.m37867(str, TAB);
            int size2 = aSN1Set.size();
            while (i < size2) {
                _dumpAsString(strM37868, z, aSN1Set.getObjectAt(i).toASN1Primitive(), sb);
                i++;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1TaggedObject) {
            if (aSN1Primitive instanceof BERTaggedObject) {
                str3 = "BER Tagged ";
            } else {
                str3 = aSN1Primitive instanceof DERTaggedObject ? "DER Tagged " : "Tagged ";
            }
            sb.append(str3);
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Primitive;
            sb.append(ASN1Util.getTagText(aSN1TaggedObject));
            if (!aSN1TaggedObject.isExplicit()) {
                sb.append(" IMPLICIT");
            }
            sb.append(strLineSeparator);
            _dumpAsString(str + TAB, z, aSN1TaggedObject.getBaseObject().toASN1Primitive(), sb);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            sb.append("ObjectIdentifier(" + ((ASN1ObjectIdentifier) aSN1Primitive).getId() + MotionUtils.EASING_TYPE_FORMAT_END + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            sb.append("RelativeOID(" + ((ASN1RelativeOID) aSN1Primitive).getId() + MotionUtils.EASING_TYPE_FORMAT_END + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Boolean) {
            sb.append("Boolean(" + ((ASN1Boolean) aSN1Primitive).isTrue() + MotionUtils.EASING_TYPE_FORMAT_END + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Integer) {
            sb.append("Integer(" + ((ASN1Integer) aSN1Primitive).getValue() + MotionUtils.EASING_TYPE_FORMAT_END + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1OctetString) {
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Primitive;
            sb.append(aSN1Primitive instanceof BEROctetString ? "BER Constructed Octet String[" : "DER Octet String[");
            sb.append(aSN1OctetString.getOctetsLength() + "]" + strLineSeparator);
            if (z) {
                dumpBinaryDataAsString(sb, str, aSN1OctetString.getOctets());
                return;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1BitString) {
            ASN1BitString aSN1BitString = (ASN1BitString) aSN1Primitive;
            if (aSN1BitString instanceof DERBitString) {
                str2 = "DER Bit String[";
            } else {
                str2 = aSN1BitString instanceof DLBitString ? "DL Bit String[" : "BER Bit String[";
            }
            sb.append(str2);
            sb.append(aSN1BitString.getBytesLength() + ", " + aSN1BitString.getPadBits() + "]" + strLineSeparator);
            if (z) {
                dumpBinaryDataAsString(sb, str, aSN1BitString.getBytes());
                return;
            }
            return;
        }
        if (aSN1Primitive instanceof ASN1IA5String) {
            sb.append("IA5String(" + ((ASN1IA5String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTF8String) {
            sb.append("UTF8String(" + ((ASN1UTF8String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1NumericString) {
            sb.append("NumericString(" + ((ASN1NumericString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1PrintableString) {
            sb.append("PrintableString(" + ((ASN1PrintableString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VisibleString) {
            sb.append("VisibleString(" + ((ASN1VisibleString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1BMPString) {
            sb.append("BMPString(" + ((ASN1BMPString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1T61String) {
            sb.append("T61String(" + ((ASN1T61String) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GraphicString) {
            sb.append("GraphicString(" + ((ASN1GraphicString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1VideotexString) {
            sb.append("VideotexString(" + ((ASN1VideotexString) aSN1Primitive).getString() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1UTCTime) {
            sb.append("UTCTime(" + ((ASN1UTCTime) aSN1Primitive).getTime() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            sb.append("GeneralizedTime(" + ((ASN1GeneralizedTime) aSN1Primitive).getTime() + ") " + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1Enumerated) {
            sb.append("DER Enumerated(" + ((ASN1Enumerated) aSN1Primitive).getValue() + MotionUtils.EASING_TYPE_FORMAT_END + strLineSeparator);
            return;
        }
        if (aSN1Primitive instanceof ASN1ObjectDescriptor) {
            sb.append("ObjectDescriptor(" + ((ASN1ObjectDescriptor) aSN1Primitive).getBaseGraphicString().getString() + ") " + strLineSeparator);
            return;
        }
        if (!(aSN1Primitive instanceof ASN1External)) {
            sb.append(aSN1Primitive.toString() + strLineSeparator);
            return;
        }
        ASN1External aSN1External = (ASN1External) aSN1Primitive;
        sb.append("External " + strLineSeparator);
        String str6 = str + TAB;
        if (aSN1External.getDirectReference() != null) {
            StringBuilder sbM19190 = C7166.m19190(str6, "Direct Reference: ");
            sbM19190.append(aSN1External.getDirectReference().getId());
            sbM19190.append(strLineSeparator);
            sb.append(sbM19190.toString());
        }
        if (aSN1External.getIndirectReference() != null) {
            StringBuilder sbM19191 = C7166.m19190(str6, "Indirect Reference: ");
            sbM19191.append(aSN1External.getIndirectReference().toString());
            sbM19191.append(strLineSeparator);
            sb.append(sbM19191.toString());
        }
        if (aSN1External.getDataValueDescriptor() != null) {
            _dumpAsString(str6, z, aSN1External.getDataValueDescriptor(), sb);
        }
        StringBuilder sbM19192 = C7166.m19190(str6, "Encoding: ");
        sbM19192.append(aSN1External.getEncoding());
        sbM19192.append(strLineSeparator);
        sb.append(sbM19192.toString());
        _dumpAsString(str6, z, aSN1External.getExternalContent(), sb);
    }
}
