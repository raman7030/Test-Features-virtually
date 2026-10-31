.class public final Ll/ܽ᩶ۖ;
.super Ll/۬᩹ۖ;
.source "C5C6"


# instance fields
.field public ۫:Ll/ۧܶۖ;

.field public ۬:Ll/۟۠ۖ;


# direct methods
.method public constructor <init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;Ll/ۧܶۖ;Ll/۟۠ۖ;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2}, Ll/ۚ᩶ۖ;-><init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;)V

    .line 41
    iput-object p3, p0, Ll/ܽ᩶ۖ;->۫:Ll/ۧܶۖ;

    .line 42
    iput-object p4, p0, Ll/ܽ᩶ۖ;->۬:Ll/۟۠ۖ;

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0}, Ll/ܽ᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 5

    .line 47
    new-instance v0, Ll/ܽ᩶ۖ;

    invoke-virtual {p0}, Ll/ۚ᩶ۖ;->ۜ()[Ll/۠᩶ۖ;

    move-result-object v1

    iget-object v2, p0, Ll/ܽ᩶ۖ;->۫:Ll/ۧܶۖ;

    iget-object v3, p0, Ll/ܽ᩶ۖ;->۬:Ll/۟۠ۖ;

    iget-object v4, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ܽ᩶ۖ;-><init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;Ll/ۧܶۖ;Ll/۟۠ۖ;)V

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 4

    .line 52
    new-instance v0, Ll/ܽ᩶ۖ;

    invoke-virtual {p0, p1}, Ll/ۚ᩶ۖ;->ۧ(Ll/֨᩹ۖ;)[Ll/۠᩶ۖ;

    move-result-object p1

    iget-object v1, p0, Ll/ܽ᩶ۖ;->۫:Ll/ۧܶۖ;

    iget-object v2, p0, Ll/ܽ᩶ۖ;->۬:Ll/۟۠ۖ;

    iget-object v3, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    invoke-direct {v0, v3, p1, v1, v2}, Ll/ܽ᩶ۖ;-><init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;Ll/ۧܶۖ;Ll/۟۠ۖ;)V

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 6

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    iget-object v1, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽ᩶ۖ;->۬:Ll/۟۠ۖ;

    invoke-virtual {v1}, Ll/۟۠ۖ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    iget-object v1, p0, Ll/ܽ᩶ۖ;->۫:Ll/ۧܶۖ;

    .line 60
    invoke-virtual {v1}, Ll/ۧܶۖ;->ۧ()[Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x28

    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 64
    :goto_0
    iget-object v5, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    array-length v5, v5

    if-ge v2, v5, :cond_1

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    const/16 v5, 0x2c

    .line 68
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    const-string v5, "("

    .line 70
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v4, 0x1

    aget-object v4, v1, v4

    invoke-static {v4}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    aget-object v4, v4, v2

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    move v4, v5

    goto :goto_0

    :cond_1
    const/16 v1, 0x29

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/ۧܶۖ;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/ܽ᩶ۖ;->۫:Ll/ۧܶۖ;

    return-object v0
.end method
