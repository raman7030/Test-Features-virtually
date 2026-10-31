.class public final synthetic Ll/֨۠ܳ;
.super Ljava/lang/Object;
.source "P4TK"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ܽۢܳ;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/᩹۠ܳ;

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(Ll/᩹۠ܳ;ZZLl/ܽۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨۠ܳ;->᩸:Ll/᩹۠ܳ;

    iput-boolean p2, p0, Ll/֨۠ܳ;->᩹:Z

    iput-boolean p3, p0, Ll/֨۠ܳ;->᩶:Z

    iput-object p4, p0, Ll/֨۠ܳ;->ۙ:Ll/ܽۢܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 68
    iget-object v0, p0, Ll/֨۠ܳ;->᩸:Ll/᩹۠ܳ;

    iget-object v1, v0, Ll/᩹۠ܳ;->᩶:Ll/ۗ᩻᩻;

    iget-object v2, v0, Ll/᩹۠ܳ;->᩹:Ljava/lang/String;

    iget-object v3, v0, Ll/᩹۠ܳ;->۬:Landroid/widget/CheckBox;

    iget-object v4, v0, Ll/᩹۠ܳ;->ۙ:[Landroid/widget/RadioButton;

    iget-object v5, v0, Ll/᩹۠ܳ;->ۗ:Landroid/widget/CheckBox;

    .line 69
    iget-boolean v6, p0, Ll/֨۠ܳ;->᩹:Z

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    .line 70
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    .line 71
    iget-object v0, v0, Ll/᩹۠ܳ;->᩸:Ljava/lang/String;

    invoke-static {v0}, Ll/۟۬ܳ;->ۧ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    const/4 v6, 0x1

    if-eqz v0, :cond_0

    .line 73
    invoke-virtual {v5, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 74
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ll/۟۬ܳ;->֫(I)I

    move-result v1

    aget-object v1, v4, v1

    invoke-virtual {v1}, Landroid/view/View;->callOnClick()Z

    .line 75
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    .line 77
    :cond_0
    iget-boolean v0, p0, Ll/֨۠ܳ;->᩶:Z

    if-eqz v0, :cond_1

    sget-object v0, Ll/᩶ۖ᩷;->ܺ:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 78
    invoke-virtual {v5, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 79
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 80
    invoke-static {v0}, Ll/۟۬ܳ;->֫(I)I

    move-result v1

    aget-object v1, v4, v1

    invoke-virtual {v1}, Landroid/view/View;->callOnClick()Z

    .line 81
    invoke-static {v0}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    :cond_1
    if-eqz v1, :cond_2

    .line 83
    iget-object v0, v1, Ll/ۗ᩻᩻;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 84
    invoke-virtual {v5, v6}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 85
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 86
    invoke-static {v0}, Ll/۟۬ܳ;->֫(I)I

    move-result v1

    aget-object v1, v4, v1

    invoke-virtual {v1}, Landroid/view/View;->callOnClick()Z

    .line 87
    invoke-static {v0}, Ll/۟۬ܳ;->ۧ(I)Z

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    .line 90
    :cond_2
    invoke-virtual {v5, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_0

    :cond_3
    const/16 v0, 0x8

    .line 93
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 94
    invoke-virtual {v5, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 97
    :goto_0
    iget-object v0, p0, Ll/֨۠ܳ;->ۙ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->᩺()Z

    move-result v1

    if-eqz v1, :cond_4

    sget v1, Ll/᩶ۖ᩷;->ܽ:I

    goto :goto_1

    :cond_4
    sget v1, Ll/᩶ۖ᩷;->ᩳ:I

    :goto_1
    aget-object v1, v4, v1

    invoke-virtual {v1}, Landroid/view/View;->callOnClick()Z

    .line 98
    invoke-virtual {v0}, Ll/ܽۢܳ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-boolean v0, Ll/᩶ۖ᩷;->ܿ:Z

    goto :goto_2

    :cond_5
    sget-boolean v0, Ll/᩶ۖ᩷;->ܳ:Z

    :goto_2
    invoke-virtual {v3, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method
