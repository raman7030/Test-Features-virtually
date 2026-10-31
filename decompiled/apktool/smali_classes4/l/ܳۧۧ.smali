.class public final Ll/ܳۧۧ;
.super Ll/ۙ᩵֫;
.source "68QN"


# instance fields
.field public final ۧ:Ll/ۧ᩵֫;


# direct methods
.method public constructor <init>(Ll/ۧ᩵֫;)V
    .locals 0

    .line 350
    invoke-direct {p0}, Ll/ۙ᩵֫;-><init>()V

    .line 351
    iput-object p1, p0, Ll/ܳۧۧ;->ۧ:Ll/ۧ᩵֫;

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

    .line 401
    sget-object v0, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 0

    .line 406
    sget-object p1, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    return-object p1
.end method

.method public final ֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;
    .locals 20

    move-object/from16 v12, p2

    move-object/from16 v0, p2

    .line 361
    sget-object v1, Ll/᩶᩵֫;->ۚ:Ljava/lang/Object;

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v16, 0x0

    move-object/from16 v13, p0

    iget-object v1, v13, Ll/ܳۧۧ;->ۧ:Ll/ۧ᩵֫;

    const/4 v2, 0x0

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const-wide/16 v18, 0x0

    move-wide/from16 v12, v18

    invoke-virtual/range {v0 .. v17}, Ll/᩶᩵֫;->֫(Ll/ۧ᩵֫;Ljava/lang/Object;JJJZZLl/ۛᩴ֫;JJJ)V

    const/4 v0, 0x1

    move-object/from16 v1, p2

    .line 377
    iput-boolean v0, v1, Ll/᩶᩵֫;->ܳ:Z

    return-object v1
.end method

.method public final ֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;
    .locals 11

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    .line 389
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    if-eqz p3, :cond_1

    .line 390
    sget-object p1, Ll/ܿۧۧ;->ܿ:Ljava/lang/Object;

    :cond_1
    move-object v3, p1

    sget-object v9, Ll/۟ۘ֫;->ܽ:Ll/۟ۘ֫;

    const/4 v10, 0x1

    const/4 v4, 0x0

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v7, 0x0

    move-object v1, p2

    .line 388
    invoke-virtual/range {v1 .. v10}, Ll/᩹᩵֫;->֫(Ljava/lang/Object;Ljava/lang/Object;IJJLl/۟ۘ֫;Z)V

    return-object p2
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
