.class public final Ll/᩺ܰᩳ;
.super Ljava/lang/Object;
.source "R6N8"


# instance fields
.field public ֫:Ll/۟ܰᩳ;

.field public ۧ:Z

.field public final ܽ:I

.field public final synthetic ܿ:Ll/ۧ۟ᩳ;

.field public ᩳ:Ll/۟ܰᩳ;


# direct methods
.method public constructor <init>(Ll/ۧ۟ᩳ;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ܰᩳ;->ܿ:Ll/ۧ۟ᩳ;

    .line 18
    invoke-static {p1}, Ll/ۧ۟ᩳ;->ܽ(Ll/ۧ۟ᩳ;)I

    move-result p1

    iput p1, p0, Ll/᩺ܰᩳ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۨܰᩳ;)V
    .locals 3

    .line 23
    iget-boolean v0, p0, Ll/᩺ܰᩳ;->ۧ:Z

    if-nez v0, :cond_3

    .line 25
    iget-object v0, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    if-eqz v0, :cond_1

    iget v1, v0, Ll/۟ܰᩳ;->֡:I

    const/16 v2, 0x400

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v1, v0}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    .line 26
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    if-nez v0, :cond_2

    new-instance v0, Ll/۟ܰᩳ;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ll/۟ܰᩳ;-><init>(I)V

    iput-object v0, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    .line 27
    :cond_2
    iget-object v0, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    invoke-virtual {v0, p1}, Ll/۟ܰᩳ;->֫(Ll/ۨܰᩳ;)V

    return-void

    .line 23
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Line builder is finished"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Z
    .locals 6

    .line 38
    iget-object v0, p0, Ll/᩺ܰᩳ;->ܿ:Ll/ۧ۟ᩳ;

    iget-boolean v1, p0, Ll/᩺ܰᩳ;->ۧ:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, p0, Ll/᩺ܰᩳ;->ۧ:Z

    const/4 v3, 0x0

    .line 41
    :try_start_0
    iget v4, p0, Ll/᩺ܰᩳ;->ܽ:I

    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/ۧ۟ᩳ;)I

    move-result v5

    if-ne v4, v5, :cond_3

    .line 31
    iget-object v4, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    if-nez v4, :cond_1

    goto :goto_0

    .line 32
    :cond_1
    iget-object v5, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v5, v4}, Ll/ۧ۟ᩳ;->ۧ(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object v4

    iput-object v4, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    .line 33
    iput-object v3, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    .line 43
    :goto_0
    iget-object v4, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_2

    .line 49
    iput-object v3, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    iput-object v3, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    return v2

    .line 44
    :cond_2
    :try_start_1
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ۧ(Ll/ۧ۟ᩳ;)Ll/۟ܰᩳ;

    move-result-object v2

    iget-object v4, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    invoke-static {v2, v4}, Ll/ۧ۟ᩳ;->֫(Ll/۟ܰᩳ;Ll/۟ܰᩳ;)Ll/۟ܰᩳ;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۧ۟ᩳ;->֫(Ll/ۧ۟ᩳ;Ll/۟ܰᩳ;)V

    .line 45
    invoke-static {v0}, Ll/ۧ۟ᩳ;->ܽ(Ll/ۧ۟ᩳ;)I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ll/ۧ۟ᩳ;->֫(Ll/ۧ۟ᩳ;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    iput-object v3, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    iput-object v3, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    return v1

    .line 41
    :cond_3
    :try_start_2
    new-instance v0, Ljava/util/ConcurrentModificationException;

    const-string v1, "Line table changed while building"

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    .line 49
    iput-object v3, p0, Ll/᩺ܰᩳ;->ᩳ:Ll/۟ܰᩳ;

    iput-object v3, p0, Ll/᩺ܰᩳ;->֫:Ll/۟ܰᩳ;

    .line 50
    throw v0
.end method
