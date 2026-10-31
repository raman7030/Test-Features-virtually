.class public final Ll/۬ۘܽ;
.super Ljava/util/regex/PatternSyntaxException;
.source "EAZB"


# static fields
.field public static final serialVersionUID:J = -0x35a1f4cf3fc7bfd2L


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 6

    .line 61
    invoke-virtual {p0}, Ljava/util/regex/PatternSyntaxException;->getIndex()I

    move-result v0

    .line 62
    invoke-virtual {p0}, Ljava/util/regex/PatternSyntaxException;->getDescription()Ljava/lang/String;

    move-result-object v1

    .line 63
    invoke-virtual {p0}, Ljava/util/regex/PatternSyntaxException;->getPattern()Ljava/lang/String;

    move-result-object v2

    .line 0
    invoke-static {v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-ltz v0, :cond_0

    const-string v3, " near index "

    .line 67
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    :cond_0
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ltz v0, :cond_3

    if-eqz v2, :cond_3

    .line 72
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 73
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x9

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 v5, 0x20

    :goto_1
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/16 v0, 0x5e

    .line 77
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 86
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "PatternSyntaxException: "

    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "PatternSyntaxException"

    return-object v0
.end method
