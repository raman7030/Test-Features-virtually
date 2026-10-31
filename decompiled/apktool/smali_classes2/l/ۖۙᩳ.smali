.class public final Ll/ۖۙᩳ;
.super Ljava/lang/Object;
.source "86TL"


# instance fields
.field public final ֫:J

.field public final ۧ:Ll/ۢ۬ᩳ;

.field public final ܽ:J

.field public final ܿ:Ll/ۚۗᩳ;

.field public final ᩳ:J


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 14
    new-instance v1, Ll/ۢ۬ᩳ;

    invoke-direct {v1}, Ll/ۢ۬ᩳ;-><init>()V

    .line 9
    new-instance v2, Ll/ۚۗᩳ;

    const/4 v0, -0x1

    invoke-direct {v2, v0, v0}, Ll/ۚۗᩳ;-><init>(II)V

    const-wide/16 v5, 0x0

    const-wide/32 v7, 0x1000000

    const-wide/16 v3, 0x0

    move-object v0, p0

    .line 14
    invoke-direct/range {v0 .. v8}, Ll/ۖۙᩳ;-><init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V

    return-void
.end method

.method public constructor <init>(Ll/ۢ۬ᩳ;Ll/ۚۗᩳ;JJJ)V
    .locals 3

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p5, v0

    if-ltz v2, :cond_0

    cmp-long v2, p3, v0

    if-ltz v2, :cond_0

    cmp-long v2, p3, p5

    if-gtz v2, :cond_0

    cmp-long v2, p7, v0

    if-ltz v2, :cond_0

    .line 21
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۖۙᩳ;->ۧ:Ll/ۢ۬ᩳ;

    .line 22
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۖۙᩳ;->ܿ:Ll/ۚۗᩳ;

    .line 23
    iput-wide p3, p0, Ll/ۖۙᩳ;->֫:J

    .line 24
    iput-wide p5, p0, Ll/ۖۙᩳ;->ᩳ:J

    .line 25
    iput-wide p7, p0, Ll/ۖۙᩳ;->ܽ:J

    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid history state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
