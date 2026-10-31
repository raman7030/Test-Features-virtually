.class public final Ll/ۛ᩶᩻;
.super Ll/۬ۗܿ;
.source "JAK2"


# instance fields
.field public final synthetic ֫֫:Z

.field public final synthetic ۟:Ll/֫ۙ᩻;

.field public final synthetic ۧ֫:Landroid/widget/CheckBox;

.field public final synthetic ܽ֫:Ll/ܳۙ᩻;

.field public final synthetic ᩳ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֫ۙ᩻;Lbin/mt/plus/Main;ZLandroid/widget/CheckBox;Landroid/view/ViewGroup;Ljava/lang/String;Ll/ܳۙ᩻;)V
    .locals 0

    .line 86
    iput-object p1, p0, Ll/ۛ᩶᩻;->۟:Ll/֫ۙ᩻;

    iput-boolean p3, p0, Ll/ۛ᩶᩻;->֫֫:Z

    iput-object p4, p0, Ll/ۛ᩶᩻;->ۧ֫:Landroid/widget/CheckBox;

    iput-object p6, p0, Ll/ۛ᩶᩻;->ᩳ֫:Ljava/lang/String;

    iput-object p7, p0, Ll/ۛ᩶᩻;->ܽ֫:Ll/ܳۙ᩻;

    const p7, 0x7f12020f

    invoke-direct {p0, p2, p7}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    if-eqz p3, :cond_1

    .line 89
    invoke-static {p1}, Ll/֫ۙ᩻;->֫(Ll/֫ۙ᩻;)Z

    move-result p2

    if-nez p2, :cond_0

    const/16 p2, 0x8

    .line 90
    invoke-virtual {p4, p2}, Landroid/view/View;->setVisibility(I)V

    .line 92
    :cond_0
    invoke-static {p1}, Ll/֫ۙ᩻;->ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;

    move-result-object p2

    .line 393
    invoke-virtual {p2}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p2

    const p4, 0x7f0d01d0

    .line 394
    invoke-virtual {p2, p4}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/CheckBox;

    .line 395
    invoke-virtual {p5, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 396
    invoke-static {p2, p4, p6}, Ll/ۤۗܳ;->֫(Ll/ۗܺ᩷;Landroid/widget/CompoundButton;Ljava/lang/String;)V

    .line 94
    :cond_1
    invoke-static {p1}, Ll/֫ۙ᩻;->֫(Ll/֫ۙ᩻;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    return-void

    .line 95
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p1

    const/4 p2, 0x0

    .line 96
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 97
    invoke-virtual {p1, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 11

    .line 103
    iget-object v0, p0, Ll/ۛ᩶᩻;->۟:Ll/֫ۙ᩻;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 104
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 105
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 108
    :cond_0
    invoke-static {v1}, Ll/ܿۤۡ;->ۧ(Ljava/lang/String;)J

    move-result-wide v6

    const-wide/16 v1, 0x0

    cmp-long v3, v6, v1

    if-gez v3, :cond_1

    const v0, 0x7f12022a

    .line 110
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 114
    :cond_1
    :try_start_0
    invoke-static {v0}, Ll/֫ۙ᩻;->ۧ(Ll/֫ۙ᩻;)Ll/ܶ᩵ܿ;

    move-result-object v1

    sget-object v2, Ll/ܽ֨ۢ;->۬:Ll/ܽ֨ۢ;

    invoke-static {v1, v2}, Ll/ᩳ֨ۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    invoke-static {v0}, Ll/֫ۙ᩻;->֫(Ll/֫ۙ᩻;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۛ᩶᩻;->ۧ֫:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    const/4 v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const/4 v8, 0x0

    .line 120
    :goto_0
    invoke-static {v0}, Ll/֫ۙ᩻;->ᩳ(Ll/֫ۙ᩻;)Z

    move-result v1

    if-nez v1, :cond_3

    if-nez v8, :cond_3

    invoke-static {v0}, Ll/֫ۙ᩻;->ܽ(Ll/֫ۙ᩻;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩶᩻;

    invoke-virtual {v1}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v1

    cmp-long v3, v6, v1

    if-eqz v3, :cond_5

    .line 121
    :cond_3
    iget-boolean v1, p0, Ll/ۛ᩶᩻;->֫֫:Z

    iget-object v5, p0, Ll/ۛ᩶᩻;->ܽ֫:Ll/ܳۙ᩻;

    if-eqz v1, :cond_4

    .line 122
    invoke-static {v0}, Ll/֫ۙ᩻;->ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    new-instance v1, Ll/ۤ᩶᩻;

    move-object v3, v1

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Ll/ۤ᩶᩻;-><init>(Ll/ۛ᩶᩻;Ll/ܳۙ᩻;JZ)V

    iget-object v2, p0, Ll/ۛ᩶᩻;->ᩳ֫:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Ll/ۤۗܳ;->֫(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v5

    move-wide v2, v6

    move v4, v8

    move-object v5, v9

    move v6, v10

    .line 125
    invoke-static/range {v0 .. v6}, Ll/֫ۙ᩻;->֫(Ll/֫ۙ᩻;Ll/ܳۙ᩻;JZLl/ۨۧᩳ;Z)V

    .line 129
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :catch_0
    move-exception v1

    .line 116
    invoke-static {v0}, Ll/֫ۙ᩻;->ܿ(Ll/֫ۙ᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v0, v1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method
