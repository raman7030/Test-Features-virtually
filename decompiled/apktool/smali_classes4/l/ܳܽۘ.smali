.class public abstract Ll/ܳܽۘ;
.super Ljava/lang/Object;
.source "Z9C7"

# interfaces
.implements Ll/ܽܽۘ;


# instance fields
.field public ֫:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-wide p1, p0, Ll/ܳܽۘ;->֫:J

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 34
    :cond_1
    check-cast p1, Ll/ܳܽۘ;

    .line 36
    iget-wide v2, p0, Ll/ܳܽۘ;->֫:J

    iget-wide v4, p1, Ll/ܳܽۘ;->֫:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 5

    const/16 v0, 0x20

    .line 41
    iget-wide v1, p0, Ll/ܳܽۘ;->֫:J

    ushr-long v3, v1, v0

    xor-long v0, v1, v3

    long-to-int v1, v0

    return v1
.end method

.method public ֫()J
    .locals 2

    .line 26
    iget-wide v0, p0, Ll/ܳܽۘ;->֫:J

    return-wide v0
.end method
