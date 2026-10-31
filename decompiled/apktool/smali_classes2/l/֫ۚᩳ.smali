.class public final Ll/֫ۚᩳ;
.super Ljava/lang/Object;
.source "97J6"


# instance fields
.field public final ֫:I

.field public ۧ:I

.field public final synthetic ܳ:Ll/ۧۚᩳ;

.field public ܽ:I

.field public final ܿ:Ll/ۨ֡ᩳ;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۧۚᩳ;I)V
    .locals 2

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۚᩳ;->ܳ:Ll/ۧۚᩳ;

    .line 250
    iput p2, p0, Ll/֫ۚᩳ;->֫:I

    .line 251
    new-instance p2, Ll/ۨ֡ᩳ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    .line 30
    invoke-direct {p2, p1, v0}, Ll/ۨ֡ᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 251
    iput-object p2, p0, Ll/֫ۚᩳ;->ܿ:Ll/ۨ֡ᩳ;

    .line 252
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p1, v0, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 p1, 0x40000000    # 2.0f

    .line 253
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    const/4 v0, 0x0

    .line 254
    invoke-virtual {p2, p1, v0, p1, v0}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method
