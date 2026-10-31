.class public final Ll/ۤۡۧ;
.super Ljava/lang/Object;
.source "T8NR"

# interfaces
.implements Ll/ܳ᩵֫;


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Z

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 1

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    if-eq p6, v0, :cond_1

    if-lez p6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 159
    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 160
    iput p1, p0, Ll/ۤۡۧ;->֫:I

    .line 161
    iput-object p2, p0, Ll/ۤۡۧ;->ۧ:Ljava/lang/String;

    .line 162
    iput-object p3, p0, Ll/ۤۡۧ;->ܿ:Ljava/lang/String;

    .line 163
    iput-object p4, p0, Ll/ۤۡۧ;->ܳ:Ljava/lang/String;

    .line 164
    iput-boolean p5, p0, Ll/ۤۡۧ;->ܽ:Z

    .line 165
    iput p6, p0, Ll/ۤۡۧ;->ᩳ:I

    return-void
.end method

.method public static ֫(Ljava/util/Map;)Ll/ۤۡۧ;
    .locals 13

    const-string v0, "Invalid metadata interval: "

    const-string v1, "Invalid bitrate: "

    const-string v2, "icy-br"

    .line 62
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-eqz v2, :cond_1

    .line 64
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 66
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    mul-int/lit16 v6, v6, 0x3e8

    if-lez v6, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 70
    :cond_0
    :try_start_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v1, 0x0

    const/4 v6, -0x1

    goto :goto_0

    :catch_0
    const/4 v6, -0x1

    :catch_1
    const-string v1, "Invalid bitrate header: "

    .line 0
    invoke-static {v1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    move v7, v6

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    const/4 v6, -0x1

    const/4 v7, -0x1

    :goto_1
    const-string v2, "icy-genre"

    .line 77
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    .line 79
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    move-object v8, v1

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move-object v8, v6

    :goto_2
    const-string v2, "icy-name"

    .line 82
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_3

    .line 84
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    move-object v9, v1

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    move-object v9, v6

    :goto_3
    const-string v2, "icy-url"

    .line 87
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_4

    .line 89
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x1

    move-object v10, v1

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    move-object v10, v6

    :goto_4
    const-string v2, "icy-pub"

    .line 92
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_5

    .line 94
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    move v11, v1

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    const/4 v11, 0x0

    :goto_5
    const-string v2, "icy-metaint"

    .line 97
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_7

    .line 99
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 101
    :try_start_2
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_3

    if-lez v2, :cond_6

    move v5, v2

    goto :goto_6

    .line 105
    :cond_6
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    move v3, v1

    :goto_6
    move v1, v3

    goto :goto_7

    :catch_2
    move v5, v2

    .line 0
    :catch_3
    invoke-static {v0, p0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    move v12, v5

    goto :goto_8

    :cond_7
    const/4 p0, -0x1

    const/4 v12, -0x1

    :goto_8
    if-eqz v1, :cond_8

    .line 113
    new-instance p0, Ll/ۤۡۧ;

    move-object v6, p0

    invoke-direct/range {v6 .. v12}, Ll/ۤۡۧ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    :cond_8
    return-object v6
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 183
    const-class v2, Ll/ۤۡۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 186
    :cond_1
    check-cast p1, Ll/ۤۡۧ;

    .line 187
    iget v2, p0, Ll/ۤۡۧ;->֫:I

    iget v3, p1, Ll/ۤۡۧ;->֫:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ۤۡۧ;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۤۡۧ;->ۧ:Ljava/lang/String;

    .line 188
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۤۡۧ;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۤۡۧ;->ܿ:Ljava/lang/String;

    .line 189
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ۤۡۧ;->ܳ:Ljava/lang/String;

    iget-object v3, p1, Ll/ۤۡۧ;->ܳ:Ljava/lang/String;

    .line 190
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean v2, p0, Ll/ۤۡۧ;->ܽ:Z

    iget-boolean v3, p1, Ll/ۤۡۧ;->ܽ:Z

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ۤۡۧ;->ᩳ:I

    iget p1, p1, Ll/ۤۡۧ;->ᩳ:I

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 198
    iget v0, p0, Ll/ۤۡۧ;->֫:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    .line 199
    iget-object v2, p0, Ll/ۤۡۧ;->ۧ:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 200
    iget-object v2, p0, Ll/ۤۡۧ;->ܿ:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 201
    iget-object v2, p0, Ll/ۤۡۧ;->ܳ:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 202
    iget-boolean v1, p0, Ll/ۤۡۧ;->ܽ:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 203
    iget v1, p0, Ll/ۤۡۧ;->ᩳ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 209
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IcyHeaders: name=\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۤۡۧ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", genre=\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۤۡۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۤۡۧ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", metadataInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۤۡۧ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫()Ll/۠ᩴ֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ll/ᩳ᩵֫;)V
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۤۡۧ;->ܿ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {p1, v0}, Ll/ᩳ᩵֫;->ۜ(Ljava/lang/CharSequence;)V

    .line 173
    :cond_0
    iget-object v0, p0, Ll/ۤۡۧ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 174
    invoke-virtual {p1, v0}, Ll/ᩳ᩵֫;->᩻(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public final synthetic ۧ()[B
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
