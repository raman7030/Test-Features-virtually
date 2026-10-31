.class public final Ll/ۛۗۘ;
.super Ljava/lang/Object;
.source "G90S"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/֫۬ۘ;

.field public final synthetic ᩹:Ll/ܰۗۘ;


# direct methods
.method public constructor <init>(Ll/֫۬ۘ;IILl/ܰۗۘ;)V
    .locals 0

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۗۘ;->᩸:Ll/֫۬ۘ;

    iput p2, p0, Ll/ۛۗۘ;->᩶:I

    iput p3, p0, Ll/ۛۗۘ;->ۙ:I

    iput-object p4, p0, Ll/ۛۗۘ;->᩹:Ll/ܰۗۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 318
    iget-object v0, p0, Ll/ۛۗۘ;->᩸:Ll/֫۬ۘ;

    invoke-static {v0}, Ll/֫۬ۘ;->֫(Ll/֫۬ۘ;)Ll/۟ۗۘ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 320
    invoke-static {v0}, Ll/֫۬ۘ;->ۧ(Ll/֫۬ۘ;)Ljava/util/ArrayList;

    move-result-object v2

    iget v3, p0, Ll/ۛۗۘ;->᩶:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 321
    iget v2, p0, Ll/ۛۗۘ;->ۙ:I

    iget-object v4, p0, Ll/ۛۗۘ;->᩹:Ll/ܰۗۘ;

    invoke-static {v0, v3, v2, v4}, Ll/֫۬ۘ;->֫(Ll/֫۬ۘ;IILl/ܰۗۘ;)V

    .line 322
    check-cast v1, Ll/ᩳ۬ۘ;

    .line 53
    iget-object v0, v1, Ll/ᩳ۬ۘ;->ۧ:Landroid/widget/TextView;

    iget-object v1, v1, Ll/ᩳ۬ۘ;->֫:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
