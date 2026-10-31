.class public final synthetic Ll/ۧ᩶᩷;
.super Ljava/lang/Object;
.source "V933"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/᩸֡ᩴ;

.field public final synthetic ۙ:Ll/ܳ᩶᩷;

.field public final synthetic ᩶:Landroid/widget/ImageView;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ۨ᩹᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ll/ۨ᩹᩷;Landroid/widget/ImageView;Ll/ܳ᩶᩷;Ll/᩸֡ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩶᩷;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۧ᩶᩷;->᩹:Ll/ۨ᩹᩷;

    iput-object p3, p0, Ll/ۧ᩶᩷;->᩶:Landroid/widget/ImageView;

    iput-object p4, p0, Ll/ۧ᩶᩷;->ۙ:Ll/ܳ᩶᩷;

    iput-object p5, p0, Ll/ۧ᩶᩷;->ۗ:Ll/᩸֡ᩴ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 116
    new-instance p1, Ll/ۘۗܿ;

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ۧ᩶᩷;->᩸:Ll/ۗܺ᩷;

    invoke-direct {p1, v1, v0}, Ll/ۘۗܿ;-><init>(Landroid/content/Context;Z)V

    new-instance v0, Ll/ܳۚܳ;

    iget-object v1, p0, Ll/ۧ᩶᩷;->᩹:Ll/ۨ᩹᩷;

    iget-object v2, p0, Ll/ۧ᩶᩷;->᩶:Landroid/widget/ImageView;

    iget-object v3, p0, Ll/ۧ᩶᩷;->ۙ:Ll/ܳ᩶᩷;

    iget-object v4, p0, Ll/ۧ᩶᩷;->ۗ:Ll/᩸֡ᩴ;

    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܳۚܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    invoke-virtual {p1, v0}, Ll/ۘۗܿ;->֫(Ll/ۖۗܿ;)V

    iget v0, v1, Ll/ۨ᩹᩷;->֫:I

    .line 124
    invoke-virtual {p1, v0}, Ll/ۘۗܿ;->֫(I)V

    return-void
.end method
