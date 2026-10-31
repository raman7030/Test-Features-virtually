.class public final Ll/۟ᩴ᩵;
.super Ll/۫ᩴ᩵;
.source "E9UL"

# interfaces
.implements Ll/ܳۖ᩵;


# static fields
.field public static final ܶ֫:Ll/֫᩻֨;


# instance fields
.field public ֡֫:I

.field public final ֨֫:Ljava/lang/String;

.field public final ۚ֫:[B

.field public ۠֫:J

.field public ᩴ֫:I

.field public ᩵֫:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Ll/۟ᩴ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/۟ᩴ᩵;->ܶ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;[BLjava/lang/String;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Ll/۫ᩴ᩵;-><init>(Ll/֨ۡ᩵;)V

    .line 63
    iput-object p2, p0, Ll/۟ᩴ᩵;->ۚ֫:[B

    .line 64
    iput-object p3, p0, Ll/۟ᩴ᩵;->֨֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAttributes()I
    .locals 1

    .line 168
    iget v0, p0, Ll/۟ᩴ᩵;->֡֫:I

    return v0
.end method

.method public final getSize()J
    .locals 2

    .line 133
    iget-wide v0, p0, Ll/۟ᩴ᩵;->᩵֫:J

    return-wide v0
.end method

.method public final ۛ()J
    .locals 2

    .line 109
    iget-wide v0, p0, Ll/۟ᩴ᩵;->۠֫:J

    return-wide v0
.end method

.method public final ۧ(I[B)I
    .locals 6

    .line 202
    invoke-static {p1, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    const/16 v1, 0x3c

    if-ne v0, v1, :cond_1

    add-int/lit8 v0, p1, 0x2

    .line 206
    invoke-static {v0, p2}, Ll/֫֡᩵;->֫(I[B)I

    move-result v0

    iput v0, p0, Ll/۟ᩴ᩵;->ᩴ֫:I

    add-int/lit8 v0, p1, 0x8

    .line 209
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    add-int/lit8 v0, p1, 0x10

    .line 211
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    add-int/lit8 v0, p1, 0x18

    .line 213
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۟ᩴ᩵;->۠֫:J

    add-int/lit8 v0, p1, 0x20

    .line 215
    invoke-static {v0, p2}, Ll/֫֡᩵;->ᩳ(I[B)J

    add-int/lit8 v0, p1, 0x28

    .line 217
    invoke-static {v0, p2}, Ll/֫֡᩵;->ܽ(I[B)J

    add-int/lit8 v0, p1, 0x30

    .line 219
    invoke-static {v0, p2}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v0

    iput-wide v0, p0, Ll/۟ᩴ᩵;->᩵֫:J

    add-int/lit8 v0, p1, 0x38

    .line 221
    invoke-static {v0, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result p2

    iput p2, p0, Ll/۟ᩴ᩵;->֡֫:I

    add-int/lit8 p2, p1, 0x3c

    .line 224
    sget-object v0, Ll/۟ᩴ᩵;->ܶ֫:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 86
    iget-object v2, p0, Ll/۟ᩴ᩵;->ۚ֫:[B

    array-length v3, v2

    invoke-static {v2, v1, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, " ("

    const-string v3, ")"

    const-string v4, "Closed "

    .line 0
    iget-object v5, p0, Ll/۟ᩴ᩵;->֨֫:Ljava/lang/String;

    invoke-static {v4, v1, v2, v5, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 225
    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_0
    sub-int/2addr p2, p1

    return p2

    .line 204
    :cond_1
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Expected structureSize = 60"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 204
    throw p1
.end method

.method public final ᩳ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩵֫()I
    .locals 1

    .line 72
    iget v0, p0, Ll/۟ᩴ᩵;->ᩴ֫:I

    return v0
.end method
