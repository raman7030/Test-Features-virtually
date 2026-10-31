.class public final Ll/ۢ۬ۘ;
.super Ljava/lang/Object;
.source "491A"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ll/ۡ۬ۘ;

.field public final ۙ:I

.field public ᩶:I

.field public final ᩸:Ljava/lang/StringBuilder;

.field public final ᩹:Ll/ۘ۬ۘ;


# direct methods
.method public constructor <init>(Ll/ۡ۬ۘ;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢ۬ۘ;->ۗ:Ll/ۡ۬ۘ;

    .line 45
    new-instance v0, Ll/ۘ۬ۘ;

    invoke-direct {v0}, Ll/ۘ۬ۘ;-><init>()V

    iput-object v0, p0, Ll/ۢ۬ۘ;->᩹:Ll/ۘ۬ۘ;

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۢ۬ۘ;->᩸:Ljava/lang/StringBuilder;

    .line 49
    invoke-static {p1}, Ll/ۡ۬ۘ;->֫(Ll/ۡ۬ۘ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll/ۢ۬ۘ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 11

    const-string v0, ""

    .line 72
    iget-object v1, p0, Ll/ۢ۬ۘ;->᩹:Ll/ۘ۬ۘ;

    invoke-virtual {v1, v0, v0}, Ll/ۘ۬ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Ll/ۢ۬ۘ;->᩸:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 83
    iget v3, p0, Ll/ۢ۬ۘ;->᩶:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v5, v4

    const/4 v6, 0x0

    :goto_0
    iget v7, p0, Ll/ۢ۬ۘ;->ۙ:I

    const/4 v8, 0x1

    if-ge v3, v7, :cond_9

    .line 85
    iget-object v7, p0, Ll/ۢ۬ۘ;->ۗ:Ll/ۡ۬ۘ;

    invoke-static {v7}, Ll/ۡ۬ۘ;->֫(Ll/ۡ۬ۘ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v9, 0x3b

    if-nez v4, :cond_5

    const/16 v8, 0x3a

    if-ne v8, v7, :cond_1

    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-lez v7, :cond_0

    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 100
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_1

    :cond_1
    if-ne v9, v7, :cond_2

    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_1

    .line 109
    :cond_2
    invoke-static {v7}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-lez v7, :cond_8

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    if-eqz v6, :cond_4

    .line 118
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 119
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v6, 0x0

    goto :goto_1

    .line 123
    :cond_4
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    if-nez v5, :cond_8

    .line 130
    invoke-static {v7}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_8

    .line 132
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    if-ne v9, v7, :cond_7

    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 166
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    .line 167
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    add-int/2addr v3, v8

    .line 141
    iput v3, p0, Ll/ۢ۬ۘ;->᩶:I

    .line 142
    invoke-virtual {v1, v4, v5}, Ll/ۘ۬ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 147
    :cond_7
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_8
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_9
    if-eqz v4, :cond_a

    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_a

    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-virtual {v1, v4, v0}, Ll/ۘ۬ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    iput v7, p0, Ll/ۢ۬ۘ;->᩶:I

    .line 162
    :cond_a
    :goto_2
    invoke-virtual {v1}, Ll/ۘ۬ۘ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ll/ۘ۬ۘ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 166
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 167
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    return v8

    :cond_b
    return v2
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 162
    iget-object v0, p0, Ll/ۢ۬ۘ;->᩹:Ll/ۘ۬ۘ;

    invoke-virtual {v0}, Ll/ۘ۬ۘ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۘ۬ۘ;->ۧ()Ljava/lang/String;

    move-result-object v2

    .line 166
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 167
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 64
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
