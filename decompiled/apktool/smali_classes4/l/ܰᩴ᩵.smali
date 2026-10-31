.class public final Ll/ܰᩴ᩵;
.super Ll/۬ᩴ᩵;
.source "J9VO"

# interfaces
.implements Ll/ۙᩴ᩵;


# static fields
.field public static final ۖ֫:Ll/֫᩻֨;


# instance fields
.field public ۡ֫:[B

.field public ۢ֫:I

.field public final ܺ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 38
    const-class v0, Ll/ܰᩴ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܰᩴ᩵;->ۖ֫:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/֨ۡ᩵;)V
    .locals 1

    .line 82
    sget-object v0, Ll/ۤᩴ᩵;->֫:[B

    invoke-direct {p0, p2, v0, p1}, Ll/ܰᩴ᩵;-><init>(Ll/֨ۡ᩵;[BLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;[B)V
    .locals 1

    const-string v0, ""

    .line 62
    invoke-direct {p0, p1, p2, v0}, Ll/ܰᩴ᩵;-><init>(Ll/֨ۡ᩵;[BLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/֨ۡ᩵;[BLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    .line 51
    invoke-direct {p0, p1, v0}, Ll/۬ᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    .line 52
    iput-object p2, p0, Ll/ܰᩴ᩵;->ۡ֫:[B

    .line 53
    iput-object p3, p0, Ll/ܰᩴ᩵;->ܺ֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    const/16 v0, 0x58

    .line 113
    invoke-static {v0}, Ll/ۗᩴ᩵;->ۡ(I)I

    move-result v0

    return v0
.end method

.method public final ֫([B)V
    .locals 0

    .line 73
    iput-object p1, p0, Ll/ܰᩴ᩵;->ۡ֫:[B

    return-void
.end method

.method public final ۘ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 102
    iput v0, p0, Ll/ܰᩴ᩵;->ۢ֫:I

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 3

    .line 94
    new-instance v0, Ll/۟ᩴ᩵;

    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    iget-object v1, p0, Ll/ܰᩴ᩵;->ۡ֫:[B

    iget-object v2, p0, Ll/ܰᩴ᩵;->ܺ֫:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, Ll/۟ᩴ᩵;-><init>(Ll/֨ۡ᩵;[BLjava/lang/String;)V

    return-object v0
.end method

.method public final ᩳ(I[B)I
    .locals 6

    const-wide/16 v0, 0x18

    .line 125
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 126
    iget v0, p0, Ll/ܰᩴ᩵;->ۢ֫:I

    int-to-long v0, v0

    add-int/lit8 v2, p1, 0x2

    invoke-static {v0, v1, v2, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x8

    .line 129
    iget-object v1, p0, Ll/ܰᩴ᩵;->ۡ֫:[B

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-static {v1, v3, p2, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p2, p1, 0x18

    .line 132
    sget-object v0, Ll/ܰᩴ᩵;->ۖ֫:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 133
    iget-object v1, p0, Ll/ܰᩴ᩵;->ۡ֫:[B

    .line 86
    array-length v2, v1

    invoke-static {v1, v3, v2}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    const-string v2, " ("

    const-string v3, ")"

    const-string v4, "Closing "

    .line 0
    iget-object v5, p0, Ll/ܰᩴ᩵;->ܺ֫:Ljava/lang/String;

    invoke-static {v4, v1, v2, v5, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 133
    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_0
    sub-int/2addr p2, p1

    return p2
.end method
