.class public final Ll/ۢᩴ᩵;
.super Ll/ᩳᩴ᩵;
.source "69T4"


# static fields
.field public static final ᩷ۧ:Ll/֫᩻֨;


# instance fields
.field public ۜۧ:I

.field public ܳۧ:I

.field public ܿۧ:[B

.field public ᩻ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    const-class v0, Ll/ۢᩴ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۢᩴ᩵;->᩷ۧ:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;I[BII)V
    .locals 2

    const/16 v0, 0x25

    const/16 v1, 0x26

    .line 48
    invoke-direct {p0, p1, v0, v1}, Ll/ᩳᩴ᩵;-><init>(Ll/֨ۡ᩵;BB)V

    .line 49
    iput p2, p0, Ll/ۢᩴ᩵;->ۜۧ:I

    .line 50
    iput-object p3, p0, Ll/ۢᩴ᩵;->ܿۧ:[B

    .line 51
    iput p4, p0, Ll/ۢᩴ᩵;->᩻ۧ:I

    .line 52
    iput p5, p0, Ll/ۢᩴ᩵;->ܳۧ:I

    const/4 p1, 0x0

    .line 53
    iput p1, p0, Ll/ᩳᩴ᩵;->ۙ֫:I

    const p1, 0xffff

    .line 54
    iput p1, p0, Ll/ᩳᩴ᩵;->᩶֫:I

    const/4 p1, 0x2

    .line 56
    iput p1, p0, Ll/ᩳᩴ᩵;->ܰ֫:I

    const-string p1, "\\PIPE\\"

    .line 57
    iput-object p1, p0, Ll/ᩳᩴ᩵;->ۗ֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 108
    new-instance v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TransTransactNamedPipe["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-super {p0}, Ll/ᩳᩴ᩵;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",pipeFid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۢᩴ᩵;->ۜۧ:I

    const-string v3, "]"

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 108
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۜ(I[B)I
    .locals 3

    .line 85
    array-length v0, p2

    sub-int/2addr v0, p1

    iget v1, p0, Ll/ۢᩴ᩵;->ܳۧ:I

    if-ge v0, v1, :cond_0

    .line 86
    sget-object p1, Ll/ۢᩴ᩵;->᩷ۧ:Ll/֫᩻֨;

    const-string p2, "TransTransactNamedPipe data too long for buffer"

    invoke-interface {p1, p2}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 89
    :cond_0
    iget-object v0, p0, Ll/ۢᩴ᩵;->ܿۧ:[B

    iget v2, p0, Ll/ۢᩴ᩵;->᩻ۧ:I

    invoke-static {v0, v2, p2, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v1
.end method

.method public final ܽ([B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(I[B)I
    .locals 2

    add-int/lit8 v0, p1, 0x1

    .line 63
    invoke-virtual {p0}, Ll/ᩳᩴ᩵;->ۡ֫()B

    move-result v1

    aput-byte v1, p2, p1

    add-int/lit8 p1, p1, 0x2

    const/4 v1, 0x0

    .line 64
    aput-byte v1, p2, v0

    .line 65
    iget v0, p0, Ll/ۢᩴ᩵;->ۜۧ:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    const/4 p1, 0x4

    return p1
.end method
