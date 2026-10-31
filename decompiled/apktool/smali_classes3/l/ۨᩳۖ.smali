.class public final Ll/ۨᩳۖ;
.super Ljava/lang/Object;
.source "JGV"


# static fields
.field public static final ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const-string v0, "java.version"

    .line 29
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    :try_start_0
    const-string v3, "[._]"

    const/4 v4, 0x3

    .line 48
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 49
    aget-object v4, v3, v1

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 50
    array-length v6, v3

    if-le v6, v5, :cond_0

    .line 51
    aget-object v3, v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v4, -0x1

    :cond_0
    :goto_0
    if-ne v4, v2, :cond_2

    .line 62
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v1, v4, :cond_1

    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    .line 65
    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    const/4 v4, -0x1

    :cond_2
    :goto_2
    if-ne v4, v2, :cond_3

    const/4 v4, 0x6

    .line 26
    :cond_3
    sput v4, Ll/ۨᩳۖ;->֫:I

    return-void
.end method

.method public static ֫()Z
    .locals 2

    .line 93
    sget v0, Ll/ۨᩳۖ;->֫:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
