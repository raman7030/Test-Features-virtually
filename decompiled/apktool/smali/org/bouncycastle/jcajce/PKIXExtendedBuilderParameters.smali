.class public Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/cert/CertPathParameters;


# instance fields
.field public final baseParameters:Lorg/bouncycastle/jcajce/PKIXExtendedParameters;

.field public final excludedCerts:Ljava/util/Set;

.field public final maxPathLength:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;->access$100(Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;)Lorg/bouncycastle/jcajce/PKIXExtendedParameters;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;->baseParameters:Lorg/bouncycastle/jcajce/PKIXExtendedParameters;

    invoke-static {p1}, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;->access$200(Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;->excludedCerts:Ljava/util/Set;

    invoke-static {p1}, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;->access$300(Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;)I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;->maxPathLength:I

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$1;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;-><init>(Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters$Builder;)V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public getBaseParameters()Lorg/bouncycastle/jcajce/PKIXExtendedParameters;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;->baseParameters:Lorg/bouncycastle/jcajce/PKIXExtendedParameters;

    return-object v0
.end method

.method public getExcludedCerts()Ljava/util/Set;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;->excludedCerts:Ljava/util/Set;

    return-object v0
.end method

.method public getMaxPathLength()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/jcajce/PKIXExtendedBuilderParameters;->maxPathLength:I

    return v0
.end method
