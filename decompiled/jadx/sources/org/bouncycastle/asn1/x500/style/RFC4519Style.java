package org.bouncycastle.asn1.x500.style;

import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.C0655am;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import p067l.C24104;

/* JADX INFO: loaded from: classes.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    public static final Hashtable DefaultLookUp;
    public static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;

    /* JADX INFO: renamed from: c */
    public static final ASN1ObjectIdentifier f80698c;

    /* JADX INFO: renamed from: cn */
    public static final ASN1ObjectIdentifier f80699cn;

    /* JADX INFO: renamed from: dc */
    public static final ASN1ObjectIdentifier f80700dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* JADX INFO: renamed from: l */
    public static final ASN1ObjectIdentifier f80701l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* JADX INFO: renamed from: o */
    public static final ASN1ObjectIdentifier f80702o;

    /* JADX INFO: renamed from: ou */
    public static final ASN1ObjectIdentifier f80703ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;

    /* JADX INFO: renamed from: sn */
    public static final ASN1ObjectIdentifier f80704sn;

    /* JADX INFO: renamed from: st */
    public static final ASN1ObjectIdentifier f80705st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    public final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    public final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierM53359 = C24104.m53359("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierM53359;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533510 = C24104.m53359("2.5.4.6");
        f80698c = aSN1ObjectIdentifierM533510;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533511 = C24104.m53359("2.5.4.3");
        f80699cn = aSN1ObjectIdentifierM533511;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533512 = C24104.m53359("0.9.2342.19200300.100.1.25");
        f80700dc = aSN1ObjectIdentifierM533512;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533513 = C24104.m53359("2.5.4.13");
        description = aSN1ObjectIdentifierM533513;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533514 = C24104.m53359("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierM533514;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533515 = C24104.m53359("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierM533515;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533516 = C24104.m53359("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierM533516;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533517 = C24104.m53359("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierM533517;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533518 = C24104.m53359("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierM533518;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533519 = C24104.m53359("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierM533519;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533520 = C24104.m53359("2.5.4.42");
        givenName = aSN1ObjectIdentifierM533520;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533521 = C24104.m53359("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierM533521;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533522 = C24104.m53359("2.5.4.43");
        initials = aSN1ObjectIdentifierM533522;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533523 = C24104.m53359("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierM533523;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533524 = C24104.m53359("2.5.4.7");
        f80701l = aSN1ObjectIdentifierM533524;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533525 = C24104.m53359("2.5.4.31");
        member = aSN1ObjectIdentifierM533525;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533526 = C24104.m53359("2.5.4.41");
        name = aSN1ObjectIdentifierM533526;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533527 = C24104.m53359("2.5.4.10");
        f80702o = aSN1ObjectIdentifierM533527;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533528 = C24104.m53359("2.5.4.11");
        f80703ou = aSN1ObjectIdentifierM533528;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533529 = C24104.m53359("2.5.4.32");
        owner = aSN1ObjectIdentifierM533529;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533530 = C24104.m53359("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierM533530;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533531 = C24104.m53359("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierM533531;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533532 = C24104.m53359("2.5.4.17");
        postalCode = aSN1ObjectIdentifierM533532;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533533 = C24104.m53359("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierM533533;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533534 = C24104.m53359("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierM533534;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533535 = C24104.m53359("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierM533535;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533536 = C24104.m53359("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierM533536;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533537 = C24104.m53359("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierM533537;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533538 = C24104.m53359("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierM533538;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533539 = C24104.m53359("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierM533539;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533540 = C24104.m53359("2.5.4.4");
        f80704sn = aSN1ObjectIdentifierM533540;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533541 = C24104.m53359("2.5.4.8");
        f80705st = aSN1ObjectIdentifierM533541;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533542 = C24104.m53359("2.5.4.9");
        street = aSN1ObjectIdentifierM533542;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533543 = C24104.m53359("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierM533543;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533544 = C24104.m53359("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierM533544;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533545 = C24104.m53359("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierM533545;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533546 = C24104.m53359("2.5.4.12");
        title = aSN1ObjectIdentifierM533546;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533547 = C24104.m53359("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierM533547;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533548 = C24104.m53359("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierM533548;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533549 = C24104.m53359("2.5.4.35");
        userPassword = aSN1ObjectIdentifierM533549;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533550 = C24104.m53359("2.5.4.24");
        x121Address = aSN1ObjectIdentifierM533550;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM533551 = C24104.m53359("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierM533551;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierM53359, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierM533510, C0655am.f2278aF);
        hashtable.put(aSN1ObjectIdentifierM533511, "cn");
        hashtable.put(aSN1ObjectIdentifierM533512, "dc");
        hashtable.put(aSN1ObjectIdentifierM533513, "description");
        hashtable.put(aSN1ObjectIdentifierM533514, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierM533515, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierM533516, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierM533517, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierM533518, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM533519, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierM533520, "givenName");
        hashtable.put(aSN1ObjectIdentifierM533521, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierM533522, "initials");
        hashtable.put(aSN1ObjectIdentifierM533523, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierM533524, "l");
        hashtable.put(aSN1ObjectIdentifierM533525, "member");
        hashtable.put(aSN1ObjectIdentifierM533526, "name");
        hashtable.put(aSN1ObjectIdentifierM533527, "o");
        hashtable.put(aSN1ObjectIdentifierM533528, "ou");
        hashtable.put(aSN1ObjectIdentifierM533529, "owner");
        hashtable.put(aSN1ObjectIdentifierM533530, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierM533531, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierM533532, "postalCode");
        hashtable.put(aSN1ObjectIdentifierM533533, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierM533534, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierM533535, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierM533536, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierM533537, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierM533538, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierM533539, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierM533540, "sn");
        hashtable.put(aSN1ObjectIdentifierM533541, "st");
        hashtable.put(aSN1ObjectIdentifierM533542, "street");
        hashtable.put(aSN1ObjectIdentifierM533543, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM533544, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierM533545, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierM533546, "title");
        hashtable.put(aSN1ObjectIdentifierM533547, DhizukuVariables.PARAM_CLIENT_UID);
        hashtable.put(aSN1ObjectIdentifierM533548, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierM533549, "userPassword");
        hashtable.put(aSN1ObjectIdentifierM533550, "x121Address");
        hashtable.put(aSN1ObjectIdentifierM533551, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierM53359);
        hashtable2.put(C0655am.f2278aF, aSN1ObjectIdentifierM533510);
        hashtable2.put("cn", aSN1ObjectIdentifierM533511);
        hashtable2.put("dc", aSN1ObjectIdentifierM533512);
        hashtable2.put("description", aSN1ObjectIdentifierM533513);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierM533514);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierM533515);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierM533516);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierM533517);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierM533518);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierM533519);
        hashtable2.put("givenname", aSN1ObjectIdentifierM533520);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierM533521);
        hashtable2.put("initials", aSN1ObjectIdentifierM533522);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierM533523);
        hashtable2.put("l", aSN1ObjectIdentifierM533524);
        hashtable2.put("member", aSN1ObjectIdentifierM533525);
        hashtable2.put("name", aSN1ObjectIdentifierM533526);
        hashtable2.put("o", aSN1ObjectIdentifierM533527);
        hashtable2.put("ou", aSN1ObjectIdentifierM533528);
        hashtable2.put("owner", aSN1ObjectIdentifierM533529);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierM533530);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierM533531);
        hashtable2.put("postalcode", aSN1ObjectIdentifierM533532);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierM533533);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierM533534);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierM533535);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierM533536);
        hashtable2.put("searchguide", aSN1ObjectIdentifierM533537);
        hashtable2.put("seealso", aSN1ObjectIdentifierM533538);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierM533539);
        hashtable2.put("sn", aSN1ObjectIdentifierM533540);
        hashtable2.put("st", aSN1ObjectIdentifierM533541);
        hashtable2.put("street", aSN1ObjectIdentifierM533542);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierM533543);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierM533544);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierM533545);
        hashtable2.put("title", aSN1ObjectIdentifierM533546);
        hashtable2.put(DhizukuVariables.PARAM_CLIENT_UID, aSN1ObjectIdentifierM533547);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierM533548);
        hashtable2.put("userpassword", aSN1ObjectIdentifierM533549);
        hashtable2.put("x121address", aSN1ObjectIdentifierM533550);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierM533551);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) f80700dc)) {
            return new DERIA5String(str);
        }
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) f80698c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        int length = rdnArrRDNsFromString.length;
        RDN[] rdnArr = new RDN[length];
        for (int i = 0; i != rdnArrRDNsFromString.length; i++) {
            rdnArr[(length - i) - 1] = rdnArrRDNsFromString[i];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuilder sb = new StringBuilder();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            IETFUtils.appendRDN(sb, rDNs[length], this.defaultSymbols);
        }
        return sb.toString();
    }
}
