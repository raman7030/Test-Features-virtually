.class public final Ll/۠ܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ll/ۙܶۘ;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I

.field public ܽ:I

.field public ܿ:Ljava/lang/String;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/net/HttpURLConnection;Ljava/lang/String;IIILjava/lang/String;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p2, p0, Ll/۠ܶۘ;->֫:Ljava/lang/String;

    .line 32
    iput p3, p0, Ll/۠ܶۘ;->ۧ:I

    .line 33
    iput p4, p0, Ll/۠ܶۘ;->ܽ:I

    .line 34
    iput p5, p0, Ll/۠ܶۘ;->ᩳ:I

    .line 35
    iput-object p6, p0, Ll/۠ܶۘ;->ܿ:Ljava/lang/String;

    .line 36
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 38
    invoke-virtual {p1}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 40
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/۠ܶۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 56
    iget v0, p0, Ll/۠ܶۘ;->ۧ:I

    return v0
.end method

.method public final c()I
    .locals 1

    .line 61
    iget v0, p0, Ll/۠ܶۘ;->ܽ:I

    return v0
.end method

.method public final d()I
    .locals 1

    .line 66
    iget v0, p0, Ll/۠ܶۘ;->ᩳ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "c@"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\ncontent = ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    iget-object v1, p0, Ll/۠ܶۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]\nresponseSize = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    iget v1, p0, Ll/۠ܶۘ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nrequestSize = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    iget v1, p0, Ll/۠ܶۘ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nresultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    iget v1, p0, Ll/۠ܶۘ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\nerrorMsg = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    iget-object v1, p0, Ll/۠ܶۘ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
