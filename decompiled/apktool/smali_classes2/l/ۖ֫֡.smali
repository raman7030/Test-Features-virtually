.class public final Ll/ۖ֫֡;
.super Ljava/lang/Object;
.source "E4CH"

# interfaces
.implements Ll/᩺ܰ᩵;


# instance fields
.field public final ֫:Ll/᩵ܰ᩵;


# direct methods
.method public constructor <init>(Ll/᩵ܰ᩵;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ۖ֫֡;->֫:Ll/᩵ܰ᩵;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠֫֡;)Ll/ᩴ۟᩵;
    .locals 16

    .line 48
    invoke-virtual/range {p1 .. p1}, Ll/۠֫֡;->᩻()Ll/ۡ۟᩵;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ll/ۡ۟᩵;->ܳ()Ll/ۢ۟᩵;

    move-result-object v1

    .line 51
    invoke-virtual {v0}, Ll/ۡ۟᩵;->֫()Ll/ۖ۟᩵;

    move-result-object v2

    const-wide/16 v3, -0x1

    const-string v5, "Content-Type"

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    .line 53
    invoke-virtual {v2}, Ll/ۖ۟᩵;->ܽ()Ll/ܰܰ᩵;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 55
    invoke-virtual {v7}, Ll/ܰܰ᩵;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v5, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :cond_0
    invoke-virtual {v2}, Ll/ۖ۟᩵;->֫()J

    move-result-wide v7

    const-string v2, "Transfer-Encoding"

    cmp-long v9, v7, v3

    if-eqz v9, :cond_1

    .line 60
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-virtual {v1, v2}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v7, "chunked"

    .line 63
    invoke-virtual {v1, v2, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v1, v6}, Ll/ۢ۟᩵;->֫(Ljava/lang/String;)V

    :cond_2
    :goto_0
    const-string v2, "Host"

    .line 68
    invoke-virtual {v0, v2}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v7, :cond_3

    .line 69
    invoke-virtual {v0}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v7

    invoke-static {v7, v8}, Ll/᩶۟᩵;->֫(Ll/ۨܰ᩵;Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string v2, "Connection"

    .line 72
    invoke-virtual {v0, v2}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    .line 73
    invoke-virtual {v1, v2, v7}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const-string v2, "Accept-Encoding"

    .line 79
    invoke-virtual {v0, v2}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "gzip"

    if-nez v7, :cond_5

    const-string v7, "Range"

    invoke-virtual {v0, v7}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    .line 81
    invoke-virtual {v1, v2, v9}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    move-object/from16 v7, p0

    .line 84
    iget-object v10, v7, Ll/ۖ֫֡;->֫:Ll/᩵ܰ᩵;

    invoke-interface {v10}, Ll/᩵ܰ᩵;->֫()V

    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 85
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_8

    .line 118
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    :goto_2
    if-ge v8, v13, :cond_7

    if-lez v8, :cond_6

    const-string v14, "; "

    .line 121
    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    :cond_6
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۘܰ᩵;

    .line 124
    invoke-virtual {v14}, Ll/ۘܰ᩵;->֫()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x3d

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ll/ۘܰ᩵;->ۧ()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 126
    :cond_7
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v11, "Cookie"

    .line 86
    invoke-virtual {v1, v11, v8}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    const-string v8, "User-Agent"

    .line 89
    invoke-virtual {v0, v8}, Ll/ۡ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_9

    const-string v11, "okhttp/3.12.13"

    .line 90
    invoke-virtual {v1, v8, v11}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :cond_9
    invoke-virtual {v1}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v1

    move-object/from16 v8, p1

    invoke-virtual {v8, v1}, Ll/۠֫֡;->֫(Ll/ۡ۟᩵;)Ll/ᩴ۟᩵;

    move-result-object v1

    .line 95
    invoke-virtual {v0}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v8

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->᩻()Ll/ۤܰ᩵;

    move-result-object v11

    sget v12, Ll/֨֫֡;->֫:I

    .line 313
    sget-object v12, Ll/᩵ܰ᩵;->֫:Ll/᩵ܰ᩵;

    if-ne v10, v12, :cond_a

    goto :goto_3

    .line 315
    :cond_a
    invoke-static {v8, v11}, Ll/ۘܰ᩵;->֫(Ll/ۨܰ᩵;Ll/ۤܰ᩵;)Ljava/util/List;

    move-result-object v8

    .line 316
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 97
    :goto_3
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->ۘ()Ll/ۘ۟᩵;

    move-result-object v8

    .line 98
    invoke-virtual {v8, v0}, Ll/ۘ۟᩵;->֫(Ll/ۡ۟᩵;)V

    if-eqz v2, :cond_b

    const-string v0, "Content-Encoding"

    .line 101
    invoke-virtual {v1, v0}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 102
    invoke-static {v1}, Ll/֨֫֡;->ۧ(Ll/ᩴ۟᩵;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 103
    new-instance v2, Ll/֫ᩳ֡;

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v9

    invoke-virtual {v9}, Ll/֡۟᩵;->᩻()Ll/ۛܽ֡;

    move-result-object v9

    invoke-direct {v2, v9}, Ll/֫ᩳ֡;-><init>(Ll/֨ᩳ֡;)V

    .line 104
    invoke-virtual {v1}, Ll/ᩴ۟᩵;->᩻()Ll/ۤܰ᩵;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۤܰ᩵;->֫()Ll/۫ܰ᩵;

    move-result-object v9

    .line 105
    invoke-virtual {v9, v0}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 106
    invoke-virtual {v9, v6}, Ll/۫ܰ᩵;->ܽ(Ljava/lang/String;)V

    .line 107
    invoke-virtual {v9}, Ll/۫ܰ᩵;->֫()Ll/ۤܰ᩵;

    move-result-object v0

    .line 108
    invoke-virtual {v8, v0}, Ll/ۘ۟᩵;->֫(Ll/ۤܰ᩵;)V

    .line 109
    invoke-virtual {v1, v5}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 110
    new-instance v1, Ll/ܶ֫֡;

    invoke-static {v2}, Ll/᩻ᩳ֡;->֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;

    move-result-object v2

    invoke-direct {v1, v0, v3, v4, v2}, Ll/ܶ֫֡;-><init>(Ljava/lang/String;JLl/ۛܽ֡;)V

    invoke-virtual {v8, v1}, Ll/ۘ۟᩵;->֫(Ll/֡۟᩵;)V

    .line 113
    :cond_b
    invoke-virtual {v8}, Ll/ۘ۟᩵;->֫()Ll/ᩴ۟᩵;

    move-result-object v0

    return-object v0
.end method
