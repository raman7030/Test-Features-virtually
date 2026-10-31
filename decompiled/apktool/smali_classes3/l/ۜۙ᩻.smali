.class public final synthetic Ll/ۜۙ᩻;
.super Ljava/lang/Object;
.source "75VW"

# interfaces
.implements Ll/᩶᩷ۧ;
.implements Ll/֫۠ܳ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜۙ᩻;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۜۙ᩻;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫()Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public ֫(Ll/ۤۘۧ;)Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public ֫(Z)Ll/᩶᩷ۧ;
    .locals 0

    return-object p0
.end method

.method public ֫(Landroid/widget/TextView;)V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۜۙ᩻;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Landroid/text/SpannableStringBuilder;

    .line 6
    iget-object v1, p0, Ll/ۜۙ᩻;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/ۗ᩺ۡ;

    .line 61
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    invoke-static {p1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 63
    new-instance v0, Ll/ᩳۘܳ;

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1}, Ll/ᩳۘܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public ֫(Landroid/net/Uri;Ljava/util/Map;)[Ll/֨᩷ۧ;
    .locals 0

    .line 102
    iget-object p1, p0, Ll/ۜۙ᩻;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/᩺֫ۧ;

    iget-object p2, p0, Ll/ۜۙ᩻;->᩹:Ljava/lang/Object;

    check-cast p2, Ll/۠ᩴ֫;

    invoke-static {p1, p2}, Ll/᩺֫ۧ;->֫(Ll/᩺֫ۧ;Ll/۠ᩴ֫;)[Ll/֨᩷ۧ;

    move-result-object p1

    return-object p1
.end method
