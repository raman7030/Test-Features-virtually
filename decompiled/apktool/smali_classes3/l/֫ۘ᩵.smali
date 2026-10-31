.class public final Ll/֫ۘ᩵;
.super Ll/ۨۖ᩵;
.source "G9ZG"

# interfaces
.implements Ll/ۧۖ᩵;


# static fields
.field public static final ۚ֫:Ll/֫᩻֨;


# instance fields
.field public ֡֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 38
    const-class v0, Ll/֫ۘ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/֫ۘ᩵;->ۚ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;I)V
    .locals 1

    const/4 v0, 0x4

    .line 50
    invoke-direct {p0, p1, v0}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;B)V

    .line 51
    iput p2, p0, Ll/֫ۘ᩵;->֡֫:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 113
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SmbComClose["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ۨۖ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",fid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/֫ۘ᩵;->֡֫:I

    const-string v3, ",lastWriteTime=0]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 113
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/֫ۖ᩵;
    .locals 1

    .line 63
    invoke-super {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    check-cast v0, Ll/۟ۖ᩵;

    return-object v0
.end method

.method public final ۧ(Ll/ᩴۡ᩵;)Ll/֫ۖ᩵;
    .locals 1

    .line 74
    new-instance v0, Ll/۟ۖ᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۟ۖ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 75
    invoke-virtual {p0, v0}, Ll/ۨۖ᩵;->֫(Ll/֫ۖ᩵;)V

    return-object v0
.end method

.method public final ۧ()Ll/ۨۖ᩵;
    .locals 1

    .line 63
    invoke-super {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    check-cast v0, Ll/۟ۖ᩵;

    return-object v0
.end method

.method public final ۧ()Ll/ܰ֨᩵;
    .locals 1

    .line 63
    invoke-super {p0}, Ll/ۨۖ᩵;->ۧ()Ll/ۨۖ᩵;

    move-result-object v0

    check-cast v0, Ll/۟ۖ᩵;

    return-object v0
.end method

.method public final ܽ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻(I[B)I
    .locals 2

    .line 82
    iget v0, p0, Ll/֫ۘ᩵;->֡֫:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 p1, p1, 0x2

    .line 84
    iget-object v0, p0, Ll/ۨۖ᩵;->ۙ:Ll/ۛۖ᩵;

    if-eqz v0, :cond_0

    .line 85
    sget v0, Ll/ۛۖ᩵;->ܿ:I

    const-wide/16 v0, -0x1

    .line 292
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    goto :goto_0

    .line 87
    :cond_0
    sget-object p1, Ll/֫ۘ᩵;->ۚ֫:Ll/֫᩻֨;

    const-string p2, "SmbComClose without a digest"

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x6

    return p1
.end method
