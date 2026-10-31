.class public final synthetic Ll/ۙ᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:Ll/ܽۙܳ;

.field public final synthetic ᩸:Ll/᩶ۙܳ;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ۙܳ;Ll/ܽۢܳ;Ll/ܽۙܳ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩶ܳ;->᩸:Ll/᩶ۙܳ;

    iput-object p2, p0, Ll/ۙ᩶ܳ;->᩹:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/ۙ᩶ܳ;->᩶:Ll/ܽۙܳ;

    iput-object p4, p0, Ll/ۙ᩶ܳ;->ۙ:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 754
    new-instance v0, Ll/֫ۙܳ;

    iget-object v1, p0, Ll/ۙ᩶ܳ;->ۙ:Ll/֡ۚۢ;

    invoke-direct {v0, v1}, Ll/֫ۙܳ;-><init>(Ll/֡ۚۢ;)V

    iget-object v1, p0, Ll/ۙ᩶ܳ;->᩸:Ll/᩶ۙܳ;

    iget-object v2, p0, Ll/ۙ᩶ܳ;->᩹:Ll/ܽۢܳ;

    iget-object v3, p0, Ll/ۙ᩶ܳ;->᩶:Ll/ܽۙܳ;

    invoke-interface {v1, v2, p1, v3, v0}, Ll/᩶ۙܳ;->֫(Ll/ܽۢܳ;Landroid/view/View;Ll/ܽۙܳ;Ll/ᩳۙܳ;)V

    return-void
.end method
