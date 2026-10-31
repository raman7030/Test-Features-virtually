.class public final Ll/ܿܺۢ;
.super Ljava/lang/Object;
.source "B1PU"


# direct methods
.method public static ֫()Ljava/util/ArrayList;
    .locals 7

    .line 126
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 127
    invoke-static {}, Ll/ܿܺۢ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v1

    const/4 v2, 0x1

    .line 413
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v1

    .line 128
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 129
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "info"

    .line 131
    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    const-string v4, "packageLocal"

    .line 132
    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    const-string v5, "packageUpload"

    .line 133
    invoke-virtual {v2, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 135
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    .line 140
    :cond_2
    :try_start_0
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v3

    invoke-static {v3}, Ll/ܽܺۢ;->֫([B)Ll/ܽܺۢ;

    move-result-object v3

    .line 141
    invoke-static {v2, v3}, Ll/ܿܺۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽܺۢ;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_5

    .line 146
    iget-object v2, v3, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۡܺۢ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, -0x1

    .line 148
    iput v2, v3, Ll/ܽܺۢ;->۫:I

    goto :goto_1

    .line 149
    :cond_3
    sget-object v2, Ll/ۡܺۢ;->ۨ:Ll/ᩴ᩵;

    iget-object v4, v3, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ll/ᩴ᩵;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x2

    .line 151
    iput v2, v3, Ll/ܽܺۢ;->۫:I

    goto :goto_1

    :cond_4
    const/4 v2, -0x3

    .line 154
    iput v2, v3, Ll/ܽܺۢ;->۫:I

    .line 156
    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 142
    :cond_5
    :try_start_1
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    throw v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    nop

    goto :goto_0

    .line 158
    :cond_6
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method public static ֫(Ll/ܽܺۢ;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 54
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "protector/export/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ll/᩺᩵ۡ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".apk"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܽܺۢ;)Z
    .locals 2

    .line 114
    iget-object v0, p1, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 116
    :cond_0
    iget-object v0, p1, Ll/ܽܺۢ;->ۨ:Ljava/lang/String;

    invoke-static {}, Ll/᩺᩵ۡ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "packageLocal"

    .line 118
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 119
    iget-object p1, p1, Ll/ܽܺۢ;->ۗ:Ljava/lang/String;

    const-string v0, "MD5"

    invoke-static {p0, v0}, Ll/᩷ۤۡ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ()Ljava/util/List;
    .locals 9

    .line 163
    invoke-static {}, Ll/֫ܺۢ;->ۧ()Ljava/util/List;

    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽܺۢ;

    .line 165
    invoke-static {v2}, Ll/ܿܺۢ;->ۧ(Ll/ܽܺۢ;)Ll/ܶ᩵ܿ;

    move-result-object v3

    const-string v4, "info"

    .line 166
    invoke-virtual {v3, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    const-string v5, "packageLocal"

    .line 167
    invoke-virtual {v3, v5}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    const-string v6, "packageUpload"

    .line 168
    invoke-virtual {v3, v6}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v6

    .line 169
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v7

    const/4 v8, -0x4

    if-eqz v7, :cond_3

    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 173
    :cond_0
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 174
    invoke-virtual {v6}, Ll/ܶ᩵ܿ;->۬()Z

    .line 177
    :cond_1
    :try_start_0
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v4

    invoke-static {v4}, Ll/ܽܺۢ;->֫([B)Ll/ܽܺۢ;

    move-result-object v4

    .line 178
    iget-object v5, v4, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    iget-object v6, v2, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v3, v4}, Ll/ܿܺۢ;->֫(Ll/ܶ᩵ܿ;Ll/ܽܺۢ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 179
    iget-object v3, v4, Ll/ܽܺۢ;->᩶:Landroid/graphics/Bitmap;

    iput-object v3, v2, Ll/ܽܺۢ;->᩶:Landroid/graphics/Bitmap;

    .line 180
    iget-object v3, v4, Ll/ܽܺۢ;->ۗ:Ljava/lang/String;

    iput-object v3, v2, Ll/ܽܺۢ;->ۗ:Ljava/lang/String;

    .line 181
    iget-object v3, v4, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iput-object v3, v2, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 187
    :catch_0
    :cond_2
    iput v8, v2, Ll/ܽܺۢ;->۫:I

    goto :goto_0

    .line 170
    :cond_3
    :goto_1
    iput v8, v2, Ll/ܽܺۢ;->۫:I

    goto :goto_0

    .line 189
    :cond_4
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method public static ۧ(Ll/ܽܺۢ;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    invoke-static {}, Ll/ܿܺۢ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    iget-object p0, p0, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ()Ll/ܶ᩵ܿ;
    .locals 3

    .line 50
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "protector/tasks/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ll/᩺᩵ۡ;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    return-object v0
.end method
