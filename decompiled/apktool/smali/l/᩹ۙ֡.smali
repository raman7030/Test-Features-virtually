.class public final Ll/᩹ۙ֡;
.super Ll/ۚۙ֡;
.source "K4XP"


# instance fields
.field public ۗ:Ll/᩺ۙ֡;

.field public ۙ:Ljava/lang/String;

.field public ۤ:Ll/۬ۙ֡;

.field public ۫:Ll/ۨۙ֡;

.field public ۬:I


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    const/4 p1, 0x0

    .line 35
    iput p1, p0, Ll/᩹ۙ֡;->۬:I

    const/4 p1, 0x0

    .line 180
    iput-object p1, p0, Ll/᩹ۙ֡;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/۬ۙ֡;Ll/ۨۙ֡;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Ll/᩹ۙ֡;-><init>(Ll/ۗ᩶֡;)V

    .line 60
    iput-object p2, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    .line 61
    iput-object p3, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 62
    iput-object p4, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    return-void
.end method

.method public static ֫(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/۬ۙ֡;Ll/ۨۙ֡;)Ll/᩹ۙ֡;
    .locals 1

    .line 78
    new-instance v0, Ll/᩹ۙ֡;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/᩹ۙ֡;-><init>(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/۬ۙ֡;Ll/ۨۙ֡;)V

    .line 79
    iget-object p0, p0, Ll/ۗ᩶֡;->ۖ:Ll/֡ۙ֡;

    invoke-virtual {p0, v0}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p0

    check-cast p0, Ll/᩹ۙ֡;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 34
    check-cast p1, Ll/᩹ۙ֡;

    invoke-virtual {p0, p1}, Ll/᩹ۙ֡;->֫(Ll/᩹ۙ֡;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 264
    const-class v2, Ll/᩹ۙ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 272
    :cond_1
    check-cast p1, Ll/᩹ۙ֡;

    .line 273
    iget-object v2, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    iget-object v3, p1, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    iget-object v3, p1, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    iget-object p1, p1, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 254
    iget v0, p0, Ll/᩹ۙ֡;->۬:I

    if-nez v0, :cond_0

    .line 245
    iget-object v0, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    invoke-virtual {v0}, Ll/᩺ۙ֡;->hashCode()I

    move-result v0

    iput v0, p0, Ll/᩹ۙ֡;->۬:I

    mul-int/lit8 v0, v0, 0x1f

    .line 246
    iget-object v1, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    invoke-virtual {v1}, Ll/۬ۙ֡;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩹ۙ֡;->۬:I

    mul-int/lit8 v1, v1, 0x1f

    .line 247
    iget-object v0, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    invoke-virtual {v0}, Ll/ۨۙ֡;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩹ۙ֡;->۬:I

    .line 256
    :cond_0
    iget v0, p0, Ll/᩹ۙ֡;->۬:I

    return v0
.end method

.method public final ֫(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x8

    return p1
.end method

.method public final ֫(Ll/᩹ۙ֡;)I
    .locals 2

    .line 167
    iget-object v0, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    iget-object v1, p1, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    invoke-virtual {v0, v1}, Ll/᩺ۙ֡;->֫(Ll/᩺ۙ֡;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 172
    :cond_0
    iget-object v0, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    iget-object v1, p1, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    invoke-virtual {v0, v1}, Ll/ۨۙ֡;->֫(Ll/ۨۙ֡;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 177
    :cond_1
    iget-object v0, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    iget-object p1, p1, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    invoke-virtual {v0, p1}, Ll/۬ۙ֡;->֫(Ll/۬ۙ֡;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "method_id_item: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/᩹ۙ֡;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶֡;)Ll/᩹ۙ֡;
    .locals 4

    .line 86
    new-instance v0, Ll/᩹ۙ֡;

    iget-object v1, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    .line 90
    invoke-virtual {v1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-static {v1, p1}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v1

    iget-object v2, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 91
    invoke-virtual {v2, p1}, Ll/۬ۙ֡;->֫(Ll/ۗ᩶֡;)Ll/۬ۙ֡;

    move-result-object v2

    iget-object v3, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    .line 95
    invoke-virtual {v3}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v3

    .line 93
    invoke-static {v3, p1}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Ll/᩹ۙ֡;-><init>(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/۬ۙ֡;Ll/ۨۙ֡;)V

    .line 97
    iget-object p1, p1, Ll/ۗ᩶֡;->ۖ:Ll/֡ۙ֡;

    invoke-virtual {p1, v0}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/᩹ۙ֡;

    return-object p1
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 1

    .line 144
    iget-object v0, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 144
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 145
    iget-object v0, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 145
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ᩳ(I)V

    .line 146
    iget-object v0, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 146
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    return-void
.end method

.method public final ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    .locals 2

    .line 122
    iget-object p2, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    iget-object v0, p2, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v0

    check-cast v0, Ll/᩺ۙ֡;

    iput-object v0, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    .line 123
    iget-object v0, p2, Ll/ۗ᩶֡;->ۘ:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ᩳ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v0

    check-cast v0, Ll/۬ۙ֡;

    iput-object v0, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 124
    iget-object p2, p2, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/ۨۙ֡;

    iput-object p1, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 6

    .line 186
    iget-object v0, p0, Ll/᩹ۙ֡;->ۙ:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 187
    iget-object v0, p0, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    invoke-virtual {v0}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 188
    iget-object v1, p0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    invoke-virtual {v1}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v1

    .line 189
    iget-object v2, p0, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    invoke-virtual {v2}, Ll/۬ۙ֡;->᩻()Ljava/lang/String;

    move-result-object v2

    .line 191
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v4, v5

    add-int/lit8 v4, v4, 0x2

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 193
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "->"

    .line 194
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ۙ֡;->ۙ:Ljava/lang/String;

    .line 199
    :cond_0
    iget-object v0, p0, Ll/᩹ۙ֡;->ۙ:Ljava/lang/String;

    return-object v0
.end method
