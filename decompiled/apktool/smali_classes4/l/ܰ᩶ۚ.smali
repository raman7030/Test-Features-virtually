.class public final Ll/ܰ᩶ۚ;
.super Ll/ܰ᩹ۚ;
.source "59BI"


# instance fields
.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:Ll/ܳۙۚ;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V
    .locals 0

    .line 106
    invoke-direct {p0, p1, p3}, Ll/ܰ᩹ۚ;-><init>(ILl/ܰ᩹ۚ;)V

    .line 107
    iput-object p2, p0, Ll/ܰ᩶ۚ;->ܽ:Ljava/lang/String;

    .line 108
    iput-object p4, p0, Ll/ܰ᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;
    .locals 5

    .line 205
    iget-object v0, p0, Ll/ܰ᩶ۚ;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܰ᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    :goto_0
    invoke-super {p0, p1}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    return-object v0

    .line 140
    :cond_1
    iget-object v2, p0, Ll/ܰ᩹ۚ;->ۧ:Ll/ܰ᩹ۚ;

    if-ne p1, v2, :cond_2

    return-object p0

    .line 169
    :cond_2
    new-instance v2, Ll/ܰ᩶ۚ;

    iget v3, p0, Ll/ܰ᩹ۚ;->֫:I

    invoke-direct {v2, v3, v0, p1, v1}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 156
    new-instance v4, Ll/ܰ᩶ۚ;

    invoke-direct {v4, v3, v0, p1, v1}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 170
    invoke-virtual {v2, v4}, Ll/ܰ᩶ۚ;->֫(Ll/ܰ᩶ۚ;)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܰ᩹ۚ;
    .locals 4

    .line 205
    iget-object v0, p0, Ll/ܰ᩶ۚ;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܰ᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ܳۙۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, p1, v0}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    return-object v0

    .line 128
    :cond_1
    iget-object v2, p0, Ll/ܰ᩹ۚ;->ۧ:Ll/ܰ᩹ۚ;

    if-ne p1, v2, :cond_2

    return-object p0

    .line 169
    :cond_2
    new-instance v2, Ll/ܰ᩶ۚ;

    iget v3, p0, Ll/ܰ᩹ۚ;->֫:I

    invoke-direct {v2, v3, p2, p1, v1}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 156
    new-instance p2, Ll/ܰ᩶ۚ;

    invoke-direct {p2, v3, v0, p1, v1}, Ll/ܰ᩶ۚ;-><init>(ILjava/lang/String;Ll/ܰ᩹ۚ;Ll/ܳۙۚ;)V

    .line 170
    invoke-virtual {v2, p2}, Ll/ܰ᩶ۚ;->֫(Ll/ܰ᩶ۚ;)Ll/ܰ᩹ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܰ᩶ۚ;)Ll/ܰ᩹ۚ;
    .locals 2

    .line 188
    iget v0, p1, Ll/ܰ᩹ۚ;->֫:I

    iget v1, p0, Ll/ܰ᩹ۚ;->֫:I

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Ll/ܰ᩹ۚ;->ۧ:Ll/ܰ᩹ۚ;

    iget-object v1, p0, Ll/ܰ᩹ۚ;->ۧ:Ll/ܰ᩹ۚ;

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Ll/ܰ᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    iget-object v1, p0, Ll/ܰ᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    if-ne v0, v1, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 205
    iget-object v0, p0, Ll/ܰ᩶ۚ;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܰ᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ll/ܳۙۚ;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-super {p0, p1, p2}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 205
    iget-object v0, p0, Ll/ܰ᩶ۚ;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܰ᩶ۚ;->ᩳ:Ll/ܳۙۚ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ܳۙۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-super {p0, p1, p2, p3}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
