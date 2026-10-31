.class public final synthetic Ll/ۙۤ᩻;
.super Ljava/lang/Object;
.source "I6X2"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Landroid/graphics/drawable/GradientDrawable;

.field public final synthetic ᩶:Landroid/widget/ImageView;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:[I


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/GradientDrawable;Landroid/widget/ImageView;Ll/ۗܺ᩷;[I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ll/ۙۤ᩻;->᩸:Ll/ۗܺ᩷;

    iput-object p4, p0, Ll/ۙۤ᩻;->᩹:[I

    iput-object p2, p0, Ll/ۙۤ᩻;->᩶:Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۙۤ᩻;->ۙ:Landroid/graphics/drawable/GradientDrawable;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 79
    new-instance p1, Ll/ۘۗܿ;

    iget-object v0, p0, Ll/ۙۤ᩻;->᩸:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ll/ۘۗܿ;-><init>(Landroid/content/Context;Z)V

    new-instance v2, Ll/ۗۤ᩻;

    iget-object v3, p0, Ll/ۙۤ᩻;->ۙ:Landroid/graphics/drawable/GradientDrawable;

    iget-object v4, p0, Ll/ۙۤ᩻;->᩶:Landroid/widget/ImageView;

    iget-object v5, p0, Ll/ۙۤ᩻;->᩹:[I

    invoke-direct {v2, v3, v4, v0, v5}, Ll/ۗۤ᩻;-><init>(Landroid/graphics/drawable/GradientDrawable;Landroid/widget/ImageView;Ll/ۗܺ᩷;[I)V

    .line 80
    invoke-virtual {p1, v2}, Ll/ۘۗܿ;->֫(Ll/ۖۗܿ;)V

    aget v1, v5, v1

    .line 173
    invoke-static {v0, v1}, Ll/᩸ۛ᩻;->֫(Landroid/content/Context;I)I

    move-result v0

    .line 84
    invoke-virtual {p1, v0}, Ll/ۘۗܿ;->֫(I)V

    return-void
.end method
