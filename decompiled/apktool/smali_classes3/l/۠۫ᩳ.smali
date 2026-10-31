.class public final Ll/۠۫ᩳ;
.super Ljava/lang/Object;
.source "28WH"

# interfaces
.implements Ll/ᩴۤᩳ;


# instance fields
.field public final synthetic ֫:Ll/۟۫ᩳ;


# direct methods
.method public constructor <init>(Ll/۟۫ᩳ;)V
    .locals 0

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 172
    iget-object v0, p0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    invoke-static {v0}, Ll/۟۫ᩳ;->ۡ(Ll/۟۫ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/۟۫ᩳ;->ܳ(Ll/۟۫ᩳ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩷۟ᩳ;FFFFLandroid/graphics/Canvas;Ll/֫ۖܽ;Ll/᩺֫ܿ;)V
    .locals 11

    move-object v0, p0

    .line 197
    iget-object v1, v0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    const/4 v2, 0x1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-static/range {v1 .. v10}, Ll/۟۫ᩳ;->֫(Ll/۟۫ᩳ;ZLl/᩷۟ᩳ;FFFFLandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/᩺֫ܿ;)V

    return-void
.end method

.method public final ֫(Ll/᩷۟ᩳ;IIFFZLandroid/graphics/Canvas;Ll/֫ۖܽ;Ll/ۧۧܿ;Ll/᩺֫ܿ;)V
    .locals 13

    move-object v0, p0

    .line 192
    iget-object v1, v0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    const/4 v2, 0x1

    move-object v3, p1

    move v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    invoke-static/range {v1 .. v12}, Ll/۟۫ᩳ;->֫(Ll/۟۫ᩳ;ZLl/᩷۟ᩳ;IIFFZLandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/ۧۧܿ;Ll/᩺֫ܿ;)V

    return-void
.end method

.method public final ֫(Ll/᩷۟ᩳ;IIILandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/᩺֫ܿ;)V
    .locals 10

    move-object v0, p0

    .line 187
    iget-object v1, v0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    const/4 v2, 0x1

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-static/range {v1 .. v9}, Ll/۟۫ᩳ;->֫(Ll/۟۫ᩳ;ZLl/᩷۟ᩳ;IIILandroid/graphics/Canvas;Landroid/graphics/Paint;Ll/᩺֫ܿ;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 182
    iget-object v0, p0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    invoke-static {v0}, Ll/۟۫ᩳ;->᩻(Ll/۟۫ᩳ;)Ll/۫۫ᩳ;

    move-result-object v1

    invoke-static {v0, v1, p1}, Ll/۟۫ᩳ;->֫(Ll/۟۫ᩳ;Ll/۫۫ᩳ;Z)V

    return-void
.end method

.method public final ۧ()Z
    .locals 2

    .line 167
    iget-object v0, p0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    invoke-static {v0}, Ll/۟۫ᩳ;->ۡ(Ll/۟۫ᩳ;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/۟۫ᩳ;->ܳ(Ll/۟۫ᩳ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۠()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()V
    .locals 2

    .line 177
    iget-object v0, p0, Ll/۠۫ᩳ;->֫:Ll/۟۫ᩳ;

    invoke-static {v0}, Ll/۟۫ᩳ;->᩻(Ll/۟۫ᩳ;)Ll/۫۫ᩳ;

    move-result-object v0

    const/4 v1, 0x0

    .line 2047
    iput-boolean v1, v0, Ll/۫۫ᩳ;->ܽ:Z

    const/4 v1, 0x0

    .line 2048
    iput-object v1, v0, Ll/۫۫ᩳ;->᩻:Ll/۟᩺ᩳ;

    .line 2049
    iput-object v1, v0, Ll/۫۫ᩳ;->ۧ:Ljava/util/List;

    .line 2050
    iput-object v1, v0, Ll/۫۫ᩳ;->ۜ:Ll/᩺֫ܿ;

    .line 2051
    iput-object v1, v0, Ll/۫۫ᩳ;->ܿ:Ll/᩷۟ᩳ;

    .line 2052
    iget-object v0, v0, Ll/۫۫ᩳ;->֫:Ll/ܺۢᩴ;

    invoke-virtual {v0}, Ll/ܺۢᩴ;->clear()V

    return-void
.end method
