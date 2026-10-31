.class public final Ll/֫᩻;
.super Ll/֨ۧܺ;
.source "45OX"


# instance fields
.field public final synthetic ֫:Ll/ܿ᩻;


# direct methods
.method public constructor <init>(Ll/ܿ᩻;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Ll/֫᩻;->֫:Ll/ܿ᩻;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd()V
    .locals 4

    .line 136
    iget-object v0, p0, Ll/֫᩻;->֫:Ll/ܿ᩻;

    iget-boolean v1, v0, Ll/ܿ᩻;->ܽ:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/ܿ᩻;->ᩳ:Landroid/view/View;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 137
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 138
    iget-object v1, v0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 140
    :cond_0
    iget-object v1, v0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Ll/ܶ᩷;->setVisibility(I)V

    .line 141
    iget-object v1, v0, Ll/ܿ᩻;->ۧ:Ll/ܶ᩷;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܶ᩷;->֫(Z)V

    const/4 v1, 0x0

    .line 142
    iput-object v1, v0, Ll/ܿ᩻;->ۜ:Ll/ۧۜ;

    .line 307
    iget-object v2, v0, Ll/ܿ᩻;->ۡ:Ll/ۙ᩻;

    if-eqz v2, :cond_1

    .line 308
    iget-object v3, v0, Ll/ܿ᩻;->ۢ:Ll/ᩳ᩻;

    check-cast v2, Ll/ᩳܳ;

    invoke-virtual {v2, v3}, Ll/ᩳܳ;->֫(Ll/ۗ᩻;)V

    .line 309
    iput-object v1, v0, Ll/ܿ᩻;->ۢ:Ll/ᩳ᩻;

    .line 310
    iput-object v1, v0, Ll/ܿ᩻;->ۡ:Ll/ۙ᩻;

    .line 144
    :cond_1
    iget-object v0, v0, Ll/ܿ᩻;->֨:Ll/ۤ᩷;

    if-eqz v0, :cond_2

    .line 145
    invoke-static {v0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    :cond_2
    return-void
.end method
