.class public abstract Ll/ܺۜܺ;
.super Ll/ۖۜܺ;
.source "QBCX"


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ll/ۖۜܺ;-><init>()V

    const/4 v0, -0x1

    .line 33
    iput v0, p0, Ll/ܺۜܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 67
    iget v0, p0, Ll/ܺۜܺ;->᩸:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 71
    iput p1, p0, Ll/ܺۜܺ;->᩸:I

    return-void

    .line 68
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "index already set"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ()I
    .locals 2

    .line 52
    iget v0, p0, Ll/ܺۜܺ;->᩸:I

    if-ltz v0, :cond_0

    return v0

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "index not yet set"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 2

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܺۜܺ;->᩸:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 42
    iget v0, p0, Ll/ܺۜܺ;->᩸:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
