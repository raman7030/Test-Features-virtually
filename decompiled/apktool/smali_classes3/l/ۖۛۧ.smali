.class public final Ll/ۖۛۧ;
.super Ll/ᩳۨۧ;
.source "C5U9"


# instance fields
.field public final synthetic ֫:Landroidx/transition/FragmentTransitionSupport;

.field public final synthetic ۧ:Ljava/lang/Object;

.field public final synthetic ܽ:Ljava/util/ArrayList;

.field public final synthetic ܿ:Ljava/util/ArrayList;

.field public final synthetic ᩳ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/transition/FragmentTransitionSupport;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 289
    iput-object p1, p0, Ll/ۖۛۧ;->֫:Landroidx/transition/FragmentTransitionSupport;

    iput-object p2, p0, Ll/ۖۛۧ;->ۧ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۖۛۧ;->ܽ:Ljava/util/ArrayList;

    iput-object p4, p0, Ll/ۖۛۧ;->ᩳ:Ljava/lang/Object;

    iput-object p5, p0, Ll/ۖۛۧ;->ܿ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 0

    .line 305
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;)V
    .locals 3

    const/4 p1, 0x0

    .line 292
    iget-object v0, p0, Ll/ۖۛۧ;->֫:Landroidx/transition/FragmentTransitionSupport;

    iget-object v1, p0, Ll/ۖۛۧ;->ۧ:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 293
    iget-object v2, p0, Ll/ۖۛۧ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2, p1}, Landroidx/transition/FragmentTransitionSupport;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 298
    :cond_0
    iget-object v1, p0, Ll/ۖۛۧ;->ᩳ:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 299
    iget-object v2, p0, Ll/ۖۛۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2, p1}, Landroidx/transition/FragmentTransitionSupport;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    return-void
.end method
