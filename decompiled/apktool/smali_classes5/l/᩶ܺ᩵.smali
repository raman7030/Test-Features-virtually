.class public final Ll/᩶ܺ᩵;
.super Ll/ۛܺ᩵;
.source "9A0K"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:I


# virtual methods
.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 2

    const/4 v0, 0x4

    .line 132
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 133
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    .line 134
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v1

    iput v1, p0, Ll/᩶ܺ᩵;->ܽ:I

    .line 135
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v1

    if-eqz v0, :cond_0

    .line 138
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 139
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ᩳ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ܺ᩵;->֫:Ljava/lang/String;

    :cond_0
    if-eqz v1, :cond_1

    .line 143
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 144
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ᩳ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܺ᩵;->ۧ:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 1

    const/4 v0, 0x4

    .line 112
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 113
    iget-object v0, p0, Ll/᩶ܺ᩵;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 114
    iget v0, p0, Ll/᩶ܺ᩵;->ܽ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 115
    iget-object v0, p0, Ll/᩶ܺ᩵;->ۧ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Ll/᩶ܺ᩵;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 118
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 119
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/String;)V

    .line 122
    :cond_0
    iget-object v0, p0, Ll/᩶ܺ᩵;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 123
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 124
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
