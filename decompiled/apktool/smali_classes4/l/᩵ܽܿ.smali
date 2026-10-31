.class public Ll/᩵ܽܿ;
.super Ljava/lang/Object;
.source "T7T2"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Ll/᩵ܽܿ;->ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 36
    instance-of v0, p1, Ll/᩵ܽܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩵ܽܿ;

    .line 38
    iget-object v0, p0, Ll/᩵ܽܿ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/᩵ܽܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 43
    iget-object v0, p0, Ll/᩵ܽܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩵ܽܿ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 21
    iget-object v0, p0, Ll/᩵ܽܿ;->֫:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 22
    iget-object v0, p0, Ll/᩵ܽܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/᩵ܽܿ;->֫:Ljava/lang/String;

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v1, v2, :cond_1

    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v1, 0x0

    .line 25
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_0

    .line 26
    aget-char v2, v0, v1

    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    iput-object v1, p0, Ll/᩵ܽܿ;->֫:Ljava/lang/String;

    .line 31
    :cond_1
    iget-object v0, p0, Ll/᩵ܽܿ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Ll/᩵ܽܿ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
