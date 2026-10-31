.class public final Ll/۬ۙ֡;
.super Ll/ۚۙ֡;
.source "P4QJ"


# instance fields
.field public ۗ:I

.field public ۙ:Ljava/lang/String;

.field public ۤ:Ll/ۨۙ֡;

.field public ۫:Ll/᩺ۙ֡;

.field public ۬:Ll/ܰۙ֡;


# direct methods
.method public constructor <init>(Ll/ۗ᩶֡;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Ll/ۚۙ֡;-><init>(Ll/ۗ᩶֡;)V

    const/4 p1, 0x0

    .line 35
    iput p1, p0, Ll/۬ۙ֡;->ۗ:I

    const/4 p1, 0x0

    .line 183
    iput-object p1, p0, Ll/۬ۙ֡;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/ܰۙ֡;)V
    .locals 6

    .line 58
    invoke-direct {p0, p1}, Ll/۬ۙ֡;-><init>(Ll/ۗ᩶֡;)V

    .line 60
    invoke-virtual {p2}, Ll/᩺ۙ֡;->ۢ()Ljava/lang/String;

    move-result-object v0

    if-eqz p3, :cond_1

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 230
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    iget-object v2, p3, Ll/ܰۙ֡;->ۗ:[Ll/᩺ۙ֡;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 232
    invoke-virtual {v5}, Ll/᩺ۙ֡;->ۢ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 234
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 64
    :cond_1
    invoke-static {v0, p1}, Ll/ۨۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/ۨۙ֡;

    move-result-object p1

    iput-object p1, p0, Ll/۬ۙ֡;->ۤ:Ll/ۨۙ֡;

    .line 65
    iput-object p2, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    .line 66
    iput-object p3, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    return-void
.end method

.method public static ֫(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/ܰۙ֡;)Ll/۬ۙ֡;
    .locals 1

    .line 80
    new-instance v0, Ll/۬ۙ֡;

    invoke-direct {v0, p0, p1, p2}, Ll/۬ۙ֡;-><init>(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/ܰۙ֡;)V

    .line 81
    iget-object p0, p0, Ll/ۗ᩶֡;->ۘ:Ll/֡ۙ֡;

    invoke-virtual {p0, v0}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p0

    check-cast p0, Ll/۬ۙ֡;

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 34
    check-cast p1, Ll/۬ۙ֡;

    invoke-virtual {p0, p1}, Ll/۬ۙ֡;->֫(Ll/۬ۙ֡;)I

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

    .line 249
    const-class v2, Ll/۬ۙ֡;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 257
    :cond_1
    check-cast p1, Ll/۬ۙ֡;

    .line 258
    iget-object v2, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    iget-object v3, p1, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    iget-object p1, p1, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 239
    iget v0, p0, Ll/۬ۙ֡;->ۗ:I

    if-nez v0, :cond_1

    .line 231
    iget-object v0, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    invoke-virtual {v0}, Ll/᩺ۙ֡;->hashCode()I

    move-result v0

    iput v0, p0, Ll/۬ۙ֡;->ۗ:I

    mul-int/lit8 v0, v0, 0x1f

    .line 232
    iget-object v1, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ܰۙ֡;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    iput v0, p0, Ll/۬ۙ֡;->ۗ:I

    .line 241
    :cond_1
    iget v0, p0, Ll/۬ۙ֡;->ۗ:I

    return v0
.end method

.method public final ֫(I)I
    .locals 0

    add-int/lit8 p1, p1, 0xc

    return p1
.end method

.method public final ֫(Ll/۬ۙ֡;)I
    .locals 2

    .line 159
    iget-object v0, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    iget-object v1, p1, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    invoke-virtual {v0, v1}, Ll/᩺ۙ֡;->֫(Ll/᩺ۙ֡;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 164
    :cond_0
    iget-object v0, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-nez v0, :cond_2

    .line 165
    iget-object p1, p1, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1

    .line 169
    :cond_2
    iget-object p1, p1, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-nez p1, :cond_3

    const/4 p1, 0x1

    return p1

    .line 173
    :cond_3
    invoke-virtual {v0, p1}, Ll/ܰۙ֡;->֫(Ll/ܰۙ֡;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 180
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "proto_id_item: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/۬ۙ֡;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۗ᩶֡;)Ll/۬ۙ֡;
    .locals 3

    .line 86
    new-instance v0, Ll/۬ۙ֡;

    iget-object v1, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    .line 90
    invoke-virtual {v1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 88
    invoke-static {v1, p1}, Ll/᩺ۙ֡;->֫(Ljava/lang/String;Ll/ۗ᩶֡;)Ll/᩺ۙ֡;

    move-result-object v1

    .line 91
    iget-object v2, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-eqz v2, :cond_0

    invoke-virtual {v2, p1}, Ll/ܰۙ֡;->֫(Ll/ۗ᩶֡;)Ll/ܰۙ֡;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v0, p1, v1, v2}, Ll/۬ۙ֡;-><init>(Ll/ۗ᩶֡;Ll/᩺ۙ֡;Ll/ܰۙ֡;)V

    .line 93
    iget-object p1, p1, Ll/ۗ᩶֡;->ۘ:Ll/֡ۙ֡;

    invoke-virtual {p1, v0}, Ll/ۤۙ֡;->֫(Ll/ۚۙ֡;)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/۬ۙ֡;

    return-object p1
.end method

.method public final ֫(Ll/֫ۗ֡;)V
    .locals 1

    .line 143
    iget-object v0, p0, Ll/۬ۙ֡;->ۤ:Ll/ۨۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 143
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 144
    iget-object v0, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    .line 209
    iget v0, v0, Ll/ۚۙ֡;->᩹:I

    .line 144
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    .line 145
    iget-object v0, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 202
    :cond_0
    iget v0, v0, Ll/ۚۙ֡;->᩶:I

    .line 145
    :goto_0
    invoke-virtual {p1, v0}, Ll/֫ۗ֡;->ܽ(I)V

    return-void
.end method

.method public final ֫(Ll/ۧۗ֡;Ll/۫ۙ֡;)V
    .locals 3

    .line 116
    iget-object v0, p0, Ll/ۚۙ֡;->᩸:Ll/ۗ᩶֡;

    iget-object v1, v0, Ll/ۗ᩶֡;->᩵:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v1

    check-cast v1, Ll/ۨۙ֡;

    iput-object v1, p0, Ll/۬ۙ֡;->ۤ:Ll/ۨۙ֡;

    .line 117
    iget-object v0, v0, Ll/ۗ᩶֡;->֡:Ll/֡ۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/֡ۙ֡;->ۧ(I)Ll/ۚۙ֡;

    move-result-object v0

    check-cast v0, Ll/᩺ۙ֡;

    iput-object v0, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    .line 118
    sget-object v0, Ll/ܶۙ֡;->ۢ֫:Ll/ܶۙ֡;

    invoke-virtual {p1}, Ll/ۧۗ֡;->ܽ()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Ll/۫ۙ֡;->ۧ(Ll/ܶۙ֡;I)Ll/ۚۙ֡;

    move-result-object p1

    check-cast p1, Ll/ܰۙ֡;

    iput-object p1, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 3

    .line 189
    iget-object v0, p0, Ll/۬ۙ֡;->ۙ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    iget-object v1, p0, Ll/۬ۙ֡;->۬:Ll/ܰۙ֡;

    if-eqz v1, :cond_0

    const-string v2, ""

    .line 192
    invoke-virtual {v1, v2}, Ll/ܰۙ֡;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, ")"

    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    iget-object v1, p0, Ll/۬ۙ֡;->۫:Ll/᩺ۙ֡;

    invoke-virtual {v1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬ۙ֡;->ۙ:Ljava/lang/String;

    .line 199
    :cond_1
    iget-object v0, p0, Ll/۬ۙ֡;->ۙ:Ljava/lang/String;

    return-object v0
.end method
