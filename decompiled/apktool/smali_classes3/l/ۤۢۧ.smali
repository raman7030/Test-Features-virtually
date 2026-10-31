.class public final Ll/ۤۢۧ;
.super Ljava/lang/Object;
.source "E8NW"

# interfaces
.implements Ll/᩶ۢۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIIIII)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput p1, p0, Ll/ۤۢۧ;->ܿ:I

    .line 61
    iput p2, p0, Ll/ۤۢۧ;->ᩳ:I

    .line 62
    iput p3, p0, Ll/ۤۢۧ;->ۧ:I

    .line 63
    iput p4, p0, Ll/ۤۢۧ;->֫:I

    .line 64
    iput p5, p0, Ll/ۤۢۧ;->ܳ:I

    .line 65
    iput p6, p0, Ll/ۤۢۧ;->ܽ:I

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/ۤۢۧ;
    .locals 7

    .line 28
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v1

    const/16 v0, 0xc

    .line 29
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 31
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    .line 32
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v2

    .line 33
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v3

    const/4 v0, 0x4

    .line 34
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 35
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v4

    .line 36
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v5

    .line 37
    invoke-virtual {p0, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 38
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v6

    .line 39
    new-instance p0, Ll/ۤۢۧ;

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Ll/ۤۢۧ;-><init>(IIIIII)V

    return-object p0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    const v0, 0x68727473

    return v0
.end method

.method public final ֫()I
    .locals 3

    const v0, 0x73646976

    .line 74
    iget v1, p0, Ll/ۤۢۧ;->ܿ:I

    if-eq v1, v0, :cond_2

    const v0, 0x73647561

    if-eq v1, v0, :cond_1

    const v0, 0x73747874

    if-eq v1, v0, :cond_0

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Found unsupported streamType fourCC: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    const/4 v0, -0x1

    return v0

    :cond_0
    const/4 v0, 0x3

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x2

    return v0
.end method
