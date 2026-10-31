.class public final Ll/֡ܽۘ;
.super Ljava/lang/Object;
.source "Q9DZ"


# instance fields
.field public ֫:Ljava/util/Set;

.field public ۧ:Ll/᩹ۛۖ;

.field public ܳ:Ljava/util/UUID;

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/֡ܽۘ;->᩻:Ljava/lang/String;

    .line 37
    iput p2, p0, Ll/֡ܽۘ;->ᩳ:I

    const/4 p1, 0x0

    .line 38
    iput-boolean p1, p0, Ll/֡ܽۘ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/֡ܽۘ;->֫:Ljava/util/Set;

    return-object v0
.end method

.method public final ֫(Ljava/util/UUID;Ll/᩹ۛۖ;ILjava/util/Set;)V
    .locals 1

    .line 42
    iget-boolean v0, p0, Ll/֡ܽۘ;->ܽ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Ll/֡ܽۘ;->ܽ:Z

    .line 46
    iput-object p1, p0, Ll/֡ܽۘ;->ܳ:Ljava/util/UUID;

    .line 47
    iput-object p2, p0, Ll/֡ܽۘ;->ۧ:Ll/᩹ۛۖ;

    .line 48
    iput p3, p0, Ll/֡ܽۘ;->ܿ:I

    .line 49
    iput-object p4, p0, Ll/֡ܽۘ;->֫:Ljava/util/Set;

    return-void

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Server object \'"

    const-string p3, "\' already initialized"

    .line 0
    iget-object p4, p0, Ll/֡ܽۘ;->᩻:Ljava/lang/String;

    invoke-static {p2, p4, p3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֡ܽۘ;)Z
    .locals 6

    .line 61
    iget-object v0, p1, Ll/֡ܽۘ;->ܳ:Ljava/util/UUID;

    .line 77
    iget-object v1, p0, Ll/֡ܽۘ;->ܳ:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 65
    iget-object v1, p1, Ll/֡ܽۘ;->ۧ:Ll/᩹ۛۖ;

    .line 78
    iget-object v2, p0, Ll/֡ܽۘ;->ۧ:Ll/᩹ۛۖ;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 69
    iget v2, p1, Ll/֡ܽۘ;->ܿ:I

    .line 79
    iget v3, p0, Ll/֡ܽۘ;->ܿ:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 73
    :goto_0
    iget-object p1, p1, Ll/֡ܽۘ;->֫:Ljava/util/Set;

    .line 80
    iget-object v3, p0, Ll/֡ܽۘ;->֫:Ljava/util/Set;

    invoke-interface {p1, v3}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    if-eqz p1, :cond_1

    return v5

    :cond_1
    return v4
.end method

.method public final ۧ()I
    .locals 1

    .line 57
    iget v0, p0, Ll/֡ܽۘ;->ᩳ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 69
    iget v0, p0, Ll/֡ܽۘ;->ܿ:I

    return v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/֡ܽۘ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/UUID;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/֡ܽۘ;->ܳ:Ljava/util/UUID;

    return-object v0
.end method
