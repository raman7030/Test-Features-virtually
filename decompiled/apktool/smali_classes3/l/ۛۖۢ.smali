.class public Ll/ۛۖۢ;
.super Ll/֨ۖۢ;
.source "QALX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶ۘۢ;Ljava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2}, Ll/֨ۖۢ;-><init>(Ll/᩶ۘۢ;Ljava/lang/String;)V

    .line 10
    iput-object p2, p0, Ll/ۛۖۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 18
    iget-object v0, p0, Ll/ۛۖۢ;->᩶:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۘۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    if-eqz v1, :cond_0

    .line 21
    invoke-virtual {v2}, Ll/᩶ۘۢ;->ۢ()Ll/ܶ᩵ܿ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v1, "*"

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "550 MLSD does not support wildcards\r\n"

    goto :goto_1

    .line 27
    :cond_1
    invoke-static {v2, v0}, Ll/᩸ۘۢ;->ۧ(Ll/᩶ۘۢ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Ll/᩸ۘۢ;->֫(Ll/ܶ᩵ܿ;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "450 MLSD target violates chroot\r\n"

    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v0, "501 Not a directory\r\n"

    goto :goto_1

    .line 37
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    invoke-virtual {p0, v0, v1}, Ll/֨ۖۢ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 45
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۢ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_5

    .line 49
    invoke-virtual {v2, v0}, Ll/᩶ۘۢ;->ܽ(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public final ۧ(Ll/ܶ᩵ܿ;)Ljava/lang/String;
    .locals 8

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 68
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "*"

    .line 70
    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    .line 73
    :cond_1
    iget-object v2, p0, Ll/᩸ۘۢ;->᩸:Ll/᩶ۘۢ;

    invoke-virtual {v2}, Ll/᩶ۘۢ;->ᩳ()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    .line 75
    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_b

    aget-object v5, v2, v4

    const-string v6, "size"

    .line 76
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    const/16 v7, 0x3b

    if-eqz v6, :cond_2

    const-string v5, "Size="

    .line 77
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_3

    :cond_2
    const-string v6, "modify"

    .line 78
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 79
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll/ۗۘۢ;->֫(J)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Modify="

    .line 80
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_3
    const-string v6, "type"

    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 82
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v5, "Type=file;"

    .line 83
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 84
    :cond_4
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v5, "Type=dir;"

    .line 85
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    const-string v6, "perm"

    .line 87
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v5, "Perm="

    .line 88
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ᩴ()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 90
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x72

    .line 91
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 92
    :cond_6
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v5

    if-eqz v5, :cond_7

    const-string v5, "el"

    .line 93
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    :cond_7
    :goto_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 97
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v5, "adfw"

    .line 98
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 99
    :cond_8
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v5

    if-eqz v5, :cond_9

    const-string v5, "fpcm"

    .line 100
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    :cond_9
    :goto_2
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_a
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_b
    const/16 p1, 0x20

    .line 107
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\r\n"

    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_4
    return-object v2
.end method
