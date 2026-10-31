.class public final Ll/ۚᩴ᩵;
.super Ll/ܿᩴ᩵;
.source "J9WI"


# instance fields
.field public final ᩳۧ:Ll/ۖۖ᩵;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Ll/ܿᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 50
    new-instance p1, Ll/ۖۖ᩵;

    invoke-direct {p1}, Ll/ۖۖ᩵;-><init>()V

    iput-object p1, p0, Ll/ۚᩴ᩵;->ᩳۧ:Ll/ۖۖ᩵;

    const/16 p1, 0x10

    .line 58
    invoke-virtual {p0, p1}, Ll/ܿᩴ᩵;->ۧ(B)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 116
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2GetDfsReferralResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ܿᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",buffer="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۚᩴ᩵;->ᩳۧ:Ll/ۖۖ᩵;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֡֫()Ll/ۖۖ᩵;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۚᩴ᩵;->ᩳۧ:Ll/ۖۖ᩵;

    return-object v0
.end method

.method public final ۧ(II[B)I
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۚᩴ᩵;->ᩳۧ:Ll/ۖۖ᩵;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۖۖ᩵;->֫(II[B)I

    move-result p2

    add-int/2addr p2, p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ۧ([B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
