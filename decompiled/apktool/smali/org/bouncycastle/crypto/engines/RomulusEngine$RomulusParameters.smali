.class public Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;
.super Ljava/lang/Object;


# static fields
.field public static final ROMULUS_M:I = 0x0

.field public static final ROMULUS_N:I = 0x1

.field public static final ROMULUS_T:I = 0x2

.field public static final RomulusM:Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

.field public static final RomulusN:Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

.field public static final RomulusT:Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;


# instance fields
.field public final ord:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;->RomulusM:Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

    new-instance v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;->RomulusN:Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

    new-instance v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;->RomulusT:Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;->ord:I

    return-void
.end method

.method public static synthetic access$000(Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;)I
    .locals 0

    .line 0
    iget p0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusParameters;->ord:I

    return p0
.end method
