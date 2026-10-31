.class public final Ll/ܺܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Lcom/tencent/open/TDialog;


# direct methods
.method public constructor <init>(Lcom/tencent/open/TDialog;)V
    .locals 0

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺܶۘ;->᩸:Lcom/tencent/open/TDialog;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 221
    iget-object v0, p0, Ll/ܺܶۘ;->᩸:Lcom/tencent/open/TDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 226
    :cond_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 231
    :cond_1
    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    .line 236
    :cond_2
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method
