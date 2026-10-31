.class public final Ll/ܿۡᩳ;
.super Ljava/lang/Object;
.source "71Y3"


# instance fields
.field public final ֫:Ljava/util/HashSet;

.field public final ۧ:Ll/ۧۤᩴ;

.field public final ܳ:Z

.field public final ܽ:Ll/ۙۡᩳ;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ll/᩵ۡۚ;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ۙۡᩳ;ZZLl/ۚۢᩳ;)V
    .locals 9

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܿۡᩳ;->֫:Ljava/util/HashSet;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܿۡᩳ;->ܿ:Ljava/util/HashMap;

    .line 152
    iput-object p2, p0, Ll/ܿۡᩳ;->ܽ:Ll/ۙۡᩳ;

    .line 153
    iput-boolean p3, p0, Ll/ܿۡᩳ;->ܳ:Z

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 155
    new-instance v1, Ll/ᩳܰۡ;

    const-string v2, "base.apk"

    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    :try_start_0
    const-string v2, "classes.dex"

    .line 157
    invoke-virtual {v1, v2}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 161
    invoke-virtual {v1, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v3

    const/4 v4, 0x0

    .line 51
    invoke-static {v3, v4}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v3

    const/16 v5, 0x14

    .line 162
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 163
    invoke-static {v5}, Ll/ۖ۠ۡ;->֫([B)Ll/᩻ᩴۡ;

    move-result-object v6

    .line 164
    invoke-virtual {v6}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 168
    invoke-virtual {v6}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/String;[B)Z

    move-result v5

    if-nez v5, :cond_1

    .line 170
    array-length v5, v3

    div-int/lit8 v5, v5, 0x2

    :goto_0
    array-length v6, v3

    if-ge v5, v6, :cond_0

    .line 171
    aget-byte v6, v3, v5

    div-int/lit8 v6, v6, 0x2

    int-to-byte v6, v6

    aput-byte v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    .line 174
    :goto_1
    invoke-static {v3}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object v3

    .line 175
    invoke-virtual {v3, v2}, Ll/۬ۛ֡;->֫(Ljava/lang/Object;)V

    .line 176
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    .line 180
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "classes"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ".dex"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 181
    invoke-virtual {v1, v3}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_8

    .line 194
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V

    .line 195
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, p3, p4}, Ll/ۙۡᩳ;->֫(Ljava/lang/String;ZZ)V

    .line 196
    new-instance p1, Ll/᩵ۡۚ;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۬ۛ֡;

    invoke-virtual {p2}, Ll/۬ۛ֡;->֫()Ll/۠ۗ֡;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    iput-object p1, p0, Ll/ܿۡᩳ;->ᩳ:Ll/᩵ۡۚ;

    .line 197
    iget-object p1, p1, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {p1}, Ll/᩶᩷ۚ;->ܽ()Ll/ۧۤᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/ܿۡᩳ;->ۧ:Ll/ۧۤᩴ;

    .line 199
    invoke-interface {p5}, Ll/ۚۢᩳ;->ۚ֫()V

    .line 202
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/۬ۛ֡;

    .line 203
    invoke-virtual {p3}, Ll/۬ۛ֡;->ܳ()I

    move-result p3

    add-int/2addr p2, p3

    goto :goto_3

    .line 207
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p3, -0x1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/۬ۛ֡;

    .line 208
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 209
    invoke-virtual {p4}, Ll/۬ۛ֡;->ۧ()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ll/ᩴ۟֡;

    invoke-virtual {v1}, Ll/ᩴ۟֡;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ۛ֡;

    add-int/lit8 v4, v4, 0x1

    mul-int/lit8 v3, v4, 0x64

    .line 211
    div-int/2addr v3, p2

    if-eq v3, p3, :cond_4

    .line 214
    invoke-interface {p5, v3}, Ll/ۚۢᩳ;->ۧ(I)V

    move p3, v3

    .line 216
    :cond_4
    iget-object v3, p0, Ll/ܿۡᩳ;->ᩳ:Ll/᩵ۡۚ;

    iget-object v3, v3, Ll/᩸ۜۚ;->ܺ:Ll/᩶᩷ۚ;

    invoke-virtual {v3}, Ll/᩶᩷ۚ;->ܽ()Ll/ۧۤᩴ;

    move-result-object v3

    invoke-virtual {v2}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_5

    .line 218
    :cond_5
    iget-object v3, p0, Ll/ܿۡᩳ;->ᩳ:Ll/᩵ۡۚ;

    invoke-virtual {v3, v2}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;

    .line 219
    invoke-virtual {v2}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 220
    invoke-interface {p5}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_6

    .line 223
    :cond_6
    iget-object v1, p0, Ll/ܿۡᩳ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {p4}, Ll/۬ۛ֡;->ۖ()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    invoke-virtual {v1, p4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    :goto_6
    return-void

    .line 184
    :cond_8
    :try_start_1
    invoke-virtual {v1, v6}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v6

    .line 51
    invoke-static {v6, v4}, Ll/֡ۤۡ;->֫(Ljava/io/InputStream;I)[B

    move-result-object v6

    if-nez v5, :cond_9

    .line 186
    array-length v7, v6

    div-int/lit8 v7, v7, 0x2

    :goto_7
    array-length v8, v6

    if-ge v7, v8, :cond_9

    .line 187
    aget-byte v8, v6, v7

    div-int/lit8 v8, v8, 0x2

    int-to-byte v8, v8

    aput-byte v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    .line 190
    :cond_9
    invoke-static {v6}, Ll/۬ۛ֡;->֫([B)Ll/۬ۛ֡;

    move-result-object v6

    .line 191
    invoke-virtual {v6, v3}, Ll/۬ۛ֡;->֫(Ljava/lang/Object;)V

    .line 192
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 165
    :cond_a
    new-instance p1, Ll/᩵ۤۡ;

    const p2, 0x7f120520

    .line 232
    invoke-static {v6, p2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 165
    throw p1

    .line 159
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "classes.dex not found"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 155
    :try_start_2
    invoke-virtual {v1}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p1
.end method
