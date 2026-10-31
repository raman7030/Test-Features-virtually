.class public final Ll/ܳ᩺ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "560O"


# instance fields
.field public final synthetic ֫:Ll/᩷᩺ۧ;


# direct methods
.method public constructor <init>(Ll/᩷᩺ۧ;)V
    .locals 0

    .line 788
    iput-object p1, p0, Ll/ܳ᩺ۧ;->֫:Ll/᩷᩺ۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 801
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ܳ᩺ۧ;->֫:Ll/᩷᩺ۧ;

    iget-object v1, v0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 803
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 805
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩺ۧ;

    invoke-virtual {v3, v0}, Ll/ᩳ᩺ۧ;->onAnimationEnd(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 4

    .line 791
    new-instance p1, Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ܳ᩺ۧ;->֫:Ll/᩷᩺ۧ;

    iget-object v1, v0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 793
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 795
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩺ۧ;

    invoke-virtual {v3, v0}, Ll/ᩳ᩺ۧ;->onAnimationStart(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
