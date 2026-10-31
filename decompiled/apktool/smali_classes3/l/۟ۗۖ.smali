.class public abstract Ll/۟ۗۖ;
.super Ljava/lang/Object;
.source "95JE"

# interfaces
.implements Ll/֡ۙۖ;
.implements Ll/۠ۙۖ;


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:[Ll/ܰۗۖ;

.field public ܳ:[Ll/ܰۗۖ;

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Ll/ۚ᩹ۖ;


# direct methods
.method public constructor <init>(Ll/ۚ᩹ۖ;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    .line 51
    iput-object p1, p0, Ll/۟ۗۖ;->ᩳ:Ll/ۚ᩹ۖ;

    .line 62
    iget-object p1, p1, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iput p1, p0, Ll/۟ۗۖ;->ܽ:I

    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, Ll/۟ۗۖ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    iget-object v1, p0, Ll/۟ۗۖ;->ᩳ:Ll/ۚ᩹ۖ;

    iget-object v1, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v1}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    .line 177
    iget-object v2, v1, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v2, [Ll/ܰۗۖ;

    if-eqz v2, :cond_2

    .line 179
    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    if-nez v5, :cond_0

    const/16 v5, 0x2e

    .line 181
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 183
    :cond_0
    invoke-interface {v5}, Ll/ܰۗۖ;->֫()C

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    const-string v2, " | "

    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 176
    invoke-virtual {v1}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v1

    goto :goto_0

    .line 190
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 142
    iget v0, p0, Ll/۟ۗۖ;->ܽ:I

    invoke-virtual {p0, v0}, Ll/۟ۗۖ;->֫(I)[Ll/ܰۗۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ll/֫ۙۖ;)Ljava/lang/Object;
    .locals 3

    .line 31
    check-cast p1, [Ll/ܰۗۖ;

    .line 88
    iput-object p1, p0, Ll/۟ۗۖ;->ۧ:[Ll/ܰۗۖ;

    const/4 p1, 0x0

    .line 90
    :try_start_0
    invoke-static {p2, p0, p1}, Ll/ܶۙۖ;->֫(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    iget-object p1, p0, Ll/۟ۗۖ;->ۧ:[Ll/ܰۗۖ;

    const/4 p2, 0x0

    .line 95
    iput-object p2, p0, Ll/۟ۗۖ;->ۧ:[Ll/ܰۗۖ;

    return-object p1

    :catch_0
    move-exception p1

    .line 92
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "fail exe "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Ll/ᩳ᩶ۖ;)Ll/۠᩶ۖ;
    .locals 2

    .line 165
    iget-object v0, p0, Ll/۟ۗۖ;->ۧ:[Ll/ܰۗۖ;

    iget v1, p1, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v0, v0, v1

    .line 166
    invoke-virtual {p0, v0}, Ll/۟ۗۖ;->֫(Ll/ܰۗۖ;)V

    return-object p1
.end method

.method public ֫(Ll/ᩳ᩶ۖ;Ll/۠᩶ۖ;)Ll/ܰۗۖ;
    .locals 0

    .line 160
    invoke-virtual {p0}, Ll/۟ۗۖ;->ܿ()Ll/ܰۗۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩳ᩶ۖ;Ll/᩸᩶ۖ;)Ll/ᩳ᩶ۖ;
    .locals 4

    .line 151
    iget-object v0, p0, Ll/۟ۗۖ;->ۧ:[Ll/ܰۗۖ;

    iget-object v1, p0, Ll/۟ۗۖ;->ܳ:[Ll/ܰۗۖ;

    iget v2, p0, Ll/۟ۗۖ;->ܽ:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 152
    iget-object v0, p0, Ll/۟ۗۖ;->ܳ:[Ll/ܰۗۖ;

    iput-object v0, p0, Ll/۟ۗۖ;->ۧ:[Ll/ܰۗۖ;

    .line 153
    iget-object p2, p2, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    invoke-virtual {p0, p1, p2}, Ll/۟ۗۖ;->֫(Ll/ᩳ᩶ۖ;Ll/۠᩶ۖ;)Ll/ܰۗۖ;

    move-result-object p2

    .line 154
    iget-object v0, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    iget-object v0, p0, Ll/۟ۗۖ;->ۧ:[Ll/ܰۗۖ;

    iget v1, p1, Ll/ᩳ᩶ۖ;->ۗ:I

    aput-object p2, v0, v1

    return-object p1
.end method

.method public abstract ֫(Ll/ܰۗۖ;)V
.end method

.method public abstract ֫(I)[Ll/ܰۗۖ;
.end method

.method public final ۧ()V
    .locals 4

    .line 113
    iget-boolean v0, p0, Ll/۟ۗۖ;->ܿ:Z

    iget-object v1, p0, Ll/۟ۗۖ;->ᩳ:Ll/ۚ᩹ۖ;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, v1, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩶ۖ;

    .line 116
    iput v2, v3, Ll/ᩳ᩶ۖ;->ۗ:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 133
    :cond_0
    invoke-static {v1}, Ll/ܶۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    .line 74
    iget v0, p0, Ll/۟ۗۖ;->ܽ:I

    invoke-virtual {p0, v0}, Ll/۟ۗۖ;->֫(I)[Ll/ܰۗۖ;

    move-result-object v0

    iput-object v0, p0, Ll/۟ۗۖ;->ܳ:[Ll/ܰۗۖ;

    .line 75
    iget-object v0, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-static {v0, p0}, Ll/ܶۙۖ;->֫(Ll/ܽۙۖ;Ll/֡ۙۖ;)V

    const/4 v0, 0x0

    .line 76
    iput-object v0, p0, Ll/۟ۗۖ;->ܳ:[Ll/ܰۗۖ;

    .line 70
    invoke-virtual {p0}, Ll/۟ۗۖ;->ܽ()V

    return-void
.end method

.method public abstract ܽ()V
.end method

.method public abstract ܿ()Ll/ܰۗۖ;
.end method

.method public final ᩳ()[Ll/ܰۗۖ;
    .locals 1

    .line 137
    iget v0, p0, Ll/۟ۗۖ;->ܽ:I

    invoke-virtual {p0, v0}, Ll/۟ۗۖ;->֫(I)[Ll/ܰۗۖ;

    move-result-object v0

    return-object v0
.end method
