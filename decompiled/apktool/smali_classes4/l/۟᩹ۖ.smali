.class public final Ll/۟᩹ۖ;
.super Ll/ۚ᩶ۖ;
.source "F5E7"


# instance fields
.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>([Ll/۠᩶ۖ;Ljava/lang/String;)V
    .locals 1

    .line 36
    sget-object v0, Ll/֨᩶ۖ;->ܳ֫:Ll/֨᩶ۖ;

    invoke-direct {p0, v0, p1}, Ll/ۚ᩶ۖ;-><init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;)V

    .line 37
    iput-object p2, p0, Ll/۟᩹ۖ;->۬:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 27
    invoke-virtual {p0}, Ll/۟᩹ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 3

    .line 42
    new-instance v0, Ll/۟᩹ۖ;

    invoke-virtual {p0}, Ll/ۚ᩶ۖ;->ۜ()[Ll/۠᩶ۖ;

    move-result-object v1

    iget-object v2, p0, Ll/۟᩹ۖ;->۬:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Ll/۟᩹ۖ;-><init>([Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 2

    .line 46
    new-instance v0, Ll/۟᩹ۖ;

    invoke-virtual {p0, p1}, Ll/ۚ᩶ۖ;->ۧ(Ll/֨᩹ۖ;)[Ll/۠᩶ۖ;

    move-result-object p1

    iget-object v1, p0, Ll/۟᩹ۖ;->۬:Ljava/lang/String;

    invoke-direct {v0, p1, v1}, Ll/۟᩹ۖ;-><init>([Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 4

    const-string v0, "new "

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 51
    iget-object v1, p0, Ll/۟᩹ۖ;->۬:Ljava/lang/String;

    invoke-static {v1}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[]{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 52
    :goto_0
    iget-object v2, p0, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 53
    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 55
    :cond_0
    array-length v1, v2

    if-lez v1, :cond_1

    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_1
    const/16 v1, 0x7d

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
