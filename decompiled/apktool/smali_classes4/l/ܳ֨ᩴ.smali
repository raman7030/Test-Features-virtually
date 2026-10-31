.class public final Ll/ܳ֨ᩴ;
.super Ll/۟֨ᩴ;
.source "N673"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ll/ۢ֨ᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ֨ᩴ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ll/۟֨ᩴ;-><init>()V

    .line 50
    iput-object p1, p0, Ll/ܳ֨ᩴ;->c:Ll/ۢ֨ᩴ;

    .line 51
    iput-object p2, p0, Ll/ܳ֨ᩴ;->a:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Ll/ܳ֨ᩴ;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 62
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getFileStores()Ljava/lang/Iterable;
    .locals 2

    .line 97
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 4

    .line 108
    array-length v0, p2

    if-nez v0, :cond_0

    goto :goto_1

    .line 111
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    array-length p1, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_3

    aget-object v2, p2, v1

    .line 114
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    const/16 v3, 0x2f

    .line 116
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 121
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 123
    :goto_1
    new-instance p2, Ll/ܺ֨ᩴ;

    iget-object v0, p0, Ll/ܳ֨ᩴ;->a:Ljava/lang/String;

    iget-object v1, p0, Ll/ܳ֨ᩴ;->b:Ljava/lang/String;

    invoke-direct {p2, p0, p1, v0, v1}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public final getPathMatcher(Ljava/lang/String;)Ll/ۢ۠ᩴ;
    .locals 16

    move-object/from16 v0, p1

    const/16 v1, 0x3a

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_22

    .line 129
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v1, v3, :cond_22

    .line 135
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "glob"

    .line 139
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_20

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "^"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    .line 62
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v3, v5, :cond_1e

    add-int/lit8 v5, v3, 0x1

    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_1c

    const/16 v7, 0x2c

    if-eq v6, v7, :cond_1a

    const/16 v7, 0x2f

    if-eq v6, v7, :cond_19

    const/16 v8, 0x3f

    if-eq v6, v8, :cond_18

    const/16 v8, 0x7b

    if-eq v6, v8, :cond_16

    const/16 v8, 0x7d

    if-eq v6, v8, :cond_14

    const/4 v8, -0x1

    const/16 v9, 0x5b

    const/16 v10, 0x5c

    if-eq v6, v9, :cond_5

    const-string v7, ".^$+{[]|()"

    if-eq v6, v10, :cond_1

    .line 37
    invoke-virtual {v7, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-eq v3, v8, :cond_0

    .line 197
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 199
    :cond_0
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_8

    .line 67
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-eq v5, v6, :cond_4

    add-int/lit8 v3, v3, 0x2

    .line 71
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const-string v6, "\\*?[{"

    .line 41
    invoke-virtual {v6, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v8, :cond_2

    goto :goto_2

    .line 37
    :cond_2
    invoke-virtual {v7, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-eq v6, v8, :cond_3

    .line 73
    :goto_2
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    :cond_3
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 68
    :cond_4
    new-instance v1, Ljava/util/regex/PatternSyntaxException;

    const-string v2, "No character to escape"

    invoke-direct {v1, v2, v0, v3}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    :cond_5
    const-string v11, "[[^/]&&["

    .line 89
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    invoke-static {v0, v5}, Ll/᩺ۚᩴ;->S(Ljava/lang/String;I)C

    move-result v11

    const/16 v12, 0x5e

    const/16 v13, 0x2d

    if-ne v11, v12, :cond_6

    const-string v5, "\\^"

    .line 93
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x2

    goto :goto_3

    .line 97
    :cond_6
    invoke-static {v0, v5}, Ll/᩺ۚᩴ;->S(Ljava/lang/String;I)C

    move-result v11

    const/16 v14, 0x21

    if-ne v11, v14, :cond_7

    .line 98
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v3, 0x2

    .line 102
    :cond_7
    invoke-static {v0, v5}, Ll/᩺ۚᩴ;->S(Ljava/lang/String;I)C

    move-result v3

    if-ne v3, v13, :cond_8

    .line 103
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v5, 0x1

    goto :goto_3

    :cond_8
    move v3, v5

    :goto_3
    const/4 v5, 0x0

    const/4 v11, 0x0

    .line 109
    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v12

    const/16 v14, 0x5d

    if-ge v3, v12, :cond_11

    add-int/lit8 v6, v3, 0x1

    .line 110
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-ne v12, v14, :cond_9

    move v3, v6

    move v6, v12

    goto :goto_6

    :cond_9
    if-eq v12, v7, :cond_10

    if-eq v12, v10, :cond_a

    if-eq v12, v9, :cond_a

    const/16 v7, 0x26

    if-ne v12, v7, :cond_b

    .line 120
    invoke-static {v0, v6}, Ll/᩺ۚᩴ;->S(Ljava/lang/String;I)C

    move-result v15

    if-ne v15, v7, :cond_b

    .line 122
    :cond_a
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    :cond_b
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ne v12, v13, :cond_f

    const-string v7, "Invalid range"

    if-eqz v5, :cond_e

    add-int/lit8 v5, v3, 0x2

    .line 131
    invoke-static {v0, v6}, Ll/᩺ۚᩴ;->S(Ljava/lang/String;I)C

    move-result v6

    if-eqz v6, :cond_12

    if-ne v6, v14, :cond_c

    goto :goto_7

    :cond_c
    if-lt v6, v11, :cond_d

    .line 138
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    move v3, v5

    const/4 v5, 0x0

    goto :goto_5

    .line 135
    :cond_d
    new-instance v1, Ljava/util/regex/PatternSyntaxException;

    add-int/2addr v3, v8

    invoke-direct {v1, v7, v0, v3}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    .line 128
    :cond_e
    new-instance v1, Ljava/util/regex/PatternSyntaxException;

    invoke-direct {v1, v7, v0, v3}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    :cond_f
    const/4 v3, 0x1

    move v3, v6

    move v6, v12

    move v11, v6

    const/4 v5, 0x1

    :goto_5
    const/16 v7, 0x2f

    goto :goto_4

    .line 115
    :cond_10
    new-instance v1, Ljava/util/regex/PatternSyntaxException;

    const-string v2, "Explicit \'name separator\' in class"

    invoke-direct {v1, v2, v0, v3}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    :cond_11
    :goto_6
    move v5, v3

    :cond_12
    :goto_7
    if-ne v6, v14, :cond_13

    const-string v3, "]]"

    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 146
    :cond_13
    new-instance v1, Ljava/util/regex/PatternSyntaxException;

    const-string v2, "Missing \']"

    add-int/lit8 v5, v5, -0x1

    invoke-direct {v1, v2, v0, v5}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    :cond_14
    if-eqz v4, :cond_15

    const-string v3, "))"

    .line 160
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    move v3, v5

    goto/16 :goto_0

    .line 163
    :cond_15
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_16
    if-nez v4, :cond_17

    const-string v3, "(?:(?:"

    .line 155
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    move v3, v5

    const/4 v4, 0x1

    goto/16 :goto_1

    .line 152
    :cond_17
    new-instance v1, Ljava/util/regex/PatternSyntaxException;

    const-string v2, "Cannot nest groups"

    invoke-direct {v1, v2, v0, v3}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    :cond_18
    const-string v3, "[^/]"

    .line 191
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 81
    :cond_19
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_1a
    if-eqz v4, :cond_1b

    const-string v3, ")|(?:"

    .line 168
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 170
    :cond_1b
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 174
    :cond_1c
    invoke-static {v0, v5}, Ll/᩺ۚᩴ;->S(Ljava/lang/String;I)C

    move-result v6

    if-ne v6, v7, :cond_1d

    const-string v5, ".*"

    .line 176
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x2

    goto/16 :goto_1

    :cond_1d
    const-string v3, "[^/]*"

    .line 183
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_8
    move v3, v5

    goto/16 :goto_1

    :cond_1e
    if-nez v4, :cond_1f

    const/16 v0, 0x24

    .line 207
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    .line 204
    :cond_1f
    new-instance v1, Ljava/util/regex/PatternSyntaxException;

    const-string v2, "Missing \'}"

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v1, v2, v0, v3}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    throw v1

    :cond_20
    const-string v1, "regex"

    .line 142
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_21

    .line 150
    :goto_9
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 152
    new-instance v1, Ll/ܿ֨ᩴ;

    invoke-direct {v1, v2, v0}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    return-object v1

    .line 145
    :cond_21
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Syntax \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' not recognized"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    const/4 v3, 0x1

    .line 130
    new-instance v4, Ljava/lang/IllegalArgumentException;

    .line 133
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v2

    aput-object v0, v5, v3

    const-string v0, "Requested <syntax>:<pattern> spliterator(\':\') position(%d) is out of bound in %s"

    .line 131
    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method public final getRootDirectories()Ljava/lang/Iterable;
    .locals 4

    .line 90
    new-instance v0, Ll/ܺ֨ᩴ;

    iget-object v1, p0, Ll/ܳ֨ᩴ;->a:Ljava/lang/String;

    iget-object v2, p0, Ll/ܳ֨ᩴ;->b:Ljava/lang/String;

    const-string v3, "/"

    invoke-direct {v0, p0, v3, v1, v2}, Ll/ܺ֨ᩴ;-><init>(Ll/۟֨ᩴ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 0
    invoke-static {v1}, Ll/᩺ۚᩴ;->B([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getSeparator()Ljava/lang/String;
    .locals 1

    const-string v0, "/"

    return-object v0
.end method

.method public final getUserPrincipalLookupService()Ll/۫۠ᩴ;
    .locals 1

    .line 158
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final isOpen()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final isReadOnly()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final newWatchService()Ll/ۚ۠ᩴ;
    .locals 1

    .line 164
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final provider()Ll/۬᩸ᩴ;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܳ֨ᩴ;->c:Ll/ۢ֨ᩴ;

    return-object v0
.end method

.method public final supportedFileAttributeViews()Ljava/util/Set;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "basic"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 0
    invoke-static {v0}, Ll/᩺ۚᩴ;->D([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
