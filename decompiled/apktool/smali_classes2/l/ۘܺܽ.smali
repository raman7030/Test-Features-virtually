.class public final Ll/ۘܺܽ;
.super Ljava/lang/Object;
.source "Y74I"


# instance fields
.field public ֫:Z

.field public final ۖ:Ll/ۖܺܽ;

.field public final ۘ:Ll/ۖܺܽ;

.field public ۜ:I

.field public final ۡ:Ll/ۖܺܽ;

.field public ۢ:Ljava/lang/String;

.field public ۧ:I

.field public final ܳ:Ll/ۖܺܽ;

.field public final ܺ:Ll/ۖܺܽ;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public final ᩴ:Ll/ۖܺܽ;

.field public ᩵:Ljava/lang/String;

.field public ᩷:Z

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ll/ۖܺܽ;

    invoke-direct {v0}, Ll/ۖܺܽ;-><init>()V

    iput-object v0, p0, Ll/ۘܺܽ;->ܳ:Ll/ۖܺܽ;

    .line 14
    new-instance v0, Ll/ۖܺܽ;

    invoke-direct {v0}, Ll/ۖܺܽ;-><init>()V

    iput-object v0, p0, Ll/ۘܺܽ;->ܺ:Ll/ۖܺܽ;

    .line 15
    new-instance v0, Ll/ۖܺܽ;

    invoke-direct {v0}, Ll/ۖܺܽ;-><init>()V

    iput-object v0, p0, Ll/ۘܺܽ;->ᩴ:Ll/ۖܺܽ;

    .line 16
    new-instance v0, Ll/ۖܺܽ;

    invoke-direct {v0}, Ll/ۖܺܽ;-><init>()V

    iput-object v0, p0, Ll/ۘܺܽ;->ۡ:Ll/ۖܺܽ;

    .line 17
    new-instance v0, Ll/ۖܺܽ;

    invoke-direct {v0}, Ll/ۖܺܽ;-><init>()V

    iput-object v0, p0, Ll/ۘܺܽ;->ۘ:Ll/ۖܺܽ;

    .line 18
    new-instance v0, Ll/ۖܺܽ;

    invoke-direct {v0}, Ll/ۖܺܽ;-><init>()V

    iput-object v0, p0, Ll/ۘܺܽ;->ۖ:Ll/ۖܺܽ;

    const-string v0, ""

    .line 20
    iput-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(CI)C
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘܺܽ;->ۧ(CI)C

    move-result p0

    return p0
.end method

.method private ֫(Ljava/lang/String;IIZ)V
    .locals 7

    .line 203
    iput-object p1, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    .line 204
    iput-boolean p4, p0, Ll/ۘܺܽ;->᩷:Z

    .line 205
    iput p2, p0, Ll/ۘܺܽ;->ܿ:I

    .line 206
    iput p3, p0, Ll/ۘܺܽ;->ۧ:I

    sub-int v0, p3, p2

    .line 207
    iput v0, p0, Ll/ۘܺܽ;->ܽ:I

    if-eqz p4, :cond_0

    move-object p4, p1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    .line 208
    :goto_0
    iput-object p4, p0, Ll/ۘܺܽ;->ۢ:Ljava/lang/String;

    const/4 p4, 0x0

    .line 212
    iput-boolean p4, p0, Ll/ۘܺܽ;->֫:Z

    const/4 v0, -0x1

    const/4 v1, -0x1

    move v2, p2

    :goto_1
    const/4 v3, 0x1

    if-ge v2, p3, :cond_5

    .line 214
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    sub-int v5, v2, p2

    const/16 v6, 0x2e

    if-ne v4, v6, :cond_1

    .line 217
    iput-boolean v3, p0, Ll/ۘܺܽ;->֫:Z

    :cond_1
    const/16 v3, 0x2f

    if-eq v4, v3, :cond_2

    if-ne v4, v6, :cond_3

    :cond_2
    move v0, v5

    :cond_3
    if-ne v4, v3, :cond_4

    move v1, v5

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    add-int/2addr v0, v3

    .line 226
    iput v0, p0, Ll/ۘܺܽ;->ᩳ:I

    if-ltz v1, :cond_6

    add-int/lit8 p4, v1, 0x2

    .line 228
    :cond_6
    iput p4, p0, Ll/ۘܺܽ;->ۜ:I

    .line 229
    iget p1, p0, Ll/ۘܺܽ;->ܽ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۘܺܽ;->᩻:I

    return-void
.end method

.method private ֫(ILjava/lang/String;)Z
    .locals 4

    .line 243
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, p0, Ll/ۘܺܽ;->ܽ:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 246
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 247
    iget-object v1, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v3, p0, Ll/ۘܺܽ;->ܿ:I

    add-int/2addr v3, v0

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1, p1}, Ll/ۘܺܽ;->ۧ(CI)C

    move-result v1

    .line 248
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_1

    :goto_1
    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public static ۧ(CI)C
    .locals 4

    const/4 v0, 0x1

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    if-ne p1, v0, :cond_0

    if-ne p0, v2, :cond_5

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    if-ne p0, v1, :cond_5

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    const/16 v3, 0x24

    if-ne p1, v0, :cond_3

    if-eq p0, v2, :cond_2

    if-ne p0, v3, :cond_5

    :cond_2
    :goto_0
    return v1

    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_5

    if-eq p0, v1, :cond_4

    if-eq p0, v2, :cond_4

    if-ne p0, v3, :cond_5

    :cond_4
    :goto_1
    return v2

    :cond_5
    return p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/CharSequence;
    .locals 4

    .line 68
    iget-boolean v0, p0, Ll/ۘܺܽ;->᩷:Z

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    return-object v0

    .line 71
    :cond_0
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v1, p0, Ll/ۘܺܽ;->ܿ:I

    iget v2, p0, Ll/ۘܺܽ;->ۧ:I

    iget-object v3, p0, Ll/ۘܺܽ;->ܳ:Ll/ۖܺܽ;

    invoke-virtual {v3, v1, v2, v0}, Ll/ۖܺܽ;->֫(IILjava/lang/String;)V

    return-object v3
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 6

    .line 132
    iget v0, p0, Ll/ۘܺܽ;->ܽ:I

    add-int/lit8 v0, v0, 0x2

    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-eq v1, v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v1, v0, :cond_4

    if-nez v1, :cond_1

    const/16 v3, 0x4c

    goto :goto_1

    .line 236
    :cond_1
    iget v4, p0, Ll/ۘܺܽ;->ܽ:I

    add-int/2addr v4, v3

    if-ne v1, v4, :cond_2

    const/16 v3, 0x3b

    goto :goto_1

    .line 239
    :cond_2
    iget-object v4, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v5, p0, Ll/ۘܺܽ;->ܿ:I

    add-int/2addr v5, v1

    sub-int/2addr v5, v3

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 137
    :goto_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-eq v3, v4, :cond_3

    :goto_2
    return v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v3
.end method

.method public final ۜ()Ljava/lang/CharSequence;
    .locals 5

    .line 90
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v1, p0, Ll/ۘܺܽ;->ܿ:I

    iget v2, p0, Ll/ۘܺܽ;->ۧ:I

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ۘܺܽ;->ܺ:Ll/ۖܺܽ;

    invoke-virtual {v4, v1, v2, v3, v0}, Ll/ۖܺܽ;->֫(IIILjava/lang/String;)V

    return-object v4
.end method

.method public final ۡ()Ljava/lang/CharSequence;
    .locals 5

    .line 79
    iget-boolean v0, p0, Ll/ۘܺܽ;->᩷:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۘܺܽ;->֫:Z

    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    return-object v0

    .line 82
    :cond_0
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v1, p0, Ll/ۘܺܽ;->ܿ:I

    iget v2, p0, Ll/ۘܺܽ;->ۧ:I

    const/4 v3, 0x2

    iget-object v4, p0, Ll/ۘܺܽ;->ᩴ:Ll/ۖܺܽ;

    invoke-virtual {v4, v1, v2, v3, v0}, Ll/ۖܺܽ;->֫(IIILjava/lang/String;)V

    return-object v4
.end method

.method public final ۢ()Ljava/lang/CharSequence;
    .locals 5

    .line 106
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v1, p0, Ll/ۘܺܽ;->ܿ:I

    iget v2, p0, Ll/ۘܺܽ;->ᩳ:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/ۘܺܽ;->ۧ:I

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ۘܺܽ;->ۘ:Ll/ۖܺܽ;

    invoke-virtual {v4, v1, v2, v3, v0}, Ll/ۖܺܽ;->֫(IIILjava/lang/String;)V

    return-object v4
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۘܺܽ;->ۢ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 123
    invoke-virtual {p0}, Ll/ۘܺܽ;->֫()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘܺܽ;->ۢ:Ljava/lang/String;

    .line 125
    :cond_0
    iget-object v0, p0, Ll/ۘܺܽ;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 6

    .line 148
    iget v0, p0, Ll/ۘܺܽ;->ܽ:I

    add-int/lit8 v1, v0, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gt v2, v1, :cond_5

    .line 149
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v2

    if-le v1, v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 152
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    add-int v1, v2, v0

    if-nez v1, :cond_1

    const/16 v4, 0x4c

    goto :goto_1

    .line 236
    :cond_1
    iget v4, p0, Ll/ۘܺܽ;->ܽ:I

    add-int/2addr v4, v2

    if-ne v1, v4, :cond_2

    const/16 v4, 0x3b

    goto :goto_1

    .line 239
    :cond_2
    iget-object v4, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v5, p0, Ll/ۘܺܽ;->ܿ:I

    add-int/2addr v5, v1

    sub-int/2addr v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 153
    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-eq v4, v0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_2
    return v3
.end method

.method public final ܳ()I
    .locals 1

    .line 178
    iget v0, p0, Ll/ۘܺܽ;->ۜ:I

    return v0
.end method

.method public final ܳ(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x2

    .line 164
    invoke-direct {p0, v0, p1}, Ll/ۘܺܽ;->֫(ILjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܽ()I
    .locals 1

    .line 199
    iget v0, p0, Ll/ۘܺܽ;->ܽ:I

    return v0
.end method

.method public final ܽ(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x4

    .line 171
    invoke-direct {p0, v0, p1}, Ll/ۘܺܽ;->֫(ILjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ܿ()I
    .locals 1

    .line 185
    iget v0, p0, Ll/ۘܺܽ;->᩻:I

    return v0
.end method

.method public final ܿ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 55
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_1

    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x4c

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, p1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v2

    const/16 v3, 0x3b

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-direct {p0, p1, v1, v0, v1}, Ll/ۘܺܽ;->֫(Ljava/lang/String;IIZ)V

    return v1

    :cond_1
    :goto_0
    const-string p1, ""

    .line 57
    invoke-virtual {p0, p1}, Ll/ۘܺܽ;->ᩳ(Ljava/lang/String;)V

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 192
    iget v0, p0, Ll/ۘܺܽ;->ᩳ:I

    return v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    const-string p1, ""

    .line 36
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0, v1}, Ll/ۘܺܽ;->֫(Ljava/lang/String;IIZ)V

    return-void
.end method

.method public final ᩷()Ljava/lang/CharSequence;
    .locals 5

    .line 114
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v1, p0, Ll/ۘܺܽ;->ܿ:I

    iget v2, p0, Ll/ۘܺܽ;->ᩳ:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/ۘܺܽ;->ۧ:I

    const/4 v3, 0x3

    iget-object v4, p0, Ll/ۘܺܽ;->ۖ:Ll/ۖܺܽ;

    invoke-virtual {v4, v1, v2, v3, v0}, Ll/ۖܺܽ;->֫(IIILjava/lang/String;)V

    return-object v4
.end method

.method public final ᩻()Ljava/lang/CharSequence;
    .locals 5

    .line 98
    iget-object v0, p0, Ll/ۘܺܽ;->᩵:Ljava/lang/String;

    iget v1, p0, Ll/ۘܺܽ;->ܿ:I

    iget v2, p0, Ll/ۘܺܽ;->ۧ:I

    const/4 v3, 0x3

    iget-object v4, p0, Ll/ۘܺܽ;->ۡ:Ll/ۖܺܽ;

    invoke-virtual {v4, v1, v2, v3, v0}, Ll/ۖܺܽ;->֫(IIILjava/lang/String;)V

    return-object v4
.end method
