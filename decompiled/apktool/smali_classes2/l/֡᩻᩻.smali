.class public final Ll/֡᩻᩻;
.super Ljava/lang/Object;
.source "5AG9"


# instance fields
.field public ֫:Ljava/lang/Object;

.field public final ۧ:Landroid/view/ViewGroup;

.field public final ܽ:Landroid/widget/TextView;

.field public final ܿ:Landroid/widget/TextView;

.field public final ᩳ:Ll/ۗۘ;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 5

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 268
    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    .line 269
    iput-object v0, p0, Ll/֡᩻᩻;->ۧ:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    .line 270
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 271
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/֡᩻᩻;->ܿ:Landroid/widget/TextView;

    .line 272
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-le v1, v4, :cond_0

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iput-object v1, p0, Ll/֡᩻᩻;->ܽ:Landroid/widget/TextView;

    .line 273
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-le v1, v4, :cond_1

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll/ۗۘ;

    :cond_1
    iput-object v3, p0, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    if-eqz v3, :cond_2

    .line 275
    new-instance v0, Ll/᩵᩻᩻;

    invoke-direct {v0, p0}, Ll/᩵᩻᩻;-><init>(Ll/֡᩻᩻;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Z)V
    .locals 2

    .line 304
    iget-object v0, p0, Ll/֡᩻᩻;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 305
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 306
    iget-object v0, p0, Ll/֡᩻᩻;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 307
    iget-object v0, p0, Ll/֡᩻᩻;->ܽ:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const v1, 0x3e99999a    # 0.3f

    .line 308
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 310
    :cond_1
    iget-object v0, p0, Ll/֡᩻᩻;->ᩳ:Ll/ۗۘ;

    if-eqz v0, :cond_2

    .line 311
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    :cond_2
    return-void
.end method
