.class public final Ll/ܰ۠ۖ;
.super Ljava/lang/Object;
.source "75TB"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ll/ܰ۠ۖ;->ۧ:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Ll/ܰ۠ۖ;->ܽ:Ljava/lang/String;

    .line 41
    iput-object p2, p0, Ll/ܰ۠ۖ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    iget-object v1, p0, Ll/ܰ۠ۖ;->ۧ:Ljava/lang/String;

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    iget-object v1, p0, Ll/ܰ۠ۖ;->֫:Ljava/lang/String;

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    iget-object v1, p0, Ll/ܰ۠ۖ;->ܽ:Ljava/lang/String;

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ܰ۠ۖ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ܰ۠ۖ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܰ۠ۖ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
