.class public final Ll/᩸ᩴ᩵;
.super Ll/ܿᩴ᩵;
.source "6A01"


# instance fields
.field public final ܿۧ:I

.field public ᩳۧ:Ll/᩹ۖ᩵;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Ll/ܿᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 48
    iput p2, p0, Ll/᩸ᩴ᩵;->ܿۧ:I

    const/4 p1, 0x5

    .line 49
    invoke-virtual {p0, p1}, Ll/ܿᩴ᩵;->ۧ(B)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 139
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trans2QueryPathInformationResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ܿᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "]"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 139
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֡֫()Ll/᩹ۖ᩵;
    .locals 2

    .line 68
    iget-object v0, p0, Ll/᩸ᩴ᩵;->ᩳۧ:Ll/᩹ۖ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/֡ۖ᩵;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Ll/᩸ᩴ᩵;->ᩳۧ:Ll/᩹ۖ᩵;

    return-object v0

    .line 69
    :cond_0
    new-instance v0, Ll/᩵ۡ᩵;

    const-string v1, "Incompatible file information class"

    .line 58
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 69
    throw v0
.end method

.method public final ۧ(II[B)I
    .locals 1

    const/4 p2, 0x4

    .line 120
    iget v0, p0, Ll/᩸ᩴ᩵;->ܿۧ:I

    if-eq v0, p2, :cond_2

    const/4 p2, 0x5

    if-eq v0, p2, :cond_1

    const/4 p2, 0x6

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 128
    :cond_0
    new-instance p2, Ll/᩶ۖ᩵;

    .line 28
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 125
    :cond_1
    new-instance p2, Ll/ۗۖ᩵;

    .line 28
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    .line 122
    :cond_2
    new-instance p2, Ll/ۚۖ᩵;

    .line 43
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :goto_0
    if-eqz p2, :cond_3

    .line 111
    invoke-virtual {p0}, Ll/ܿᩴ᩵;->ۡ֫()I

    move-result v0

    invoke-interface {p2, p1, v0, p3}, Ll/۠ۡ᩵;->֫(II[B)I

    move-result p3

    add-int/2addr p3, p1

    .line 112
    iput-object p2, p0, Ll/᩸ᩴ᩵;->ᩳۧ:Ll/᩹ۖ᩵;

    goto :goto_1

    :cond_3
    move p3, p1

    :goto_1
    sub-int/2addr p3, p1

    return p3
.end method

.method public final ۧ([B)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method
