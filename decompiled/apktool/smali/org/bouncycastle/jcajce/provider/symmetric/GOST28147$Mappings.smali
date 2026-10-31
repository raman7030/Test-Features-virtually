.class public Lorg/bouncycastle/jcajce/provider/symmetric/GOST28147$Mappings;
.super Lorg/bouncycastle/jcajce/provider/util/AlgorithmProvider;


# static fields
.field public static final PREFIX:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/provider/symmetric/GOST28147;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/provider/symmetric/GOST28147$Mappings;->PREFIX:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/jcajce/provider/util/AlgorithmProvider;-><init>()V

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
    sget-object v1, Lorg/bouncycastle/jcajce/provider/symmetric/GOST28147$Mappings;->PREFIX:Ljava/lang/String;

    const-string v2, "$ECB"

    const-string v3, "Cipher.GOST28147"

    .line 0
    invoke-static {v1, v2, v3, v0, p1}, Ll/۫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V

    const-string v0, "Alg.Alias.Cipher.GOST"

    const-string v2, "GOST28147"

    invoke-interface {p1, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.Cipher.GOST-28147"

    invoke-interface {p1, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Cipher."

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->gostR28147_gcfb:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "$GCFB"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v0, v5}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "$KeyGen"

    const-string v6, "KeyGenerator.GOST28147"

    invoke-static {v0, v5, p1, v6}, Ll/ۗۧᩳ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyGenerator.GOST"

    invoke-interface {p1, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.KeyGenerator.GOST-28147"

    invoke-interface {p1, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Alg.Alias.KeyGenerator."

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "$AlgParams"

    const-string v6, "AlgorithmParameters.GOST28147"

    invoke-static {v5, v6, v1, v0, p1}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "$AlgParamGen"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v5, "AlgorithmParameterGenerator.GOST28147"

    invoke-interface {p1, v5, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Alg.Alias.AlgorithmParameters."

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "Alg.Alias.AlgorithmParameterGenerator."

    invoke-static {v2, v5, v0, v4, p1}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2, v3, v0, v4, p1}, Ll/ᩴۖܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->id_Gost28147_89_CryptoPro_KeyWrap:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "$CryptoProWrap"

    invoke-static {v1, v2, v0, v3, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v2, Lorg/bouncycastle/asn1/cryptopro/CryptoProObjectIdentifiers;->id_Gost28147_89_None_KeyWrap:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "$GostWrap"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "$Mac"

    const-string v2, "Mac.GOST28147MAC"

    invoke-static {v0, v1, p1, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.Mac.GOST28147"

    const-string v1, "GOST28147MAC"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
