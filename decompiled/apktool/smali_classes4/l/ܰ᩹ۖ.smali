.class public final Ll/ܰ᩹ۖ;
.super Ll/᩵᩶ۖ;
.source "K5D4"


# instance fields
.field public ۤ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۠᩶ۖ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 45
    sget-object v0, Ll/֨᩶ۖ;->ܿ֫:Ll/֨᩶ۖ;

    invoke-direct {p0, v0, p1}, Ll/᩵᩶ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;)V

    .line 46
    iput-object p4, p0, Ll/ܰ᩹ۖ;->ۤ:Ljava/lang/String;

    .line 47
    iput-object p3, p0, Ll/ܰ᩹ۖ;->۬:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Ll/ܰ᩹ۖ;->۫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/ܰ᩹ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 5

    .line 60
    new-instance v0, Ll/ܰ᩹ۖ;

    iget-object v1, p0, Ll/᩵᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ll/۠᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v1

    iget-object v2, p0, Ll/ܰ᩹ۖ;->۬:Ljava/lang/String;

    iget-object v3, p0, Ll/ܰ᩹ۖ;->ۤ:Ljava/lang/String;

    iget-object v4, p0, Ll/ܰ᩹ۖ;->۫:Ljava/lang/String;

    invoke-direct {v0, v1, v4, v2, v3}, Ll/ܰ᩹ۖ;-><init>(Ll/۠᩶ۖ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 4

    .line 64
    new-instance v0, Ll/ܰ᩹ۖ;

    iget-object v1, p0, Ll/᩵᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    invoke-virtual {v1, p1}, Ll/۠᩶ۖ;->֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    iget-object v1, p0, Ll/ܰ᩹ۖ;->۬:Ljava/lang/String;

    iget-object v2, p0, Ll/ܰ᩹ۖ;->ۤ:Ljava/lang/String;

    iget-object v3, p0, Ll/ܰ᩹ۖ;->۫:Ljava/lang/String;

    invoke-direct {v0, p1, v3, v1, v2}, Ll/ܰ᩹ۖ;-><init>(Ll/۠᩶ۖ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩵᩶ۖ;->ۗ:Ll/۠᩶ۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰ᩹ۖ;->۬:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
