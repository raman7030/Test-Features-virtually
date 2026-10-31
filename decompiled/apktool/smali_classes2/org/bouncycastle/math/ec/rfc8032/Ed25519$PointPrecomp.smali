.class public Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp;
.super Ljava/lang/Object;


# instance fields
.field public xyd:[I

.field public ymx_h:[I

.field public ypx_h:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X25519Field;->create()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp;->ymx_h:[I

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X25519Field;->create()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp;->ypx_h:[I

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X25519Field;->create()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp;->xyd:[I

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/math/ec/rfc8032/Ed25519$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp;-><init>()V

    return-void
.end method
