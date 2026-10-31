.class public abstract Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;
.super Ljava/lang/Object;


# instance fields
.field public curve:Lorg/bouncycastle/math/ec/ECCurve;

.field public params:Lorg/bouncycastle/asn1/x9/X9ECParameters;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createCurve()Lorg/bouncycastle/math/ec/ECCurve;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->createParameters()Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v0

    return-object v0
.end method

.method public abstract createParameters()Lorg/bouncycastle/asn1/x9/X9ECParameters;
.end method

.method public declared-synchronized getCurve()Lorg/bouncycastle/math/ec/ECCurve;
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->curve:Lorg/bouncycastle/math/ec/ECCurve;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->createCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->curve:Lorg/bouncycastle/math/ec/ECCurve;

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->curve:Lorg/bouncycastle/math/ec/ECCurve;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public declared-synchronized getParameters()Lorg/bouncycastle/asn1/x9/X9ECParameters;
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->params:Lorg/bouncycastle/asn1/x9/X9ECParameters;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->createParameters()Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v1

    iput-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->params:Lorg/bouncycastle/asn1/x9/X9ECParameters;

    :cond_0
    iget-object v1, p0, Lorg/bouncycastle/asn1/x9/X9ECParametersHolder;->params:Lorg/bouncycastle/asn1/x9/X9ECParameters;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
