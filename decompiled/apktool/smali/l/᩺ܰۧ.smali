.class public final Ll/᩺ܰۧ;
.super Ll/ܽ۟ۧ;
.source "F1OQ"


# instance fields
.field public final synthetic ֫:Ll/ۖ۟ۧ;


# direct methods
.method public constructor <init>(Ll/ۖ۟ۧ;)V
    .locals 0

    .line 237
    iput-object p1, p0, Ll/᩺ܰۧ;->֫:Ll/ۖ۟ۧ;

    invoke-direct {p0}, Ll/ܽ۟ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageSelected(I)V
    .locals 1

    .line 240
    iget-object p1, p0, Ll/᩺ܰۧ;->֫:Ll/ۖ۟ۧ;

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 241
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object p1, p1, Ll/ۖ۟ۧ;->ܰ:Ll/۬۬ۧ;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/View;->requestFocus(I)Z

    :cond_0
    return-void
.end method
