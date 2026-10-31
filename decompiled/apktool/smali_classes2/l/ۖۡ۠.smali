.class public final Ll/ۖۡ۠;
.super Ljava/lang/Object;
.source "P43R"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/io/Reader;


# direct methods
.method public constructor <init>(Ljava/io/BufferedReader;)V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    iput-object p1, p0, Ll/ۖۡ۠;->ۧ:Ljava/io/Reader;

    .line 123
    invoke-virtual {p1}, Ljava/io/Reader;->read()I

    move-result p1

    iput p1, p0, Ll/ۖۡ۠;->֫:I

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 11

    .line 200
    :goto_0
    iget v0, p0, Ll/ۖۡ۠;->֫:I

    const/16 v1, 0x20

    const/16 v2, 0xc

    const/16 v3, 0x9

    const/16 v4, 0xd

    const/16 v5, 0xa

    const/4 v6, -0x1

    iget-object v7, p0, Ll/ۖۡ۠;->ۧ:Ljava/io/Reader;

    if-eq v0, v6, :cond_2

    if-eq v0, v3, :cond_1

    if-eq v0, v5, :cond_1

    if-eq v0, v2, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v1, :cond_1

    const/16 v8, 0x23

    if-eq v0, v8, :cond_0

    goto :goto_2

    .line 210
    :cond_0
    invoke-virtual {v7}, Ljava/io/Reader;->read()I

    move-result v0

    iput v0, p0, Ll/ۖۡ۠;->֫:I

    .line 211
    :goto_1
    iget v0, p0, Ll/ۖۡ۠;->֫:I

    if-eq v0, v5, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v6, :cond_1

    .line 212
    invoke-virtual {v7}, Ljava/io/Reader;->read()I

    move-result v0

    iput v0, p0, Ll/ۖۡ۠;->֫:I

    goto :goto_1

    .line 220
    :cond_1
    invoke-virtual {v7}, Ljava/io/Reader;->read()I

    move-result v0

    iput v0, p0, Ll/ۖۡ۠;->֫:I

    goto :goto_0

    :cond_2
    :goto_2
    if-ne v0, v6, :cond_3

    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x0

    .line 135
    :cond_4
    :goto_3
    iget v9, p0, Ll/ۖۡ۠;->֫:I

    if-eq v9, v6, :cond_13

    if-eq v9, v3, :cond_11

    if-eq v9, v5, :cond_10

    if-eq v9, v2, :cond_11

    if-eq v9, v4, :cond_10

    if-eq v9, v1, :cond_11

    const/16 v10, 0x22

    if-eq v9, v10, :cond_d

    const/16 v10, 0x27

    if-eq v9, v10, :cond_d

    const/16 v10, 0x5c

    if-eq v9, v10, :cond_5

    int-to-char v9, v9

    .line 190
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_6

    :cond_5
    if-eqz v8, :cond_c

    .line 163
    invoke-virtual {v7}, Ljava/io/Reader;->read()I

    move-result v9

    iput v9, p0, Ll/ۖۡ۠;->֫:I

    if-eq v9, v5, :cond_a

    if-eq v9, v4, :cond_a

    const/16 v10, 0x66

    if-eq v9, v10, :cond_9

    const/16 v10, 0x6e

    if-eq v9, v10, :cond_8

    const/16 v10, 0x72

    if-eq v9, v10, :cond_7

    const/16 v10, 0x74

    if-eq v9, v10, :cond_6

    goto :goto_5

    .line 179
    :cond_6
    iput v3, p0, Ll/ۖۡ۠;->֫:I

    goto :goto_5

    .line 176
    :cond_7
    iput v4, p0, Ll/ۖۡ۠;->֫:I

    goto :goto_5

    .line 173
    :cond_8
    iput v5, p0, Ll/ۖۡ۠;->֫:I

    goto :goto_5

    .line 182
    :cond_9
    iput v2, p0, Ll/ۖۡ۠;->֫:I

    goto :goto_5

    .line 167
    :cond_a
    :goto_4
    iget v9, p0, Ll/ۖۡ۠;->֫:I

    if-eq v9, v1, :cond_b

    if-eq v9, v5, :cond_b

    if-eq v9, v4, :cond_b

    if-eq v9, v3, :cond_b

    if-ne v9, v2, :cond_4

    .line 168
    :cond_b
    invoke-virtual {v7}, Ljava/io/Reader;->read()I

    move-result v9

    iput v9, p0, Ll/ۖۡ۠;->֫:I

    goto :goto_4

    .line 186
    :cond_c
    :goto_5
    iget v9, p0, Ll/ۖۡ۠;->֫:I

    int-to-char v9, v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_d
    if-nez v8, :cond_e

    int-to-char v8, v9

    goto :goto_6

    :cond_e
    if-ne v8, v9, :cond_f

    const/4 v8, 0x0

    goto :goto_6

    :cond_f
    int-to-char v9, v9

    .line 157
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_6

    .line 148
    :cond_10
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_11
    if-nez v8, :cond_12

    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_12
    int-to-char v9, v9

    .line 143
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    :goto_6
    invoke-virtual {v7}, Ljava/io/Reader;->read()I

    move-result v9

    iput v9, p0, Ll/ۖۡ۠;->֫:I

    goto/16 :goto_3

    .line 196
    :cond_13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
