.class public final Ll/ᩴۛۧ;
.super Ll/۬ۛۧ;
.source "C5U9"


# instance fields
.field public final synthetic ֫:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;)V
    .locals 0

    .line 2650
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 425
    iput-object p1, p0, Ll/ᩴۛۧ;->֫:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Rect;
    .locals 2

    .line 428
    iget-object v0, p0, Ll/ᩴۛۧ;->֫:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method
