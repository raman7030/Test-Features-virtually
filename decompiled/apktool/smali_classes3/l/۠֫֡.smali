.class public final Ll/۠֫֡;
.super Ljava/lang/Object;
.source "S4F7"


# instance fields
.field public final ֫:Ll/ܽܰ᩵;

.field public final ۜ:Ljava/util/ArrayList;

.field public final ۡ:Ll/ܺ֫֡;

.field public final ۢ:Ll/ۡ۟᩵;

.field public ۧ:I

.field public final ܳ:Ll/᩵֫֡;

.field public final ܺ:I

.field public final ܽ:I

.field public final ܿ:Ll/᩶ܰ᩵;

.field public final ᩳ:Ll/᩻֫֡;

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ll/ܺ֫֡;Ll/᩵֫֡;Ll/᩻֫֡;ILl/ۡ۟᩵;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;III)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/۠֫֡;->ۜ:Ljava/util/ArrayList;

    .line 54
    iput-object p4, p0, Ll/۠֫֡;->ᩳ:Ll/᩻֫֡;

    .line 55
    iput-object p2, p0, Ll/۠֫֡;->ۡ:Ll/ܺ֫֡;

    .line 56
    iput-object p3, p0, Ll/۠֫֡;->ܳ:Ll/᩵֫֡;

    .line 57
    iput p5, p0, Ll/۠֫֡;->᩻:I

    .line 58
    iput-object p6, p0, Ll/۠֫֡;->ۢ:Ll/ۡ۟᩵;

    .line 59
    iput-object p7, p0, Ll/۠֫֡;->֫:Ll/ܽܰ᩵;

    .line 60
    iput-object p8, p0, Ll/۠֫֡;->ܿ:Ll/᩶ܰ᩵;

    .line 61
    iput p9, p0, Ll/۠֫֡;->ܽ:I

    .line 62
    iput p10, p0, Ll/۠֫֡;->᩷:I

    .line 63
    iput p11, p0, Ll/۠֫֡;->ܺ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܽܰ᩵;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/۠֫֡;->֫:Ll/ܽܰ᩵;

    return-object v0
.end method

.method public final ֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;
    .locals 3

    .line 121
    iget-object v0, p0, Ll/۠֫֡;->ܳ:Ll/᩵֫֡;

    iget-object v1, p0, Ll/۠֫֡;->ᩳ:Ll/᩻֫֡;

    iget-object v2, p0, Ll/۠֫֡;->ۡ:Ll/ܺ֫֡;

    invoke-virtual {p0, p1, v2, v0, v1}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;Ll/ܺ֫֡;Ll/᩵֫֡;Ll/᩻֫֡;)Ll/ᩴ۟᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۡ۟᩵;Ll/ܺ֫֡;Ll/᩵֫֡;Ll/᩻֫֡;)Ll/ᩴ۟᩵;
    .locals 23

    move-object/from16 v0, p0

    .line 126
    iget-object v13, v0, Ll/۠֫֡;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v14, v0, Ll/۠֫֡;->᩻:I

    if-ge v14, v1, :cond_8

    .line 128
    iget v1, v0, Ll/۠֫֡;->ۧ:I

    const/4 v15, 0x1

    add-int/2addr v1, v15

    iput v1, v0, Ll/۠֫֡;->ۧ:I

    .line 131
    iget-object v1, v0, Ll/۠֫֡;->ܳ:Ll/᩵֫֡;

    const-string v12, "network interceptor "

    if-eqz v1, :cond_1

    iget-object v2, v0, Ll/۠֫֡;->ᩳ:Ll/᩻֫֡;

    invoke-virtual/range {p1 .. p1}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩻֫֡;->֫(Ll/ۨܰ᩵;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 132
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v14, v15

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " must retain the same host and port"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    const-string v11, " must call proceed() exactly once"

    if-eqz v1, :cond_3

    .line 137
    iget v1, v0, Ll/۠֫֡;->ۧ:I

    if-gt v1, v15, :cond_2

    goto :goto_1

    .line 138
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v14, v15

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 143
    :cond_3
    :goto_1
    new-instance v10, Ll/۠֫֡;

    add-int/lit8 v9, v14, 0x1

    iget v8, v0, Ll/۠֫֡;->᩷:I

    iget v7, v0, Ll/۠֫֡;->ܺ:I

    iget-object v6, v0, Ll/۠֫֡;->֫:Ll/ܽܰ᩵;

    iget-object v5, v0, Ll/۠֫֡;->ܿ:Ll/᩶ܰ᩵;

    iget v4, v0, Ll/۠֫֡;->ܽ:I

    move-object v1, v10

    move-object v2, v13

    move-object/from16 v3, p2

    move/from16 v16, v4

    move-object/from16 v4, p3

    move-object/from16 v17, v5

    move-object/from16 v5, p4

    move-object/from16 v18, v6

    move v6, v9

    move/from16 v19, v7

    move-object/from16 v7, p1

    move/from16 v20, v8

    move-object/from16 v8, v18

    move v15, v9

    move-object/from16 v9, v17

    move-object v0, v10

    move/from16 v10, v16

    move-object/from16 v21, v11

    move/from16 v11, v20

    move-object/from16 v22, v12

    move/from16 v12, v19

    invoke-direct/range {v1 .. v12}, Ll/۠֫֡;-><init>(Ljava/util/ArrayList;Ll/ܺ֫֡;Ll/᩵֫֡;Ll/᩻֫֡;ILl/ۡ۟᩵;Ll/ܽܰ᩵;Ll/᩶ܰ᩵;III)V

    .line 146
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺ܰ᩵;

    .line 147
    invoke-interface {v1, v0}, Ll/᩺ܰ᩵;->֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;

    move-result-object v2

    if-eqz p3, :cond_5

    .line 150
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v15, v3, :cond_5

    iget v0, v0, Ll/۠֫֡;->ۧ:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_4

    goto :goto_2

    .line 151
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v22

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    const-string v0, "interceptor "

    if-eqz v2, :cond_7

    .line 160
    invoke-virtual {v2}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v3

    if-eqz v3, :cond_6

    return-object v2

    .line 161
    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned a response with no body"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 157
    :cond_7
    new-instance v2, Ljava/lang/NullPointerException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned null"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 126
    :cond_8
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final ۜ()Ll/ܺ֫֡;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/۠֫֡;->ۡ:Ll/ܺ֫֡;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 71
    iget v0, p0, Ll/۠֫֡;->ܽ:I

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 81
    iget v0, p0, Ll/۠֫֡;->᩷:I

    return v0
.end method

.method public final ܽ()Ll/᩻֫֡;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/۠֫֡;->ᩳ:Ll/᩻֫֡;

    return-object v0
.end method

.method public final ܿ()Ll/᩵֫֡;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/۠֫֡;->ܳ:Ll/᩵֫֡;

    return-object v0
.end method

.method public final ᩳ()Ll/᩶ܰ᩵;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/۠֫֡;->ܿ:Ll/᩶ܰ᩵;

    return-object v0
.end method

.method public final ᩷()I
    .locals 1

    .line 91
    iget v0, p0, Ll/۠֫֡;->ܺ:I

    return v0
.end method

.method public final ᩻()Ll/ۡ۟᩵;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/۠֫֡;->ۢ:Ll/ۡ۟᩵;

    return-object v0
.end method
