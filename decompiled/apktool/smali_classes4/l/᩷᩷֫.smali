.class public final Ll/᩷᩷֫;
.super Landroid/transition/Transition$EpicenterCallback;
.source "451G"


# instance fields
.field public final synthetic ֫:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;)V
    .locals 0

    .line 349
    iput-object p1, p0, Ll/᩷᩷֫;->֫:Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/transition/Transition$EpicenterCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGetEpicenter(Landroid/transition/Transition;)Landroid/graphics/Rect;
    .locals 1

    .line 352
    iget-object p1, p0, Ll/᩷᩷֫;->֫:Landroid/graphics/Rect;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
