.class public final Ll/ۢ᩶ۖ;
.super Ll/ᩴ᩶ۖ;
.source "U582"


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 54
    sget-object v0, Ll/֨᩶ۖ;->ܽۧ:Ll/֨᩶ۖ;

    invoke-direct {p0, v0}, Ll/ᩴ᩶ۖ;-><init>(Ll/֨᩶ۖ;)V

    .line 55
    iput-object p3, p0, Ll/ۢ᩶ۖ;->۫:Ljava/lang/String;

    .line 56
    iput-object p2, p0, Ll/ۢ᩶ۖ;->ۗ:Ljava/lang/String;

    .line 57
    iput-object p1, p0, Ll/ۢ᩶ۖ;->۬:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ۢ᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 4

    .line 62
    new-instance v0, Ll/ۢ᩶ۖ;

    iget-object v1, p0, Ll/ۢ᩶ۖ;->ۗ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۢ᩶ۖ;->۫:Ljava/lang/String;

    iget-object v3, p0, Ll/ۢ᩶ۖ;->۬:Ljava/lang/String;

    invoke-direct {v0, v3, v1, v2}, Ll/ۢ᩶ۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 3

    .line 66
    new-instance p1, Ll/ۢ᩶ۖ;

    iget-object v0, p0, Ll/ۢ᩶ۖ;->ۗ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۢ᩶ۖ;->۫:Ljava/lang/String;

    iget-object v2, p0, Ll/ۢ᩶ۖ;->۬:Ljava/lang/String;

    invoke-direct {p1, v2, v0, v1}, Ll/ۢ᩶ۖ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۢ᩶ۖ;->۬:Ljava/lang/String;

    invoke-static {v1}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۢ᩶ۖ;->ۗ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
