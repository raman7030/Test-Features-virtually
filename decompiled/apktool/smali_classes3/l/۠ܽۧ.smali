.class public final Ll/۠ܽۧ;
.super Ll/ۙ᩵֫;
.source "J8TB"


# static fields
.field public static final ᩴ:Ljava/lang/Object;


# instance fields
.field public final ۖ:J

.field public final ۘ:J

.field public final ۜ:J

.field public final ۡ:J

.field public final ۢ:Z

.field public final ۧ:J

.field public final ܳ:Ljava/lang/Object;

.field public final ܺ:J

.field public final ܽ:Z

.field public final ܿ:Ll/ۛᩴ֫;

.field public final ᩳ:Z

.field public final ᩷:J

.field public final ᩻:Ll/ۧ᩵֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 32
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۠ܽۧ;->ᩴ:Ljava/lang/Object;

    .line 33
    new-instance v0, Ll/᩹ᩴ֫;

    invoke-direct {v0}, Ll/᩹ᩴ֫;-><init>()V

    const-string v1, "SinglePeriodTimeline"

    .line 34
    invoke-virtual {v0, v1}, Ll/᩹ᩴ֫;->֫(Ljava/lang/String;)V

    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ll/᩹ᩴ֫;->֫(Landroid/net/Uri;)V

    invoke-virtual {v0}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    return-void
.end method

.method public constructor <init>(JJJJJJZZZLl/ۜۡܽ;Ll/ۧ᩵֫;Ll/ۛᩴ֫;)V
    .locals 3

    move-object v0, p0

    .line 289
    invoke-direct {p0}, Ll/ۙ᩵֫;-><init>()V

    move-wide v1, p1

    .line 290
    iput-wide v1, v0, Ll/۠ܽۧ;->᩷:J

    move-wide v1, p3

    .line 291
    iput-wide v1, v0, Ll/۠ܽۧ;->ۘ:J

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 292
    iput-wide v1, v0, Ll/۠ܽۧ;->ۧ:J

    move-wide v1, p5

    .line 293
    iput-wide v1, v0, Ll/۠ܽۧ;->ۜ:J

    move-wide v1, p7

    .line 294
    iput-wide v1, v0, Ll/۠ܽۧ;->ܺ:J

    move-wide v1, p9

    .line 295
    iput-wide v1, v0, Ll/۠ܽۧ;->ۖ:J

    move-wide v1, p11

    .line 296
    iput-wide v1, v0, Ll/۠ܽۧ;->ۡ:J

    move/from16 v1, p13

    .line 297
    iput-boolean v1, v0, Ll/۠ܽۧ;->ᩳ:Z

    move/from16 v1, p14

    .line 298
    iput-boolean v1, v0, Ll/۠ܽۧ;->ܽ:Z

    move/from16 v1, p15

    .line 299
    iput-boolean v1, v0, Ll/۠ܽۧ;->ۢ:Z

    move-object/from16 v1, p16

    .line 300
    iput-object v1, v0, Ll/۠ܽۧ;->ܳ:Ljava/lang/Object;

    .line 155
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v1, p17

    .line 301
    iput-object v1, v0, Ll/۠ܽۧ;->᩻:Ll/ۧ᩵֫;

    move-object/from16 v1, p18

    .line 302
    iput-object v1, v0, Ll/۠ܽۧ;->ܿ:Ll/ۛᩴ֫;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Ljava/lang/Object;)I
    .locals 1

    .line 358
    sget-object v0, Ll/۠ܽۧ;->ᩴ:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    .line 363
    invoke-static {p1, v0}, Ll/᩺֡֫;->֫(II)V

    .line 364
    sget-object p1, Ll/۠ܽۧ;->ᩴ:Ljava/lang/Object;

    return-object p1
.end method

.method public final ֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x1

    move/from16 v2, p1

    .line 313
    invoke-static {v2, v1}, Ll/᩺֡֫;->֫(II)V

    .line 315
    iget-wide v1, v0, Ll/۠ܽۧ;->ۡ:J

    iget-boolean v13, v0, Ll/۠ܽۧ;->ܽ:Z

    if-eqz v13, :cond_1

    iget-boolean v3, v0, Ll/۠ܽۧ;->ۢ:Z

    if-nez v3, :cond_1

    const-wide/16 v3, 0x0

    cmp-long v5, p3, v3

    if-eqz v5, :cond_1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 316
    iget-wide v5, v0, Ll/۠ܽۧ;->ܺ:J

    cmp-long v7, v5, v3

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    add-long v1, v1, p3

    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    :goto_0
    move-wide v15, v3

    goto :goto_1

    :cond_1
    move-wide v15, v1

    .line 327
    :goto_1
    sget-object v1, Ll/᩶᩵֫;->ۚ:Ljava/lang/Object;

    iget-wide v1, v0, Ll/۠ܽۧ;->ܺ:J

    move-wide/from16 v17, v1

    iget-wide v1, v0, Ll/۠ܽۧ;->ۖ:J

    move-wide/from16 v19, v1

    iget-object v4, v0, Ll/۠ܽۧ;->᩻:Ll/ۧ᩵֫;

    iget-object v5, v0, Ll/۠ܽۧ;->ܳ:Ljava/lang/Object;

    iget-wide v6, v0, Ll/۠ܽۧ;->᩷:J

    iget-wide v8, v0, Ll/۠ܽۧ;->ۘ:J

    iget-wide v10, v0, Ll/۠ܽۧ;->ۧ:J

    iget-boolean v12, v0, Ll/۠ܽۧ;->ᩳ:Z

    iget-object v14, v0, Ll/۠ܽۧ;->ܿ:Ll/ۛᩴ֫;

    move-object/from16 v3, p2

    invoke-virtual/range {v3 .. v20}, Ll/᩶᩵֫;->֫(Ll/ۧ᩵֫;Ljava/lang/Object;JJJZZLl/ۛᩴ֫;JJJ)V

    return-object p2
.end method

.method public final ֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;
    .locals 10

    const/4 v0, 0x1

    .line 351
    invoke-static {p1, v0}, Ll/᩺֡֫;->֫(II)V

    if-eqz p3, :cond_0

    .line 352
    sget-object p1, Ll/۠ܽۧ;->ᩴ:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    .line 353
    iget-wide v0, p0, Ll/۠ܽۧ;->ۖ:J

    neg-long v6, v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    sget-object v8, Ll/۟ۘ֫;->ܽ:Ll/۟ۘ֫;

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-wide v4, p0, Ll/۠ܽۧ;->ۜ:J

    move-object v0, p2

    invoke-virtual/range {v0 .. v9}, Ll/᩹᩵֫;->֫(Ljava/lang/Object;Ljava/lang/Object;IJJLl/۟ۘ֫;Z)V

    return-object p2
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
