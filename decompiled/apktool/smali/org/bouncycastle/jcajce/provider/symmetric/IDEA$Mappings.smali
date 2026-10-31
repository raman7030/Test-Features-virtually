.class public Lorg/bouncycastle/jcajce/provider/symmetric/IDEA$Mappings;
.super Lorg/bouncycastle/jcajce/provider/util/AlgorithmProvider;


# static fields
.field public static final PREFIX:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/provider/symmetric/IDEA;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/provider/symmetric/IDEA$Mappings;->PREFIX:Ljava/lang/String;

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
    .locals 5

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    sget-object v1, Lorg/bouncycastle/jcajce/provider/symmetric/IDEA$Mappings;->PREFIX:Ljava/lang/String;

    const-string v2, "$AlgParamGen"

    const-string v3, "AlgorithmParameterGenerator.IDEA"

    .line 0
    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2"

    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2"

    const-string v3, "$AlgParams"

    const-string v4, "AlgorithmParameters.IDEA"

    invoke-static {v1, v3, v4, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v1, v3, v2, v0, p1}, Ll/۫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V

    const-string v0, "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA"

    const-string v2, "PKCS12PBE"

    const-string v3, "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC"

    invoke-static {v0, v2, v3, v2, p1}, Ll/᩶᩵ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "$ECB"

    const-string v3, "Cipher.IDEA"

    invoke-static {v1, v2, v3, v0, p1}, Ll/۫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V

    sget-object v0, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->as_sys_sec_alg_ideaCBC:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "$CBC"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Cipher"

    invoke-interface {p1, v3, v0, v2}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "$PBEWithSHAAndIDEA"

    const-string v4, "Cipher.PBEWITHSHAANDIDEA-CBC"

    invoke-static {v1, v3, v4, v2, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "$KeyGen"

    const-string v4, "KeyGenerator.IDEA"

    invoke-static {v1, v3, v4, v2, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "KeyGenerator"

    invoke-static {p1, v3, v2, v1, v0}, Ll/۬᩵ᩳ;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "$PBEWithSHAAndIDEAKeyGen"

    const-string v3, "SecretKeyFactory.PBEWITHSHAANDIDEA-CBC"

    invoke-static {v2, v3, v1, v0, p1}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "$Mac"

    const-string v3, "Mac.IDEAMAC"

    invoke-static {v0, v2, p1, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V

    const-string v0, "$CFB8Mac"

    const-string v2, "Alg.Alias.Mac.IDEA"

    const-string v3, "IDEAMAC"

    invoke-static {v2, v3, v1, v0, p1}, Ll/ۡܶ֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Mac.IDEAMAC/CFB8"

    invoke-interface {p1, v1, v0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Alg.Alias.Mac.IDEA/CFB8"

    const-string v1, "IDEAMAC/CFB8"

    invoke-interface {p1, v0, v1}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
