.class public final Ll/᩹᩵ܿ;
.super Ljava/io/IOException;
.source "W6WY"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ll/᩸᩵ܿ;

.field public final ᩸:Ll/۬᩵ܿ;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 41
    iput-object p1, p0, Ll/᩹᩵ܿ;->᩸:Ll/۬᩵ܿ;

    .line 42
    iput-object p2, p0, Ll/᩹᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    .line 43
    iput-object p3, p0, Ll/᩹᩵ܿ;->᩹:Ljava/lang/String;

    .line 44
    iput-object p4, p0, Ll/᩹᩵ܿ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 54
    invoke-direct {p0, p5, p6}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    iput-object p1, p0, Ll/᩹᩵ܿ;->᩸:Ll/۬᩵ܿ;

    .line 56
    iput-object p2, p0, Ll/᩹᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    .line 57
    iput-object p3, p0, Ll/᩹᩵ܿ;->᩹:Ljava/lang/String;

    .line 58
    iput-object p4, p0, Ll/᩹᩵ܿ;->ۙ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, " failed for "

    const-string v1, "Checked file operation "

    if-nez p2, :cond_0

    .line 184
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 186
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " -> "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Landroid/system/ErrnoException;)Ll/᩹᩵ܿ;
    .locals 8

    .line 89
    new-instance v7, Ll/᩹᩵ܿ;

    iget v0, p3, Landroid/system/ErrnoException;->errno:I

    .line 153
    sget v1, Landroid/system/OsConstants;->ENOENT:I

    if-ne v0, v1, :cond_0

    .line 154
    sget-object v0, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    :goto_0
    move-object v2, v0

    goto :goto_3

    .line 156
    :cond_0
    sget v1, Landroid/system/OsConstants;->EEXIST:I

    if-ne v0, v1, :cond_1

    .line 157
    sget-object v0, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 159
    :cond_1
    sget v1, Landroid/system/OsConstants;->ENOTDIR:I

    if-ne v0, v1, :cond_2

    .line 160
    sget-object v0, Ll/᩸᩵ܿ;->۬:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 162
    :cond_2
    sget v1, Landroid/system/OsConstants;->EISDIR:I

    if-ne v0, v1, :cond_3

    .line 163
    sget-object v0, Ll/᩸᩵ܿ;->ۤ:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 165
    :cond_3
    sget v1, Landroid/system/OsConstants;->ENOTEMPTY:I

    if-ne v0, v1, :cond_4

    .line 166
    sget-object v0, Ll/᩸᩵ܿ;->ۙ:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 168
    :cond_4
    sget v1, Landroid/system/OsConstants;->EACCES:I

    if-eq v0, v1, :cond_9

    sget v1, Landroid/system/OsConstants;->EPERM:I

    if-eq v0, v1, :cond_9

    sget v1, Landroid/system/OsConstants;->EROFS:I

    if-ne v0, v1, :cond_5

    goto :goto_2

    .line 171
    :cond_5
    sget v1, Landroid/system/OsConstants;->EXDEV:I

    if-ne v0, v1, :cond_6

    .line 172
    sget-object v0, Ll/᩸᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 174
    :cond_6
    sget v1, Landroid/system/OsConstants;->ENOSYS:I

    if-eq v0, v1, :cond_8

    sget v1, Landroid/system/OsConstants;->ENOTSUP:I

    if-eq v0, v1, :cond_8

    sget v1, Landroid/system/OsConstants;->EOPNOTSUPP:I

    if-ne v0, v1, :cond_7

    goto :goto_1

    .line 178
    :cond_7
    sget-object v0, Ll/᩸᩵ܿ;->ۗ:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 176
    :cond_8
    :goto_1
    sget-object v0, Ll/᩸᩵ܿ;->ۨ:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 169
    :cond_9
    :goto_2
    sget-object v0, Ll/᩸᩵ܿ;->ۛ:Ll/᩸᩵ܿ;

    goto :goto_0

    .line 90
    :goto_3
    invoke-static {p0, p1, p2}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v0, v7

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Ll/᩹᩵ܿ;-><init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v7
.end method

.method public static ֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/io/IOException;)Ll/᩹᩵ܿ;
    .locals 8

    move-object v0, p3

    :goto_0
    if-eqz v0, :cond_1

    .line 102
    instance-of v1, v0, Landroid/system/ErrnoException;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/system/ErrnoException;

    .line 103
    invoke-static {p0, p1, p2, v0}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;Landroid/system/ErrnoException;)Ll/᩹᩵ܿ;

    move-result-object p0

    return-object p0

    .line 105
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    .line 107
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, ""

    goto :goto_1

    .line 108
    :cond_2
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v1, "no such file"

    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_10

    const-string v1, "not found"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v1, "file exists"

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "already exists"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v1, "not a directory"

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 115
    sget-object v0, Ll/᩸᩵ܿ;->۬:Ll/᩸᩵ܿ;

    goto/16 :goto_8

    :cond_5
    const-string v1, "is a directory"

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    const-string v1, "not a regular file"

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    const-string v1, "directory not empty"

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 120
    sget-object v0, Ll/᩸᩵ܿ;->ۙ:Ll/᩸᩵ܿ;

    goto :goto_8

    :cond_7
    const-string v1, "permission denied"

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "operation not permitted"

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_d

    const-string v1, "read-only file system"

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    const-string v1, "cross-device"

    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "cross device"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_3

    :cond_9
    const-string v1, "unsupported"

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    const-string v1, "not supported"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_2

    .line 130
    :cond_a
    sget-object v0, Ll/᩸᩵ܿ;->ۗ:Ll/᩸᩵ܿ;

    goto :goto_8

    .line 128
    :cond_b
    :goto_2
    sget-object v0, Ll/᩸᩵ܿ;->ۨ:Ll/᩸᩵ܿ;

    goto :goto_8

    .line 126
    :cond_c
    :goto_3
    sget-object v0, Ll/᩸᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    goto :goto_8

    .line 124
    :cond_d
    :goto_4
    sget-object v0, Ll/᩸᩵ܿ;->ۛ:Ll/᩸᩵ܿ;

    goto :goto_8

    .line 118
    :cond_e
    :goto_5
    sget-object v0, Ll/᩸᩵ܿ;->ۤ:Ll/᩸᩵ܿ;

    goto :goto_8

    .line 113
    :cond_f
    :goto_6
    sget-object v0, Ll/᩸᩵ܿ;->᩹:Ll/᩸᩵ܿ;

    goto :goto_8

    .line 111
    :cond_10
    :goto_7
    sget-object v0, Ll/᩸᩵ܿ;->۫:Ll/᩸᩵ܿ;

    :goto_8
    move-object v3, v0

    .line 132
    new-instance v0, Ll/᩹᩵ܿ;

    .line 133
    invoke-static {p0, p1, p2}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v1 .. v7}, Ll/᩹᩵ܿ;-><init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static ֫(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;
    .locals 7

    .line 148
    new-instance v6, Ll/᩹᩵ܿ;

    .line 149
    invoke-static {p0, p2, p3}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩹᩵ܿ;-><init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public static ۧ(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ll/᩹᩵ܿ;
    .locals 7

    .line 139
    new-instance v6, Ll/᩹᩵ܿ;

    sget-object v2, Ll/᩸᩵ܿ;->ۨ:Ll/᩸᩵ܿ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    invoke-static {p0, p1, p2}, Ll/᩹᩵ܿ;->֫(Ll/۬᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, " is unsupported"

    .line 0
    invoke-static {v0, v1, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v0, v6

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    .line 140
    invoke-direct/range {v0 .. v5}, Ll/᩹᩵ܿ;-><init>(Ll/۬᩵ܿ;Ll/᩸᩵ܿ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public final ֫()Ll/۬᩵ܿ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩹᩵ܿ;->᩸:Ll/۬᩵ܿ;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩹᩵ܿ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ll/᩸᩵ܿ;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/᩹᩵ܿ;->᩶:Ll/᩸᩵ܿ;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩹᩵ܿ;->ۙ:Ljava/lang/String;

    return-object v0
.end method
