.class public final Ll/ۙܽۧ;
.super Ll/ۢ֫ۧ;
.source "58MT"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ֫֫:Ll/۠ܽۧ;

.field public final ۛ:Ll/ۗ۠֫;

.field public final ۟:Ll/ۧ᩵֫;

.field public final ۤ:Ll/ܶ۠֫;

.field public ۧ֫:Ll/֡ܶ֫;

.field public final ۨ:J

.field public final ܰ:Ll/ۧܳۧ;

.field public final ܽ֫:Z

.field public final ᩺:Ll/۠ᩴ֫;


# direct methods
.method public constructor <init>(Ll/֫᩵֫;Ll/ܶ۠֫;Ll/ۧܳۧ;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 193
    invoke-direct/range {p0 .. p0}, Ll/ۢ֫ۧ;-><init>()V

    move-object/from16 v2, p2

    .line 194
    iput-object v2, v0, Ll/ۙܽۧ;->ۤ:Ll/ܶ۠֫;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 195
    iput-wide v8, v0, Ll/ۙܽۧ;->ۨ:J

    move-object/from16 v2, p3

    .line 196
    iput-object v2, v0, Ll/ۙܽۧ;->ܰ:Ll/ۧܳۧ;

    const/4 v2, 0x1

    .line 197
    iput-boolean v2, v0, Ll/ۙܽۧ;->ܽ֫:Z

    .line 198
    new-instance v3, Ll/᩹ᩴ֫;

    invoke-direct {v3}, Ll/᩹ᩴ֫;-><init>()V

    sget-object v4, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 200
    invoke-virtual {v3, v4}, Ll/᩹ᩴ֫;->֫(Landroid/net/Uri;)V

    iget-object v4, v1, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    .line 201
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/᩹ᩴ֫;->֫(Ljava/lang/String;)V

    .line 202
    invoke-static/range {p1 .. p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/᩹ᩴ֫;->֫(Ljava/util/List;)V

    const/4 v4, 0x0

    .line 203
    invoke-virtual {v3, v4}, Ll/᩹ᩴ֫;->֫(Ljava/lang/Object;)V

    .line 204
    invoke-virtual {v3}, Ll/᩹ᩴ֫;->֫()Ll/ۧ᩵֫;

    move-result-object v6

    iput-object v6, v0, Ll/ۙܽۧ;->۟:Ll/ۧ᩵֫;

    .line 205
    new-instance v3, Ll/֨ᩴ֫;

    invoke-direct {v3}, Ll/֨ᩴ֫;-><init>()V

    iget-object v5, v1, Ll/֫᩵֫;->ᩳ:Ljava/lang/String;

    const-string v7, "text/x-unknown"

    .line 207
    invoke-static {v5, v7}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ܳ(Ljava/lang/String;)V

    iget-object v5, v1, Ll/֫᩵֫;->ܽ:Ljava/lang/String;

    .line 208
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ܿ(Ljava/lang/String;)V

    iget v5, v1, Ll/֫᩵֫;->ܳ:I

    .line 209
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ܶ(I)V

    iget v5, v1, Ll/֫᩵֫;->ܿ:I

    .line 210
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ۚ(I)V

    iget-object v5, v1, Ll/֫᩵֫;->ۧ:Ljava/lang/String;

    .line 211
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ᩳ(Ljava/lang/String;)V

    .line 212
    iget-object v5, v1, Ll/֫᩵֫;->֫:Ljava/lang/String;

    if-eqz v5, :cond_0

    move-object v4, v5

    :cond_0
    invoke-virtual {v3, v4}, Ll/֨ᩴ֫;->ܽ(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v3

    iput-object v3, v0, Ll/ۙܽۧ;->᩺:Ll/۠ᩴ֫;

    .line 214
    new-instance v3, Ll/ۙ۠֫;

    invoke-direct {v3}, Ll/ۙ۠֫;-><init>()V

    iget-object v1, v1, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    .line 216
    invoke-virtual {v3, v1}, Ll/ۙ۠֫;->֫(Landroid/net/Uri;)V

    .line 217
    invoke-virtual {v3, v2}, Ll/ۙ۠֫;->֫(I)V

    .line 218
    invoke-virtual {v3}, Ll/ۙ۠֫;->֫()Ll/ۗ۠֫;

    move-result-object v1

    iput-object v1, v0, Ll/ۙܽۧ;->ۛ:Ll/ۗ۠֫;

    .line 219
    new-instance v7, Ll/۠ܽۧ;

    move-object v1, v7

    const/16 v16, 0x0

    const/16 v19, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v6

    move-object/from16 v20, v7

    move-wide v6, v8

    .line 165
    invoke-direct/range {v1 .. v19}, Ll/۠ܽۧ;-><init>(JJJJJJZZZLl/ۜۡܽ;Ll/ۧ᩵֫;Ll/ۛᩴ֫;)V

    move-object/from16 v1, v20

    .line 219
    iput-object v1, v0, Ll/ۙܽۧ;->֫֫:Ll/۠ܽۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܺۧۧ;Ll/᩸ܿۧ;J)Ll/ۢۧۧ;
    .locals 11

    .line 250
    new-instance p2, Ll/᩹ܽۧ;

    iget-object v3, p0, Ll/ۙܽۧ;->ۧ֫:Ll/֡ܶ֫;

    .line 257
    invoke-virtual {p0, p1}, Ll/ۢ֫ۧ;->ۧ(Ll/ܺۧۧ;)Ll/۠ۧۧ;

    move-result-object v8

    iget-boolean v9, p0, Ll/ۙܽۧ;->ܽ֫:Z

    const/4 v10, 0x0

    .line 259
    iget-object v1, p0, Ll/ۙܽۧ;->ۛ:Ll/ۗ۠֫;

    iget-object v2, p0, Ll/ۙܽۧ;->ۤ:Ll/ܶ۠֫;

    iget-object v4, p0, Ll/ۙܽۧ;->᩺:Ll/۠ᩴ֫;

    iget-wide v5, p0, Ll/ۙܽۧ;->ۨ:J

    iget-object v7, p0, Ll/ۙܽۧ;->ܰ:Ll/ۧܳۧ;

    move-object v0, p2

    invoke-direct/range {v0 .. v10}, Ll/᩹ܽۧ;-><init>(Ll/ۗ۠֫;Ll/ܶ۠֫;Ll/֡ܶ֫;Ll/۠ᩴ֫;JLl/ۧܳۧ;Ll/۠ۧۧ;ZLl/۠ܳۧ;)V

    return-object p2
.end method

.method public final ֫()Ll/ۧ᩵֫;
    .locals 1

    .line 234
    iget-object v0, p0, Ll/ۙܽۧ;->۟:Ll/ۧ᩵֫;

    return-object v0
.end method

.method public final ֫(Ll/֡ܶ֫;)V
    .locals 0

    .line 239
    iput-object p1, p0, Ll/ۙܽۧ;->ۧ֫:Ll/֡ܶ֫;

    .line 240
    iget-object p1, p0, Ll/ۙܽۧ;->֫֫:Ll/۠ܽۧ;

    invoke-virtual {p0, p1}, Ll/ۢ֫ۧ;->֫(Ll/ۙ᩵֫;)V

    return-void
.end method

.method public final ֫(Ll/ۢۧۧ;)V
    .locals 1

    .line 264
    check-cast p1, Ll/᩹ܽۧ;

    .line 103
    iget-object p1, p1, Ll/᩹ܽۧ;->۫:Ll/ۡܳۧ;

    const/4 v0, 0x0

    .line 318
    invoke-virtual {p1, v0}, Ll/ۡܳۧ;->֫(Ll/ۜܳۧ;)V

    return-void
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ᩷()V
    .locals 0

    return-void
.end method
