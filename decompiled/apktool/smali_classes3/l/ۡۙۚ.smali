.class public abstract Ll/ۡۙۚ;
.super Ljava/lang/Object;
.source "L62N"


# instance fields
.field public ֫:I

.field public ۧ:Ljava/util/List;

.field public ܳ:Ljava/util/List;

.field public ܽ:Ll/ۡۙۚ;

.field public ܿ:Ll/ۡۙۚ;

.field public ᩳ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput p1, p0, Ll/ۡۙۚ;->ᩳ:I

    const/4 p1, -0x1

    .line 131
    iput p1, p0, Ll/ۡۙۚ;->֫:I

    return-void
.end method


# virtual methods
.method public abstract ֫(Ll/ܶ᩶ۚ;)V
.end method

.method public final ۧ(Ll/ܶ᩶ۚ;)V
    .locals 8

    .line 184
    iget-object v0, p0, Ll/ۡۙۚ;->ܳ:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 185
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 186
    iget-object v3, p0, Ll/ۡۙۚ;->ܳ:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۗۚ;

    .line 187
    iget v4, v3, Ll/ۧۗۚ;->ܳ:I

    iget-object v5, v3, Ll/ۧۗۚ;->ܿ:Ll/᩺᩶ۚ;

    iget-object v6, v3, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    const/4 v7, 0x1

    .line 188
    invoke-virtual {p1, v4, v5, v6, v7}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v4

    .line 187
    invoke-virtual {v3, v4}, Ll/ܺۙۚ;->֫(Ll/ܰ᩹ۚ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 192
    :cond_0
    iget-object v0, p0, Ll/ۡۙۚ;->ۧ:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 193
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_1

    .line 194
    iget-object v3, p0, Ll/ۡۙۚ;->ۧ:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۗۚ;

    .line 195
    iget v4, v3, Ll/ۧۗۚ;->ܳ:I

    iget-object v5, v3, Ll/ۧۗۚ;->ܿ:Ll/᩺᩶ۚ;

    iget-object v6, v3, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    .line 196
    invoke-virtual {p1, v4, v5, v6, v1}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object v4

    .line 195
    invoke-virtual {v3, v4}, Ll/ܺۙۚ;->֫(Ll/ܰ᩹ۚ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
