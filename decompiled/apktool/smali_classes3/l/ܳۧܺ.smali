.class public final Ll/ܳۧܺ;
.super Ljava/lang/Object;
.source "NAU5"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/Object;

.field public final ܽ:Ljava/lang/Object;

.field public final ᩳ:Ll/ܳۧܺ;


# direct methods
.method public constructor <init>(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/ܳۧܺ;->ᩳ:Ll/ܳۧܺ;

    .line 12
    iput-object p2, p0, Ll/ܳۧܺ;->ܽ:Ljava/lang/Object;

    .line 13
    iput-object p3, p0, Ll/ܳۧܺ;->ۧ:Ljava/lang/Object;

    .line 14
    iput p4, p0, Ll/ܳۧܺ;->֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 18
    iget-object v0, p0, Ll/ܳۧܺ;->ᩳ:Ll/ܳۧܺ;

    if-nez v0, :cond_0

    const-string v0, "$"

    return-object v0

    .line 21
    :cond_0
    iget-object v1, p0, Ll/ܳۧܺ;->ۧ:Ljava/lang/Object;

    instance-of v2, v1, Ljava/lang/Integer;

    if-eqz v2, :cond_1

    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ܳۧܺ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 24
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/ܳۧܺ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
