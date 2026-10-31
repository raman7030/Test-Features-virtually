.class public Ll/֨᩷ۡ;
.super Ll/ܳܺ;
.source "L958"


# instance fields
.field public final ᩸:Ll/ۚ᩷ۡ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, p2, v0}, Ll/֨᩷ۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2, p3}, Ll/ܳܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    new-instance p1, Ll/ۚ᩷ۡ;

    invoke-direct {p1}, Ll/ۚ᩷ۡ;-><init>()V

    iput-object p1, p0, Ll/֨᩷ۡ;->᩸:Ll/ۚ᩷ۡ;

    .line 25
    invoke-virtual {p1}, Ll/ۚ᩷ۡ;->֫()V

    .line 26
    invoke-virtual {p1}, Ll/ۚ᩷ۡ;->ۧ()V

    const p2, -0xf0f10

    .line 27
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 28
    invoke-virtual {p0, p1}, Ll/ܳܺ;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final ܽ()Ll/ۚ᩷ۡ;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/֨᩷ۡ;->᩸:Ll/ۚ᩷ۡ;

    return-object v0
.end method
