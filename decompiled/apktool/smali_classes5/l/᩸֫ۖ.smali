.class public final Ll/᩸֫ۖ;
.super Ljava/lang/Object;
.source "97QO"

# interfaces
.implements Ll/ܶ۟ܺ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:Z

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/᩶ۘ۠;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;IIZLl/᩶ۘ۠;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput p1, p0, Ll/᩸֫ۖ;->ۧ:I

    .line 105
    iput-object p2, p0, Ll/᩸֫ۖ;->ܿ:Ljava/lang/String;

    .line 106
    iput-object p3, p0, Ll/᩸֫ۖ;->᩻:Ljava/lang/String;

    .line 107
    iput p4, p0, Ll/᩸֫ۖ;->ܳ:I

    .line 108
    iput p5, p0, Ll/᩸֫ۖ;->֫:I

    .line 109
    iput-boolean p6, p0, Ll/᩸֫ۖ;->ܽ:Z

    .line 110
    iput-object p7, p0, Ll/᩸֫ۖ;->ᩳ:Ll/᩶ۘ۠;

    return-void
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 115
    iget v0, p0, Ll/᩸֫ۖ;->ۧ:I

    return v0
.end method

.method public final getPosition()I
    .locals 1

    .line 135
    iget v0, p0, Ll/᩸֫ۖ;->ܳ:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/᩸֫ۖ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final length()I
    .locals 1

    .line 130
    iget-object v0, p0, Ll/᩸֫ۖ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 176
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "index"

    iget v2, p0, Ll/᩸֫ۖ;->ۧ:I

    .line 177
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "text"

    iget-object v2, p0, Ll/᩸֫ۖ;->᩻:Ljava/lang/String;

    .line 178
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "position"

    iget v2, p0, Ll/᩸֫ۖ;->ܳ:I

    .line 179
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "columnI"

    iget v2, p0, Ll/᩸֫ۖ;->֫:I

    .line 180
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;I)V

    const-string v1, "isToken"

    iget-boolean v2, p0, Ll/᩸֫ۖ;->ܽ:Z

    .line 181
    invoke-virtual {v0, v1, v2}, Ll/ۡܶܺ;->֫(Ljava/lang/String;Z)V

    .line 182
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 2

    .line 154
    iget-object v0, p0, Ll/᩸֫ۖ;->᩻:Ljava/lang/String;

    const-string v1, "//"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 144
    iget-boolean v0, p0, Ll/᩸֫ۖ;->ܽ:Z

    return v0
.end method

.method public final ۧ()Z
    .locals 3

    const-string v0, "/**"

    .line 166
    iget-object v1, p0, Ll/᩸֫ۖ;->᩻:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x2a

    if-eq v0, v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 149
    iget-object v0, p0, Ll/᩸֫ۖ;->᩻:Ljava/lang/String;

    invoke-static {v0}, Ll/۬۟ܺ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 159
    iget-object v0, p0, Ll/᩸֫ۖ;->᩻:Ljava/lang/String;

    const-string v1, "/*"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 171
    invoke-virtual {p0}, Ll/᩸֫ۖ;->֫()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/᩸֫ۖ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/᩸֫ۖ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ll/᩶ۘ۠;
    .locals 1

    .line 186
    iget-object v0, p0, Ll/᩸֫ۖ;->ᩳ:Ll/᩶ۘ۠;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 140
    iget v0, p0, Ll/᩸֫ۖ;->֫:I

    return v0
.end method
