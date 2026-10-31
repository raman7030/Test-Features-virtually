.class public Lorg/bouncycastle/jcajce/provider/symmetric/Serpent$Mappings;
.super Lorg/bouncycastle/jcajce/provider/symmetric/SymmetricAlgorithmProvider;


# static fields
.field public static final PREFIX:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/provider/symmetric/Serpent;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/provider/symmetric/Serpent$Mappings;->PREFIX:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/symmetric/SymmetricAlgorithmProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V
    .locals 7

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    sget-object v1, Lorg/bouncycastle/jcajce/provider/symmetric/Serpent$Mappings;->PREFIX:Ljava/lang/String;

    const-string v2, "$ECB"

    const-string v3, "Cipher.Serpent"

    .line 0
    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "$KeyGen"

    const-string v3, "KeyGenerator.Serpent"

    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "$AlgParams"

    const-string v4, "AlgorithmParameters.Serpent"

    invoke-static {v1, v3, v4, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "$TECB"

    const-string v4, "Cipher.Tnepres"

    invoke-static {v1, v3, v4, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "$TKeyGen"

    const-string v4, "KeyGenerator.Tnepres"

    invoke-static {v1, v3, v4, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "$TAlgParams"

    const-string v5, "AlgorithmParameters.Tnepres"

    invoke-static {v1, v4, v5, v0, p1}, Ll/۫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_128_ECB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$ECB128"

    const-string v5, "Cipher"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_192_ECB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$ECB192"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_256_ECB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$ECB256"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_128_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$CBC128"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_192_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$CBC192"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_256_CBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$CBC256"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_128_CFB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$CFB128"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_192_CFB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$CFB192"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_256_CFB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$CFB256"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_128_OFB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$OFB128"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_192_OFB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v4, "$OFB192"

    invoke-static {p1, v1, v4, v5, v0}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/gnu/GNUObjectIdentifiers;->Serpent_256_OFB:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "$OFB256"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v5, v0, v4}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "$SerpentGMAC"

    invoke-static {v0, v1, v4}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "SERPENT"

    invoke-virtual {p0, p1, v4, v0, v2}, Lorg/bouncycastle/jcajce/provider/symmetric/SymmetricAlgorithmProvider;->addGMacAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "$TSerpentGMAC"

    invoke-static {v1, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "TNEPRES"

    invoke-virtual {p0, p1, v3, v0, v2}, Lorg/bouncycastle/jcajce/provider/symmetric/SymmetricAlgorithmProvider;->addGMacAlgorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "$Poly1305"

    invoke-static {v1, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "$Poly1305KeyGen"

    invoke-static {v1, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v4, v0, v1}, Lorg/bouncycastle/jcajce/provider/symmetric/SymmetricAlgorithmProvider;->addPoly1305Algorithm(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
