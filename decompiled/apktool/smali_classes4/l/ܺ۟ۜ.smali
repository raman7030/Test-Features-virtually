.class public final Ll/ܺ۟ۜ;
.super Ljava/lang/Object;
.source "R790"


# instance fields
.field public ֫:J

.field public final ۧ:J

.field public final ܽ:Ll/ۖ۟ۜ;

.field public ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۖ۟ۜ;J)V
    .locals 2

    .line 1367
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 1364
    iput-wide v0, p0, Ll/ܺ۟ۜ;->֫:J

    const-wide/high16 v0, -0x8000000000000000L

    .line 1365
    iput-wide v0, p0, Ll/ܺ۟ۜ;->ᩳ:J

    .line 1368
    iput-object p1, p0, Ll/ܺ۟ۜ;->ܽ:Ll/ۖ۟ۜ;

    .line 1369
    iput-wide p2, p0, Ll/ܺ۟ۜ;->ۧ:J

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۖ۟ۜ;JI)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/ܺ۟ۜ;-><init>(Ll/ۖ۟ۜ;J)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺ۟ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ܺ۟ۜ;->ۧ:J

    return-wide v0
.end method

.method public static ֫(Ll/ۖ۟ۜ;J)Ll/ܺ۟ۜ;
    .locals 3

    .line 1374
    new-instance v0, Ll/ܺ۟ۜ;

    const-wide v1, 0x7fffffffffffffffL

    invoke-direct {v0, p0, v1, v2}, Ll/ܺ۟ۜ;-><init>(Ll/ۖ۟ۜ;J)V

    .line 1375
    iput-wide p1, v0, Ll/ܺ۟ۜ;->֫:J

    return-object v0
.end method

.method public static bridge synthetic ֫(Ll/ܺ۟ۜ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ܺ۟ۜ;->ᩳ:J

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܺ۟ۜ;)Ll/ۖ۟ۜ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ۟ۜ;->ܽ:Ll/ۖ۟ۜ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܺ۟ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ܺ۟ۜ;->ᩳ:J

    return-wide v0
.end method

.method public static ܿ(Ll/ܺ۟ۜ;)Z
    .locals 4

    .line 1380
    iget-wide v0, p0, Ll/ܺ۟ۜ;->֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩳ(Ll/ܺ۟ۜ;)J
    .locals 5

    .line 1380
    iget-wide v0, p0, Ll/ܺ۟ۜ;->֫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 1384
    iget-wide v0, p0, Ll/ܺ۟ۜ;->ᩳ:J

    iget-object p0, p0, Ll/ܺ۟ۜ;->ܽ:Ll/ۖ۟ۜ;

    invoke-static {p0}, Ll/ۖ۟ۜ;->ܳ(Ll/ۖ۟ۜ;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll/֡۟ۜ;->ۧ(JJ)J

    move-result-wide v0

    :cond_0
    return-wide v0
.end method
