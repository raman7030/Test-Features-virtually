.class public final synthetic Ll/۟ۖᩴ;
.super Ljava/lang/Object;
.source "2BVX"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܺۧ;


# direct methods
.method public static ֫(Ljava/lang/String;Ll/ۡ᩻֫;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/֫ۘᩴ;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 1

    .line 76
    instance-of v0, p1, Ll/֫ۘᩴ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ۘᩴ;

    invoke-interface {p0, p1}, Ll/֫ۘᩴ;->ܽ(Ll/֫ۘᩴ;)Ll/ܰۖᩴ;

    move-result-object p0

    return-object p0

    .line 77
    :cond_0
    invoke-static {p0, p1}, Ll/۠۬ᩴ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1
    invoke-virtual {p0, p3, p4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 2
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Lorg/bouncycastle/jce/provider/BouncyCastleProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V
    .locals 1

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SPHINCSPlusKeyFactorySpi;

    .line 1
    invoke-direct {v0}, Lorg/bouncycastle/pqc/jcajce/provider/sphincsplus/SPHINCSPlusKeyFactorySpi;-><init>()V

    .line 2
    invoke-virtual {p0, p1, v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->addKeyInfoConverter(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 530
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(IIIII)Z
    .locals 3

    const/16 v0, 0x43

    const/4 v1, 0x2

    const/16 v2, 0x4d

    if-ne p2, v0, :cond_0

    const/16 v0, 0x4f

    if-ne p3, v0, :cond_0

    if-ne p4, v2, :cond_0

    if-eq p5, v2, :cond_1

    if-eq p1, v1, :cond_1

    :cond_0
    if-ne p2, v2, :cond_2

    const/16 p2, 0x4c

    if-ne p3, p2, :cond_2

    if-ne p4, p2, :cond_2

    const/16 p2, 0x54

    if-eq p5, p2, :cond_1

    if-ne p1, v1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
