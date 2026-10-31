.class public final Ll/᩹ۨۡ;
.super Ljava/lang/Object;
.source "5AOM"


# direct methods
.method public static ֫(Ll/ܶۨۡ;)I
    .locals 5

    .line 216
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0

    .line 218
    :cond_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 220
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "uses-sdk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 224
    invoke-virtual {p0, v1}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v3

    const v4, 0x101020c

    if-ne v3, v4, :cond_1

    .line 225
    invoke-virtual {p0, v1, v2}, Ll/ۤۨۡ;->getAttributeIntValue(II)I

    move-result p0

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 1

    .line 15
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :try_start_1
    invoke-static {v0}, Ll/᩹ۨۡ;->֫(Ll/ᩳܰۡ;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 15
    :try_start_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ᩳܰۡ;)Ljava/lang/String;
    .locals 6

    const-string v0, "AndroidManifest.xml"

    .line 24
    invoke-virtual {p0, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 25
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    const-wide/32 v3, 0x500000

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p0

    invoke-static {p0}, Ll/᩹ۨۡ;->ۧ(Ll/ܶۨۡ;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ܶۨۡ;)Ljava/lang/String;
    .locals 5

    .line 89
    :try_start_0
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0

    .line 91
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-eq v1, v0, :cond_0

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ll/ۤۨۡ;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 110
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, ":"

    .line 113
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_3
    :goto_2
    const-string v3, ""

    .line 96
    :goto_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    invoke-virtual {p0, v1}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "package"

    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 99
    invoke-virtual {p0, v1}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catchall_0
    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ᩳܰۡ;)Z
    .locals 6

    const-string v0, "AndroidManifest.xml"

    .line 60
    invoke-virtual {p0, v0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {v0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v1

    const-wide/32 v3, 0x500000

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p0

    invoke-static {p0}, Ll/᩹ۨۡ;->ܿ(Ll/ܶۨۡ;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ll/ܶۨۡ;)Z
    .locals 6

    .line 155
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0

    .line 157
    :cond_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    .line 159
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "application"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 163
    invoke-virtual {p0, v3}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v4

    const v5, 0x10104ea

    if-ne v4, v5, :cond_1

    .line 164
    invoke-virtual {p0, v3, v2}, Ll/ۤۨۡ;->getAttributeBooleanValue(IZ)Z

    move-result p0

    xor-int/2addr p0, v2

    return p0

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public static ܽ(Ll/ܶۨۡ;)[Ljava/lang/String;
    .locals 7

    const/4 v0, 0x2

    .line 118
    :try_start_0
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0

    const/4 v1, 0x0

    move-object v2, v1

    .line 121
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7

    if-eq v3, v0, :cond_1

    goto :goto_0

    .line 124
    :cond_1
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "manifest"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 125
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v3

    :goto_1
    if-ge v4, v3, :cond_0

    .line 127
    invoke-virtual {p0, v4}, Ll/ۤۨۡ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "package"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 128
    invoke-virtual {p0, v4}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 131
    :cond_3
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v5, "application"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-nez v2, :cond_4

    goto :goto_3

    .line 135
    :cond_4
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v3

    :goto_2
    if-ge v4, v3, :cond_7

    .line 137
    invoke-virtual {p0, v4}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v5

    const v6, 0x1010003

    if-ne v5, v6, :cond_6

    .line 138
    invoke-virtual {p0, v4}, Ll/ۤۨۡ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object p0

    const-string v1, "."

    .line 139
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 142
    :cond_5
    filled-new-array {v2, p0}, [Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 148
    :cond_7
    :goto_3
    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    new-array p0, v0, [Ljava/lang/String;

    return-object p0
.end method

.method public static ܿ(Ll/ܶۨۡ;)Z
    .locals 6

    .line 175
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0

    .line 177
    :cond_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    .line 179
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "application"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "process"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    :cond_1
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 183
    invoke-virtual {p0, v3}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v4

    const v5, 0x101059e

    if-ne v4, v5, :cond_2

    .line 184
    invoke-virtual {p0, v3, v1}, Ll/ۤۨۡ;->getAttributeBooleanValue(IZ)Z

    move-result v4

    if-eqz v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method public static ᩳ(Ll/ܶۨۡ;)I
    .locals 5

    .line 196
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0

    .line 198
    :cond_0
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 200
    invoke-virtual {p0}, Ll/ۤۨۡ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "uses-sdk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 204
    invoke-virtual {p0, v1}, Ll/ۤۨۡ;->getAttributeNameResource(I)I

    move-result v3

    const v4, 0x1010270

    if-ne v3, v4, :cond_1

    .line 205
    invoke-virtual {p0, v1, v2}, Ll/ۤۨۡ;->getAttributeIntValue(II)I

    move-result p0

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method
