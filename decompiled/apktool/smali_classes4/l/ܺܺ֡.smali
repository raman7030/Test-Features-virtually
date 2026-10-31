.class public final Ll/ܺܺ֡;
.super Ljava/lang/Number;
.source "JJ7"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final serialVersionUID:J = 0xeaa4a2677L


# instance fields
.field public ᩸:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 29
    check-cast p1, Ll/ܺܺ֡;

    .line 368
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    iget-wide v2, p1, Ll/ܺܺ֡;->᩸:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final doubleValue()D
    .locals 2

    .line 319
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    long-to-double v0, v0

    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 343
    instance-of v0, p1, Ll/ܺܺ֡;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 344
    iget-wide v2, p0, Ll/ܺܺ֡;->᩸:J

    check-cast p1, Ll/ܺܺ֡;

    .line 299
    iget-wide v4, p1, Ll/ܺܺ֡;->᩸:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final floatValue()F
    .locals 2

    .line 309
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    long-to-float v0, v0

    return v0
.end method

.method public final getValue()Ljava/lang/Long;
    .locals 2

    .line 89
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    .line 356
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    const/16 v2, 0x20

    ushr-long v2, v0, v2

    xor-long/2addr v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public final intValue()I
    .locals 2

    .line 289
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    long-to-int v1, v0

    return v1
.end method

.method public final longValue()J
    .locals 2

    .line 299
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 379
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Long;)V
    .locals 4

    .line 200
    iget-wide v0, p0, Ll/ܺܺ֡;->᩸:J

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/ܺܺ֡;->᩸:J

    return-void
.end method
