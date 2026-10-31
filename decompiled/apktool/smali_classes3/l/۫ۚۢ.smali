.class public final Ll/۫ۚۢ;
.super Ljava/lang/Object;
.source "J4UC"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 65
    iput-object v0, p0, Ll/۫ۚۢ;->ۧ:[Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    array-length v0, p2

    if-nez v0, :cond_0

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, ""

    aput-object v1, p2, v0

    .line 60
    :cond_0
    iput-object p2, p0, Ll/۫ۚۢ;->ۧ:[Ljava/lang/String;

    .line 61
    iput-object p1, p0, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Result{lines="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۫ۚۢ;->ۧ:[Ljava/lang/String;

    .line 90
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", error=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    const-string v2, "\'}"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 5

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    iget-object v1, p0, Ll/۫ۚۢ;->ۧ:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    .line 98
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p0}, Ll/۫ۚۢ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 101
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_1

    const/16 v1, 0xa

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    :cond_1
    iget-object v1, p0, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 70
    iget-object v0, p0, Ll/۫ۚۢ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
