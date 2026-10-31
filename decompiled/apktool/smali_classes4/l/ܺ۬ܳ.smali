.class public final Ll/ܺ۬ܳ;
.super Ljava/lang/Object;
.source "C1US"


# instance fields
.field public ֫:J

.field public ۧ:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    iput-wide p1, p0, Ll/ܺ۬ܳ;->ۧ:J

    .line 119
    iput-wide p3, p0, Ll/ܺ۬ܳ;->֫:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 133
    const-class v2, Ll/ܺ۬ܳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 135
    :cond_1
    check-cast p1, Ll/ܺ۬ܳ;

    .line 137
    iget-wide v2, p0, Ll/ܺ۬ܳ;->ۧ:J

    iget-wide v4, p1, Ll/ܺ۬ܳ;->ۧ:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    return v1

    .line 138
    :cond_2
    iget-wide v2, p0, Ll/ܺ۬ܳ;->֫:J

    iget-wide v4, p1, Ll/ܺ۬ܳ;->֫:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 7

    .line 143
    iget-wide v0, p0, Ll/ܺ۬ܳ;->ۧ:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 144
    iget-wide v3, p0, Ll/ܺ۬ܳ;->֫:J

    ushr-long v5, v3, v2

    xor-long v2, v3, v5

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()J
    .locals 2

    .line 127
    iget-wide v0, p0, Ll/ܺ۬ܳ;->֫:J

    return-wide v0
.end method

.method public final ۧ()J
    .locals 2

    .line 123
    iget-wide v0, p0, Ll/ܺ۬ܳ;->ۧ:J

    return-wide v0
.end method
