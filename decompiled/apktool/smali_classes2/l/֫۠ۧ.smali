.class public final Ll/֫۠ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "S8GQ"


# instance fields
.field public final synthetic ֫:Ll/᩷۠ۧ;


# direct methods
.method public constructor <init>(Ll/᩷۠ۧ;)V
    .locals 0

    .line 179
    iput-object p1, p0, Ll/֫۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 182
    iget-object p1, p0, Ll/֫۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-static {p1}, Ll/᩷۠ۧ;->ۢ(Ll/᩷۠ۧ;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 183
    invoke-static {p1}, Ll/᩷۠ۧ;->ۢ(Ll/᩷۠ۧ;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 185
    :cond_0
    invoke-static {p1}, Ll/᩷۠ۧ;->᩷(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 186
    invoke-static {p1}, Ll/᩷۠ۧ;->᩷(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 188
    :cond_1
    invoke-static {p1}, Ll/᩷۠ۧ;->ۖ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 189
    invoke-static {p1}, Ll/᩷۠ۧ;->ۖ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-static {p1}, Ll/᩷۠ۧ;->ܺ(Ll/᩷۠ۧ;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 191
    :cond_3
    invoke-static {p1}, Ll/᩷۠ۧ;->᩵(Ll/᩷۠ۧ;)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Ll/۟ۚۧ;

    if-eqz v0, :cond_4

    invoke-static {p1}, Ll/᩷۠ۧ;->ܺ(Ll/᩷۠ۧ;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 192
    invoke-static {p1}, Ll/᩷۠ۧ;->᩵(Ll/᩷۠ۧ;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۟ۚۧ;

    invoke-virtual {p1}, Ll/۟ۚۧ;->ᩳ()V

    :cond_4
    return-void
.end method
