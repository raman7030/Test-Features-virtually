.class public final Ll/ܺܺܿ;
.super Ljava/lang/Object;
.source "U6VC"


# instance fields
.field public ֫:Z

.field public final ۧ:J

.field public ܳ:Z

.field public ܽ:I

.field public ܿ:Z

.field public final ᩳ:[I

.field public ᩻:Z


# direct methods
.method public constructor <init>([IJ)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ܺܺܿ;->ᩳ:[I

    .line 50
    iput-wide p2, p0, Ll/ܺܺܿ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ۘܽ;)V
    .locals 3

    .line 54
    invoke-virtual {p1}, Ll/۫ۘܽ;->ᩳ()I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 57
    iget-boolean v1, p0, Ll/ܺܺܿ;->֫:Z

    if-nez v1, :cond_0

    iput-boolean v2, p0, Ll/ܺܺܿ;->ܳ:Z

    goto :goto_0

    .line 58
    :cond_0
    iget-boolean v1, p0, Ll/ܺܺܿ;->᩻:Z

    if-nez v1, :cond_1

    iput-boolean v2, p0, Ll/ܺܺܿ;->ܿ:Z

    :cond_1
    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_2

    .line 60
    iget-boolean v1, p0, Ll/ܺܺܿ;->᩻:Z

    if-nez v1, :cond_2

    iput-boolean v2, p0, Ll/ܺܺܿ;->ܿ:Z

    :cond_2
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    .line 61
    iput-boolean v2, p0, Ll/ܺܺܿ;->᩻:Z

    .line 62
    :cond_3
    invoke-virtual {p1}, Ll/۫ۘܽ;->ܽ()J

    move-result-wide v0

    long-to-int p1, v0

    iput p1, p0, Ll/ܺܺܿ;->ܽ:I

    .line 63
    iput-boolean v2, p0, Ll/ܺܺܿ;->֫:Z

    return-void
.end method

.method public final ֫(J)Z
    .locals 7

    .line 67
    iget-boolean v0, p0, Ll/ܺܺܿ;->ܳ:Z

    iget-wide v1, p0, Ll/ܺܺܿ;->ۧ:J

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    shr-long v3, v1, v0

    long-to-int v4, v3

    shr-long v5, p1, v0

    long-to-int v0, v5

    if-ne v4, v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Ll/ܺܺܿ;->ܿ:Z

    if-eqz v0, :cond_2

    long-to-int v0, v1

    long-to-int p2, p1

    if-ne v0, p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ۧ(J)J
    .locals 4

    .line 72
    iget-boolean v0, p0, Ll/ܺܺܿ;->᩻:Z

    if-eqz v0, :cond_0

    iget p1, p0, Ll/ܺܺܿ;->ܽ:I

    goto :goto_0

    :cond_0
    long-to-int p1, p1

    :goto_0
    int-to-long p1, p1

    const/16 v0, 0x20

    shl-long v0, p1, v0

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    return-wide p1
.end method
