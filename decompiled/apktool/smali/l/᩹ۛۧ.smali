.class public final Ll/᩹ۛۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "G5Y2"


# instance fields
.field public final synthetic ֫:Ll/ܽۨۧ;

.field public final synthetic ۧ:Ll/ۖ᩵;


# direct methods
.method public constructor <init>(Ll/ܽۨۧ;Ll/ۖ᩵;)V
    .locals 0

    .line 955
    iput-object p1, p0, Ll/᩹ۛۧ;->֫:Ll/ܽۨۧ;

    iput-object p2, p0, Ll/᩹ۛۧ;->ۧ:Ll/ۖ᩵;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 963
    iget-object v0, p0, Ll/᩹ۛۧ;->ۧ:Ll/ۖ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    iget-object v0, p0, Ll/᩹ۛۧ;->֫:Ll/ܽۨۧ;

    iget-object v0, v0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 958
    iget-object v0, p0, Ll/᩹ۛۧ;->֫:Ll/ܽۨۧ;

    iget-object v0, v0, Ll/ܽۨۧ;->mCurrentAnimators:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
