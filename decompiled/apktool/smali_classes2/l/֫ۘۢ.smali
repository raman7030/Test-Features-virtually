.class public Ll/֫ۘۢ;
.super Ll/᩸ۘۢ;
.source "C538"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Ll/᩸ۘۢ;-><init>(Ll/᩶ۘۢ;)V

    .line 10
    iput-object p2, p0, Ll/֫ۘۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v0, p0

    .line 15
    iget-object v1, v0, Ll/֫ۘۢ;->᩶:Ljava/lang/String;

    invoke-static {v1}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    iget-object v3, v0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    if-eqz v2, :cond_0

    const-string v1, "550 Need argument to OPTS\r\n"

    goto/16 :goto_5

    :cond_0
    const-string v2, " "

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 26
    aget-object v4, v1, v2

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4

    const-string v5, "HASH"

    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x2

    const-string v7, "\r\n"

    const/4 v8, 0x1

    if-eqz v5, :cond_5

    .line 31
    array-length v2, v1

    const-string v4, "200 "

    if-ne v2, v8, :cond_1

    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/᩶ۘۢ;->ܿ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_4

    .line 33
    :cond_1
    array-length v2, v1

    if-ne v2, v6, :cond_4

    .line 34
    aget-object v1, v1, v8

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MD5"

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "SHA-1"

    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "SHA-256"

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "SHA-384"

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "SHA-512"

    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "501 Unknown algorithm, current selection not changed\r\n"

    goto/16 :goto_5

    .line 40
    :cond_3
    :goto_0
    invoke-virtual {v3, v1}, Ll/᩶ۘۢ;->֫(Ljava/lang/String;)V

    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_4

    :cond_4
    const-string v1, "550 Malformed OPTS HASH command\r\n"

    goto/16 :goto_5

    .line 50
    :cond_5
    array-length v5, v1

    if-eq v5, v6, :cond_6

    const-string v1, "550 Malformed OPTS command\r\n"

    goto/16 :goto_5

    .line 55
    :cond_6
    aget-object v1, v1, v8

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    const-string v5, "UTF8"

    .line 56
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v2, "ON"

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "UTF-8"

    .line 382
    iput-object v1, v3, Ll/᩶ۘۢ;->۫:Ljava/lang/String;

    :cond_7
    const/4 v1, 0x0

    goto/16 :goto_4

    :cond_8
    const-string v5, "MLST"

    .line 62
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    const-string v4, ";"

    .line 63
    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 65
    array-length v4, v1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    const-string v11, "Perm"

    const-string v12, "Modify"

    const-string v13, "Size"

    const-string v14, "Type"

    if-ge v5, v4, :cond_d

    aget-object v15, v1, v5

    .line 66
    invoke-virtual {v15, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_9

    const/4 v6, 0x1

    goto :goto_2

    .line 68
    :cond_9
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/4 v8, 0x1

    goto :goto_2

    .line 70
    :cond_a
    invoke-virtual {v15, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/4 v9, 0x1

    goto :goto_2

    .line 72
    :cond_b
    invoke-virtual {v15, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/4 v10, 0x1

    :cond_c
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 78
    :cond_d
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v6, :cond_e

    .line 80
    aput-object v14, v1, v2

    const-string v5, "Type;"

    .line 81
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v5, 0x1

    goto :goto_3

    :cond_e
    const/4 v5, 0x0

    :goto_3
    if-eqz v8, :cond_f

    add-int/lit8 v6, v5, 0x1

    .line 84
    aput-object v13, v1, v5

    const-string v5, "Size;"

    .line 85
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v6

    :cond_f
    if-eqz v9, :cond_10

    add-int/lit8 v6, v5, 0x1

    .line 88
    aput-object v12, v1, v5

    const-string v5, "Modify;"

    .line 89
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v6

    :cond_10
    if-eqz v10, :cond_11

    add-int/lit8 v6, v5, 0x1

    .line 92
    aput-object v11, v1, v5

    const-string v5, "Perm;"

    .line 93
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v5, v6

    .line 95
    :cond_11
    new-array v6, v5, [Ljava/lang/String;

    .line 96
    invoke-static {v1, v2, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    invoke-virtual {v3, v6}, Ll/᩶ۘۢ;->֫([Ljava/lang/String;)V

    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "200 MLST OPTS "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_4
    const/4 v2, 0x0

    goto :goto_6

    :cond_12
    const-string v1, "502 Unrecognized option\r\n"

    :goto_5
    const/4 v2, 0x0

    move-object/from16 v16, v2

    move-object v2, v1

    move-object/from16 v1, v16

    :goto_6
    if-eqz v2, :cond_13

    .line 105
    invoke-virtual {v3, v2}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_13
    if-eqz v1, :cond_14

    goto :goto_7

    :cond_14
    const-string v1, "200 OPTS accepted\r\n"

    .line 107
    :goto_7
    invoke-virtual {v3, v1}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
