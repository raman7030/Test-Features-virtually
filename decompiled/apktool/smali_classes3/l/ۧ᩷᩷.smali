.class public final Ll/ۧ᩷᩷;
.super Ljava/lang/Object;
.source "P7RC"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 251
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۧ᩷᩷;->ۧ:Ljava/lang/ref/WeakReference;

    .line 252
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 253
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    :cond_0
    const/4 p1, -0x2

    .line 254
    :goto_0
    iput p1, p0, Ll/ۧ᩷᩷;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 258
    iget-object v0, p0, Ll/ۧ᩷᩷;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 260
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 262
    iget v1, p0, Ll/ۧ᩷᩷;->֫:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    :cond_0
    return-void
.end method
