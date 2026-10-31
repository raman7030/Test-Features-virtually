.class public final Ll/ᩳܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/۠᩺ᩳ;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Landroid/view/View;)V
    .locals 0

    .line 290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܶᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ᩳܶᩳ;->᩹:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ֫()Landroid/view/View;
    .locals 2

    const v0, 0x7f0a04cf

    .line 309
    iget-object v1, p0, Ll/ᩳܶᩳ;->᩹:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ll/ۖۧܿ;
    .locals 4

    .line 293
    iget-object v0, p0, Ll/ᩳܶᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->᩸(Ll/᩹ܶᩳ;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 294
    :cond_0
    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩴ(Ll/᩹ܶᩳ;)Ll/ۨ᩵ᩳ;

    move-result-object v0

    .line 295
    iget-object v1, v0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    .line 296
    iget v2, v0, Ll/ۨ᩵ᩳ;->᩷:I

    .line 297
    new-instance v3, Ll/ܽܶᩳ;

    invoke-direct {v3, p0, v1, v2, v0}, Ll/ܽܶᩳ;-><init>(Ll/ᩳܶᩳ;Ll/ܰۘᩳ;ILl/ۨ᩵ᩳ;)V

    return-object v3
.end method
