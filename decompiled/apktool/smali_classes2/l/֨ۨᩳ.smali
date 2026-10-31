.class public final Ll/֨ۨᩳ;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# instance fields
.field public final synthetic ᩸:Ll/۫ۨᩳ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;)V
    .locals 0

    .line 9218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۨᩳ;->᩸:Ll/۫ۨᩳ;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .line 9222
    iget-object v0, p0, Ll/֨ۨᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->ۘ֫(Ll/۫ۨᩳ;)Ll/᩺ۛᩳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9266
    iget-object v0, v0, Ll/᩺ۛᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final onScrollChanged()V
    .locals 2

    .line 9230
    iget-object v0, p0, Ll/֨ۨᩳ;->᩸:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->ۘ֫(Ll/۫ۨᩳ;)Ll/᩺ۛᩳ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 9266
    iget-object v1, v1, Ll/᩺ۛᩳ;->ۧ:Ll/۫ۨᩳ;

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 9234
    :cond_0
    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫()V

    return-void
.end method
