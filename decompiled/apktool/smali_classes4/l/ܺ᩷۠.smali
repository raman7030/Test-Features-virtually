.class public final Ll/ܺ᩷۠;
.super Ljava/lang/Object;
.source "24FJ"


# instance fields
.field public ֫:Ljava/util/List;

.field public final ۧ:C

.field public final ܽ:Ll/۫֡֨;


# direct methods
.method public constructor <init>(Ll/۫֡֨;)V
    .locals 1

    .line 1914
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1912
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺ᩷۠;->֫:Ljava/util/List;

    .line 1915
    iput-object p1, p0, Ll/ܺ᩷۠;->ܽ:Ll/۫֡֨;

    .line 1916
    iget p1, p1, Ll/۫֡֨;->ۛ:I

    int-to-char p1, p1

    iput-char p1, p0, Ll/ܺ᩷۠;->ۧ:C

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1939
    iget-object v0, p0, Ll/ܺ᩷۠;->֫:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "empty local var"

    return-object v0

    .line 1942
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܺ᩷۠;->ܽ:Ll/۫֡֨;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " in register "

    .line 1943
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-char v1, p0, Ll/ܺ᩷۠;->ۧ:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " \n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1944
    iget-object v1, p0, Ll/ܺ᩷۠;->֫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡ᩷۠;

    const-string v3, " starts at pc="

    .line 1945
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-char v3, v2, Ll/ۡ᩷۠;->ۧ:C

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " length="

    .line 1946
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-char v2, v2, Ll/ۡ᩷۠;->֫:C

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 1947
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1949
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 3

    .line 1979
    iget-object v0, p0, Ll/ܺ᩷۠;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 1982
    :cond_0
    invoke-virtual {p0}, Ll/ܺ᩷۠;->ۧ()Ll/ۡ᩷۠;

    move-result-object v0

    iget-char v0, v0, Ll/ۡ᩷۠;->ۧ:C

    const v2, 0xffff

    if-eq v0, v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method public final ۧ()Ll/ۡ᩷۠;
    .locals 2

    .line 1927
    iget-object v0, p0, Ll/ܺ᩷۠;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ܺ᩷۠;->֫:Ljava/util/List;

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 1927
    check-cast v0, Ll/ۡ᩷۠;

    return-object v0
.end method
