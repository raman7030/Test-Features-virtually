.class public Ll/֡ܽܽ;
.super Ljava/lang/Object;
.source "CAOF"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ܽܽ;->֫:Ljava/util/ArrayList;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ܽܽ;->ۧ:Ljava/util/ArrayList;

    .line 17
    iput-object p1, p0, Ll/֡ܽܽ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 5

    const/4 v0, 0x0

    .line 48
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_b

    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x9

    const/16 v3, 0x3b

    const-string v4, "&#"

    if-eq v1, v2, :cond_9

    const/16 v2, 0xa

    if-eq v1, v2, :cond_9

    const/16 v2, 0xd

    if-eq v1, v2, :cond_8

    const/16 v2, 0x22

    if-eq v1, v2, :cond_5

    const/16 v3, 0x3c

    if-eq v1, v3, :cond_4

    const/16 v3, 0x3e

    if-eq v1, v3, :cond_3

    const/16 v3, 0x26

    if-eq v1, v3, :cond_2

    const/16 v3, 0x27

    if-eq v1, v3, :cond_5

    const/16 v2, 0x20

    if-lt v1, v2, :cond_0

    const/16 v2, 0x7f

    if-ge v1, v2, :cond_0

    .line 80
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 81
    :cond_0
    invoke-static {v1}, Ll/ۧۘܽ;->֫(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 82
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 84
    :cond_1
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const-string v1, "&amp;"

    .line 62
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    const-string v1, "&gt;"

    .line 65
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    const-string v1, "&lt;"

    .line 68
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    if-ne v1, p0, :cond_7

    if-ne v1, v2, :cond_6

    const-string v1, "&quot;"

    goto :goto_1

    :cond_6
    const-string v1, "&apos;"

    .line 73
    :goto_1
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 75
    :cond_7
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 52
    :cond_8
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_9
    const/4 v2, -0x1

    if-ne p0, v2, :cond_a

    .line 57
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 59
    :cond_a
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    const/4 v0, -0x1

    .line 0
    invoke-static {v0, p1, p0}, Ll/֡ܽܽ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    .line 95
    invoke-virtual {p0, v0, v1}, Ll/֡ܽܽ;->֫(Ljava/lang/StringBuilder;I)V

    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/16 p1, 0x27

    .line 24
    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    invoke-static {p1, p2, v0}, Ll/֡ܽܽ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    iget-object p1, p0, Ll/֡ܽܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ֫(Ljava/lang/StringBuilder;I)V
    .locals 13

    const/16 v0, 0x3e

    const-string v1, "</"

    const-string v2, ">"

    const-string v3, " />"

    const/16 v4, 0x20

    const/16 v5, 0x3c

    .line 100
    iget-object v6, p0, Ll/֡ܽܽ;->֫:Ljava/util/ArrayList;

    iget-object v7, p0, Ll/֡ܽܽ;->ܽ:Ljava/lang/String;

    iget-object v8, p0, Ll/֡ܽܽ;->ۧ:Ljava/util/ArrayList;

    const/4 v9, -0x1

    if-ne p2, v9, :cond_3

    .line 101
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 103
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 106
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 108
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܽܽ;

    .line 110
    invoke-virtual {v2, p1, v9}, Ll/֡ܽܽ;->֫(Ljava/lang/StringBuilder;I)V

    goto :goto_1

    .line 112
    :cond_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_3
    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_2
    if-ge v10, p2, :cond_4

    .line 149
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 116
    :cond_4
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x1

    const/16 v12, 0xa

    if-ne v10, v11, :cond_5

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v10, p2

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    add-int/2addr v11, v10

    if-ge v11, v5, :cond_5

    .line 118
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 120
    :cond_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 121
    invoke-virtual {p1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v10, p2, 0x4

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_6

    .line 149
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 123
    :cond_6
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 126
    :cond_7
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 127
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 129
    :cond_8
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܽܽ;

    .line 40
    instance-of v3, v3, Ll/᩵ܽܽ;

    if-eqz v3, :cond_9

    .line 131
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܽܽ;

    .line 132
    invoke-virtual {v0, p1, v9}, Ll/֡ܽܽ;->֫(Ljava/lang/StringBuilder;I)V

    goto :goto_6

    .line 135
    :cond_a
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܽܽ;

    .line 136
    invoke-virtual {p1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, p2, 0x4

    .line 137
    invoke-virtual {v3, p1, v5}, Ll/֡ܽܽ;->֫(Ljava/lang/StringBuilder;I)V

    goto :goto_7

    .line 139
    :cond_b
    invoke-virtual {p1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_8
    if-ge v0, p2, :cond_c

    .line 149
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    .line 142
    :cond_c
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x3e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public ֫(Ll/֡ܽܽ;)V
    .locals 1

    .line 35
    iget-object v0, p0, Ll/֡ܽܽ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
