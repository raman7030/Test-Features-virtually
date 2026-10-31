.class public final Ll/ۛ۫;
.super Ljava/lang/Object;
.source "SB10"


# static fields
.field public static final ֫:Ll/ۙ۫;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 194
    new-instance v0, Ll/ۙ۫;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۙ۫;-><init>(I)V

    sput-object v0, Ll/ۛ۫;->֫:Ll/ۙ۫;

    return-void
.end method

.method public static ֫(Landroid/content/Context;Ll/ۨ۫;)Ll/ᩳۤ;
    .locals 21

    move-object/from16 v0, p0

    .line 58
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 79
    invoke-virtual/range {p1 .. p1}, Ll/ۨ۫;->ܽ()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 80
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v5

    if-eqz v5, :cond_11

    .line 86
    iget-object v6, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Ll/ۨ۫;->ᩳ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    .line 95
    iget-object v3, v5, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    const/16 v6, 0x40

    invoke-virtual {v1, v3, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 97
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 220
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 221
    array-length v6, v1

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v1, v7

    .line 222
    invoke-virtual {v8}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 98
    :cond_0
    sget-object v1, Ll/ۛ۫;->֫:Ll/ۙ۫;

    invoke-static {v3, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 187
    invoke-virtual/range {p1 .. p1}, Ll/ۨ۫;->֫()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 188
    invoke-virtual/range {p1 .. p1}, Ll/ۨ۫;->֫()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    .line 191
    :cond_1
    invoke-static {v2, v4}, Ll/ۖۗ;->֫(Landroid/content/res/Resources;I)Ljava/util/List;

    move-result-object v2

    :goto_1
    const/4 v6, 0x0

    .line 100
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    if-ge v6, v7, :cond_4

    .line 102
    new-instance v7, Ljava/util/ArrayList;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 103
    invoke-static {v7, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 208
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-eq v9, v10, :cond_2

    goto :goto_4

    :cond_2
    const/4 v9, 0x0

    .line 211
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v9, v10, :cond_5

    .line 212
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [B

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [B

    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v10

    if-nez v10, :cond_3

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_4
    move-object v5, v8

    :cond_5
    const/4 v1, 0x1

    if-nez v5, :cond_6

    .line 400
    new-instance v0, Ll/ᩳۤ;

    invoke-direct {v0, v1, v8}, Ll/ᩳۤ;-><init>(I[Ll/ܿۤ;)V

    return-object v0

    .line 63
    :cond_6
    iget-object v2, v5, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 122
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 123
    new-instance v5, Landroid/net/Uri$Builder;

    invoke-direct {v5}, Landroid/net/Uri$Builder;-><init>()V

    const-string v6, "content"

    invoke-virtual {v5, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    .line 124
    invoke-virtual {v5, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    .line 125
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v5

    .line 126
    new-instance v7, Landroid/net/Uri$Builder;

    invoke-direct {v7}, Landroid/net/Uri$Builder;-><init>()V

    invoke-virtual {v7, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v6

    .line 127
    invoke-virtual {v6, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    const-string v6, "file"

    .line 128
    invoke-virtual {v2, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v2

    .line 129
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    .line 241
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x18

    if-ge v6, v7, :cond_7

    .line 242
    new-instance v6, Ll/۬۫;

    invoke-direct {v6, v0, v5}, Ll/۬۫;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    goto :goto_5

    .line 244
    :cond_7
    new-instance v6, Ll/ۤ۫;

    invoke-direct {v6, v0, v5}, Ll/ۤ۫;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    :goto_5
    :try_start_0
    const-string v9, "_id"

    const-string v10, "file_id"

    const-string v11, "font_ttc_index"

    const-string v12, "font_variation_settings"

    const-string v13, "font_weight"

    const-string v14, "font_italic"

    const-string v15, "result_code"

    .line 133
    filled-new-array/range {v9 .. v15}, [Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-virtual/range {p1 .. p1}, Ll/ۨ۫;->ܿ()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    .line 140
    invoke-interface {v6, v5, v0, v7}, Ll/ۗ۫;->֫(Landroid/net/Uri;[Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    if-eqz v8, :cond_d

    .line 143
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_d

    const-string v0, "result_code"

    .line 144
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 146
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v7, "_id"

    .line 147
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    const-string v9, "file_id"

    .line 148
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    const-string v10, "font_ttc_index"

    .line 150
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    const-string v11, "font_weight"

    .line 152
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    const-string v12, "font_italic"

    .line 154
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 156
    :goto_6
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v13

    if-eqz v13, :cond_d

    const/4 v13, -0x1

    if-eq v0, v13, :cond_8

    .line 158
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v14

    move/from16 v20, v14

    goto :goto_7

    :cond_8
    const/4 v14, 0x0

    const/16 v20, 0x0

    :goto_7
    if-eq v10, v13, :cond_9

    .line 161
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v14

    move/from16 v17, v14

    goto :goto_8

    :cond_9
    const/4 v14, 0x0

    const/16 v17, 0x0

    :goto_8
    if-ne v9, v13, :cond_a

    .line 164
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    .line 165
    invoke-static {v5, v13, v14}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v13

    :goto_9
    move-object/from16 v16, v13

    goto :goto_a

    .line 167
    :cond_a
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    .line 168
    invoke-static {v2, v13, v14}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v13

    goto :goto_9

    :goto_a
    const/4 v13, -0x1

    if-eq v11, v13, :cond_b

    .line 171
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v14

    move/from16 v18, v14

    goto :goto_b

    :cond_b
    const/16 v14, 0x190

    const/16 v18, 0x190

    :goto_b
    if-eq v12, v13, :cond_c

    .line 172
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    if-ne v13, v1, :cond_c

    const/4 v13, 0x1

    const/16 v19, 0x1

    goto :goto_c

    :cond_c
    const/4 v13, 0x0

    const/16 v19, 0x0

    .line 303
    :goto_c
    new-instance v13, Ll/ܿۤ;

    move-object v15, v13

    invoke-direct/range {v15 .. v20}, Ll/ܿۤ;-><init>(Landroid/net/Uri;IIZI)V

    .line 174
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :cond_d
    if-eqz v8, :cond_e

    .line 179
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 181
    :cond_e
    invoke-interface {v6}, Ll/ۗ۫;->close()V

    new-array v0, v4, [Ll/ܿۤ;

    .line 183
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ܿۤ;

    .line 400
    new-instance v1, Ll/ᩳۤ;

    invoke-direct {v1, v4, v0}, Ll/ᩳۤ;-><init>(I[Ll/ܿۤ;)V

    return-object v1

    :catchall_0
    move-exception v0

    if-eqz v8, :cond_f

    .line 179
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 181
    :cond_f
    invoke-interface {v6}, Ll/ۗ۫;->close()V

    .line 182
    throw v0

    .line 87
    :cond_10
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    const-string v1, "Found content provider "

    const-string v2, ", but package was not "

    .line 0
    invoke-static {v1, v3, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 89
    invoke-virtual/range {p1 .. p1}, Ll/ۨ۫;->ᩳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_11
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    const-string v1, "No package found for authority: "

    .line 0
    invoke-static {v1, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 82
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
