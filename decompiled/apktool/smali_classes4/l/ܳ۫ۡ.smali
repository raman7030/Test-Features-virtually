.class public final synthetic Ll/ܳ۫ۡ;
.super Ljava/lang/Object;
.source "1AG9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Runnable;

.field public final synthetic ᩸:Landroid/graphics/Canvas;

.field public final synthetic ᩹:F


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Canvas;FLjava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ۫ۡ;->᩸:Landroid/graphics/Canvas;

    iput p2, p0, Ll/ܳ۫ۡ;->᩹:F

    iput-object p3, p0, Ll/ܳ۫ۡ;->᩶:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/ܳ۫ۡ;->᩹:F

    .line 4
    iget-object v1, p0, Ll/ܳ۫ۡ;->᩶:Ljava/lang/Runnable;

    .line 1159
    iget-object v2, p0, Ll/ܳ۫ۡ;->᩸:Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    move-result v3

    const/4 v4, 0x0

    .line 1161
    :try_start_0
    invoke-virtual {v2, v4, v0}, Landroid/graphics/Canvas;->translate(FF)V

    const v0, -0x41b33333    # -0.2f

    .line 1162
    invoke-virtual {v2, v0, v4}, Landroid/graphics/Canvas;->skew(FF)V

    .line 1163
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1165
    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1166
    throw v0
.end method
