.class public final Ll/ۧᩴ᩵;
.super Ll/ܿᩴ᩵;
.source "29T5"


# static fields
.field public static final ܳۧ:Ll/֫᩻֨;


# instance fields
.field public ܿۧ:I

.field public ᩳۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Ll/ۧᩴ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۧᩴ᩵;->ܳۧ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Ll/ܿᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 121
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NetShareEnumResponse["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    invoke-super {p0}, Ll/ܿᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܿᩴ᩵;->ۘ֫()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",converter="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۧᩴ᩵;->ᩳۧ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",entriesReturned="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    invoke-virtual {p0}, Ll/ܿᩴ᩵;->ܺ֫()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",totalAvailableEntries="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۧᩴ᩵;->ܿۧ:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 123
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۧ(II[B)I
    .locals 6

    const/4 p2, 0x0

    .line 94
    invoke-virtual {p0, p2}, Ll/ۨۖ᩵;->ۧ(Z)V

    .line 96
    invoke-virtual {p0}, Ll/ܿᩴ᩵;->ܺ֫()I

    move-result v0

    new-array v0, v0, [Ll/ܽᩴ᩵;

    const/4 v1, 0x0

    move v2, p1

    .line 97
    :goto_0
    invoke-virtual {p0}, Ll/ܿᩴ᩵;->ܺ֫()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 98
    new-instance v3, Ll/ܽᩴ᩵;

    invoke-direct {v3}, Ll/ܽᩴ᩵;-><init>()V

    aput-object v3, v0, v1

    const/16 v4, 0xd

    .line 99
    invoke-virtual {p0, p2, v2, v4, p3}, Ll/ۨۖ᩵;->֫(ZII[B)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/ܽᩴ᩵;->᩸:Ljava/lang/String;

    add-int/lit8 v4, v2, 0xe

    .line 101
    invoke-static {v4, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v4

    iput v4, v3, Ll/ܽᩴ᩵;->᩶:I

    add-int/lit8 v4, v2, 0x10

    .line 103
    invoke-static {v4, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v4

    add-int/lit8 v2, v2, 0x14

    const v5, 0xffff

    and-int/2addr v4, v5

    .line 105
    iget v5, p0, Ll/ۧᩴ᩵;->ᩳۧ:I

    sub-int/2addr v4, v5

    add-int/2addr v4, p1

    const/16 v5, 0x80

    .line 107
    invoke-virtual {p0, p2, v4, v5, p3}, Ll/ۨۖ᩵;->֫(ZII[B)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Ll/ܽᩴ᩵;->᩹:Ljava/lang/String;

    .line 109
    sget-object v4, Ll/ۧᩴ᩵;->ܳۧ:Ll/֫᩻֨;

    invoke-interface {v4}, Ll/֫᩻֨;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 110
    invoke-virtual {v3}, Ll/ܽᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 113
    :cond_1
    invoke-virtual {p0, v0}, Ll/ܿᩴ᩵;->֫([Ll/ܳۚ᩵;)V

    sub-int/2addr v2, p1

    return v2
.end method

.method public final ۧ([B)I
    .locals 1

    const/4 v0, 0x0

    .line 76
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܿᩴ᩵;->ۡ(I)V

    const/4 v0, 0x2

    .line 78
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/ۧᩴ᩵;->ᩳۧ:I

    const/4 v0, 0x4

    .line 80
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ܿᩴ᩵;->ۢ(I)V

    const/4 v0, 0x6

    .line 82
    invoke-static {v0, p1}, Ll/֫֡᩵;->֫(I[B)I

    move-result p1

    iput p1, p0, Ll/ۧᩴ᩵;->ܿۧ:I

    const/16 p1, 0x8

    return p1
.end method
