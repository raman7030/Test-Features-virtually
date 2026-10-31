.class public Lorg/bouncycastle/jcajce/provider/symmetric/Shacal2$Mappings;
.super Lorg/bouncycastle/jcajce/provider/symmetric/SymmetricAlgorithmProvider;


# static fields
.field public static final PREFIX:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/provider/symmetric/Shacal2;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/provider/symmetric/Shacal2$Mappings;->PREFIX:Ljava/lang/String;

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
    .locals 6

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    sget-object v1, Lorg/bouncycastle/jcajce/provider/symmetric/Shacal2$Mappings;->PREFIX:Ljava/lang/String;

    const-string v2, "$CMAC"

    const-string v3, "Mac.Shacal-2CMAC"

    .line 0
    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "$ECB"

    const-string v3, "Cipher.Shacal2"

    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "Cipher.SHACAL-2"

    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "$KeyGen"

    const-string v3, "KeyGenerator.Shacal2"

    invoke-static {v1, v2, v3, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "$AlgParamGen"

    const-string v4, "AlgorithmParameterGenerator.Shacal2"

    invoke-static {v1, v3, v4, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "$AlgParams"

    const-string v5, "AlgorithmParameters.Shacal2"

    invoke-static {v1, v4, v5, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "KeyGenerator.SHACAL-2"

    invoke-static {v1, v2, v5, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "AlgorithmParameters.SHACAL-2"

    const-string v5, "AlgorithmParameterGenerator.SHACAL-2"

    invoke-static {v1, v3, v5, v0, p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v1, v4, v2, v0, p1}, Ll/۫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V

    return-void
.end method
