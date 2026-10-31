.class public final synthetic Ll/ۧ۫ۡ;
.super Ljava/lang/Object;
.source "1AG9"

# interfaces
.implements Ll/᩻۫ۡ;


# instance fields
.field public final synthetic ֫:F

.field public final synthetic ۧ:Ll/᩻۫ۡ;


# direct methods
.method public synthetic constructor <init>(FLl/᩻۫ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۧ۫ۡ;->֫:F

    iput-object p2, p0, Ll/ۧ۫ۡ;->ۧ:Ll/᩻۫ۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFLjava/lang/Runnable;)Z
    .locals 12

    move-object v1, p0

    move-object v10, p1

    .line 2
    iget v0, v1, Ll/ۧ۫ۡ;->֫:F

    .line 4
    iget-object v2, v1, Ll/ۧ۫ۡ;->ۧ:Ll/᩻۫ۡ;

    .line 1152
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v11

    const/4 v3, 0x0

    const v4, 0x3e4ccccd    # 0.2f

    .line 1154
    :try_start_0
    invoke-virtual {p1, v4, v3}, Landroid/graphics/Canvas;->skew(FF)V

    neg-float v5, v0

    .line 1155
    invoke-virtual {p1, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    mul-float v3, p6, v4

    sub-float v5, p3, v3

    add-float v6, p4, v0

    mul-float v3, p4, v4

    sub-float v7, p5, v3

    add-float v8, p6, v0

    .line 1156
    new-instance v9, Ll/ܳ۫ۡ;

    move-object/from16 v3, p7

    invoke-direct {v9, p1, v0, v3}, Ll/ܳ۫ۡ;-><init>(Landroid/graphics/Canvas;FLjava/lang/Runnable;)V

    move-object v3, p1

    move-object v4, p2

    invoke-interface/range {v2 .. v9}, Ll/᩻۫ۡ;->֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFLjava/lang/Runnable;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1169
    invoke-virtual {p1, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return v0

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1170
    throw v0
.end method
