.class public final Ll/ۗ᩶ۚ;
.super Ll/ۙ᩶ۚ;
.source "L9BO"


# instance fields
.field public ۜ:Ll/۟᩹ۚ;

.field public final ۡ:Ll/ۛ᩶ۚ;

.field public ۢ:I

.field public ܳ:Ll/۟᩹ۚ;

.field public final ܽ:I

.field public ܿ:Ll/۟᩹ۚ;

.field public ᩳ:Ll/ܽ᩶ۚ;

.field public final ᩷:I

.field public ᩻:Ll/۟᩹ۚ;


# direct methods
.method public constructor <init>(Ll/ۛ᩶ۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/high16 v0, 0x90000

    const/4 v1, 0x0

    .line 57
    invoke-direct {p0, v0, v1}, Ll/ۙ᩶ۚ;-><init>(ILl/ۙ᩶ۚ;)V

    .line 98
    iput-object p1, p0, Ll/ۗ᩶ۚ;->ۡ:Ll/ۛ᩶ۚ;

    .line 99
    invoke-virtual {p1, p2}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ۗ᩶ۚ;->᩷:I

    .line 100
    invoke-virtual {p1, p3}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Ll/ۗ᩶ۚ;->ܽ:I

    if-eqz p4, :cond_0

    .line 102
    invoke-virtual {p1, p4}, Ll/ۛ᩶ۚ;->ᩳ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۗ᩶ۚ;->ۢ:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(ILl/᩺᩶ۚ;Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/ۗ᩶ۚ;->ۡ:Ll/ۛ᩶ۚ;

    if-eqz p4, :cond_0

    .line 125
    iget-object p4, p0, Ll/ۗ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    .line 126
    invoke-static {v0, p1, p2, p3, p4}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;ILl/᩺᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    return-object p1

    .line 129
    :cond_0
    iget-object p4, p0, Ll/ۗ᩶ۚ;->ܳ:Ll/۟᩹ۚ;

    .line 130
    invoke-static {v0, p1, p2, p3, p4}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;ILl/᩺᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩶ۚ;->ܳ:Ll/۟᩹ۚ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Z)Ll/ܰ᩹ۚ;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۗ᩶ۚ;->ۡ:Ll/ۛ᩶ۚ;

    if-eqz p2, :cond_0

    .line 113
    iget-object p2, p0, Ll/ۗ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    .line 114
    invoke-static {v0, p1, p2}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    return-object p1

    .line 116
    :cond_0
    iget-object p2, p0, Ll/ۗ᩶ۚ;->ܿ:Ll/۟᩹ۚ;

    .line 117
    invoke-static {v0, p1, p2}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ljava/lang/String;Ll/۟᩹ۚ;)Ll/۟᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩶ۚ;->ܿ:Ll/۟᩹ۚ;

    return-object p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۧ᩶ۚ;)V
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ۗ᩶ۚ;->ᩳ:Ll/ܽ᩶ۚ;

    invoke-virtual {p1, v0}, Ll/ۧ᩶ۚ;->֫(Ll/ܽ᩶ۚ;)V

    return-void
.end method

.method public final ֫(Ll/ܽ᩶ۚ;)V
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۗ᩶ۚ;->ᩳ:Ll/ܽ᩶ۚ;

    iput-object v0, p1, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    .line 139
    iput-object p1, p0, Ll/ۗ᩶ۚ;->ᩳ:Ll/ܽ᩶ۚ;

    return-void
.end method

.method public final ֫(Ll/ᩳ᩶ۚ;)V
    .locals 9

    .line 181
    iget v0, p0, Ll/ۗ᩶ۚ;->᩷:I

    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    iget v0, p0, Ll/ۗ᩶ۚ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    const/4 v0, 0x0

    .line 185
    iget v1, p0, Ll/ۗ᩶ۚ;->ۢ:I

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 188
    :goto_0
    iget-object v3, p0, Ll/ۗ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    .line 191
    :cond_1
    iget-object v3, p0, Ll/ۗ᩶ۚ;->ܿ:Ll/۟᩹ۚ;

    if-eqz v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    .line 194
    :cond_2
    iget-object v3, p0, Ll/ۗ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    if-eqz v3, :cond_3

    add-int/lit8 v2, v2, 0x1

    .line 197
    :cond_3
    iget-object v3, p0, Ll/ۗ᩶ۚ;->ܳ:Ll/۟᩹ۚ;

    if-eqz v3, :cond_4

    add-int/lit8 v2, v2, 0x1

    .line 200
    :cond_4
    iget-object v3, p0, Ll/ۗ᩶ۚ;->ᩳ:Ll/ܽ᩶ۚ;

    if-eqz v3, :cond_6

    const/4 v4, 0x0

    :goto_1
    if-eqz v3, :cond_5

    add-int/lit8 v4, v4, 0x1

    .line 292
    iget-object v3, v3, Ll/ܽ᩶ۚ;->ۧ:Ll/ܽ᩶ۚ;

    goto :goto_1

    :cond_5
    add-int/2addr v2, v4

    .line 203
    :cond_6
    invoke-virtual {p1, v2}, Ll/ᩳ᩶ۚ;->ܽ(I)V

    .line 204
    iget-object v2, p0, Ll/ۗ᩶ۚ;->ۡ:Ll/ۛ᩶ۚ;

    invoke-static {v2, v0, v1, p1}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;IILl/ᩳ᩶ۚ;)V

    .line 205
    iget-object v4, p0, Ll/ۗ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    iget-object v5, p0, Ll/ۗ᩶ۚ;->ܿ:Ll/۟᩹ۚ;

    iget-object v6, p0, Ll/ۗ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    iget-object v7, p0, Ll/ۗ᩶ۚ;->ܳ:Ll/۟᩹ۚ;

    iget-object v3, p0, Ll/ۗ᩶ۚ;->ۡ:Ll/ۛ᩶ۚ;

    move-object v8, p1

    invoke-static/range {v3 .. v8}, Ll/۟᩹ۚ;->֫(Ll/ۛ᩶ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/ᩳ᩶ۚ;)V

    .line 212
    iget-object v0, p0, Ll/ۗ᩶ۚ;->ᩳ:Ll/ܽ᩶ۚ;

    if-eqz v0, :cond_7

    .line 213
    invoke-virtual {v0, v2, p1}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;Ll/ᩳ᩶ۚ;)V

    :cond_7
    return-void
.end method

.method public final ۧ()I
    .locals 6

    const/4 v0, 0x0

    .line 161
    iget v1, p0, Ll/ۗ᩶ۚ;->ۢ:I

    iget-object v2, p0, Ll/ۗ᩶ۚ;->ۡ:Ll/ۛ᩶ۚ;

    invoke-static {v2, v0, v1}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;II)I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    .line 162
    iget-object v1, p0, Ll/ۗ᩶ۚ;->᩻:Ll/۟᩹ۚ;

    iget-object v3, p0, Ll/ۗ᩶ۚ;->ܿ:Ll/۟᩹ۚ;

    iget-object v4, p0, Ll/ۗ᩶ۚ;->ۜ:Ll/۟᩹ۚ;

    iget-object v5, p0, Ll/ۗ᩶ۚ;->ܳ:Ll/۟᩹ۚ;

    .line 163
    invoke-static {v1, v3, v4, v5}, Ll/۟᩹ۚ;->֫(Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;Ll/۟᩹ۚ;)I

    move-result v1

    add-int/2addr v0, v1

    .line 168
    iget-object v1, p0, Ll/ۗ᩶ۚ;->ᩳ:Ll/ܽ᩶ۚ;

    if-eqz v1, :cond_0

    .line 169
    invoke-virtual {v1, v2}, Ll/ܽ᩶ۚ;->֫(Ll/ۛ᩶ۚ;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method
