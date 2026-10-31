.class public final Ll/ܰ᩹֫;
.super Ljava/lang/Object;
.source "E8KH"

# interfaces
.implements Ll/᩺ۙ֫;


# instance fields
.field public final ۗ:Ll/ۡ۬֫;

.field public ۙ:Ll/֫۬֫;

.field public ۬:Z

.field public ᩶:Ll/᩺ۙ֫;

.field public ᩸:Z

.field public final ᩹:Ll/᩺᩹֫;


# direct methods
.method public constructor <init>(Ll/᩺᩹֫;Ll/ܽۚ֫;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Ll/ܰ᩹֫;->᩹:Ll/᩺᩹֫;

    .line 61
    new-instance p1, Ll/ۡ۬֫;

    invoke-direct {p1, p2}, Ll/ۡ۬֫;-><init>(Ll/ܽۚ֫;)V

    iput-object p1, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    const/4 p1, 0x1

    .line 62
    iput-boolean p1, p0, Ll/ܰ᩹֫;->᩸:Z

    return-void
.end method


# virtual methods
.method public final ֫(Z)J
    .locals 6

    .line 202
    iget-object v0, p0, Ll/ܰ᩹֫;->ۙ:Ll/֫۬֫;

    iget-object v1, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    if-eqz v0, :cond_4

    .line 203
    invoke-interface {v0}, Ll/֫۬֫;->ۧ()Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p1, :cond_0

    iget-object v0, p0, Ll/ܰ᩹֫;->ۙ:Ll/֫۬֫;

    .line 204
    invoke-interface {v0}, Ll/֫۬֫;->getState()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    :cond_0
    iget-object v0, p0, Ll/ܰ᩹֫;->ۙ:Ll/֫۬֫;

    .line 205
    invoke-interface {v0}, Ll/֫۬֫;->ܿ()Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_4

    iget-object p1, p0, Ll/ܰ᩹֫;->ۙ:Ll/֫۬֫;

    .line 206
    invoke-interface {p1}, Ll/֫۬֫;->᩻()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 174
    :cond_1
    iget-object p1, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    invoke-interface {p1}, Ll/᩺ۙ֫;->ᩴ()J

    move-result-wide v2

    .line 176
    iget-boolean v0, p0, Ll/ܰ᩹֫;->᩸:Z

    if-eqz v0, :cond_3

    .line 178
    invoke-virtual {v1}, Ll/ۡ۬֫;->ᩴ()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    .line 179
    invoke-virtual {v1}, Ll/ۡ۬֫;->ۧ()V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 182
    iput-boolean v0, p0, Ll/ܰ᩹֫;->᩸:Z

    .line 183
    iget-boolean v0, p0, Ll/ܰ᩹֫;->۬:Z

    if-eqz v0, :cond_3

    .line 184
    invoke-virtual {v1}, Ll/ۡ۬֫;->֫()V

    .line 188
    :cond_3
    invoke-virtual {v1, v2, v3}, Ll/ۡ۬֫;->֫(J)V

    .line 189
    invoke-interface {p1}, Ll/᩺ۙ֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object p1

    .line 190
    invoke-virtual {v1}, Ll/ۡ۬֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۖ᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 191
    invoke-virtual {v1, p1}, Ll/ۡ۬֫;->֫(Ll/ۖ᩵֫;)V

    .line 192
    iget-object v0, p0, Ll/ܰ᩹֫;->᩹:Ll/᩺᩹֫;

    check-cast v0, Ll/᩶ۙ֫;

    invoke-virtual {v0, p1}, Ll/᩶ۙ֫;->֫(Ll/ۖ᩵֫;)V

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    .line 166
    iput-boolean p1, p0, Ll/ܰ᩹֫;->᩸:Z

    .line 167
    iget-boolean p1, p0, Ll/ܰ᩹֫;->۬:Z

    if-eqz p1, :cond_5

    .line 168
    invoke-virtual {v1}, Ll/ۡ۬֫;->֫()V

    .line 129
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ll/ܰ᩹֫;->ᩴ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 67
    iput-boolean v0, p0, Ll/ܰ᩹֫;->۬:Z

    .line 68
    iget-object v0, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {v0}, Ll/ۡ۬֫;->֫()V

    return-void
.end method

.method public final ֫(J)V
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {v0, p1, p2}, Ll/ۡ۬֫;->֫(J)V

    return-void
.end method

.method public final ֫(Ll/֫۬֫;)V
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ܰ᩹֫;->ۙ:Ll/֫۬֫;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 116
    iput-object p1, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    .line 117
    iput-object p1, p0, Ll/ܰ᩹֫;->ۙ:Ll/֫۬֫;

    const/4 p1, 0x1

    .line 118
    iput-boolean p1, p0, Ll/ܰ᩹֫;->᩸:Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۖ᩵֫;)V
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    if-eqz v0, :cond_0

    .line 151
    invoke-interface {v0, p1}, Ll/᩺ۙ֫;->֫(Ll/ۖ᩵֫;)V

    .line 152
    iget-object p1, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    invoke-interface {p1}, Ll/᩺ۙ֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object p1

    .line 154
    :cond_0
    iget-object v0, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {v0, p1}, Ll/ۡ۬֫;->֫(Ll/ۖ᩵֫;)V

    return-void
.end method

.method public final ۢ()Z
    .locals 1

    .line 143
    iget-boolean v0, p0, Ll/ܰ᩹֫;->᩸:Z

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0

    .line 145
    :cond_0
    iget-object v0, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    invoke-interface {v0}, Ll/᩺ۙ֫;->ۢ()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 73
    iput-boolean v0, p0, Ll/ܰ᩹֫;->۬:Z

    .line 74
    iget-object v0, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {v0}, Ll/ۡ۬֫;->ۧ()V

    return-void
.end method

.method public final ۧ(Ll/֫۬֫;)V
    .locals 2

    .line 95
    invoke-interface {p1}, Ll/֫۬֫;->ۚ()Ll/᩺ۙ֫;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 96
    iget-object v1, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    .line 102
    iput-object v0, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    .line 103
    iput-object p1, p0, Ll/ܰ᩹֫;->ۙ:Ll/֫۬֫;

    .line 104
    iget-object p1, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {p1}, Ll/ۡ۬֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/᩺ۙ֫;->֫(Ll/ۖ᩵֫;)V

    return-void

    .line 98
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Multiple renderer media clocks enabled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x3e8

    invoke-static {p1, v0}, Ll/ᩳ᩶֫;->֫(Ljava/lang/RuntimeException;I)Ll/ᩳ᩶֫;

    move-result-object p1

    throw p1

    :cond_1
    return-void
.end method

.method public final ܽ()Ll/ۖ᩵֫;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    if-eqz v0, :cond_0

    .line 160
    invoke-interface {v0}, Ll/᩺ۙ֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object v0

    return-object v0

    .line 161
    :cond_0
    iget-object v0, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {v0}, Ll/ۡ۬֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()J
    .locals 2

    .line 136
    iget-boolean v0, p0, Ll/ܰ᩹֫;->᩸:Z

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Ll/ܰ᩹֫;->ۗ:Ll/ۡ۬֫;

    invoke-virtual {v0}, Ll/ۡ۬֫;->ᩴ()J

    move-result-wide v0

    return-wide v0

    .line 138
    :cond_0
    iget-object v0, p0, Ll/ܰ᩹֫;->᩶:Ll/᩺ۙ֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    invoke-interface {v0}, Ll/᩺ۙ֫;->ᩴ()J

    move-result-wide v0

    return-wide v0
.end method
