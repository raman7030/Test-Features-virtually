.class public final synthetic Ll/ᩴۨۡ;
.super Ljava/lang/Object;
.source "D73Y"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/֡ۨۡ;


# direct methods
.method public static ֫(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 0
    invoke-static {p1, p2}, Ll/֫ۛ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 1
    invoke-virtual {p0, p3, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 2
    invoke-static {p0, p4}, Ll/֫ۛ᩻;->֫(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lorg/bouncycastle/asn1/ASN1Sequence;I)[B
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    .line 1
    invoke-static {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1OctetString;

    move-result-object p0

    .line 2
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1OctetString;->getOctets()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 386
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 0
    new-instance v0, Ll/ۘۜ֨;

    invoke-direct {v0, p1}, Ll/ۘۜ֨;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method
