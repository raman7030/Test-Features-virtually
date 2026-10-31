.class public final Ll/᩵ᩴܿ;
.super Ll/ۗᩴܿ;
.source "N15M"


# instance fields
.field public final synthetic ֡:Landroid/widget/TextView;

.field public final synthetic ֨:Ll/᩻᩶᩵;

.field public final synthetic ۖ:Ll/֡ۚۢ;

.field public final synthetic ۘ:Ll/ᩴᩴܿ;

.field public final synthetic ۚ:Landroid/widget/TextView;

.field public final synthetic ۠:Landroid/widget/TextView;

.field public final synthetic ܶ:Ll/᩻᩶᩵;

.field public final synthetic ᩴ:Landroid/widget/TextView;

.field public final synthetic ᩵:Landroid/widget/ProgressBar;

.field public final synthetic ᩸:Ll/֡ᩴܿ;


# direct methods
.method public constructor <init>(Landroid/widget/Spinner;Ll/ᩴᩴܿ;Landroid/widget/Spinner;Ll/᩶ۡۡ;Landroid/widget/Spinner;Ll/᩶ۡۡ;Landroid/view/View;Landroid/widget/TextView;Ll/᩻᩶᩵;Ll/֡ᩴܿ;Ll/᩻᩶᩵;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Ll/֡ۚۢ;)V
    .locals 3

    move-object v0, p0

    move-object v1, p2

    .line 2
    iput-object v1, v0, Ll/᩵ᩴܿ;->ۘ:Ll/ᩴᩴܿ;

    move-object v2, p8

    .line 4
    iput-object v2, v0, Ll/᩵ᩴܿ;->۠:Landroid/widget/TextView;

    move-object v2, p9

    .line 6
    iput-object v2, v0, Ll/᩵ᩴܿ;->ܶ:Ll/᩻᩶᩵;

    move-object v2, p10

    .line 8
    iput-object v2, v0, Ll/᩵ᩴܿ;->᩸:Ll/֡ᩴܿ;

    move-object v2, p11

    .line 10
    iput-object v2, v0, Ll/᩵ᩴܿ;->֨:Ll/᩻᩶᩵;

    move-object v2, p12

    .line 12
    iput-object v2, v0, Ll/᩵ᩴܿ;->֡:Landroid/widget/TextView;

    move-object/from16 v2, p13

    .line 14
    iput-object v2, v0, Ll/᩵ᩴܿ;->ۚ:Landroid/widget/TextView;

    move-object/from16 v2, p14

    .line 16
    iput-object v2, v0, Ll/᩵ᩴܿ;->ᩴ:Landroid/widget/TextView;

    move-object/from16 v2, p15

    .line 18
    iput-object v2, v0, Ll/᩵ᩴܿ;->᩵:Landroid/widget/ProgressBar;

    move-object/from16 v2, p16

    .line 22
    iput-object v2, v0, Ll/᩵ᩴܿ;->ۖ:Ll/֡ۚۢ;

    .line 104
    invoke-direct/range {p0 .. p7}, Ll/ۗᩴܿ;-><init>(Landroid/widget/Spinner;Ll/ᩴᩴܿ;Landroid/widget/Spinner;Ll/᩶ۡۡ;Landroid/widget/Spinner;Ll/᩶ۡۡ;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 4

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p0, Ll/᩵ᩴܿ;->ۘ:Ll/ᩴᩴܿ;

    invoke-virtual {v0, p1}, Ll/֫᩷ۡ;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۠ᩴܿ;

    .line 116
    :goto_0
    iget-object v0, p0, Ll/᩵ᩴܿ;->۠:Landroid/widget/TextView;

    if-nez p1, :cond_1

    const-string p1, "-- NULL --"

    .line 117
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 119
    :cond_1
    new-instance v1, Landroid/text/SpannableString;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 120
    new-instance p1, Landroid/text/style/UnderlineSpan;

    invoke-direct {p1}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 121
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v3, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 122
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ll/۬ᩴܿ;)V
    .locals 13

    const-string v0, "context"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-interface {p1}, Ll/۬ᩴܿ;->getId()Ljava/lang/String;

    move-result-object v0

    .line 128
    iget-object v1, p0, Ll/᩵ᩴܿ;->ܶ:Ll/᩻᩶᩵;

    iget-object v2, v1, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    invoke-static {v2, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 129
    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    iput-object v0, v1, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    .line 130
    new-instance v0, Ll/ܺᩴܿ;

    .line 132
    iget-object v1, p0, Ll/᩵ᩴܿ;->᩸:Ll/֡ᩴܿ;

    invoke-static {v1}, Ll/֡ᩴܿ;->ᩳ(Ll/֡ᩴܿ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v5

    .line 133
    iget-object v2, p0, Ll/᩵ᩴܿ;->֨:Ll/᩻᩶᩵;

    iget-object v2, v2, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    move-object v6, v2

    check-cast v6, Ljava/lang/String;

    .line 134
    invoke-static {v1}, Ll/֡ᩴܿ;->֫(Ll/֡ᩴܿ;)Ll/ۗܺ᩷;

    move-result-object v7

    .line 135
    iget-object v8, p0, Ll/᩵ᩴܿ;->֡:Landroid/widget/TextView;

    invoke-static {v8}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 136
    iget-object v9, p0, Ll/᩵ᩴܿ;->ۚ:Landroid/widget/TextView;

    invoke-static {v9}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 137
    iget-object v10, p0, Ll/᩵ᩴܿ;->ᩴ:Landroid/widget/TextView;

    invoke-static {v10}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 138
    iget-object v11, p0, Ll/᩵ᩴܿ;->᩵:Landroid/widget/ProgressBar;

    invoke-static {v11}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 139
    iget-object v1, p0, Ll/᩵ᩴܿ;->ۖ:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->ܽ()Landroid/widget/Button;

    move-result-object v12

    const-string v1, "getNegativeButton(...)"

    invoke-static {v12, v1}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    move-object v4, p1

    .line 130
    invoke-direct/range {v3 .. v12}, Ll/ܺᩴܿ;-><init>(Ll/۬ᩴܿ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/String;Ll/ۗܺ᩷;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/Button;)V

    .line 140
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    :cond_0
    return-void
.end method
