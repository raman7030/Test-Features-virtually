.class public final Ll/ۖܳۡ;
.super Ljava/lang/Object;
.source "YBJ2"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Z

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖܳۡ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x3c

    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    iget-object v1, p0, Ll/ۖܳۡ;->ܽ:Ljava/lang/String;

    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    iget-object v1, p0, Ll/ۖܳۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x20

    if-gtz v2, :cond_0

    .line 106
    iget-boolean v2, p0, Ll/ۖܳۡ;->ۧ:Z

    if-eqz v2, :cond_1

    .line 142
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    const/4 v2, 0x0

    .line 90
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v2, v4, :cond_4

    .line 145
    invoke-virtual {p0, v2}, Ll/ۖܳۡ;->֫(I)Ll/ۡܳۡ;

    move-result-object v4

    .line 146
    invoke-virtual {v4}, Ll/ۡܳۡ;->֫()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x3d

    .line 147
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    invoke-virtual {v4}, Ll/ۡܳۡ;->ۧ()C

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 149
    invoke-virtual {v4}, Ll/ۡܳۡ;->ܽ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v4}, Ll/ۡܳۡ;->ۧ()C

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    iget-boolean v4, p0, Ll/ۖܳۡ;->ۧ:Z

    if-nez v4, :cond_2

    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v2, v4, :cond_3

    .line 152
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 106
    :cond_4
    iget-boolean v1, p0, Ll/ۖܳۡ;->ۧ:Z

    if-eqz v1, :cond_5

    const/16 v1, 0x2f

    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    const/16 v1, 0x3e

    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 157
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ۖܳۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/ۡܳۡ;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ۖܳۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡܳۡ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Ll/ۖܳۡ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ۖܳۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 133
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 110
    iput-boolean p1, p0, Ll/ۖܳۡ;->ۧ:Z

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۖܳۡ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Ll/ۖܳۡ;->ۧ:Z

    return v0
.end method
