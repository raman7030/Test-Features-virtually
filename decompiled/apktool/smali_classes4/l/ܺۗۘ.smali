.class public abstract Ll/ܺۗۘ;
.super Ljava/lang/Object;
.source "I90I"


# static fields
.field public static final ֫:Landroid/graphics/Paint;

.field public static final ۧ:Landroid/graphics/Rect;

.field public static final ܽ:Landroid/graphics/RectF;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Ll/ܺۗۘ;->ۧ:Landroid/graphics/Rect;

    .line 16
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Ll/ܺۗۘ;->ܽ:Landroid/graphics/RectF;

    .line 17
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Ll/ܺۗۘ;->֫:Landroid/graphics/Paint;

    return-void
.end method

.method public static ֫()Landroid/graphics/Paint;
    .locals 1

    .line 28
    sget-object v0, Ll/ܺۗۘ;->֫:Landroid/graphics/Paint;

    return-object v0
.end method

.method public static ۧ()Landroid/graphics/Rect;
    .locals 1

    .line 20
    sget-object v0, Ll/ܺۗۘ;->ۧ:Landroid/graphics/Rect;

    return-object v0
.end method

.method public static ܽ()Landroid/graphics/RectF;
    .locals 1

    .line 24
    sget-object v0, Ll/ܺۗۘ;->ܽ:Landroid/graphics/RectF;

    return-object v0
.end method
