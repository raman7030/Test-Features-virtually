.class public final Ll/ܽ۫;
.super Ljava/lang/Object;
.source "35OZ"


# static fields
.field public static final synthetic ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 288
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Ll/ۧ۫;->֫:Ll/ۧ۫;

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    .line 289
    invoke-virtual {v1, v2}, Ll/ۧ۫;->֫(I)I

    :cond_0
    if-lt v0, v2, :cond_1

    const/16 v3, 0x1f

    .line 304
    invoke-virtual {v1, v3}, Ll/ۧ۫;->֫(I)I

    :cond_1
    if-lt v0, v2, :cond_2

    const/16 v3, 0x21

    .line 320
    invoke-virtual {v1, v3}, Ll/ۧ۫;->֫(I)I

    :cond_2
    if-lt v0, v2, :cond_3

    const v0, 0xf4240

    .line 336
    invoke-virtual {v1, v0}, Ll/ۧ۫;->֫(I)I

    :cond_3
    return-void
.end method
