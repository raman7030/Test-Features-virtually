.class public final Ll/ۨܿ;
.super Ll/֨ۧܺ;
.source "422Y"


# instance fields
.field public final synthetic ֫:Ll/᩺ܿ;


# direct methods
.method public constructor <init>(Ll/᩺ܿ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1351
    iput-object p1, p0, Ll/ۨܿ;->֫:Ll/᩺ܿ;

    return-void
.end method


# virtual methods
.method public final onAnimationEnd()V
    .locals 3

    .line 1359
    iget-object v0, p0, Ll/ۨܿ;->֫:Ll/᩺ܿ;

    iget-object v0, v0, Ll/᩺ܿ;->᩸:Ll/ۚܳ;

    iget-object v1, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 1360
    iget-object v1, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/ܶ᩺;->֫(Ll/᩸᩺;)V

    .line 1361
    iput-object v2, v0, Ll/ۚܳ;->۠֫:Ll/ܶ᩺;

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 1354
    iget-object v0, p0, Ll/ۨܿ;->֫:Ll/᩺ܿ;

    iget-object v0, v0, Ll/᩺ܿ;->᩸:Ll/ۚܳ;

    iget-object v0, v0, Ll/ۚܳ;->ۧ֫:Ll/᩹᩷;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/֨᩷;->setVisibility(I)V

    return-void
.end method
