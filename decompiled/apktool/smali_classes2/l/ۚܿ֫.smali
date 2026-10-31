.class public final Ll/ۚܿ֫;
.super Ljava/lang/Object;
.source "7AZT"

# interfaces
.implements Landroid/text/InputFilter;


# instance fields
.field public ᩸:Ll/ܽᩳ֫;

.field public final ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ۚܿ֫;->᩹:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
    .locals 3

    .line 56
    iget-object v0, p0, Ll/ۚܿ֫;->᩹:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 60
    :cond_0
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۜᩳ֫;->֫()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 p2, 0x3

    if-eq v1, p2, :cond_5

    goto :goto_1

    :cond_1
    if-nez p6, :cond_2

    if-nez p5, :cond_2

    .line 63
    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-nez p4, :cond_2

    .line 64
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p4

    if-ne p1, p4, :cond_2

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_4

    if-nez p2, :cond_3

    .line 72
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ne p3, p4, :cond_3

    goto :goto_0

    .line 75
    :cond_3
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    .line 77
    :goto_0
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    const/4 p4, 0x0

    .line 1057
    invoke-virtual {p2, p4, p3, p1}, Ll/ۜᩳ֫;->֫(IILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    :cond_4
    :goto_1
    return-object p1

    .line 83
    :cond_5
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object p2

    .line 93
    iget-object p3, p0, Ll/ۚܿ֫;->᩸:Ll/ܽᩳ֫;

    if-nez p3, :cond_6

    .line 94
    new-instance p3, Ll/֡ܿ֫;

    invoke-direct {p3, v0, p0}, Ll/֡ܿ֫;-><init>(Landroid/widget/TextView;Ll/ۚܿ֫;)V

    iput-object p3, p0, Ll/ۚܿ֫;->᩸:Ll/ܽᩳ֫;

    .line 96
    :cond_6
    iget-object p3, p0, Ll/ۚܿ֫;->᩸:Ll/ܽᩳ֫;

    .line 83
    invoke-virtual {p2, p3}, Ll/ۜᩳ֫;->֫(Ll/ܽᩳ֫;)V

    return-object p1
.end method
