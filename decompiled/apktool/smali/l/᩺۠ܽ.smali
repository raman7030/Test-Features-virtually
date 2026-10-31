.class public final synthetic Ll/᩺۠ܽ;
.super Ljava/lang/Object;
.source "097X"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܶܺ;


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫([Ljava/lang/Object;)Ljava/util/List;
    .locals 5

    .line 0
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    const/4 v4, 0x1

    invoke-static {v3, v0, v3, v2, v4}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 1
    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->intern()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    .line 1
    invoke-interface {p0, p1, p2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ll/ۘ֫ۚ;

    const/4 v0, 0x1

    .line 36
    invoke-static {p1, v0}, Ll/ܳۜۚ;->֫(Ll/ᩴܽۚ;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
