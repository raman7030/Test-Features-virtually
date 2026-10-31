.class public final Ll/᩶ᩴܿ;
.super Ljava/lang/Object;
.source "014Z"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩶:Landroid/view/View;

.field public final synthetic ᩸:Ll/ۗᩴܿ;

.field public final synthetic ᩹:Ll/᩶ۡۡ;


# direct methods
.method public constructor <init>(Ll/ۗᩴܿ;Ll/᩶ۡۡ;Landroid/view/View;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ᩴܿ;->᩸:Ll/ۗᩴܿ;

    iput-object p2, p0, Ll/᩶ᩴܿ;->᩹:Ll/᩶ۡۡ;

    iput-object p3, p0, Ll/᩶ᩴܿ;->᩶:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    .line 106
    iget-object p1, p0, Ll/᩶ᩴܿ;->᩸:Ll/ۗᩴܿ;

    invoke-static {p1}, Ll/ۗᩴܿ;->ۧ(Ll/ۗᩴܿ;)Ll/۠ᩴܿ;

    move-result-object p2

    const/4 p4, 0x0

    if-eqz p2, :cond_1

    invoke-static {p1}, Ll/ۗᩴܿ;->ۧ(Ll/ۗᩴܿ;)Ll/۠ᩴܿ;

    move-result-object p2

    invoke-interface {p2}, Ll/۠ᩴܿ;->ᩳ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    .line 107
    invoke-static {p1}, Ll/ۗᩴܿ;->ۧ(Ll/ۗᩴܿ;)Ll/۠ᩴܿ;

    move-result-object p2

    instance-of p2, p2, Ll/ܰۘܿ;

    .line 108
    invoke-static {p2}, Ll/ۗᩴܿ;->֫(Z)Ll/ۧᩴܿ;

    move-result-object p5

    .line 109
    iget-object v0, p0, Ll/᩶ᩴܿ;->᩹:Ll/᩶ۡۡ;

    invoke-virtual {v0, p3}, Ll/֫᩷ۡ;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p5, v0}, Ll/ۧᩴܿ;->֫(Ljava/lang/String;)V

    if-nez p2, :cond_0

    .line 110
    invoke-static {p1}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p5}, Ll/ۧᩴܿ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-static {p1, p4}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Z)V

    .line 111
    invoke-static {p1}, Ll/ۗᩴܿ;->ۧ(Ll/ۗᩴܿ;)Ll/۠ᩴܿ;

    move-result-object p2

    invoke-interface {p2}, Ll/۠ᩴܿ;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 112
    invoke-static {p1, p3, p5}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;ILl/ۧᩴܿ;)V

    goto :goto_0

    .line 115
    :cond_1
    invoke-static {p1, p4}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Z)V

    .line 118
    :cond_2
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p1}, Ll/ۗᩴܿ;->ܽ(Ll/ۗᩴܿ;)J

    move-result-wide p4

    sub-long/2addr p2, p4

    const-wide/16 p4, 0x12c

    cmp-long v0, p2, p4

    if-lez v0, :cond_3

    .line 119
    invoke-virtual {p1}, Ll/ۗᩴܿ;->ܽ()Ll/۬ᩴܿ;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 121
    invoke-virtual {p1, p2}, Ll/ۗᩴܿ;->֫(Ll/۬ᩴܿ;)V

    .line 124
    :cond_3
    iget-object p2, p0, Ll/᩶ᩴܿ;->᩶:Landroid/view/View;

    invoke-static {p1, p2}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Landroid/view/View;)V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 1

    const/4 p1, 0x0

    .line 130
    iget-object v0, p0, Ll/᩶ᩴܿ;->᩸:Ll/ۗᩴܿ;

    invoke-static {v0, p1}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Z)V

    .line 131
    iget-object p1, p0, Ll/᩶ᩴܿ;->᩶:Landroid/view/View;

    invoke-static {v0, p1}, Ll/ۗᩴܿ;->֫(Ll/ۗᩴܿ;Landroid/view/View;)V

    return-void
.end method
