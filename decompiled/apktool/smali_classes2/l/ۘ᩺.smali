.class public final Ll/ۘ᩺;
.super Ljava/lang/Object;
.source "E9O4"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩸:Landroid/view/ViewGroup;

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ۘ᩺;->᩸:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 89
    iget v0, p0, Ll/ۘ᩺;->᩹:I

    iget-object v1, p0, Ll/ۘ᩺;->᩸:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 90
    iget v0, p0, Ll/ۘ᩺;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۘ᩺;->᩹:I

    iget-object v1, p0, Ll/ۘ᩺;->᩸:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 91
    iget v0, p0, Ll/ۘ᩺;->᩹:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۘ᩺;->᩹:I

    iget-object v1, p0, Ll/ۘ᩺;->᩸:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method
