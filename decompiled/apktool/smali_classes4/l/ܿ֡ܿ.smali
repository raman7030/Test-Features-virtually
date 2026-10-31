.class public final Ll/ܿ֡ܿ;
.super Ljava/lang/Object;
.source "D18B"


# static fields
.field public static final synthetic ֫:I

.field public static ۜ:Ljava/lang/Boolean;

.field public static final ۧ:Ljava/lang/String;

.field public static ܳ:Ll/۠᩸ܿ;

.field public static final ܽ:Ll/ᩴ᩵;

.field public static ܿ:Z

.field public static ᩳ:Ljava/lang/Boolean;

.field public static ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 59
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ܿ֡ܿ;->ۧ:Ljava/lang/String;

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xffffff

    and-long/2addr v1, v3

    long-to-int v2, v1

    sput v2, Ll/ܿ֡ܿ;->᩻:I

    .line 61
    new-instance v1, Ll/ᩴ᩵;

    invoke-direct {v1}, Ll/ᩴ᩵;-><init>()V

    sput-object v1, Ll/ܿ֡ܿ;->ܽ:Ll/ᩴ᩵;

    const/4 v2, 0x1

    .line 62
    sput-boolean v2, Ll/ܿ֡ܿ;->ܿ:Z

    .line 63
    new-instance v2, Ll/᩺᩵ܿ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/᩺᩵ܿ;-><init>(I)V

    sput-object v2, Ll/ܿ֡ܿ;->ܳ:Ll/۠᩸ܿ;

    .line 69
    invoke-virtual {v1, v0}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    const-string v0, "/sdcard"

    .line 70
    invoke-virtual {v1, v0}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 1

    .line 78
    sget-object v0, Ll/ܿ֡ܿ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 624
    invoke-static {}, Ll/ܿ֡ܿ;->ۧ()Ll/ᩴ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 625
    invoke-static {p0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "/"

    .line 626
    invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 627
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v0, :cond_2

    .line 628
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x0

    .line 293
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const-string v2, "Unsafe archive entry path: "

    if-gez v1, :cond_d

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "\\"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 296
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x3a

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-lt v3, v5, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 297
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 300
    :cond_1
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 302
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v9

    if-gt v7, v9, :cond_9

    .line 303
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v9

    if-eq v7, v9, :cond_2

    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x2f

    if-eq v9, v10, :cond_2

    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x5c

    if-eq v9, v10, :cond_2

    goto :goto_4

    .line 306
    :cond_2
    invoke-virtual {p0, v8, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v9, v7, 0x1

    .line 308
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_8

    const-string v10, "."

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_3

    :cond_3
    const-string v10, ".."

    .line 311
    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 312
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_4

    .line 0
    invoke-static {v3, v6}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_3

    .line 313
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 318
    :cond_5
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    if-lt v10, v5, :cond_7

    invoke-virtual {v8, v0}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-static {v10}, Ljava/lang/Character;->isLetter(C)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v8, v6}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v4, :cond_6

    goto :goto_2

    .line 319
    :cond_6
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 321
    :cond_7
    :goto_2
    invoke-static {v8}, Ll/ܿ֡ܿ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_3
    move v8, v9

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 0
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_c

    .line 324
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_6

    .line 325
    :cond_b
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_6
    return-object v0

    .line 294
    :cond_d
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 7

    .line 860
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 861
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 862
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v2, "\\"

    .line 864
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const v3, 0x7f1203ae

    if-nez v2, :cond_b

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_2

    .line 866
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    const v4, 0x7f120881

    const v5, 0x7f1208c1

    const v6, 0x7f1208c2

    if-eqz v2, :cond_7

    .line 867
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 868
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 417
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܰ֫()Ljava/util/List;

    move-result-object v2

    .line 869
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 871
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p0

    if-eqz p0, :cond_2

    .line 872
    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 874
    :cond_2
    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const-string v0, ".tmp"

    .line 899
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 880
    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    const-string p0, ":"

    .line 882
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "?"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "*"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "\""

    .line 883
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "<"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, ">"

    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_6

    const-string p0, "|"

    .line 884
    invoke-virtual {v1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_0

    .line 887
    :cond_5
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 885
    :cond_6
    :goto_0
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 889
    :cond_7
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 890
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result p0

    if-eqz p0, :cond_8

    .line 891
    invoke-static {v6}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 893
    :cond_8
    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 895
    :cond_9
    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result p0

    if-eqz p0, :cond_a

    :goto_1
    const/4 p0, 0x0

    return-object p0

    .line 898
    :cond_a
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 865
    :cond_b
    :goto_2
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Intent;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 157
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 161
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 159
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Intent data is null: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;
    .locals 7

    const-string v0, "file"

    .line 181
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 182
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ll/᩻᩵ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-array v0, v1, [Ljava/lang/String;

    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "content"

    .line 183
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 184
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    .line 185
    sget-object v2, Ll/ۨ᩵ܿ;->᩸:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 186
    invoke-static {p0}, Ll/ۨ᩵ܿ;->֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    :cond_1
    const-string v2, "bin.mt.plus.fileprovider2"

    .line 187
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_6

    const-string v2, "bin.mt.plus.canary.fileprovider2"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "bin.mt.plus.fp"

    .line 188
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, "bin.mt.plus.canary.fp"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string v0, "com.android.externalstorage.documents"

    .line 193
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 194
    invoke-static {p0}, Ll/ܳܶܿ;->ܿ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v2, "primary"

    .line 196
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x3

    if-eqz v2, :cond_3

    .line 197
    invoke-static {p0}, Ll/ܳܶܿ;->ۧ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 199
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 200
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 v2, 0x0

    .line 48
    invoke-static {v2}, Ll/᩵᩸ܿ;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 202
    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۘ᩸ܿ;

    .line 203
    iget-object v6, v5, Ll/ۘ᩸ܿ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 204
    invoke-static {p0}, Ll/ܳܶܿ;->ۧ(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 206
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v3

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 207
    iget-object v0, v5, Ll/ۘ᩸ܿ;->ܽ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    :cond_5
    const-string v0, "com.android.providers.downloads.ui.fileprovider"

    .line 212
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 213
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v2, "/external_files/Download/"

    .line 214
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 215
    sget-object p0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 189
    :cond_6
    :goto_0
    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v2, "/NOT_DELETE/"

    .line 190
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    new-array p0, v1, [Ljava/lang/String;

    .line 191
    invoke-static {v0, p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 218
    :cond_7
    invoke-static {p0}, Ll/᩻᩵ܿ;->֫(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    new-array v1, v1, [Ljava/lang/String;

    .line 220
    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 221
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 231
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_8

    goto/16 :goto_2

    .line 238
    :cond_8
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v1

    .line 239
    invoke-interface {v1}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_9

    goto/16 :goto_2

    .line 242
    :cond_9
    instance-of v2, v0, Ll/۬۠ܿ;

    if-eqz v2, :cond_d

    move-object v2, v0

    check-cast v2, Ll/۬۠ܿ;

    .line 243
    invoke-interface {v1}, Ll/֡᩶ܿ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_c

    .line 244
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Ll/ܰ᩵ܿ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2}, Ll/ܰ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1

    .line 252
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1

    invoke-interface {v1, v4, v5, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, v4, :cond_a

    .line 257
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p0

    if-nez p0, :cond_e

    .line 258
    invoke-interface {v1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-object v0

    .line 257
    :cond_a
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_b

    .line 258
    invoke-interface {v1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 260
    :cond_b
    throw p0

    .line 257
    :catch_0
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_f

    .line 258
    :goto_1
    invoke-interface {v1, v3}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_3

    .line 262
    :cond_c
    invoke-virtual {v2}, Ll/۬۠ܿ;->᩵֫()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 263
    :try_start_1
    invoke-static {}, Ll/ۙ᩸᩷;->ᩳ()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v2}, Ll/۬۠ܿ;->ܽ֫()Landroid/net/Uri;

    move-result-object v2

    const-string v3, "r"

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    if-eqz v1, :cond_e

    .line 265
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    .line 269
    :cond_d
    instance-of v1, v0, Ll/ۨᩴܿ;

    if-eqz v1, :cond_e

    move-object v1, v0

    check-cast v1, Ll/ۨᩴܿ;

    .line 270
    :try_start_2
    invoke-virtual {v1}, Ll/ܺ֡ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object v1

    .line 272
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :cond_e
    :goto_2
    return-object v0

    .line 225
    :catch_1
    :cond_f
    :goto_3
    new-instance v0, Ll/ܳ᩸ܿ;

    invoke-direct {v0, p0}, Ll/ܳ᩸ܿ;-><init>(Landroid/net/Uri;)V

    return-object v0

    .line 227
    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported uri: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/io/File;)Ll/ܶ᩵ܿ;
    .locals 15

    .line 483
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 484
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    const/4 v3, 0x1

    if-lt v1, v2, :cond_d

    const/4 v1, 0x4

    .line 668
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 659
    invoke-static {}, Ll/ܿ֡ܿ;->ۧ()Ll/ᩴ᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, ""

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 660
    invoke-static {v0, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 661
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v10, v4, 0x1

    .line 696
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    const/4 v12, 0x7

    const-string v13, "android"

    invoke-static {v0, v10, v13, v11, v12}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_6

    add-int/lit8 v11, v4, 0x9

    const-string v12, "data"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v13

    invoke-static {v0, v11, v12, v13, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v12

    const-string v13, "/"

    if-eqz v12, :cond_3

    add-int/lit8 v4, v4, 0xe

    .line 667
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v5

    .line 696
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v12

    invoke-static {v0, v4, v5, v11, v12}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 668
    invoke-static {v2, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto/16 :goto_3

    .line 670
    :cond_1
    invoke-virtual {v0, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 671
    :goto_0
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v10, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    :cond_3
    const-string v12, "obb"

    .line 696
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v14

    invoke-static {v0, v11, v12, v14, v7}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v11

    if-eqz v11, :cond_6

    add-int/lit8 v4, v4, 0xd

    .line 674
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v5

    .line 696
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v12

    invoke-static {v0, v4, v5, v11, v12}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 675
    invoke-static {v2, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    .line 677
    :cond_4
    invoke-virtual {v0, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v3

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 678
    :goto_1
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v10, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    .line 681
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v2, v4, :cond_7

    invoke-static {v0}, Lbin/mt/plus/Features3;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_7
    move-object v2, v9

    .line 682
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-nez v2, :cond_8

    move-object v2, v6

    :cond_8
    invoke-static {v4, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    .line 685
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    .line 486
    :goto_3
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eq v4, v3, :cond_c

    if-eq v4, v8, :cond_b

    if-eq v4, v7, :cond_b

    if-eq v4, v1, :cond_a

    goto :goto_4

    .line 496
    :cond_a
    new-instance v0, Ll/ܺ֡ܿ;

    invoke-direct {v0, p0, v3}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    .line 497
    iput-object v6, v0, Ll/ܺ֡ܿ;->۫:Ljava/lang/String;

    return-object v0

    .line 494
    :cond_b
    iget-object v0, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 527
    invoke-static {p0, v0, v9}, Ll/ܿ֡ܿ;->֫(Ljava/io/File;Ljava/lang/String;Ll/ۙ۠ܿ;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 488
    :cond_c
    new-instance v0, Ll/ܺ֡ܿ;

    const/4 v1, 0x0

    .line 49
    invoke-direct {v0, p0, v1}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    .line 489
    iget-object p0, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    iput-object p0, v0, Ll/ܺ֡ܿ;->۫:Ljava/lang/String;

    return-object v0

    :cond_d
    const/4 v1, 0x0

    .line 501
    invoke-static {v0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 502
    new-instance v0, Ll/ܺ֡ܿ;

    .line 49
    invoke-direct {v0, p0, v1}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0

    .line 504
    :cond_e
    :goto_4
    invoke-static {v0}, Ll/ܿ֡ܿ;->ܽ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 506
    new-instance v0, Ll/ۧ᩹ܿ;

    invoke-direct {v0, p0, v3}, Ll/ۧ᩹ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0

    .line 508
    :cond_f
    invoke-static {p0}, Ll/ۢܶܿ;->֫(Ljava/io/File;)Ll/ܶ᩵ܿ;

    move-result-object v0

    if-eqz v0, :cond_10

    return-object v0

    .line 512
    :cond_10
    invoke-static {p0}, Ll/ᩴܶܿ;->֫(Ljava/io/File;)Ll/ۡܶܿ;

    move-result-object v0

    if-eqz v0, :cond_11

    return-object v0

    .line 516
    :cond_11
    new-instance v0, Ll/ۧ᩹ܿ;

    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, v1}, Ll/ۧ᩹ܿ;-><init>(Ljava/io/File;Z)V

    return-object v0
.end method

.method public static ֫(Ljava/io/File;Ljava/lang/String;Ll/ۙ۠ܿ;)Ll/ܶ᩵ܿ;
    .locals 10

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "Android/data"

    move-object v0, p1

    .line 537
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Android/data"

    const/16 v1, 0xe

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    const/16 v7, 0xb

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "Android/obb"

    move-object v2, p1

    .line 540
    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "Android/obb"

    const/16 v1, 0xd

    .line 546
    :goto_0
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v2

    invoke-interface {v2}, Ll/֡᩶ܿ;->֫()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x7

    const-string v5, "\u200bAndroid"

    if-nez v2, :cond_2

    .line 547
    invoke-static {}, Ll/ܿ֡ܿ;->ܽ()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 548
    :cond_1
    new-instance p0, Ll/ۨᩴܿ;

    new-instance p2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v4, p1, v0}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 548
    sget-object v0, Ll/ܿ֡ܿ;->ۧ:Ljava/lang/String;

    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0, p2, v3}, Ll/ܺ֡ܿ;-><init>(Ljava/io/File;Z)V

    return-object p0

    .line 552
    :cond_2
    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 553
    new-instance v0, Ll/۬۠ܿ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v4, p1, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 553
    invoke-direct {v0, p0, p1, v5, p2}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V

    return-object v0

    .line 555
    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v2, v4, :cond_5

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v9, v2, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v0, 0x2f

    .line 556
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 558
    new-instance v0, Ll/۬۠ܿ;

    invoke-direct {v0, p0, p1, p1, p2}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V

    return-object v0

    .line 560
    :cond_4
    new-instance v1, Ll/۬۠ܿ;

    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p0, p1, v0, p2}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V

    return-object v1

    .line 562
    :cond_5
    new-instance v1, Ll/۬۠ܿ;

    invoke-direct {v1, p0, p1, v0, p2}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V

    return-object v1

    .line 544
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Path must be in Android/data or Android/obb: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 4

    const-string v0, "content://"

    .line 453
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "android.resource://"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "$RECYCLE.BIN$/"

    .line 460
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 461
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/᩹֡ܿ;->ܿ()Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xd

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 463
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v0

    invoke-interface {v0}, Ll/֡᩶ܿ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 464
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 466
    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "/data/media/"

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 470
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 471
    array-length p0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_2

    aget-object v2, p1, v1

    .line 472
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    move-object v0, v3

    goto :goto_0

    .line 474
    :cond_2
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Ljava/io/File;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 454
    :cond_3
    :goto_1
    array-length p1, p1

    if-nez p1, :cond_4

    .line 457
    new-instance p1, Ll/ܳ᩸ܿ;

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {p1, p0}, Ll/ܳ᩸ܿ;-><init>(Landroid/net/Uri;)V

    return-object p1

    .line 455
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Children must be empty when path is context uri"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/֫᩹᩷;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 165
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    .line 169
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "android.intent.extra.STREAM"

    .line 171
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    :cond_0
    if-eqz v0, :cond_1

    .line 176
    invoke-static {v0}, Ll/ܿ֡ܿ;->֫(Landroid/net/Uri;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0

    .line 174
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Intent data is null: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 3

    .line 758
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۙ()Z

    .line 761
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Ll/ܿ֡ܿ;->᩻:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Ll/ܿ֡ܿ;->᩻:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 762
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0
.end method

.method public static ֫(Ll/۠᩸ܿ;)V
    .locals 0

    .line 767
    sput-object p0, Ll/ܿ֡ܿ;->ܳ:Ll/۠᩸ܿ;

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 786
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 789
    :cond_0
    sget-object v0, Ll/ܿ֡ܿ;->ܳ:Ll/۠᩸ܿ;

    invoke-interface {v0}, Ll/۠᩸ܿ;->get()Ll/ܶ᩸ܿ;

    move-result-object v0

    .line 790
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    if-eqz v0, :cond_1

    .line 791
    invoke-interface {v0, p0}, Ll/ܶ᩸ܿ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 792
    invoke-interface {v0, p0}, Ll/ܶ᩸ܿ;->ۧ(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;ILjava/lang/String;II)Z
    .locals 9

    if-ltz p1, :cond_7

    if-lt p3, p1, :cond_7

    .line 701
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le p3, v0, :cond_0

    goto :goto_1

    :cond_0
    if-ltz p4, :cond_7

    .line 704
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-le p4, v0, :cond_1

    goto :goto_1

    :cond_1
    sub-int v0, p3, p1

    const/16 v1, 0x2f

    const/4 v2, 0x1

    if-le v0, v2, :cond_2

    sub-int/2addr p3, v2

    .line 709
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    move-result p3

    if-ne p3, v1, :cond_2

    add-int/lit8 v0, v0, -0x1

    :cond_2
    if-le p4, v2, :cond_3

    add-int/lit8 p3, p4, -0x1

    .line 713
    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result p3

    if-ne p3, v1, :cond_3

    add-int/lit8 p4, p4, -0x1

    :cond_3
    if-le p4, v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    const/4 p3, 0x0

    move-object v3, p0

    move v5, p1

    move-object v6, p2

    move v7, p3

    move v8, p4

    .line 719
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v3

    if-eqz v3, :cond_7

    if-eq v0, p4, :cond_6

    if-ne p4, v2, :cond_5

    .line 720
    invoke-virtual {p2, p3}, Ljava/lang/String;->charAt(I)C

    move-result p2

    if-ne p2, v1, :cond_5

    goto :goto_0

    :cond_5
    add-int/2addr p1, p4

    .line 723
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    if-ne p0, v1, :cond_7

    :cond_6
    :goto_0
    return v2

    :cond_7
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 692
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;ILjava/lang/String;II)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/ۗܺ᩷;)Z
    .locals 1

    .line 145
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    .line 146
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/util/List;)Z
    .locals 8

    .line 907
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/۟᩵ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۟᩵ܿ;-><init>(I)V

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    invoke-static {}, Ll/᩺ۨᩴ;->toUnmodifiableSet()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    .line 914
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 917
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 919
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_4

    .line 920
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x61

    if-lt v6, v7, :cond_2

    const/16 v7, 0x7a

    if-gt v6, v7, :cond_2

    .line 922
    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/16 v7, 0x41

    if-lt v6, v7, :cond_3

    const/16 v7, 0x5a

    if-gt v6, v7, :cond_3

    .line 925
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_1

    .line 929
    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 930
    invoke-virtual {p0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 937
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p0

    xor-int/2addr p0, v3

    return p0

    :cond_5
    return v3
.end method

.method public static ֫([Ljava/lang/String;)[Ll/ܶ᩵ܿ;
    .locals 5

    .line 280
    array-length v0, p0

    new-array v0, v0, [Ll/ܶ᩵ܿ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 281
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    .line 282
    aget-object v3, p0, v2

    new-array v4, v1, [Ljava/lang/String;

    invoke-static {v3, v4}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۧ()Ll/ᩴ᩵;
    .locals 5

    .line 116
    sget-boolean v0, Ll/ܿ֡ܿ;->ܿ:Z

    sget-object v1, Ll/ܿ֡ܿ;->ܽ:Ll/ᩴ᩵;

    if-eqz v0, :cond_3

    .line 117
    invoke-static {}, Ll/᩹᩶ܿ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Ll/ۗ᩶ܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 119
    sput-boolean v0, Ll/ܿ֡ܿ;->ܿ:Z

    .line 120
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 123
    :try_start_0
    invoke-static {v0}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 124
    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 125
    new-instance v3, Ljava/io/File;

    invoke-virtual {v2}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/᩵᩶ܿ;->ۜ(Ljava/lang/String;)Ll/ܿ᩹ܿ;

    move-result-object v3

    .line 126
    invoke-virtual {v3}, Ll/ܿ᩹ܿ;->ۧ()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 127
    invoke-virtual {v3}, Ll/ܿ᩹ܿ;->ۧ()Ljava/lang/String;

    move-result-object v3

    .line 128
    invoke-virtual {v1, v3}, Ll/ᩴ᩵;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 129
    invoke-virtual {v2, v3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 137
    :cond_2
    invoke-virtual {v0}, Ll/᩵᩶ܿ;->ᩴ()V

    return-object v1

    :catchall_0
    nop

    goto :goto_1

    :catchall_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/᩵᩶ܿ;->ᩴ()V

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 0

    .line 573
    invoke-static {p0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 14

    .line 591
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/16 v0, 0x2f

    .line 592
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    add-int/lit8 v5, v2, 0x1

    .line 593
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    .line 594
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v5

    .line 595
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v7

    if-ne v0, v2, :cond_6

    const/4 v4, 0x1

    move-object v3, p0

    move-object v6, p1

    move v8, v0

    .line 596
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    .line 603
    :cond_1
    invoke-static {}, Ll/ܿ֡ܿ;->ۧ()Ll/ᩴ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, -0x1

    const/4 v4, -0x1

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "/"

    .line 604
    invoke-virtual {v5, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v1

    :goto_1
    if-gez v3, :cond_3

    .line 605
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v6, :cond_3

    invoke-static {p0, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v10, v6

    goto :goto_2

    :cond_3
    move v10, v3

    :goto_2
    if-gez v4, :cond_4

    .line 608
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v6, :cond_4

    invoke-static {p1, v5}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    move v12, v6

    goto :goto_3

    :cond_4
    move v12, v4

    :goto_3
    if-ltz v10, :cond_5

    if-ltz v12, :cond_5

    .line 613
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v10

    .line 614
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v12

    if-ne v2, v3, :cond_6

    const/4 v9, 0x1

    sub-int v13, v2, v0

    move-object v8, p0

    move-object v11, p1

    .line 615
    invoke-virtual/range {v8 .. v13}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    if-eqz p0, :cond_6

    :goto_4
    return v1

    :cond_5
    move v3, v10

    move v4, v12

    goto :goto_0

    :cond_6
    :goto_5
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Z
    .locals 1

    .line 771
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->֫ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 774
    :cond_0
    sget-object v0, Ll/ܿ֡ܿ;->ܳ:Ll/۠᩸ܿ;

    invoke-interface {v0}, Ll/۠᩸ܿ;->get()Ll/ܶ᩸ܿ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 775
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ll/ܶ᩸ܿ;->֫(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ܳ(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 405
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    .line 406
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x3e

    if-eq v4, v5, :cond_1

    const/16 v5, 0x3f

    if-eq v4, v5, :cond_1

    const/16 v5, 0x2028

    const/16 v6, 0x20

    if-eq v4, v5, :cond_2

    const/16 v5, 0x2029

    if-eq v4, v5, :cond_2

    packed-switch v4, :pswitch_data_0

    sparse-switch v4, :sswitch_data_0

    const/16 v5, 0x2000

    if-lt v4, v5, :cond_0

    const/16 v5, 0x200a

    if-gt v4, v5, :cond_0

    goto :goto_1

    :cond_0
    move v6, v4

    goto :goto_1

    :cond_1
    :sswitch_0
    const/16 v6, 0x5f

    :cond_2
    :goto_1
    :pswitch_0
    :sswitch_1
    if-eq v6, v4, :cond_3

    if-nez v1, :cond_3

    .line 442
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 443
    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_3
    if-eqz v1, :cond_4

    .line 446
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-nez v1, :cond_6

    return-object p0

    .line 449
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_1
        0x22 -> :sswitch_0
        0x2a -> :sswitch_0
        0x3a -> :sswitch_0
        0x3c -> :sswitch_0
        0x5c -> :sswitch_0
        0x7c -> :sswitch_0
        0x85 -> :sswitch_1
        0xa0 -> :sswitch_1
        0x1680 -> :sswitch_1
        0x202f -> :sswitch_1
        0x205f -> :sswitch_1
        0x3000 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ܽ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 337
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v1, "Unsafe archive symbolic link target: "

    if-nez v0, :cond_12

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-gez v2, :cond_12

    const-string v2, "/"

    .line 338
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_12

    const-string v3, "\\"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_12

    .line 341
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x3a

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-lt v3, v5, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 342
    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 345
    :cond_1
    :goto_0
    invoke-static {p0, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    .line 346
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/16 v7, 0x2f

    .line 347
    invoke-virtual {p0, v7}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_4

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    if-ge v9, v8, :cond_3

    .line 351
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v11, v7, :cond_2

    .line 352
    invoke-virtual {p0, v10, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v9, 0x1

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 356
    :cond_3
    invoke-virtual {p0, v10, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 359
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 361
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v10

    const-string v11, ".."

    const-string v12, "."

    if-gt v8, v10, :cond_c

    .line 362
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v10

    if-eq v8, v10, :cond_5

    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v7, :cond_5

    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v13, 0x5c

    if-eq v10, v13, :cond_5

    goto :goto_5

    .line 365
    :cond_5
    invoke-virtual {p1, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v10, v8, 0x1

    .line 367
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_b

    invoke-virtual {v12, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_4

    .line 370
    :cond_6
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    .line 371
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_7

    .line 0
    invoke-static {p0, v6}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_4

    .line 372
    :cond_7
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 377
    :cond_8
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    if-lt v11, v5, :cond_a

    invoke-virtual {v9, v0}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11}, Ljava/lang/Character;->isLetter(C)Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-virtual {v9, v6}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-eq v11, v4, :cond_9

    goto :goto_3

    .line 378
    :cond_9
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 380
    :cond_a
    :goto_3
    invoke-static {v9}, Ll/ܿ֡ܿ;->ܳ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_4
    move v9, v10

    :goto_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 384
    :cond_c
    :goto_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_d

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v0, p1, :cond_d

    .line 385
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 388
    :cond_d
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    move v1, v0

    .line 389
    :goto_7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_e

    .line 390
    invoke-virtual {p1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 392
    :cond_e
    :goto_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_f

    .line 393
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 395
    :cond_f
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_10

    return-object v12

    .line 0
    :cond_10
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_11
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 339
    :cond_12
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 779
    sget-object v0, Ll/ܿ֡ܿ;->ܳ:Ll/۠᩸ܿ;

    invoke-interface {v0}, Ll/۠᩸ܿ;->get()Ll/ܶ᩸ܿ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 781
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ll/ܶ᩸ܿ;->ۧ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ܽ()Z
    .locals 7

    .line 797
    sget-object v0, Ll/ܿ֡ܿ;->ᩳ:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 799
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    .line 801
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "Android"

    sget-object v2, Ll/ܿ֡ܿ;->ۧ:Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 802
    new-instance v1, Ljava/io/File;

    const-string v3, "\u200bAndroid"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 803
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 804
    new-instance v0, Ljava/io/File;

    const-string v3, "\u200bAndroid/data"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 805
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 808
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v5, v0, v3

    .line 809
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 846
    :try_start_0
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    sget v6, Landroid/system/OsConstants;->X_OK:I

    invoke-static {v5, v6}, Landroid/system/Os;->access(Ljava/lang/String;I)Z
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v4, v4, 0x1

    const/16 v5, 0x14

    if-ne v4, v5, :cond_1

    goto :goto_1

    .line 811
    :catch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܿ֡ܿ;->ᩳ:Ljava/lang/Boolean;

    .line 812
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܿ֡ܿ;->ۜ:Ljava/lang/Boolean;

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 821
    :cond_2
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܿ֡ܿ;->ᩳ:Ljava/lang/Boolean;

    .line 822
    sput-object v0, Ll/ܿ֡ܿ;->ۜ:Ljava/lang/Boolean;

    const/4 v0, 0x1

    return v0

    .line 826
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Ll/ܿ֡ܿ;->ᩳ:Ljava/lang/Boolean;

    .line 827
    sput-object v0, Ll/ܿ֡ܿ;->ۜ:Ljava/lang/Boolean;

    return v1
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "/"

    .line 731
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v1, p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    .line 732
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ll/ۙ᩸᩷;->᩻()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v2, "/data/"

    .line 735
    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_2

    .line 738
    :cond_2
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 739
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/data/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    .line 742
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user/0/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    .line 745
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user_de/0/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    .line 748
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user/999/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_1

    .line 751
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "/data/user_de/999/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_7

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_7
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ܿ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 642
    invoke-static {p0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 643
    sget-object v1, Ll/ܿ֡ܿ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 644
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 646
    :cond_0
    invoke-static {p0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    return-object p0
.end method

.method public static ᩳ()Z
    .locals 1

    .line 835
    sget-object v0, Ll/ܿ֡ܿ;->ۜ:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 836
    invoke-static {}, Ll/ܿ֡ܿ;->ܽ()Z

    .line 838
    :cond_0
    sget-object v0, Ll/ܿ֡ܿ;->ۜ:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 2

    .line 578
    invoke-static {}, Ll/ܿ֡ܿ;->ۧ()Ll/ᩴ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴ᩵;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 579
    invoke-static {p0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
