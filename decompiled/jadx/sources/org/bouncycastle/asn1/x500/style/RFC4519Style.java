package org.bouncycastle.asn1.x500.style;

import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.pro.am;
import java.util.Hashtable;
import l.C22870;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* JADX INFO: loaded from: classes.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    public static final Hashtable DefaultLookUp;
    public static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;
    public static final ASN1ObjectIdentifier c;
    public static final ASN1ObjectIdentifier cn;
    public static final ASN1ObjectIdentifier dc;
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

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f77969l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;
    public static final ASN1ObjectIdentifier o;
    public static final ASN1ObjectIdentifier ou;
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
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
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
        ASN1ObjectIdentifier aSN1ObjectIdentifierM50969 = C22870.m50969("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierM50969;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509610 = C22870.m50969("2.5.4.6");
        c = aSN1ObjectIdentifierM509610;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509611 = C22870.m50969("2.5.4.3");
        cn = aSN1ObjectIdentifierM509611;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509612 = C22870.m50969("0.9.2342.19200300.100.1.25");
        dc = aSN1ObjectIdentifierM509612;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509613 = C22870.m50969("2.5.4.13");
        description = aSN1ObjectIdentifierM509613;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509614 = C22870.m50969("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierM509614;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509615 = C22870.m50969("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierM509615;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509616 = C22870.m50969("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierM509616;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509617 = C22870.m50969("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierM509617;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509618 = C22870.m50969("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierM509618;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509619 = C22870.m50969("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierM509619;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509620 = C22870.m50969("2.5.4.42");
        givenName = aSN1ObjectIdentifierM509620;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509621 = C22870.m50969("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierM509621;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509622 = C22870.m50969("2.5.4.43");
        initials = aSN1ObjectIdentifierM509622;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509623 = C22870.m50969("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierM509623;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509624 = C22870.m50969("2.5.4.7");
        f77969l = aSN1ObjectIdentifierM509624;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509625 = C22870.m50969("2.5.4.31");
        member = aSN1ObjectIdentifierM509625;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509626 = C22870.m50969("2.5.4.41");
        name = aSN1ObjectIdentifierM509626;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509627 = C22870.m50969("2.5.4.10");
        o = aSN1ObjectIdentifierM509627;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509628 = C22870.m50969("2.5.4.11");
        ou = aSN1ObjectIdentifierM509628;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509629 = C22870.m50969("2.5.4.32");
        owner = aSN1ObjectIdentifierM509629;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509630 = C22870.m50969("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierM509630;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509631 = C22870.m50969("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierM509631;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509632 = C22870.m50969("2.5.4.17");
        postalCode = aSN1ObjectIdentifierM509632;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509633 = C22870.m50969("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierM509633;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509634 = C22870.m50969("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierM509634;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509635 = C22870.m50969("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierM509635;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509636 = C22870.m50969("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierM509636;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509637 = C22870.m50969("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierM509637;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509638 = C22870.m50969("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierM509638;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509639 = C22870.m50969("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierM509639;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509640 = C22870.m50969("2.5.4.4");
        sn = aSN1ObjectIdentifierM509640;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509641 = C22870.m50969("2.5.4.8");
        st = aSN1ObjectIdentifierM509641;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509642 = C22870.m50969("2.5.4.9");
        street = aSN1ObjectIdentifierM509642;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509643 = C22870.m50969("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierM509643;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509644 = C22870.m50969("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierM509644;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509645 = C22870.m50969("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierM509645;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509646 = C22870.m50969("2.5.4.12");
        title = aSN1ObjectIdentifierM509646;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509647 = C22870.m50969("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierM509647;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509648 = C22870.m50969("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierM509648;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509649 = C22870.m50969("2.5.4.35");
        userPassword = aSN1ObjectIdentifierM509649;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509650 = C22870.m50969("2.5.4.24");
        x121Address = aSN1ObjectIdentifierM509650;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM509651 = C22870.m50969("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierM509651;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierM50969, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierM509610, am.aF);
        hashtable.put(aSN1ObjectIdentifierM509611, "cn");
        hashtable.put(aSN1ObjectIdentifierM509612, "dc");
        hashtable.put(aSN1ObjectIdentifierM509613, "description");
        hashtable.put(aSN1ObjectIdentifierM509614, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierM509615, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierM509616, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierM509617, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierM509618, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM509619, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierM509620, "givenName");
        hashtable.put(aSN1ObjectIdentifierM509621, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierM509622, "initials");
        hashtable.put(aSN1ObjectIdentifierM509623, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierM509624, "l");
        hashtable.put(aSN1ObjectIdentifierM509625, "member");
        hashtable.put(aSN1ObjectIdentifierM509626, "name");
        hashtable.put(aSN1ObjectIdentifierM509627, "o");
        hashtable.put(aSN1ObjectIdentifierM509628, "ou");
        hashtable.put(aSN1ObjectIdentifierM509629, "owner");
        hashtable.put(aSN1ObjectIdentifierM509630, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierM509631, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierM509632, "postalCode");
        hashtable.put(aSN1ObjectIdentifierM509633, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierM509634, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierM509635, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierM509636, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierM509637, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierM509638, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierM509639, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierM509640, "sn");
        hashtable.put(aSN1ObjectIdentifierM509641, "st");
        hashtable.put(aSN1ObjectIdentifierM509642, "street");
        hashtable.put(aSN1ObjectIdentifierM509643, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM509644, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierM509645, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierM509646, "title");
        hashtable.put(aSN1ObjectIdentifierM509647, DhizukuVariables.PARAM_CLIENT_UID);
        hashtable.put(aSN1ObjectIdentifierM509648, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierM509649, "userPassword");
        hashtable.put(aSN1ObjectIdentifierM509650, "x121Address");
        hashtable.put(aSN1ObjectIdentifierM509651, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierM50969);
        hashtable2.put(am.aF, aSN1ObjectIdentifierM509610);
        hashtable2.put("cn", aSN1ObjectIdentifierM509611);
        hashtable2.put("dc", aSN1ObjectIdentifierM509612);
        hashtable2.put("description", aSN1ObjectIdentifierM509613);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierM509614);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierM509615);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierM509616);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierM509617);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierM509618);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierM509619);
        hashtable2.put("givenname", aSN1ObjectIdentifierM509620);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierM509621);
        hashtable2.put("initials", aSN1ObjectIdentifierM509622);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierM509623);
        hashtable2.put("l", aSN1ObjectIdentifierM509624);
        hashtable2.put("member", aSN1ObjectIdentifierM509625);
        hashtable2.put("name", aSN1ObjectIdentifierM509626);
        hashtable2.put("o", aSN1ObjectIdentifierM509627);
        hashtable2.put("ou", aSN1ObjectIdentifierM509628);
        hashtable2.put("owner", aSN1ObjectIdentifierM509629);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierM509630);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierM509631);
        hashtable2.put("postalcode", aSN1ObjectIdentifierM509632);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierM509633);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierM509634);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierM509635);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierM509636);
        hashtable2.put("searchguide", aSN1ObjectIdentifierM509637);
        hashtable2.put("seealso", aSN1ObjectIdentifierM509638);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierM509639);
        hashtable2.put("sn", aSN1ObjectIdentifierM509640);
        hashtable2.put("st", aSN1ObjectIdentifierM509641);
        hashtable2.put("street", aSN1ObjectIdentifierM509642);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierM509643);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierM509644);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierM509645);
        hashtable2.put("title", aSN1ObjectIdentifierM509646);
        hashtable2.put(DhizukuVariables.PARAM_CLIENT_UID, aSN1ObjectIdentifierM509647);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierM509648);
        hashtable2.put("userpassword", aSN1ObjectIdentifierM509649);
        hashtable2.put("x121address", aSN1ObjectIdentifierM509650);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierM509651);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) dc)) {
            return new DERIA5String(str);
        }
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
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
