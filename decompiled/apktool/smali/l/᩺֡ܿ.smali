.class public final synthetic Ll/᩺֡ܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# instance fields
.field public final synthetic ֫:Ljava/util/ArrayList;

.field public final synthetic ۧ:[Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;[Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺֡ܿ;->֫:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/᩺֡ܿ;->ۧ:[Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;IZ)V
    .locals 2

    .line 208
    iget-object v0, p0, Ll/᩺֡ܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܶۡ;

    .line 209
    iget-object v1, p0, Ll/᩺֡ܿ;->ۧ:[Z

    if-nez p3, :cond_1

    invoke-virtual {v0}, Ll/۠ܶۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p3, 0x1

    .line 210
    aput-boolean p3, v1, p2

    .line 212
    check-cast p1, Ll/᩵ܿ;

    invoke-virtual {p1}, Ll/᩵ܿ;->֫()Ll/ۖܿ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 214
    new-instance p3, Ll/֫ۚܿ;

    const/4 v0, 0x0

    invoke-direct {p3, p2, v0, p1}, Ll/֫ۚܿ;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void

    .line 218
    :cond_1
    aput-boolean p3, v1, p2

    return-void
.end method
