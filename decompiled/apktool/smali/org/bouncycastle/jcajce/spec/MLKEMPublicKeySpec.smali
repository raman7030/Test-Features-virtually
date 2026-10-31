.class public Lorg/bouncycastle/jcajce/spec/MLKEMPublicKeySpec;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/spec/KeySpec;


# instance fields
.field public final params:Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;

.field public final publicData:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;[B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/spec/MLKEMPublicKeySpec;->params:Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;

    invoke-static {p2}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/spec/MLKEMPublicKeySpec;->publicData:[B

    return-void
.end method


# virtual methods
.method public getParameterSpec()Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/spec/MLKEMPublicKeySpec;->params:Lorg/bouncycastle/jcajce/spec/MLKEMParameterSpec;

    return-object v0
.end method

.method public getPublicData()[B
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/spec/MLKEMPublicKeySpec;->publicData:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object v0

    return-object v0
.end method
