.class public final Ll/ܿ᩶ۖ;
.super Ll/ᩴ᩶ۖ;
.source "U58Q"


# instance fields
.field public ۗ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 31
    sget-object v0, Ll/֨᩶ۖ;->۬֫:Ll/֨᩶ۖ;

    invoke-direct {p0, v0}, Ll/ᩴ᩶ۖ;-><init>(Ll/֨᩶ۖ;)V

    .line 32
    iput-object p1, p0, Ll/ܿ᩶ۖ;->ۗ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 26
    invoke-virtual {p0}, Ll/ܿ᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۠᩶ۖ;
    .locals 2

    .line 37
    new-instance v0, Ll/ܿ᩶ۖ;

    iget-object v1, p0, Ll/ܿ᩶ۖ;->ۗ:Ljava/lang/String;

    invoke-direct {v0, v1}, Ll/ܿ᩶ۖ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/֨᩹ۖ;)Ll/۠᩶ۖ;
    .locals 1

    .line 42
    new-instance p1, Ll/ܿ᩶ۖ;

    iget-object v0, p0, Ll/ܿ᩶ۖ;->ۗ:Ljava/lang/String;

    invoke-direct {p1, v0}, Ll/ܿ᩶ۖ;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NEW "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿ᩶ۖ;->ۗ:Ljava/lang/String;

    invoke-static {v1}, Ll/֡ܰ᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
