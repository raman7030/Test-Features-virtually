.class public final Ll/᩺᩸ۜ;
.super Ljava/lang/Object;
.source "O8UQ"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ۗ:Ll/ۚۡ֫;

.field public final synthetic ۙ:Ll/۬᩸ۜ;

.field public final synthetic ۤ:Ljava/lang/Runnable;

.field public final synthetic ۫:Ll/ۙ᩸ۜ;

.field public final synthetic ۬:Ll/۫᩸ۜ;

.field public final synthetic ᩶:Ll/֫᩹ۜ;

.field public final synthetic ᩸:Ll/ᩳ᩹ۜ;

.field public final synthetic ᩹:[Ll/᩸ۖ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩹ۜ;Ll/۬᩸ۜ;Ll/ۚۡ֫;Ll/۫᩸ۜ;Ll/ۙ᩸ۜ;Ljava/lang/Runnable;[Ll/᩸ۖ;Ll/֫᩹ۜ;)V
    .locals 0

    .line 277
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩸ۜ;->᩸:Ll/ᩳ᩹ۜ;

    iput-object p2, p0, Ll/᩺᩸ۜ;->ۙ:Ll/۬᩸ۜ;

    iput-object p3, p0, Ll/᩺᩸ۜ;->ۗ:Ll/ۚۡ֫;

    iput-object p4, p0, Ll/᩺᩸ۜ;->۬:Ll/۫᩸ۜ;

    iput-object p5, p0, Ll/᩺᩸ۜ;->۫:Ll/ۙ᩸ۜ;

    iput-object p6, p0, Ll/᩺᩸ۜ;->ۤ:Ljava/lang/Runnable;

    iput-object p7, p0, Ll/᩺᩸ۜ;->᩹:[Ll/᩸ۖ;

    iput-object p8, p0, Ll/᩺᩸ۜ;->᩶:Ll/֫᩹ۜ;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 280
    iget-object p1, p0, Ll/᩺᩸ۜ;->᩸:Ll/ᩳ᩹ۜ;

    invoke-static {p1}, Ll/ᩳ᩹ۜ;->֫(Ll/ᩳ᩹ۜ;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Ll/᩺᩸ۜ;->ۙ:Ll/۬᩸ۜ;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    iget-object p1, p0, Ll/᩺᩸ۜ;->ۗ:Ll/ۚۡ֫;

    iget-object v0, p0, Ll/᩺᩸ۜ;->۬:Ll/۫᩸ۜ;

    invoke-virtual {p1, v0}, Ll/֡ۡ֫;->֫(Ll/֨ۡ֫;)V

    .line 282
    iget-object p1, p0, Ll/᩺᩸ۜ;->۫:Ll/ۙ᩸ۜ;

    invoke-static {p1}, Ll/᩸᩶ۜ;->֫(Ll/ۙ᩸ۜ;)V

    .line 283
    iget-object p1, p0, Ll/᩺᩸ۜ;->ۤ:Ljava/lang/Runnable;

    check-cast p1, Ll/ۨ᩸ۜ;

    invoke-virtual {p1}, Ll/ۨ᩸ۜ;->run()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 288
    iget-object p1, p0, Ll/᩺᩸ۜ;->᩹:[Ll/᩸ۖ;

    const/4 v0, 0x0

    aget-object v1, p1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 289
    invoke-virtual {v1}, Ll/᩸ۖ;->֫()V

    .line 290
    aput-object v2, p1, v0

    .line 292
    :cond_0
    iget-object p1, p0, Ll/᩺᩸ۜ;->᩶:Ll/֫᩹ۜ;

    invoke-static {p1}, Ll/֫᩹ۜ;->֫(Ll/֫᩹ۜ;)Ll/۬ۗܿ;

    move-result-object v0

    .line 293
    invoke-static {p1, v2}, Ll/֫᩹ۜ;->֫(Ll/֫᩹ۜ;Ll/۬ۗܿ;)V

    if-eqz v0, :cond_1

    .line 295
    invoke-virtual {v0}, Ll/۬ۗܿ;->ۧ()V

    .line 297
    :cond_1
    iget-object p1, p0, Ll/᩺᩸ۜ;->᩸:Ll/ᩳ᩹ۜ;

    invoke-static {p1}, Ll/ᩳ᩹ۜ;->֫(Ll/ᩳ᩹ۜ;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Ll/᩺᩸ۜ;->ۙ:Ll/۬᩸ۜ;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 298
    iget-object p1, p0, Ll/᩺᩸ۜ;->ۗ:Ll/ۚۡ֫;

    iget-object v0, p0, Ll/᩺᩸ۜ;->۬:Ll/۫᩸ۜ;

    invoke-virtual {p1, v0}, Ll/֡ۡ֫;->ۧ(Ll/֨ۡ֫;)V

    .line 299
    iget-object p1, p0, Ll/᩺᩸ۜ;->۫:Ll/ۙ᩸ۜ;

    invoke-static {p1}, Ll/᩸᩶ۜ;->ۧ(Ll/ۙ᩸ۜ;)V

    .line 300
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Ll/᩺᩸ۜ;->ۤ:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
