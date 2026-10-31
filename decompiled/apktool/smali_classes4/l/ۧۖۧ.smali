.class public final Ll/ۧۖۧ;
.super Ll/ۡ᩷ۧ;
.source "S8O0"

# interfaces
.implements Ll/᩻ۖۧ;


# instance fields
.field public final ۜ:Z

.field public final ۡ:J

.field public final ۢ:J

.field public final ܺ:I

.field public final ᩷:I


# direct methods
.method public constructor <init>(IIJJZ)V
    .locals 0

    .line 65
    invoke-direct/range {p0 .. p7}, Ll/ۡ᩷ۧ;-><init>(IIJJZ)V

    .line 66
    iput-wide p5, p0, Ll/ۧۖۧ;->ۡ:J

    .line 67
    iput p1, p0, Ll/ۧۖۧ;->᩷:I

    .line 68
    iput p2, p0, Ll/ۧۖۧ;->ܺ:I

    .line 69
    iput-boolean p7, p0, Ll/ۧۖۧ;->ۜ:Z

    const-wide/16 p1, -0x1

    cmp-long p5, p3, p1

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    move-wide p3, p1

    .line 70
    :goto_0
    iput-wide p3, p0, Ll/ۧۖۧ;->ۢ:J

    return-void
.end method


# virtual methods
.method public final ۧ()J
    .locals 2

    .line 80
    iget-wide v0, p0, Ll/ۧۖۧ;->ۡ:J

    return-wide v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 85
    iget-wide v0, p0, Ll/ۧۖۧ;->ۢ:J

    return-wide v0
.end method

.method public final ᩳ(J)Ll/ۧۖۧ;
    .locals 9

    .line 94
    new-instance v8, Ll/ۧۖۧ;

    iget v2, p0, Ll/ۧۖۧ;->ܺ:I

    iget-boolean v7, p0, Ll/ۧۖۧ;->ۜ:Z

    iget v1, p0, Ll/ۧۖۧ;->᩷:I

    iget-wide v5, p0, Ll/ۧۖۧ;->ۡ:J

    move-object v0, v8

    move-wide v3, p1

    invoke-direct/range {v0 .. v7}, Ll/ۧۖۧ;-><init>(IIJJZ)V

    return-object v8
.end method

.method public final ᩻()I
    .locals 1

    .line 90
    iget v0, p0, Ll/ۧۖۧ;->᩷:I

    return v0
.end method
