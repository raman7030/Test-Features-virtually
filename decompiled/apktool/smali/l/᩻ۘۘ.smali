.class public final Ll/᩻ۘۘ;
.super Ljava/lang/Object;
.source "U7Z2"

# interfaces
.implements Ll/᩷ۘۘ;


# instance fields
.field public ֫:J

.field public ۧ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x1

    .line 40
    iput-wide v0, p0, Ll/᩻ۘۘ;->֫:J

    const-wide/16 v0, 0x0

    .line 41
    iput-wide v0, p0, Ll/᩻ۘۘ;->ۧ:J

    return-void
.end method


# virtual methods
.method public final getValue()J
    .locals 4

    .line 57
    iget-wide v0, p0, Ll/᩻ۘۘ;->ۧ:J

    const/16 v2, 0x10

    shl-long/2addr v0, v2

    iget-wide v2, p0, Ll/᩻ۘۘ;->֫:J

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final reset()V
    .locals 2

    const-wide/16 v0, 0x1

    .line 51
    iput-wide v0, p0, Ll/᩻ۘۘ;->֫:J

    const-wide/16 v0, 0x0

    .line 52
    iput-wide v0, p0, Ll/᩻ۘۘ;->ۧ:J

    return-void
.end method

.method public final update([BII)V
    .locals 9

    const/4 v0, 0x1

    const-wide/32 v1, 0xfff1

    if-ne p3, v0, :cond_0

    .line 64
    iget-wide v3, p0, Ll/᩻ۘۘ;->֫:J

    aget-byte p1, p1, p2

    and-int/lit16 p1, p1, 0xff

    int-to-long p1, p1

    add-long/2addr v3, p1

    .line 65
    iget-wide p1, p0, Ll/᩻ۘۘ;->ۧ:J

    add-long/2addr p1, v3

    .line 66
    rem-long/2addr v3, v1

    iput-wide v3, p0, Ll/᩻ۘۘ;->֫:J

    .line 67
    rem-long/2addr p1, v1

    iput-wide p1, p0, Ll/᩻ۘۘ;->ۧ:J

    return-void

    .line 71
    :cond_0
    div-int/lit16 v0, p3, 0x15b0

    .line 72
    rem-int/lit16 p3, p3, 0x15b0

    :goto_0
    add-int/lit8 v3, v0, -0x1

    if-lez v0, :cond_2

    const/16 v0, 0x15b0

    :goto_1
    add-int/lit8 v4, v0, -0x1

    if-lez v0, :cond_1

    .line 77
    iget-wide v5, p0, Ll/᩻ۘۘ;->֫:J

    add-int/lit8 v0, p2, 0x1

    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    int-to-long v7, p2

    add-long/2addr v5, v7

    iput-wide v5, p0, Ll/᩻ۘۘ;->֫:J

    .line 78
    iget-wide v7, p0, Ll/᩻ۘۘ;->ۧ:J

    add-long/2addr v7, v5

    iput-wide v7, p0, Ll/᩻ۘۘ;->ۧ:J

    move p2, v0

    move v0, v4

    goto :goto_1

    .line 80
    :cond_1
    iget-wide v4, p0, Ll/᩻ۘۘ;->֫:J

    rem-long/2addr v4, v1

    iput-wide v4, p0, Ll/᩻ۘۘ;->֫:J

    .line 81
    iget-wide v4, p0, Ll/᩻ۘۘ;->ۧ:J

    rem-long/2addr v4, v1

    iput-wide v4, p0, Ll/᩻ۘۘ;->ۧ:J

    move v0, v3

    goto :goto_0

    :cond_2
    :goto_2
    add-int/lit8 v0, p3, -0x1

    if-lez p3, :cond_3

    .line 87
    iget-wide v3, p0, Ll/᩻ۘۘ;->֫:J

    add-int/lit8 p3, p2, 0x1

    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    int-to-long v5, p2

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/᩻ۘۘ;->֫:J

    .line 88
    iget-wide v5, p0, Ll/᩻ۘۘ;->ۧ:J

    add-long/2addr v5, v3

    iput-wide v5, p0, Ll/᩻ۘۘ;->ۧ:J

    move p2, p3

    move p3, v0

    goto :goto_2

    .line 90
    :cond_3
    iget-wide p1, p0, Ll/᩻ۘۘ;->֫:J

    rem-long/2addr p1, v1

    iput-wide p1, p0, Ll/᩻ۘۘ;->֫:J

    .line 91
    iget-wide p1, p0, Ll/᩻ۘۘ;->ۧ:J

    rem-long/2addr p1, v1

    iput-wide p1, p0, Ll/᩻ۘۘ;->ۧ:J

    return-void
.end method

.method public final ֫(J)V
    .locals 4

    const-wide/32 v0, 0xffff

    and-long v2, p1, v0

    .line 45
    iput-wide v2, p0, Ll/᩻ۘۘ;->֫:J

    const/16 v2, 0x10

    shr-long/2addr p1, v2

    and-long/2addr p1, v0

    .line 46
    iput-wide p1, p0, Ll/᩻ۘۘ;->ۧ:J

    return-void
.end method
