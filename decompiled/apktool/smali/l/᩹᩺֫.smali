.class public Ll/᩹᩺֫;
.super Ljava/lang/Object;
.source "U7MS"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:J

.field public final ۛ:I

.field public final ۤ:Ll/᩸᩺֫;

.field public final ۨ:J

.field public final ۫:Z

.field public final ۬:Ljava/lang/String;

.field public final ᩶:Ll/᩵ᩴ֫;

.field public final ᩸:J

.field public final ᩹:J

.field public final ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩸᩺֫;JIJLl/᩵ᩴ֫;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 359
    iput-object p1, p0, Ll/᩹᩺֫;->᩺:Ljava/lang/String;

    .line 360
    iput-object p2, p0, Ll/᩹᩺֫;->ۤ:Ll/᩸᩺֫;

    .line 361
    iput-wide p3, p0, Ll/᩹᩺֫;->ۙ:J

    .line 362
    iput p5, p0, Ll/᩹᩺֫;->ۛ:I

    .line 363
    iput-wide p6, p0, Ll/᩹᩺֫;->ۨ:J

    .line 364
    iput-object p8, p0, Ll/᩹᩺֫;->᩶:Ll/᩵ᩴ֫;

    .line 365
    iput-object p9, p0, Ll/᩹᩺֫;->۬:Ljava/lang/String;

    .line 366
    iput-object p10, p0, Ll/᩹᩺֫;->ۗ:Ljava/lang/String;

    .line 367
    iput-wide p11, p0, Ll/᩹᩺֫;->᩹:J

    .line 368
    iput-wide p13, p0, Ll/᩹᩺֫;->᩸:J

    .line 369
    iput-boolean p15, p0, Ll/᩹᩺֫;->۫:Z

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    .line 292
    check-cast p1, Ljava/lang/Long;

    .line 374
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩹᩺֫;->ۨ:J

    cmp-long v4, v2, v0

    if-lez v4, :cond_0

    const/4 p1, 0x1

    return p1

    .line 376
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long p1, v2, v0

    if-gez p1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
