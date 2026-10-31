.class public final Ll/ᩴᩴۘ;
.super Ll/᩸ᩴۘ;
.source "V8DC"


# instance fields
.field public ۜ:D

.field public ۢ:Z

.field public ܳ:I

.field public final ܽ:Ljava/util/LinkedList;

.field public ܿ:Ll/᩷ᩴۘ;

.field public ᩳ:Ll/᩷ᩴۘ;

.field public ᩷:I

.field public ᩻:Ll/᩷ᩴۘ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Data"

    .line 45
    invoke-direct {p0, v0}, Ll/᩸ᩴۘ;-><init>(Ljava/lang/String;)V

    .line 32
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    const/4 v0, 0x1

    .line 35
    iput v0, p0, Ll/ᩴᩴۘ;->᩷:I

    return-void
.end method

.method public static synthetic ֫(Ll/ᩴᩴۘ;)Ljava/util/LinkedList;
    .locals 0

    .line 31
    iget-object p0, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    return-object p0
.end method


# virtual methods
.method public final ֫(D)D
    .locals 5

    .line 165
    iget-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    if-nez v0, :cond_0

    .line 166
    iget-object v0, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    monitor-enter v0

    .line 167
    :try_start_0
    iget-object v1, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ᩴۘ;

    .line 141
    iput-object v1, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    .line 61
    iget v2, v1, Ll/ۢᩴۘ;->ۙ:I

    .line 168
    iput v2, p0, Ll/ᩴᩴۘ;->ܳ:I

    .line 69
    iget v2, v1, Ll/ۢᩴۘ;->᩶:I

    .line 169
    iput v2, v1, Ll/ۢᩴۘ;->᩸:I

    .line 173
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 225
    :cond_0
    :goto_0
    iget-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    iget-object v0, v0, Ll/᩷ᩴۘ;->ۗ:Ll/ۖ᩹ۢ;

    iget v1, p0, Ll/ᩴᩴۘ;->ܳ:I

    invoke-virtual {v0, v1, p1, p2}, Ll/ۖ᩹ۢ;->֫(ID)D

    move-result-wide p1

    iput-wide p1, p0, Ll/ᩴᩴۘ;->ۜ:D

    .line 235
    iget-object p1, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    iget-object p1, p1, Ll/᩷ᩴۘ;->ۗ:Ll/ۖ᩹ۢ;

    iget p2, p0, Ll/ᩴᩴۘ;->ܳ:I

    invoke-virtual {p1, p2}, Ll/ۖ᩹ۢ;->֫(I)D

    move-result-wide p1

    .line 178
    iget v0, p0, Ll/ᩴᩴۘ;->ܳ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/ᩴᩴۘ;->ܳ:I

    .line 181
    iget-object v2, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    .line 61
    iget v3, v2, Ll/ۢᩴۘ;->ۙ:I

    .line 65
    iget v4, v2, Ll/ۢᩴۘ;->᩹:I

    add-int/2addr v3, v4

    if-lt v0, v3, :cond_3

    .line 183
    iget v0, v2, Ll/ۢᩴۘ;->᩸:I

    if-lez v0, :cond_1

    sub-int/2addr v0, v1

    .line 184
    iput v0, v2, Ll/ۢᩴۘ;->᩸:I

    .line 204
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    :goto_1
    iget-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    .line 61
    iget v2, v0, Ll/ۢᩴۘ;->ۙ:I

    .line 207
    iput v2, p0, Ll/ᩴᩴۘ;->ܳ:I

    .line 208
    iput-object v0, p0, Ll/ᩴᩴۘ;->᩻:Ll/᩷ᩴۘ;

    goto :goto_2

    .line 188
    :cond_1
    iget-object v0, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    iget v2, v0, Ll/ۢᩴۘ;->᩸:I

    if-gez v2, :cond_2

    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    .line 193
    :cond_2
    iget-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    iget-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    iput-object v0, p0, Ll/ᩴᩴۘ;->ܿ:Ll/᩷ᩴۘ;

    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    .line 230
    :cond_3
    :goto_2
    iput-boolean v1, p0, Ll/ᩴᩴۘ;->ۢ:Z

    return-wide p1
.end method

.method public final ֫(Ll/ۖ᩹ۢ;II)Ll/᩷ᩴۘ;
    .locals 2

    .line 122
    invoke-virtual {p1}, Ll/ۖ᩹ۢ;->֫()I

    move-result v0

    iget v1, p0, Ll/ᩴᩴۘ;->᩷:I

    if-ne v0, v1, :cond_0

    .line 127
    new-instance v0, Ll/ۘᩴۘ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۘᩴۘ;-><init>(Ll/ᩴᩴۘ;Ll/ۖ᩹ۢ;II)V

    return-object v0

    .line 123
    :cond_0
    new-instance p2, Ll/֫ᩴۘ;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Tried to queue "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    invoke-virtual {p1}, Ll/ۖ᩹ۢ;->֫()I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " channel data to a "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " channel port."

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 27
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 124
    throw p2
.end method

.method public final ֫(Ll/ۖ᩹ۢ;IILl/᩸֨ۘ;)V
    .locals 0

    .line 290
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩴᩴۘ;->֫(Ll/ۖ᩹ۢ;II)Ll/᩷ᩴۘ;

    move-result-object p1

    const/4 p2, -0x1

    .line 156
    iput p2, p1, Ll/ۢᩴۘ;->᩶:I

    .line 292
    invoke-virtual {p0, p4, p1}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(Ll/᩸֨ۘ;)V
    .locals 1

    .line 430
    new-instance v0, Ll/ۖᩴۘ;

    invoke-direct {v0, p0}, Ll/ۖᩴۘ;-><init>(Ll/ᩴᩴۘ;)V

    .line 431
    invoke-virtual {p0, p1, v0}, Ll/᩸ᩴۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 456
    iget-boolean v0, p0, Ll/ᩴᩴۘ;->ۢ:Z

    return v0
.end method

.method public final ܳ()D
    .locals 2

    .line 212
    iget-wide v0, p0, Ll/ᩴᩴۘ;->ۜ:D

    return-wide v0
.end method

.method public final ܿ()V
    .locals 2

    .line 145
    iget-object v0, p0, Ll/ᩴᩴۘ;->᩻:Ll/᩷ᩴۘ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    iput-object v1, p0, Ll/ᩴᩴۘ;->᩻:Ll/᩷ᩴۘ;

    .line 151
    :cond_0
    iget-object v0, p0, Ll/ᩴᩴۘ;->ܿ:Ll/᩷ᩴۘ;

    if-eqz v0, :cond_1

    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    iput-object v1, p0, Ll/ᩴᩴۘ;->ܿ:Ll/᩷ᩴۘ;

    :cond_1
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 247
    iget-object v0, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    monitor-enter v0

    .line 248
    :try_start_0
    iget-object v1, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    const/4 v1, 0x0

    .line 141
    iput-object v1, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    const/4 v1, 0x0

    .line 250
    iput-boolean v1, p0, Ll/ᩴᩴۘ;->ۢ:Z

    .line 252
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩻()Z
    .locals 1

    .line 161
    iget-object v0, p0, Ll/ᩴᩴۘ;->ᩳ:Ll/᩷ᩴۘ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩴᩴۘ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
