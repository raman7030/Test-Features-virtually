.class public final Ll/᩶ܶۖ;
.super Ll/᩵᩹ۖ;
.source "S50A"


# instance fields
.field public ۧ:Ljava/lang/String;

.field public final synthetic ܳ:Ll/᩵ۛۡ;

.field public final synthetic ܽ:Ll/ܺܶۖ;

.field public final synthetic ܿ:Ll/ۘ᩸ۖ;

.field public final synthetic ᩳ:Ll/ۤܶۖ;


# direct methods
.method public constructor <init>(Ll/ۘ᩸ۖ;Ll/ۘ᩸ۖ;Ll/ۤܶۖ;Ll/ܺܶۖ;Ll/᩵ۛۡ;)V
    .locals 0

    .line 145
    iput-object p2, p0, Ll/᩶ܶۖ;->ܿ:Ll/ۘ᩸ۖ;

    iput-object p3, p0, Ll/᩶ܶۖ;->ᩳ:Ll/ۤܶۖ;

    iput-object p4, p0, Ll/᩶ܶۖ;->ܽ:Ll/ܺܶۖ;

    iput-object p5, p0, Ll/᩶ܶۖ;->ܳ:Ll/᩵ۛۡ;

    invoke-direct {p0, p1}, Ll/᩵᩹ۖ;-><init>(Ll/ۘ᩸ۖ;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/ܽ᩸ۖ;
    .locals 7

    .line 150
    iget-object v0, p0, Ll/᩶ܶۖ;->ܿ:Ll/ۘ᩸ۖ;

    iget-object v1, v0, Ll/ۘ᩸ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x3e8

    if-lt v2, v3, :cond_2

    iget-object v2, p0, Ll/᩶ܶۖ;->ۧ:Ljava/lang/String;

    const/16 v3, 0x2f

    .line 168
    invoke-virtual {p1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    .line 169
    invoke-virtual {p1, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-eq v4, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v4, :cond_2

    .line 174
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v5, v6, :cond_1

    .line 152
    :goto_1
    iget-object v2, p0, Ll/᩶ܶۖ;->ܽ:Ll/ܺܶۖ;

    iget-object v3, p0, Ll/᩶ܶۖ;->ܳ:Ll/᩵ۛۡ;

    iget-object v4, p0, Ll/᩶ܶۖ;->ᩳ:Ll/ۤܶۖ;

    invoke-virtual {v4, v0, v2, v3}, Ll/֨ܶۖ;->֫(Ll/ۘ᩸ۖ;Ll/ܺܶۖ;Ll/᩵ۛۡ;)V

    .line 153
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 155
    :cond_2
    :goto_2
    iput-object p1, p0, Ll/᩶ܶۖ;->ۧ:Ljava/lang/String;

    .line 156
    invoke-super {p0, p1, p2, p3, p4}, Ll/᩵᩹ۖ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/ܽ᩸ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 5

    .line 161
    iget-object v0, p0, Ll/᩶ܶۖ;->ܿ:Ll/ۘ᩸ۖ;

    iget-object v1, v0, Ll/ۘ᩸ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 162
    iget-object v2, p0, Ll/᩶ܶۖ;->ܽ:Ll/ܺܶۖ;

    iget-object v3, p0, Ll/᩶ܶۖ;->ܳ:Ll/᩵ۛۡ;

    iget-object v4, p0, Ll/᩶ܶۖ;->ᩳ:Ll/ۤܶۖ;

    invoke-virtual {v4, v0, v2, v3}, Ll/֨ܶۖ;->֫(Ll/ۘ᩸ۖ;Ll/ܺܶۖ;Ll/᩵ۛۡ;)V

    .line 163
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-void
.end method
