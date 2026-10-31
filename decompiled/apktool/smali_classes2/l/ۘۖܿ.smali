.class public final Ll/ۘۖܿ;
.super Ljava/lang/Object;
.source "N70B"


# instance fields
.field public final ֫:Ll/ܿۖ᩷;

.field public volatile ۜ:Z

.field public volatile ۧ:Ll/ܺۖܿ;

.field public ܳ:Ll/ۢۖܿ;

.field public final ܽ:Ll/ۗۢܿ;

.field public final ܿ:Ll/ᩴۖܿ;

.field public final ᩳ:J

.field public final ᩻:Ll/᩺ܺܿ;


# direct methods
.method public constructor <init>(Ll/ᩴۖܿ;Ll/᩺ܺܿ;Ll/۟᩸ᩳ;JJLl/ܿۖ᩷;Ll/ܺۖܿ;Ll/ܶۘܿ;)V
    .locals 11

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 227
    iput-object v1, v0, Ll/ۘۖܿ;->ܿ:Ll/ᩴۖܿ;

    .line 228
    iput-object v2, v0, Ll/ۘۖܿ;->᩻:Ll/᩺ܺܿ;

    move-wide/from16 v4, p6

    .line 230
    iput-wide v4, v0, Ll/ۘۖܿ;->ᩳ:J

    move-object/from16 v1, p8

    .line 231
    iput-object v1, v0, Ll/ۘۖܿ;->֫:Ll/ܿۖ᩷;

    if-nez p9, :cond_0

    .line 233
    new-instance v1, Ll/ۖۖܿ;

    invoke-direct {v1, p0}, Ll/ۖۖܿ;-><init>(Ll/ۘۖܿ;)V

    invoke-virtual {p2, p3, v1}, Ll/᩺ܺܿ;->֫(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)Ll/ۗۢܿ;

    move-result-object v1

    iput-object v1, v0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    return-void

    .line 235
    :cond_0
    invoke-virtual/range {p10 .. p10}, Ll/ܶۘܿ;->ᩳ()I

    move-result v1

    invoke-virtual {p3}, Ll/۟᩸ᩳ;->length()I

    move-result v4

    if-ne v1, v4, :cond_3

    .line 239
    invoke-static/range {p9 .. p9}, Ll/ܺۖܿ;->ۧ(Ll/ܺۖܿ;)Ll/ᩳۢܿ;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static/range {p9 .. p9}, Ll/ܺۖܿ;->ۧ(Ll/ܺۖܿ;)Ll/ᩳۢܿ;

    move-result-object v1

    .line 240
    invoke-virtual/range {p10 .. p10}, Ll/ܶۘܿ;->ܿ()I

    move-result v4

    iget-object v5, v2, Ll/᩺ܺܿ;->ۡ:Ll/ܶۜܿ;

    invoke-virtual {v1, v4, v5}, Ll/ᩳۢܿ;->֫(ILl/ܶۜܿ;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 241
    :goto_0
    invoke-virtual {p2}, Ll/᩺ܺܿ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez v1, :cond_2

    .line 242
    new-instance v1, Ll/ۖۖܿ;

    invoke-direct {v1, p0}, Ll/ۖۖܿ;-><init>(Ll/ۘۖܿ;)V

    invoke-virtual {p2, p3, v1}, Ll/᩺ܺܿ;->֫(Ljava/lang/CharSequence;Ll/ܿۖ᩷;)Ll/ۗۢܿ;

    move-result-object v1

    goto :goto_1

    .line 243
    :cond_2
    new-instance v10, Ll/ۗۢܿ;

    new-instance v4, Ll/ۖۖܿ;

    invoke-direct {v4, p0}, Ll/ۖۖܿ;-><init>(Ll/ۘۖܿ;)V

    invoke-static/range {p9 .. p9}, Ll/ܺۖܿ;->ܳ(Ll/ܺۖܿ;)Ll/ۢۖܿ;

    move-result-object v5

    invoke-static/range {p9 .. p9}, Ll/ܺۖܿ;->ܽ(Ll/ܺۖܿ;)Ll/۫ۘܿ;

    move-result-object v6

    invoke-static/range {p9 .. p9}, Ll/ܺۖܿ;->֫(Ll/ܺۖܿ;)Ll/ۤ᩷ܿ;

    move-result-object v7

    invoke-static/range {p9 .. p9}, Ll/ܺۖܿ;->ۧ(Ll/ܺۖܿ;)Ll/ᩳۢܿ;

    move-result-object v8

    move-object v1, v10

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v9, p10

    invoke-direct/range {v1 .. v9}, Ll/ۗۢܿ;-><init>(Ll/᩺ܺܿ;Ll/۟᩸ᩳ;Ll/ۖۖܿ;Ll/ۢۖܿ;Ll/۫ۘܿ;Ll/ۤ᩷ܿ;Ll/ᩳۢܿ;Ll/ܶۘܿ;)V

    :goto_1
    iput-object v1, v0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    return-void

    .line 236
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "New text and change set lengths differ"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static bridge synthetic ֫(Ll/ۘۖܿ;Ll/ۢۖܿ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۘۖܿ;->ܳ:Ll/ۢۖܿ;

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۖܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۘۖܿ;->ᩳ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۘۖܿ;)Ll/ܺۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۖܿ;->ۧ:Ll/ܺۖܿ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۘۖܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۘۖܿ;->ۜ:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۘۖܿ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۘۖܿ;->ᩳ:J

    return-wide v0
.end method

.method private ܽ()V
    .locals 10

    const/4 v0, 0x0

    .line 286
    :try_start_0
    invoke-direct {p0}, Ll/ۘۖܿ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 287
    iget-object v1, p0, Ll/ۘۖܿ;->ܿ:Ll/ᩴۖܿ;

    invoke-static {v1, p0}, Ll/ᩴۖܿ;->֫(Ll/ᩴۖܿ;Ll/ۘۖܿ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 303
    iput-object v0, p0, Ll/ۘۖܿ;->ܳ:Ll/ۢۖܿ;

    return-void

    .line 290
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    invoke-virtual {v1}, Ll/ۗۢܿ;->᩻()Ll/ۢۖܿ;

    move-result-object v6

    .line 291
    iget-object v1, p0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    invoke-virtual {v1}, Ll/ۗۢܿ;->ܿ()Ll/ᩳۢܿ;

    move-result-object v7

    .line 292
    iget-object v1, p0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    invoke-virtual {v1}, Ll/ۗۢܿ;->ܳ()Ll/۫ۘܿ;

    move-result-object v8

    .line 293
    iget-object v1, p0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    invoke-virtual {v1}, Ll/ۗۢܿ;->ܽ()Ll/ۤ᩷ܿ;

    move-result-object v9

    .line 294
    iget-object v1, p0, Ll/ۘۖܿ;->ܳ:Ll/ۢۖܿ;

    invoke-virtual {v1, v6}, Ll/ۢۖܿ;->ۧ(Ll/ۢۖܿ;)Ll/ܳۖܿ;

    .line 296
    invoke-direct {p0}, Ll/ۘۖܿ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۘۖܿ;->ܿ:Ll/ᩴۖܿ;

    invoke-static {v1, p0}, Ll/ᩴۖܿ;->֫(Ll/ᩴۖܿ;Ll/ۘۖܿ;)V

    goto :goto_0

    .line 297
    :cond_1
    new-instance v1, Ll/ܺۖܿ;

    iget-object v3, p0, Ll/ۘۖܿ;->᩻:Ll/᩺ܺܿ;

    iget-wide v4, p0, Ll/ۘۖܿ;->ᩳ:J

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Ll/ܺۖܿ;-><init>(Ll/᩺ܺܿ;JLl/ۢۖܿ;Ll/ᩳۢܿ;Ll/۫ۘܿ;Ll/ۤ᩷ܿ;)V

    iput-object v1, p0, Ll/ۘۖܿ;->ۧ:Ll/ܺۖܿ;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 303
    :goto_0
    iput-object v0, p0, Ll/ۘۖܿ;->ܳ:Ll/ۢۖܿ;

    return-void

    :catchall_0
    move-exception v1

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 300
    :goto_1
    :try_start_2
    iget-object v2, p0, Ll/ۘۖܿ;->ܿ:Ll/ᩴۖܿ;

    invoke-static {v2, p0}, Ll/ᩴۖܿ;->֫(Ll/ᩴۖܿ;Ll/ۘۖܿ;)V

    .line 301
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 303
    :goto_2
    iput-object v0, p0, Ll/ۘۖܿ;->ܳ:Ll/ۢۖܿ;

    .line 304
    throw v1
.end method

.method public static bridge synthetic ܿ(Ll/ۘۖܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۘۖܿ;->ۜ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۘۖܿ;)Ll/ᩴۖܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۖܿ;->ܿ:Ll/ᩴۖܿ;

    return-object p0
.end method

.method private ᩳ()Z
    .locals 2

    .line 358
    iget-boolean v0, p0, Ll/ۘۖܿ;->ۜ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 361
    :cond_0
    iget-object v0, p0, Ll/ۘۖܿ;->֫:Ll/ܿۖ᩷;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 362
    iput-boolean v1, p0, Ll/ۘۖܿ;->ۜ:Z

    .line 364
    :cond_1
    iget-boolean v0, p0, Ll/ۘۖܿ;->ۜ:Z

    return v0
.end method

.method public static bridge synthetic ᩻(Ll/ۘۖܿ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۘۖܿ;->ᩳ()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(IJLl/᩺᩷ܿ;)Ll/ۙۢܿ;
    .locals 1

    .line 269
    iget-object v0, p0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    :try_start_0
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۗۢܿ;->֫(IJLl/᩺᩷ܿ;)Ll/ۙۢܿ;

    move-result-object p1

    .line 270
    sget-object p2, Ll/ۙۢܿ;->᩶:Ll/ۙۢܿ;

    if-ne p1, p2, :cond_0

    .line 271
    invoke-direct {p0}, Ll/ۘۖܿ;->ܽ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 275
    :goto_0
    invoke-virtual {v0}, Ll/ۗۢܿ;->ۜ()Ll/ۙۢܿ;

    move-result-object p2

    sget-object p3, Ll/ۙۢܿ;->᩹:Ll/ۙۢܿ;

    if-ne p2, p3, :cond_1

    const/4 p2, 0x0

    .line 276
    iput-object p2, p0, Ll/ۘۖܿ;->ܳ:Ll/ۢۖܿ;

    .line 277
    iget-object p2, p0, Ll/ۘۖܿ;->ܿ:Ll/ᩴۖܿ;

    invoke-static {p2, p0}, Ll/ᩴۖܿ;->֫(Ll/ᩴۖܿ;Ll/ۘۖܿ;)V

    .line 279
    :cond_1
    throw p1
.end method

.method public final ֫()Ll/ܺۖܿ;
    .locals 1

    .line 310
    iget-object v0, p0, Ll/ۘۖܿ;->ۧ:Ll/ܺۖܿ;

    return-object v0
.end method

.method public final ֫(Ll/᩷ۢܿ;Ljava/util/concurrent/Executor;Ll/ܶۡܿ;)V
    .locals 1

    .line 263
    iget-object v0, p0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۗۢܿ;->֫(Ll/᩷ۢܿ;Ljava/util/concurrent/Executor;Ll/ܶۡܿ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 258
    iget-object v0, p0, Ll/ۘۖܿ;->ܽ:Ll/ۗۢܿ;

    invoke-virtual {v0}, Ll/ۗۢܿ;->ۘ()V

    return-void
.end method
