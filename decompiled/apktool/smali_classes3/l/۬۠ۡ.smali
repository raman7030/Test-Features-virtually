.class public final Ll/۬۠ۡ;
.super Ljava/lang/Object;
.source "86WH"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۛ۠ۡ;


# direct methods
.method public constructor <init>(Ll/ۛ۠ۡ;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬۠ۡ;->᩸:Ll/ۛ۠ۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 76
    iget-object v0, p0, Ll/۬۠ۡ;->᩸:Ll/ۛ۠ۡ;

    invoke-static {v0}, Ll/ۛ۠ۡ;->᩷(Ll/ۛ۠ۡ;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Ll/ۛ۠ۡ;->᩻(Ll/ۛ۠ۡ;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 77
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 78
    invoke-static {v0}, Ll/ۛ۠ۡ;->ۢ(Ll/ۛ۠ۡ;)Ll/֫ܶۡ;

    move-result-object v3

    invoke-static {v0}, Ll/ۛ۠ۡ;->ۡ(Ll/ۛ۠ۡ;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    const v4, 0x3c888889

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/ۛ۠ۡ;->ۡ(Ll/ۛ۠ۡ;)J

    move-result-wide v4

    sub-long v4, v1, v4

    long-to-float v4, v4

    const v5, 0x3089705f    # 1.0E-9f

    mul-float v4, v4, v5

    :goto_0
    invoke-virtual {v3, v4}, Ll/֫ܶۡ;->֫(F)V

    .line 79
    invoke-static {v0, v1, v2}, Ll/ۛ۠ۡ;->ۧ(Ll/ۛ۠ۡ;J)V

    .line 80
    invoke-static {v0}, Ll/ۛ۠ۡ;->ۢ(Ll/ۛ۠ۡ;)Ll/֫ܶۡ;

    move-result-object v1

    iget v1, v1, Ll/֫ܶۡ;->ܳ:F

    invoke-static {v0}, Ll/ۛ۠ۡ;->ۢ(Ll/ۛ۠ۡ;)Ll/֫ܶۡ;

    move-result-object v2

    iget v2, v2, Ll/֫ܶۡ;->᩻:F

    invoke-static {v0, v1, v2}, Ll/ۛ۠ۡ;->֫(Ll/ۛ۠ۡ;FF)V

    .line 81
    invoke-static {v0}, Ll/ۛ۠ۡ;->ۢ(Ll/ۛ۠ۡ;)Ll/֫ܶۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ܶۡ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {v0}, Ll/ۛ۠ۡ;->ۖ(Ll/ۛ۠ۡ;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    .line 82
    :cond_2
    invoke-static {v0}, Ll/ۛ۠ۡ;->֨(Ll/ۛ۠ۡ;)V

    :cond_3
    :goto_1
    return-void
.end method
