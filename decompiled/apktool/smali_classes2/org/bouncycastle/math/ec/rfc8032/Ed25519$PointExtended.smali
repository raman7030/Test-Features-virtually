.class public Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointExtended;
.super Ljava/lang/Object;


# instance fields
.field public t:[I

.field public x:[I

.field public y:[I

.field public z:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X25519Field;->create()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointExtended;->x:[I

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X25519Field;->create()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointExtended;->y:[I

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X25519Field;->create()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointExtended;->z:[I

    invoke-static {}, Lorg/bouncycastle/math/ec/rfc7748/X25519Field;->create()[I

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointExtended;->t:[I

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/math/ec/rfc8032/Ed25519$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/math/ec/rfc8032/Ed25519$PointExtended;-><init>()V

    return-void
.end method
