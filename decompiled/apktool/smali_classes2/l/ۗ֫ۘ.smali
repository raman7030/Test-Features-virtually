.class public final Ll/ۗ֫ۘ;
.super Ljava/lang/Object;
.source "S9CL"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:[C

.field public final ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[CLjava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/ۗ֫ۘ;->ܽ:Ljava/lang/String;

    .line 27
    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p1

    iput-object p1, p0, Ll/ۗ֫ۘ;->ۧ:[C

    .line 28
    iput-object p3, p0, Ll/ۗ֫ۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AuthenticationContext["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗ֫ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗ֫ۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ۗ֫ۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()[C
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۗ֫ۘ;->ۧ:[C

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/ۗ֫ۘ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 56
    iget-object v0, p0, Ll/ۗ֫ۘ;->ܽ:Ljava/lang/String;

    const-string v1, "Guest"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗ֫ۘ;->ۧ:[C

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۗ֫ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۗ֫ۘ;->ۧ:[C

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
