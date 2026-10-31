.class public Lorg/bouncycastle/jcajce/provider/symmetric/SCRYPT$Mappings;
.super Lorg/bouncycastle/jcajce/provider/util/AlgorithmProvider;


# static fields
.field public static final PREFIX:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    const-class v0, Lorg/bouncycastle/jcajce/provider/symmetric/SCRYPT;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/jcajce/provider/symmetric/SCRYPT$Mappings;->PREFIX:Ljava/lang/String;

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
    .locals 4

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    sget-object v1, Lorg/bouncycastle/jcajce/provider/symmetric/SCRYPT$Mappings;->PREFIX:Ljava/lang/String;

    const-string v2, "$ScryptWithUTF8"

    const-string v3, "SecretKeyFactory.SCRYPT"

    .line 0
    invoke-static {v1, v2, v3, v0, p1}, Ll/۫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V

    const-string v0, "SecretKeyFactory"

    sget-object v3, Lorg/bouncycastle/internal/asn1/misc/MiscObjectIdentifiers;->id_scrypt:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-static {p1, v1, v2, v0, v3}, Ll/ۧ۬֫;->֫(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    return-void
.end method
