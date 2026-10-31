.class public final Ll/۠ۗۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public final synthetic ֫:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;)V
    .locals 0

    .line 939
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۗۧ;->֫:Ll/۬۬ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 2

    .line 964
    iget-object v0, p0, Ll/۠ۗۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 966
    invoke-virtual {v0, v1}, Ll/۬۬ۧ;->dispatchChildDetached(Landroid/view/View;)V

    .line 971
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    .line 976
    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method
