.class public final Ll/ᩴܳ֫;
.super Ljava/lang/Object;
.source "RB93"

# interfaces
.implements Ll/ܳ۫;


# instance fields
.field public final synthetic ֫:Ll/۠ܳ֫;

.field public final synthetic ۧ:Landroid/view/ViewGroup;

.field public final synthetic ܽ:Ll/ۙ᩷֫;

.field public final synthetic ᩳ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;Ll/۠ܳ֫;Ll/ۙ᩷֫;)V
    .locals 0

    .line 325
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴܳ֫;->ᩳ:Landroid/view/View;

    iput-object p2, p0, Ll/ᩴܳ֫;->ۧ:Landroid/view/ViewGroup;

    iput-object p3, p0, Ll/ᩴܳ֫;->֫:Ll/۠ܳ֫;

    iput-object p4, p0, Ll/ᩴܳ֫;->ܽ:Ll/ۙ᩷֫;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 328
    iget-object v0, p0, Ll/ᩴܳ֫;->ᩳ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 329
    iget-object v1, p0, Ll/ᩴܳ֫;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 330
    iget-object v0, p0, Ll/ᩴܳ֫;->֫:Ll/۠ܳ֫;

    invoke-virtual {v0}, Ll/ܶܳ֫;->֫()V

    const/4 v0, 0x2

    .line 331
    invoke-static {v0}, Ll/ۚۜ֫;->ܿ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    iget-object v0, p0, Ll/ᩴܳ֫;->ܽ:Ll/ۙ᩷֫;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    return-void
.end method
