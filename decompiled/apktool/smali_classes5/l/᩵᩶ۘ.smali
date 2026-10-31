.class public final Ll/᩵᩶ۘ;
.super Ll/ܺ᩶ۘ;
.source "M903"


# instance fields
.field public final ֫:Landroid/widget/TextView$BufferType;

.field public final ۧ:Z

.field public final ܽ:Ll/֫֨֡;

.field public final ܿ:Ll/۬᩶ۘ;

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/widget/TextView$BufferType;Ll/֫֨֡;Ll/۬᩶ۘ;Ljava/util/List;Z)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/᩵᩶ۘ;->֫:Landroid/widget/TextView$BufferType;

    .line 47
    iput-object p2, p0, Ll/᩵᩶ۘ;->ܽ:Ll/֫֨֡;

    .line 48
    iput-object p3, p0, Ll/᩵᩶ۘ;->ܿ:Ll/۬᩶ۘ;

    .line 50
    iput-object p4, p0, Ll/᩵᩶ۘ;->ᩳ:Ljava/util/List;

    .line 51
    iput-boolean p5, p0, Ll/᩵᩶ۘ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/widget/TextView;Ll/֡ۚ֡;)Landroid/text/Spanned;
    .locals 3

    .line 70
    iget-object v0, p0, Ll/᩵᩶ۘ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ᩶ۘ;

    .line 71
    invoke-interface {v2, p1}, Ll/ۚ᩶ۘ;->ۧ(Landroid/widget/TextView;)V

    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p0, Ll/᩵᩶ۘ;->ܿ:Ll/۬᩶ۘ;

    iget-object v1, p1, Ll/۬᩶ۘ;->֫:Ll/᩶᩶ۘ;

    iget-object p1, p1, Ll/۬᩶ۘ;->ۧ:Ll/ᩴ᩶ۘ;

    new-instance v2, Ll/۟᩶ۘ;

    invoke-direct {v2}, Ll/۟᩶ۘ;-><init>()V

    check-cast v1, Ll/ۤ᩶ۘ;

    invoke-virtual {v1, p1, v2}, Ll/ۤ᩶ۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ll/ۗ᩶ۘ;

    move-result-object p1

    .line 77
    invoke-virtual {p2, p1}, Ll/֡ۚ֡;->֫(Ll/ۤۚ֡;)V

    .line 79
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ᩶ۘ;

    .line 80
    invoke-interface {v0, p1}, Ll/ۚ᩶ۘ;->֫(Ll/ۗ᩶ۘ;)V

    goto :goto_1

    .line 84
    :cond_1
    check-cast p1, Ll/ۛ᩶ۘ;

    invoke-virtual {p1}, Ll/ۛ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳۙۘ;->ۧ()Landroid/text/SpannableStringBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)Ll/֡ۚ֡;
    .locals 2

    .line 59
    iget-object v0, p0, Ll/᩵᩶ۘ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩶ۘ;

    .line 60
    invoke-interface {v1, p1}, Ll/ۚ᩶ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 63
    :cond_0
    iget-object v0, p0, Ll/᩵᩶ۘ;->ܽ:Ll/֫֨֡;

    invoke-virtual {v0, p1}, Ll/֫֨֡;->֫(Ljava/lang/String;)Ll/֡ۚ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V
    .locals 3

    .line 119
    iget-object v0, p0, Ll/᩵᩶ۘ;->ᩳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۚ᩶ۘ;

    .line 120
    invoke-interface {v2, p1, p2}, Ll/ۚ᩶ۘ;->֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V

    goto :goto_0

    .line 137
    :cond_0
    iget-object v1, p0, Ll/᩵᩶ۘ;->֫:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 139
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚ᩶ۘ;

    .line 140
    invoke-interface {v0, p1}, Ll/ۚ᩶ۘ;->֫(Landroid/widget/TextView;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 2

    .line 97
    invoke-virtual {p0, p2}, Ll/᩵᩶ۘ;->֫(Ljava/lang/String;)Ll/֡ۚ֡;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/᩵᩶ۘ;->֫(Landroid/widget/TextView;Ll/֡ۚ֡;)Landroid/text/Spanned;

    move-result-object v0

    .line 101
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/᩵᩶ۘ;->ۧ:Z

    if-eqz v1, :cond_0

    .line 103
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 105
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 113
    :cond_0
    check-cast v0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0, p1, v0}, Ll/᩵᩶ۘ;->֫(Landroid/widget/TextView;Landroid/text/SpannableStringBuilder;)V

    return-void
.end method
