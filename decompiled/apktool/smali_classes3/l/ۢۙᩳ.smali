.class public final Ll/ۢۙᩳ;
.super Ljava/lang/Object;
.source "R6U3"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/Object;

.field public final ܳ:Ll/ۢۙᩳ;

.field public final ܽ:Ll/ۢۙᩳ;

.field public ܿ:Ll/᩸۬ᩳ;

.field public volatile ᩳ:J

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 137
    iput-wide v0, p0, Ll/ۢۙᩳ;->ᩳ:J

    .line 141
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 142
    iput-object p1, p0, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    iput-object p1, p0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    const/4 p1, 0x1

    .line 143
    iput p1, p0, Ll/ۢۙᩳ;->᩻:I

    iput p1, p0, Ll/ۢۙᩳ;->֫:I

    return-void
.end method

.method public constructor <init>(Ll/ۢۙᩳ;Ll/ۢۙᩳ;)V
    .locals 4

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 137
    iput-wide v0, p0, Ll/ۢۙᩳ;->ᩳ:J

    .line 147
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۢۙᩳ;->ܽ:Ll/ۢۙᩳ;

    .line 148
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۢۙᩳ;->ܳ:Ll/ۢۙᩳ;

    const/4 v0, 0x0

    .line 149
    iput-object v0, p0, Ll/ۢۙᩳ;->ۧ:Ljava/lang/Object;

    .line 150
    iget v0, p1, Ll/ۢۙᩳ;->֫:I

    iget v1, p2, Ll/ۢۙᩳ;->֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۢۙᩳ;->֫:I

    .line 151
    iget p1, p1, Ll/ۢۙᩳ;->᩻:I

    iget p2, p2, Ll/ۢۙᩳ;->᩻:I

    int-to-long v0, p1

    int-to-long p1, p2

    add-long/2addr v0, p1

    long-to-int p1, v0

    int-to-long v2, p1

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput p1, p0, Ll/ۢۙᩳ;->᩻:I

    return-void

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method
