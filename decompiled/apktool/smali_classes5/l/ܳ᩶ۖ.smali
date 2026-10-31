.class public final Ll/ܳ᩶ۖ;
.super Ll/ۚ᩶ۖ;
.source "157Y"


# instance fields
.field public ۫:I

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I[Ll/۠᩶ۖ;)V
    .locals 1

    .line 45
    sget-object v0, Ll/֨᩶ۖ;->ۤ֫:Ll/֨᩶ۖ;

    invoke-direct {p0, v0, p3}, Ll/ۚ᩶ۖ;-><init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;)V

    .line 46
    iput-object p1, p0, Ll/ܳ᩶ۖ;->۬:Ljava/lang/String;

    .line 47
    iput p2, p0, Ll/ܳ᩶ۖ;->۫:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/ܳ᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 4

    .line 58
    new-instance v0, Ll/ܳ᩶ۖ;

    iget v1, p0, Ll/ܳ᩶ۖ;->۫:I

    invoke-virtual {p0}, Ll/ۚ᩶ۖ;->ۜ()[Ll/۠᩶ۖ;

    move-result-object v2

    iget-object v3, p0, Ll/ܳ᩶ۖ;->۬:Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Ll/ܳ᩶ۖ;-><init>(Ljava/lang/String;I[Ll/۠᩶ۖ;)V

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 3

    .line 63
    new-instance v0, Ll/ܳ᩶ۖ;

    iget v1, p0, Ll/ܳ᩶ۖ;->۫:I

    invoke-virtual {p0, p1}, Ll/ۚ᩶ۖ;->ۧ(Ll/֨᩹ۖ;)[Ll/۠᩶ۖ;

    move-result-object p1

    iget-object v2, p0, Ll/ܳ᩶ۖ;->۬:Ljava/lang/String;

    invoke-direct {v0, v2, v1, p1}, Ll/ܳ᩶ۖ;-><init>(Ljava/lang/String;I[Ll/۠᩶ۖ;)V

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 6

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "new "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    iget-object v1, p0, Ll/ܳ᩶ۖ;->۬:Ljava/lang/String;

    invoke-static {v1}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    iget-object v1, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    const/16 v5, 0x5b

    .line 71
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x5d

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 73
    :cond_0
    iget-object v1, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    array-length v1, v1

    :goto_1
    iget v2, p0, Ll/ܳ᩶ۖ;->۫:I

    if-ge v1, v2, :cond_1

    const-string v2, "[]"

    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 76
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
